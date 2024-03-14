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
package io.kubernetes.client.gson;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.Gson;
import io.gsonfire.GsonFireBuilder;
import io.kubernetes.client.openapi.models.V1Status;
import org.junit.jupiter.api.Test;

class V1StatusJsonDeserializerTest {

  private final Gson gson =
      new GsonFireBuilder()
          .registerPreProcessor(V1Status.class, new V1StatusPreProcessor())
          .createGsonBuilder()
          .create();

  private static final String JSON_DEPLOYMENT =
      "{\"apiVersion\":\"apps/v1\",\"kind\":\"Deployment\",\"spec\":null,\"status\":{}}";
  private static final String JSON_STATUS =
      "{\"apiVersion\":\"v1\",\"kind\":\"Status\",\"status\":\"True\"}";
  private static final String JSON_STATUS_NULL =
      "{\"apiVersion\":\"v1\",\"kind\":\"Status\",\"status\":null}";

  @Test
  void deserializeNormalStatusIntoStatus() {
    V1Status status = gson.fromJson(JSON_STATUS, V1Status.class);
    assertThat(status).isNotNull();
  }

  @Test
  void deserializeNullStatusIntoStatus() {
    V1Status status = gson.fromJson(JSON_STATUS_NULL, V1Status.class);
    assertThat(status).isNotNull();
  }

  @Test
  void deserializeDeploymentIntoStatus() {
    V1Status status = gson.fromJson(JSON_DEPLOYMENT, V1Status.class);
    assertThat(status).isNotNull();
  }
}
