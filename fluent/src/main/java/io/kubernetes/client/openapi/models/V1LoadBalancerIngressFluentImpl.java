package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
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
  public class V1LoadBalancerIngressFluentImpl<A extends V1LoadBalancerIngressFluent<A>> extends BaseFluent<A> implements V1LoadBalancerIngressFluent<A>{
  public V1LoadBalancerIngressFluentImpl() {
  }
  public V1LoadBalancerIngressFluentImpl(V1LoadBalancerIngress instance) {
    this.withHostname(instance.getHostname());

    this.withIp(instance.getIp());

    this.withPorts(instance.getPorts());

  }
  private String hostname;
  private String ip;
  private ArrayList<V1PortStatusBuilder> ports;
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
  public A addToPorts(Integer index,V1PortStatus item) {
    if (this.ports == null) {this.ports = new ArrayList<V1PortStatusBuilder>();}
    V1PortStatusBuilder builder = new V1PortStatusBuilder(item);_visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
  }
  public A setToPorts(Integer index,V1PortStatus item) {
    if (this.ports == null) {this.ports = new ArrayList<V1PortStatusBuilder>();}
    V1PortStatusBuilder builder = new V1PortStatusBuilder(item);
    if (index < 0 || index >= _visitables.get("ports").size()) { _visitables.get("ports").add(builder); } else { _visitables.get("ports").set(index, builder);}
    if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
     return (A)this;
  }
  public A addToPorts(io.kubernetes.client.openapi.models.V1PortStatus... items) {
    if (this.ports == null) {this.ports = new ArrayList<V1PortStatusBuilder>();}
    for (V1PortStatus item : items) {V1PortStatusBuilder builder = new V1PortStatusBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A addAllToPorts(Collection<V1PortStatus> items) {
    if (this.ports == null) {this.ports = new ArrayList<V1PortStatusBuilder>();}
    for (V1PortStatus item : items) {V1PortStatusBuilder builder = new V1PortStatusBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1PortStatus... items) {
    for (V1PortStatus item : items) {V1PortStatusBuilder builder = new V1PortStatusBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeAllFromPorts(Collection<V1PortStatus> items) {
    for (V1PortStatus item : items) {V1PortStatusBuilder builder = new V1PortStatusBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPorts(Predicate<V1PortStatusBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<V1PortStatusBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      V1PortStatusBuilder builder = each.next();
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
  public List<V1PortStatus> getPorts() {
    return ports != null ? build(ports) : null;
  }
  public List<V1PortStatus> buildPorts() {
    return ports != null ? build(ports) : null;
  }
  public V1PortStatus buildPort(Integer index) {
    return this.ports.get(index).build();
  }
  public V1PortStatus buildFirstPort() {
    return this.ports.get(0).build();
  }
  public V1PortStatus buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  public V1PortStatus buildMatchingPort(Predicate<V1PortStatusBuilder> predicate) {
    for (V1PortStatusBuilder item: ports) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPort(Predicate<V1PortStatusBuilder> predicate) {
    for (V1PortStatusBuilder item: ports) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPorts(List<V1PortStatus> ports) {
    if (this.ports != null) { _visitables.get("ports").removeAll(this.ports);}
    if (ports != null) {this.ports = new ArrayList(); for (V1PortStatus item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.V1PortStatus... ports) {
    if (this.ports != null) {this.ports.clear();}
    if (ports != null) {for (V1PortStatus item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1LoadBalancerIngressFluent.PortsNested<A> addNewPort() {
    return new V1LoadBalancerIngressFluentImpl.PortsNestedImpl();
  }
  public V1LoadBalancerIngressFluent.PortsNested<A> addNewPortLike(V1PortStatus item) {
    return new V1LoadBalancerIngressFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1LoadBalancerIngressFluent.PortsNested<A> setNewPortLike(Integer index,V1PortStatus item) {
    return new V1LoadBalancerIngressFluentImpl.PortsNestedImpl(index, item);
  }
  public V1LoadBalancerIngressFluent.PortsNested<A> editPort(Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1LoadBalancerIngressFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1LoadBalancerIngressFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1LoadBalancerIngressFluent.PortsNested<A> editMatchingPort(Predicate<V1PortStatusBuilder> predicate) {
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
    V1LoadBalancerIngressFluentImpl that = (V1LoadBalancerIngressFluentImpl) o;
    if (hostname != null ? !hostname.equals(that.hostname) :that.hostname != null) return false;
    if (ip != null ? !ip.equals(that.ip) :that.ip != null) return false;
    if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
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
    if (ports != null && !ports.isEmpty()) { sb.append("ports:"); sb.append(ports); }
    sb.append("}");
    return sb.toString();
  }
  class PortsNestedImpl<N> extends V1PortStatusFluentImpl<V1LoadBalancerIngressFluent.PortsNested<N>> implements V1LoadBalancerIngressFluent.PortsNested<N>,Nested<N>{
    PortsNestedImpl(Integer index,V1PortStatus item) {
      this.index = index;
      this.builder = new V1PortStatusBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new V1PortStatusBuilder(this);
    }
    V1PortStatusBuilder builder;
    Integer index;
    public N and() {
      return (N) V1LoadBalancerIngressFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  
}