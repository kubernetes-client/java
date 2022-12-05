package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1SelfSubjectAccessReviewFluentImpl<A extends V1SelfSubjectAccessReviewFluent<A>> extends BaseFluent<A> implements V1SelfSubjectAccessReviewFluent<A>{
  public V1SelfSubjectAccessReviewFluentImpl() {
  }
  public V1SelfSubjectAccessReviewFluentImpl(V1SelfSubjectAccessReview instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1SelfSubjectAccessReviewSpecBuilder spec;
  private V1SubjectAccessReviewStatusBuilder status;
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
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> withNewMetadata() {
    return new V1SelfSubjectAccessReviewFluentImpl.MetadataNestedImpl();
  }
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1SelfSubjectAccessReviewFluentImpl.MetadataNestedImpl(item);
  }
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1SelfSubjectAccessReviewFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SelfSubjectAccessReviewSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1SelfSubjectAccessReviewSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1SelfSubjectAccessReviewSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1SelfSubjectAccessReviewSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> withNewSpec() {
    return new V1SelfSubjectAccessReviewFluentImpl.SpecNestedImpl();
  }
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> withNewSpecLike(V1SelfSubjectAccessReviewSpec item) {
    return new V1SelfSubjectAccessReviewFluentImpl.SpecNestedImpl(item);
  }
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1SelfSubjectAccessReviewSpecBuilder().build());
  }
  public V1SelfSubjectAccessReviewFluent.SpecNested<A> editOrNewSpecLike(V1SelfSubjectAccessReviewSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SubjectAccessReviewStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1SubjectAccessReviewStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1SubjectAccessReviewStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1SubjectAccessReviewStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> withNewStatus() {
    return new V1SelfSubjectAccessReviewFluentImpl.StatusNestedImpl();
  }
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> withNewStatusLike(V1SubjectAccessReviewStatus item) {
    return new V1SelfSubjectAccessReviewFluentImpl.StatusNestedImpl(item);
  }
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1SubjectAccessReviewStatusBuilder().build());
  }
  public V1SelfSubjectAccessReviewFluent.StatusNested<A> editOrNewStatusLike(V1SubjectAccessReviewStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1SelfSubjectAccessReviewFluentImpl that = (V1SelfSubjectAccessReviewFluentImpl) o;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1SelfSubjectAccessReviewFluent.MetadataNested<N>> implements V1SelfSubjectAccessReviewFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1SelfSubjectAccessReviewSpecFluentImpl<V1SelfSubjectAccessReviewFluent.SpecNested<N>> implements V1SelfSubjectAccessReviewFluent.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1SelfSubjectAccessReviewSpec item) {
      this.builder = new V1SelfSubjectAccessReviewSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1SelfSubjectAccessReviewSpecBuilder(this);
    }
    V1SelfSubjectAccessReviewSpecBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1SubjectAccessReviewStatusFluentImpl<V1SelfSubjectAccessReviewFluent.StatusNested<N>> implements V1SelfSubjectAccessReviewFluent.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1SubjectAccessReviewStatus item) {
      this.builder = new V1SubjectAccessReviewStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1SubjectAccessReviewStatusBuilder(this);
    }
    V1SubjectAccessReviewStatusBuilder builder;
    public N and() {
      return (N) V1SelfSubjectAccessReviewFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}