package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
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
public class V1TopologySelectorLabelRequirementFluent<A extends io.kubernetes.client.openapi.models.V1TopologySelectorLabelRequirementFluent<A>> extends BaseFluent<A>{

  private String key;
  private List<String> values;

  public V1TopologySelectorLabelRequirementFluent() {
  }
  
  public V1TopologySelectorLabelRequirementFluent(V1TopologySelectorLabelRequirement instance) {
    this.copyInstance(instance);
  }

  public A addAllToValues(Collection<String> items) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    for (String item : items) {
      this.values.add(item);
    }
    return (A) this;
  }
  
  public A addToValues(String... items) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    for (String item : items) {
      this.values.add(item);
    }
    return (A) this;
  }
  
  public A addToValues(int index,String item) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    this.values.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1TopologySelectorLabelRequirement instance) {
    instance = instance != null ? instance : new V1TopologySelectorLabelRequirement();
    if (instance != null) {
        this.withKey(instance.getKey());
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
    V1TopologySelectorLabelRequirementFluent that = (V1TopologySelectorLabelRequirementFluent) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(values, that.values))) {
      return false;
    }
    return true;
  }
  
  public String getFirstValue() {
    return this.values.get(0);
  }
  
  public String getKey() {
    return this.key;
  }
  
  public String getLastValue() {
    return this.values.get(values.size() - 1);
  }
  
  public String getMatchingValue(Predicate<String> predicate) {
      for (String item : values) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getValue(int index) {
    return this.values.get(index);
  }
  
  public List<String> getValues() {
    return this.values;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public boolean hasMatchingValue(Predicate<String> predicate) {
      for (String item : values) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasValues() {
    return this.values != null && !(this.values.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(key, values);
  }
  
  public A removeAllFromValues(Collection<String> items) {
    if (this.values == null) {
      return (A) this;
    }
    for (String item : items) {
      this.values.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromValues(String... items) {
    if (this.values == null) {
      return (A) this;
    }
    for (String item : items) {
      this.values.remove(item);
    }
    return (A) this;
  }
  
  public A setToValues(int index,String item) {
    if (this.values == null) {
      this.values = new ArrayList();
    }
    this.values.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
    if (!(values == null) && !(values.isEmpty())) {
        sb.append("values:");
        sb.append(values);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public A withValues(List<String> values) {
    if (values != null) {
        this.values = new ArrayList();
        for (String item : values) {
          this.addToValues(item);
        }
    } else {
      this.values = null;
    }
    return (A) this;
  }
  
  public A withValues(String... values) {
    if (this.values != null) {
        this.values.clear();
        _visitables.remove("values");
    }
    if (values != null) {
      for (String item : values) {
        this.addToValues(item);
      }
    }
    return (A) this;
  }
  
}