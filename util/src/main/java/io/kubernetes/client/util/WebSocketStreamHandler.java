/*
Copyright 2017 The Kubernetes Authors.
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
import okio.ByteString;
import org.apache.log4j.Logger;

import java.io.Closeable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/**
 * WebSocketStreamHandler understands the Kubernetes streaming protocol and separates
 * a single WebSockets stream into a number of different streams using that protocol.
 */
public class WebSocketStreamHandler implements WebSockets.SocketListener {
    Map<Integer, PipedOutputStream> output;
    Map<Integer, PipedInputStream> input;
    WebSocket socket;
    String protocol;

    private static final Logger log = Logger.getLogger(WebSockets.class);

    public WebSocketStreamHandler() {
        output = new HashMap<>();
        input = new HashMap<>();
    }

    @Override
    public void open(String protocol, WebSocket socket) {
        this.protocol = protocol;
        this.socket = socket;
    }
        
    @Override
    public void bytesMessage(InputStream in) {
        try {
            OutputStream out = getSocketInputOutputStream(in.read());
            ByteStreams.copy(in, out);
        } catch (IOException ex) {
            log.error("Error writing message", ex);
        }
    }
        
    @Override
    public void textMessage(Reader in) {
        try {
            OutputStream out = getSocketInputOutputStream(in.read());
            InputStream inStream = 
                new ByteArrayInputStream(CharStreams.toString(in).getBytes(Charsets.UTF_8));
            ByteStreams.copy(inStream, out);
        } catch (IOException ex) {
            log.error("Error writing message", ex);
        }
    }
        
    @Override
    public void close() {
        for (PipedOutputStream out: output.values()) {
            try {
                out.close();
            } catch (IOException ex) {
                // TODO use a logger here
                ex.printStackTrace();
            }
        }
        for (PipedInputStream in: input.values()) {
            try {
                in.close();
            } catch (IOException ex) {
                // TODO use a logger here
                ex.printStackTrace();
            }
        }
        /*
        try {
            socket.close(1000, "User closed connection");
        } catch (IOException ex) {
            // TODO use a logger here
            ex.printStackTrace();
        }
        */
    }

    /**
     * Get a specific input stream using its identifier
     * @param stream The stream to return
     * @return The specified stream.
     */
    public synchronized InputStream getInputStream(int stream) {
        if (!input.containsKey(stream)) {
            try {
                PipedInputStream pipeIn = new PipedInputStream();
                PipedOutputStream pipeOut = new PipedOutputStream(pipeIn);
                output.put(stream, pipeOut);
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
     * @param stream The stream to return
     * @return The specified stream.
     */
    public OutputStream getOutputStream(int stream) {
        return new WebSocketOutputStream(stream);
    }

    /**
     * Get the pipe to write data to a specific InputStream. This is called when
     * new data is read from the web socket, to send the data on to the right stream.
     * @param stream The stream to return
     * @return The specified stream.
     */
    private synchronized OutputStream getSocketInputOutputStream(int stream) {
        if (!output.containsKey(stream)) {
            try {
                PipedInputStream pipeIn = new PipedInputStream();
                PipedOutputStream pipeOut = new PipedOutputStream(pipeIn);
                output.put(stream, pipeOut);
                input.put(stream, pipeIn);
            } catch (IOException ex) {
                // This is _very_ unlikely, as it requires the above constructor to fail.
                // don't force callers to catch, but still throw
                throw new IllegalStateException(ex);
            }
        }
        return output.get(stream);
    }

    private class WebSocketOutputStream extends OutputStream {
        private byte stream;

        public WebSocketOutputStream(int stream) {
            this.stream = (byte) stream;
        }

        @Override
        public void write(int b) throws IOException {
            write(new byte[] { (byte) b});
        }

        @Override
        public void write(byte[] b) throws IOException {
            this.write(b, 0, b.length);
        }

        @Override
        public void write(byte[] b, int offset, int length) throws IOException {
            if (WebSocketStreamHandler.this.socket == null) {
                throw new IOException("No websocket connection!");
            }
            byte[] buffer = new byte[length + 1];
            buffer[0] = stream;
            System.arraycopy(b, offset, buffer, 1, length);
            WebSocketStreamHandler.this.socket.sendMessage(RequestBody.create(WebSocket.BINARY, ByteString.of(buffer)));
        }
    }
}
