package io.kubernetes.client;

import static org.junit.Assert.*;

import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ws.WebSocket;
import io.kubernetes.client.util.WebSocketStreamHandler;
import java.io.*;
import okio.Buffer;
import okio.BufferedSink;
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
    private boolean pinged = false;
    private boolean closed = false;

    @Override
    public void sendMessage(RequestBody message) throws IOException {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      BufferedSink sink = Okio.buffer(Okio.sink(outputStream));
      message.writeTo(sink);
      this.data = outputStream.toByteArray();
    }

    @Override
    public void sendPing(Buffer payload) throws IOException {
      this.pinged = true;
    }

    @Override
    public void close(int code, String reason) throws IOException {
      this.closed = true;
    }
  }
}
