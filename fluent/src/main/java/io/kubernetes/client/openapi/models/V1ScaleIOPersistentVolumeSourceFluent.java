package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ScaleIOPersistentVolumeSourceFluent<A extends V1ScaleIOPersistentVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public String getGateway();
  public A withGateway(String gateway);
  public Boolean hasGateway();
  public String getProtectionDomain();
  public A withProtectionDomain(String protectionDomain);
  public Boolean hasProtectionDomain();
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
  public V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1SecretReference item);
  public V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item);
  public Boolean getSslEnabled();
  public A withSslEnabled(Boolean sslEnabled);
  public Boolean hasSslEnabled();
  public String getStorageMode();
  public A withStorageMode(String storageMode);
  public Boolean hasStorageMode();
  public String getStoragePool();
  public A withStoragePool(String storagePool);
  public Boolean hasStoragePool();
  public String getSystem();
  public A withSystem(String system);
  public Boolean hasSystem();
  public String getVolumeName();
  public A withVolumeName(String volumeName);
  public Boolean hasVolumeName();
  public A withReadOnly();
  public A withSslEnabled();
  public interface SecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1ScaleIOPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}