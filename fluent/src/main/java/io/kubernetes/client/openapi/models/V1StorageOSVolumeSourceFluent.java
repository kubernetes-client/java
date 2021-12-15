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
public interface V1StorageOSVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getFsType();
  public A withFsType(java.lang.String fsType);
  public java.lang.Boolean hasFsType();
  
  /**
   * Method is deprecated. use withFsType instead.
   */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original);
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  
  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalObjectReference getSecretRef();
  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef();
  public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef);
  public java.lang.Boolean hasSecretRef();
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);
  public java.lang.String getVolumeName();
  public A withVolumeName(java.lang.String volumeName);
  public java.lang.Boolean hasVolumeName();
  
  /**
   * Method is deprecated. use withVolumeName instead.
   */
  @java.lang.Deprecated
  public A withNewVolumeName(java.lang.String original);
  public java.lang.String getVolumeNamespace();
  public A withVolumeNamespace(java.lang.String volumeNamespace);
  public java.lang.Boolean hasVolumeNamespace();
  
  /**
   * Method is deprecated. use withVolumeNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewVolumeNamespace(java.lang.String original);
  public interface SecretRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}