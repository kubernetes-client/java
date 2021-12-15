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
public interface V1PortStatusFluent<A extends io.kubernetes.client.openapi.models.V1PortStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getError();
  public A withError(java.lang.String error);
  public java.lang.Boolean hasError();
  
  /**
   * Method is deprecated. use withError instead.
   */
  @java.lang.Deprecated
  public A withNewError(java.lang.String original);
  public java.lang.Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  public io.kubernetes.client.openapi.models.V1PortStatus.ProtocolEnum getProtocol();
  public A withProtocol(io.kubernetes.client.openapi.models.V1PortStatus.ProtocolEnum protocol);
  public java.lang.Boolean hasProtocol();
  
}