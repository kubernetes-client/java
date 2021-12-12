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
public interface V1ContainerPortFluent<A extends io.kubernetes.client.openapi.models.V1ContainerPortFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getContainerPort();
  public A withContainerPort(java.lang.Integer containerPort);
  public java.lang.Boolean hasContainerPort();
  public java.lang.String getHostIP();
  public A withHostIP(java.lang.String hostIP);
  public java.lang.Boolean hasHostIP();
  
  /**
   * Method is deprecated. use withHostIP instead.
   */
  @java.lang.Deprecated
  public A withNewHostIP(java.lang.String original);
  public java.lang.Integer getHostPort();
  public A withHostPort(java.lang.Integer hostPort);
  public java.lang.Boolean hasHostPort();
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  public io.kubernetes.client.openapi.models.V1ContainerPort.ProtocolEnum getProtocol();
  public A withProtocol(io.kubernetes.client.openapi.models.V1ContainerPort.ProtocolEnum protocol);
  public java.lang.Boolean hasProtocol();
  
}