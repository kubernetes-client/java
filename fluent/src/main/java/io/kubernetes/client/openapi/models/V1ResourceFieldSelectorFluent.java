package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ResourceFieldSelectorFluent<A extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getContainerName();
  public A withContainerName(java.lang.String containerName);
  public java.lang.Boolean hasContainerName();
  
  /**
   * Method is deprecated. use withContainerName instead.
   */
  @java.lang.Deprecated
  public A withNewContainerName(java.lang.String arg0);
  public io.kubernetes.client.custom.Quantity getDivisor();
  public A withDivisor(io.kubernetes.client.custom.Quantity divisor);
  public java.lang.Boolean hasDivisor();
  public A withNewDivisor(java.lang.String value);
  public java.lang.String getResource();
  public A withResource(java.lang.String resource);
  public java.lang.Boolean hasResource();
  
  /**
   * Method is deprecated. use withResource instead.
   */
  @java.lang.Deprecated
  public A withNewResource(java.lang.String arg0);
  
}