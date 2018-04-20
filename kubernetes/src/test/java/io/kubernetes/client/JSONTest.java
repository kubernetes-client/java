package io.kubernetes.client;

import okio.ByteString;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JSONTest {

    @Test
    public void testSerializeByteArray() {
        final JSON json = new JSON();
        final String plainText = "string that contains '=' when encoded";
        final String base64String = json.serialize(plainText.getBytes());
        //serialize returns string surrounded by quotes: "\"[base64]\""
        final String pureString = base64String.replaceAll("^\"|\"$", "");
        final ByteString byteStr = ByteString.decodeBase64(pureString);

        //Check encoded to valid base64
        assertNotNull(byteStr);

        //Check encoded string correctly
        final String decodedText =new String(byteStr.toByteArray());
        assertThat(decodedText, is(plainText));
    }
}