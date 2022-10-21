/*
Copyright 2020 The Kubernetes Authors.
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

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import okhttp3.WebSocket;
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
  private Throwable error;

  @SuppressWarnings("unused")
  private String protocol;

  private State state = State.UNINITIALIZED;

  private enum State {
    UNINITIALIZED,
    OPEN,
    CLOSED
  }

  public synchronized void waitForInitialized() throws InterruptedException {
    if (state != State.UNINITIALIZED) {
      return;
    }
    this.wait();
  }

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
          in.read(),
          new ByteArrayInputStream(Streams.toString(in).getBytes(StandardCharsets.UTF_8)));
    } catch (IOException ex) {
      log.error("Error writing message", ex);
    }
  }

  protected void handleMessage(int stream, InputStream inStream) throws IOException {
    try {
      OutputStream out = getSocketInputOutputStream(stream);
      Streams.copy(inStream, out);
      out.flush();
    } finally {
      inStream.close();
    }
  }

  @Override
  public void failure(Throwable t) {
    this.error = t;
  }

  public Throwable getError() {
    return this.error;
  }

  @Override
  public synchronized void close() {
    if (state != State.CLOSED) {
      // Close all output streams.  Caller of getInputStream(int) is responsible
      // for closing returned input streams
      for (PipedOutputStream out : pipedOutput.values()) {
        try {
          out.flush();
        } catch (IOException ex) {
          log.error("Error on flush", ex);
        }
        try {
          out.close();
        } catch (IOException ex) {
          log.error("Error on close", ex);
        }
      }
      for (OutputStream out : output.values()) {
        try {
          out.flush();
        } catch (IOException ex) {
          log.error("Error on flush", ex);
        }
        try {
          out.close();
        } catch (IOException ex) {
          log.error("Error on close", ex);
        }
      }

      state = State.CLOSED;
      if (null != socket) {
        // code 1000 means "Normal Closure"
        socket.close(1000, "Triggered client-side terminate");
        log.debug("Successfully closed socket.");
      }
    }
    notifyAll();
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

    private static final long MAX_QUEUE_SIZE = 16L * 1024 * 1024;

    private static final int MAX_WAIT_MILLIS = 10000;

    private static final int WAIT_MILLIS = 10;

    private final byte stream;

    public WebSocketOutputStream(int stream) {
      this.stream = (byte) stream;
    }

    @Override
    public void flush() throws IOException {
      if (state == State.CLOSED) {
        throw new IOException("Socket is closed!");
      }
      int i = 0;
      while (WebSocketStreamHandler.this.socket.queueSize() > 0) {
        try {
          Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
        // Wait a maximum of 10 seconds.
        if (i++ > 100) {
          throw new IOException("Timed out waiting for web-socket to flush.");
        }
      }
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
      int bytesWritten = 0;
      int remaining = length;
      while (bytesWritten < length) {
        // OkHTTP3 Web Sockets limits buffer size to 16MiB, so cap buffer at 15MiB
        int bufferSize = Math.min(remaining, 15 * 1024 * 1024);
        byte[] buffer = new byte[bufferSize + 1];
        buffer[0] = stream;

        System.arraycopy(b, offset + bytesWritten, buffer, 1, bufferSize);
        ByteString byteString = ByteString.of(buffer);

        final Instant start = Instant.now();
        synchronized (WebSocketOutputStream.this) {
          while (WebSocketStreamHandler.this.socket.queueSize() + byteString.size() > MAX_QUEUE_SIZE
              && Instant.now().isBefore(start.plus(MAX_WAIT_MILLIS, ChronoUnit.MILLIS))) {
            try {
              wait(WAIT_MILLIS);
            } catch (InterruptedException e) {
              throw new IOException("Error waiting web socket queue", e);
            }
          }

          if (!WebSocketStreamHandler.this.socket.send(byteString)) {
            throw new IOException("WebSocket has closed.");
          }

          notifyAll();
        }

        bytesWritten += bufferSize;
        remaining -= bufferSize;
      }
    }
  }
}
