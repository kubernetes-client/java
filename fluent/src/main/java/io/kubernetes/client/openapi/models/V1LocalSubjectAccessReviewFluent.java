package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Optional;
import java.util.Objects;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LocalSubjectAccessReviewFluent<A extends io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewFluent<A>> extends BaseFluent<A>{
  public V1LocalSubjectAccessReviewFluent() {
  }
  
  public V1LocalSubjectAccessReviewFluent(V1LocalSubjectAccessReview instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1SubjectAccessReviewSpecBuilder spec;
  private V1SubjectAccessReviewStatusBuilder status;
  
  protected void copyInstance(V1LocalSubjectAccessReview instance) {
    instance = instance != null ? instance : new V1LocalSubjectAccessReview();
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
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return this.withNewMetadataLike(Optional.ofNullable(this.buildMetadata()).orElse(item));
  }
  
  public V1SubjectAccessReviewSpec buildSpec() {
    return this.spec != null ? this.spec.build() : null;
  }
  
  public A withSpec(V1SubjectAccessReviewSpec spec) {
    this._visitables.remove("spec");
    if (spec != null) {
        this.spec = new V1SubjectAccessReviewSpecBuilder(spec);
        this._visitables.get("spec").add(this.spec);
    } else {
        this.spec = null;
        this._visitables.get("spec").remove(this.spec);
    }
    return (A) this;
  }
  
  public boolean hasSpec() {
    return this.spec != null;
  }
  
  public SpecNested<A> withNewSpec() {
    return new SpecNested(null);
  }
  
  public SpecNested<A> withNewSpecLike(V1SubjectAccessReviewSpec item) {
    return new SpecNested(item);
  }
  
  public SpecNested<A> editSpec() {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(null));
  }
  
  public SpecNested<A> editOrNewSpec() {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(new V1SubjectAccessReviewSpecBuilder().build()));
  }
  
  public SpecNested<A> editOrNewSpecLike(V1SubjectAccessReviewSpec item) {
    return this.withNewSpecLike(Optional.ofNullable(this.buildSpec()).orElse(item));
  }
  
  public V1SubjectAccessReviewStatus buildStatus() {
    return this.status != null ? this.status.build() : null;
  }
  
  public A withStatus(V1SubjectAccessReviewStatus status) {
    this._visitables.remove("status");
    if (status != null) {
        this.status = new V1SubjectAccessReviewStatusBuilder(status);
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
  
  public StatusNested<A> withNewStatusLike(V1SubjectAccessReviewStatus item) {
    return new StatusNested(item);
  }
  
  public StatusNested<A> editStatus() {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(null));
  }
  
  public StatusNested<A> editOrNewStatus() {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(new V1SubjectAccessReviewStatusBuilder().build()));
  }
  
  public StatusNested<A> editOrNewStatusLike(V1SubjectAccessReviewStatus item) {
    return this.withNewStatusLike(Optional.ofNullable(this.buildStatus()).orElse(item));
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
    V1LocalSubjectAccessReviewFluent that = (V1LocalSubjectAccessReviewFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(spec, that.spec))) {
      return false;
    }
    if (!(Objects.equals(status, that.status))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(kind == null)) {
        sb.append("kind:");
        sb.append(kind);
        sb.append(",");
    }
    if (!(metadata == null)) {
        sb.append("metadata:");
        sb.append(metadata);
        sb.append(",");
    }
    if (!(spec == null)) {
        sb.append("spec:");
        sb.append(spec);
        sb.append(",");
    }
    if (!(status == null)) {
        sb.append("status:");
        sb.append(status);
    }
    sb.append("}");
    return sb.toString();
  }
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1LocalSubjectAccessReviewFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class SpecNested<N> extends V1SubjectAccessReviewSpecFluent<SpecNested<N>> implements Nested<N>{
    SpecNested(V1SubjectAccessReviewSpec item) {
      this.builder = new V1SubjectAccessReviewSpecBuilder(this, item);
    }
    V1SubjectAccessReviewSpecBuilder builder;
    
    public N and() {
      return (N) V1LocalSubjectAccessReviewFluent.this.withSpec(builder.build());
    }
    
    public N endSpec() {
      return and();
    }
    
  
  }
  public class StatusNested<N> extends V1SubjectAccessReviewStatusFluent<StatusNested<N>> implements Nested<N>{
    StatusNested(V1SubjectAccessReviewStatus item) {
      this.builder = new V1SubjectAccessReviewStatusBuilder(this, item);
    }
    V1SubjectAccessReviewStatusBuilder builder;
    
    public N and() {
      return (N) V1LocalSubjectAccessReviewFluent.this.withStatus(builder.build());
    }
    
    public N endStatus() {
      return and();
    }
    
  
  }

}