package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodIPFluent<A extends io.kubernetes.client.openapi.models.V1PodIPFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getIp();
  public A withIp(java.lang.String ip);
  public java.lang.Boolean hasIp();
  
  /**
   * Method is deprecated. use withIp instead.
   */
  @java.lang.Deprecated
  public A withNewIp(java.lang.String arg0);
  
}