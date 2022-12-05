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
  public class V1VolumeAttachmentSourceFluentImpl<A extends V1VolumeAttachmentSourceFluent<A>> extends BaseFluent<A> implements V1VolumeAttachmentSourceFluent<A>{
  public V1VolumeAttachmentSourceFluentImpl() {
  }
  public V1VolumeAttachmentSourceFluentImpl(V1VolumeAttachmentSource instance) {
    this.withInlineVolumeSpec(instance.getInlineVolumeSpec());

    this.withPersistentVolumeName(instance.getPersistentVolumeName());

  }
  private V1PersistentVolumeSpecBuilder inlineVolumeSpec;
  private String persistentVolumeName;
  
  /**
   * This method has been deprecated, please use method buildInlineVolumeSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeSpec getInlineVolumeSpec() {
    return this.inlineVolumeSpec!=null ?this.inlineVolumeSpec.build():null;
  }
  public V1PersistentVolumeSpec buildInlineVolumeSpec() {
    return this.inlineVolumeSpec!=null ?this.inlineVolumeSpec.build():null;
  }
  public A withInlineVolumeSpec(V1PersistentVolumeSpec inlineVolumeSpec) {
    _visitables.get("inlineVolumeSpec").remove(this.inlineVolumeSpec);
    if (inlineVolumeSpec!=null){ this.inlineVolumeSpec= new V1PersistentVolumeSpecBuilder(inlineVolumeSpec); _visitables.get("inlineVolumeSpec").add(this.inlineVolumeSpec);} else { this.inlineVolumeSpec = null; _visitables.get("inlineVolumeSpec").remove(this.inlineVolumeSpec); } return (A) this;
  }
  public Boolean hasInlineVolumeSpec() {
    return this.inlineVolumeSpec != null;
  }
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpec() {
    return new V1VolumeAttachmentSourceFluentImpl.InlineVolumeSpecNestedImpl();
  }
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpecLike(V1PersistentVolumeSpec item) {
    return new V1VolumeAttachmentSourceFluentImpl.InlineVolumeSpecNestedImpl(item);
  }
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editInlineVolumeSpec() {
    return withNewInlineVolumeSpecLike(getInlineVolumeSpec());
  }
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpec() {
    return withNewInlineVolumeSpecLike(getInlineVolumeSpec() != null ? getInlineVolumeSpec(): new V1PersistentVolumeSpecBuilder().build());
  }
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpecLike(V1PersistentVolumeSpec item) {
    return withNewInlineVolumeSpecLike(getInlineVolumeSpec() != null ? getInlineVolumeSpec(): item);
  }
  public String getPersistentVolumeName() {
    return this.persistentVolumeName;
  }
  public A withPersistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName=persistentVolumeName; return (A) this;
  }
  public Boolean hasPersistentVolumeName() {
    return this.persistentVolumeName != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeAttachmentSourceFluentImpl that = (V1VolumeAttachmentSourceFluentImpl) o;
    if (inlineVolumeSpec != null ? !inlineVolumeSpec.equals(that.inlineVolumeSpec) :that.inlineVolumeSpec != null) return false;
    if (persistentVolumeName != null ? !persistentVolumeName.equals(that.persistentVolumeName) :that.persistentVolumeName != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(inlineVolumeSpec,  persistentVolumeName,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (inlineVolumeSpec != null) { sb.append("inlineVolumeSpec:"); sb.append(inlineVolumeSpec + ","); }
    if (persistentVolumeName != null) { sb.append("persistentVolumeName:"); sb.append(persistentVolumeName); }
    sb.append("}");
    return sb.toString();
  }
  class InlineVolumeSpecNestedImpl<N> extends V1PersistentVolumeSpecFluentImpl<V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>> implements V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>,Nested<N>{
    InlineVolumeSpecNestedImpl(V1PersistentVolumeSpec item) {
      this.builder = new V1PersistentVolumeSpecBuilder(this, item);
    }
    InlineVolumeSpecNestedImpl() {
      this.builder = new V1PersistentVolumeSpecBuilder(this);
    }
    V1PersistentVolumeSpecBuilder builder;
    public N and() {
      return (N) V1VolumeAttachmentSourceFluentImpl.this.withInlineVolumeSpec(builder.build());
    }
    public N endInlineVolumeSpec() {
      return and();
    }
    
  }
  
}