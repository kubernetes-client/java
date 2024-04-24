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
public class V1alpha2DriverAllocationResultFluent<A extends V1alpha2DriverAllocationResultFluent<A>> extends BaseFluent<A>{
  public V1alpha2DriverAllocationResultFluent() {
  }
  
  public V1alpha2DriverAllocationResultFluent(V1alpha2DriverAllocationResult instance) {
    this.copyInstance(instance);
  }
  private V1alpha2NamedResourcesAllocationResultBuilder namedResources;
  private Object vendorRequestParameters;
  
  protected void copyInstance(V1alpha2DriverAllocationResult instance) {
    instance = (instance != null ? instance : new V1alpha2DriverAllocationResult());
    if (instance != null) {
          this.withNamedResources(instance.getNamedResources());
          this.withVendorRequestParameters(instance.getVendorRequestParameters());
        }
  }
  
  public V1alpha2NamedResourcesAllocationResult buildNamedResources() {
    return this.namedResources != null ? this.namedResources.build() : null;
  }
  
  public A withNamedResources(V1alpha2NamedResourcesAllocationResult namedResources) {
    this._visitables.remove("namedResources");
    if (namedResources != null) {
        this.namedResources = new V1alpha2NamedResourcesAllocationResultBuilder(namedResources);
        this._visitables.get("namedResources").add(this.namedResources);
    } else {
        this.namedResources = null;
        this._visitables.get("namedResources").remove(this.namedResources);
    }
    return (A) this;
  }
  
  public boolean hasNamedResources() {
    return this.namedResources != null;
  }
  
  public NamedResourcesNested<A> withNewNamedResources() {
    return new NamedResourcesNested(null);
  }
  
  public NamedResourcesNested<A> withNewNamedResourcesLike(V1alpha2NamedResourcesAllocationResult item) {
    return new NamedResourcesNested(item);
  }
  
  public NamedResourcesNested<A> editNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(null));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(new V1alpha2NamedResourcesAllocationResultBuilder().build()));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResourcesLike(V1alpha2NamedResourcesAllocationResult item) {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(item));
  }
  
  public Object getVendorRequestParameters() {
    return this.vendorRequestParameters;
  }
  
  public A withVendorRequestParameters(Object vendorRequestParameters) {
    this.vendorRequestParameters = vendorRequestParameters;
    return (A) this;
  }
  
  public boolean hasVendorRequestParameters() {
    return this.vendorRequestParameters != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2DriverAllocationResultFluent that = (V1alpha2DriverAllocationResultFluent) o;
    if (!java.util.Objects.equals(namedResources, that.namedResources)) return false;
    if (!java.util.Objects.equals(vendorRequestParameters, that.vendorRequestParameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(namedResources,  vendorRequestParameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (namedResources != null) { sb.append("namedResources:"); sb.append(namedResources + ","); }
    if (vendorRequestParameters != null) { sb.append("vendorRequestParameters:"); sb.append(vendorRequestParameters); }
    sb.append("}");
    return sb.toString();
  }
  public class NamedResourcesNested<N> extends V1alpha2NamedResourcesAllocationResultFluent<NamedResourcesNested<N>> implements Nested<N>{
    NamedResourcesNested(V1alpha2NamedResourcesAllocationResult item) {
      this.builder = new V1alpha2NamedResourcesAllocationResultBuilder(this, item);
    }
    V1alpha2NamedResourcesAllocationResultBuilder builder;
    
    public N and() {
      return (N) V1alpha2DriverAllocationResultFluent.this.withNamedResources(builder.build());
    }
    
    public N endNamedResources() {
      return and();
    }
    
  
  }

}