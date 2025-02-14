package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3NetworkDeviceDataFluent<A extends V1alpha3NetworkDeviceDataFluent<A>> extends BaseFluent<A>{
  public V1alpha3NetworkDeviceDataFluent() {
  }
  
  public V1alpha3NetworkDeviceDataFluent(V1alpha3NetworkDeviceData instance) {
    this.copyInstance(instance);
  }
  private String hardwareAddress;
  private String interfaceName;
  private List<String> ips;
  
  protected void copyInstance(V1alpha3NetworkDeviceData instance) {
    instance = (instance != null ? instance : new V1alpha3NetworkDeviceData());
    if (instance != null) {
          this.withHardwareAddress(instance.getHardwareAddress());
          this.withInterfaceName(instance.getInterfaceName());
          this.withIps(instance.getIps());
        }
  }
  
  public String getHardwareAddress() {
    return this.hardwareAddress;
  }
  
  public A withHardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
    return (A) this;
  }
  
  public boolean hasHardwareAddress() {
    return this.hardwareAddress != null;
  }
  
  public String getInterfaceName() {
    return this.interfaceName;
  }
  
  public A withInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return (A) this;
  }
  
  public boolean hasInterfaceName() {
    return this.interfaceName != null;
  }
  
  public A addToIps(int index,String item) {
    if (this.ips == null) {this.ips = new ArrayList<String>();}
    this.ips.add(index, item);
    return (A)this;
  }
  
  public A setToIps(int index,String item) {
    if (this.ips == null) {this.ips = new ArrayList<String>();}
    this.ips.set(index, item); return (A)this;
  }
  
  public A addToIps(java.lang.String... items) {
    if (this.ips == null) {this.ips = new ArrayList<String>();}
    for (String item : items) {this.ips.add(item);} return (A)this;
  }
  
  public A addAllToIps(Collection<String> items) {
    if (this.ips == null) {this.ips = new ArrayList<String>();}
    for (String item : items) {this.ips.add(item);} return (A)this;
  }
  
  public A removeFromIps(java.lang.String... items) {
    if (this.ips == null) return (A)this;
    for (String item : items) { this.ips.remove(item);} return (A)this;
  }
  
  public A removeAllFromIps(Collection<String> items) {
    if (this.ips == null) return (A)this;
    for (String item : items) { this.ips.remove(item);} return (A)this;
  }
  
  public List<String> getIps() {
    return this.ips;
  }
  
  public String getIp(int index) {
    return this.ips.get(index);
  }
  
  public String getFirstIp() {
    return this.ips.get(0);
  }
  
  public String getLastIp() {
    return this.ips.get(ips.size() - 1);
  }
  
  public String getMatchingIp(Predicate<String> predicate) {
      for (String item : ips) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingIp(Predicate<String> predicate) {
      for (String item : ips) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withIps(List<String> ips) {
    if (ips != null) {
        this.ips = new ArrayList();
        for (String item : ips) {
          this.addToIps(item);
        }
    } else {
      this.ips = null;
    }
    return (A) this;
  }
  
  public A withIps(java.lang.String... ips) {
    if (this.ips != null) {
        this.ips.clear();
        _visitables.remove("ips");
    }
    if (ips != null) {
      for (String item : ips) {
        this.addToIps(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasIps() {
    return this.ips != null && !this.ips.isEmpty();
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha3NetworkDeviceDataFluent that = (V1alpha3NetworkDeviceDataFluent) o;
    if (!java.util.Objects.equals(hardwareAddress, that.hardwareAddress)) return false;
    if (!java.util.Objects.equals(interfaceName, that.interfaceName)) return false;
    if (!java.util.Objects.equals(ips, that.ips)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(hardwareAddress,  interfaceName,  ips,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hardwareAddress != null) { sb.append("hardwareAddress:"); sb.append(hardwareAddress + ","); }
    if (interfaceName != null) { sb.append("interfaceName:"); sb.append(interfaceName + ","); }
    if (ips != null && !ips.isEmpty()) { sb.append("ips:"); sb.append(ips); }
    sb.append("}");
    return sb.toString();
  }
  

}