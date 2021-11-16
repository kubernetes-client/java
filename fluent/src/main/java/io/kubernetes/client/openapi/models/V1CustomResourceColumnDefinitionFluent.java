package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1CustomResourceColumnDefinitionFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceColumnDefinitionFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getDescription();
  public A withDescription(java.lang.String description);
  public java.lang.Boolean hasDescription();
  
  /**
   * Method is deprecated. use withDescription instead.
   */
  @java.lang.Deprecated
  public A withNewDescription(java.lang.String arg0);
  public java.lang.String getFormat();
  public A withFormat(java.lang.String format);
  public java.lang.Boolean hasFormat();
  
  /**
   * Method is deprecated. use withFormat instead.
   */
  @java.lang.Deprecated
  public A withNewFormat(java.lang.String arg0);
  public java.lang.String getJsonPath();
  public A withJsonPath(java.lang.String jsonPath);
  public java.lang.Boolean hasJsonPath();
  
  /**
   * Method is deprecated. use withJsonPath instead.
   */
  @java.lang.Deprecated
  public A withNewJsonPath(java.lang.String arg0);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0);
  public java.lang.Integer getPriority();
  public A withPriority(java.lang.Integer priority);
  public java.lang.Boolean hasPriority();
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String arg0);
  
}