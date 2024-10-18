package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3OpaqueDeviceConfigurationFluent<A extends V1alpha3OpaqueDeviceConfigurationFluent<A>> extends BaseFluent<A>{
  public V1alpha3OpaqueDeviceConfigurationFluent() {
  }
  
  public V1alpha3OpaqueDeviceConfigurationFluent(V1alpha3OpaqueDeviceConfiguration instance) {
    this.copyInstance(instance);
  }
  private String driver;
  private Object parameters;
  
  protected void copyInstance(V1alpha3OpaqueDeviceConfiguration instance) {
    instance = (instance != null ? instance : new V1alpha3OpaqueDeviceConfiguration());
    if (instance != null) {
          this.withDriver(instance.getDriver());
          this.withParameters(instance.getParameters());
        }
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
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
    V1alpha3OpaqueDeviceConfigurationFluent that = (V1alpha3OpaqueDeviceConfigurationFluent) o;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(parameters, that.parameters)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(driver,  parameters,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (parameters != null) { sb.append("parameters:"); sb.append(parameters); }
    sb.append("}");
    return sb.toString();
  }
  

}