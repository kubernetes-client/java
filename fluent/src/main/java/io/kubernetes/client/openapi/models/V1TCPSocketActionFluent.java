package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1TCPSocketActionFluent<A extends V1TCPSocketActionFluent<A>> extends Fluent<A>{
  public String getHost();
  public A withHost(String host);
  public Boolean hasHost();
  public IntOrString getPort();
  public A withPort(IntOrString port);
  public Boolean hasPort();
  public A withNewPort(int value);
  public A withNewPort(String value);
  
}