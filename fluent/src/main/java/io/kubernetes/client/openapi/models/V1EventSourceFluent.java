package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EventSourceFluent<A extends io.kubernetes.client.openapi.models.V1EventSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getComponent();
  public A withComponent(java.lang.String component);
  public java.lang.Boolean hasComponent();
  
  /**
   * Method is deprecated. use withComponent instead.
   */
  @java.lang.Deprecated
  public A withNewComponent(java.lang.String arg0);
  public java.lang.String getHost();
  public A withHost(java.lang.String host);
  public java.lang.Boolean hasHost();
  
  /**
   * Method is deprecated. use withHost instead.
   */
  @java.lang.Deprecated
  public A withNewHost(java.lang.String arg0);
  
}