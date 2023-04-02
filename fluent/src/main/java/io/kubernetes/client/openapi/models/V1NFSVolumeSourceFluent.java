package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NFSVolumeSourceFluent<A extends V1NFSVolumeSourceFluent<A>> extends Fluent<A>{
  public String getPath();
  public A withPath(String path);
  public Boolean hasPath();
  public Boolean getReadOnly();
  public A withReadOnly(Boolean readOnly);
  public Boolean hasReadOnly();
  public String getServer();
  public A withServer(String server);
  public Boolean hasServer();
  public A withReadOnly();
  
}