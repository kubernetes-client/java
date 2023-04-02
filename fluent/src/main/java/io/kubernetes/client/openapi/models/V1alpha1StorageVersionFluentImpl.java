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
  public class V1alpha1StorageVersionFluentImpl<A extends V1alpha1StorageVersionFluent<A>> extends BaseFluent<A> implements V1alpha1StorageVersionFluent<A>{
  public V1alpha1StorageVersionFluentImpl() {
  }
  public V1alpha1StorageVersionFluentImpl(V1alpha1StorageVersion instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private Object spec;
  private V1alpha1StorageVersionStatusBuilder status;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
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
  public V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadata() {
    return new V1alpha1StorageVersionFluentImpl.MetadataNestedImpl();
  }
  public V1alpha1StorageVersionFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha1StorageVersionFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha1StorageVersionFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha1StorageVersionFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public Object getSpec() {
    return this.spec;
  }
  public A withSpec(Object spec) {
    this.spec=spec; return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1StorageVersionStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1alpha1StorageVersionStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1alpha1StorageVersionStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1alpha1StorageVersionStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1alpha1StorageVersionFluent.StatusNested<A> withNewStatus() {
    return new V1alpha1StorageVersionFluentImpl.StatusNestedImpl();
  }
  public V1alpha1StorageVersionFluent.StatusNested<A> withNewStatusLike(V1alpha1StorageVersionStatus item) {
    return new V1alpha1StorageVersionFluentImpl.StatusNestedImpl(item);
  }
  public V1alpha1StorageVersionFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1alpha1StorageVersionStatusBuilder().build());
  }
  public V1alpha1StorageVersionFluent.StatusNested<A> editOrNewStatusLike(V1alpha1StorageVersionStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1StorageVersionFluentImpl that = (V1alpha1StorageVersionFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (spec != null ? !spec.equals(that.spec) :that.spec != null) return false;
    if (status != null ? !status.equals(that.status) :that.status != null) return false;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha1StorageVersionFluent.MetadataNested<N>> implements V1alpha1StorageVersionFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha1StorageVersionFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1alpha1StorageVersionStatusFluentImpl<V1alpha1StorageVersionFluent.StatusNested<N>> implements V1alpha1StorageVersionFluent.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1alpha1StorageVersionStatus item) {
      this.builder = new V1alpha1StorageVersionStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1alpha1StorageVersionStatusBuilder(this);
    }
    V1alpha1StorageVersionStatusBuilder builder;
    public N and() {
      return (N) V1alpha1StorageVersionFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}