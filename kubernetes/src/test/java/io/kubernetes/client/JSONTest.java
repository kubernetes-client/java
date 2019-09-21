package io.kubernetes.client;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class JSONTest {

  @Test
  public void testSerializeByteArray() {
    final JSON json = new JSON();
    final String plainText = "string that contains '=' when encoded";
    final String base64String = json.serialize(plainText.getBytes());
    byte[] pure = json.deserialize(base64String, byte[].class);
    assertNotNull(pure);
    String decodedText = new String(pure);
    assertThat(decodedText, equalTo(plainText));
  }
}
