package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TopologySelectorLabelRequirementFluent<A extends V1TopologySelectorLabelRequirementFluent<A>> extends BaseFluent<A>{
  public V1TopologySelectorLabelRequirementFluent() {
  }
  
  public V1TopologySelectorLabelRequirementFluent(V1TopologySelectorLabelRequirement instance) {
    this.copyInstance(instance);
  }
  private String key;
  private List<String> values;
  
  protected void copyInstance(V1TopologySelectorLabelRequirement instance) {
    instance = (instance != null ? instance : new V1TopologySelectorLabelRequirement());
    if (instance != null) {
          this.withKey(instance.getKey());
          this.withValues(instance.getValues());
        }
  }
  
  public String getKey() {
    return this.key;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public A addToValues(int index,String item) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    this.values.add(index, item);
    return (A)this;
  }
  
  public A setToValues(int index,String item) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    this.values.set(index, item); return (A)this;
  }
  
  public A addToValues(java.lang.String... items) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    for (String item : items) {this.values.add(item);} return (A)this;
  }
  
  public A addAllToValues(Collection<String> items) {
    if (this.values == null) {this.values = new ArrayList<String>();}
    for (String item : items) {this.values.add(item);} return (A)this;
  }
  
  public A removeFromValues(java.lang.String... items) {
    if (this.values == null) return (A)this;
    for (String item : items) { this.values.remove(item);} return (A)this;
  }
  
  public A removeAllFromValues(Collection<String> items) {
    if (this.values == null) return (A)this;
    for (String item : items) { this.values.remove(item);} return (A)this;
  }
  
  public List<String> getValues() {
    return this.values;
  }
  
  public String getValue(int index) {
    return this.values.get(index);
  }
  
  public String getFirstValue() {
    return this.values.get(0);
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
  
  public boolean hasMatchingValue(Predicate<String> predicate) {
      for (String item : values) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
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
  
  public A withValues(java.lang.String... values) {
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
  
  public boolean hasValues() {
    return this.values != null && !this.values.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TopologySelectorLabelRequirementFluent that = (V1TopologySelectorLabelRequirementFluent) o;
    if (!java.util.Objects.equals(key, that.key)) return false;
    if (!java.util.Objects.equals(values, that.values)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(key,  values,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (values != null && !values.isEmpty()) { sb.append("values:"); sb.append(values); }
    sb.append("}");
    return sb.toString();
  }
  

}