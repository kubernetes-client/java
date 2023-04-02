package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ScaleIOVolumeSourceFluent<A extends V1ScaleIOVolumeSourceFluent<A>> extends Fluent<A>{
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
  public V1LocalObjectReference getSecretRef();
  public V1LocalObjectReference buildSecretRef();
  public A withSecretRef(V1LocalObjectReference secretRef);
  public Boolean hasSecretRef();
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item);
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1ScaleIOVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item);
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
  public interface SecretRefNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1ScaleIOVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}