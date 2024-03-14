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
package io.kubernetes.client.util;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import java.io.IOException;
import org.junit.jupiter.api.Test;

/** Tests for the Watch helper class */
class WatchTest {
  @Test
  void watchEnd() throws IOException {
    JSON json = new JSON();
    Watch<V1ConfigMap> watch =
        new Watch<V1ConfigMap>(
            json, null, new TypeToken<Watch.Response<V1ConfigMap>>() {}.getType(), null);
    JsonObject metadata = new JsonObject();

    JsonObject status = new JsonObject();
    status.add("metadata", metadata);
    status.addProperty("kind", "Status");
    status.addProperty("apiVersion", "v1");
    status.addProperty("status", "failure");
    status.addProperty("message", "too old resource version");
    status.addProperty("reason", "Gone");
    status.addProperty("code", 410);

    JsonObject obj = new JsonObject();
    obj.addProperty("type", "ERROR");
    obj.add("object", status);
    String data = json.getGson().toJson(obj);
    Watch.Response<V1ConfigMap> response = watch.parseLine(data);
    assertThat(response.object).isEqualTo(null);
  }
}
