package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1VsphereVirtualDiskVolumeSourceFluent<A extends V1VsphereVirtualDiskVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public String getStoragePolicyID();
  public A withStoragePolicyID(String storagePolicyID);
  public Boolean hasStoragePolicyID();
  public String getStoragePolicyName();
  public A withStoragePolicyName(String storagePolicyName);
  public Boolean hasStoragePolicyName();
  public String getVolumePath();
  public A withVolumePath(String volumePath);
  public Boolean hasVolumePath();
  
}