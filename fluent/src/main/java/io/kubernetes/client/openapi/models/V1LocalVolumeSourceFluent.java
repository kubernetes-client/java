package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1LocalVolumeSourceFluent<A extends V1LocalVolumeSourceFluent<A>> extends Fluent<A>{
  public String getFsType();
  public A withFsType(String fsType);
  public Boolean hasFsType();
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  
}