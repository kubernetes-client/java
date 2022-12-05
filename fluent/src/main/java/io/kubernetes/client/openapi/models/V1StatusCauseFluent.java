package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatusCauseFluent<A extends V1StatusCauseFluent<A>> extends Fluent<A>{
  public String getField();
  public A withField(String field);
  public Boolean hasField();
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  
}