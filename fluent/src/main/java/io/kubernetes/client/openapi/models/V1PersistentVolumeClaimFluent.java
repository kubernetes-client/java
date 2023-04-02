package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PersistentVolumeClaimFluent<A extends V1PersistentVolumeClaimFluent<A>> extends Fluent<A>{
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
  public V1PersistentVolumeClaimFluent.MetadataNested<A> withNewMetadata();
  public V1PersistentVolumeClaimFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1PersistentVolumeClaimFluent.MetadataNested<A> editMetadata();
  public V1PersistentVolumeClaimFluent.MetadataNested<A> editOrNewMetadata();
  public V1PersistentVolumeClaimFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimSpec getSpec();
  public V1PersistentVolumeClaimSpec buildSpec();
  public A withSpec(V1PersistentVolumeClaimSpec spec);
  public Boolean hasSpec();
  public V1PersistentVolumeClaimFluent.SpecNested<A> withNewSpec();
  public V1PersistentVolumeClaimFluent.SpecNested<A> withNewSpecLike(V1PersistentVolumeClaimSpec item);
  public V1PersistentVolumeClaimFluent.SpecNested<A> editSpec();
  public V1PersistentVolumeClaimFluent.SpecNested<A> editOrNewSpec();
  public V1PersistentVolumeClaimFluent.SpecNested<A> editOrNewSpecLike(V1PersistentVolumeClaimSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimStatus getStatus();
  public V1PersistentVolumeClaimStatus buildStatus();
  public A withStatus(V1PersistentVolumeClaimStatus status);
  public Boolean hasStatus();
  public V1PersistentVolumeClaimFluent.StatusNested<A> withNewStatus();
  public V1PersistentVolumeClaimFluent.StatusNested<A> withNewStatusLike(V1PersistentVolumeClaimStatus item);
  public V1PersistentVolumeClaimFluent.StatusNested<A> editStatus();
  public V1PersistentVolumeClaimFluent.StatusNested<A> editOrNewStatus();
  public V1PersistentVolumeClaimFluent.StatusNested<A> editOrNewStatusLike(V1PersistentVolumeClaimStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1PersistentVolumeClaimFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1PersistentVolumeClaimSpecFluent<V1PersistentVolumeClaimFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1PersistentVolumeClaimStatusFluent<V1PersistentVolumeClaimFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}