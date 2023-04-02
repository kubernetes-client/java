package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CinderPersistentVolumeSourceFluent<A extends V1CinderPersistentVolumeSourceFluent<A>> extends Fluent<A>{
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
  public V1SecretReference getSecretRef();
  public V1SecretReference buildSecretRef();
  public A withSecretRef(V1SecretReference secretRef);
  public Boolean hasSecretRef();
  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1SecretReference item);
  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item);
  public String getVolumeID();
  public A withVolumeID(String volumeID);
  public Boolean hasVolumeID();
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1CinderPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}