package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1MutationFluent<A extends V1alpha1MutationFluent<A>> extends BaseFluent<A>{
  public V1alpha1MutationFluent() {
  }
  
  public V1alpha1MutationFluent(V1alpha1Mutation instance) {
    this.copyInstance(instance);
  }
  private V1alpha1ApplyConfigurationBuilder applyConfiguration;
  private V1alpha1JSONPatchBuilder jsonPatch;
  private String patchType;
  
  protected void copyInstance(V1alpha1Mutation instance) {
    instance = (instance != null ? instance : new V1alpha1Mutation());
    if (instance != null) {
          this.withApplyConfiguration(instance.getApplyConfiguration());
          this.withJsonPatch(instance.getJsonPatch());
          this.withPatchType(instance.getPatchType());
        }
  }
  
  public V1alpha1ApplyConfiguration buildApplyConfiguration() {
    return this.applyConfiguration != null ? this.applyConfiguration.build() : null;
  }
  
  public A withApplyConfiguration(V1alpha1ApplyConfiguration applyConfiguration) {
    this._visitables.remove("applyConfiguration");
    if (applyConfiguration != null) {
        this.applyConfiguration = new V1alpha1ApplyConfigurationBuilder(applyConfiguration);
        this._visitables.get("applyConfiguration").add(this.applyConfiguration);
    } else {
        this.applyConfiguration = null;
        this._visitables.get("applyConfiguration").remove(this.applyConfiguration);
    }
    return (A) this;
  }
  
  public boolean hasApplyConfiguration() {
    return this.applyConfiguration != null;
  }
  
  public ApplyConfigurationNested<A> withNewApplyConfiguration() {
    return new ApplyConfigurationNested(null);
  }
  
  public ApplyConfigurationNested<A> withNewApplyConfigurationLike(V1alpha1ApplyConfiguration item) {
    return new ApplyConfigurationNested(item);
  }
  
  public ApplyConfigurationNested<A> editApplyConfiguration() {
    return withNewApplyConfigurationLike(java.util.Optional.ofNullable(buildApplyConfiguration()).orElse(null));
  }
  
  public ApplyConfigurationNested<A> editOrNewApplyConfiguration() {
    return withNewApplyConfigurationLike(java.util.Optional.ofNullable(buildApplyConfiguration()).orElse(new V1alpha1ApplyConfigurationBuilder().build()));
  }
  
  public ApplyConfigurationNested<A> editOrNewApplyConfigurationLike(V1alpha1ApplyConfiguration item) {
    return withNewApplyConfigurationLike(java.util.Optional.ofNullable(buildApplyConfiguration()).orElse(item));
  }
  
  public V1alpha1JSONPatch buildJsonPatch() {
    return this.jsonPatch != null ? this.jsonPatch.build() : null;
  }
  
  public A withJsonPatch(V1alpha1JSONPatch jsonPatch) {
    this._visitables.remove("jsonPatch");
    if (jsonPatch != null) {
        this.jsonPatch = new V1alpha1JSONPatchBuilder(jsonPatch);
        this._visitables.get("jsonPatch").add(this.jsonPatch);
    } else {
        this.jsonPatch = null;
        this._visitables.get("jsonPatch").remove(this.jsonPatch);
    }
    return (A) this;
  }
  
  public boolean hasJsonPatch() {
    return this.jsonPatch != null;
  }
  
  public JsonPatchNested<A> withNewJsonPatch() {
    return new JsonPatchNested(null);
  }
  
  public JsonPatchNested<A> withNewJsonPatchLike(V1alpha1JSONPatch item) {
    return new JsonPatchNested(item);
  }
  
  public JsonPatchNested<A> editJsonPatch() {
    return withNewJsonPatchLike(java.util.Optional.ofNullable(buildJsonPatch()).orElse(null));
  }
  
  public JsonPatchNested<A> editOrNewJsonPatch() {
    return withNewJsonPatchLike(java.util.Optional.ofNullable(buildJsonPatch()).orElse(new V1alpha1JSONPatchBuilder().build()));
  }
  
  public JsonPatchNested<A> editOrNewJsonPatchLike(V1alpha1JSONPatch item) {
    return withNewJsonPatchLike(java.util.Optional.ofNullable(buildJsonPatch()).orElse(item));
  }
  
  public String getPatchType() {
    return this.patchType;
  }
  
  public A withPatchType(String patchType) {
    this.patchType = patchType;
    return (A) this;
  }
  
  public boolean hasPatchType() {
    return this.patchType != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1MutationFluent that = (V1alpha1MutationFluent) o;
    if (!java.util.Objects.equals(applyConfiguration, that.applyConfiguration)) return false;
    if (!java.util.Objects.equals(jsonPatch, that.jsonPatch)) return false;
    if (!java.util.Objects.equals(patchType, that.patchType)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(applyConfiguration,  jsonPatch,  patchType,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (applyConfiguration != null) { sb.append("applyConfiguration:"); sb.append(applyConfiguration + ","); }
    if (jsonPatch != null) { sb.append("jsonPatch:"); sb.append(jsonPatch + ","); }
    if (patchType != null) { sb.append("patchType:"); sb.append(patchType); }
    sb.append("}");
    return sb.toString();
  }
  public class ApplyConfigurationNested<N> extends V1alpha1ApplyConfigurationFluent<ApplyConfigurationNested<N>> implements Nested<N>{
    ApplyConfigurationNested(V1alpha1ApplyConfiguration item) {
      this.builder = new V1alpha1ApplyConfigurationBuilder(this, item);
    }
    V1alpha1ApplyConfigurationBuilder builder;
    
    public N and() {
      return (N) V1alpha1MutationFluent.this.withApplyConfiguration(builder.build());
    }
    
    public N endApplyConfiguration() {
      return and();
    }
    
  
  }
  public class JsonPatchNested<N> extends V1alpha1JSONPatchFluent<JsonPatchNested<N>> implements Nested<N>{
    JsonPatchNested(V1alpha1JSONPatch item) {
      this.builder = new V1alpha1JSONPatchBuilder(this, item);
    }
    V1alpha1JSONPatchBuilder builder;
    
    public N and() {
      return (N) V1alpha1MutationFluent.this.withJsonPatch(builder.build());
    }
    
    public N endJsonPatch() {
      return and();
    }
    
  
  }

}