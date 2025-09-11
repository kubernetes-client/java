package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.util.Optional;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1HTTPIngressPathFluent<A extends io.kubernetes.client.openapi.models.V1HTTPIngressPathFluent<A>> extends BaseFluent<A>{
  public V1HTTPIngressPathFluent() {
  }
  
  public V1HTTPIngressPathFluent(V1HTTPIngressPath instance) {
    this.copyInstance(instance);
  }
  private V1IngressBackendBuilder backend;
  private String path;
  private String pathType;
  
  protected void copyInstance(V1HTTPIngressPath instance) {
    instance = instance != null ? instance : new V1HTTPIngressPath();
    if (instance != null) {
        this.withBackend(instance.getBackend());
        this.withPath(instance.getPath());
        this.withPathType(instance.getPathType());
    }
  }
  
  public V1IngressBackend buildBackend() {
    return this.backend != null ? this.backend.build() : null;
  }
  
  public A withBackend(V1IngressBackend backend) {
    this._visitables.remove("backend");
    if (backend != null) {
        this.backend = new V1IngressBackendBuilder(backend);
        this._visitables.get("backend").add(this.backend);
    } else {
        this.backend = null;
        this._visitables.get("backend").remove(this.backend);
    }
    return (A) this;
  }
  
  public boolean hasBackend() {
    return this.backend != null;
  }
  
  public BackendNested<A> withNewBackend() {
    return new BackendNested(null);
  }
  
  public BackendNested<A> withNewBackendLike(V1IngressBackend item) {
    return new BackendNested(item);
  }
  
  public BackendNested<A> editBackend() {
    return this.withNewBackendLike(Optional.ofNullable(this.buildBackend()).orElse(null));
  }
  
  public BackendNested<A> editOrNewBackend() {
    return this.withNewBackendLike(Optional.ofNullable(this.buildBackend()).orElse(new V1IngressBackendBuilder().build()));
  }
  
  public BackendNested<A> editOrNewBackendLike(V1IngressBackend item) {
    return this.withNewBackendLike(Optional.ofNullable(this.buildBackend()).orElse(item));
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public String getPathType() {
    return this.pathType;
  }
  
  public A withPathType(String pathType) {
    this.pathType = pathType;
    return (A) this;
  }
  
  public boolean hasPathType() {
    return this.pathType != null;
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
    V1HTTPIngressPathFluent that = (V1HTTPIngressPathFluent) o;
    if (!(Objects.equals(backend, that.backend))) {
      return false;
    }
    if (!(Objects.equals(path, that.path))) {
      return false;
    }
    if (!(Objects.equals(pathType, that.pathType))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(backend, path, pathType);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(backend == null)) {
        sb.append("backend:");
        sb.append(backend);
        sb.append(",");
    }
    if (!(path == null)) {
        sb.append("path:");
        sb.append(path);
        sb.append(",");
    }
    if (!(pathType == null)) {
        sb.append("pathType:");
        sb.append(pathType);
    }
    sb.append("}");
    return sb.toString();
  }
  public class BackendNested<N> extends V1IngressBackendFluent<BackendNested<N>> implements Nested<N>{
    BackendNested(V1IngressBackend item) {
      this.builder = new V1IngressBackendBuilder(this, item);
    }
    V1IngressBackendBuilder builder;
    
    public N and() {
      return (N) V1HTTPIngressPathFluent.this.withBackend(builder.build());
    }
    
    public N endBackend() {
      return and();
    }
    
  
  }

}