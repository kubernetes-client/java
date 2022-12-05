package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ServiceBackendPortFluent<A extends V1ServiceBackendPortFluent<A>> extends Fluent<A>{
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public Integer getNumber();
  public A withNumber(Integer number);
  public Boolean hasNumber();
  
}