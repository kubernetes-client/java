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
  public class V1NetworkPolicyFluentImpl<A extends V1NetworkPolicyFluent<A>> extends BaseFluent<A> implements V1NetworkPolicyFluent<A>{
  public V1NetworkPolicyFluentImpl() {
  }
  public V1NetworkPolicyFluentImpl(V1NetworkPolicy instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1NetworkPolicySpecBuilder spec;
  private V1NetworkPolicyStatusBuilder status;
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
  public V1NetworkPolicyFluent.MetadataNested<A> withNewMetadata() {
    return new V1NetworkPolicyFluentImpl.MetadataNestedImpl();
  }
  public V1NetworkPolicyFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1NetworkPolicyFluentImpl.MetadataNestedImpl(item);
  }
  public V1NetworkPolicyFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1NetworkPolicyFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1NetworkPolicyFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NetworkPolicySpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1NetworkPolicySpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1NetworkPolicySpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1NetworkPolicySpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1NetworkPolicyFluent.SpecNested<A> withNewSpec() {
    return new V1NetworkPolicyFluentImpl.SpecNestedImpl();
  }
  public V1NetworkPolicyFluent.SpecNested<A> withNewSpecLike(V1NetworkPolicySpec item) {
    return new V1NetworkPolicyFluentImpl.SpecNestedImpl(item);
  }
  public V1NetworkPolicyFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1NetworkPolicyFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1NetworkPolicySpecBuilder().build());
  }
  public V1NetworkPolicyFluent.SpecNested<A> editOrNewSpecLike(V1NetworkPolicySpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NetworkPolicyStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1NetworkPolicyStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1NetworkPolicyStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1NetworkPolicyStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1NetworkPolicyFluent.StatusNested<A> withNewStatus() {
    return new V1NetworkPolicyFluentImpl.StatusNestedImpl();
  }
  public V1NetworkPolicyFluent.StatusNested<A> withNewStatusLike(V1NetworkPolicyStatus item) {
    return new V1NetworkPolicyFluentImpl.StatusNestedImpl(item);
  }
  public V1NetworkPolicyFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1NetworkPolicyFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1NetworkPolicyStatusBuilder().build());
  }
  public V1NetworkPolicyFluent.StatusNested<A> editOrNewStatusLike(V1NetworkPolicyStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NetworkPolicyFluentImpl that = (V1NetworkPolicyFluentImpl) o;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1NetworkPolicyFluent.MetadataNested<N>> implements V1NetworkPolicyFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1NetworkPolicyFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1NetworkPolicySpecFluentImpl<V1NetworkPolicyFluent.SpecNested<N>> implements V1NetworkPolicyFluent.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1NetworkPolicySpec item) {
      this.builder = new V1NetworkPolicySpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1NetworkPolicySpecBuilder(this);
    }
    V1NetworkPolicySpecBuilder builder;
    public N and() {
      return (N) V1NetworkPolicyFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1NetworkPolicyStatusFluentImpl<V1NetworkPolicyFluent.StatusNested<N>> implements V1NetworkPolicyFluent.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1NetworkPolicyStatus item) {
      this.builder = new V1NetworkPolicyStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1NetworkPolicyStatusBuilder(this);
    }
    V1NetworkPolicyStatusBuilder builder;
    public N and() {
      return (N) V1NetworkPolicyFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}