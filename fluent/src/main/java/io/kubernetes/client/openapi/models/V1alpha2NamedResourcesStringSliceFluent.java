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
public class V1alpha2NamedResourcesStringSliceFluent<A extends V1alpha2NamedResourcesStringSliceFluent<A>> extends BaseFluent<A>{
  public V1alpha2NamedResourcesStringSliceFluent() {
  }
  
  public V1alpha2NamedResourcesStringSliceFluent(V1alpha2NamedResourcesStringSlice instance) {
    this.copyInstance(instance);
  }
  private List<String> strings;
  
  protected void copyInstance(V1alpha2NamedResourcesStringSlice instance) {
    instance = (instance != null ? instance : new V1alpha2NamedResourcesStringSlice());
    if (instance != null) {
          this.withStrings(instance.getStrings());
        }
  }
  
  public A addToStrings(int index,String item) {
    if (this.strings == null) {this.strings = new ArrayList<String>();}
    this.strings.add(index, item);
    return (A)this;
  }
  
  public A setToStrings(int index,String item) {
    if (this.strings == null) {this.strings = new ArrayList<String>();}
    this.strings.set(index, item); return (A)this;
  }
  
  public A addToStrings(java.lang.String... items) {
    if (this.strings == null) {this.strings = new ArrayList<String>();}
    for (String item : items) {this.strings.add(item);} return (A)this;
  }
  
  public A addAllToStrings(Collection<String> items) {
    if (this.strings == null) {this.strings = new ArrayList<String>();}
    for (String item : items) {this.strings.add(item);} return (A)this;
  }
  
  public A removeFromStrings(java.lang.String... items) {
    if (this.strings == null) return (A)this;
    for (String item : items) { this.strings.remove(item);} return (A)this;
  }
  
  public A removeAllFromStrings(Collection<String> items) {
    if (this.strings == null) return (A)this;
    for (String item : items) { this.strings.remove(item);} return (A)this;
  }
  
  public List<String> getStrings() {
    return this.strings;
  }
  
  public String getString(int index) {
    return this.strings.get(index);
  }
  
  public String getFirstString() {
    return this.strings.get(0);
  }
  
  public String getLastString() {
    return this.strings.get(strings.size() - 1);
  }
  
  public String getMatchingString(Predicate<String> predicate) {
      for (String item : strings) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingString(Predicate<String> predicate) {
      for (String item : strings) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withStrings(List<String> strings) {
    if (strings != null) {
        this.strings = new ArrayList();
        for (String item : strings) {
          this.addToStrings(item);
        }
    } else {
      this.strings = null;
    }
    return (A) this;
  }
  
  public A withStrings(java.lang.String... strings) {
    if (this.strings != null) {
        this.strings.clear();
        _visitables.remove("strings");
    }
    if (strings != null) {
      for (String item : strings) {
        this.addToStrings(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasStrings() {
    return this.strings != null && !this.strings.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2NamedResourcesStringSliceFluent that = (V1alpha2NamedResourcesStringSliceFluent) o;
    if (!java.util.Objects.equals(strings, that.strings)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(strings,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (strings != null && !strings.isEmpty()) { sb.append("strings:"); sb.append(strings); }
    sb.append("}");
    return sb.toString();
  }
  

}