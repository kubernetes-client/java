package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GCEPersistentDiskVolumeSourceFluent<A extends V1GCEPersistentDiskVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public Integer getPartition();
  public A withPartition(Integer partition);
  public Boolean hasPartition();
  public String getPdName();
  public A withPdName(String pdName);
  public Boolean hasPdName();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public A withReadOnly();
  
}