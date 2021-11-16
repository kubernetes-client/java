package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1AllowedHostPathFluent<A extends io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getPathPrefix();
  public A withPathPrefix(java.lang.String pathPrefix);
  public java.lang.Boolean hasPathPrefix();
  
  /**
   * Method is deprecated. use withPathPrefix instead.
   */
  @java.lang.Deprecated
  public A withNewPathPrefix(java.lang.String arg0);
  public java.lang.Boolean getReadOnly();
  public A withReadOnly(java.lang.Boolean readOnly);
  public java.lang.Boolean hasReadOnly();
  
}