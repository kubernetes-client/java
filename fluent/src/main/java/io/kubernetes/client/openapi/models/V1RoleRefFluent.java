package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1RoleRefFluent<A extends io.kubernetes.client.openapi.models.V1RoleRefFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiGroup();
  public A withApiGroup(java.lang.String apiGroup);
  public java.lang.Boolean hasApiGroup();
  
  /**
   * Method is deprecated. use withApiGroup instead.
   */
  @java.lang.Deprecated
  public A withNewApiGroup(java.lang.String arg0);
  public java.lang.String getKind();
  public A withKind(java.lang.String kind);
  public java.lang.Boolean hasKind();
  
  /**
   * Method is deprecated. use withKind instead.
   */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String arg0);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0);
  
}