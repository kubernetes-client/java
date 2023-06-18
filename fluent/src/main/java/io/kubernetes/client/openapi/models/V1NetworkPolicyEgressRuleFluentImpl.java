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
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NetworkPolicyEgressRuleFluentImpl<A extends V1NetworkPolicyEgressRuleFluent<A>> extends BaseFluent<A> implements V1NetworkPolicyEgressRuleFluent<A>{
  public V1NetworkPolicyEgressRuleFluentImpl() {
  }
  public V1NetworkPolicyEgressRuleFluentImpl(V1NetworkPolicyEgressRule instance) {
    if (instance != null) {
      this.withPorts(instance.getPorts());
      this.withTo(instance.getTo());
    }
  }
  private ArrayList<V1NetworkPolicyPortBuilder> ports;
  private ArrayList<V1NetworkPolicyPeerBuilder> to;
  public A addToPorts(int index,V1NetworkPolicyPort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1NetworkPolicyPortBuilder>();}
    V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").add(index, builder); ports.add(index, builder);}
    return (A)this;
  }
  public A setToPorts(int index,V1NetworkPolicyPort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1NetworkPolicyPortBuilder>();}
    V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").set(index, builder); ports.set(index, builder);}
    return (A)this;
  }
  public A addToPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items) {
    if (this.ports == null) {this.ports = new ArrayList<V1NetworkPolicyPortBuilder>();}
    for (V1NetworkPolicyPort item : items) {V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A addAllToPorts(Collection<V1NetworkPolicyPort> items) {
    if (this.ports == null) {this.ports = new ArrayList<V1NetworkPolicyPortBuilder>();}
    for (V1NetworkPolicyPort item : items) {V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A removeFromPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... items) {
    for (V1NetworkPolicyPort item : items) {V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeAllFromPorts(Collection<V1NetworkPolicyPort> items) {
    for (V1NetworkPolicyPort item : items) {V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPorts(Predicate<V1NetworkPolicyPortBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<V1NetworkPolicyPortBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      V1NetworkPolicyPortBuilder builder = each.next();
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
  public List<V1NetworkPolicyPort> getPorts() {
    return ports != null ? build(ports) : null;
  }
  public List<V1NetworkPolicyPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }
  public V1NetworkPolicyPort buildPort(int index) {
    return this.ports.get(index).build();
  }
  public V1NetworkPolicyPort buildFirstPort() {
    return this.ports.get(0).build();
  }
  public V1NetworkPolicyPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  public V1NetworkPolicyPort buildMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate) {
    for (V1NetworkPolicyPortBuilder item: ports) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate) {
    for (V1NetworkPolicyPortBuilder item: ports) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPorts(List<V1NetworkPolicyPort> ports) {
    if (this.ports != null) { _visitables.get("ports").clear();}
    if (ports != null) {this.ports = new ArrayList(); for (V1NetworkPolicyPort item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... ports) {
    if (this.ports != null) {this.ports.clear(); _visitables.remove("ports"); }
    if (ports != null) {for (V1NetworkPolicyPort item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1NetworkPolicyEgressRuleFluentImpl.PortsNested<A> addNewPort() {
    return new V1NetworkPolicyEgressRuleFluentImpl.PortsNestedImpl();
  }
  public V1NetworkPolicyEgressRuleFluentImpl.PortsNested<A> addNewPortLike(V1NetworkPolicyPort item) {
    return new V1NetworkPolicyEgressRuleFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1NetworkPolicyEgressRuleFluentImpl.PortsNested<A> setNewPortLike(int index,V1NetworkPolicyPort item) {
    return new V1NetworkPolicyEgressRuleFluentImpl.PortsNestedImpl(index, item);
  }
  public V1NetworkPolicyEgressRuleFluentImpl.PortsNested<A> editPort(int index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1NetworkPolicyEgressRuleFluentImpl.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1NetworkPolicyEgressRuleFluentImpl.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1NetworkPolicyEgressRuleFluentImpl.PortsNested<A> editMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ports.size();i++) { 
    if (predicate.test(ports.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ports. No match found.");
    return setNewPortLike(index, buildPort(index));
  }
  public A addToTo(int index,V1NetworkPolicyPeer item) {
    if (this.to == null) {this.to = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
    if (index < 0 || index >= to.size()) { _visitables.get("to").add(builder); to.add(builder); } else { _visitables.get("to").add(index, builder); to.add(index, builder);}
    return (A)this;
  }
  public A setToTo(int index,V1NetworkPolicyPeer item) {
    if (this.to == null) {this.to = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
    if (index < 0 || index >= to.size()) { _visitables.get("to").add(builder); to.add(builder); } else { _visitables.get("to").set(index, builder); to.set(index, builder);}
    return (A)this;
  }
  public A addToTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    if (this.to == null) {this.to = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("to").add(builder);this.to.add(builder);} return (A)this;
  }
  public A addAllToTo(Collection<V1NetworkPolicyPeer> items) {
    if (this.to == null) {this.to = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("to").add(builder);this.to.add(builder);} return (A)this;
  }
  public A removeFromTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("to").remove(builder);if (this.to != null) {this.to.remove(builder);}} return (A)this;
  }
  public A removeAllFromTo(Collection<V1NetworkPolicyPeer> items) {
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("to").remove(builder);if (this.to != null) {this.to.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromTo(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    if (to == null) return (A) this;
    final Iterator<V1NetworkPolicyPeerBuilder> each = to.iterator();
    final List visitables = _visitables.get("to");
    while (each.hasNext()) {
      V1NetworkPolicyPeerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildTo instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyPeer> getTo() {
    return to != null ? build(to) : null;
  }
  public List<V1NetworkPolicyPeer> buildTo() {
    return to != null ? build(to) : null;
  }
  public V1NetworkPolicyPeer buildTo(int index) {
    return this.to.get(index).build();
  }
  public V1NetworkPolicyPeer buildFirstTo() {
    return this.to.get(0).build();
  }
  public V1NetworkPolicyPeer buildLastTo() {
    return this.to.get(to.size() - 1).build();
  }
  public V1NetworkPolicyPeer buildMatchingTo(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    for (V1NetworkPolicyPeerBuilder item: to) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingTo(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    for (V1NetworkPolicyPeerBuilder item: to) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withTo(List<V1NetworkPolicyPeer> to) {
    if (this.to != null) { _visitables.get("to").clear();}
    if (to != null) {this.to = new ArrayList(); for (V1NetworkPolicyPeer item : to){this.addToTo(item);}} else { this.to = null;} return (A) this;
  }
  public A withTo(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... to) {
    if (this.to != null) {this.to.clear(); _visitables.remove("to"); }
    if (to != null) {for (V1NetworkPolicyPeer item :to){ this.addToTo(item);}} return (A) this;
  }
  public Boolean hasTo() {
    return to != null && !to.isEmpty();
  }
  public V1NetworkPolicyEgressRuleFluentImpl.ToNested<A> addNewTo() {
    return new V1NetworkPolicyEgressRuleFluentImpl.ToNestedImpl();
  }
  public V1NetworkPolicyEgressRuleFluentImpl.ToNested<A> addNewToLike(V1NetworkPolicyPeer item) {
    return new V1NetworkPolicyEgressRuleFluentImpl.ToNestedImpl(-1, item);
  }
  public V1NetworkPolicyEgressRuleFluentImpl.ToNested<A> setNewToLike(int index,V1NetworkPolicyPeer item) {
    return new V1NetworkPolicyEgressRuleFluentImpl.ToNestedImpl(index, item);
  }
  public V1NetworkPolicyEgressRuleFluentImpl.ToNested<A> editTo(int index) {
    if (to.size() <= index) throw new RuntimeException("Can't edit to. Index exceeds size.");
    return setNewToLike(index, buildTo(index));
  }
  public V1NetworkPolicyEgressRuleFluentImpl.ToNested<A> editFirstTo() {
    if (to.size() == 0) throw new RuntimeException("Can't edit first to. The list is empty.");
    return setNewToLike(0, buildTo(0));
  }
  public V1NetworkPolicyEgressRuleFluentImpl.ToNested<A> editLastTo() {
    int index = to.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last to. The list is empty.");
    return setNewToLike(index, buildTo(index));
  }
  public V1NetworkPolicyEgressRuleFluentImpl.ToNested<A> editMatchingTo(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<to.size();i++) { 
    if (predicate.test(to.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching to. No match found.");
    return setNewToLike(index, buildTo(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicyEgressRuleFluentImpl that = (V1NetworkPolicyEgressRuleFluentImpl) o;
    if (!java.util.Objects.equals(ports, that.ports)) return false;

    if (!java.util.Objects.equals(to, that.to)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(ports,  to,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ports != null) { sb.append("ports:"); sb.append(ports + ","); }
    if (to != null) { sb.append("to:"); sb.append(to); }
    sb.append("}");
    return sb.toString();
  }
  class PortsNestedImpl<N> extends V1NetworkPolicyPortFluentImpl<V1NetworkPolicyEgressRuleFluentImpl.PortsNested<N>> implements V1NetworkPolicyEgressRuleFluentImpl.PortsNested<N>,Nested<N>{
    PortsNestedImpl(int index,V1NetworkPolicyPort item) {
      this.index = index;
      this.builder = new V1NetworkPolicyPortBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new V1NetworkPolicyPortBuilder(this);
    }
    V1NetworkPolicyPortBuilder builder;
    int index;
    public N and() {
      return (N) V1NetworkPolicyEgressRuleFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  class ToNestedImpl<N> extends V1NetworkPolicyPeerFluentImpl<V1NetworkPolicyEgressRuleFluentImpl.ToNested<N>> implements V1NetworkPolicyEgressRuleFluentImpl.ToNested<N>,Nested<N>{
    ToNestedImpl(int index,V1NetworkPolicyPeer item) {
      this.index = index;
      this.builder = new V1NetworkPolicyPeerBuilder(this, item);
    }
    ToNestedImpl() {
      this.index = -1;
      this.builder = new V1NetworkPolicyPeerBuilder(this);
    }
    V1NetworkPolicyPeerBuilder builder;
    int index;
    public N and() {
      return (N) V1NetworkPolicyEgressRuleFluentImpl.this.setToTo(index,builder.build());
    }
    public N endTo() {
      return and();
    }
    
  }
  
}