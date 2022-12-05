package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ContainerPortFluent<A extends V1ContainerPortFluent<A>> extends Fluent<A>{
  public Integer getContainerPort();
  public A withContainerPort(Integer containerPort);
  public Boolean hasContainerPort();
  public String getHostIP();
  public A withHostIP(String hostIP);
  public Boolean hasHostIP();
  public Integer getHostPort();
  public A withHostPort(Integer hostPort);
  public Boolean hasHostPort();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getProtocol();
  public A withProtocol(String protocol);
  public Boolean hasProtocol();
  
}