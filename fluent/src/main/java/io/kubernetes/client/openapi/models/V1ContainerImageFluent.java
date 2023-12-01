package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
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
public class V1ContainerImageFluent<A extends V1ContainerImageFluent<A>> extends BaseFluent<A>{
  public V1ContainerImageFluent() {
  }
  
  public V1ContainerImageFluent(V1ContainerImage instance) {
    this.copyInstance(instance);
  }
  private List<String> names;
  private Long sizeBytes;
  
  protected void copyInstance(V1ContainerImage instance) {
    instance = (instance != null ? instance : new V1ContainerImage());
    if (instance != null) {
          this.withNames(instance.getNames());
          this.withSizeBytes(instance.getSizeBytes());
        }
  }
  
  public A addToNames(int index,String item) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    this.names.add(index, item);
    return (A)this;
  }
  
  public A setToNames(int index,String item) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    this.names.set(index, item); return (A)this;
  }
  
  public A addToNames(java.lang.String... items) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    for (String item : items) {this.names.add(item);} return (A)this;
  }
  
  public A addAllToNames(Collection<String> items) {
    if (this.names == null) {this.names = new ArrayList<String>();}
    for (String item : items) {this.names.add(item);} return (A)this;
  }
  
  public A removeFromNames(java.lang.String... items) {
    if (this.names == null) return (A)this;
    for (String item : items) { this.names.remove(item);} return (A)this;
  }
  
  public A removeAllFromNames(Collection<String> items) {
    if (this.names == null) return (A)this;
    for (String item : items) { this.names.remove(item);} return (A)this;
  }
  
  public List<String> getNames() {
    return this.names;
  }
  
  public String getName(int index) {
    return this.names.get(index);
  }
  
  public String getFirstName() {
    return this.names.get(0);
  }
  
  public String getLastName() {
    return this.names.get(names.size() - 1);
  }
  
  public String getMatchingName(Predicate<String> predicate) {
      for (String item : names) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingName(Predicate<String> predicate) {
      for (String item : names) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNames(List<String> names) {
    if (names != null) {
        this.names = new ArrayList();
        for (String item : names) {
          this.addToNames(item);
        }
    } else {
      this.names = null;
    }
    return (A) this;
  }
  
  public A withNames(java.lang.String... names) {
    if (this.names != null) {
        this.names.clear();
        _visitables.remove("names");
    }
    if (names != null) {
      for (String item : names) {
        this.addToNames(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNames() {
    return this.names != null && !this.names.isEmpty();
  }
  
  public Long getSizeBytes() {
    return this.sizeBytes;
  }
  
  public A withSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return (A) this;
  }
  
  public boolean hasSizeBytes() {
    return this.sizeBytes != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ContainerImageFluent that = (V1ContainerImageFluent) o;
    if (!java.util.Objects.equals(names, that.names)) return false;
    if (!java.util.Objects.equals(sizeBytes, that.sizeBytes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(names,  sizeBytes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (names != null && !names.isEmpty()) { sb.append("names:"); sb.append(names + ","); }
    if (sizeBytes != null) { sb.append("sizeBytes:"); sb.append(sizeBytes); }
    sb.append("}");
    return sb.toString();
  }
  

}