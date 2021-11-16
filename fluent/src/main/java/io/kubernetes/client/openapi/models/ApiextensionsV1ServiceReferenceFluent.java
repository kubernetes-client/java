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
public interface ApiextensionsV1ServiceReferenceFluent<A extends io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReferenceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0);
  public java.lang.String getNamespace();
  public A withNamespace(java.lang.String namespace);
  public java.lang.Boolean hasNamespace();
  
  /**
   * Method is deprecated. use withNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String arg0);
  public java.lang.String getPath();
  public A withPath(java.lang.String path);
  public java.lang.Boolean hasPath();
  
  /**
   * Method is deprecated. use withPath instead.
   */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String arg0);
  public java.lang.Integer getPort();
  public A withPort(java.lang.Integer port);
  public java.lang.Boolean hasPort();
  
}