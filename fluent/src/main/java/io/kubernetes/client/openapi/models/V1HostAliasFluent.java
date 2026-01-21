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
public class V1HostAliasFluent<A extends io.kubernetes.client.openapi.models.V1HostAliasFluent<A>> extends BaseFluent<A>{

  private List<String> hostnames;
  private String ip;

  public V1HostAliasFluent() {
  }
  
  public V1HostAliasFluent(V1HostAlias instance) {
    this.copyInstance(instance);
  }

  public A addAllToHostnames(Collection<String> items) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList();
    }
    for (String item : items) {
      this.hostnames.add(item);
    }
    return (A) this;
  }
  
  public A addToHostnames(String... items) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList();
    }
    for (String item : items) {
      this.hostnames.add(item);
    }
    return (A) this;
  }
  
  public A addToHostnames(int index,String item) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList();
    }
    this.hostnames.add(index, item);
    return (A) this;
  }
  
  protected void copyInstance(V1HostAlias instance) {
    instance = instance != null ? instance : new V1HostAlias();
    if (instance != null) {
        this.withHostnames(instance.getHostnames());
        this.withIp(instance.getIp());
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
    V1HostAliasFluent that = (V1HostAliasFluent) o;
    if (!(Objects.equals(hostnames, that.hostnames))) {
      return false;
    }
    if (!(Objects.equals(ip, that.ip))) {
      return false;
    }
    return true;
  }
  
  public String getFirstHostname() {
    return this.hostnames.get(0);
  }
  
  public String getHostname(int index) {
    return this.hostnames.get(index);
  }
  
  public List<String> getHostnames() {
    return this.hostnames;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public String getLastHostname() {
    return this.hostnames.get(hostnames.size() - 1);
  }
  
  public String getMatchingHostname(Predicate<String> predicate) {
      for (String item : hostnames) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasHostnames() {
    return this.hostnames != null && !(this.hostnames.isEmpty());
  }
  
  public boolean hasIp() {
    return this.ip != null;
  }
  
  public boolean hasMatchingHostname(Predicate<String> predicate) {
      for (String item : hostnames) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(hostnames, ip);
  }
  
  public A removeAllFromHostnames(Collection<String> items) {
    if (this.hostnames == null) {
      return (A) this;
    }
    for (String item : items) {
      this.hostnames.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromHostnames(String... items) {
    if (this.hostnames == null) {
      return (A) this;
    }
    for (String item : items) {
      this.hostnames.remove(item);
    }
    return (A) this;
  }
  
  public A setToHostnames(int index,String item) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList();
    }
    this.hostnames.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(hostnames == null) && !(hostnames.isEmpty())) {
        sb.append("hostnames:");
        sb.append(hostnames);
        sb.append(",");
    }
    if (!(ip == null)) {
        sb.append("ip:");
        sb.append(ip);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHostnames(List<String> hostnames) {
    if (hostnames != null) {
        this.hostnames = new ArrayList();
        for (String item : hostnames) {
          this.addToHostnames(item);
        }
    } else {
      this.hostnames = null;
    }
    return (A) this;
  }
  
  public A withHostnames(String... hostnames) {
    if (this.hostnames != null) {
        this.hostnames.clear();
        _visitables.remove("hostnames");
    }
    if (hostnames != null) {
      for (String item : hostnames) {
        this.addToHostnames(item);
      }
    }
    return (A) this;
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
}