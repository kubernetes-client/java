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
public class V1EvictionFluent<A extends V1EvictionFluent<A>> extends BaseFluent<A>{
  public V1EvictionFluent() {
  }
  
  public V1EvictionFluent(V1Eviction instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private V1DeleteOptionsBuilder deleteOptions;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  
  protected void copyInstance(V1Eviction instance) {
    instance = (instance != null ? instance : new V1Eviction());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withDeleteOptions(instance.getDeleteOptions());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
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
  
  public V1DeleteOptions buildDeleteOptions() {
    return this.deleteOptions != null ? this.deleteOptions.build() : null;
  }
  
  public A withDeleteOptions(V1DeleteOptions deleteOptions) {
    this._visitables.remove("deleteOptions");
    if (deleteOptions != null) {
        this.deleteOptions = new V1DeleteOptionsBuilder(deleteOptions);
        this._visitables.get("deleteOptions").add(this.deleteOptions);
    } else {
        this.deleteOptions = null;
        this._visitables.get("deleteOptions").remove(this.deleteOptions);
    }
    return (A) this;
  }
  
  public boolean hasDeleteOptions() {
    return this.deleteOptions != null;
  }
  
  public DeleteOptionsNested<A> withNewDeleteOptions() {
    return new DeleteOptionsNested(null);
  }
  
  public DeleteOptionsNested<A> withNewDeleteOptionsLike(V1DeleteOptions item) {
    return new DeleteOptionsNested(item);
  }
  
  public DeleteOptionsNested<A> editDeleteOptions() {
    return withNewDeleteOptionsLike(java.util.Optional.ofNullable(buildDeleteOptions()).orElse(null));
  }
  
  public DeleteOptionsNested<A> editOrNewDeleteOptions() {
    return withNewDeleteOptionsLike(java.util.Optional.ofNullable(buildDeleteOptions()).orElse(new V1DeleteOptionsBuilder().build()));
  }
  
  public DeleteOptionsNested<A> editOrNewDeleteOptionsLike(V1DeleteOptions item) {
    return withNewDeleteOptionsLike(java.util.Optional.ofNullable(buildDeleteOptions()).orElse(item));
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
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EvictionFluent that = (V1EvictionFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(deleteOptions, that.deleteOptions)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  deleteOptions,  kind,  metadata,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (deleteOptions != null) { sb.append("deleteOptions:"); sb.append(deleteOptions + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata); }
    sb.append("}");
    return sb.toString();
  }
  public class DeleteOptionsNested<N> extends V1DeleteOptionsFluent<DeleteOptionsNested<N>> implements Nested<N>{
    DeleteOptionsNested(V1DeleteOptions item) {
      this.builder = new V1DeleteOptionsBuilder(this, item);
    }
    V1DeleteOptionsBuilder builder;
    
    public N and() {
      return (N) V1EvictionFluent.this.withDeleteOptions(builder.build());
    }
    
    public N endDeleteOptions() {
      return and();
    }
    
  
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1EvictionFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }

}