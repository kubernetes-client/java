package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GRPCActionFluent<A extends io.kubernetes.client.openapi.models.V1GRPCActionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  public java.lang.String getService();
  public A withService(java.lang.String service);
  public java.lang.Boolean hasService();
  
  /**
   * Method is deprecated. use withService instead.
   */
  @java.lang.Deprecated
  public A withNewService(java.lang.String original);
  
}