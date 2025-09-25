package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerRestartRuleOnExitCodesFluent<A extends io.kubernetes.client.openapi.models.V1ContainerRestartRuleOnExitCodesFluent<A>> extends BaseFluent<A>{
  public V1ContainerRestartRuleOnExitCodesFluent() {
  }
  
  public V1ContainerRestartRuleOnExitCodesFluent(V1ContainerRestartRuleOnExitCodes instance) {
    this.copyInstance(instance);
  }
  private String operator;
  private List<Integer> values;
  
  protected void copyInstance(V1ContainerRestartRuleOnExitCodes instance) {
    instance = instance != null ? instance : new V1ContainerRestartRuleOnExitCodes();
    if (instance != null) {
        this.withOperator(instance.getOperator());
        this.withValues(instance.getValues());
    }
  }
  
  public String getOperator() {
    return this.operator;
  }
  
  public A withOperator(String operator) {
    this.operator = operator;
    return (A) this;
  }
  
  public boolean hasOperator() {
    return this.operator != null;
  }
  
  public A addToValues(int index,Integer item) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    this.values.add(index, item);
    return (A) this;
  }
  
  public A setToValues(int index,Integer item) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    this.values.set(index, item);
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
  
  public A addAllToValues(Collection<Integer> items) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    for (Integer item : items) {
      this.values.add(item);
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
  
  public A removeAllFromValues(Collection<Integer> items) {
    if (this.values == null) {
      return (A) this;
    }
    for (Integer item : items) {
      this.values.remove(item);
    }
    return (A) this;
  }
  
  public List<Integer> getValues() {
    return this.values;
  }
  
  public Integer getValue(int index) {
    return this.values.get(index);
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
  
  public boolean hasMatchingValue(Predicate<Integer> predicate) {
      for (Integer item : values) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public boolean hasValues() {
    return this.values != null && !(this.values.isEmpty());
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
    V1ContainerRestartRuleOnExitCodesFluent that = (V1ContainerRestartRuleOnExitCodesFluent) o;
    if (!(Objects.equals(operator, that.operator))) {
      return false;
    }
    if (!(Objects.equals(values, that.values))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(operator, values);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
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
  

}