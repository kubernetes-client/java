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
public class V1beta1MutationFluent<A extends io.kubernetes.client.openapi.models.V1beta1MutationFluent<A>> extends BaseFluent<A>{

  private V1beta1ApplyConfigurationBuilder applyConfiguration;
  private V1beta1JSONPatchBuilder jsonPatch;
  private String patchType;

  public V1beta1MutationFluent() {
  }
  
  public V1beta1MutationFluent(V1beta1Mutation instance) {
    this.copyInstance(instance);
  }

  public V1beta1ApplyConfiguration buildApplyConfiguration() {
    return this.applyConfiguration != null ? this.applyConfiguration.build() : null;
  }
  
  public V1beta1JSONPatch buildJsonPatch() {
    return this.jsonPatch != null ? this.jsonPatch.build() : null;
  }
  
  protected void copyInstance(V1beta1Mutation instance) {
    instance = instance != null ? instance : new V1beta1Mutation();
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
    return this.withNewApplyConfigurationLike(Optional.ofNullable(this.buildApplyConfiguration()).orElse(new V1beta1ApplyConfigurationBuilder().build()));
  }
  
  public ApplyConfigurationNested<A> editOrNewApplyConfigurationLike(V1beta1ApplyConfiguration item) {
    return this.withNewApplyConfigurationLike(Optional.ofNullable(this.buildApplyConfiguration()).orElse(item));
  }
  
  public JsonPatchNested<A> editOrNewJsonPatch() {
    return this.withNewJsonPatchLike(Optional.ofNullable(this.buildJsonPatch()).orElse(new V1beta1JSONPatchBuilder().build()));
  }
  
  public JsonPatchNested<A> editOrNewJsonPatchLike(V1beta1JSONPatch item) {
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
    V1beta1MutationFluent that = (V1beta1MutationFluent) o;
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
  
  public A withApplyConfiguration(V1beta1ApplyConfiguration applyConfiguration) {
    this._visitables.remove("applyConfiguration");
    if (applyConfiguration != null) {
        this.applyConfiguration = new V1beta1ApplyConfigurationBuilder(applyConfiguration);
        this._visitables.get("applyConfiguration").add(this.applyConfiguration);
    } else {
        this.applyConfiguration = null;
        this._visitables.get("applyConfiguration").remove(this.applyConfiguration);
    }
    return (A) this;
  }
  
  public A withJsonPatch(V1beta1JSONPatch jsonPatch) {
    this._visitables.remove("jsonPatch");
    if (jsonPatch != null) {
        this.jsonPatch = new V1beta1JSONPatchBuilder(jsonPatch);
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
  
  public ApplyConfigurationNested<A> withNewApplyConfigurationLike(V1beta1ApplyConfiguration item) {
    return new ApplyConfigurationNested(item);
  }
  
  public JsonPatchNested<A> withNewJsonPatch() {
    return new JsonPatchNested(null);
  }
  
  public JsonPatchNested<A> withNewJsonPatchLike(V1beta1JSONPatch item) {
    return new JsonPatchNested(item);
  }
  
  public A withPatchType(String patchType) {
    this.patchType = patchType;
    return (A) this;
  }
  public class ApplyConfigurationNested<N> extends V1beta1ApplyConfigurationFluent<ApplyConfigurationNested<N>> implements Nested<N>{
  
    V1beta1ApplyConfigurationBuilder builder;
  
    ApplyConfigurationNested(V1beta1ApplyConfiguration item) {
      this.builder = new V1beta1ApplyConfigurationBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1MutationFluent.this.withApplyConfiguration(builder.build());
    }
    
    public N endApplyConfiguration() {
      return and();
    }
    
  }
  public class JsonPatchNested<N> extends V1beta1JSONPatchFluent<JsonPatchNested<N>> implements Nested<N>{
  
    V1beta1JSONPatchBuilder builder;
  
    JsonPatchNested(V1beta1JSONPatch item) {
      this.builder = new V1beta1JSONPatchBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1MutationFluent.this.withJsonPatch(builder.build());
    }
    
    public N endJsonPatch() {
      return and();
    }
    
  }
}