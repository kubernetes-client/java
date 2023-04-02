package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1DaemonEndpointFluent<A extends V1DaemonEndpointFluent<A>> extends Fluent<A>{
  public Integer getPort();
  public A withPort(Integer port);
  public Boolean hasPort();
  
}