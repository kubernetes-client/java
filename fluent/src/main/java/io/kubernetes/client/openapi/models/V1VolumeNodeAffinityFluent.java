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
public class V1VolumeNodeAffinityFluent<A extends io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<A>> extends BaseFluent<A>{

  private V1NodeSelectorBuilder required;

  public V1VolumeNodeAffinityFluent() {
  }
  
  public V1VolumeNodeAffinityFluent(V1VolumeNodeAffinity instance) {
    this.copyInstance(instance);
  }

  public V1NodeSelector buildRequired() {
    return this.required != null ? this.required.build() : null;
  }
  
  protected void copyInstance(V1VolumeNodeAffinity instance) {
    instance = instance != null ? instance : new V1VolumeNodeAffinity();
    if (instance != null) {
      this.withRequired(instance.getRequired());
    }
  }
  
  public RequiredNested<A> editOrNewRequired() {
    return this.withNewRequiredLike(Optional.ofNullable(this.buildRequired()).orElse(new V1NodeSelectorBuilder().build()));
  }
  
  public RequiredNested<A> editOrNewRequiredLike(V1NodeSelector item) {
    return this.withNewRequiredLike(Optional.ofNullable(this.buildRequired()).orElse(item));
  }
  
  public RequiredNested<A> editRequired() {
    return this.withNewRequiredLike(Optional.ofNullable(this.buildRequired()).orElse(null));
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
    V1VolumeNodeAffinityFluent that = (V1VolumeNodeAffinityFluent) o;
    if (!(Objects.equals(required, that.required))) {
      return false;
    }
    return true;
  }
  
  public boolean hasRequired() {
    return this.required != null;
  }
  
  public int hashCode() {
    return Objects.hash(required);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(required == null)) {
        sb.append("required:");
        sb.append(required);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public RequiredNested<A> withNewRequired() {
    return new RequiredNested(null);
  }
  
  public RequiredNested<A> withNewRequiredLike(V1NodeSelector item) {
    return new RequiredNested(item);
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
  public class RequiredNested<N> extends V1NodeSelectorFluent<RequiredNested<N>> implements Nested<N>{
  
    V1NodeSelectorBuilder builder;
  
    RequiredNested(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
  
    public N and() {
      return (N) V1VolumeNodeAffinityFluent.this.withRequired(builder.build());
    }
    
    public N endRequired() {
      return and();
    }
    
  }
}