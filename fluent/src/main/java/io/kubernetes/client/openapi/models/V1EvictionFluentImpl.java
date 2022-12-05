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
  public class V1EvictionFluentImpl<A extends V1EvictionFluent<A>> extends BaseFluent<A> implements V1EvictionFluent<A>{
  public V1EvictionFluentImpl() {
  }
  public V1EvictionFluentImpl(V1Eviction instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withDeleteOptions(instance.getDeleteOptions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

  }
  private String apiVersion;
  private V1DeleteOptionsBuilder deleteOptions;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  /**
   * This method has been deprecated, please use method buildDeleteOptions instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DeleteOptions getDeleteOptions() {
    return this.deleteOptions!=null ?this.deleteOptions.build():null;
  }
  public V1DeleteOptions buildDeleteOptions() {
    return this.deleteOptions!=null ?this.deleteOptions.build():null;
  }
  public A withDeleteOptions(V1DeleteOptions deleteOptions) {
    _visitables.get("deleteOptions").remove(this.deleteOptions);
    if (deleteOptions!=null){ this.deleteOptions= new V1DeleteOptionsBuilder(deleteOptions); _visitables.get("deleteOptions").add(this.deleteOptions);} else { this.deleteOptions = null; _visitables.get("deleteOptions").remove(this.deleteOptions); } return (A) this;
  }
  public Boolean hasDeleteOptions() {
    return this.deleteOptions != null;
  }
  public V1EvictionFluent.DeleteOptionsNested<A> withNewDeleteOptions() {
    return new V1EvictionFluentImpl.DeleteOptionsNestedImpl();
  }
  public V1EvictionFluent.DeleteOptionsNested<A> withNewDeleteOptionsLike(V1DeleteOptions item) {
    return new V1EvictionFluentImpl.DeleteOptionsNestedImpl(item);
  }
  public V1EvictionFluent.DeleteOptionsNested<A> editDeleteOptions() {
    return withNewDeleteOptionsLike(getDeleteOptions());
  }
  public V1EvictionFluent.DeleteOptionsNested<A> editOrNewDeleteOptions() {
    return withNewDeleteOptionsLike(getDeleteOptions() != null ? getDeleteOptions(): new V1DeleteOptionsBuilder().build());
  }
  public V1EvictionFluent.DeleteOptionsNested<A> editOrNewDeleteOptionsLike(V1DeleteOptions item) {
    return withNewDeleteOptionsLike(getDeleteOptions() != null ? getDeleteOptions(): item);
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1EvictionFluent.MetadataNested<A> withNewMetadata() {
    return new V1EvictionFluentImpl.MetadataNestedImpl();
  }
  public V1EvictionFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1EvictionFluentImpl.MetadataNestedImpl(item);
  }
  public V1EvictionFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1EvictionFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1EvictionFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EvictionFluentImpl that = (V1EvictionFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (deleteOptions != null ? !deleteOptions.equals(that.deleteOptions) :that.deleteOptions != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
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
  class DeleteOptionsNestedImpl<N> extends V1DeleteOptionsFluentImpl<V1EvictionFluent.DeleteOptionsNested<N>> implements V1EvictionFluent.DeleteOptionsNested<N>,Nested<N>{
    DeleteOptionsNestedImpl(V1DeleteOptions item) {
      this.builder = new V1DeleteOptionsBuilder(this, item);
    }
    DeleteOptionsNestedImpl() {
      this.builder = new V1DeleteOptionsBuilder(this);
    }
    V1DeleteOptionsBuilder builder;
    public N and() {
      return (N) V1EvictionFluentImpl.this.withDeleteOptions(builder.build());
    }
    public N endDeleteOptions() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1EvictionFluent.MetadataNested<N>> implements V1EvictionFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1EvictionFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}