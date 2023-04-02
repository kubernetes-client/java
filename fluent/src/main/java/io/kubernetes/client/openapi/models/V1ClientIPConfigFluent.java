package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ClientIPConfigFluent<A extends V1ClientIPConfigFluent<A>> extends Fluent<A>{
  public Integer getTimeoutSeconds();
  public A withTimeoutSeconds(Integer timeoutSeconds);
  public Boolean hasTimeoutSeconds();
  
}