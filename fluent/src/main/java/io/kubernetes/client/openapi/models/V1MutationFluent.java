/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1MutationFluent<A extends io.kubernetes.client.openapi.models.V1MutationFluent<A>> extends BaseFluent<A>{

  private V1ApplyConfigurationBuilder applyConfiguration;
  private V1JSONPatchBuilder jsonPatch;
  private String patchType;

  public V1MutationFluent() {
  }
  
  public V1MutationFluent(V1Mutation instance) {
    this.copyInstance(instance);
  }

  public V1ApplyConfiguration buildApplyConfiguration() {
    return this.applyConfiguration != null ? this.applyConfiguration.build() : null;
  }
  
  public V1JSONPatch buildJsonPatch() {
    return this.jsonPatch != null ? this.jsonPatch.build() : null;
  }
  
  protected void copyInstance(V1Mutation instance) {
    instance = instance != null ? instance : new V1Mutation();
    if (instance != null) {
        this.withApplyConfiguration(instance.getApplyConfiguration());
        this.withJsonPatch(instance.getJsonPatch());
        this.withPatchType(instance.getPatchType());
    }
  }
  
  public ApplyConfigurationNested<A> editApplyConfiguration() {
    return this.withNewApplyConfigurationLike(Optional.ofNullable(this.buildApplyConfiguration()).orElse(null));
  }
  
  public JsonPatchNested<A> editJsonPatch() {
    return this.withNewJsonPatchLike(Optional.ofNullable(this.buildJsonPatch()).orElse(null));
  }
  
  public ApplyConfigurationNested<A> editOrNewApplyConfiguration() {
    return this.withNewApplyConfigurationLike(Optional.ofNullable(this.buildApplyConfiguration()).orElse(new V1ApplyConfigurationBuilder().build()));
  }
  
  public ApplyConfigurationNested<A> editOrNewApplyConfigurationLike(V1ApplyConfiguration item) {
    return this.withNewApplyConfigurationLike(Optional.ofNullable(this.buildApplyConfiguration()).orElse(item));
  }
  
  public JsonPatchNested<A> editOrNewJsonPatch() {
    return this.withNewJsonPatchLike(Optional.ofNullable(this.buildJsonPatch()).orElse(new V1JSONPatchBuilder().build()));
  }
  
  public JsonPatchNested<A> editOrNewJsonPatchLike(V1JSONPatch item) {
    return this.withNewJsonPatchLike(Optional.ofNullable(this.buildJsonPatch()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1MutationFluent that = (V1MutationFluent) o;
    if (!(Objects.equals(applyConfiguration, that.applyConfiguration))) {
      return false;
    }
    if (!(Objects.equals(jsonPatch, that.jsonPatch))) {
      return false;
    }
    if (!(Objects.equals(patchType, that.patchType))) {
      return false;
    }
    return true;
  }
  
  public String getPatchType() {
    return this.patchType;
  }
  
  public boolean hasApplyConfiguration() {
    return this.applyConfiguration != null;
  }
  
  public boolean hasJsonPatch() {
    return this.jsonPatch != null;
  }
  
  public boolean hasPatchType() {
    return this.patchType != null;
  }
  
  public int hashCode() {
    return Objects.hash(applyConfiguration, jsonPatch, patchType);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(applyConfiguration == null)) {
        sb.append("applyConfiguration:");
        sb.append(applyConfiguration);
        sb.append(",");
    }
    if (!(jsonPatch == null)) {
        sb.append("jsonPatch:");
        sb.append(jsonPatch);
        sb.append(",");
    }
    if (!(patchType == null)) {
        sb.append("patchType:");
        sb.append(patchType);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApplyConfiguration(V1ApplyConfiguration applyConfiguration) {
    this._visitables.remove("applyConfiguration");
    if (applyConfiguration != null) {
        this.applyConfiguration = new V1ApplyConfigurationBuilder(applyConfiguration);
        this._visitables.get("applyConfiguration").add(this.applyConfiguration);
    } else {
        this.applyConfiguration = null;
        this._visitables.get("applyConfiguration").remove(this.applyConfiguration);
    }
    return (A) this;
  }
  
  public A withJsonPatch(V1JSONPatch jsonPatch) {
    this._visitables.remove("jsonPatch");
    if (jsonPatch != null) {
        this.jsonPatch = new V1JSONPatchBuilder(jsonPatch);
        this._visitables.get("jsonPatch").add(this.jsonPatch);
    } else {
        this.jsonPatch = null;
        this._visitables.get("jsonPatch").remove(this.jsonPatch);
    }
    return (A) this;
  }
  
  public ApplyConfigurationNested<A> withNewApplyConfiguration() {
    return new ApplyConfigurationNested(null);
  }
  
  public ApplyConfigurationNested<A> withNewApplyConfigurationLike(V1ApplyConfiguration item) {
    return new ApplyConfigurationNested(item);
  }
  
  public JsonPatchNested<A> withNewJsonPatch() {
    return new JsonPatchNested(null);
  }
  
  public JsonPatchNested<A> withNewJsonPatchLike(V1JSONPatch item) {
    return new JsonPatchNested(item);
  }
  
  public A withPatchType(String patchType) {
    this.patchType = patchType;
    return (A) this;
  }
  public class ApplyConfigurationNested<N> extends V1ApplyConfigurationFluent<ApplyConfigurationNested<N>> implements Nested<N>{
  
    V1ApplyConfigurationBuilder builder;
  
    ApplyConfigurationNested(V1ApplyConfiguration item) {
      this.builder = new V1ApplyConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutationFluent.this.withApplyConfiguration(builder.build());
    }
    
    public N endApplyConfiguration() {
      return and();
    }
    
  }
  public class JsonPatchNested<N> extends V1JSONPatchFluent<JsonPatchNested<N>> implements Nested<N>{
  
    V1JSONPatchBuilder builder;
  
    JsonPatchNested(V1JSONPatch item) {
      this.builder = new V1JSONPatchBuilder(this, item);
    }
  
    public N and() {
      return (N) V1MutationFluent.this.withJsonPatch(builder.build());
    }
    
    public N endJsonPatch() {
      return and();
    }
    
  }
}