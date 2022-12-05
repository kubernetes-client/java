package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1EndpointConditionsFluent<A extends V1EndpointConditionsFluent<A>> extends Fluent<A>{
  public Boolean getReady();
  public A withReady(Boolean ready);
  public Boolean hasReady();
  public Boolean getServing();
  public A withServing(Boolean serving);
  public Boolean hasServing();
  public Boolean getTerminating();
  public A withTerminating(Boolean terminating);
  public Boolean hasTerminating();
  public A withReady();
  public A withServing();
  public A withTerminating();
  
}