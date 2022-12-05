package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2QueuingConfigurationFluent<A extends V1beta2QueuingConfigurationFluent<A>> extends Fluent<A>{
  public Integer getHandSize();
  public A withHandSize(Integer handSize);
  public Boolean hasHandSize();
  public Integer getQueueLengthLimit();
  public A withQueueLengthLimit(Integer queueLengthLimit);
  public Boolean hasQueueLengthLimit();
  public Integer getQueues();
  public A withQueues(Integer queues);
  public Boolean hasQueues();
  
}