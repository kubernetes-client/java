package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeAttachmentFluent<A extends V1VolumeAttachmentFluent<A>> extends Fluent<A>{
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
  public V1VolumeAttachmentFluent.MetadataNested<A> withNewMetadata();
  public V1VolumeAttachmentFluent.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item);
  public V1VolumeAttachmentFluent.MetadataNested<A> editMetadata();
  public V1VolumeAttachmentFluent.MetadataNested<A> editOrNewMetadata();
  public V1VolumeAttachmentFluent.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item);
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentSpec getSpec();
  public V1VolumeAttachmentSpec buildSpec();
  public A withSpec(V1VolumeAttachmentSpec spec);
  public Boolean hasSpec();
  public V1VolumeAttachmentFluent.SpecNested<A> withNewSpec();
  public V1VolumeAttachmentFluent.SpecNested<A> withNewSpecLike(V1VolumeAttachmentSpec item);
  public V1VolumeAttachmentFluent.SpecNested<A> editSpec();
  public V1VolumeAttachmentFluent.SpecNested<A> editOrNewSpec();
  public V1VolumeAttachmentFluent.SpecNested<A> editOrNewSpecLike(V1VolumeAttachmentSpec item);
  
  /**
   * This method has been deprecated, please use method buildStatus instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeAttachmentStatus getStatus();
  public V1VolumeAttachmentStatus buildStatus();
  public A withStatus(V1VolumeAttachmentStatus status);
  public Boolean hasStatus();
  public V1VolumeAttachmentFluent.StatusNested<A> withNewStatus();
  public V1VolumeAttachmentFluent.StatusNested<A> withNewStatusLike(V1VolumeAttachmentStatus item);
  public V1VolumeAttachmentFluent.StatusNested<A> editStatus();
  public V1VolumeAttachmentFluent.StatusNested<A> editOrNewStatus();
  public V1VolumeAttachmentFluent.StatusNested<A> editOrNewStatusLike(V1VolumeAttachmentStatus item);
  public interface MetadataNested<N> extends Nested<N>,V1ObjectMetaFluent<V1VolumeAttachmentFluent.MetadataNested<N>>{
    public N and();
    public N endMetadata();
    
  }
  public interface SpecNested<N> extends Nested<N>,V1VolumeAttachmentSpecFluent<V1VolumeAttachmentFluent.SpecNested<N>>{
    public N and();
    public N endSpec();
    
  }
  public interface StatusNested<N> extends Nested<N>,V1VolumeAttachmentStatusFluent<V1VolumeAttachmentFluent.StatusNested<N>>{
    public N and();
    public N endStatus();
    
  }
  
}