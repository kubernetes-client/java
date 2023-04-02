package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DownwardAPIVolumeFileFluent<A extends V1DownwardAPIVolumeFileFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectFieldSelector getFieldRef();
  public V1ObjectFieldSelector buildFieldRef();
  public A withFieldRef(V1ObjectFieldSelector fieldRef);
  public Boolean hasFieldRef();
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRef();
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> withNewFieldRefLike(V1ObjectFieldSelector item);
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editFieldRef();
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRef();
  public V1DownwardAPIVolumeFileFluent.FieldRefNested<A> editOrNewFieldRefLike(V1ObjectFieldSelector item);
  public Integer getMode();
  public A withMode(Integer mode);
  public Boolean hasMode();
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  
  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ResourceFieldSelector getResourceFieldRef();
  public V1ResourceFieldSelector buildResourceFieldRef();
  public A withResourceFieldRef(V1ResourceFieldSelector resourceFieldRef);
  public Boolean hasResourceFieldRef();
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRef();
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> withNewResourceFieldRefLike(V1ResourceFieldSelector item);
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editResourceFieldRef();
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRef();
  public V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<A> editOrNewResourceFieldRefLike(V1ResourceFieldSelector item);
  public interface FieldRefNested<N> extends Nested<N>,V1ObjectFieldSelectorFluent<V1DownwardAPIVolumeFileFluent.FieldRefNested<N>>{
    public N and();
    public N endFieldRef();
    
  }
  public interface ResourceFieldRefNested<N> extends Nested<N>,V1ResourceFieldSelectorFluent<V1DownwardAPIVolumeFileFluent.ResourceFieldRefNested<N>>{
    public N and();
    public N endResourceFieldRef();
    
  }
  
}