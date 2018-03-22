/*
Copyright 2017, 2018 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.util;

import com.google.common.base.Charsets;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ws.WebSocket;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WebSocketStreamHandler understands the Kubernetes streaming protocol and separates a single
 * WebSockets stream into a number of different streams using that protocol.
 */
public class WebSocketStreamHandler implements WebSockets.SocketListener, Closeable {
  private static final Logger log = LoggerFactory.getLogger(WebSocketStreamHandler.class);

  private final Map<Integer, PipedInputStream> input = new HashMap<>();
  private final Map<Integer, PipedOutputStream> pipedOutput = new HashMap<>();
  private final Map<Integer, OutputStream> output = new HashMap<>();
  private WebSocket socket;

  @SuppressWarnings("unused")
  private String protocol;

  private State state = State.UNINITIALIZED;

  private static enum State {
    UNINITIALIZED,
    OPEN,
    CLOSED
  };

  @Override
  public synchronized void open(String protocol, WebSocket socket) {
    if (state != State.UNINITIALIZED) throw new IllegalStateException();
    this.protocol = protocol;
    this.socket = socket;
    state = State.OPEN;
    notifyAll();
  }

  @Override
  public void bytesMessage(InputStream in) {
    try {
      handleMessage(in.read(), in);
    } catch (IOException ex) {
      log.error("Error reading message channel", ex);
    }
  }

  @Override
  public void textMessage(Reader in) {
    try {
      handleMessage(
          in.read(), new ByteArrayInputStream(CharStreams.toString(in).getBytes(Charsets.UTF_8)));
    } catch (IOException ex) {
      log.error("Error writing message", ex);
    }
  }

  protected void handleMessage(int stream, InputStream inStream) throws IOException {
    OutputStream out = getSocketInputOutputStream(stream);
    ByteStreams.copy(inStream, out);
  }

  @Override
  public synchronized void close() {
    if (state != State.CLOSED) {
      state = State.CLOSED;
      // Close all output streams.  Caller of getInputStream(int) is responsible
      // for closing returned input streams
      for (PipedOutputStream out : pipedOutput.values()) {
        try {
          out.close();
        } catch (IOException ex) {
          log.error("Error on close", ex);
        }
      }
      for (OutputStream out : output.values()) {
        try {
          out.close();
        } catch (IOException ex) {
          log.error("Error on close", ex);
        }
      }
    }
  }

  /**
   * Get a specific input stream using its identifier. Caller is responsible for closing these
   * streams.
   *
   * @param stream The stream to return
   * @return The specified stream.
   */
  public synchronized InputStream getInputStream(int stream) {
    if (state == State.CLOSED) throw new IllegalStateException();

    if (!input.containsKey(stream)) {
      try {
        PipedInputStream pipeIn = new PipedInputStream();
        PipedOutputStream pipeOut = new PipedOutputStream(pipeIn);
        pipedOutput.put(stream, pipeOut);
        input.put(stream, pipeIn);
      } catch (IOException ex) {
        // This is _very_ unlikely, as it requires the above constructor to fail.
        // don't force callers to catch, but still throw
        throw new IllegalStateException(ex);
      }
    }
    return input.get(stream);
  }

  /**
   * Gets a specific output stream using it's identified
   *
   * @param stream The stream to return
   * @return The specified stream.
   */
  public synchronized OutputStream getOutputStream(int stream) {
    if (!output.containsKey(stream)) {
      output.put(stream, new WebSocketOutputStream(stream));
    }
    return output.get(stream);
  }

  /**
   * Get the pipe to write data to a specific InputStream. This is called when new data is read from
   * the web socket, to send the data on to the right stream.
   *
   * @param stream The stream to return
   * @return The specified stream.
   */
  private synchronized OutputStream getSocketInputOutputStream(int stream) {
    if (!pipedOutput.containsKey(stream)) {
      try {
        PipedInputStream pipeIn = new PipedInputStream();
        PipedOutputStream pipeOut = new PipedOutputStream(pipeIn);
        pipedOutput.put(stream, pipeOut);
        input.put(stream, pipeIn);
      } catch (IOException ex) {
        // This is _very_ unlikely, as it requires the above constructor to fail.
        // don't force callers to catch, but still throw
        throw new IllegalStateException(ex);
      }
    }
    return pipedOutput.get(stream);
  }

  private class WebSocketOutputStream extends OutputStream {
    private final byte stream;

    public WebSocketOutputStream(int stream) {
      this.stream = (byte) stream;
    }

    @Override
    public void write(int b) throws IOException {
      write(new byte[] {(byte) b});
    }

    @Override
    public void write(byte[] b) throws IOException {
      write(b, 0, b.length);
    }

    @Override
    public void write(byte[] b, int offset, int length) throws IOException {
      if (WebSocketStreamHandler.this.socket == null) {
        synchronized (WebSocketStreamHandler.this) {
          if (state == State.CLOSED) throw new IllegalStateException();
          if (WebSocketStreamHandler.this.socket == null) {
            // wait for the websocket to be opened
            try {
              WebSocketStreamHandler.this.wait();
            } catch (InterruptedException e) {
              throw new InterruptedIOException();
            }
          }
        }
      }
      byte[] buffer = new byte[length + 1];
      buffer[0] = stream;
      System.arraycopy(b, offset, buffer, 1, length);
      WebSocketStreamHandler.this.socket.sendMessage(
          RequestBody.create(WebSocket.BINARY, ByteString.of(buffer)));
    }
  }
}
