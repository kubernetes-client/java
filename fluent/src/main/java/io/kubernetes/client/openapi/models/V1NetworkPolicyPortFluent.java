package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NetworkPolicyPortFluent<A extends V1NetworkPolicyPortFluent<A>> extends Fluent<A>{
  public Integer getEndPort();
  public A withEndPort(Integer endPort);
  public Boolean hasEndPort();
  public IntOrString getPort();
  public A withPort(IntOrString port);
  public Boolean hasPort();
  public A withNewPort(int value);
  public A withNewPort(String value);
  public String getProtocol();
  public A withProtocol(String protocol);
  public Boolean hasProtocol();
  
}