package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StorageOSPersistentVolumeSourceFluent<A extends V1StorageOSPersistentVolumeSourceFluent<A>> extends Fluent<A>{
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
  public V1ObjectReference getSecretRef();
  public V1ObjectReference buildSecretRef();
  public A withSecretRef(V1ObjectReference secretRef);
  public Boolean hasSecretRef();
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1ObjectReference item);
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1ObjectReference item);
  public String getVolumeName();
  public A withVolumeName(String volumeName);
  public Boolean hasVolumeName();
  public String getVolumeNamespace();
  public A withVolumeNamespace(String volumeNamespace);
  public Boolean hasVolumeNamespace();
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1StorageOSPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}