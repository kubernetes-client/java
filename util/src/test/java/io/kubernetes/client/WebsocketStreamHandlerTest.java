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
package io.kubernetes.client;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.util.WebSocketStreamHandler;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import okhttp3.Request;
import okhttp3.WebSocket;
import okio.ByteString;
import org.junit.jupiter.api.Test;

class WebsocketStreamHandlerTest {

  private static String testProtocol = "test-protocol";

  @Test
  void handlerReceivingData() throws IOException {
    int testStreamId = 0;
    byte testData = 1;
    byte[] testDatas =
        new byte[] {(byte) testStreamId, testData, testData}; // first byte stands for stream id,
    ByteArrayInputStream testBytesInputStream = new ByteArrayInputStream(testDatas);

    WebSocketStreamHandler handler = new WebSocketStreamHandler();
    MockWebSocket mockWebSocket = new MockWebSocket();

    handler.open(testProtocol, mockWebSocket);

    InputStream inputStream = handler.getInputStream(testStreamId);

    // handler receiving
    handler.bytesMessage(testBytesInputStream);

    byte[] receivingData = new byte[16];
    inputStream.read(receivingData);
    handler.close();

    assertThat(receivingData[0]).isEqualTo(testData);
    assertThat(receivingData[1]).isEqualTo(testData);
    assertThat(mockWebSocket.closed).isTrue();
  }

  @Test
  void handlerSendingData() throws IOException {
    int testStreamId = 0;

    WebSocketStreamHandler handler = new WebSocketStreamHandler();
    MockWebSocket mockWebSocket = new MockWebSocket();

    handler.open(testProtocol, mockWebSocket);

    OutputStream outputStream = handler.getOutputStream(testStreamId);

    byte[] bytes = "This is a test string".getBytes("UTF-8");
    byte[] output = new byte[bytes.length + 1];
    output[0] = 0;
    for (int i = 0; i < bytes.length; i++) {
      output[i + 1] = bytes[i];
    }
    outputStream.write(bytes);
    outputStream.flush();

    assertThat(mockWebSocket.data).containsExactly(output);
  }

  @Test
  void handlerSendingLargeData() throws IOException {
    int testStreamId = 0;

    WebSocketStreamHandler handler = new WebSocketStreamHandler();
    MockWebSocket mockWebSocket = new MockWebSocket();

    handler.open(testProtocol, mockWebSocket);

    OutputStream outputStream = handler.getOutputStream(testStreamId);

    byte[] bytes = new byte[20 * 1024 * 1024];
    byte[] output = new byte[bytes.length + 2];

    for (int i = 0; i < bytes.length; i++) {
      bytes[i] = (byte) i;
    }
    // First stream header
    output[0] = 0;
    for (int i = 0; i < 15 * 1024 * 1024; i++) {
      output[i + 1] = bytes[i];
    }
    // Second stream header
    output[15 * 1024 * 1024 + 1] = 0;
    for (int i = 15 * 1024 * 1024; i < bytes.length; i++) {
      output[i + 2] = bytes[i];
    }
    outputStream.write(bytes);
    outputStream.flush();

    assertThat(mockWebSocket.data).containsExactly(output);
  }

  private static class MockWebSocket implements WebSocket {
    byte[] data;
    private boolean closed = false;

    private byte[] append(byte[] one, byte[] two) {
      if (one == null || one.length == 0) {
        return two;
      }

      byte[] result = new byte[one.length + two.length];
      for (int i = 0; i < one.length; i++) {
        result[i] = one[i];
      }
      for (int i = 0; i < two.length; i++) {
        result[i + one.length] = two[i];
      }
      return result;
    }

    @Override
    public boolean send(String s) {
      this.data = append(data, s.getBytes(Charset.defaultCharset()));
      return true;
    }

    @Override
    public boolean send(ByteString byteString) {
      this.data = append(data, byteString.toByteArray());
      return true;
    }

    @Override
    public Request request() {
      return null;
    }

    @Override
    public long queueSize() {
      return 0;
    }

    @Override
    public void cancel() {
      close(-1, "");
    }

    @Override
    public boolean close(int code, String reason) {
      this.closed = true;
      return true;
    }
  }
}
