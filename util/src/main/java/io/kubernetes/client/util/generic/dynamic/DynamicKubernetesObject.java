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

import com.google.gson.JsonObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.Objects;

/**
 * DynamicKubernetesObject is a wrapper for {@link JsonObject} that fits the common kubernetes type
 * interface {@link KubernetesObject}.
 */
public class DynamicKubernetesObject implements KubernetesObject {

  public DynamicKubernetesObject() {
    this(new JsonObject());
  }

  public DynamicKubernetesObject(JsonObject obj) {
    this.raw = obj;
  }

  private final JsonObject raw;

  @Override
  public V1ObjectMeta getMetadata() {
    return Dynamics.internalJSONCodec
        .getGson()
        .fromJson(this.raw.get("metadata"), V1ObjectMeta.class);
  }

  @Override
  public String getApiVersion() {
    return this.raw.get("apiVersion").getAsString();
  }

  @Override
  public String getKind() {
    return this.raw.get("kind").getAsString();
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

  public void setMetadata(V1ObjectMeta objectMeta) {
    this.raw.add("metadata", Dynamics.internalJSONCodec.getGson().toJsonTree(objectMeta));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DynamicKubernetesObject that = (DynamicKubernetesObject) o;
    return Objects.equals(raw, that.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(raw);
  }
}
