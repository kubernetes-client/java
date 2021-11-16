package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VolumeAttachmentSourceFluent<A extends io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildInlineVolumeSpec instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec getInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec buildInlineVolumeSpec();
  public A withInlineVolumeSpec(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec inlineVolumeSpec);
  public java.lang.Boolean hasInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> withNewInlineVolumeSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpec();
  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<A> editOrNewInlineVolumeSpecLike(io.kubernetes.client.openapi.models.V1PersistentVolumeSpec item);
  public java.lang.String getPersistentVolumeName();
  public A withPersistentVolumeName(java.lang.String persistentVolumeName);
  public java.lang.Boolean hasPersistentVolumeName();
  
  /**
   * Method is deprecated. use withPersistentVolumeName instead.
   */
  @java.lang.Deprecated
  public A withNewPersistentVolumeName(java.lang.String arg0);
  public interface InlineVolumeSpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent<io.kubernetes.client.openapi.models.V1VolumeAttachmentSourceFluent.InlineVolumeSpecNested<N>>{
    public N and();
    public N endInlineVolumeSpec();
    
  }
  
}