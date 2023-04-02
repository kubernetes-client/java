package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;
import java.util.Map;
import java.util.LinkedHashMap;

 /**
  * Generated
  */
public interface V1FlexPersistentVolumeSourceFluent<A extends V1FlexPersistentVolumeSourceFluent<A>> extends Fluent<A>{
  public String getDriver();
  public A withDriver(String driver);
  public Boolean hasDriver();
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public A addToOptions(String key,String value);
  public A addToOptions(Map<String,String> map);
  public A removeFromOptions(String key);
  public A removeFromOptions(Map<String,String> map);
  public Map<String,String> getOptions();
  public <K,V>A withOptions(Map<String,String> options);
  public Boolean hasOptions();
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
  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1SecretReference item);
  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1FlexPersistentVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1SecretReference item);
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1FlexPersistentVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}