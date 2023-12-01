package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1RuntimeClassFluent<A extends V1RuntimeClassFluent<A>> extends BaseFluent<A>{
  public V1RuntimeClassFluent() {
  }
  
  public V1RuntimeClassFluent(V1RuntimeClass instance) {
    this.copyInstance(instance);
  }
  private String apiVersion;
  private String handler;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1OverheadBuilder overhead;
  private V1SchedulingBuilder scheduling;
  
  protected void copyInstance(V1RuntimeClass instance) {
    instance = (instance != null ? instance : new V1RuntimeClass());
    if (instance != null) {
          this.withApiVersion(instance.getApiVersion());
          this.withHandler(instance.getHandler());
          this.withKind(instance.getKind());
          this.withMetadata(instance.getMetadata());
          this.withOverhead(instance.getOverhead());
          this.withScheduling(instance.getScheduling());
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
  
  public String getHandler() {
    return this.handler;
  }
  
  public A withHandler(String handler) {
    this.handler = handler;
    return (A) this;
  }
  
  public boolean hasHandler() {
    return this.handler != null;
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
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(null));
  }
  
  public MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(new V1ObjectMetaBuilder().build()));
  }
  
  public MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(java.util.Optional.ofNullable(buildMetadata()).orElse(item));
  }
  
  public V1Overhead buildOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }
  
  public A withOverhead(V1Overhead overhead) {
    this._visitables.remove("overhead");
    if (overhead != null) {
        this.overhead = new V1OverheadBuilder(overhead);
        this._visitables.get("overhead").add(this.overhead);
    } else {
        this.overhead = null;
        this._visitables.get("overhead").remove(this.overhead);
    }
    return (A) this;
  }
  
  public boolean hasOverhead() {
    return this.overhead != null;
  }
  
  public OverheadNested<A> withNewOverhead() {
    return new OverheadNested(null);
  }
  
  public OverheadNested<A> withNewOverheadLike(V1Overhead item) {
    return new OverheadNested(item);
  }
  
  public OverheadNested<A> editOverhead() {
    return withNewOverheadLike(java.util.Optional.ofNullable(buildOverhead()).orElse(null));
  }
  
  public OverheadNested<A> editOrNewOverhead() {
    return withNewOverheadLike(java.util.Optional.ofNullable(buildOverhead()).orElse(new V1OverheadBuilder().build()));
  }
  
  public OverheadNested<A> editOrNewOverheadLike(V1Overhead item) {
    return withNewOverheadLike(java.util.Optional.ofNullable(buildOverhead()).orElse(item));
  }
  
  public V1Scheduling buildScheduling() {
    return this.scheduling != null ? this.scheduling.build() : null;
  }
  
  public A withScheduling(V1Scheduling scheduling) {
    this._visitables.remove("scheduling");
    if (scheduling != null) {
        this.scheduling = new V1SchedulingBuilder(scheduling);
        this._visitables.get("scheduling").add(this.scheduling);
    } else {
        this.scheduling = null;
        this._visitables.get("scheduling").remove(this.scheduling);
    }
    return (A) this;
  }
  
  public boolean hasScheduling() {
    return this.scheduling != null;
  }
  
  public SchedulingNested<A> withNewScheduling() {
    return new SchedulingNested(null);
  }
  
  public SchedulingNested<A> withNewSchedulingLike(V1Scheduling item) {
    return new SchedulingNested(item);
  }
  
  public SchedulingNested<A> editScheduling() {
    return withNewSchedulingLike(java.util.Optional.ofNullable(buildScheduling()).orElse(null));
  }
  
  public SchedulingNested<A> editOrNewScheduling() {
    return withNewSchedulingLike(java.util.Optional.ofNullable(buildScheduling()).orElse(new V1SchedulingBuilder().build()));
  }
  
  public SchedulingNested<A> editOrNewSchedulingLike(V1Scheduling item) {
    return withNewSchedulingLike(java.util.Optional.ofNullable(buildScheduling()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1RuntimeClassFluent that = (V1RuntimeClassFluent) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;
    if (!java.util.Objects.equals(handler, that.handler)) return false;
    if (!java.util.Objects.equals(kind, that.kind)) return false;
    if (!java.util.Objects.equals(metadata, that.metadata)) return false;
    if (!java.util.Objects.equals(overhead, that.overhead)) return false;
    if (!java.util.Objects.equals(scheduling, that.scheduling)) return false;
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
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    V1ObjectMetaBuilder builder;
    
    public N and() {
      return (N) V1RuntimeClassFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  
  }
  public class OverheadNested<N> extends V1OverheadFluent<OverheadNested<N>> implements Nested<N>{
    OverheadNested(V1Overhead item) {
      this.builder = new V1OverheadBuilder(this, item);
    }
    V1OverheadBuilder builder;
    
    public N and() {
      return (N) V1RuntimeClassFluent.this.withOverhead(builder.build());
    }
    
    public N endOverhead() {
      return and();
    }
    
  
  }
  public class SchedulingNested<N> extends V1SchedulingFluent<SchedulingNested<N>> implements Nested<N>{
    SchedulingNested(V1Scheduling item) {
      this.builder = new V1SchedulingBuilder(this, item);
    }
    V1SchedulingBuilder builder;
    
    public N and() {
      return (N) V1RuntimeClassFluent.this.withScheduling(builder.build());
    }
    
    public N endScheduling() {
      return and();
    }
    
  
  }

}