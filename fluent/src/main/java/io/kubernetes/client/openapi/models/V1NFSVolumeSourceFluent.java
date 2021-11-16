package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NFSVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  
  /**
   * Method is deprecated. use withPath instead.
   */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String arg0);
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  public java.lang.String getServer();
  public A withServer(java.lang.String server);
  public java.lang.Boolean hasServer();
  
  /**
   * Method is deprecated. use withServer instead.
   */
  @java.lang.Deprecated
  public A withNewServer(java.lang.String arg0);
  
}