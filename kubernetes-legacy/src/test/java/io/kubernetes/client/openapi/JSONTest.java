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
package io.kubernetes.client.openapi;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.time.OffsetDateTime;
import okio.ByteString;
import org.junit.Ignore;
import org.junit.Test;

public class JSONTest {

  private final JSON json = new JSON();

  @Test
  public void testSerializeByteArray() {
    final String plainText = "string that contains '=' when encoded";
    final String base64String = json.serialize(plainText.getBytes());
    // serialize returns string surrounded by quotes: "\"[base64]\""
    final String pureString = base64String.replaceAll("^\"|\"$", "");
    final ByteString byteStr = ByteString.decodeBase64(pureString);

    // Check encoded to valid base64
    assertNotNull(byteStr);

    // Check encoded string correctly
    final String decodedText = new String(byteStr.toByteArray());
    assertThat(decodedText, is(plainText));
  }

  @Test
  public void testOffsetDateTime1e6Parse() {
    String timeStr = "\"2018-04-03T11:32:26.123456Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    assertEquals(timeStr, serializedTsStr);
  }

  @Test
  public void testOffsetDateTime1e4Parse() {
    String timeStr = "\"2018-04-03T11:32:26.1234Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    String expectedStr = "\"2018-04-03T11:32:26.123400Z\"";
    assertEquals(expectedStr, serializedTsStr);
  }

  @Test
  public void testOffsetDateTime1e3Parse() {
    String timeStr = "\"2018-04-03T11:32:26.123Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    String expectedStr = "\"2018-04-03T11:32:26.123000Z\"";
    assertEquals(expectedStr, serializedTsStr);
  }

  @Test
  public void testOffsetDateTimeNoFractionParse() {
    String timeStr = "\"2018-04-03T11:32:26Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    String expectedStr = "\"2018-04-03T11:32:26.000000Z\"";
    assertEquals(expectedStr, serializedTsStr);
  }
}
