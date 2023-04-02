package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1HostPathVolumeSourceFluent<A extends V1HostPathVolumeSourceFluent<A>> extends Fluent<A>{
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}