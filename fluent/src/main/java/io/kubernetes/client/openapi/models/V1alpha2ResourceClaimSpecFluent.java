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
public class V1alpha2ResourceClaimSpecFluent<A extends V1alpha2ResourceClaimSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceClaimSpecFluent() {
  }
  
  public V1alpha2ResourceClaimSpecFluent(V1alpha2ResourceClaimSpec instance) {
    this.copyInstance(instance);
  }
  private String allocationMode;
  private V1alpha2ResourceClaimParametersReferenceBuilder parametersRef;
  private String resourceClassName;
  
  protected void copyInstance(V1alpha2ResourceClaimSpec instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceClaimSpec());
    if (instance != null) {
          this.withAllocationMode(instance.getAllocationMode());
          this.withParametersRef(instance.getParametersRef());
          this.withResourceClassName(instance.getResourceClassName());
        }
  }
  
  public String getAllocationMode() {
    return this.allocationMode;
  }
  
  public A withAllocationMode(String allocationMode) {
    this.allocationMode = allocationMode;
    return (A) this;
  }
  
  public boolean hasAllocationMode() {
    return this.allocationMode != null;
  }
  
  public V1alpha2ResourceClaimParametersReference buildParametersRef() {
    return this.parametersRef != null ? this.parametersRef.build() : null;
  }
  
  public A withParametersRef(V1alpha2ResourceClaimParametersReference parametersRef) {
    this._visitables.remove("parametersRef");
    if (parametersRef != null) {
        this.parametersRef = new V1alpha2ResourceClaimParametersReferenceBuilder(parametersRef);
        this._visitables.get("parametersRef").add(this.parametersRef);
    } else {
        this.parametersRef = null;
        this._visitables.get("parametersRef").remove(this.parametersRef);
    }
    return (A) this;
  }
  
  public boolean hasParametersRef() {
    return this.parametersRef != null;
  }
  
  public ParametersRefNested<A> withNewParametersRef() {
    return new ParametersRefNested(null);
  }
  
  public ParametersRefNested<A> withNewParametersRefLike(V1alpha2ResourceClaimParametersReference item) {
    return new ParametersRefNested(item);
  }
  
  public ParametersRefNested<A> editParametersRef() {
    return withNewParametersRefLike(java.util.Optional.ofNullable(buildParametersRef()).orElse(null));
  }
  
  public ParametersRefNested<A> editOrNewParametersRef() {
    return withNewParametersRefLike(java.util.Optional.ofNullable(buildParametersRef()).orElse(new V1alpha2ResourceClaimParametersReferenceBuilder().build()));
  }
  
  public ParametersRefNested<A> editOrNewParametersRefLike(V1alpha2ResourceClaimParametersReference item) {
    return withNewParametersRefLike(java.util.Optional.ofNullable(buildParametersRef()).orElse(item));
  }
  
  public String getResourceClassName() {
    return this.resourceClassName;
  }
  
  public A withResourceClassName(String resourceClassName) {
    this.resourceClassName = resourceClassName;
    return (A) this;
  }
  
  public boolean hasResourceClassName() {
    return this.resourceClassName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClaimSpecFluent that = (V1alpha2ResourceClaimSpecFluent) o;
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
  public class ParametersRefNested<N> extends V1alpha2ResourceClaimParametersReferenceFluent<ParametersRefNested<N>> implements Nested<N>{
    ParametersRefNested(V1alpha2ResourceClaimParametersReference item) {
      this.builder = new V1alpha2ResourceClaimParametersReferenceBuilder(this, item);
    }
    V1alpha2ResourceClaimParametersReferenceBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceClaimSpecFluent.this.withParametersRef(builder.build());
    }
    
    public N endParametersRef() {
      return and();
    }
    
  
  }

}