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

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.Gson;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.Collections;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynamicKubernetesTypeAdaptorFactoryTest {

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

  @BeforeEach
  void setup() {
    gson = new Gson().newBuilder().registerTypeAdapterFactory(factory).create();
  }

  @Test
  void singleDynamicObjectRoundTrip() {
    KubernetesObject dynamicObj = gson.fromJson(jsonContent, KubernetesObject.class);
    assertThat(dynamicObj instanceof DynamicKubernetesObject).isTrue();

    assertThat(dynamicObj.getApiVersion()).isEqualTo("v1");
    assertThat(dynamicObj.getKind()).isEqualTo("Namespace");
    assertThat(dynamicObj.getMetadata()).isEqualTo(new V1ObjectMeta().name("foo"));

    String dumped = gson.toJson(dynamicObj);
    assertThat(dumped).isEqualTo(jsonContent);
  }

  @Test
  void listDynamicObjectRoundTrip() {
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
    assertThat(dynamicListObj instanceof DynamicKubernetesListObject).isTrue();

    assertThat(dynamicListObj.getItems()).hasSize(1);

    String dumped = gson.toJson(dynamicListObj);
    assertThat(dumped).isEqualTo(listJsonContent);
  }

  // Registering the same factory twice is not a good idea, but we should not explode if it happens.
  // See https://github.com/google/gson/issues/2312
  @Test
  void multipleRegistration() {
    Gson badGson = gson.newBuilder().registerTypeAdapterFactory(factory).create();
    Object x = badGson.fromJson("{}", Map.class);
    assertThat(x).isEqualTo(Collections.emptyMap());
  }
}
