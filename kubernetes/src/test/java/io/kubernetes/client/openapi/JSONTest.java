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

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.StringReader;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Status;
import okio.ByteString;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class JSONTest {

  @Order(0)
  @Test
  void serializeWithStaticMethod() {
    JSON.serialize(new V1ObjectMeta());
  }

  @Test
  void serializeByteArray() {
    JSON json = new JSON();
    final String plainText = "string that contains '=' when encoded";
    final String base64String = json.serialize(plainText.getBytes());
    // serialize returns string surrounded by quotes: "\"[base64]\""
    final String pureString = base64String.replaceAll("^\"|\"$", "");
    final ByteString byteStr = ByteString.decodeBase64(pureString);

    // Check encoded to valid base64
    assertThat(byteStr).isNotNull();

    // Check encoded string correctly
    final String decodedText = new String(byteStr.toByteArray());
    assertThat(decodedText).isEqualTo(plainText);
  }

  @Test
  void offsetDateTime1e6Parse() {
    JSON json = new JSON();
    String timeStr = "\"2018-04-03T11:32:26.123456Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    assertThat(serializedTsStr).isEqualTo(timeStr);
  }

  @Test
  void offsetDateTime1e4Parse() {
    JSON json = new JSON();
    String timeStr = "\"2018-04-03T11:32:26.1234Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    String expectedStr = "\"2018-04-03T11:32:26.123400Z\"";
    assertThat(serializedTsStr).isEqualTo(expectedStr);
  }

  @Test
  void offsetDateTime1e3Parse() {
    JSON json = new JSON();
    String timeStr = "\"2018-04-03T11:32:26.123Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    String expectedStr = "\"2018-04-03T11:32:26.123000Z\"";
    assertThat(serializedTsStr).isEqualTo(expectedStr);
  }

  @Test
  void offsetDateTimeNoFractionParse() {
    JSON json = new JSON();
    String timeStr = "\"2018-04-03T11:32:26Z\"";
    OffsetDateTime dateTime = json.deserialize(timeStr, OffsetDateTime.class);
    String serializedTsStr = json.serialize(dateTime);
    String expectedStr = "\"2018-04-03T11:32:26.000000Z\"";
    assertThat(serializedTsStr).isEqualTo(expectedStr);
  }

  @Test
  void v1StatusTypeValidationDisabled() throws IOException {
    Gson gson = new Gson();
    JsonReader jsonReader = new JsonReader(new StringReader("{\"foo\":\"bar\"}"));
    new V1Status.CustomTypeAdapterFactory().create(gson, TypeToken.get(V1Status.class)).read(jsonReader);
  }

  @Test
  void v1ListMetaTypeValidationDisabled() throws IOException {
    Gson gson = new Gson();
    JsonReader jsonReader = new JsonReader(new StringReader("{\"foo\":\"bar\"}"));
    new V1ListMeta.CustomTypeAdapterFactory().create(gson, TypeToken.get(V1ListMeta.class)).read(jsonReader);
  }
}
