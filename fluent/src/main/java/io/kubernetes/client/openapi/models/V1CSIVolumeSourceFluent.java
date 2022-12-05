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
public interface V1CSIVolumeSourceFluent<A extends V1CSIVolumeSourceFluent<A>> extends Fluent<A>{
  public String getDriver();
  public A withDriver(String driver);
  public Boolean hasDriver();
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  
  /**
   * This method has been deprecated, please use method buildNodePublishSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalObjectReference getNodePublishSecretRef();
  public V1LocalObjectReference buildNodePublishSecretRef();
  public A withNodePublishSecretRef(V1LocalObjectReference nodePublishSecretRef);
  public Boolean hasNodePublishSecretRef();
  public V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRef();
  public V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(V1LocalObjectReference item);
  public V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A> editNodePublishSecretRef();
  public V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef();
  public V1CSIVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(V1LocalObjectReference item);
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public A addToVolumeAttributes(String key,String value);
  public A addToVolumeAttributes(Map<String,String> map);
  public A removeFromVolumeAttributes(String key);
  public A removeFromVolumeAttributes(Map<String,String> map);
  public Map<String,String> getVolumeAttributes();
  public <K,V>A withVolumeAttributes(Map<String,String> volumeAttributes);
  public Boolean hasVolumeAttributes();
  public A withReadOnly();
  public interface NodePublishSecretRefNested<N> extends Nested<N>,V1LocalObjectReferenceFluent<V1CSIVolumeSourceFluent.NodePublishSecretRefNested<N>>{
    public N and();
    public N endNodePublishSecretRef();
    
  }
  
}