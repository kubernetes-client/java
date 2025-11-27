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
public class V1VolumeAttachmentSpecFluent<A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<A>> extends BaseFluent<A>{

  private String attacher;
  private String nodeName;
  private V1VolumeAttachmentSourceBuilder source;

  public V1VolumeAttachmentSpecFluent() {
  }
  
  public V1VolumeAttachmentSpecFluent(V1VolumeAttachmentSpec instance) {
    this.copyInstance(instance);
  }

  public V1VolumeAttachmentSource buildSource() {
    return this.source != null ? this.source.build() : null;
  }
  
  protected void copyInstance(V1VolumeAttachmentSpec instance) {
    instance = instance != null ? instance : new V1VolumeAttachmentSpec();
    if (instance != null) {
        this.withAttacher(instance.getAttacher());
        this.withNodeName(instance.getNodeName());
        this.withSource(instance.getSource());
    }
  }
  
  public SourceNested<A> editOrNewSource() {
    return this.withNewSourceLike(Optional.ofNullable(this.buildSource()).orElse(new V1VolumeAttachmentSourceBuilder().build()));
  }
  
  public SourceNested<A> editOrNewSourceLike(V1VolumeAttachmentSource item) {
    return this.withNewSourceLike(Optional.ofNullable(this.buildSource()).orElse(item));
  }
  
  public SourceNested<A> editSource() {
    return this.withNewSourceLike(Optional.ofNullable(this.buildSource()).orElse(null));
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
    V1VolumeAttachmentSpecFluent that = (V1VolumeAttachmentSpecFluent) o;
    if (!(Objects.equals(attacher, that.attacher))) {
      return false;
    }
    if (!(Objects.equals(nodeName, that.nodeName))) {
      return false;
    }
    if (!(Objects.equals(source, that.source))) {
      return false;
    }
    return true;
  }
  
  public String getAttacher() {
    return this.attacher;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public boolean hasAttacher() {
    return this.attacher != null;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean hasSource() {
    return this.source != null;
  }
  
  public int hashCode() {
    return Objects.hash(attacher, nodeName, source);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(attacher == null)) {
        sb.append("attacher:");
        sb.append(attacher);
        sb.append(",");
    }
    if (!(nodeName == null)) {
        sb.append("nodeName:");
        sb.append(nodeName);
        sb.append(",");
    }
    if (!(source == null)) {
        sb.append("source:");
        sb.append(source);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAttacher(String attacher) {
    this.attacher = attacher;
    return (A) this;
  }
  
  public SourceNested<A> withNewSource() {
    return new SourceNested(null);
  }
  
  public SourceNested<A> withNewSourceLike(V1VolumeAttachmentSource item) {
    return new SourceNested(item);
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public A withSource(V1VolumeAttachmentSource source) {
    this._visitables.remove("source");
    if (source != null) {
        this.source = new V1VolumeAttachmentSourceBuilder(source);
        this._visitables.get("source").add(this.source);
    } else {
        this.source = null;
        this._visitables.get("source").remove(this.source);
    }
    return (A) this;
  }
  public class SourceNested<N> extends V1VolumeAttachmentSourceFluent<SourceNested<N>> implements Nested<N>{
  
    V1VolumeAttachmentSourceBuilder builder;
  
    SourceNested(V1VolumeAttachmentSource item) {
      this.builder = new V1VolumeAttachmentSourceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1VolumeAttachmentSpecFluent.this.withSource(builder.build());
    }
    
    public N endSource() {
      return and();
    }
    
  }
}