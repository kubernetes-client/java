package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ControllerRevisionFluentImpl<A extends V1ControllerRevisionFluent<A>> extends BaseFluent<A> implements V1ControllerRevisionFluent<A>{
  public V1ControllerRevisionFluentImpl() {
  }
  public V1ControllerRevisionFluentImpl(V1ControllerRevision instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withData(instance.getData());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRevision(instance.getRevision());

  }
  private String apiVersion;
  private Object data;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Long revision;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public Object getData() {
    return this.data;
  }
  public A withData(Object data) {
    this.data=data; return (A) this;
  }
  public Boolean hasData() {
    return this.data != null;
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
  public V1ControllerRevisionFluent.MetadataNested<A> withNewMetadata() {
    return new V1ControllerRevisionFluentImpl.MetadataNestedImpl();
  }
  public V1ControllerRevisionFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1ControllerRevisionFluentImpl.MetadataNestedImpl(item);
  }
  public V1ControllerRevisionFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1ControllerRevisionFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1ControllerRevisionFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public Long getRevision() {
    return this.revision;
  }
  public A withRevision(Long revision) {
    this.revision=revision; return (A) this;
  }
  public Boolean hasRevision() {
    return this.revision != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ControllerRevisionFluentImpl that = (V1ControllerRevisionFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (data != null ? !data.equals(that.data) :that.data != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (revision != null ? !revision.equals(that.revision) :that.revision != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  data,  kind,  metadata,  revision,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (data != null) { sb.append("data:"); sb.append(data + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (revision != null) { sb.append("revision:"); sb.append(revision); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ControllerRevisionFluent.MetadataNested<N>> implements V1ControllerRevisionFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1ControllerRevisionFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}