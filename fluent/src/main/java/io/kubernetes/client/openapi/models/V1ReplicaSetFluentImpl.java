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
  public class V1ReplicaSetFluentImpl<A extends V1ReplicaSetFluent<A>> extends BaseFluent<A> implements V1ReplicaSetFluent<A>{
  public V1ReplicaSetFluentImpl() {
  }
  public V1ReplicaSetFluentImpl(V1ReplicaSet instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1ReplicaSetSpecBuilder spec;
  private V1ReplicaSetStatusBuilder status;
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
  public V1ReplicaSetFluent.MetadataNested<A> withNewMetadata() {
    return new V1ReplicaSetFluentImpl.MetadataNestedImpl();
  }
  public V1ReplicaSetFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1ReplicaSetFluentImpl.MetadataNestedImpl(item);
  }
  public V1ReplicaSetFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1ReplicaSetFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1ReplicaSetFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ReplicaSetSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1ReplicaSetSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1ReplicaSetSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1ReplicaSetSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1ReplicaSetFluent.SpecNested<A> withNewSpec() {
    return new V1ReplicaSetFluentImpl.SpecNestedImpl();
  }
  public V1ReplicaSetFluent.SpecNested<A> withNewSpecLike(V1ReplicaSetSpec item) {
    return new V1ReplicaSetFluentImpl.SpecNestedImpl(item);
  }
  public V1ReplicaSetFluent.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1ReplicaSetFluent.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1ReplicaSetSpecBuilder().build());
  }
  public V1ReplicaSetFluent.SpecNested<A> editOrNewSpecLike(V1ReplicaSetSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ReplicaSetStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1ReplicaSetStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1ReplicaSetStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1ReplicaSetStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1ReplicaSetFluent.StatusNested<A> withNewStatus() {
    return new V1ReplicaSetFluentImpl.StatusNestedImpl();
  }
  public V1ReplicaSetFluent.StatusNested<A> withNewStatusLike(V1ReplicaSetStatus item) {
    return new V1ReplicaSetFluentImpl.StatusNestedImpl(item);
  }
  public V1ReplicaSetFluent.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1ReplicaSetFluent.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1ReplicaSetStatusBuilder().build());
  }
  public V1ReplicaSetFluent.StatusNested<A> editOrNewStatusLike(V1ReplicaSetStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ReplicaSetFluentImpl that = (V1ReplicaSetFluentImpl) o;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1ReplicaSetFluent.MetadataNested<N>> implements V1ReplicaSetFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1ReplicaSetFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1ReplicaSetSpecFluentImpl<V1ReplicaSetFluent.SpecNested<N>> implements V1ReplicaSetFluent.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1ReplicaSetSpec item) {
      this.builder = new V1ReplicaSetSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1ReplicaSetSpecBuilder(this);
    }
    V1ReplicaSetSpecBuilder builder;
    public N and() {
      return (N) V1ReplicaSetFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1ReplicaSetStatusFluentImpl<V1ReplicaSetFluent.StatusNested<N>> implements V1ReplicaSetFluent.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1ReplicaSetStatus item) {
      this.builder = new V1ReplicaSetStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1ReplicaSetStatusBuilder(this);
    }
    V1ReplicaSetStatusBuilder builder;
    public N and() {
      return (N) V1ReplicaSetFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}