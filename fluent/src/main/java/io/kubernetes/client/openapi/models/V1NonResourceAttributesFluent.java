package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NonResourceAttributesFluent<A extends io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  
  /**
   * Method is deprecated. use withPath instead.
   */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String arg0);
  public java.lang.String getVerb();
  public A withVerb(java.lang.String verb);
  public java.lang.Boolean hasVerb();
  
  /**
   * Method is deprecated. use withVerb instead.
   */
  @java.lang.Deprecated
  public A withNewVerb(java.lang.String arg0);
  
}