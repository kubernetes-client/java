package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeClaimTemplateFluent<A extends V1PersistentVolumeClaimTemplateFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();
  public V1ObjectMeta buildMetadata();
  public A withMetadata(V1ObjectMeta metadata);
  public Boolean hasMetadata();
  public V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> withNewMetadata();
  public V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> editMetadata();
  public V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> editOrNewMetadata();
  public V1PersistentVolumeClaimTemplateFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimSpec getSpec();
  public V1PersistentVolumeClaimSpec buildSpec();
  public A withSpec(V1PersistentVolumeClaimSpec spec);
  public Boolean hasSpec();
  public V1PersistentVolumeClaimTemplateFluent.SpecNested<A> withNewSpec();
  public V1PersistentVolumeClaimTemplateFluent.SpecNested<A> withNewSpecLike(V1PersistentVolumeClaimSpec item);
  public V1PersistentVolumeClaimTemplateFluent.SpecNested<A> editSpec();
  public V1PersistentVolumeClaimTemplateFluent.SpecNested<A> editOrNewSpec();
  public V1PersistentVolumeClaimTemplateFluent.SpecNested<A> editOrNewSpecLike(V1PersistentVolumeClaimSpec item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1PersistentVolumeClaimTemplateFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1PersistentVolumeClaimSpecFluent<V1PersistentVolumeClaimTemplateFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  
}