package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LoadBalancerIngressFluent<A extends io.kubernetes.client.openapi.models.V1LoadBalancerIngressFluent<A>> extends BaseFluent<A>{
  public V1LoadBalancerIngressFluent() {
  }
  
  public V1LoadBalancerIngressFluent(V1LoadBalancerIngress instance) {
    this.copyInstance(instance);
  }
  private String hostname;
  private String ip;
  private String ipMode;
  private ArrayList<V1PortStatusBuilder> ports;
  
  protected void copyInstance(V1LoadBalancerIngress instance) {
    instance = instance != null ? instance : new V1LoadBalancerIngress();
    if (instance != null) {
        this.withHostname(instance.getHostname());
        this.withIp(instance.getIp());
        this.withIpMode(instance.getIpMode());
        this.withPorts(instance.getPorts());
    }
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public A withHostname(String hostname) {
    this.hostname = hostname;
    return (A) this;
  }
  
  public boolean hasHostname() {
    return this.hostname != null;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
  public boolean hasIp() {
    return this.ip != null;
  }
  
  public String getIpMode() {
    return this.ipMode;
  }
  
  public A withIpMode(String ipMode) {
    this.ipMode = ipMode;
    return (A) this;
  }
  
  public boolean hasIpMode() {
    return this.ipMode != null;
  }
  
  public A addToPorts(int index,V1PortStatus item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1PortStatusBuilder builder = new V1PortStatusBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToPorts(int index,V1PortStatus item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1PortStatusBuilder builder = new V1PortStatusBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToPorts(V1PortStatus... items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1PortStatus item : items) {
        V1PortStatusBuilder builder = new V1PortStatusBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPorts(Collection<V1PortStatus> items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1PortStatus item : items) {
        V1PortStatusBuilder builder = new V1PortStatusBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromPorts(V1PortStatus... items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1PortStatus item : items) {
        V1PortStatusBuilder builder = new V1PortStatusBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPorts(Collection<V1PortStatus> items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1PortStatus item : items) {
        V1PortStatusBuilder builder = new V1PortStatusBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPorts(Predicate<V1PortStatusBuilder> predicate) {
    if (ports == null) {
      return (A) this;
    }
    Iterator<V1PortStatusBuilder> each = ports.iterator();
    List visitables = _visitables.get("ports");
    while (each.hasNext()) {
        V1PortStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1PortStatus> buildPorts() {
    return this.ports != null ? build(ports) : null;
  }
  
  public V1PortStatus buildPort(int index) {
    return this.ports.get(index).build();
  }
  
  public V1PortStatus buildFirstPort() {
    return this.ports.get(0).build();
  }
  
  public V1PortStatus buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  
  public V1PortStatus buildMatchingPort(Predicate<V1PortStatusBuilder> predicate) {
      for (V1PortStatusBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPort(Predicate<V1PortStatusBuilder> predicate) {
      for (V1PortStatusBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPorts(List<V1PortStatus> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (V1PortStatus item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(V1PortStatus... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (V1PortStatus item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPorts() {
    return this.ports != null && !(this.ports.isEmpty());
  }
  
  public PortsNested<A> addNewPort() {
    return new PortsNested(-1, null);
  }
  
  public PortsNested<A> addNewPortLike(V1PortStatus item) {
    return new PortsNested(-1, item);
  }
  
  public PortsNested<A> setNewPortLike(int index,V1PortStatus item) {
    return new PortsNested(index, item);
  }
  
  public PortsNested<A> editPort(int index) {
    if (index <= ports.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "ports"));
    }
    return this.setNewPortLike(index, this.buildPort(index));
  }
  
  public PortsNested<A> editFirstPort() {
    if (ports.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "ports"));
    }
    return this.setNewPortLike(0, this.buildPort(0));
  }
  
  public PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "ports"));
    }
    return this.setNewPortLike(index, this.buildPort(index));
  }
  
  public PortsNested<A> editMatchingPort(Predicate<V1PortStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < ports.size();i++) {
      if (predicate.test(ports.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "ports"));
    }
    return this.setNewPortLike(index, this.buildPort(index));
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
    V1LoadBalancerIngressFluent that = (V1LoadBalancerIngressFluent) o;
    if (!(Objects.equals(hostname, that.hostname))) {
      return false;
    }
    if (!(Objects.equals(ip, that.ip))) {
      return false;
    }
    if (!(Objects.equals(ipMode, that.ipMode))) {
      return false;
    }
    if (!(Objects.equals(ports, that.ports))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(hostname, ip, ipMode, ports);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(hostname == null)) {
        sb.append("hostname:");
        sb.append(hostname);
        sb.append(",");
    }
    if (!(ip == null)) {
        sb.append("ip:");
        sb.append(ip);
        sb.append(",");
    }
    if (!(ipMode == null)) {
        sb.append("ipMode:");
        sb.append(ipMode);
        sb.append(",");
    }
    if (!(ports == null) && !(ports.isEmpty())) {
        sb.append("ports:");
        sb.append(ports);
    }
    sb.append("}");
    return sb.toString();
  }
  public class PortsNested<N> extends V1PortStatusFluent<PortsNested<N>> implements Nested<N>{
    PortsNested(int index,V1PortStatus item) {
      this.index = index;
      this.builder = new V1PortStatusBuilder(this, item);
    }
    V1PortStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1LoadBalancerIngressFluent.this.setToPorts(index, builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  
  }

}