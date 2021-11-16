package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.custom.IntOrString;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NetworkPolicyPortFluent<A extends io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getEndPort();
  public A withEndPort(java.lang.Integer endPort);
  public java.lang.Boolean hasEndPort();
  public io.kubernetes.client.custom.IntOrString getPort();
  public A withPort(io.kubernetes.client.custom.IntOrString port);
  public java.lang.Boolean hasPort();
  public A withNewPort(int value);
  public A withNewPort(java.lang.String value);
  public java.lang.String getProtocol();
  public A withProtocol(java.lang.String protocol);
  public java.lang.Boolean hasProtocol();
  
  /**
   * Method is deprecated. use withProtocol instead.
   */
  @java.lang.Deprecated
  public A withNewProtocol(java.lang.String arg0);
  
}