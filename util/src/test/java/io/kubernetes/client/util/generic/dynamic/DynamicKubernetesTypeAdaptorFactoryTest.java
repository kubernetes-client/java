/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.util.generic.dynamic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.gson.Gson;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.Collections;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class DynamicKubernetesTypeAdaptorFactoryTest {

  private Gson gson;

  private static final String jsonContent =
      new StringBuilder()
          .append("{")
          .append("\"apiVersion\":\"v1\",")
          .append("\"kind\":\"Namespace\",")
          .append("\"metadata\":{")
          .append("\"name\":\"foo\"")
          .append("}")
          .append("}")
          .toString();

  private final DynamicKubernetesTypeAdaptorFactory factory =
      new DynamicKubernetesTypeAdaptorFactory();

  @Before
  public void setup() {
    gson = new Gson().newBuilder().registerTypeAdapterFactory(factory).create();
  }

  @Test
  public void testSingleDynamicObjectRoundTrip() {
    KubernetesObject dynamicObj = gson.fromJson(jsonContent, KubernetesObject.class);
    assertTrue(dynamicObj instanceof DynamicKubernetesObject);

    assertEquals("v1", dynamicObj.getApiVersion());
    assertEquals("Namespace", dynamicObj.getKind());
    assertEquals(new V1ObjectMeta().name("foo"), dynamicObj.getMetadata());

    String dumped = gson.toJson(dynamicObj);
    assertEquals(jsonContent, dumped);
  }

  @Test
  public void testListDynamicObjectRoundTrip() {
    String listJsonContent =
        new StringBuilder()
            .append("{")
            .append("\"items\":[")
            .append(jsonContent)
            .append("]")
            .append("}")
            .toString();

    KubernetesListObject dynamicListObj =
        gson.fromJson(listJsonContent, KubernetesListObject.class);
    assertTrue(dynamicListObj instanceof DynamicKubernetesListObject);

    assertEquals(1, dynamicListObj.getItems().size());

    String dumped = gson.toJson(dynamicListObj);
    assertEquals(listJsonContent, dumped);
  }

  // Registering the same factory twice is not a good idea, but we should not explode if it happens.
  // See https://github.com/google/gson/issues/2312
  @Test
  public void testMultipleRegistration() {
    Gson badGson = gson.newBuilder().registerTypeAdapterFactory(factory).create();
    Object x = badGson.fromJson("{}", Map.class);
    assertEquals(Collections.emptyMap(), x);
  }
}
