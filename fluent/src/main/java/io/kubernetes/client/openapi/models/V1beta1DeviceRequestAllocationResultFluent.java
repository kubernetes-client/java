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
public class V1beta1DeviceRequestAllocationResultFluent<A extends V1beta1DeviceRequestAllocationResultFluent<A>> extends BaseFluent<A>{
  public V1beta1DeviceRequestAllocationResultFluent() {
  }
  
  public V1beta1DeviceRequestAllocationResultFluent(V1beta1DeviceRequestAllocationResult instance) {
    this.copyInstance(instance);
  }
  private Boolean adminAccess;
  private String device;
  private String driver;
  private String pool;
  private String request;
  
  protected void copyInstance(V1beta1DeviceRequestAllocationResult instance) {
    instance = (instance != null ? instance : new V1beta1DeviceRequestAllocationResult());
    if (instance != null) {
          this.withAdminAccess(instance.getAdminAccess());
          this.withDevice(instance.getDevice());
          this.withDriver(instance.getDriver());
          this.withPool(instance.getPool());
          this.withRequest(instance.getRequest());
        }
  }
  
  public Boolean getAdminAccess() {
    return this.adminAccess;
  }
  
  public A withAdminAccess(Boolean adminAccess) {
    this.adminAccess = adminAccess;
    return (A) this;
  }
  
  public boolean hasAdminAccess() {
    return this.adminAccess != null;
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
    V1beta1DeviceRequestAllocationResultFluent that = (V1beta1DeviceRequestAllocationResultFluent) o;
    if (!java.util.Objects.equals(adminAccess, that.adminAccess)) return false;
    if (!java.util.Objects.equals(device, that.device)) return false;
    if (!java.util.Objects.equals(driver, that.driver)) return false;
    if (!java.util.Objects.equals(pool, that.pool)) return false;
    if (!java.util.Objects.equals(request, that.request)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(adminAccess,  device,  driver,  pool,  request,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (adminAccess != null) { sb.append("adminAccess:"); sb.append(adminAccess + ","); }
    if (device != null) { sb.append("device:"); sb.append(device + ","); }
    if (driver != null) { sb.append("driver:"); sb.append(driver + ","); }
    if (pool != null) { sb.append("pool:"); sb.append(pool + ","); }
    if (request != null) { sb.append("request:"); sb.append(request); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAdminAccess() {
    return withAdminAccess(true);
  }
  

}