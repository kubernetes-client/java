package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodReadinessGateFluent<A extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getConditionType();
  public A withConditionType(java.lang.String conditionType);
  public java.lang.Boolean hasConditionType();
  
  /**
   * Method is deprecated. use withConditionType instead.
   */
  @java.lang.Deprecated
  public A withNewConditionType(java.lang.String original);
  
}