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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import io.kubernetes.client.openapi.Configuration;

public class Dynamics {

  public static DynamicKubernetesObject newFromJson(String jsonContent) {
    return newFromJson(Configuration.getDefaultApiClient().getJSON().getGson(), jsonContent);
  }

  public static DynamicKubernetesObject newFromJson(Gson gson, String jsonContent) {
    JsonElement raw = gson.fromJson(jsonContent, JsonElement.class);
    return new DynamicKubernetesObject(raw.getAsJsonObject());
  }

  public static DynamicKubernetesListObject newListFromJson(String jsonContent) {
    return newListFromJson(Configuration.getDefaultApiClient().getJSON().getGson(), jsonContent);
  }

  public static DynamicKubernetesListObject newListFromJson(Gson gson, String jsonContent) {
    JsonElement raw = gson.fromJson(jsonContent, JsonElement.class);
    return new DynamicKubernetesListObject(raw.getAsJsonObject());
  }
}
