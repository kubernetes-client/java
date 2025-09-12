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
public class V1alpha1StorageVersionMigrationSpecFluent<A extends io.kubernetes.client.openapi.models.V1alpha1StorageVersionMigrationSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1StorageVersionMigrationSpecFluent() {
  }
  
  public V1alpha1StorageVersionMigrationSpecFluent(V1alpha1StorageVersionMigrationSpec instance) {
    this.copyInstance(instance);
  }
  private String continueToken;
  private V1alpha1GroupVersionResourceBuilder resource;
  
  protected void copyInstance(V1alpha1StorageVersionMigrationSpec instance) {
    instance = instance != null ? instance : new V1alpha1StorageVersionMigrationSpec();
    if (instance != null) {
        this.withContinueToken(instance.getContinueToken());
        this.withResource(instance.getResource());
    }
  }
  
  public String getContinueToken() {
    return this.continueToken;
  }
  
  public A withContinueToken(String continueToken) {
    this.continueToken = continueToken;
    return (A) this;
  }
  
  public boolean hasContinueToken() {
    return this.continueToken != null;
  }
  
  public V1alpha1GroupVersionResource buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }
  
  public A withResource(V1alpha1GroupVersionResource resource) {
    this._visitables.remove("resource");
    if (resource != null) {
        this.resource = new V1alpha1GroupVersionResourceBuilder(resource);
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
  
  public ResourceNested<A> withNewResourceLike(V1alpha1GroupVersionResource item) {
    return new ResourceNested(item);
  }
  
  public ResourceNested<A> editResource() {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(null));
  }
  
  public ResourceNested<A> editOrNewResource() {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(new V1alpha1GroupVersionResourceBuilder().build()));
  }
  
  public ResourceNested<A> editOrNewResourceLike(V1alpha1GroupVersionResource item) {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(item));
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
    V1alpha1StorageVersionMigrationSpecFluent that = (V1alpha1StorageVersionMigrationSpecFluent) o;
    if (!(Objects.equals(continueToken, that.continueToken))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(continueToken, resource);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(continueToken == null)) {
        sb.append("continueToken:");
        sb.append(continueToken);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ResourceNested<N> extends V1alpha1GroupVersionResourceFluent<ResourceNested<N>> implements Nested<N>{
    ResourceNested(V1alpha1GroupVersionResource item) {
      this.builder = new V1alpha1GroupVersionResourceBuilder(this, item);
    }
    V1alpha1GroupVersionResourceBuilder builder;
    
    public N and() {
      return (N) V1alpha1StorageVersionMigrationSpecFluent.this.withResource(builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  
  }

}