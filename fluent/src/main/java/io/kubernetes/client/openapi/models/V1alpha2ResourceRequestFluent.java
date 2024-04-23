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
public class V1alpha2ResourceRequestFluent<A extends V1alpha2ResourceRequestFluent<A>> extends BaseFluent<A>{
  public V1alpha2ResourceRequestFluent() {
  }
  
  public V1alpha2ResourceRequestFluent(V1alpha2ResourceRequest instance) {
    this.copyInstance(instance);
  }
  private V1alpha2NamedResourcesRequestBuilder namedResources;
  private Object vendorParameters;
  
  protected void copyInstance(V1alpha2ResourceRequest instance) {
    instance = (instance != null ? instance : new V1alpha2ResourceRequest());
    if (instance != null) {
          this.withNamedResources(instance.getNamedResources());
          this.withVendorParameters(instance.getVendorParameters());
        }
  }
  
  public V1alpha2NamedResourcesRequest buildNamedResources() {
    return this.namedResources != null ? this.namedResources.build() : null;
  }
  
  public A withNamedResources(V1alpha2NamedResourcesRequest namedResources) {
    this._visitables.remove("namedResources");
    if (namedResources != null) {
        this.namedResources = new V1alpha2NamedResourcesRequestBuilder(namedResources);
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
  
  public NamedResourcesNested<A> withNewNamedResourcesLike(V1alpha2NamedResourcesRequest item) {
    return new NamedResourcesNested(item);
  }
  
  public NamedResourcesNested<A> editNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(null));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResources() {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(new V1alpha2NamedResourcesRequestBuilder().build()));
  }
  
  public NamedResourcesNested<A> editOrNewNamedResourcesLike(V1alpha2NamedResourcesRequest item) {
    return withNewNamedResourcesLike(java.util.Optional.ofNullable(buildNamedResources()).orElse(item));
  }
  
  public Object getVendorParameters() {
    return this.vendorParameters;
  }
  
  public A withVendorParameters(Object vendorParameters) {
    this.vendorParameters = vendorParameters;
    return (A) this;
  }
  
  public boolean hasVendorParameters() {
    return this.vendorParameters != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceRequestFluent that = (V1alpha2ResourceRequestFluent) o;
    if (!java.util.Objects.equals(namedResources, that.namedResources)) return false;
    if (!java.util.Objects.equals(vendorParameters, that.vendorParameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(namedResources,  vendorParameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (namedResources != null) { sb.append("namedResources:"); sb.append(namedResources + ","); }
    if (vendorParameters != null) { sb.append("vendorParameters:"); sb.append(vendorParameters); }
    sb.append("}");
    return sb.toString();
  }
  public class NamedResourcesNested<N> extends V1alpha2NamedResourcesRequestFluent<NamedResourcesNested<N>> implements Nested<N>{
    NamedResourcesNested(V1alpha2NamedResourcesRequest item) {
      this.builder = new V1alpha2NamedResourcesRequestBuilder(this, item);
    }
    V1alpha2NamedResourcesRequestBuilder builder;
    
    public N and() {
      return (N) V1alpha2ResourceRequestFluent.this.withNamedResources(builder.build());
    }
    
    public N endNamedResources() {
      return and();
    }
    
  
  }

}