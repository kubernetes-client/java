package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1ValidationFluent<A extends V1alpha1ValidationFluent<A>> extends Fluent<A>{
  public String getExpression();
  public A withExpression(String expression);
  public Boolean hasExpression();
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getMessageExpression();
  public A withMessageExpression(String messageExpression);
  public Boolean hasMessageExpression();
  public String getReason();
  public A withReason(String reason);
  public Boolean hasReason();
  
}