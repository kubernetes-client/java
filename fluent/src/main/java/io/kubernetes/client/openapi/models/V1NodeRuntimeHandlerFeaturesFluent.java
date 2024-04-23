package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeRuntimeHandlerFeaturesFluent<A extends V1NodeRuntimeHandlerFeaturesFluent<A>> extends BaseFluent<A>{
  public V1NodeRuntimeHandlerFeaturesFluent() {
  }
  
  public V1NodeRuntimeHandlerFeaturesFluent(V1NodeRuntimeHandlerFeatures instance) {
    this.copyInstance(instance);
  }
  private Boolean recursiveReadOnlyMounts;
  
  protected void copyInstance(V1NodeRuntimeHandlerFeatures instance) {
    instance = (instance != null ? instance : new V1NodeRuntimeHandlerFeatures());
    if (instance != null) {
          this.withRecursiveReadOnlyMounts(instance.getRecursiveReadOnlyMounts());
        }
  }
  
  public Boolean getRecursiveReadOnlyMounts() {
    return this.recursiveReadOnlyMounts;
  }
  
  public A withRecursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {
    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    return (A) this;
  }
  
  public boolean hasRecursiveReadOnlyMounts() {
    return this.recursiveReadOnlyMounts != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeRuntimeHandlerFeaturesFluent that = (V1NodeRuntimeHandlerFeaturesFluent) o;
    if (!java.util.Objects.equals(recursiveReadOnlyMounts, that.recursiveReadOnlyMounts)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(recursiveReadOnlyMounts,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (recursiveReadOnlyMounts != null) { sb.append("recursiveReadOnlyMounts:"); sb.append(recursiveReadOnlyMounts); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withRecursiveReadOnlyMounts() {
    return withRecursiveReadOnlyMounts(true);
  }
  

}