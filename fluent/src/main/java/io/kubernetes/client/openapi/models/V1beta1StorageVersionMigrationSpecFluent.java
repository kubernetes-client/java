package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1StorageVersionMigrationSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1StorageVersionMigrationSpecFluent<A>> extends BaseFluent<A>{

  private V1GroupResourceBuilder resource;

  public V1beta1StorageVersionMigrationSpecFluent() {
  }
  
  public V1beta1StorageVersionMigrationSpecFluent(V1beta1StorageVersionMigrationSpec instance) {
    this.copyInstance(instance);
  }

  public V1GroupResource buildResource() {
    return this.resource != null ? this.resource.build() : null;
  }
  
  protected void copyInstance(V1beta1StorageVersionMigrationSpec instance) {
    instance = instance != null ? instance : new V1beta1StorageVersionMigrationSpec();
    if (instance != null) {
      this.withResource(instance.getResource());
    }
  }
  
  public ResourceNested<A> editOrNewResource() {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(new V1GroupResourceBuilder().build()));
  }
  
  public ResourceNested<A> editOrNewResourceLike(V1GroupResource item) {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(item));
  }
  
  public ResourceNested<A> editResource() {
    return this.withNewResourceLike(Optional.ofNullable(this.buildResource()).orElse(null));
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
    V1beta1StorageVersionMigrationSpecFluent that = (V1beta1StorageVersionMigrationSpecFluent) o;
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    return true;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public int hashCode() {
    return Objects.hash(resource);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public ResourceNested<A> withNewResource() {
    return new ResourceNested(null);
  }
  
  public ResourceNested<A> withNewResourceLike(V1GroupResource item) {
    return new ResourceNested(item);
  }
  
  public A withResource(V1GroupResource resource) {
    this._visitables.remove("resource");
    if (resource != null) {
        this.resource = new V1GroupResourceBuilder(resource);
        this._visitables.get("resource").add(this.resource);
    } else {
        this.resource = null;
        this._visitables.get("resource").remove(this.resource);
    }
    return (A) this;
  }
  public class ResourceNested<N> extends V1GroupResourceFluent<ResourceNested<N>> implements Nested<N>{
  
    V1GroupResourceBuilder builder;
  
    ResourceNested(V1GroupResource item) {
      this.builder = new V1GroupResourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1beta1StorageVersionMigrationSpecFluent.this.withResource(builder.build());
    }
    
    public N endResource() {
      return and();
    }
    
  }
}