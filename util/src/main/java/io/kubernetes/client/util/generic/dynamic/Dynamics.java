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
import java.util.Map;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

public class Dynamics {

  static final LegacyJSON internalJSONCodec = new LegacyJSON();
  static final Yaml internalYamlCodec = new Yaml(new SafeConstructor(new LoaderOptions()));

  public static DynamicKubernetesObject newFromJson(String jsonContent) {
    return newFromJson(internalJSONCodec.getGson(), jsonContent);
  }

  public static DynamicKubernetesObject newFromJson(Gson gson, String jsonContent) {
    JsonElement raw = gson.fromJson(jsonContent, JsonElement.class);
    return new DynamicKubernetesObject(raw.getAsJsonObject());
  }

  public static DynamicKubernetesListObject newListFromJson(String jsonContent) {
    return newListFromJson(internalJSONCodec.getGson(), jsonContent);
  }

  public static DynamicKubernetesListObject newListFromJson(Gson gson, String jsonContent) {
    JsonElement raw = gson.fromJson(jsonContent, JsonElement.class);
    return new DynamicKubernetesListObject(raw.getAsJsonObject());
  }

  public static DynamicKubernetesObject newFromYaml(String yamlContent) {
    return newFromYaml(internalYamlCodec, yamlContent);
  }

  public static DynamicKubernetesObject newFromYaml(Yaml yamlCodec, String yamlContent) {
    return newFromJson(
        internalJSONCodec.getGson(),
        fromYamlToJson(yamlCodec, internalJSONCodec.getGson(), yamlContent));
  }

  public static String fromYamlToJson(String yamlContent) {
    return fromYamlToJson(internalYamlCodec, internalJSONCodec.getGson(), yamlContent);
  }

  public static String fromJsonToYaml(String jsonContent) {
    return fromJsonToYaml(internalYamlCodec, internalJSONCodec.getGson(), jsonContent);
  }

  public static String fromYamlToJson(Yaml yamlCodec, Gson gson, String yamlContent) {
    Map<String, Object> rawYamlObj = yamlCodec.load(yamlContent);
    return gson.toJson(rawYamlObj);
  }

  public static String fromJsonToYaml(Yaml yamlCodec, Gson gson, String jsonContent) {
    Map<String, Object> rawJsonObj = gson.fromJson(jsonContent, Map.class);
    return yamlCodec.dump(rawJsonObj);
  }
}
