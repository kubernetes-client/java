package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1NetworkDeviceDataFluent<A extends io.kubernetes.client.openapi.models.V1beta1NetworkDeviceDataFluent<A>> extends BaseFluent<A>{

  private String hardwareAddress;
  private String interfaceName;
  private List<String> ips;

  public V1beta1NetworkDeviceDataFluent() {
  }
  
  public V1beta1NetworkDeviceDataFluent(V1beta1NetworkDeviceData instance) {
    this.copyInstance(instance);
  }

  public A addAllToIps(Collection<String> items) {
    if (this.ips == null) {
      this.ips = new ArrayList();
    }
    for (String item : items) {
      this.ips.add(item);
    }
    return (A) this;
  }
  
  public A addToIps(String... items) {
    if (this.ips == null) {
      this.ips = new ArrayList();
    }
    for (String item : items) {
      this.ips.add(item);
    }
    return (A) this;
  }
  
  public A addToIps(int index,String item) {
    if (this.ips == null) {
      this.ips = new ArrayList();
    }
    this.ips.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1beta1NetworkDeviceData instance) {
    instance = instance != null ? instance : new V1beta1NetworkDeviceData();
    if (instance != null) {
        this.withHardwareAddress(instance.getHardwareAddress());
        this.withInterfaceName(instance.getInterfaceName());
        this.withIps(instance.getIps());
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
    V1beta1NetworkDeviceDataFluent that = (V1beta1NetworkDeviceDataFluent) o;
    if (!(Objects.equals(hardwareAddress, that.hardwareAddress))) {
      return false;
    }
    if (!(Objects.equals(interfaceName, that.interfaceName))) {
      return false;
    }
    if (!(Objects.equals(ips, that.ips))) {
      return false;
    }
    return true;
  }
  
  public String getFirstIp() {
    return this.ips.get(0);
  }
  
  public String getHardwareAddress() {
    return this.hardwareAddress;
  }
  
  public String getInterfaceName() {
    return this.interfaceName;
  }
  
  public String getIp(int index) {
    return this.ips.get(index);
  }
  
  public List<String> getIps() {
    return this.ips;
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
  
  public boolean hasHardwareAddress() {
    return this.hardwareAddress != null;
  }
  
  public boolean hasInterfaceName() {
    return this.interfaceName != null;
  }
  
  public boolean hasIps() {
    return this.ips != null && !(this.ips.isEmpty());
  }
  
  public boolean hasMatchingIp(Predicate<String> predicate) {
      for (String item : ips) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(hardwareAddress, interfaceName, ips);
  }
  
  public A removeAllFromIps(Collection<String> items) {
    if (this.ips == null) {
      return (A) this;
    }
    for (String item : items) {
      this.ips.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromIps(String... items) {
    if (this.ips == null) {
      return (A) this;
    }
    for (String item : items) {
      this.ips.remove(item);
    }
    return (A) this;
  }
  
  public A setToIps(int index,String item) {
    if (this.ips == null) {
      this.ips = new ArrayList();
    }
    this.ips.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(hardwareAddress == null)) {
        sb.append("hardwareAddress:");
        sb.append(hardwareAddress);
        sb.append(",");
    }
    if (!(interfaceName == null)) {
        sb.append("interfaceName:");
        sb.append(interfaceName);
        sb.append(",");
    }
    if (!(ips == null) && !(ips.isEmpty())) {
        sb.append("ips:");
        sb.append(ips);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
    return (A) this;
  }
  
  public A withInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
    return (A) this;
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
  
  public A withIps(String... ips) {
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
  
}