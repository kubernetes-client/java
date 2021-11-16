package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1GroupVersionForDiscoveryFluent<A extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getGroupVersion();
  public A withGroupVersion(java.lang.String groupVersion);
  public java.lang.Boolean hasGroupVersion();
  
  /**
   * Method is deprecated. use withGroupVersion instead.
   */
  @java.lang.Deprecated
  public A withNewGroupVersion(java.lang.String arg0);
  public java.lang.String getVersion();
  public A withVersion(java.lang.String version);
  public java.lang.Boolean hasVersion();
  
  /**
   * Method is deprecated. use withVersion instead.
   */
  @java.lang.Deprecated
  public A withNewVersion(java.lang.String arg0);
  
}