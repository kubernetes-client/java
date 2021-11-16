package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CinderPersistentVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getFsType();
  public A withFsType(java.lang.String fsType);
  public java.lang.Boolean hasFsType();
  
  /**
   * Method is deprecated. use withFsType instead.
   */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String arg0);
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretReference getSecretRef();
  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef();
  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef);
  public java.lang.Boolean hasSecretRef();
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item);
  public java.lang.String getVolumeID();
  public A withVolumeID(java.lang.String volumeID);
  public java.lang.Boolean hasVolumeID();
  
  /**
   * Method is deprecated. use withVolumeID instead.
   */
  @java.lang.Deprecated
  public A withNewVolumeID(java.lang.String arg0);
  public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1SecretReferenceFluent<io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}