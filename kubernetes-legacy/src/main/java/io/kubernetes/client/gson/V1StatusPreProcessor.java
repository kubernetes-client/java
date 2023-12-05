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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.gsonfire.PreProcessor;
import io.kubernetes.client.openapi.models.V1Status;

/** Suppresses runtime exceptions due to https://github.com/kubernetes-client/java/issues/86. */
public class V1StatusPreProcessor implements PreProcessor<V1Status> {

  @Override
  public void preDeserialize(Class<? extends V1Status> aClass, JsonElement jsonElement, Gson gson) {
    if (isLegitKubernetesStatus(jsonElement)) {
      return;
    }

    JsonObject obj = jsonElement.getAsJsonObject();
    JsonElement statusField = obj.get("status");
    if (statusField != null && statusField.isJsonObject()) {
      obj.addProperty("status", (String) null);
    }
  }

  private static boolean isLegitKubernetesStatus(JsonElement jsonElement) {
    String apiVersion =
        jsonElement.getAsJsonObject().get("apiVersion") != null
            ? jsonElement.getAsJsonObject().get("apiVersion").getAsString()
            : null;
    String kind =
        jsonElement.getAsJsonObject().get("kind") != null
            ? jsonElement.getAsJsonObject().get("kind").getAsString()
            : null;
    return "v1".equals(apiVersion) && "Status".equals(kind);
  }
}
