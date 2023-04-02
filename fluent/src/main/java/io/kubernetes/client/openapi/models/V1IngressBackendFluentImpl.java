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
  public class V1IngressBackendFluentImpl<A extends V1IngressBackendFluent<A>> extends BaseFluent<A> implements V1IngressBackendFluent<A>{
  public V1IngressBackendFluentImpl() {
  }
  public V1IngressBackendFluentImpl(V1IngressBackend instance) {
    this.withResource(instance.getResource());

    this.withService(instance.getService());

  }
  private V1TypedLocalObjectReferenceBuilder resource;
  private V1IngressServiceBackendBuilder service;
  
  /**
   * This method has been deprecated, please use method buildResource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TypedLocalObjectReference getResource() {
    return this.resource!=null ?this.resource.build():null;
  }
  public V1TypedLocalObjectReference buildResource() {
    return this.resource!=null ?this.resource.build():null;
  }
  public A withResource(V1TypedLocalObjectReference resource) {
    _visitables.get("resource").remove(this.resource);
    if (resource!=null){ this.resource= new V1TypedLocalObjectReferenceBuilder(resource); _visitables.get("resource").add(this.resource);} else { this.resource = null; _visitables.get("resource").remove(this.resource); } return (A) this;
  }
  public Boolean hasResource() {
    return this.resource != null;
  }
  public V1IngressBackendFluent.ResourceNested<A> withNewResource() {
    return new V1IngressBackendFluentImpl.ResourceNestedImpl();
  }
  public V1IngressBackendFluent.ResourceNested<A> withNewResourceLike(V1TypedLocalObjectReference item) {
    return new V1IngressBackendFluentImpl.ResourceNestedImpl(item);
  }
  public V1IngressBackendFluent.ResourceNested<A> editResource() {
    return withNewResourceLike(getResource());
  }
  public V1IngressBackendFluent.ResourceNested<A> editOrNewResource() {
    return withNewResourceLike(getResource() != null ? getResource(): new V1TypedLocalObjectReferenceBuilder().build());
  }
  public V1IngressBackendFluent.ResourceNested<A> editOrNewResourceLike(V1TypedLocalObjectReference item) {
    return withNewResourceLike(getResource() != null ? getResource(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildService instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressServiceBackend getService() {
    return this.service!=null ?this.service.build():null;
  }
  public V1IngressServiceBackend buildService() {
    return this.service!=null ?this.service.build():null;
  }
  public A withService(V1IngressServiceBackend service) {
    _visitables.get("service").remove(this.service);
    if (service!=null){ this.service= new V1IngressServiceBackendBuilder(service); _visitables.get("service").add(this.service);} else { this.service = null; _visitables.get("service").remove(this.service); } return (A) this;
  }
  public Boolean hasService() {
    return this.service != null;
  }
  public V1IngressBackendFluent.ServiceNested<A> withNewService() {
    return new V1IngressBackendFluentImpl.ServiceNestedImpl();
  }
  public V1IngressBackendFluent.ServiceNested<A> withNewServiceLike(V1IngressServiceBackend item) {
    return new V1IngressBackendFluentImpl.ServiceNestedImpl(item);
  }
  public V1IngressBackendFluent.ServiceNested<A> editService() {
    return withNewServiceLike(getService());
  }
  public V1IngressBackendFluent.ServiceNested<A> editOrNewService() {
    return withNewServiceLike(getService() != null ? getService(): new V1IngressServiceBackendBuilder().build());
  }
  public V1IngressBackendFluent.ServiceNested<A> editOrNewServiceLike(V1IngressServiceBackend item) {
    return withNewServiceLike(getService() != null ? getService(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressBackendFluentImpl that = (V1IngressBackendFluentImpl) o;
    if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
    if (service != null ? !service.equals(that.service) :that.service != null) return false;
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
  class ResourceNestedImpl<N> extends V1TypedLocalObjectReferenceFluentImpl<V1IngressBackendFluent.ResourceNested<N>> implements V1IngressBackendFluent.ResourceNested<N>,Nested<N>{
    ResourceNestedImpl(V1TypedLocalObjectReference item) {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this, item);
    }
    ResourceNestedImpl() {
      this.builder = new V1TypedLocalObjectReferenceBuilder(this);
    }
    V1TypedLocalObjectReferenceBuilder builder;
    public N and() {
      return (N) V1IngressBackendFluentImpl.this.withResource(builder.build());
    }
    public N endResource() {
      return and();
    }
    
  }
  class ServiceNestedImpl<N> extends V1IngressServiceBackendFluentImpl<V1IngressBackendFluent.ServiceNested<N>> implements V1IngressBackendFluent.ServiceNested<N>,Nested<N>{
    ServiceNestedImpl(V1IngressServiceBackend item) {
      this.builder = new V1IngressServiceBackendBuilder(this, item);
    }
    ServiceNestedImpl() {
      this.builder = new V1IngressServiceBackendBuilder(this);
    }
    V1IngressServiceBackendBuilder builder;
    public N and() {
      return (N) V1IngressBackendFluentImpl.this.withService(builder.build());
    }
    public N endService() {
      return and();
    }
    
  }
  
}