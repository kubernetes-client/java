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
public class V1EphemeralVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<A>> extends BaseFluent<A>{

  private V1PersistentVolumeClaimTemplateBuilder volumeClaimTemplate;

  public V1EphemeralVolumeSourceFluent() {
  }
  
  public V1EphemeralVolumeSourceFluent(V1EphemeralVolumeSource instance) {
    this.copyInstance(instance);
  }

  public V1PersistentVolumeClaimTemplate buildVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null ? this.volumeClaimTemplate.build() : null;
  }
  
  protected void copyInstance(V1EphemeralVolumeSource instance) {
    instance = instance != null ? instance : new V1EphemeralVolumeSource();
    if (instance != null) {
      this.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());
    }
  }
  
  public VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplate() {
    return this.withNewVolumeClaimTemplateLike(Optional.ofNullable(this.buildVolumeClaimTemplate()).orElse(new V1PersistentVolumeClaimTemplateBuilder().build()));
  }
  
  public VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplateLike(V1PersistentVolumeClaimTemplate item) {
    return this.withNewVolumeClaimTemplateLike(Optional.ofNullable(this.buildVolumeClaimTemplate()).orElse(item));
  }
  
  public VolumeClaimTemplateNested<A> editVolumeClaimTemplate() {
    return this.withNewVolumeClaimTemplateLike(Optional.ofNullable(this.buildVolumeClaimTemplate()).orElse(null));
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
    V1EphemeralVolumeSourceFluent that = (V1EphemeralVolumeSourceFluent) o;
    if (!(Objects.equals(volumeClaimTemplate, that.volumeClaimTemplate))) {
      return false;
    }
    return true;
  }
  
  public boolean hasVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null;
  }
  
  public int hashCode() {
    return Objects.hash(volumeClaimTemplate);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(volumeClaimTemplate == null)) {
        sb.append("volumeClaimTemplate:");
        sb.append(volumeClaimTemplate);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public VolumeClaimTemplateNested<A> withNewVolumeClaimTemplate() {
    return new VolumeClaimTemplateNested(null);
  }
  
  public VolumeClaimTemplateNested<A> withNewVolumeClaimTemplateLike(V1PersistentVolumeClaimTemplate item) {
    return new VolumeClaimTemplateNested(item);
  }
  
  public A withVolumeClaimTemplate(V1PersistentVolumeClaimTemplate volumeClaimTemplate) {
    this._visitables.remove("volumeClaimTemplate");
    if (volumeClaimTemplate != null) {
        this.volumeClaimTemplate = new V1PersistentVolumeClaimTemplateBuilder(volumeClaimTemplate);
        this._visitables.get("volumeClaimTemplate").add(this.volumeClaimTemplate);
    } else {
        this.volumeClaimTemplate = null;
        this._visitables.get("volumeClaimTemplate").remove(this.volumeClaimTemplate);
    }
    return (A) this;
  }
  public class VolumeClaimTemplateNested<N> extends V1PersistentVolumeClaimTemplateFluent<VolumeClaimTemplateNested<N>> implements Nested<N>{
  
    V1PersistentVolumeClaimTemplateBuilder builder;
  
    VolumeClaimTemplateNested(V1PersistentVolumeClaimTemplate item) {
      this.builder = new V1PersistentVolumeClaimTemplateBuilder(this, item);
    }
  
    public N and() {
      return (N) V1EphemeralVolumeSourceFluent.this.withVolumeClaimTemplate(builder.build());
    }
    
    public N endVolumeClaimTemplate() {
      return and();
    }
    
  }
}