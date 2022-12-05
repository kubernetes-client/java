package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ScaleSpecFluent<A extends V1ScaleSpecFluent<A>> extends Fluent<A>{
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  
}