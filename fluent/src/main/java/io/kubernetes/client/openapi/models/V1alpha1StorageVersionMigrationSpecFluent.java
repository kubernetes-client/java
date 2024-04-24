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
public class V1alpha1StorageVersionMigrationSpecFluent<A extends V1alpha1StorageVersionMigrationSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1StorageVersionMigrationSpecFluent() {
  }
  
  public V1alpha1StorageVersionMigrationSpecFluent(V1alpha1StorageVersionMigrationSpec instance) {
    this.copyInstance(instance);
  }
  private String continueToken;
  private V1alpha1GroupVersionResourceBuilder resource;
  
  protected void copyInstance(V1alpha1StorageVersionMigrationSpec instance) {
    instance = (instance != null ? instance : new V1alpha1StorageVersionMigrationSpec());
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
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(null));
  }
  
  public ResourceNested<A> editOrNewResource() {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(new V1alpha1GroupVersionResourceBuilder().build()));
  }
  
  public ResourceNested<A> editOrNewResourceLike(V1alpha1GroupVersionResource item) {
    return withNewResourceLike(java.util.Optional.ofNullable(buildResource()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1StorageVersionMigrationSpecFluent that = (V1alpha1StorageVersionMigrationSpecFluent) o;
    if (!java.util.Objects.equals(continueToken, that.continueToken)) return false;
    if (!java.util.Objects.equals(resource, that.resource)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(continueToken,  resource,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (continueToken != null) { sb.append("continueToken:"); sb.append(continueToken + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource); }
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