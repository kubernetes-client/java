package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1QueuingConfigurationFluent<A extends V1QueuingConfigurationFluent<A>> extends BaseFluent<A>{
  public V1QueuingConfigurationFluent() {
  }
  
  public V1QueuingConfigurationFluent(V1QueuingConfiguration instance) {
    this.copyInstance(instance);
  }
  private Integer handSize;
  private Integer queueLengthLimit;
  private Integer queues;
  
  protected void copyInstance(V1QueuingConfiguration instance) {
    instance = (instance != null ? instance : new V1QueuingConfiguration());
    if (instance != null) {
          this.withHandSize(instance.getHandSize());
          this.withQueueLengthLimit(instance.getQueueLengthLimit());
          this.withQueues(instance.getQueues());
        }
  }
  
  public Integer getHandSize() {
    return this.handSize;
  }
  
  public A withHandSize(Integer handSize) {
    this.handSize = handSize;
    return (A) this;
  }
  
  public boolean hasHandSize() {
    return this.handSize != null;
  }
  
  public Integer getQueueLengthLimit() {
    return this.queueLengthLimit;
  }
  
  public A withQueueLengthLimit(Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
    return (A) this;
  }
  
  public boolean hasQueueLengthLimit() {
    return this.queueLengthLimit != null;
  }
  
  public Integer getQueues() {
    return this.queues;
  }
  
  public A withQueues(Integer queues) {
    this.queues = queues;
    return (A) this;
  }
  
  public boolean hasQueues() {
    return this.queues != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1QueuingConfigurationFluent that = (V1QueuingConfigurationFluent) o;
    if (!java.util.Objects.equals(handSize, that.handSize)) return false;
    if (!java.util.Objects.equals(queueLengthLimit, that.queueLengthLimit)) return false;
    if (!java.util.Objects.equals(queues, that.queues)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(handSize,  queueLengthLimit,  queues,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (handSize != null) { sb.append("handSize:"); sb.append(handSize + ","); }
    if (queueLengthLimit != null) { sb.append("queueLengthLimit:"); sb.append(queueLengthLimit + ","); }
    if (queues != null) { sb.append("queues:"); sb.append(queues); }
    sb.append("}");
    return sb.toString();
  }
  

}