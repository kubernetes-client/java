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

import com.google.common.io.Resources;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import okio.ByteString;
import org.junit.Test;

public class JSONTest {

  private static final String CONFIGMAP1_PATH = Resources.getResource("configmap1.json").getPath();

  @Test
  public void testSerializeByteArray() {
    final JSON json = new JSON();
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
  public void testSerializeBinaryConfigMap() throws IOException {
    String configmap1Json = new String(Files.readAllBytes(Paths.get(CONFIGMAP1_PATH)));
    final JSON json = new JSON();
    V1ConfigMap cm1 = json.deserialize(configmap1Json, V1ConfigMap.class);
    assertNotNull(cm1);
  }
}
