package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1RuntimeClassFluent<A extends io.kubernetes.client.openapi.models.V1RuntimeClassFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String handler;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1OverheadBuilder overhead;
  private V1SchedulingBuilder scheduling;

  public V1RuntimeClassFluent() {
  }
  
  public V1RuntimeClassFluent(V1RuntimeClass instance) {
    this.copyInstance(instance);
  }

  public V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }
  
  public V1Overhead buildOverhead() {
    return this.overhead != null ? this.overhead.build() : null;
  }
  
  public V1Scheduling buildScheduling() {
    return this.scheduling != null ? this.scheduling.build() : null;
  }
  
  protected void copyInstance(V1RuntimeClass instance) {
    instance = instance != null ? instance : new V1RuntimeClass();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withHandler(instance.getHandler());
        this.withKind(instance.getKind());
        this.withMetadata(instance.getMetadata());
        this.withOverhead(instance.getOverhead());
        this.withScheduling(instance.getScheduling());
    }
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
  
  public OverheadNested<A> editOrNewOverhead() {
    return this.withNewOverheadLike(Optional.ofNullable(this.buildOverhead()).orElse(new V1OverheadBuilder().build()));
  }
  
  public OverheadNested<A> editOrNewOverheadLike(V1Overhead item) {
    return this.withNewOverheadLike(Optional.ofNullable(this.buildOverhead()).orElse(item));
  }
  
  public SchedulingNested<A> editOrNewScheduling() {
    return this.withNewSchedulingLike(Optional.ofNullable(this.buildScheduling()).orElse(new V1SchedulingBuilder().build()));
  }
  
  public SchedulingNested<A> editOrNewSchedulingLike(V1Scheduling item) {
    return this.withNewSchedulingLike(Optional.ofNullable(this.buildScheduling()).orElse(item));
  }
  
  public OverheadNested<A> editOverhead() {
    return this.withNewOverheadLike(Optional.ofNullable(this.buildOverhead()).orElse(null));
  }
  
  public SchedulingNested<A> editScheduling() {
    return this.withNewSchedulingLike(Optional.ofNullable(this.buildScheduling()).orElse(null));
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
    V1RuntimeClassFluent that = (V1RuntimeClassFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(handler, that.handler))) {
      return false;
    }
    if (!(Objects.equals(kind, that.kind))) {
      return false;
    }
    if (!(Objects.equals(metadata, that.metadata))) {
      return false;
    }
    if (!(Objects.equals(overhead, that.overhead))) {
      return false;
    }
    if (!(Objects.equals(scheduling, that.scheduling))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getHandler() {
    return this.handler;
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasHandler() {
    return this.handler != null;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public boolean hasMetadata() {
    return this.metadata != null;
  }
  
  public boolean hasOverhead() {
    return this.overhead != null;
  }
  
  public boolean hasScheduling() {
    return this.scheduling != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, handler, kind, metadata, overhead, scheduling);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(handler == null)) {
        sb.append("handler:");
        sb.append(handler);
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
    if (!(overhead == null)) {
        sb.append("overhead:");
        sb.append(overhead);
        sb.append(",");
    }
    if (!(scheduling == null)) {
        sb.append("scheduling:");
        sb.append(scheduling);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withHandler(String handler) {
    this.handler = handler;
    return (A) this;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
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
  
  public MetadataNested<A> withNewMetadata() {
    return new MetadataNested(null);
  }
  
  public MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new MetadataNested(item);
  }
  
  public OverheadNested<A> withNewOverhead() {
    return new OverheadNested(null);
  }
  
  public OverheadNested<A> withNewOverheadLike(V1Overhead item) {
    return new OverheadNested(item);
  }
  
  public SchedulingNested<A> withNewScheduling() {
    return new SchedulingNested(null);
  }
  
  public SchedulingNested<A> withNewSchedulingLike(V1Scheduling item) {
    return new SchedulingNested(item);
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
  public class MetadataNested<N> extends V1ObjectMetaFluent<MetadataNested<N>> implements Nested<N>{
  
    V1ObjectMetaBuilder builder;
  
    MetadataNested(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
  
    public N and() {
      return (N) V1RuntimeClassFluent.this.withMetadata(builder.build());
    }
    
    public N endMetadata() {
      return and();
    }
    
  }
  public class OverheadNested<N> extends V1OverheadFluent<OverheadNested<N>> implements Nested<N>{
  
    V1OverheadBuilder builder;
  
    OverheadNested(V1Overhead item) {
      this.builder = new V1OverheadBuilder(this, item);
    }
  
    public N and() {
      return (N) V1RuntimeClassFluent.this.withOverhead(builder.build());
    }
    
    public N endOverhead() {
      return and();
    }
    
  }
  public class SchedulingNested<N> extends V1SchedulingFluent<SchedulingNested<N>> implements Nested<N>{
  
    V1SchedulingBuilder builder;
  
    SchedulingNested(V1Scheduling item) {
      this.builder = new V1SchedulingBuilder(this, item);
    }
  
    public N and() {
      return (N) V1RuntimeClassFluent.this.withScheduling(builder.build());
    }
    
    public N endScheduling() {
      return and();
    }
    
  }
}