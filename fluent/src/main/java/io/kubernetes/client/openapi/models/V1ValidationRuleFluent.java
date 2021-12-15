package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ValidationRuleFluent<A extends io.kubernetes.client.openapi.models.V1ValidationRuleFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original);
  public java.lang.String getRule();
  public A withRule(java.lang.String rule);
  public java.lang.Boolean hasRule();
  
  /**
   * Method is deprecated. use withRule instead.
   */
  @java.lang.Deprecated
  public A withNewRule(java.lang.String original);
  
}