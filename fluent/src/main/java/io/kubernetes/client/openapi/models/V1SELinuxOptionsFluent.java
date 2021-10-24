package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1SELinuxOptionsFluent<A extends io.kubernetes.client.openapi.models.V1SELinuxOptionsFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getLevel();
  public A withLevel(java.lang.String level);
  public java.lang.Boolean hasLevel();
  
  /**
   * Method is deprecated. use withLevel instead.
   */
  @java.lang.Deprecated
  public A withNewLevel(java.lang.String original);
  public java.lang.String getRole();
  public A withRole(java.lang.String role);
  public java.lang.Boolean hasRole();
  
  /**
   * Method is deprecated. use withRole instead.
   */
  @java.lang.Deprecated
  public A withNewRole(java.lang.String original);
  public java.lang.String getType();
  public A withType(java.lang.String type);
  public java.lang.Boolean hasType();
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String original);
  public java.lang.String getUser();
  public A withUser(java.lang.String user);
  public java.lang.Boolean hasUser();
  
  /**
   * Method is deprecated. use withUser instead.
   */
  @java.lang.Deprecated
  public A withNewUser(java.lang.String original);
  
}