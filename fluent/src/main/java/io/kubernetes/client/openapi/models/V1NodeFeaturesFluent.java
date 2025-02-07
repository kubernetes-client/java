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
public class V1NodeFeaturesFluent<A extends V1NodeFeaturesFluent<A>> extends BaseFluent<A>{
  public V1NodeFeaturesFluent() {
  }
  
  public V1NodeFeaturesFluent(V1NodeFeatures instance) {
    this.copyInstance(instance);
  }
  private Boolean supplementalGroupsPolicy;
  
  protected void copyInstance(V1NodeFeatures instance) {
    instance = (instance != null ? instance : new V1NodeFeatures());
    if (instance != null) {
          this.withSupplementalGroupsPolicy(instance.getSupplementalGroupsPolicy());
        }
  }
  
  public Boolean getSupplementalGroupsPolicy() {
    return this.supplementalGroupsPolicy;
  }
  
  public A withSupplementalGroupsPolicy(Boolean supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    return (A) this;
  }
  
  public boolean hasSupplementalGroupsPolicy() {
    return this.supplementalGroupsPolicy != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NodeFeaturesFluent that = (V1NodeFeaturesFluent) o;
    if (!java.util.Objects.equals(supplementalGroupsPolicy, that.supplementalGroupsPolicy)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(supplementalGroupsPolicy,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (supplementalGroupsPolicy != null) { sb.append("supplementalGroupsPolicy:"); sb.append(supplementalGroupsPolicy); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withSupplementalGroupsPolicy() {
    return withSupplementalGroupsPolicy(true);
  }
  

}