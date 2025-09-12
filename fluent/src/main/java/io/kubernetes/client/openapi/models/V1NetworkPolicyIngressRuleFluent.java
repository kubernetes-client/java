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
import java.util.List;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NetworkPolicyIngressRuleFluent<A extends io.kubernetes.client.openapi.models.V1NetworkPolicyIngressRuleFluent<A>> extends BaseFluent<A>{
  public V1NetworkPolicyIngressRuleFluent() {
  }
  
  public V1NetworkPolicyIngressRuleFluent(V1NetworkPolicyIngressRule instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1NetworkPolicyPeerBuilder> from;
  private ArrayList<V1NetworkPolicyPortBuilder> ports;
  
  protected void copyInstance(V1NetworkPolicyIngressRule instance) {
    instance = instance != null ? instance : new V1NetworkPolicyIngressRule();
    if (instance != null) {
        this.withFrom(instance.getFrom());
        this.withPorts(instance.getPorts());
    }
  }
  
  public A addToFrom(int index,V1NetworkPolicyPeer item) {
    if (this.from == null) {
      this.from = new ArrayList();
    }
    V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
    if (index < 0 || index >= from.size()) {
        _visitables.get("from").add(builder);
        from.add(builder);
    } else {
        _visitables.get("from").add(builder);
        from.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToFrom(int index,V1NetworkPolicyPeer item) {
    if (this.from == null) {
      this.from = new ArrayList();
    }
    V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
    if (index < 0 || index >= from.size()) {
        _visitables.get("from").add(builder);
        from.add(builder);
    } else {
        _visitables.get("from").add(builder);
        from.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToFrom(V1NetworkPolicyPeer... items) {
    if (this.from == null) {
      this.from = new ArrayList();
    }
    for (V1NetworkPolicyPeer item : items) {
        V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
        _visitables.get("from").add(builder);
        this.from.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToFrom(Collection<V1NetworkPolicyPeer> items) {
    if (this.from == null) {
      this.from = new ArrayList();
    }
    for (V1NetworkPolicyPeer item : items) {
        V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
        _visitables.get("from").add(builder);
        this.from.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromFrom(V1NetworkPolicyPeer... items) {
    if (this.from == null) {
      return (A) this;
    }
    for (V1NetworkPolicyPeer item : items) {
        V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
        _visitables.get("from").remove(builder);
        this.from.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromFrom(Collection<V1NetworkPolicyPeer> items) {
    if (this.from == null) {
      return (A) this;
    }
    for (V1NetworkPolicyPeer item : items) {
        V1NetworkPolicyPeerBuilder builder = new V1NetworkPolicyPeerBuilder(item);
        _visitables.get("from").remove(builder);
        this.from.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    if (from == null) {
      return (A) this;
    }
    Iterator<V1NetworkPolicyPeerBuilder> each = from.iterator();
    List visitables = _visitables.get("from");
    while (each.hasNext()) {
        V1NetworkPolicyPeerBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1NetworkPolicyPeer> buildFrom() {
    return this.from != null ? build(from) : null;
  }
  
  public V1NetworkPolicyPeer buildFrom(int index) {
    return this.from.get(index).build();
  }
  
  public V1NetworkPolicyPeer buildFirstFrom() {
    return this.from.get(0).build();
  }
  
  public V1NetworkPolicyPeer buildLastFrom() {
    return this.from.get(from.size() - 1).build();
  }
  
  public V1NetworkPolicyPeer buildMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
      for (V1NetworkPolicyPeerBuilder item : from) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
      for (V1NetworkPolicyPeerBuilder item : from) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withFrom(List<V1NetworkPolicyPeer> from) {
    if (this.from != null) {
      this._visitables.get("from").clear();
    }
    if (from != null) {
        this.from = new ArrayList();
        for (V1NetworkPolicyPeer item : from) {
          this.addToFrom(item);
        }
    } else {
      this.from = null;
    }
    return (A) this;
  }
  
  public A withFrom(V1NetworkPolicyPeer... from) {
    if (this.from != null) {
        this.from.clear();
        _visitables.remove("from");
    }
    if (from != null) {
      for (V1NetworkPolicyPeer item : from) {
        this.addToFrom(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasFrom() {
    return this.from != null && !(this.from.isEmpty());
  }
  
  public FromNested<A> addNewFrom() {
    return new FromNested(-1, null);
  }
  
  public FromNested<A> addNewFromLike(V1NetworkPolicyPeer item) {
    return new FromNested(-1, item);
  }
  
  public FromNested<A> setNewFromLike(int index,V1NetworkPolicyPeer item) {
    return new FromNested(index, item);
  }
  
  public FromNested<A> editFrom(int index) {
    if (index <= from.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "from"));
    }
    return this.setNewFromLike(index, this.buildFrom(index));
  }
  
  public FromNested<A> editFirstFrom() {
    if (from.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "from"));
    }
    return this.setNewFromLike(0, this.buildFrom(0));
  }
  
  public FromNested<A> editLastFrom() {
    int index = from.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "from"));
    }
    return this.setNewFromLike(index, this.buildFrom(index));
  }
  
  public FromNested<A> editMatchingFrom(Predicate<V1NetworkPolicyPeerBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < from.size();i++) {
      if (predicate.test(from.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "from"));
    }
    return this.setNewFromLike(index, this.buildFrom(index));
  }
  
  public A addToPorts(int index,V1NetworkPolicyPort item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToPorts(int index,V1NetworkPolicyPort item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToPorts(V1NetworkPolicyPort... items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1NetworkPolicyPort item : items) {
        V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPorts(Collection<V1NetworkPolicyPort> items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (V1NetworkPolicyPort item : items) {
        V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromPorts(V1NetworkPolicyPort... items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1NetworkPolicyPort item : items) {
        V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPorts(Collection<V1NetworkPolicyPort> items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (V1NetworkPolicyPort item : items) {
        V1NetworkPolicyPortBuilder builder = new V1NetworkPolicyPortBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPorts(Predicate<V1NetworkPolicyPortBuilder> predicate) {
    if (ports == null) {
      return (A) this;
    }
    Iterator<V1NetworkPolicyPortBuilder> each = ports.iterator();
    List visitables = _visitables.get("ports");
    while (each.hasNext()) {
        V1NetworkPolicyPortBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1NetworkPolicyPort> buildPorts() {
    return this.ports != null ? build(ports) : null;
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
      for (V1NetworkPolicyPortBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate) {
      for (V1NetworkPolicyPortBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPorts(List<V1NetworkPolicyPort> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (V1NetworkPolicyPort item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(V1NetworkPolicyPort... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (V1NetworkPolicyPort item : ports) {
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
  
  public PortsNested<A> addNewPortLike(V1NetworkPolicyPort item) {
    return new PortsNested(-1, item);
  }
  
  public PortsNested<A> setNewPortLike(int index,V1NetworkPolicyPort item) {
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
  
  public PortsNested<A> editMatchingPort(Predicate<V1NetworkPolicyPortBuilder> predicate) {
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
    V1NetworkPolicyIngressRuleFluent that = (V1NetworkPolicyIngressRuleFluent) o;
    if (!(Objects.equals(from, that.from))) {
      return false;
    }
    if (!(Objects.equals(ports, that.ports))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(from, ports);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(from == null) && !(from.isEmpty())) {
        sb.append("from:");
        sb.append(from);
        sb.append(",");
    }
    if (!(ports == null) && !(ports.isEmpty())) {
        sb.append("ports:");
        sb.append(ports);
    }
    sb.append("}");
    return sb.toString();
  }
  public class FromNested<N> extends V1NetworkPolicyPeerFluent<FromNested<N>> implements Nested<N>{
    FromNested(int index,V1NetworkPolicyPeer item) {
      this.index = index;
      this.builder = new V1NetworkPolicyPeerBuilder(this, item);
    }
    V1NetworkPolicyPeerBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NetworkPolicyIngressRuleFluent.this.setToFrom(index, builder.build());
    }
    
    public N endFrom() {
      return and();
    }
    
  
  }
  public class PortsNested<N> extends V1NetworkPolicyPortFluent<PortsNested<N>> implements Nested<N>{
    PortsNested(int index,V1NetworkPolicyPort item) {
      this.index = index;
      this.builder = new V1NetworkPolicyPortBuilder(this, item);
    }
    V1NetworkPolicyPortBuilder builder;
    int index;
    
    public N and() {
      return (N) V1NetworkPolicyIngressRuleFluent.this.setToPorts(index, builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  
  }

}