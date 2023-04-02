package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServicePortFluent<A extends V1ServicePortFluent<A>> extends Fluent<A>{
  public String getAppProtocol();
  public A withAppProtocol(String appProtocol);
  public Boolean hasAppProtocol();
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Integer getNodePort();
  public A withNodePort(Integer nodePort);
  public Boolean hasNodePort();
  public Integer getPort();
  public A withPort(Integer port);
  public Boolean hasPort();
  public String getProtocol();
  public A withProtocol(String protocol);
  public Boolean hasProtocol();
  public IntOrString getTargetPort();
  public A withTargetPort(IntOrString targetPort);
  public Boolean hasTargetPort();
  public A withNewTargetPort(int value);
  public A withNewTargetPort(String value);
  
}