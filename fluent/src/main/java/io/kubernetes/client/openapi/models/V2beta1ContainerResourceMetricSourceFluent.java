package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2beta1ContainerResourceMetricSourceFluent<A extends io.kubernetes.client.openapi.models.V2beta1ContainerResourceMetricSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getContainer();
  public A withContainer(java.lang.String container);
  public java.lang.Boolean hasContainer();
  
  /**
   * Method is deprecated. use withContainer instead.
   */
  @java.lang.Deprecated
  public A withNewContainer(java.lang.String original);
  public java.lang.String getName();
  public A withName(java.lang.String name);
  public java.lang.Boolean hasName();
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);
  public java.lang.Integer getTargetAverageUtilization();
  public A withTargetAverageUtilization(java.lang.Integer targetAverageUtilization);
  public java.lang.Boolean hasTargetAverageUtilization();
  public io.kubernetes.client.custom.Quantity getTargetAverageValue();
  public A withTargetAverageValue(io.kubernetes.client.custom.Quantity targetAverageValue);
  public java.lang.Boolean hasTargetAverageValue();
  public A withNewTargetAverageValue(java.lang.String value);
  
}