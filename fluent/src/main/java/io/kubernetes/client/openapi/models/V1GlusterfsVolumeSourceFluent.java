package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GlusterfsVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getEndpoints();
  public A withEndpoints(java.lang.String endpoints);
  public java.lang.Boolean hasEndpoints();
  
  /**
   * Method is deprecated. use withEndpoints instead.
   */
  @java.lang.Deprecated
  public A withNewEndpoints(java.lang.String arg0);
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
  
}