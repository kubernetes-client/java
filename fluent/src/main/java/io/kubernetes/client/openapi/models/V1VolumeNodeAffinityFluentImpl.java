package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1VolumeNodeAffinityFluentImpl<A extends V1VolumeNodeAffinityFluent<A>> extends BaseFluent<A> implements V1VolumeNodeAffinityFluent<A>{
  public V1VolumeNodeAffinityFluentImpl() {
  }
  public V1VolumeNodeAffinityFluentImpl(V1VolumeNodeAffinity instance) {
    this.withRequired(instance.getRequired());

  }
  private V1NodeSelectorBuilder required;
  
  /**
   * This method has been deprecated, please use method buildRequired instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getRequired() {
    return this.required!=null ?this.required.build():null;
  }
  public V1NodeSelector buildRequired() {
    return this.required!=null ?this.required.build():null;
  }
  public A withRequired(V1NodeSelector required) {
    _visitables.get("required").remove(this.required);
    if (required!=null){ this.required= new V1NodeSelectorBuilder(required); _visitables.get("required").add(this.required);} else { this.required = null; _visitables.get("required").remove(this.required); } return (A) this;
  }
  public Boolean hasRequired() {
    return this.required != null;
  }
  public V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired() {
    return new V1VolumeNodeAffinityFluentImpl.RequiredNestedImpl();
  }
  public V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequiredLike(V1NodeSelector item) {
    return new V1VolumeNodeAffinityFluentImpl.RequiredNestedImpl(item);
  }
  public V1VolumeNodeAffinityFluent.RequiredNested<A> editRequired() {
    return withNewRequiredLike(getRequired());
  }
  public V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequired() {
    return withNewRequiredLike(getRequired() != null ? getRequired(): new V1NodeSelectorBuilder().build());
  }
  public V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequiredLike(V1NodeSelector item) {
    return withNewRequiredLike(getRequired() != null ? getRequired(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeNodeAffinityFluentImpl that = (V1VolumeNodeAffinityFluentImpl) o;
    if (required != null ? !required.equals(that.required) :that.required != null) return false;
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
  class RequiredNestedImpl<N> extends V1NodeSelectorFluentImpl<V1VolumeNodeAffinityFluent.RequiredNested<N>> implements V1VolumeNodeAffinityFluent.RequiredNested<N>,Nested<N>{
    RequiredNestedImpl(V1NodeSelector item) {
      this.builder = new V1NodeSelectorBuilder(this, item);
    }
    RequiredNestedImpl() {
      this.builder = new V1NodeSelectorBuilder(this);
    }
    V1NodeSelectorBuilder builder;
    public N and() {
      return (N) V1VolumeNodeAffinityFluentImpl.this.withRequired(builder.build());
    }
    public N endRequired() {
      return and();
    }
    
  }
  
}