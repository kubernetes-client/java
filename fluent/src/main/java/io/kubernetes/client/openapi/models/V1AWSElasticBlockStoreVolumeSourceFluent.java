package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AWSElasticBlockStoreVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getFsType();
  public A withFsType(java.lang.String fsType);
  public java.lang.Boolean hasFsType();
  
  /**
   * Method is deprecated. use withFsType instead.
   */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String arg0);
  public java.lang.Integer getPartition();
  public A withPartition(java.lang.Integer partition);
  public java.lang.Boolean hasPartition();
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getVolumeID();
  public A withVolumeID(java.lang.String volumeID);
  public java.lang.Boolean hasVolumeID();
  
  /**
   * Method is deprecated. use withVolumeID instead.
   */
  @java.lang.Deprecated
  public A withNewVolumeID(java.lang.String arg0);
  
}