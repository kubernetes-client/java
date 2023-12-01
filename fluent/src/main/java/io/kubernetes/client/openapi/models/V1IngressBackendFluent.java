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
public class V1IngressBackendFluent<A extends V1IngressBackendFluent<A>> extends BaseFluent<A>{
  public V1IngressBackendFluent() {
  }
  
  public V1IngressBackendFluent(V1IngressBackend instance) {
    this.copyInstance(instance);
  }
  private V1TypedLocalObjectReferenceBuilder resource;
  private V1IngressServiceBackendBuilder service;
  
  protected void copyInstance(V1IngressBackend instance) {
    instance = (instance != null ? instance : new V1IngressBackend());
    if (instance != null) {
          this.withResource(instance.getResource());
          this.withService(instance.getService());
        }
  }
  
  public V1TypedLocalObjectReference buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }
  
  public A withResource(V1TypedLocalObjectReference resource) {
    this._visitables.remove("resource");
    if (resource != null) {
        this.resource = new V1TypedLocalObjectReferenceBuilder(resource);
        this._visitables.get("resource").add(this.resource);
    } else {
        this.resource = null;
        this._visitables.get("resource").remove(this.resource);
    }
    return (A) this;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public ResourceNested<A> withNewResource() {
    return new ResourceNested(null);
  }
  
  public ResourceNested<A> withNewResourceLike(V1TypedLocalObjectReference item) {
    return new ResourceNested(item);
  }
  
  public ResourceNested<A> editResource() {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(null));
  }
  
  public ResourceNested<A> editOrNewResource() {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(new V1TypedLocalObjectReferenceBuilder().build()));
  }
  
  public ResourceNested<A> editOrNewResourceLike(V1TypedLocalObjectReference item) {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(item));
  }
  
  public V1IngressServiceBackend buildService() {
    return this.service != null ? this.service.build() : null;
  }
  
  public A withService(V1IngressServiceBackend service) {
    this._visitables.remove("service");
    if (service != null) {
        this.service = new V1IngressServiceBackendBuilder(service);
        this._visitables.get("service").add(this.service);
    } else {
        this.service = null;
        this._visitables.get("service").remove(this.service);
    }
    return (A) this;
  }
  
  public boolean hasService() {
    return this.service != null;
  }
  
  public ServiceNested<A> withNewService() {
    return new ServiceNested(null);
  }
  
  public ServiceNested<A> withNewServiceLike(V1IngressServiceBackend item) {
    return new ServiceNested(item);
  }
  
  public ServiceNested<A> editService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(null));
  }
  
  public ServiceNested<A> editOrNewService() {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(new V1IngressServiceBackendBuilder().build()));
  }
  
  public ServiceNested<A> editOrNewServiceLike(V1IngressServiceBackend item) {
    return withNewServiceLike(java.util.Optional.ofNullable(buildService()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressBackendFluent that = (V1IngressBackendFluent) o;
    if (!java.util.Objects.equals(resource, that.resource)) return false;
    if (!java.util.Objects.equals(service, that.service)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(resource,  service,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (resource != null) { sb.append("resource:"); sb.append(resource + ","); }
    if (service != null) { sb.append("service:"); sb.append(service); }
    sb.append("}");
    return sb.toString();
  }
  public class ResourceNested<N> extends V1TypedLocalObjectReferenceFluent<ResourceNested<N>> implements Nested<N>{
    ResourceNested(V1TypedLocalObjectReference item) {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this, item);
    }
    V1TypedLocalObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1IngressBackendFluent.this.withResource(builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  
  }
  public class ServiceNested<N> extends V1IngressServiceBackendFluent<ServiceNested<N>> implements Nested<N>{
    ServiceNested(V1IngressServiceBackend item) {
      this.builder = new V1IngressServiceBackendBuilder(this, item);
    }
    V1IngressServiceBackendBuilder builder;
    
    public N and() {
      return (N) V1IngressBackendFluent.this.withService(builder.build());
    }
    
    public N endService() {
      return and();
    }
    
  
  }

}