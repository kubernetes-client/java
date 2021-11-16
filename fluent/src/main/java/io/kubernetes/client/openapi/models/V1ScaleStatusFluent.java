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
public interface V1ScaleStatusFluent<A extends io.kubernetes.client.openapi.models.V1ScaleStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.Integer getReplicas();
  public A withReplicas(java.lang.Integer replicas);
  public java.lang.Boolean hasReplicas();
  public java.lang.String getSelector();
  public A withSelector(java.lang.String selector);
  public java.lang.Boolean hasSelector();
  
  /**
   * Method is deprecated. use withSelector instead.
   */
  @java.lang.Deprecated
  public A withNewSelector(java.lang.String arg0);
  
}