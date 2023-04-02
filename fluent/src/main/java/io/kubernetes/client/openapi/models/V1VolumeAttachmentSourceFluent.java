package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeAttachmentSourceFluent<A extends V1VolumeAttachmentSourceFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildInlineVolumeSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeSpec getInlineVolumeSpec();
  public V1PersistentVolumeSpec buildInlineVolumeSpec();
  public A withInlineVolumeSpec(V1PersistentVolumeSpec inlineVolumeSpec);
  public Boolean hasInlineVolumeSpec();
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpec();
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpecLike(V1PersistentVolumeSpec item);
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editInlineVolumeSpec();
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpec();
  public V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpecLike(V1PersistentVolumeSpec item);
  public String getPersistentVolumeName();
  public A withPersistentVolumeName(String persistentVolumeName);
  public Boolean hasPersistentVolumeName();
  public interface InlineVolumeSpecNested<N> extends Nested<N>,V1PersistentVolumeSpecFluent<V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>>{
    public N and();
    public N endInlineVolumeSpec();
    
  }
  
}