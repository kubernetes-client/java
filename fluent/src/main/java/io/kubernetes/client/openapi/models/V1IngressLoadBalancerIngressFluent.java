package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1IngressLoadBalancerIngressFluent<A extends io.kubernetes.client.openapi.models.V1IngressLoadBalancerIngressFluent<A>> extends BaseFluent<A>{

  private String hostname;
  private String ip;
  private ArrayList<V1IngressPortStatusBuilder> ports;

  public V1IngressLoadBalancerIngressFluent() {
  }
  
  public V1IngressLoadBalancerIngressFluent(V1IngressLoadBalancerIngress instance) {
    this.copyInstance(instance);
  }

  public A addAllToPorts(Collection<V1IngressPortStatus> items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1IngressPortStatus item : items) {
        V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public PortsNested<A> addNewPort() {
    return new PortsNested(-1, null);
  }
  
  public PortsNested<A> addNewPortLike(V1IngressPortStatus item) {
    return new PortsNested(-1, item);
  }
  
  public A addToPorts(V1IngressPortStatus... items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1IngressPortStatus item : items) {
        V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A addToPorts(int index,V1IngressPortStatus item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.add(index, builder);
    }
    return (A) this;
  }
  
  public V1IngressPortStatus buildFirstPort() {
    return this.ports.get(0).build();
  }
  
  public V1IngressPortStatus buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  
  public V1IngressPortStatus buildMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate) {
      for (V1IngressPortStatusBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1IngressPortStatus buildPort(int index) {
    return this.ports.get(index).build();
  }
  
  public List<V1IngressPortStatus> buildPorts() {
    return this.ports != null ? build(ports) : null;
  }
  
  protected void copyInstance(V1IngressLoadBalancerIngress instance) {
    instance = instance != null ? instance : new V1IngressLoadBalancerIngress();
    if (instance != null) {
        this.withHostname(instance.getHostname());
        this.withIp(instance.getIp());
        this.withPorts(instance.getPorts());
    }
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
  
  public PortsNested<A> editMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate) {
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
  
  public PortsNested<A> editPort(int index) {
    if (ports.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "ports"));
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
    V1IngressLoadBalancerIngressFluent that = (V1IngressLoadBalancerIngressFluent) o;
    if (!(Objects.equals(hostname, that.hostname))) {
      return false;
    }
    if (!(Objects.equals(ip, that.ip))) {
      return false;
    }
    if (!(Objects.equals(ports, that.ports))) {
      return false;
    }
    return true;
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public boolean hasHostname() {
    return this.hostname != null;
  }
  
  public boolean hasIp() {
    return this.ip != null;
  }
  
  public boolean hasMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate) {
      for (V1IngressPortStatusBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasPorts() {
    return this.ports != null && !(this.ports.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(hostname, ip, ports);
  }
  
  public A removeAllFromPorts(Collection<V1IngressPortStatus> items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1IngressPortStatus item : items) {
        V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPorts(V1IngressPortStatus... items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1IngressPortStatus item : items) {
        V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPorts(Predicate<V1IngressPortStatusBuilder> predicate) {
    if (ports == null) {
      return (A) this;
    }
    Iterator<V1IngressPortStatusBuilder> each = ports.iterator();
    List visitables = _visitables.get("ports");
    while (each.hasNext()) {
        V1IngressPortStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public PortsNested<A> setNewPortLike(int index,V1IngressPortStatus item) {
    return new PortsNested(index, item);
  }
  
  public A setToPorts(int index,V1IngressPortStatus item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.set(index, builder);
    }
    return (A) this;
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
    if (!(ports == null) && !(ports.isEmpty())) {
        sb.append("ports:");
        sb.append(ports);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHostname(String hostname) {
    this.hostname = hostname;
    return (A) this;
  }
  
  public A withIp(String ip) {
    this.ip = ip;
    return (A) this;
  }
  
  public A withPorts(List<V1IngressPortStatus> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (V1IngressPortStatus item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(V1IngressPortStatus... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (V1IngressPortStatus item : ports) {
        this.addToPorts(item);
      }
    }
    return (A) this;
  }
  public class PortsNested<N> extends V1IngressPortStatusFluent<PortsNested<N>> implements Nested<N>{
  
    V1IngressPortStatusBuilder builder;
    int index;
  
    PortsNested(int index,V1IngressPortStatus item) {
      this.index = index;
      this.builder = new V1IngressPortStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1IngressLoadBalancerIngressFluent.this.setToPorts(index, builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  }
}