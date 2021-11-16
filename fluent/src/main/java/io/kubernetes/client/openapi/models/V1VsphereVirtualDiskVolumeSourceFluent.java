package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VsphereVirtualDiskVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getFsType();
  public A withFsType(java.lang.String fsType);
  public java.lang.Boolean hasFsType();
  
  /**
   * Method is deprecated. use withFsType instead.
   */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String arg0);
  public java.lang.String getStoragePolicyID();
  public A withStoragePolicyID(java.lang.String storagePolicyID);
  public java.lang.Boolean hasStoragePolicyID();
  
  /**
   * Method is deprecated. use withStoragePolicyID instead.
   */
  @java.lang.Deprecated
  public A withNewStoragePolicyID(java.lang.String arg0);
  public java.lang.String getStoragePolicyName();
  public A withStoragePolicyName(java.lang.String storagePolicyName);
  public java.lang.Boolean hasStoragePolicyName();
  
  /**
   * Method is deprecated. use withStoragePolicyName instead.
   */
  @java.lang.Deprecated
  public A withNewStoragePolicyName(java.lang.String arg0);
  public java.lang.String getVolumePath();
  public A withVolumePath(java.lang.String volumePath);
  public java.lang.Boolean hasVolumePath();
  
  /**
   * Method is deprecated. use withVolumePath instead.
   */
  @java.lang.Deprecated
  public A withNewVolumePath(java.lang.String arg0);
  
}