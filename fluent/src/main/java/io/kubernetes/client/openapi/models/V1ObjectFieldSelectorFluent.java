package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ObjectFieldSelectorFluent<A extends io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getApiVersion();
  public A withApiVersion(java.lang.String apiVersion);
  public java.lang.Boolean hasApiVersion();
  
  /**
   * Method is deprecated. use withApiVersion instead.
   */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String arg0);
  public java.lang.String getFieldPath();
  public A withFieldPath(java.lang.String fieldPath);
  public java.lang.Boolean hasFieldPath();
  
  /**
   * Method is deprecated. use withFieldPath instead.
   */
  @java.lang.Deprecated
  public A withNewFieldPath(java.lang.String arg0);
  
}