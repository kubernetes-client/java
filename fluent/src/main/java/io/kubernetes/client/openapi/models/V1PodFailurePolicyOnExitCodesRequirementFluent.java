package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodFailurePolicyOnExitCodesRequirementFluent<A extends io.kubernetes.client.openapi.models.V1PodFailurePolicyOnExitCodesRequirementFluent<A>> extends BaseFluent<A>{

  private String containerName;
  private String operator;
  private List<Integer> values;

  public V1PodFailurePolicyOnExitCodesRequirementFluent() {
  }
  
  public V1PodFailurePolicyOnExitCodesRequirementFluent(V1PodFailurePolicyOnExitCodesRequirement instance) {
    this.copyInstance(instance);
  }

  public A addAllToValues(Collection<Integer> items) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    for (Integer item : items) {
      this.values.add(item);
    }
    return (A) this;
  }
  
  public A addToValues(Integer... items) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    for (Integer item : items) {
      this.values.add(item);
    }
    return (A) this;
  }
  
  public A addToValues(int index,Integer item) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    this.values.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1PodFailurePolicyOnExitCodesRequirement instance) {
    instance = instance != null ? instance : new V1PodFailurePolicyOnExitCodesRequirement();
    if (instance != null) {
        this.withContainerName(instance.getContainerName());
        this.withOperator(instance.getOperator());
        this.withValues(instance.getValues());
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
    V1PodFailurePolicyOnExitCodesRequirementFluent that = (V1PodFailurePolicyOnExitCodesRequirementFluent) o;
    if (!(Objects.equals(containerName, that.containerName))) {
      return false;
    }
    if (!(Objects.equals(operator, that.operator))) {
      return false;
    }
    if (!(Objects.equals(values, that.values))) {
      return false;
    }
    return true;
  }
  
  public String getContainerName() {
    return this.containerName;
  }
  
  public Integer getFirstValue() {
    return this.values.get(0);
  }
  
  public Integer getLastValue() {
    return this.values.get(values.size() - 1);
  }
  
  public Integer getMatchingValue(Predicate<Integer> predicate) {
      for (Integer item : values) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public Integer getValue(int index) {
    return this.values.get(index);
  }
  
  public List<Integer> getValues() {
    return this.values;
  }
  
  public boolean hasContainerName() {
    return this.containerName != null;
  }
  
  public boolean hasMatchingValue(Predicate<Integer> predicate) {
      for (Integer item : values) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasOperator() {
    return this.operator != null;
  }
  
  public boolean hasValues() {
    return this.values != null && !(this.values.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(containerName, operator, values);
  }
  
  public A removeAllFromValues(Collection<Integer> items) {
    if (this.values == null) {
      return (A) this;
    }
    for (Integer item : items) {
      this.values.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromValues(Integer... items) {
    if (this.values == null) {
      return (A) this;
    }
    for (Integer item : items) {
      this.values.remove(item);
    }
    return (A) this;
  }
  
  public A setToValues(int index,Integer item) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    this.values.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containerName == null)) {
        sb.append("containerName:");
        sb.append(containerName);
        sb.append(",");
    }
    if (!(operator == null)) {
        sb.append("operator:");
        sb.append(operator);
        sb.append(",");
    }
    if (!(values == null) && !(values.isEmpty())) {
        sb.append("values:");
        sb.append(values);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainerName(String containerName) {
    this.containerName = containerName;
    return (A) this;
  }
  
  public A withOperator(String operator) {
    this.operator = operator;
    return (A) this;
  }
  
  public A withValues(List<Integer> values) {
    if (values != null) {
        this.values = new ArrayList();
        for (Integer item : values) {
          this.addToValues(item);
        }
    } else {
      this.values = null;
    }
    return (A) this;
  }
  
  public A withValues(Integer... values) {
    if (this.values != null) {
        this.values.clear();
        _visitables.remove("values");
    }
    if (values != null) {
      for (Integer item : values) {
        this.addToValues(item);
      }
    }
    return (A) this;
  }
  
}