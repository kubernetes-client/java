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
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1NetworkPolicyIngressRuleFluentImpl<A extends V1NetworkPolicyIngressRuleFluent<A>> extends BaseFluent<A> implements V1NetworkPolicyIngressRuleFluent<A>{
  public V1NetworkPolicyIngressRuleFluentImpl() {
  }
  public V1NetworkPolicyIngressRuleFluentImpl(V1NetworkPolicyIngressRule instance) {
    this.withFrom(instance.getFrom());

    this.withPorts(instance.getPorts());

  }
  private ArrayList<V1NetworkPolicyPeerBuilder> from;
  private ArrayList<V1NetworkPolicyPortBuilder> ports;
  public A addToFrom(Integer index,V1NetworkPolicyPeer item) {
    if (this.from == null) {this.from = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("from").add(index >= 0 ? index : _visitables.get("from").size(), builder);this.from.add(index >= 0 ? index : from.size(), builder); return (A)this;
  }
  public A setToFrom(Integer index,V1NetworkPolicyPeer item) {
    if (this.from == null) {this.from = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
    if (index < 0 || index >= _visitables.get("from").size()) { _visitables.get("from").add(builder); } else { _visitables.get("from").set(index, builder);}
    if (index < 0 || index >= from.size()) { from.add(builder); } else { from.set(index, builder);}
     return (A)this;
  }
  public A addToFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    if (this.from == null) {this.from = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("from").add(builder);this.from.add(builder);} return (A)this;
  }
  public A addAllToFrom(Collection<V1NetworkPolicyPeer> items) {
    if (this.from == null) {this.from = new ArrayList<V1NetworkPolicyPeerBuilder>();}
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("from").add(builder);this.from.add(builder);} return (A)this;
  }
  public A removeFromFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... items) {
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("from").remove(builder);if (this.from != null) {this.from.remove(builder);}} return (A)this;
  }
  public A removeAllFromFrom(Collection<V1NetworkPolicyPeer> items) {
    for (V1NetworkPolicyPeer item : items) {V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);_visitables.get("from").remove(builder);if (this.from != null) {this.from.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    if (from == null) return (A) this;
    final Iterator<V1NetworkPolicyPeerBuilder> each = from.iterator();
    final List visitables = _visitables.get("from");
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
   * This method has been deprecated, please use method buildFrom instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1NetworkPolicyPeer> getFrom() {
    return from != null ? build(from) : null;
  }
  public List<V1NetworkPolicyPeer> buildFrom() {
    return from != null ? build(from) : null;
  }
  public V1NetworkPolicyPeer buildFrom(Integer index) {
    return this.from.get(index).build();
  }
  public V1NetworkPolicyPeer buildFirstFrom() {
    return this.from.get(0).build();
  }
  public V1NetworkPolicyPeer buildLastFrom() {
    return this.from.get(from.size() - 1).build();
  }
  public V1NetworkPolicyPeer buildMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    for (V1NetworkPolicyPeerBuilder item: from) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    for (V1NetworkPolicyPeerBuilder item: from) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withFrom(List<V1NetworkPolicyPeer> from) {
    if (this.from != null) { _visitables.get("from").removeAll(this.from);}
    if (from != null) {this.from = new ArrayList(); for (V1NetworkPolicyPeer item : from){this.addToFrom(item);}} else { this.from = null;} return (A) this;
  }
  public A withFrom(io.kubernetes.client.openapi.models.V1NetworkPolicyPeer... from) {
    if (this.from != null) {this.from.clear();}
    if (from != null) {for (V1NetworkPolicyPeer item :from){ this.addToFrom(item);}} return (A) this;
  }
  public Boolean hasFrom() {
    return from != null && !from.isEmpty();
  }
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> addNewFrom() {
    return new V1NetworkPolicyIngressRuleFluentImpl.FromNestedImpl();
  }
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> addNewFromLike(V1NetworkPolicyPeer item) {
    return new V1NetworkPolicyIngressRuleFluentImpl.FromNestedImpl(-1, item);
  }
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> setNewFromLike(Integer index,V1NetworkPolicyPeer item) {
    return new V1NetworkPolicyIngressRuleFluentImpl.FromNestedImpl(index, item);
  }
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editFrom(Integer index) {
    if (from.size() <= index) throw new RuntimeException("Can't edit from. Index exceeds size.");
    return setNewFromLike(index, buildFrom(index));
  }
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editFirstFrom() {
    if (from.size() == 0) throw new RuntimeException("Can't edit first from. The list is empty.");
    return setNewFromLike(0, buildFrom(0));
  }
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editLastFrom() {
    int index = from.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last from. The list is empty.");
    return setNewFromLike(index, buildFrom(index));
  }
  public V1NetworkPolicyIngressRuleFluent.FromNested<A> editMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<from.size();i++) { 
    if (predicate.test(from.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching from. No match found.");
    return setNewFromLike(index, buildFrom(index));
  }
  public A addToPorts(Integer index,V1NetworkPolicyPort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1NetworkPolicyPortBuilder>();}
    V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);_visitables.get("ports").add(index >= 0 ? index : _visitables.get("ports").size(), builder);this.ports.add(index >= 0 ? index : ports.size(), builder); return (A)this;
  }
  public A setToPorts(Integer index,V1NetworkPolicyPort item) {
    if (this.ports == null) {this.ports = new ArrayList<V1NetworkPolicyPortBuilder>();}
    V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
    if (index < 0 || index >= _visitables.get("ports").size()) { _visitables.get("ports").add(builder); } else { _visitables.get("ports").set(index, builder);}
    if (index < 0 || index >= ports.size()) { ports.add(builder); } else { ports.set(index, builder);}
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
  public V1NetworkPolicyPort buildPort(Integer index) {
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
    if (this.ports != null) { _visitables.get("ports").removeAll(this.ports);}
    if (ports != null) {this.ports = new ArrayList(); for (V1NetworkPolicyPort item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.V1NetworkPolicyPort... ports) {
    if (this.ports != null) {this.ports.clear();}
    if (ports != null) {for (V1NetworkPolicyPort item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPort() {
    return new V1NetworkPolicyIngressRuleFluentImpl.PortsNestedImpl();
  }
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> addNewPortLike(V1NetworkPolicyPort item) {
    return new V1NetworkPolicyIngressRuleFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> setNewPortLike(Integer index,V1NetworkPolicyPort item) {
    return new V1NetworkPolicyIngressRuleFluentImpl.PortsNestedImpl(index, item);
  }
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editPort(Integer index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1NetworkPolicyIngressRuleFluent.PortsNested<A> editMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate) {
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
    V1NetworkPolicyIngressRuleFluentImpl that = (V1NetworkPolicyIngressRuleFluentImpl) o;
    if (from != null ? !from.equals(that.from) :that.from != null) return false;
    if (ports != null ? !ports.equals(that.ports) :that.ports != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(from,  ports,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (from != null && !from.isEmpty()) { sb.append("from:"); sb.append(from + ","); }
    if (ports != null && !ports.isEmpty()) { sb.append("ports:"); sb.append(ports); }
    sb.append("}");
    return sb.toString();
  }
  class FromNestedImpl<N> extends V1NetworkPolicyPeerFluentImpl<V1NetworkPolicyIngressRuleFluent.FromNested<N>> implements V1NetworkPolicyIngressRuleFluent.FromNested<N>,Nested<N>{
    FromNestedImpl(Integer index,V1NetworkPolicyPeer item) {
      this.index = index;
      this.builder = new V1NetworkPolicyPeerBuilder(this, item);
    }
    FromNestedImpl() {
      this.index = -1;
      this.builder = new V1NetworkPolicyPeerBuilder(this);
    }
    V1NetworkPolicyPeerBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NetworkPolicyIngressRuleFluentImpl.this.setToFrom(index,builder.build());
    }
    public N endFrom() {
      return and();
    }
    
  }
  class PortsNestedImpl<N> extends V1NetworkPolicyPortFluentImpl<V1NetworkPolicyIngressRuleFluent.PortsNested<N>> implements V1NetworkPolicyIngressRuleFluent.PortsNested<N>,Nested<N>{
    PortsNestedImpl(Integer index,V1NetworkPolicyPort item) {
      this.index = index;
      this.builder = new V1NetworkPolicyPortBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new V1NetworkPolicyPortBuilder(this);
    }
    V1NetworkPolicyPortBuilder builder;
    Integer index;
    public N and() {
      return (N) V1NetworkPolicyIngressRuleFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  
}