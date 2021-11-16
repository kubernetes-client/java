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
public class V1alpha1VolumeAttachmentSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent<A>{
  public V1alpha1VolumeAttachmentSourceFluentImpl() {
  }
  public V1alpha1VolumeAttachmentSourceFluentImpl(io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSource instance) {
    this.withInlineVolumeSpec(instance.getInlineVolumeSpec());

    this.withPersistentVolumeName(instance.getPersistentVolumeName());

  }
  private io.kubernetes.client.openapi.models.V1PersistentVolumeSpecBuilder inlineVolumeSpec;
  private java.lang.String persistentVolumeName;
  
  /**
   * This method has been deprecated, please use method buildInlineVolumeSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec getInlineVolumeSpec() {
    return this.inlineVolumeSpec!=null ?this.inlineVolumeSpec.build():null;
  }
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec buildInlineVolumeSpec() {
    return this.inlineVolumeSpec!=null ?this.inlineVolumeSpec.build():null;
  }
  public A withInlineVolumeSpec(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec inlineVolumeSpec) {
    _visitables.get("inlineVolumeSpec").remove(this.inlineVolumeSpec);
    if (inlineVolumeSpec!=null){ this.inlineVolumeSpec= new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecBuilder(inlineVolumeSpec); _visitables.get("inlineVolumeSpec").add(this.inlineVolumeSpec);} return (A) this;
  }
  public java.lang.Boolean hasInlineVolumeSpec() {
    return this.inlineVolumeSpec != null;
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpec() {
    return new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluentImpl.InlineVolumeSpecNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item) {
    return new io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluentImpl.InlineVolumeSpecNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editInlineVolumeSpec() {
    return withNewInlineVolumeSpecLike(getInlineVolumeSpec());
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpec() {
    return withNewInlineVolumeSpecLike(getInlineVolumeSpec() != null ? getInlineVolumeSpec(): new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item) {
    return withNewInlineVolumeSpecLike(getInlineVolumeSpec() != null ? getInlineVolumeSpec(): item);
  }
  public java.lang.String getPersistentVolumeName() {
    return this.persistentVolumeName;
  }
  public A withPersistentVolumeName(java.lang.String persistentVolumeName) {
    this.persistentVolumeName=persistentVolumeName; return (A) this;
  }
  public java.lang.Boolean hasPersistentVolumeName() {
    return this.persistentVolumeName != null;
  }
  
  /**
   * Method is deprecated. use withPersistentVolumeName instead.
   */
  @java.lang.Deprecated
  public A withNewPersistentVolumeName(java.lang.String arg0) {
    return (A)withPersistentVolumeName(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1VolumeAttachmentSourceFluentImpl that = (V1alpha1VolumeAttachmentSourceFluentImpl) o;
    if (inlineVolumeSpec != null ? !inlineVolumeSpec.equals(that.inlineVolumeSpec) :that.inlineVolumeSpec != null) return false;
    if (persistentVolumeName != null ? !persistentVolumeName.equals(that.persistentVolumeName) :that.persistentVolumeName != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(inlineVolumeSpec,  persistentVolumeName,  super.hashCode());
  }
  public class InlineVolumeSpecNestedImpl<N> extends io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl<io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>,io.kubernetes.client.fluent.Nested<N>{
    InlineVolumeSpecNestedImpl(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item) {
      this.builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecBuilder(this, item);
    }
    InlineVolumeSpecNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecBuilder(this);
    }
    io.kubernetes.client.openapi.models.V1PersistentVolumeSpecBuilder builder;
    public N and() {
      return (N) V1alpha1VolumeAttachmentSourceFluentImpl.this.withInlineVolumeSpec(builder.build());
    }
    public N endInlineVolumeSpec() {
      return and();
    }
    
  }
  
}