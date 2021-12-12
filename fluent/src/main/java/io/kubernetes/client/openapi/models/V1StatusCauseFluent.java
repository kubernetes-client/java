package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1StatusCauseFluent<A extends io.kubernetes.client.openapi.models.V1StatusCauseFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getField();
  public A withField(java.lang.String field);
  public java.lang.Boolean hasField();
  
  /**
   * Method is deprecated. use withField instead.
   */
  @java.lang.Deprecated
  public A withNewField(java.lang.String original);
  public java.lang.String getMessage();
  public A withMessage(java.lang.String message);
  public java.lang.Boolean hasMessage();
  
  /**
   * Method is deprecated. use withMessage instead.
   */
  @java.lang.Deprecated
  public A withNewMessage(java.lang.String original);
  public java.lang.String getReason();
  public A withReason(java.lang.String reason);
  public java.lang.Boolean hasReason();
  
  /**
   * Method is deprecated. use withReason instead.
   */
  @java.lang.Deprecated
  public A withNewReason(java.lang.String original);
  
}