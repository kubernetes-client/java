package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1VolumeAttachmentSourceFluent<A extends V1VolumeAttachmentSourceFluent<A>> extends BaseFluent<A>{
  public V1VolumeAttachmentSourceFluent() {
  }
  
  public V1VolumeAttachmentSourceFluent(V1VolumeAttachmentSource instance) {
    this.copyInstance(instance);
  }
  private V1PersistentVolumeSpecBuilder inlineVolumeSpec;
  private String persistentVolumeName;
  
  protected void copyInstance(V1VolumeAttachmentSource instance) {
    instance = (instance != null ? instance : new V1VolumeAttachmentSource());
    if (instance != null) {
          this.withInlineVolumeSpec(instance.getInlineVolumeSpec());
          this.withPersistentVolumeName(instance.getPersistentVolumeName());
        }
  }
  
  public V1PersistentVolumeSpec buildInlineVolumeSpec() {
    return this.inlineVolumeSpec != null ? this.inlineVolumeSpec.build() : null;
  }
  
  public A withInlineVolumeSpec(V1PersistentVolumeSpec inlineVolumeSpec) {
    this._visitables.remove("inlineVolumeSpec");
    if (inlineVolumeSpec != null) {
        this.inlineVolumeSpec = new V1PersistentVolumeSpecBuilder(inlineVolumeSpec);
        this._visitables.get("inlineVolumeSpec").add(this.inlineVolumeSpec);
    } else {
        this.inlineVolumeSpec = null;
        this._visitables.get("inlineVolumeSpec").remove(this.inlineVolumeSpec);
    }
    return (A) this;
  }
  
  public boolean hasInlineVolumeSpec() {
    return this.inlineVolumeSpec != null;
  }
  
  public InlineVolumeSpecNested<A> withNewInlineVolumeSpec() {
    return new InlineVolumeSpecNested(null);
  }
  
  public InlineVolumeSpecNested<A> withNewInlineVolumeSpecLike(V1PersistentVolumeSpec item) {
    return new InlineVolumeSpecNested(item);
  }
  
  public InlineVolumeSpecNested<A> editInlineVolumeSpec() {
    return withNewInlineVolumeSpecLike(java.util.Optional.ofNullable(buildInlineVolumeSpec()).orElse(null));
  }
  
  public InlineVolumeSpecNested<A> editOrNewInlineVolumeSpec() {
    return withNewInlineVolumeSpecLike(java.util.Optional.ofNullable(buildInlineVolumeSpec()).orElse(new V1PersistentVolumeSpecBuilder().build()));
  }
  
  public InlineVolumeSpecNested<A> editOrNewInlineVolumeSpecLike(V1PersistentVolumeSpec item) {
    return withNewInlineVolumeSpecLike(java.util.Optional.ofNullable(buildInlineVolumeSpec()).orElse(item));
  }
  
  public String getPersistentVolumeName() {
    return this.persistentVolumeName;
  }
  
  public A withPersistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
    return (A) this;
  }
  
  public boolean hasPersistentVolumeName() {
    return this.persistentVolumeName != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeAttachmentSourceFluent that = (V1VolumeAttachmentSourceFluent) o;
    if (!java.util.Objects.equals(inlineVolumeSpec, that.inlineVolumeSpec)) return false;
    if (!java.util.Objects.equals(persistentVolumeName, that.persistentVolumeName)) return false;
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
  public class InlineVolumeSpecNested<N> extends V1PersistentVolumeSpecFluent<InlineVolumeSpecNested<N>> implements Nested<N>{
    InlineVolumeSpecNested(V1PersistentVolumeSpec item) {
      this.builder = new V1PersistentVolumeSpecBuilder(this, item);
    }
    V1PersistentVolumeSpecBuilder builder;
    
    public N and() {
      return (N) V1VolumeAttachmentSourceFluent.this.withInlineVolumeSpec(builder.build());
    }
    
    public N endInlineVolumeSpec() {
      return and();
    }
    
  
  }

}