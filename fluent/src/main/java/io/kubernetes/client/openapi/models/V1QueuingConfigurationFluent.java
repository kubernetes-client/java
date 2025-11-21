package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1QueuingConfigurationFluent<A extends io.kubernetes.client.openapi.models.V1QueuingConfigurationFluent<A>> extends BaseFluent<A>{

  private Integer handSize;
  private Integer queueLengthLimit;
  private Integer queues;

  public V1QueuingConfigurationFluent() {
  }
  
  public V1QueuingConfigurationFluent(V1QueuingConfiguration instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1QueuingConfiguration instance) {
    instance = instance != null ? instance : new V1QueuingConfiguration();
    if (instance != null) {
        this.withHandSize(instance.getHandSize());
        this.withQueueLengthLimit(instance.getQueueLengthLimit());
        this.withQueues(instance.getQueues());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1QueuingConfigurationFluent that = (V1QueuingConfigurationFluent) o;
    if (!(Objects.equals(handSize, that.handSize))) {
      return false;
    }
    if (!(Objects.equals(queueLengthLimit, that.queueLengthLimit))) {
      return false;
    }
    if (!(Objects.equals(queues, that.queues))) {
      return false;
    }
    return true;
  }
  
  public Integer getHandSize() {
    return this.handSize;
  }
  
  public Integer getQueueLengthLimit() {
    return this.queueLengthLimit;
  }
  
  public Integer getQueues() {
    return this.queues;
  }
  
  public boolean hasHandSize() {
    return this.handSize != null;
  }
  
  public boolean hasQueueLengthLimit() {
    return this.queueLengthLimit != null;
  }
  
  public boolean hasQueues() {
    return this.queues != null;
  }
  
  public int hashCode() {
    return Objects.hash(handSize, queueLengthLimit, queues);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(handSize == null)) {
        sb.append("handSize:");
        sb.append(handSize);
        sb.append(",");
    }
    if (!(queueLengthLimit == null)) {
        sb.append("queueLengthLimit:");
        sb.append(queueLengthLimit);
        sb.append(",");
    }
    if (!(queues == null)) {
        sb.append("queues:");
        sb.append(queues);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHandSize(Integer handSize) {
    this.handSize = handSize;
    return (A) this;
  }
  
  public A withQueueLengthLimit(Integer queueLengthLimit) {
    this.queueLengthLimit = queueLengthLimit;
    return (A) this;
  }
  
  public A withQueues(Integer queues) {
    this.queues = queues;
    return (A) this;
  }
  
}