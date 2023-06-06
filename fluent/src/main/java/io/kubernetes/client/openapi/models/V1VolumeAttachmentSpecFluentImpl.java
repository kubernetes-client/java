package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1VolumeAttachmentSpecFluentImpl<A extends V1VolumeAttachmentSpecFluent<A>> extends BaseFluent<A> implements V1VolumeAttachmentSpecFluent<A>{
  public V1VolumeAttachmentSpecFluentImpl() {
  }
  public V1VolumeAttachmentSpecFluentImpl(V1VolumeAttachmentSpec instance) {
    if (instance != null) {
      this.withAttacher(instance.getAttacher());
      this.withNodeName(instance.getNodeName());
      this.withSource(instance.getSource());
    }
  }
  private String attacher;
  private String nodeName;
  private V1VolumeAttachmentSourceBuilder source;
  public String getAttacher() {
    return this.attacher;
  }
  public A withAttacher(String attacher) {
    this.attacher=attacher; return (A) this;
  }
  public Boolean hasAttacher() {
    return this.attacher != null;
  }
  public String getNodeName() {
    return this.nodeName;
  }
  public A withNodeName(String nodeName) {
    this.nodeName=nodeName; return (A) this;
  }
  public Boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentSource getSource() {
    return this.source!=null ?this.source.build():null;
  }
  public V1VolumeAttachmentSource buildSource() {
    return this.source!=null ?this.source.build():null;
  }
  public A withSource(V1VolumeAttachmentSource source) {
    _visitables.get("source").remove(this.source);
    if (source!=null){ this.source= new V1VolumeAttachmentSourceBuilder(source); _visitables.get("source").add(this.source);} else { this.source = null; _visitables.get("source").remove(this.source); } return (A) this;
  }
  public Boolean hasSource() {
    return this.source != null;
  }
  public V1VolumeAttachmentSpecFluentImpl.SourceNested<A> withNewSource() {
    return new V1VolumeAttachmentSpecFluentImpl.SourceNestedImpl();
  }
  public V1VolumeAttachmentSpecFluentImpl.SourceNested<A> withNewSourceLike(V1VolumeAttachmentSource item) {
    return new V1VolumeAttachmentSpecFluentImpl.SourceNestedImpl(item);
  }
  public V1VolumeAttachmentSpecFluentImpl.SourceNested<A> editSource() {
    return withNewSourceLike(getSource());
  }
  public V1VolumeAttachmentSpecFluentImpl.SourceNested<A> editOrNewSource() {
    return withNewSourceLike(getSource() != null ? getSource(): new V1VolumeAttachmentSourceBuilder().build());
  }
  public V1VolumeAttachmentSpecFluentImpl.SourceNested<A> editOrNewSourceLike(V1VolumeAttachmentSource item) {
    return withNewSourceLike(getSource() != null ? getSource(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeAttachmentSpecFluentImpl that = (V1VolumeAttachmentSpecFluentImpl) o;
    if (!java.util.Objects.equals(attacher, that.attacher)) return false;

    if (!java.util.Objects.equals(nodeName, that.nodeName)) return false;

    if (!java.util.Objects.equals(source, that.source)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(attacher,  nodeName,  source,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (attacher != null) { sb.append("attacher:"); sb.append(attacher + ","); }
    if (nodeName != null) { sb.append("nodeName:"); sb.append(nodeName + ","); }
    if (source != null) { sb.append("source:"); sb.append(source); }
    sb.append("}");
    return sb.toString();
  }
  class SourceNestedImpl<N> extends V1VolumeAttachmentSourceFluentImpl<V1VolumeAttachmentSpecFluentImpl.SourceNested<N>> implements V1VolumeAttachmentSpecFluentImpl.SourceNested<N>,Nested<N>{
    SourceNestedImpl(V1VolumeAttachmentSource item) {
      this.builder = new V1VolumeAttachmentSourceBuilder(this, item);
    }
    SourceNestedImpl() {
      this.builder = new V1VolumeAttachmentSourceBuilder(this);
    }
    V1VolumeAttachmentSourceBuilder builder;
    public N and() {
      return (N) V1VolumeAttachmentSpecFluentImpl.this.withSource(builder.build());
    }
    public N endSource() {
      return and();
    }
    
  }
  
}