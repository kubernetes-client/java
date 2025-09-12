package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourcePoolFluent<A extends io.kubernetes.client.openapi.models.V1ResourcePoolFluent<A>> extends BaseFluent<A>{
  public V1ResourcePoolFluent() {
  }
  
  public V1ResourcePoolFluent(V1ResourcePool instance) {
    this.copyInstance(instance);
  }
  private Long generation;
  private String name;
  private Long resourceSliceCount;
  
  protected void copyInstance(V1ResourcePool instance) {
    instance = instance != null ? instance : new V1ResourcePool();
    if (instance != null) {
        this.withGeneration(instance.getGeneration());
        this.withName(instance.getName());
        this.withResourceSliceCount(instance.getResourceSliceCount());
    }
  }
  
  public Long getGeneration() {
    return this.generation;
  }
  
  public A withGeneration(Long generation) {
    this.generation = generation;
    return (A) this;
  }
  
  public boolean hasGeneration() {
    return this.generation != null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public Long getResourceSliceCount() {
    return this.resourceSliceCount;
  }
  
  public A withResourceSliceCount(Long resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
    return (A) this;
  }
  
  public boolean hasResourceSliceCount() {
    return this.resourceSliceCount != null;
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
    V1ResourcePoolFluent that = (V1ResourcePoolFluent) o;
    if (!(Objects.equals(generation, that.generation))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(resourceSliceCount, that.resourceSliceCount))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(generation, name, resourceSliceCount);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(generation == null)) {
        sb.append("generation:");
        sb.append(generation);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(resourceSliceCount == null)) {
        sb.append("resourceSliceCount:");
        sb.append(resourceSliceCount);
    }
    sb.append("}");
    return sb.toString();
  }
  

}