package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.custom.IntOrString;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1RollingUpdateStatefulSetStrategyFluentImpl<A extends V1RollingUpdateStatefulSetStrategyFluent<A>> extends BaseFluent<A> implements V1RollingUpdateStatefulSetStrategyFluent<A>{
  public V1RollingUpdateStatefulSetStrategyFluentImpl() {
  }
  public V1RollingUpdateStatefulSetStrategyFluentImpl(V1RollingUpdateStatefulSetStrategy instance) {
    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.withPartition(instance.getPartition());

  }
  private IntOrString maxUnavailable;
  private Integer partition;
  public IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  public A withMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable=maxUnavailable; return (A) this;
  }
  public Boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  public A withNewMaxUnavailable(int value) {
    return (A)withMaxUnavailable(new IntOrString(value));
  }
  public A withNewMaxUnavailable(String value) {
    return (A)withMaxUnavailable(new IntOrString(value));
  }
  public Integer getPartition() {
    return this.partition;
  }
  public A withPartition(Integer partition) {
    this.partition=partition; return (A) this;
  }
  public Boolean hasPartition() {
    return this.partition != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RollingUpdateStatefulSetStrategyFluentImpl that = (V1RollingUpdateStatefulSetStrategyFluentImpl) o;
    if (maxUnavailable != null ? !maxUnavailable.equals(that.maxUnavailable) :that.maxUnavailable != null) return false;
    if (partition != null ? !partition.equals(that.partition) :that.partition != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(maxUnavailable,  partition,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (maxUnavailable != null) { sb.append("maxUnavailable:"); sb.append(maxUnavailable + ","); }
    if (partition != null) { sb.append("partition:"); sb.append(partition); }
    sb.append("}");
    return sb.toString();
  }
  
}