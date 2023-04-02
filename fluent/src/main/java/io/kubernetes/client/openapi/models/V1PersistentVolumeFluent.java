package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeFluent<A extends V1PersistentVolumeFluent<A>> extends Fluent<A>{
  public String getApiVersion();
  public A withApiVersion(String apiVersion);
  public Boolean hasApiVersion();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1PersistentVolumeFluent.MetadataNested<A> withNewMetadata();
  public V1PersistentVolumeFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1PersistentVolumeFluent.MetadataNested<A> editMetadata();
  public V1PersistentVolumeFluent.MetadataNested<A> editOrNewMetadata();
  public V1PersistentVolumeFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeSpec getSpec();
  public V1PersistentVolumeSpec buildSpec();
  public A withSpec(V1PersistentVolumeSpec spec);
  public Boolean hasSpec();
  public V1PersistentVolumeFluent.SpecNested<A> withNewSpec();
  public V1PersistentVolumeFluent.SpecNested<A> withNewSpecLike(V1PersistentVolumeSpec item);
  public V1PersistentVolumeFluent.SpecNested<A> editSpec();
  public V1PersistentVolumeFluent.SpecNested<A> editOrNewSpec();
  public V1PersistentVolumeFluent.SpecNested<A> editOrNewSpecLike(V1PersistentVolumeSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeStatus getStatus();
  public V1PersistentVolumeStatus buildStatus();
  public A withStatus(V1PersistentVolumeStatus status);
  public Boolean hasStatus();
  public V1PersistentVolumeFluent.StatusNested<A> withNewStatus();
  public V1PersistentVolumeFluent.StatusNested<A> withNewStatusLike(V1PersistentVolumeStatus item);
  public V1PersistentVolumeFluent.StatusNested<A> editStatus();
  public V1PersistentVolumeFluent.StatusNested<A> editOrNewStatus();
  public V1PersistentVolumeFluent.StatusNested<A> editOrNewStatusLike(V1PersistentVolumeStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1PersistentVolumeFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1PersistentVolumeSpecFluent<V1PersistentVolumeFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1PersistentVolumeStatusFluent<V1PersistentVolumeFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}