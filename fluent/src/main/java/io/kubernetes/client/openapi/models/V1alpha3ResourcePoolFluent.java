package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3ResourcePoolFluent<A extends V1alpha3ResourcePoolFluent<A>> extends BaseFluent<A>{
  public V1alpha3ResourcePoolFluent() {
  }
  
  public V1alpha3ResourcePoolFluent(V1alpha3ResourcePool instance) {
    this.copyInstance(instance);
  }
  private Long generation;
  private String name;
  private Long resourceSliceCount;
  
  protected void copyInstance(V1alpha3ResourcePool instance) {
    instance = (instance != null ? instance : new V1alpha3ResourcePool());
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3ResourcePoolFluent that = (V1alpha3ResourcePoolFluent) o;
    if (!java.util.Objects.equals(generation, that.generation)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(resourceSliceCount, that.resourceSliceCount)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(generation,  name,  resourceSliceCount,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (generation != null) { sb.append("generation:"); sb.append(generation + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (resourceSliceCount != null) { sb.append("resourceSliceCount:"); sb.append(resourceSliceCount); }
    sb.append("}");
    return sb.toString();
  }
  

}