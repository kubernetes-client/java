package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SelectableFieldFluent<A extends V1SelectableFieldFluent<A>> extends BaseFluent<A>{
  public V1SelectableFieldFluent() {
  }
  
  public V1SelectableFieldFluent(V1SelectableField instance) {
    this.copyInstance(instance);
  }
  private String jsonPath;
  
  protected void copyInstance(V1SelectableField instance) {
    instance = (instance != null ? instance : new V1SelectableField());
    if (instance != null) {
          this.withJsonPath(instance.getJsonPath());
        }
  }
  
  public String getJsonPath() {
    return this.jsonPath;
  }
  
  public A withJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return (A) this;
  }
  
  public boolean hasJsonPath() {
    return this.jsonPath != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SelectableFieldFluent that = (V1SelectableFieldFluent) o;
    if (!java.util.Objects.equals(jsonPath, that.jsonPath)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(jsonPath,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (jsonPath != null) { sb.append("jsonPath:"); sb.append(jsonPath); }
    sb.append("}");
    return sb.toString();
  }
  

}