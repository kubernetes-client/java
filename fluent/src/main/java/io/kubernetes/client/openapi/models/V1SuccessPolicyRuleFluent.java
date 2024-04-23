package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SuccessPolicyRuleFluent<A extends V1SuccessPolicyRuleFluent<A>> extends BaseFluent<A>{
  public V1SuccessPolicyRuleFluent() {
  }
  
  public V1SuccessPolicyRuleFluent(V1SuccessPolicyRule instance) {
    this.copyInstance(instance);
  }
  private Integer succeededCount;
  private String succeededIndexes;
  
  protected void copyInstance(V1SuccessPolicyRule instance) {
    instance = (instance != null ? instance : new V1SuccessPolicyRule());
    if (instance != null) {
          this.withSucceededCount(instance.getSucceededCount());
          this.withSucceededIndexes(instance.getSucceededIndexes());
        }
  }
  
  public Integer getSucceededCount() {
    return this.succeededCount;
  }
  
  public A withSucceededCount(Integer succeededCount) {
    this.succeededCount = succeededCount;
    return (A) this;
  }
  
  public boolean hasSucceededCount() {
    return this.succeededCount != null;
  }
  
  public String getSucceededIndexes() {
    return this.succeededIndexes;
  }
  
  public A withSucceededIndexes(String succeededIndexes) {
    this.succeededIndexes = succeededIndexes;
    return (A) this;
  }
  
  public boolean hasSucceededIndexes() {
    return this.succeededIndexes != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SuccessPolicyRuleFluent that = (V1SuccessPolicyRuleFluent) o;
    if (!java.util.Objects.equals(succeededCount, that.succeededCount)) return false;
    if (!java.util.Objects.equals(succeededIndexes, that.succeededIndexes)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(succeededCount,  succeededIndexes,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (succeededCount != null) { sb.append("succeededCount:"); sb.append(succeededCount + ","); }
    if (succeededIndexes != null) { sb.append("succeededIndexes:"); sb.append(succeededIndexes); }
    sb.append("}");
    return sb.toString();
  }
  

}