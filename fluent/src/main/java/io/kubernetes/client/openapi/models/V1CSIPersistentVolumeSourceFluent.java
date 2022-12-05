package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Deprecated;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1CSIPersistentVolumeSourceFluent<A extends V1CSIPersistentVolumeSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildControllerExpandSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getControllerExpandSecretRef();
  public V1SecretReference buildControllerExpandSecretRef();
  public A withControllerExpandSecretRef(V1SecretReference controllerExpandSecretRef);
  public Boolean hasControllerExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> withNewControllerExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> withNewControllerExpandSecretRefLike(V1SecretReference item);
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> editControllerExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> editOrNewControllerExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<A> editOrNewControllerExpandSecretRefLike(V1SecretReference item);
  
  /**
   * This method has been deprecated, please use method buildControllerPublishSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getControllerPublishSecretRef();
  public V1SecretReference buildControllerPublishSecretRef();
  public A withControllerPublishSecretRef(V1SecretReference controllerPublishSecretRef);
  public Boolean hasControllerPublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> withNewControllerPublishSecretRefLike(V1SecretReference item);
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editControllerPublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<A> editOrNewControllerPublishSecretRefLike(V1SecretReference item);
  public String getDriver();
  public A withDriver(String driver);
  public Boolean hasDriver();
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  
  /**
   * This method has been deprecated, please use method buildNodeExpandSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getNodeExpandSecretRef();
  public V1SecretReference buildNodeExpandSecretRef();
  public A withNodeExpandSecretRef(V1SecretReference nodeExpandSecretRef);
  public Boolean hasNodeExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> withNewNodeExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> withNewNodeExpandSecretRefLike(V1SecretReference item);
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> editNodeExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> editOrNewNodeExpandSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<A> editOrNewNodeExpandSecretRefLike(V1SecretReference item);
  
  /**
   * This method has been deprecated, please use method buildNodePublishSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getNodePublishSecretRef();
  public V1SecretReference buildNodePublishSecretRef();
  public A withNodePublishSecretRef(V1SecretReference nodePublishSecretRef);
  public Boolean hasNodePublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> withNewNodePublishSecretRefLike(V1SecretReference item);
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editNodePublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<A> editOrNewNodePublishSecretRefLike(V1SecretReference item);
  
  /**
   * This method has been deprecated, please use method buildNodeStageSecretRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretReference getNodeStageSecretRef();
  public V1SecretReference buildNodeStageSecretRef();
  public A withNodeStageSecretRef(V1SecretReference nodeStageSecretRef);
  public Boolean hasNodeStageSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> withNewNodeStageSecretRefLike(V1SecretReference item);
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editNodeStageSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRef();
  public V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<A> editOrNewNodeStageSecretRefLike(V1SecretReference item);
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
  public String getVolumeHandle();
  public A withVolumeHandle(String volumeHandle);
  public Boolean hasVolumeHandle();
  public A withReadOnly();
  public interface ControllerExpandSecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1CSIPersistentVolumeSourceFluent.ControllerExpandSecretRefNested<N>>{
    public N and();
    public N endControllerExpandSecretRef();
    
  }
  public interface ControllerPublishSecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1CSIPersistentVolumeSourceFluent.ControllerPublishSecretRefNested<N>>{
    public N and();
    public N endControllerPublishSecretRef();
    
  }
  public interface NodeExpandSecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1CSIPersistentVolumeSourceFluent.NodeExpandSecretRefNested<N>>{
    public N and();
    public N endNodeExpandSecretRef();
    
  }
  public interface NodePublishSecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1CSIPersistentVolumeSourceFluent.NodePublishSecretRefNested<N>>{
    public N and();
    public N endNodePublishSecretRef();
    
  }
  public interface NodeStageSecretRefNested<N> extends Nested<N>,V1SecretReferenceFluent<V1CSIPersistentVolumeSourceFluent.NodeStageSecretRefNested<N>>{
    public N and();
    public N endNodeStageSecretRef();
    
  }
  
}