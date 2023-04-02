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
  public class V1RuntimeClassFluentImpl<A extends V1RuntimeClassFluent<A>> extends BaseFluent<A> implements V1RuntimeClassFluent<A>{
  public V1RuntimeClassFluentImpl() {
  }
  public V1RuntimeClassFluentImpl(V1RuntimeClass instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withHandler(instance.getHandler());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withOverhead(instance.getOverhead());

    this.withScheduling(instance.getScheduling());

  }
  private String apiVersion;
  private String handler;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1OverheadBuilder overhead;
  private V1SchedulingBuilder scheduling;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getHandler() {
    return this.handler;
  }
  public A withHandler(String handler) {
    this.handler=handler; return (A) this;
  }
  public Boolean hasHandler() {
    return this.handler != null;
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
  public V1RuntimeClassFluent.MetadataNested<A> withNewMetadata() {
    return new V1RuntimeClassFluentImpl.MetadataNestedImpl();
  }
  public V1RuntimeClassFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1RuntimeClassFluentImpl.MetadataNestedImpl(item);
  }
  public V1RuntimeClassFluent.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1RuntimeClassFluent.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1RuntimeClassFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildOverhead instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Overhead getOverhead() {
    return this.overhead!=null ?this.overhead.build():null;
  }
  public V1Overhead buildOverhead() {
    return this.overhead!=null ?this.overhead.build():null;
  }
  public A withOverhead(V1Overhead overhead) {
    _visitables.get("overhead").remove(this.overhead);
    if (overhead!=null){ this.overhead= new V1OverheadBuilder(overhead); _visitables.get("overhead").add(this.overhead);} else { this.overhead = null; _visitables.get("overhead").remove(this.overhead); } return (A) this;
  }
  public Boolean hasOverhead() {
    return this.overhead != null;
  }
  public V1RuntimeClassFluent.OverheadNested<A> withNewOverhead() {
    return new V1RuntimeClassFluentImpl.OverheadNestedImpl();
  }
  public V1RuntimeClassFluent.OverheadNested<A> withNewOverheadLike(V1Overhead item) {
    return new V1RuntimeClassFluentImpl.OverheadNestedImpl(item);
  }
  public V1RuntimeClassFluent.OverheadNested<A> editOverhead() {
    return withNewOverheadLike(getOverhead());
  }
  public V1RuntimeClassFluent.OverheadNested<A> editOrNewOverhead() {
    return withNewOverheadLike(getOverhead() != null ? getOverhead(): new V1OverheadBuilder().build());
  }
  public V1RuntimeClassFluent.OverheadNested<A> editOrNewOverheadLike(V1Overhead item) {
    return withNewOverheadLike(getOverhead() != null ? getOverhead(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildScheduling instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1Scheduling getScheduling() {
    return this.scheduling!=null ?this.scheduling.build():null;
  }
  public V1Scheduling buildScheduling() {
    return this.scheduling!=null ?this.scheduling.build():null;
  }
  public A withScheduling(V1Scheduling scheduling) {
    _visitables.get("scheduling").remove(this.scheduling);
    if (scheduling!=null){ this.scheduling= new V1SchedulingBuilder(scheduling); _visitables.get("scheduling").add(this.scheduling);} else { this.scheduling = null; _visitables.get("scheduling").remove(this.scheduling); } return (A) this;
  }
  public Boolean hasScheduling() {
    return this.scheduling != null;
  }
  public V1RuntimeClassFluent.SchedulingNested<A> withNewScheduling() {
    return new V1RuntimeClassFluentImpl.SchedulingNestedImpl();
  }
  public V1RuntimeClassFluent.SchedulingNested<A> withNewSchedulingLike(V1Scheduling item) {
    return new V1RuntimeClassFluentImpl.SchedulingNestedImpl(item);
  }
  public V1RuntimeClassFluent.SchedulingNested<A> editScheduling() {
    return withNewSchedulingLike(getScheduling());
  }
  public V1RuntimeClassFluent.SchedulingNested<A> editOrNewScheduling() {
    return withNewSchedulingLike(getScheduling() != null ? getScheduling(): new V1SchedulingBuilder().build());
  }
  public V1RuntimeClassFluent.SchedulingNested<A> editOrNewSchedulingLike(V1Scheduling item) {
    return withNewSchedulingLike(getScheduling() != null ? getScheduling(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RuntimeClassFluentImpl that = (V1RuntimeClassFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
    if (handler != null ? !handler.equals(that.handler) :that.handler != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
    if (overhead != null ? !overhead.equals(that.overhead) :that.overhead != null) return false;
    if (scheduling != null ? !scheduling.equals(that.scheduling) :that.scheduling != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  handler,  kind,  metadata,  overhead,  scheduling,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (handler != null) { sb.append("handler:"); sb.append(handler + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (overhead != null) { sb.append("overhead:"); sb.append(overhead + ","); }
    if (scheduling != null) { sb.append("scheduling:"); sb.append(scheduling); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1RuntimeClassFluent.MetadataNested<N>> implements V1RuntimeClassFluent.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1RuntimeClassFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class OverheadNestedImpl<N> extends V1OverheadFluentImpl<V1RuntimeClassFluent.OverheadNested<N>> implements V1RuntimeClassFluent.OverheadNested<N>,Nested<N>{
    OverheadNestedImpl(V1Overhead item) {
      this.builder = new V1OverheadBuilder(this, item);
    }
    OverheadNestedImpl() {
      this.builder = new V1OverheadBuilder(this);
    }
    V1OverheadBuilder builder;
    public N and() {
      return (N) V1RuntimeClassFluentImpl.this.withOverhead(builder.build());
    }
    public N endOverhead() {
      return and();
    }
    
  }
  class SchedulingNestedImpl<N> extends V1SchedulingFluentImpl<V1RuntimeClassFluent.SchedulingNested<N>> implements V1RuntimeClassFluent.SchedulingNested<N>,Nested<N>{
    SchedulingNestedImpl(V1Scheduling item) {
      this.builder = new V1SchedulingBuilder(this, item);
    }
    SchedulingNestedImpl() {
      this.builder = new V1SchedulingBuilder(this);
    }
    V1SchedulingBuilder builder;
    public N and() {
      return (N) V1RuntimeClassFluentImpl.this.withScheduling(builder.build());
    }
    public N endScheduling() {
      return and();
    }
    
  }
  
}