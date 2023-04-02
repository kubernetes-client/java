package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1PodFailurePolicyOnPodConditionsPatternFluent<A extends V1PodFailurePolicyOnPodConditionsPatternFluent<A>> extends Fluent<A>{
  public String getStatus();
  public A withStatus(String status);
  public Boolean hasStatus();
  public String getType();
  public A withType(String type);
  public Boolean hasType();
  
}