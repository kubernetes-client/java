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
public class V1alpha1StorageVersionFluent<A extends V1alpha1StorageVersionFluent<A>> extends BaseFluent<A>{
  public V1alpha1StorageVersionFluent() {
  }
  
  public V1alpha1StorageVersionFluent(V1alpha1StorageVersion instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Object spec;
  private V1alpha1StorageVersionStatusBuilder status;
  
  protected void copyInstance(V1alpha1StorageVersion instance) {
    instance = (instance != null ? instance : new V1alpha1StorageVersion());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withSpec(instance.getSpec());
          this.withStatus(instance.getStatus());
        }
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public A withMetadata(V1ObjectMeta metadata) {
    this._visitables.remove("metadata");
    if (metadata != null) {
        this.metadata = new V1ObjectMetaBuilder(metadata);
        this._visitables.get("metadata").add(this.metadata);
    } else {
        this.metadata = null;
        this._visitables.get("metadata").remove(this.metadata);
    }
    return (A) this;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public MetadataNested<A> editMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public Object getSpec() {
    return this.spec;
  }
  
  public A withSpec(Object spec) {
    this.spec = spec;
    return (A) this;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public V1alpha1StorageVersionStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }
  
  public A withStatus(V1alpha1StorageVersionStatus status) {
    this._visitables.remove("status");
    if (status != null) {
        this.status = new V1alpha1StorageVersionStatusBuilder(status);
        this._visitables.get("status").add(this.status);
    } else {
        this.status = null;
        this._visitables.get("status").remove(this.status);
    }
    return (A) this;
  }
  
  public boolean hasStatus() {
    return this.status != null;
  }
  
  public StatusNested<A> withNewStatus() {
    return new StatusNested(null);
  }
  
  public StatusNested<A> withNewStatusLike(V1alpha1StorageVersionStatus item) {
    return new StatusNested(item);
  }
  
  public StatusNested<A> editStatus() {
    return withNewStatusLike(java.util.Optional.ofNullable(buildStatus()).orElse(null));
  }
  
  public StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(java.util.Optional.ofNullable(buildStatus()).orElse(new V1alpha1StorageVersionStatusBuilder().build()));
  }
  
  public StatusNested<A> editOrNewStatusLike(V1alpha1StorageVersionStatus item) {
    return withNewStatusLike(java.util.Optional.ofNullable(buildStatus()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1StorageVersionFluent that = (V1alpha1StorageVersionFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(spec, that.spec)) return false;
    if (!java.util.Objects.equals(status, that.status)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  status,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1alpha1StorageVersionFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class StatusNested<N> extends V1alpha1StorageVersionStatusFluent<StatusNested<N>> implements Nested<N>{
    StatusNested(V1alpha1StorageVersionStatus item) {
      this.builder = new V1alpha1StorageVersionStatusBuilder(this, item);
    }
    V1alpha1StorageVersionStatusBuilder builder;
    
    public N and() {
      return (N) V1alpha1StorageVersionFluent.this.withStatus(builder.build());
    }
    
    public N endStatus() {
      return and();
    }
    
  
  }

}