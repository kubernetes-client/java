package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeConfigSourceFluent<A extends V1NodeConfigSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapNodeConfigSource getConfigMap();
  public V1ConfigMapNodeConfigSource buildConfigMap();
  public A withConfigMap(V1ConfigMapNodeConfigSource configMap);
  public Boolean hasConfigMap();
  public V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMap();
  public V1NodeConfigSourceFluent.ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapNodeConfigSource item);
  public V1NodeConfigSourceFluent.ConfigMapNested<A> editConfigMap();
  public V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMap();
  public V1NodeConfigSourceFluent.ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapNodeConfigSource item);
  public interface ConfigMapNested<N> extends Nested<N>,V1ConfigMapNodeConfigSourceFluent<V1NodeConfigSourceFluent.ConfigMapNested<N>>{
    public N and();
    public N endConfigMap();
    
  }
  
}