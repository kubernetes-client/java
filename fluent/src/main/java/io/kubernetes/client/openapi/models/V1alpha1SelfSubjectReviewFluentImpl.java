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
  public class V1alpha1SelfSubjectReviewFluentImpl<A extends V1alpha1SelfSubjectReviewFluent<A>> extends BaseFluent<A> implements V1alpha1SelfSubjectReviewFluent<A>{
  public V1alpha1SelfSubjectReviewFluentImpl() {
  }
  public V1alpha1SelfSubjectReviewFluentImpl(V1alpha1SelfSubjectReview instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withStatus(instance.getStatus());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha1SelfSubjectReviewStatusBuilder status;
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
  public V1alpha1SelfSubjectReviewFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1alpha1SelfSubjectReviewFluentImpl.MetadataNestedImpl();
  }
  public V1alpha1SelfSubjectReviewFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha1SelfSubjectReviewFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha1SelfSubjectReviewFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha1SelfSubjectReviewFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha1SelfSubjectReviewFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1SelfSubjectReviewStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1alpha1SelfSubjectReviewStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1alpha1SelfSubjectReviewStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1alpha1SelfSubjectReviewStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1alpha1SelfSubjectReviewFluentImpl.StatusNested<A> withNewStatus() {
    return new V1alpha1SelfSubjectReviewFluentImpl.StatusNestedImpl();
  }
  public V1alpha1SelfSubjectReviewFluentImpl.StatusNested<A> withNewStatusLike(V1alpha1SelfSubjectReviewStatus item) {
    return new V1alpha1SelfSubjectReviewFluentImpl.StatusNestedImpl(item);
  }
  public V1alpha1SelfSubjectReviewFluentImpl.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1alpha1SelfSubjectReviewFluentImpl.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1alpha1SelfSubjectReviewStatusBuilder().build());
  }
  public V1alpha1SelfSubjectReviewFluentImpl.StatusNested<A> editOrNewStatusLike(V1alpha1SelfSubjectReviewStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1SelfSubjectReviewFluentImpl that = (V1alpha1SelfSubjectReviewFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(status, that.status)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  status,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (status != null) { sb.append("status:"); sb.append(status); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha1SelfSubjectReviewFluentImpl.MetadataNested<N>> implements V1alpha1SelfSubjectReviewFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha1SelfSubjectReviewFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1alpha1SelfSubjectReviewStatusFluentImpl<V1alpha1SelfSubjectReviewFluentImpl.StatusNested<N>> implements V1alpha1SelfSubjectReviewFluentImpl.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1alpha1SelfSubjectReviewStatus item) {
      this.builder = new V1alpha1SelfSubjectReviewStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1alpha1SelfSubjectReviewStatusBuilder(this);
    }
    V1alpha1SelfSubjectReviewStatusBuilder builder;
    public N and() {
      return (N) V1alpha1SelfSubjectReviewFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}