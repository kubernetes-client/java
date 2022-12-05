package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CinderVolumeSourceFluent<A extends V1CinderVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getSecretRef();
  public V1LocalObjectReference buildSecretRef();
  public A withSecretRef(V1LocalObjectReference secretRef);
  public Boolean hasSecretRef();
  public V1CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1CinderVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item);
  public V1CinderVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1CinderVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item);
  public String getVolumeID();
  public A withVolumeID(String volumeID);
  public Boolean hasVolumeID();
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1CinderVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}