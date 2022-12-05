package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodReadinessGateFluent<A extends V1PodReadinessGateFluent<A>> extends Fluent<A>{
  public String getConditionType();
  public A withConditionType(String conditionType);
  public Boolean hasConditionType();
  
}