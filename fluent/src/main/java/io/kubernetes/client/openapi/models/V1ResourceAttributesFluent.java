package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ResourceAttributesFluent<A extends io.kubernetes.client.openapi.models.V1ResourceAttributesFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getGroup();
  public A withGroup(java.lang.String group);
  public java.lang.Boolean hasGroup();
  
  /**
   * Method is deprecated. use withGroup instead.
   */
  @java.lang.Deprecated
  public A withNewGroup(java.lang.String original);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  public java.lang.String getNamespace();
  public A withNamespace(java.lang.String namespace);
  public java.lang.Boolean hasNamespace();
  
  /**
   * Method is deprecated. use withNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original);
  public java.lang.String getResource();
  public A withResource(java.lang.String resource);
  public java.lang.Boolean hasResource();
  
  /**
   * Method is deprecated. use withResource instead.
   */
  @java.lang.Deprecated
  public A withNewResource(java.lang.String original);
  public java.lang.String getSubresource();
  public A withSubresource(java.lang.String subresource);
  public java.lang.Boolean hasSubresource();
  
  /**
   * Method is deprecated. use withSubresource instead.
   */
  @java.lang.Deprecated
  public A withNewSubresource(java.lang.String original);
  public java.lang.String getVerb();
  public A withVerb(java.lang.String verb);
  public java.lang.Boolean hasVerb();
  
  /**
   * Method is deprecated. use withVerb instead.
   */
  @java.lang.Deprecated
  public A withNewVerb(java.lang.String original);
  public java.lang.String getVersion();
  public A withVersion(java.lang.String version);
  public java.lang.Boolean hasVersion();
  
  /**
   * Method is deprecated. use withVersion instead.
   */
  @java.lang.Deprecated
  public A withNewVersion(java.lang.String original);
  
}