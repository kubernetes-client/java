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
public interface V1FlexVolumeSourceFluent<A extends V1FlexVolumeSourceFluent<A>> extends Fluent<A>{
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
  public V1LocalObjectReference getSecretRef();
  public V1LocalObjectReference buildSecretRef();
  public A withSecretRef(V1LocalObjectReference secretRef);
  public Boolean hasSecretRef();
  public V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRef();
  public V1FlexVolumeSourceFluent.SecretRefNested<A> withNewSecretRefLike(V1LocalObjectReference item);
  public V1FlexVolumeSourceFluent.SecretRefNested<A> editSecretRef();
  public V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRef();
  public V1FlexVolumeSourceFluent.SecretRefNested<A> editOrNewSecretRefLike(V1LocalObjectReference item);
  public A withReadOnly();
  public interface SecretRefNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1FlexVolumeSourceFluent.SecretRefNested<N>>{
    public N and();
    public N endSecretRef();
    
  }
  
}