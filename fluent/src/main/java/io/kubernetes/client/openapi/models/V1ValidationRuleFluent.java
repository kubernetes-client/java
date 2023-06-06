package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ValidationRuleFluent<A extends V1ValidationRuleFluent<A>> extends Fluent<A>{
  public String getMessage();
  public A withMessage(String message);
  public Boolean hasMessage();
  public String getMessageExpression();
  public A withMessageExpression(String messageExpression);
  public Boolean hasMessageExpression();
  public String getRule();
  public A withRule(String rule);
  public Boolean hasRule();
  
}