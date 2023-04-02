package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodIPFluent<A extends V1PodIPFluent<A>> extends Fluent<A>{
  public String getIp();
  public A withIp(String ip);
  public Boolean hasIp();
  
}