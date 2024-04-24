package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2VendorParametersFluent<A extends V1alpha2VendorParametersFluent<A>> extends BaseFluent<A>{
  public V1alpha2VendorParametersFluent() {
  }
  
  public V1alpha2VendorParametersFluent(V1alpha2VendorParameters instance) {
    this.copyInstance(instance);
  }
  private String driverName;
  private Object parameters;
  
  protected void copyInstance(V1alpha2VendorParameters instance) {
    instance = (instance != null ? instance : new V1alpha2VendorParameters());
    if (instance != null) {
          this.withDriverName(instance.getDriverName());
          this.withParameters(instance.getParameters());
        }
  }
  
  public String getDriverName() {
    return this.driverName;
  }
  
  public A withDriverName(String driverName) {
    this.driverName = driverName;
    return (A) this;
  }
  
  public boolean hasDriverName() {
    return this.driverName != null;
  }
  
  public Object getParameters() {
    return this.parameters;
  }
  
  public A withParameters(Object parameters) {
    this.parameters = parameters;
    return (A) this;
  }
  
  public boolean hasParameters() {
    return this.parameters != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2VendorParametersFluent that = (V1alpha2VendorParametersFluent) o;
    if (!java.util.Objects.equals(driverName, that.driverName)) return false;
    if (!java.util.Objects.equals(parameters, that.parameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(driverName,  parameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (parameters != null) { sb.append("parameters:"); sb.append(parameters); }
    sb.append("}");
    return sb.toString();
  }
  

}