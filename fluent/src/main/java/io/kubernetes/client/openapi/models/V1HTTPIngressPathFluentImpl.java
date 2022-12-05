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
  public class V1HTTPIngressPathFluentImpl<A extends V1HTTPIngressPathFluent<A>> extends BaseFluent<A> implements V1HTTPIngressPathFluent<A>{
  public V1HTTPIngressPathFluentImpl() {
  }
  public V1HTTPIngressPathFluentImpl(V1HTTPIngressPath instance) {
    this.withBackend(instance.getBackend());

    this.withPath(instance.getPath());

    this.withPathType(instance.getPathType());

  }
  private V1IngressBackendBuilder backend;
  private String path;
  private String pathType;
  
  /**
   * This method has been deprecated, please use method buildBackend instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1IngressBackend getBackend() {
    return this.backend!=null ?this.backend.build():null;
  }
  public V1IngressBackend buildBackend() {
    return this.backend!=null ?this.backend.build():null;
  }
  public A withBackend(V1IngressBackend backend) {
    _visitables.get("backend").remove(this.backend);
    if (backend!=null){ this.backend= new V1IngressBackendBuilder(backend); _visitables.get("backend").add(this.backend);} else { this.backend = null; _visitables.get("backend").remove(this.backend); } return (A) this;
  }
  public Boolean hasBackend() {
    return this.backend != null;
  }
  public V1HTTPIngressPathFluent.BackendNested<A> withNewBackend() {
    return new V1HTTPIngressPathFluentImpl.BackendNestedImpl();
  }
  public V1HTTPIngressPathFluent.BackendNested<A> withNewBackendLike(V1IngressBackend item) {
    return new V1HTTPIngressPathFluentImpl.BackendNestedImpl(item);
  }
  public V1HTTPIngressPathFluent.BackendNested<A> editBackend() {
    return withNewBackendLike(getBackend());
  }
  public V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackend() {
    return withNewBackendLike(getBackend() != null ? getBackend(): new V1IngressBackendBuilder().build());
  }
  public V1HTTPIngressPathFluent.BackendNested<A> editOrNewBackendLike(V1IngressBackend item) {
    return withNewBackendLike(getBackend() != null ? getBackend(): item);
  }
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  public String getPathType() {
    return this.pathType;
  }
  public A withPathType(String pathType) {
    this.pathType=pathType; return (A) this;
  }
  public Boolean hasPathType() {
    return this.pathType != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HTTPIngressPathFluentImpl that = (V1HTTPIngressPathFluentImpl) o;
    if (backend != null ? !backend.equals(that.backend) :that.backend != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (pathType != null ? !pathType.equals(that.pathType) :that.pathType != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(backend,  path,  pathType,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (backend != null) { sb.append("backend:"); sb.append(backend + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (pathType != null) { sb.append("pathType:"); sb.append(pathType); }
    sb.append("}");
    return sb.toString();
  }
  class BackendNestedImpl<N> extends V1IngressBackendFluentImpl<V1HTTPIngressPathFluent.BackendNested<N>> implements V1HTTPIngressPathFluent.BackendNested<N>,Nested<N>{
    BackendNestedImpl(V1IngressBackend item) {
      this.builder = new V1IngressBackendBuilder(this, item);
    }
    BackendNestedImpl() {
      this.builder = new V1IngressBackendBuilder(this);
    }
    V1IngressBackendBuilder builder;
    public N and() {
      return (N) V1HTTPIngressPathFluentImpl.this.withBackend(builder.build());
    }
    public N endBackend() {
      return and();
    }
    
  }
  
}