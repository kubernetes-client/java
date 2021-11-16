package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1alpha1VolumeAttachmentSpecFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent<A>{
  public V1alpha1VolumeAttachmentSpecFluentImpl() {
  }
  public V1alpha1VolumeAttachmentSpecFluentImpl(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpec instance) {
    this.withAttacher(instance.getAttacher());

    this.withNodeName(instance.getNodeName());

    this.withSource(instance.getSource());

  }
  private java.lang.String attacher;
  private java.lang.String nodeName;
  private io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceBuilder source;
  public java.lang.String getAttacher() {
    return this.attacher;
  }
  public A withAttacher(java.lang.String attacher) {
    this.attacher=attacher; return (A) this;
  }
  public java.lang.Boolean hasAttacher() {
    return this.attacher != null;
  }
  
  /**
   * Method is deprecated. use withAttacher instead.
   */
  @java.lang.Deprecated
  public A withNewAttacher(java.lang.String arg0) {
    return (A)withAttacher(new String(arg0));
  }
  public java.lang.String getNodeName() {
    return this.nodeName;
  }
  public A withNodeName(java.lang.String nodeName) {
    this.nodeName=nodeName; return (A) this;
  }
  public java.lang.Boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  /**
   * Method is deprecated. use withNodeName instead.
   */
  @java.lang.Deprecated
  public A withNewNodeName(java.lang.String arg0) {
    return (A)withNodeName(new String(arg0));
  }
  
  /**
   * This method has been deprecated, please use method buildSource instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource getSource() {
    return this.source!=null ?this.source.build():null;
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource buildSource() {
    return this.source!=null ?this.source.build():null;
  }
  public A withSource(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource source) {
    _visitables.get("source").remove(this.source);
    if (source!=null){ this.source= new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceBuilder(source); _visitables.get("source").add(this.source);} return (A) this;
  }
  public java.lang.Boolean hasSource() {
    return this.source != null;
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> withNewSource() {
    return new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluentImpl.SourceNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> withNewSourceLike(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource item) {
    return new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluentImpl.SourceNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> editSource() {
    return withNewSourceLike(getSource());
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSource() {
    return withNewSourceLike(getSource() != null ? getSource(): new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<A> editOrNewSourceLike(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource item) {
    return withNewSourceLike(getSource() != null ? getSource(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1VolumeAttachmentSpecFluentImpl that = (V1alpha1VolumeAttachmentSpecFluentImpl) o;
    if (attacher != null ? !attacher.equals(that.attacher) :that.attacher != null) return false;
    if (nodeName != null ? !nodeName.equals(that.nodeName) :that.nodeName != null) return false;
    if (source != null ? !source.equals(that.source) :that.source != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(attacher,  nodeName,  source,  super.hashCode());
  }
  public class SourceNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluentImpl<io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSpecFluent.SourceNested<N>,io.kubernetes.client.fluent.Nested<N>{
    SourceNestedImpl(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceBuilder(this, item);
    }
    SourceNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceBuilder builder;
    public N and() {
      return (N) V1alpha1VolumeAttachmentSpecFluentImpl.this.withSource(builder.build());
    }
    public N endSource() {
      return and();
    }
    
  }
  
}