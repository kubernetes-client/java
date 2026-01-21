package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3DeviceTaintSelectorFluent<A extends io.kubernetes.client.openapi.models.V1alpha3DeviceTaintSelectorFluent<A>> extends BaseFluent<A>{

  private String device;
  private String driver;
  private String pool;

  public V1alpha3DeviceTaintSelectorFluent() {
  }
  
  public V1alpha3DeviceTaintSelectorFluent(V1alpha3DeviceTaintSelector instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3DeviceTaintSelector instance) {
    instance = instance != null ? instance : new V1alpha3DeviceTaintSelector();
    if (instance != null) {
        this.withDevice(instance.getDevice());
        this.withDriver(instance.getDriver());
        this.withPool(instance.getPool());
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
    V1alpha3DeviceTaintSelectorFluent that = (V1alpha3DeviceTaintSelectorFluent) o;
    if (!(Objects.equals(device, that.device))) {
      return false;
    }
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(pool, that.pool))) {
      return false;
    }
    return true;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public String getPool() {
    return this.pool;
  }
  
  public boolean hasDevice() {
    return this.device != null;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasPool() {
    return this.pool != null;
  }
  
  public int hashCode() {
    return Objects.hash(device, driver, pool);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(device == null)) {
        sb.append("device:");
        sb.append(device);
        sb.append(",");
    }
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(pool == null)) {
        sb.append("pool:");
        sb.append(pool);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withDevice(String device) {
    this.device = device;
    return (A) this;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public A withPool(String pool) {
    this.pool = pool;
    return (A) this;
  }
  
}