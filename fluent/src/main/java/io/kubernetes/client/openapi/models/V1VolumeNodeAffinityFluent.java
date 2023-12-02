package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1VolumeNodeAffinityFluent<A extends V1VolumeNodeAffinityFluent<A>> extends BaseFluent<A>{
  public V1VolumeNodeAffinityFluent() {
  }
  
  public V1VolumeNodeAffinityFluent(V1VolumeNodeAffinity instance) {
    this.copyInstance(instance);
  }
  private V1NodeSelectorBuilder required;
  
  protected void copyInstance(V1VolumeNodeAffinity instance) {
    instance = (instance != null ? instance : new V1VolumeNodeAffinity());
    if (instance != null) {
          this.withRequired(instance.getRequired());
        }
  }
  
  public V1NodeSelector buildRequired() {
    return this.required != null ? this.required.build() : null;
  }
  
  public A withRequired(V1NodeSelector required) {
    this._visitables.remove("required");
    if (required != null) {
        this.required = new V1NodeSelectorBuilder(required);
        this._visitables.get("required").add(this.required);
    } else {
        this.required = null;
        this._visitables.get("required").remove(this.required);
    }
    return (A) this;
  }
  
  public boolean hasRequired() {
    return this.required != null;
  }
  
  public RequiredNested<A> withNewRequired() {
    return new RequiredNested(null);
  }
  
  public RequiredNested<A> withNewRequiredLike(V1NodeSelector item) {
    return new RequiredNested(item);
  }
  
  public RequiredNested<A> editRequired() {
    return withNewRequiredLike(java.util.Optional.ofNullable(buildRequired()).orElse(null));
  }
  
  public RequiredNested<A> editOrNewRequired() {
    return withNewRequiredLike(java.util.Optional.ofNullable(buildRequired()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public RequiredNested<A> editOrNewRequiredLike(V1NodeSelector item) {
    return withNewRequiredLike(java.util.Optional.ofNullable(buildRequired()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeNodeAffinityFluent that = (V1VolumeNodeAffinityFluent) o;
    if (!java.util.Objects.equals(required, that.required)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(required,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (required != null) { sb.append("required:"); sb.append(required); }
    sb.append("}");
    return sb.toString();
  }
  public class RequiredNested<N> extends V1NodeSelectorFluent<RequiredNested<N>> implements Nested<N>{
    RequiredNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    V1NodeSelectorBuilder builder;
    
    public N and() {
      return (N) V1VolumeNodeAffinityFluent.this.withRequired(builder.build());
    }
    
    public N endRequired() {
      return and();
    }
    
  
  }

}