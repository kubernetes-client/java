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
  public class V1alpha2PodSchedulingContextFluentImpl<A extends V1alpha2PodSchedulingContextFluent<A>> extends BaseFluent<A> implements V1alpha2PodSchedulingContextFluent<A>{
  public V1alpha2PodSchedulingContextFluentImpl() {
  }
  public V1alpha2PodSchedulingContextFluentImpl(V1alpha2PodSchedulingContext instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha2PodSchedulingContextSpecBuilder spec;
  private V1alpha2PodSchedulingContextStatusBuilder status;
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
  public V1alpha2PodSchedulingContextFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1alpha2PodSchedulingContextFluentImpl.MetadataNestedImpl();
  }
  public V1alpha2PodSchedulingContextFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha2PodSchedulingContextFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha2PodSchedulingContextFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha2PodSchedulingContextFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha2PodSchedulingContextFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2PodSchedulingContextSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1alpha2PodSchedulingContextSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1alpha2PodSchedulingContextSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1alpha2PodSchedulingContextSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1alpha2PodSchedulingContextFluentImpl.SpecNested<A> withNewSpec() {
    return new V1alpha2PodSchedulingContextFluentImpl.SpecNestedImpl();
  }
  public V1alpha2PodSchedulingContextFluentImpl.SpecNested<A> withNewSpecLike(V1alpha2PodSchedulingContextSpec item) {
    return new V1alpha2PodSchedulingContextFluentImpl.SpecNestedImpl(item);
  }
  public V1alpha2PodSchedulingContextFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1alpha2PodSchedulingContextFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1alpha2PodSchedulingContextSpecBuilder().build());
  }
  public V1alpha2PodSchedulingContextFluentImpl.SpecNested<A> editOrNewSpecLike(V1alpha2PodSchedulingContextSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2PodSchedulingContextStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1alpha2PodSchedulingContextStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1alpha2PodSchedulingContextStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1alpha2PodSchedulingContextStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1alpha2PodSchedulingContextFluentImpl.StatusNested<A> withNewStatus() {
    return new V1alpha2PodSchedulingContextFluentImpl.StatusNestedImpl();
  }
  public V1alpha2PodSchedulingContextFluentImpl.StatusNested<A> withNewStatusLike(V1alpha2PodSchedulingContextStatus item) {
    return new V1alpha2PodSchedulingContextFluentImpl.StatusNestedImpl(item);
  }
  public V1alpha2PodSchedulingContextFluentImpl.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1alpha2PodSchedulingContextFluentImpl.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1alpha2PodSchedulingContextStatusBuilder().build());
  }
  public V1alpha2PodSchedulingContextFluentImpl.StatusNested<A> editOrNewStatusLike(V1alpha2PodSchedulingContextStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2PodSchedulingContextFluentImpl that = (V1alpha2PodSchedulingContextFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(spec, that.spec)) return false;

    if (!java.util.Objects.equals(status, that.status)) return false;

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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha2PodSchedulingContextFluentImpl.MetadataNested<N>> implements V1alpha2PodSchedulingContextFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha2PodSchedulingContextFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1alpha2PodSchedulingContextSpecFluentImpl<V1alpha2PodSchedulingContextFluentImpl.SpecNested<N>> implements V1alpha2PodSchedulingContextFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1alpha2PodSchedulingContextSpec item) {
      this.builder = new V1alpha2PodSchedulingContextSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1alpha2PodSchedulingContextSpecBuilder(this);
    }
    V1alpha2PodSchedulingContextSpecBuilder builder;
    public N and() {
      return (N) V1alpha2PodSchedulingContextFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1alpha2PodSchedulingContextStatusFluentImpl<V1alpha2PodSchedulingContextFluentImpl.StatusNested<N>> implements V1alpha2PodSchedulingContextFluentImpl.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1alpha2PodSchedulingContextStatus item) {
      this.builder = new V1alpha2PodSchedulingContextStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1alpha2PodSchedulingContextStatusBuilder(this);
    }
    V1alpha2PodSchedulingContextStatusBuilder builder;
    public N and() {
      return (N) V1alpha2PodSchedulingContextFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}