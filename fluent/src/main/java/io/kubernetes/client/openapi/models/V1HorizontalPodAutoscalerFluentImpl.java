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
  public class V1HorizontalPodAutoscalerFluentImpl<A extends V1HorizontalPodAutoscalerFluent<A>> extends BaseFluent<A> implements V1HorizontalPodAutoscalerFluent<A>{
  public V1HorizontalPodAutoscalerFluentImpl() {
  }
  public V1HorizontalPodAutoscalerFluentImpl(V1HorizontalPodAutoscaler instance) {
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
  private V1HorizontalPodAutoscalerSpecBuilder spec;
  private V1HorizontalPodAutoscalerStatusBuilder status;
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
  public V1HorizontalPodAutoscalerFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1HorizontalPodAutoscalerFluentImpl.MetadataNestedImpl();
  }
  public V1HorizontalPodAutoscalerFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1HorizontalPodAutoscalerFluentImpl.MetadataNestedImpl(item);
  }
  public V1HorizontalPodAutoscalerFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1HorizontalPodAutoscalerFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1HorizontalPodAutoscalerFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HorizontalPodAutoscalerSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1HorizontalPodAutoscalerSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1HorizontalPodAutoscalerSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1HorizontalPodAutoscalerSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1HorizontalPodAutoscalerFluentImpl.SpecNested<A> withNewSpec() {
    return new V1HorizontalPodAutoscalerFluentImpl.SpecNestedImpl();
  }
  public V1HorizontalPodAutoscalerFluentImpl.SpecNested<A> withNewSpecLike(V1HorizontalPodAutoscalerSpec item) {
    return new V1HorizontalPodAutoscalerFluentImpl.SpecNestedImpl(item);
  }
  public V1HorizontalPodAutoscalerFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1HorizontalPodAutoscalerFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1HorizontalPodAutoscalerSpecBuilder().build());
  }
  public V1HorizontalPodAutoscalerFluentImpl.SpecNested<A> editOrNewSpecLike(V1HorizontalPodAutoscalerSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HorizontalPodAutoscalerStatus getStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public V1HorizontalPodAutoscalerStatus buildStatus() {
    return this.status!=null ?this.status.build():null;
  }
  public A withStatus(V1HorizontalPodAutoscalerStatus status) {
    _visitables.get("status").remove(this.status);
    if (status!=null){ this.status= new V1HorizontalPodAutoscalerStatusBuilder(status); _visitables.get("status").add(this.status);} else { this.status = null; _visitables.get("status").remove(this.status); } return (A) this;
  }
  public Boolean hasStatus() {
    return this.status != null;
  }
  public V1HorizontalPodAutoscalerFluentImpl.StatusNested<A> withNewStatus() {
    return new V1HorizontalPodAutoscalerFluentImpl.StatusNestedImpl();
  }
  public V1HorizontalPodAutoscalerFluentImpl.StatusNested<A> withNewStatusLike(V1HorizontalPodAutoscalerStatus item) {
    return new V1HorizontalPodAutoscalerFluentImpl.StatusNestedImpl(item);
  }
  public V1HorizontalPodAutoscalerFluentImpl.StatusNested<A> editStatus() {
    return withNewStatusLike(getStatus());
  }
  public V1HorizontalPodAutoscalerFluentImpl.StatusNested<A> editOrNewStatus() {
    return withNewStatusLike(getStatus() != null ? getStatus(): new V1HorizontalPodAutoscalerStatusBuilder().build());
  }
  public V1HorizontalPodAutoscalerFluentImpl.StatusNested<A> editOrNewStatusLike(V1HorizontalPodAutoscalerStatus item) {
    return withNewStatusLike(getStatus() != null ? getStatus(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HorizontalPodAutoscalerFluentImpl that = (V1HorizontalPodAutoscalerFluentImpl) o;
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
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1HorizontalPodAutoscalerFluentImpl.MetadataNested<N>> implements V1HorizontalPodAutoscalerFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1HorizontalPodAutoscalerFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1HorizontalPodAutoscalerSpecFluentImpl<V1HorizontalPodAutoscalerFluentImpl.SpecNested<N>> implements V1HorizontalPodAutoscalerFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1HorizontalPodAutoscalerSpec item) {
      this.builder = new V1HorizontalPodAutoscalerSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1HorizontalPodAutoscalerSpecBuilder(this);
    }
    V1HorizontalPodAutoscalerSpecBuilder builder;
    public N and() {
      return (N) V1HorizontalPodAutoscalerFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  class StatusNestedImpl<N> extends V1HorizontalPodAutoscalerStatusFluentImpl<V1HorizontalPodAutoscalerFluentImpl.StatusNested<N>> implements V1HorizontalPodAutoscalerFluentImpl.StatusNested<N>,Nested<N>{
    StatusNestedImpl(V1HorizontalPodAutoscalerStatus item) {
      this.builder = new V1HorizontalPodAutoscalerStatusBuilder(this, item);
    }
    StatusNestedImpl() {
      this.builder = new V1HorizontalPodAutoscalerStatusBuilder(this);
    }
    V1HorizontalPodAutoscalerStatusBuilder builder;
    public N and() {
      return (N) V1HorizontalPodAutoscalerFluentImpl.this.withStatus(builder.build());
    }
    public N endStatus() {
      return and();
    }
    
  }
  
}