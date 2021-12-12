package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ComponentConditionFluent<A extends io.kubernetes.client.openapi.models.V1ComponentConditionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getError();
  public A withError(java.lang.String error);
  public java.lang.Boolean hasError();
  
  /**
   * Method is deprecated. use withError instead.
   */
  @java.lang.Deprecated
  public A withNewError(java.lang.String original);
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original);
  public java.lang.String getStatus();
  public A withStatus(java.lang.String status);
  public java.lang.Boolean hasStatus();
  
  /**
   * Method is deprecated. use withStatus instead.
   */
  @java.lang.Deprecated
  public A withNewStatus(java.lang.String original);
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);
  
}