package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ComponentConditionFluent<A extends V1ComponentConditionFluent<A>> extends Fluent<A>{
  public String getError();
  public A withError(String error);
  public Boolean hasError();
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getStatus();
  public A withStatus(String status);
  public Boolean hasStatus();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}