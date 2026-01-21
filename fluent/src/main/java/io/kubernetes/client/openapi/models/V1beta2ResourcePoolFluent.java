package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta2ResourcePoolFluent<A extends io.kubernetes.client.openapi.models.V1beta2ResourcePoolFluent<A>> extends BaseFluent<A>{

  private Long generation;
  private String name;
  private Long resourceSliceCount;

  public V1beta2ResourcePoolFluent() {
  }
  
  public V1beta2ResourcePoolFluent(V1beta2ResourcePool instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta2ResourcePool instance) {
    instance = instance != null ? instance : new V1beta2ResourcePool();
    if (instance != null) {
        this.withGeneration(instance.getGeneration());
        this.withName(instance.getName());
        this.withResourceSliceCount(instance.getResourceSliceCount());
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
    V1beta2ResourcePoolFluent that = (V1beta2ResourcePoolFluent) o;
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
  
  public Long getGeneration() {
    return this.generation;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Long getResourceSliceCount() {
    return this.resourceSliceCount;
  }
  
  public boolean hasGeneration() {
    return this.generation != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasResourceSliceCount() {
    return this.resourceSliceCount != null;
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
  
  public A withGeneration(Long generation) {
    this.generation = generation;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withResourceSliceCount(Long resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
    return (A) this;
  }
  
}