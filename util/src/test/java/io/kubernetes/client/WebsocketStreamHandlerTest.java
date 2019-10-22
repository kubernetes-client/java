package io.kubernetes.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.kubernetes.client.util.WebSocketStreamHandler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import okhttp3.Request;
import okhttp3.WebSocket;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import org.junit.Test;

public class WebsocketStreamHandlerTest {

  private static String testProtocol = "test-protocol";

  @Test
  public void testHandlerReceivingData() throws IOException {
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

    assertEquals(testData, receivingData[0]);
    assertEquals(testData, receivingData[1]);
    assertTrue(mockWebSocket.closed);
  }

  private class MockWebSocket implements WebSocket {
    private byte[] data;
    private boolean closed = false;

    @Override
    public boolean send(String s) {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      BufferedSink sink = Okio.buffer(Okio.sink(outputStream));
      try {
        sink.writeString(s, Charset.defaultCharset());
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      this.data = outputStream.toByteArray();
      return true;
    }

    @Override
    public boolean send(ByteString byteString) {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      BufferedSink sink = Okio.buffer(Okio.sink(outputStream));
      try {
        sink.write(byteString);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      this.data = outputStream.toByteArray();
      return false;
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
