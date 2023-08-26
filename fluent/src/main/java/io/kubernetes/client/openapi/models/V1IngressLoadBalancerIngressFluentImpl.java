package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1IngressLoadBalancerIngressFluentImpl<A extends V1IngressLoadBalancerIngressFluent<A>> extends BaseFluent<A> implements V1IngressLoadBalancerIngressFluent<A>{
  public V1IngressLoadBalancerIngressFluentImpl() {
  }
  public V1IngressLoadBalancerIngressFluentImpl(V1IngressLoadBalancerIngress instance) {
    if (instance != null) {
      this.withHostname(instance.getHostname());
      this.withIp(instance.getIp());
      this.withPorts(instance.getPorts());
    }
  }
  private String hostname;
  private String ip;
  private ArrayList<V1IngressPortStatusBuilder> ports;
  public String getHostname() {
    return this.hostname;
  }
  public A withHostname(String hostname) {
    this.hostname=hostname; return (A) this;
  }
  public Boolean hasHostname() {
    return this.hostname != null;
  }
  public String getIp() {
    return this.ip;
  }
  public A withIp(String ip) {
    this.ip=ip; return (A) this;
  }
  public Boolean hasIp() {
    return this.ip != null;
  }
  public A addToPorts(int index,V1IngressPortStatus item) {
    if (this.ports == null) {this.ports = new ArrayList<V1IngressPortStatusBuilder>();}
    V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").add(index, builder); ports.add(index, builder);}
    return (A)this;
  }
  public A setToPorts(int index,V1IngressPortStatus item) {
    if (this.ports == null) {this.ports = new ArrayList<V1IngressPortStatusBuilder>();}
    V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").set(index, builder); ports.set(index, builder);}
    return (A)this;
  }
  public A addToPorts(io.kubernetes.client.openapi.models.V1IngressPortStatus... items) {
    if (this.ports == null) {this.ports = new ArrayList<V1IngressPortStatusBuilder>();}
    for (V1IngressPortStatus item : items) {V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A addAllToPorts(Collection<V1IngressPortStatus> items) {
    if (this.ports == null) {this.ports = new ArrayList<V1IngressPortStatusBuilder>();}
    for (V1IngressPortStatus item : items) {V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1IngressPortStatus... items) {
    for (V1IngressPortStatus item : items) {V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeAllFromPorts(Collection<V1IngressPortStatus> items) {
    for (V1IngressPortStatus item : items) {V1IngressPortStatusBuilder builder = new V1IngressPortStatusBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPorts(Predicate<V1IngressPortStatusBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<V1IngressPortStatusBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      V1IngressPortStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildPorts instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1IngressPortStatus> getPorts() {
    return ports != null ? build(ports) : null;
  }
  public List<V1IngressPortStatus> buildPorts() {
    return ports != null ? build(ports) : null;
  }
  public V1IngressPortStatus buildPort(int index) {
    return this.ports.get(index).build();
  }
  public V1IngressPortStatus buildFirstPort() {
    return this.ports.get(0).build();
  }
  public V1IngressPortStatus buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  public V1IngressPortStatus buildMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate) {
    for (V1IngressPortStatusBuilder item: ports) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate) {
    for (V1IngressPortStatusBuilder item: ports) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPorts(List<V1IngressPortStatus> ports) {
    if (this.ports != null) { _visitables.get("ports").clear();}
    if (ports != null) {this.ports = new ArrayList(); for (V1IngressPortStatus item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.V1IngressPortStatus... ports) {
    if (this.ports != null) {this.ports.clear(); _visitables.remove("ports"); }
    if (ports != null) {for (V1IngressPortStatus item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1IngressLoadBalancerIngressFluentImpl.PortsNested<A> addNewPort() {
    return new V1IngressLoadBalancerIngressFluentImpl.PortsNestedImpl();
  }
  public V1IngressLoadBalancerIngressFluentImpl.PortsNested<A> addNewPortLike(V1IngressPortStatus item) {
    return new V1IngressLoadBalancerIngressFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1IngressLoadBalancerIngressFluentImpl.PortsNested<A> setNewPortLike(int index,V1IngressPortStatus item) {
    return new V1IngressLoadBalancerIngressFluentImpl.PortsNestedImpl(index, item);
  }
  public V1IngressLoadBalancerIngressFluentImpl.PortsNested<A> editPort(int index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1IngressLoadBalancerIngressFluentImpl.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1IngressLoadBalancerIngressFluentImpl.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1IngressLoadBalancerIngressFluentImpl.PortsNested<A> editMatchingPort(Predicate<V1IngressPortStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ports.size();i++) { 
    if (predicate.test(ports.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IngressLoadBalancerIngressFluentImpl that = (V1IngressLoadBalancerIngressFluentImpl) o;
    if (!java.util.Objects.equals(hostname, that.hostname)) return false;

    if (!java.util.Objects.equals(ip, that.ip)) return false;

    if (!java.util.Objects.equals(ports, that.ports)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(hostname,  ip,  ports,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (hostname != null) { sb.append("hostname:"); sb.append(hostname + ","); }
    if (ip != null) { sb.append("ip:"); sb.append(ip + ","); }
    if (ports != null) { sb.append("ports:"); sb.append(ports); }
    sb.append("}");
    return sb.toString();
  }
  class PortsNestedImpl<N> extends V1IngressPortStatusFluentImpl<V1IngressLoadBalancerIngressFluentImpl.PortsNested<N>> implements V1IngressLoadBalancerIngressFluentImpl.PortsNested<N>,Nested<N>{
    PortsNestedImpl(int index,V1IngressPortStatus item) {
      this.index = index;
      this.builder = new V1IngressPortStatusBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new V1IngressPortStatusBuilder(this);
    }
    V1IngressPortStatusBuilder builder;
    int index;
    public N and() {
      return (N) V1IngressLoadBalancerIngressFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  
}