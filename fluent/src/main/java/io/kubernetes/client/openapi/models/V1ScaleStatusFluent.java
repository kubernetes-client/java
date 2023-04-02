package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1ScaleStatusFluent<A extends V1ScaleStatusFluent<A>> extends Fluent<A>{
  public Integer getReplicas();
  public A withReplicas(Integer replicas);
  public Boolean hasReplicas();
  public String getSelector();
  public A withSelector(String selector);
  public Boolean hasSelector();
  
}