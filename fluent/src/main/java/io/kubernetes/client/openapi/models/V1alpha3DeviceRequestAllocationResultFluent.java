package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3DeviceRequestAllocationResultFluent<A extends V1alpha3DeviceRequestAllocationResultFluent<A>> extends BaseFluent<A>{
  public V1alpha3DeviceRequestAllocationResultFluent() {
  }
  
  public V1alpha3DeviceRequestAllocationResultFluent(V1alpha3DeviceRequestAllocationResult instance) {
    this.copyInstance(instance);
  }
  private String device;
  private String driver;
  private String pool;
  private String request;
  
  protected void copyInstance(V1alpha3DeviceRequestAllocationResult instance) {
    instance = (instance != null ? instance : new V1alpha3DeviceRequestAllocationResult());
    if (instance != null) {
          this.withDevice(instance.getDevice());
          this.withDriver(instance.getDriver());
          this.withPool(instance.getPool());
          this.withRequest(instance.getRequest());
        }
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public A withDevice(String device) {
    this.device = device;
    return (A) this;
  }
  
  public boolean hasDevice() {
    return this.device != null;
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
  
  public String getPool() {
    return this.pool;
  }
  
  public A withPool(String pool) {
    this.pool = pool;
    return (A) this;
  }
  
  public boolean hasPool() {
    return this.pool != null;
  }
  
  public String getRequest() {
    return this.request;
  }
  
  public A withRequest(String request) {
    this.request = request;
    return (A) this;
  }
  
  public boolean hasRequest() {
    return this.request != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3DeviceRequestAllocationResultFluent that = (V1alpha3DeviceRequestAllocationResultFluent) o;
    if (!java.util.Objects.equals(device, that.device)) return false;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(pool, that.pool)) return false;
    if (!java.util.Objects.equals(request, that.request)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(device,  driver,  pool,  request,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (device != null) { sb.append("device:"); sb.append(device + ","); }
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (pool != null) { sb.append("pool:"); sb.append(pool + ","); }
    if (request != null) { sb.append("request:"); sb.append(request); }
    sb.append("}");
    return sb.toString();
  }
  

}