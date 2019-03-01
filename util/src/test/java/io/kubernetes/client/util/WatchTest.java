/*
Copyright 2019 The Kubernetes Authors.
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

import static org.junit.Assert.assertEquals;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.JSON;
import io.kubernetes.client.models.V1ConfigMap;
import java.io.IOException;
import org.junit.Test;

/** Tests for the Watch helper class */
public class WatchTest {
  @Test
  public void testWatchEnd() throws IOException {
    JSON json = new JSON();
    Watch<V1ConfigMap> watch =
        new Watch<V1ConfigMap>(
            json, null, new TypeToken<Watch.Response<V1ConfigMap>>() {}.getType(), null);
    JsonObject metadata = new JsonObject();
    metadata.addProperty("name", "foo");
    metadata.addProperty("namespace", "bar");

    JsonObject status = new JsonObject();
    status.add("metadata", metadata);
    status.addProperty("kind", "Status");
    status.addProperty("apiVersion", "v1");
    status.addProperty("status", "failure");
    status.addProperty("message", "too old resource version");
    status.addProperty("reason", "Gone");
    status.addProperty("code", 410);

    JsonObject obj = new JsonObject();
    obj.addProperty("type", "ERR");
    obj.add("object", status);
    String data = json.getGson().toJson(obj);
    Watch.Response<V1ConfigMap> response = watch.parseLine(data);
    assertEquals(null, response.object);
  }
}
