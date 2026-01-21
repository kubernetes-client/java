package io.kubernetes.client.openapi.models;

import io.kubernetes.client.custom.IntOrString;
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
public class V1RollingUpdateStatefulSetStrategyFluent<A extends io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyFluent<A>> extends BaseFluent<A>{

  private IntOrString maxUnavailable;
  private Integer partition;

  public V1RollingUpdateStatefulSetStrategyFluent() {
  }
  
  public V1RollingUpdateStatefulSetStrategyFluent(V1RollingUpdateStatefulSetStrategy instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1RollingUpdateStatefulSetStrategy instance) {
    instance = instance != null ? instance : new V1RollingUpdateStatefulSetStrategy();
    if (instance != null) {
        this.withMaxUnavailable(instance.getMaxUnavailable());
        this.withPartition(instance.getPartition());
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
    V1RollingUpdateStatefulSetStrategyFluent that = (V1RollingUpdateStatefulSetStrategyFluent) o;
    if (!(Objects.equals(maxUnavailable, that.maxUnavailable))) {
      return false;
    }
    if (!(Objects.equals(partition, that.partition))) {
      return false;
    }
    return true;
  }
  
  public IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  
  public Integer getPartition() {
    return this.partition;
  }
  
  public boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  
  public boolean hasPartition() {
    return this.partition != null;
  }
  
  public int hashCode() {
    return Objects.hash(maxUnavailable, partition);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(maxUnavailable == null)) {
        sb.append("maxUnavailable:");
        sb.append(maxUnavailable);
        sb.append(",");
    }
    if (!(partition == null)) {
        sb.append("partition:");
        sb.append(partition);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }
  
  public A withNewMaxUnavailable(int value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public A withNewMaxUnavailable(String value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public A withPartition(Integer partition) {
    this.partition = partition;
    return (A) this;
  }
  
}