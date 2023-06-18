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
  public class V1alpha2ResourceClaimSpecFluentImpl<A extends V1alpha2ResourceClaimSpecFluent<A>> extends BaseFluent<A> implements V1alpha2ResourceClaimSpecFluent<A>{
  public V1alpha2ResourceClaimSpecFluentImpl() {
  }
  public V1alpha2ResourceClaimSpecFluentImpl(V1alpha2ResourceClaimSpec instance) {
    if (instance != null) {
      this.withAllocationMode(instance.getAllocationMode());
      this.withParametersRef(instance.getParametersRef());
      this.withResourceClassName(instance.getResourceClassName());
    }
  }
  private String allocationMode;
  private V1alpha2ResourceClaimParametersReferenceBuilder parametersRef;
  private String resourceClassName;
  public String getAllocationMode() {
    return this.allocationMode;
  }
  public A withAllocationMode(String allocationMode) {
    this.allocationMode=allocationMode; return (A) this;
  }
  public Boolean hasAllocationMode() {
    return this.allocationMode != null;
  }
  
  /**
   * This method has been deprecated, please use method buildParametersRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2ResourceClaimParametersReference getParametersRef() {
    return this.parametersRef!=null ?this.parametersRef.build():null;
  }
  public V1alpha2ResourceClaimParametersReference buildParametersRef() {
    return this.parametersRef!=null ?this.parametersRef.build():null;
  }
  public A withParametersRef(V1alpha2ResourceClaimParametersReference parametersRef) {
    _visitables.get("parametersRef").remove(this.parametersRef);
    if (parametersRef!=null){ this.parametersRef= new V1alpha2ResourceClaimParametersReferenceBuilder(parametersRef); _visitables.get("parametersRef").add(this.parametersRef);} else { this.parametersRef = null; _visitables.get("parametersRef").remove(this.parametersRef); } return (A) this;
  }
  public Boolean hasParametersRef() {
    return this.parametersRef != null;
  }
  public V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNested<A> withNewParametersRef() {
    return new V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNestedImpl();
  }
  public V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNested<A> withNewParametersRefLike(V1alpha2ResourceClaimParametersReference item) {
    return new V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNestedImpl(item);
  }
  public V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNested<A> editParametersRef() {
    return withNewParametersRefLike(getParametersRef());
  }
  public V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNested<A> editOrNewParametersRef() {
    return withNewParametersRefLike(getParametersRef() != null ? getParametersRef(): new V1alpha2ResourceClaimParametersReferenceBuilder().build());
  }
  public V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNested<A> editOrNewParametersRefLike(V1alpha2ResourceClaimParametersReference item) {
    return withNewParametersRefLike(getParametersRef() != null ? getParametersRef(): item);
  }
  public String getResourceClassName() {
    return this.resourceClassName;
  }
  public A withResourceClassName(String resourceClassName) {
    this.resourceClassName=resourceClassName; return (A) this;
  }
  public Boolean hasResourceClassName() {
    return this.resourceClassName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClaimSpecFluentImpl that = (V1alpha2ResourceClaimSpecFluentImpl) o;
    if (!java.util.Objects.equals(allocationMode, that.allocationMode)) return false;

    if (!java.util.Objects.equals(parametersRef, that.parametersRef)) return false;

    if (!java.util.Objects.equals(resourceClassName, that.resourceClassName)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(allocationMode,  parametersRef,  resourceClassName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocationMode != null) { sb.append("allocationMode:"); sb.append(allocationMode + ","); }
    if (parametersRef != null) { sb.append("parametersRef:"); sb.append(parametersRef + ","); }
    if (resourceClassName != null) { sb.append("resourceClassName:"); sb.append(resourceClassName); }
    sb.append("}");
    return sb.toString();
  }
  class ParametersRefNestedImpl<N> extends V1alpha2ResourceClaimParametersReferenceFluentImpl<V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNested<N>> implements V1alpha2ResourceClaimSpecFluentImpl.ParametersRefNested<N>,Nested<N>{
    ParametersRefNestedImpl(V1alpha2ResourceClaimParametersReference item) {
      this.builder = new V1alpha2ResourceClaimParametersReferenceBuilder(this, item);
    }
    ParametersRefNestedImpl() {
      this.builder = new V1alpha2ResourceClaimParametersReferenceBuilder(this);
    }
    V1alpha2ResourceClaimParametersReferenceBuilder builder;
    public N and() {
      return (N) V1alpha2ResourceClaimSpecFluentImpl.this.withParametersRef(builder.build());
    }
    public N endParametersRef() {
      return and();
    }
    
  }
  
}