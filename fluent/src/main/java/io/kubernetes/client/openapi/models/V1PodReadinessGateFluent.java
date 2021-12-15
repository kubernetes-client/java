package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodReadinessGateFluent<A extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public io.kubernetes.client.openapi.models.V1PodReadinessGate.ConditionTypeEnum getConditionType();
  public A withConditionType(io.kubernetes.client.openapi.models.V1PodReadinessGate.ConditionTypeEnum conditionType);
  public java.lang.Boolean hasConditionType();
  
}