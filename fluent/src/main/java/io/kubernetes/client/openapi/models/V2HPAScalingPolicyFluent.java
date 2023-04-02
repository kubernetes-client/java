package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V2HPAScalingPolicyFluent<A extends V2HPAScalingPolicyFluent<A>> extends Fluent<A>{
  public Integer getPeriodSeconds();
  public A withPeriodSeconds(Integer periodSeconds);
  public Boolean hasPeriodSeconds();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  public Integer getValue();
  public A withValue(Integer value);
  public Boolean hasValue();
  
}