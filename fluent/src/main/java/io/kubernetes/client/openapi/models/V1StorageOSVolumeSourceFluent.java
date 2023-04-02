package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StorageOSVolumeSourceFluent<A extends V1StorageOSVolumeSourceFluent<A>> extends Fluent<A>{
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
  public V1StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1StorageOSVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item);
  public V1StorageOSVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1StorageOSVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item);
  public String getVolumeName();
  public A withVolumeName(String volumeName);
  public Boolean hasVolumeName();
  public String getVolumeNamespace();
  public A withVolumeNamespace(String volumeNamespace);
  public Boolean hasVolumeNamespace();
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1StorageOSVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}