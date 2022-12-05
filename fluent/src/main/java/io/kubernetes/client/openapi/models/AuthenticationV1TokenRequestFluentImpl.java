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
  public class AuthenticationV1TokenRequestFluentImpl<A extends AuthenticationV1TokenRequestFluent<A>> extends BaseFluent<A> implements AuthenticationV1TokenRequestFluent<A>{
  public AuthenticationV1TokenRequestFluentImpl() {
  }
  public AuthenticationV1TokenRequestFluentImpl(AuthenticationV1TokenRequest instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1TokenRequestSpecBuilder spec;
  private V1TokenRequestStatusBuilder status;
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
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> withNewMetadata() {
    return new AuthenticationV1TokenRequestFluentImpl.MetadataNestedImpl();
  }
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new AuthenticationV1TokenRequestFluentImpl.MetadataNestedImpl(item);
  }
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public AuthenticationV1TokenRequestFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TokenRequestSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1TokenRequestSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1TokenRequestSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1TokenRequestSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public AuthenticationV1TokenRequestFluent.SpecNested<A> withNewSpec() {
    return new AuthenticationV1TokenRequestFluentImpl.SpecNestedImpl();
  }
  public AuthenticationV1TokenRequestFluent.SpecNested<A> withNewSpecLike(V1TokenRequestSpec item) {
    return new AuthenticationV1TokenRequestFluentImpl.SpecNestedImpl(item);
  }
  public AuthenticationV1TokenRequestFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public AuthenticationV1TokenRequestFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1TokenRequestSpecBuilder().build());
  }
  public AuthenticationV1TokenRequestFluent.SpecNested<A> editOrNewSpecLike(V1TokenRequestSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1TokenRequestStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1TokenRequestStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1TokenRequestStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1TokenRequestStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public AuthenticationV1TokenRequestFluent.StatusNested<A> withNewStatus() {
    return new AuthenticationV1TokenRequestFluentImpl.StatusNestedImpl();
  }
  public AuthenticationV1TokenRequestFluent.StatusNested<A> withNewStatusLike(V1TokenRequestStatus item) {
    return new AuthenticationV1TokenRequestFluentImpl.StatusNestedImpl(item);
  }
  public AuthenticationV1TokenRequestFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public AuthenticationV1TokenRequestFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1TokenRequestStatusBuilder().build());
  }
  public AuthenticationV1TokenRequestFluent.StatusNested<A> editOrNewStatusLike(V1TokenRequestStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuthenticationV1TokenRequestFluentImpl that = (AuthenticationV1TokenRequestFluentImpl) o;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<AuthenticationV1TokenRequestFluent.MetadataNested<N>> implements AuthenticationV1TokenRequestFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) AuthenticationV1TokenRequestFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1TokenRequestSpecFluentImpl<AuthenticationV1TokenRequestFluent.SpecNested<N>> implements AuthenticationV1TokenRequestFluent.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1TokenRequestSpec item) {
      this.builder = new V1TokenRequestSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1TokenRequestSpecBuilder(this);
    }
    V1TokenRequestSpecBuilder builder;
    public N and() {
      return (N) AuthenticationV1TokenRequestFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1TokenRequestStatusFluentImpl<AuthenticationV1TokenRequestFluent.StatusNested<N>> implements AuthenticationV1TokenRequestFluent.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1TokenRequestStatus item) {
      this.builder = new V1TokenRequestStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1TokenRequestStatusBuilder(this);
    }
    V1TokenRequestStatusBuilder builder;
    public N and() {
      return (N) AuthenticationV1TokenRequestFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}