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

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1ListMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DynamicKubernetesListObject is a wrapper for {@link JsonObject} that fits the common kubernetes
 * list type interface {@link KubernetesListObject}.
 */
public class DynamicKubernetesListObject implements KubernetesListObject {

  public DynamicKubernetesListObject() {
    this(new JsonObject());
  }

  public DynamicKubernetesListObject(JsonObject obj) {
    this.raw = obj;
  }

  private final JsonObject raw;

  @Override
  public V1ListMeta getMetadata() {
    return Configuration.getDefaultApiClient()
        .getJSON()
        .getGson()
        .fromJson(this.raw.get("metadata"), V1ListMeta.class);
  }

  @Override
  public String getApiVersion() {
    return this.raw.get("apiVersion").getAsString();
  }

  @Override
  public String getKind() {
    return this.raw.get("kind").getAsString();
  }

  @Override
  public List<DynamicKubernetesObject> getItems() {
    List<DynamicKubernetesObject> list = new ArrayList<>();
    for (JsonElement e : this.raw.get("items").getAsJsonArray()) {
      list.add(new DynamicKubernetesObject(e.getAsJsonObject()));
    }
    return list;
  }

  public JsonObject getRaw() {
    return raw;
  }

  public void setApiVersion(String apiVersion) {
    this.raw.addProperty("apiVersion", apiVersion);
  }

  public void setKind(String kind) {
    this.raw.addProperty("kind", kind);
  }

  public void setMetadata(V1ListMeta objectMeta) {
    this.raw.add(
        "metadata", Configuration.getDefaultApiClient().getJSON().getGson().toJsonTree(objectMeta));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DynamicKubernetesListObject that = (DynamicKubernetesListObject) o;
    return Objects.equals(raw, that.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw);
  }
}
