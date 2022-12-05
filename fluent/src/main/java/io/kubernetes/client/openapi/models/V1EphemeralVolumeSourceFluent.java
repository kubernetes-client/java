package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EphemeralVolumeSourceFluent<A extends V1EphemeralVolumeSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildVolumeClaimTemplate instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimTemplate getVolumeClaimTemplate();
  public V1PersistentVolumeClaimTemplate buildVolumeClaimTemplate();
  public A withVolumeClaimTemplate(V1PersistentVolumeClaimTemplate volumeClaimTemplate);
  public Boolean hasVolumeClaimTemplate();
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> withNewVolumeClaimTemplate();
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> withNewVolumeClaimTemplateLike(V1PersistentVolumeClaimTemplate item);
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editVolumeClaimTemplate();
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplate();
  public V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<A> editOrNewVolumeClaimTemplateLike(V1PersistentVolumeClaimTemplate item);
  public interface VolumeClaimTemplateNested<N> extends Nested<N>,V1PersistentVolumeClaimTemplateFluent<V1EphemeralVolumeSourceFluent.VolumeClaimTemplateNested<N>>{
    public N and();
    public N endVolumeClaimTemplate();
    
  }
  
}