package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1AzureDiskVolumeSourceFluent<A extends V1AzureDiskVolumeSourceFluent<A>> extends Fluent<A>{
  public String getCachingMode();
  public A withCachingMode(String cachingMode);
  public Boolean hasCachingMode();
  public String getDiskName();
  public A withDiskName(String diskName);
  public Boolean hasDiskName();
  public String getDiskURI();
  public A withDiskURI(String diskURI);
  public Boolean hasDiskURI();
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public A withReadOnly();
  
}