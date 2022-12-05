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
  public class V1EphemeralVolumeSourceFluentImpl<A extends V1EphemeralVolumeSourceFluent<A>> extends BaseFluent<A> implements V1EphemeralVolumeSourceFluent<A>{
  public V1EphemeralVolumeSourceFluentImpl() {
  }
  public V1EphemeralVolumeSourceFluentImpl(V1EphemeralVolumeSource instance) {
    this.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());

  }
  private V1PersistentVolumeClaimTemplateBuilder volumeClaimTemplate;
  
  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
    return this.volumeClaimTemplate!=null ?this.volumeClaimTemplate.build():null;
  }
  public V1PersistentVolumeClaimTemplate buildVolumeClaimTemplate() {
    return this.volumeClaimTemplate!=null ?this.volumeClaimTemplate.build():null;
  }
  public A withVolumeClaimTemplate(V1PersistentVolumeClaimTemplate volumeClaimTemplate) {
    _visitables.get("volumeClaimTemplate").remove(this.volumeClaimTemplate);
    if (volumeClaimTemplate!=null){ this.volumeClaimTemplate= new V1PersistentVolumeClaimTemplateBuilder(volumeClaimTemplate); _visitables.get("volumeClaimTemplate").add(this.volumeClaimTemplate);} else { this.volumeClaimTemplate = null; _visitables.get("volumeClaimTemplate").remove(this.volumeClaimTemplate); } return (A) this;
  }
  public Boolean hasVolumeClaimTemplate() {
    return this.volumeClaimTemplate != null;
  }
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> withNewVolumeClaimTemplate() {
    return new V1EphemeralVolumeSourceFluentImpl.VolumeClaimTemplateNestedImpl();
  }
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> withNewVolumeClaimTemplateLike(V1PersistentVolumeClaimTemplate item) {
    return new V1EphemeralVolumeSourceFluentImpl.VolumeClaimTemplateNestedImpl(item);
  }
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editVolumeClaimTemplate() {
    return withNewVolumeClaimTemplateLike(getVolumeClaimTemplate());
  }
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplate() {
    return withNewVolumeClaimTemplateLike(getVolumeClaimTemplate() != null ? getVolumeClaimTemplate(): new V1PersistentVolumeClaimTemplateBuilder().build());
  }
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplateLike(V1PersistentVolumeClaimTemplate item) {
    return withNewVolumeClaimTemplateLike(getVolumeClaimTemplate() != null ? getVolumeClaimTemplate(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EphemeralVolumeSourceFluentImpl that = (V1EphemeralVolumeSourceFluentImpl) o;
    if (volumeClaimTemplate != null ? !volumeClaimTemplate.equals(that.volumeClaimTemplate) :that.volumeClaimTemplate != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(volumeClaimTemplate,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (volumeClaimTemplate != null) { sb.append("volumeClaimTemplate:"); sb.append(volumeClaimTemplate); }
    sb.append("}");
    return sb.toString();
  }
  class VolumeClaimTemplateNestedImpl<N> extends V1PersistentVolumeClaimTemplateFluentImpl<V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<N>> implements V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<N>,Nested<N>{
    VolumeClaimTemplateNestedImpl(V1PersistentVolumeClaimTemplate item) {
      this.builder = new V1PersistentVolumeClaimTemplateBuilder(this, item);
    }
    VolumeClaimTemplateNestedImpl() {
      this.builder = new V1PersistentVolumeClaimTemplateBuilder(this);
    }
    V1PersistentVolumeClaimTemplateBuilder builder;
    public N and() {
      return (N) V1EphemeralVolumeSourceFluentImpl.this.withVolumeClaimTemplate(builder.build());
    }
    public N endVolumeClaimTemplate() {
      return and();
    }
    
  }
  
}