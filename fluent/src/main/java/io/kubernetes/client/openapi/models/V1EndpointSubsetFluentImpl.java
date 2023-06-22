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
  public class V1EndpointSubsetFluentImpl<A extends V1EndpointSubsetFluent<A>> extends BaseFluent<A> implements V1EndpointSubsetFluent<A>{
  public V1EndpointSubsetFluentImpl() {
  }
  public V1EndpointSubsetFluentImpl(V1EndpointSubset instance) {
    if (instance != null) {
      this.withAddresses(instance.getAddresses());
      this.withNotReadyAddresses(instance.getNotReadyAddresses());
      this.withPorts(instance.getPorts());
    }
  }
  private ArrayList<V1EndpointAddressBuilder> addresses;
  private ArrayList<V1EndpointAddressBuilder> notReadyAddresses;
  private ArrayList<CoreV1EndpointPortBuilder> ports;
  public A addToAddresses(int index,V1EndpointAddress item) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1EndpointAddressBuilder>();}
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= addresses.size()) { _visitables.get("addresses").add(builder); addresses.add(builder); } else { _visitables.get("addresses").add(index, builder); addresses.add(index, builder);}
    return (A)this;
  }
  public A setToAddresses(int index,V1EndpointAddress item) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1EndpointAddressBuilder>();}
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= addresses.size()) { _visitables.get("addresses").add(builder); addresses.add(builder); } else { _visitables.get("addresses").set(index, builder); addresses.set(index, builder);}
    return (A)this;
  }
  public A addToAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1EndpointAddressBuilder>();}
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("addresses").add(builder);this.addresses.add(builder);} return (A)this;
  }
  public A addAllToAddresses(Collection<V1EndpointAddress> items) {
    if (this.addresses == null) {this.addresses = new ArrayList<V1EndpointAddressBuilder>();}
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("addresses").add(builder);this.addresses.add(builder);} return (A)this;
  }
  public A removeFromAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("addresses").remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
  }
  public A removeAllFromAddresses(Collection<V1EndpointAddress> items) {
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("addresses").remove(builder);if (this.addresses != null) {this.addresses.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromAddresses(Predicate<V1EndpointAddressBuilder> predicate) {
    if (addresses == null) return (A) this;
    final Iterator<V1EndpointAddressBuilder> each = addresses.iterator();
    final List visitables = _visitables.get("addresses");
    while (each.hasNext()) {
      V1EndpointAddressBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildAddresses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EndpointAddress> getAddresses() {
    return addresses != null ? build(addresses) : null;
  }
  public List<V1EndpointAddress> buildAddresses() {
    return addresses != null ? build(addresses) : null;
  }
  public V1EndpointAddress buildAddress(int index) {
    return this.addresses.get(index).build();
  }
  public V1EndpointAddress buildFirstAddress() {
    return this.addresses.get(0).build();
  }
  public V1EndpointAddress buildLastAddress() {
    return this.addresses.get(addresses.size() - 1).build();
  }
  public V1EndpointAddress buildMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    for (V1EndpointAddressBuilder item: addresses) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    for (V1EndpointAddressBuilder item: addresses) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAddresses(List<V1EndpointAddress> addresses) {
    if (this.addresses != null) { _visitables.get("addresses").clear();}
    if (addresses != null) {this.addresses = new ArrayList(); for (V1EndpointAddress item : addresses){this.addToAddresses(item);}} else { this.addresses = null;} return (A) this;
  }
  public A withAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... addresses) {
    if (this.addresses != null) {this.addresses.clear(); _visitables.remove("addresses"); }
    if (addresses != null) {for (V1EndpointAddress item :addresses){ this.addToAddresses(item);}} return (A) this;
  }
  public Boolean hasAddresses() {
    return addresses != null && !addresses.isEmpty();
  }
  public V1EndpointSubsetFluentImpl.AddressesNested<A> addNewAddress() {
    return new V1EndpointSubsetFluentImpl.AddressesNestedImpl();
  }
  public V1EndpointSubsetFluentImpl.AddressesNested<A> addNewAddressLike(V1EndpointAddress item) {
    return new V1EndpointSubsetFluentImpl.AddressesNestedImpl(-1, item);
  }
  public V1EndpointSubsetFluentImpl.AddressesNested<A> setNewAddressLike(int index,V1EndpointAddress item) {
    return new V1EndpointSubsetFluentImpl.AddressesNestedImpl(index, item);
  }
  public V1EndpointSubsetFluentImpl.AddressesNested<A> editAddress(int index) {
    if (addresses.size() <= index) throw new RuntimeException("Can't edit addresses. Index exceeds size.");
    return setNewAddressLike(index, buildAddress(index));
  }
  public V1EndpointSubsetFluentImpl.AddressesNested<A> editFirstAddress() {
    if (addresses.size() == 0) throw new RuntimeException("Can't edit first addresses. The list is empty.");
    return setNewAddressLike(0, buildAddress(0));
  }
  public V1EndpointSubsetFluentImpl.AddressesNested<A> editLastAddress() {
    int index = addresses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last addresses. The list is empty.");
    return setNewAddressLike(index, buildAddress(index));
  }
  public V1EndpointSubsetFluentImpl.AddressesNested<A> editMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    int index = -1;
    for (int i=0;i<addresses.size();i++) { 
    if (predicate.test(addresses.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching addresses. No match found.");
    return setNewAddressLike(index, buildAddress(index));
  }
  public A addToNotReadyAddresses(int index,V1EndpointAddress item) {
    if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<V1EndpointAddressBuilder>();}
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= notReadyAddresses.size()) { _visitables.get("notReadyAddresses").add(builder); notReadyAddresses.add(builder); } else { _visitables.get("notReadyAddresses").add(index, builder); notReadyAddresses.add(index, builder);}
    return (A)this;
  }
  public A setToNotReadyAddresses(int index,V1EndpointAddress item) {
    if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<V1EndpointAddressBuilder>();}
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= notReadyAddresses.size()) { _visitables.get("notReadyAddresses").add(builder); notReadyAddresses.add(builder); } else { _visitables.get("notReadyAddresses").set(index, builder); notReadyAddresses.set(index, builder);}
    return (A)this;
  }
  public A addToNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<V1EndpointAddressBuilder>();}
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("notReadyAddresses").add(builder);this.notReadyAddresses.add(builder);} return (A)this;
  }
  public A addAllToNotReadyAddresses(Collection<V1EndpointAddress> items) {
    if (this.notReadyAddresses == null) {this.notReadyAddresses = new ArrayList<V1EndpointAddressBuilder>();}
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("notReadyAddresses").add(builder);this.notReadyAddresses.add(builder);} return (A)this;
  }
  public A removeFromNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... items) {
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("notReadyAddresses").remove(builder);if (this.notReadyAddresses != null) {this.notReadyAddresses.remove(builder);}} return (A)this;
  }
  public A removeAllFromNotReadyAddresses(Collection<V1EndpointAddress> items) {
    for (V1EndpointAddress item : items) {V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);_visitables.get("notReadyAddresses").remove(builder);if (this.notReadyAddresses != null) {this.notReadyAddresses.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromNotReadyAddresses(Predicate<V1EndpointAddressBuilder> predicate) {
    if (notReadyAddresses == null) return (A) this;
    final Iterator<V1EndpointAddressBuilder> each = notReadyAddresses.iterator();
    final List visitables = _visitables.get("notReadyAddresses");
    while (each.hasNext()) {
      V1EndpointAddressBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildNotReadyAddresses instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1EndpointAddress> getNotReadyAddresses() {
    return notReadyAddresses != null ? build(notReadyAddresses) : null;
  }
  public List<V1EndpointAddress> buildNotReadyAddresses() {
    return notReadyAddresses != null ? build(notReadyAddresses) : null;
  }
  public V1EndpointAddress buildNotReadyAddress(int index) {
    return this.notReadyAddresses.get(index).build();
  }
  public V1EndpointAddress buildFirstNotReadyAddress() {
    return this.notReadyAddresses.get(0).build();
  }
  public V1EndpointAddress buildLastNotReadyAddress() {
    return this.notReadyAddresses.get(notReadyAddresses.size() - 1).build();
  }
  public V1EndpointAddress buildMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    for (V1EndpointAddressBuilder item: notReadyAddresses) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    for (V1EndpointAddressBuilder item: notReadyAddresses) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withNotReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {
    if (this.notReadyAddresses != null) { _visitables.get("notReadyAddresses").clear();}
    if (notReadyAddresses != null) {this.notReadyAddresses = new ArrayList(); for (V1EndpointAddress item : notReadyAddresses){this.addToNotReadyAddresses(item);}} else { this.notReadyAddresses = null;} return (A) this;
  }
  public A withNotReadyAddresses(io.kubernetes.client.openapi.models.V1EndpointAddress... notReadyAddresses) {
    if (this.notReadyAddresses != null) {this.notReadyAddresses.clear(); _visitables.remove("notReadyAddresses"); }
    if (notReadyAddresses != null) {for (V1EndpointAddress item :notReadyAddresses){ this.addToNotReadyAddresses(item);}} return (A) this;
  }
  public Boolean hasNotReadyAddresses() {
    return notReadyAddresses != null && !notReadyAddresses.isEmpty();
  }
  public V1EndpointSubsetFluentImpl.NotReadyAddressesNested<A> addNewNotReadyAddress() {
    return new V1EndpointSubsetFluentImpl.NotReadyAddressesNestedImpl();
  }
  public V1EndpointSubsetFluentImpl.NotReadyAddressesNested<A> addNewNotReadyAddressLike(V1EndpointAddress item) {
    return new V1EndpointSubsetFluentImpl.NotReadyAddressesNestedImpl(-1, item);
  }
  public V1EndpointSubsetFluentImpl.NotReadyAddressesNested<A> setNewNotReadyAddressLike(int index,V1EndpointAddress item) {
    return new V1EndpointSubsetFluentImpl.NotReadyAddressesNestedImpl(index, item);
  }
  public V1EndpointSubsetFluentImpl.NotReadyAddressesNested<A> editNotReadyAddress(int index) {
    if (notReadyAddresses.size() <= index) throw new RuntimeException("Can't edit notReadyAddresses. Index exceeds size.");
    return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
  }
  public V1EndpointSubsetFluentImpl.NotReadyAddressesNested<A> editFirstNotReadyAddress() {
    if (notReadyAddresses.size() == 0) throw new RuntimeException("Can't edit first notReadyAddresses. The list is empty.");
    return setNewNotReadyAddressLike(0, buildNotReadyAddress(0));
  }
  public V1EndpointSubsetFluentImpl.NotReadyAddressesNested<A> editLastNotReadyAddress() {
    int index = notReadyAddresses.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last notReadyAddresses. The list is empty.");
    return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
  }
  public V1EndpointSubsetFluentImpl.NotReadyAddressesNested<A> editMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    int index = -1;
    for (int i=0;i<notReadyAddresses.size();i++) { 
    if (predicate.test(notReadyAddresses.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching notReadyAddresses. No match found.");
    return setNewNotReadyAddressLike(index, buildNotReadyAddress(index));
  }
  public A addToPorts(int index,CoreV1EndpointPort item) {
    if (this.ports == null) {this.ports = new ArrayList<CoreV1EndpointPortBuilder>();}
    CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").add(index, builder); ports.add(index, builder);}
    return (A)this;
  }
  public A setToPorts(int index,CoreV1EndpointPort item) {
    if (this.ports == null) {this.ports = new ArrayList<CoreV1EndpointPortBuilder>();}
    CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
    if (index < 0 || index >= ports.size()) { _visitables.get("ports").add(builder); ports.add(builder); } else { _visitables.get("ports").set(index, builder); ports.set(index, builder);}
    return (A)this;
  }
  public A addToPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items) {
    if (this.ports == null) {this.ports = new ArrayList<CoreV1EndpointPortBuilder>();}
    for (CoreV1EndpointPort item : items) {CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A addAllToPorts(Collection<CoreV1EndpointPort> items) {
    if (this.ports == null) {this.ports = new ArrayList<CoreV1EndpointPortBuilder>();}
    for (CoreV1EndpointPort item : items) {CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);_visitables.get("ports").add(builder);this.ports.add(builder);} return (A)this;
  }
  public A removeFromPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... items) {
    for (CoreV1EndpointPort item : items) {CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeAllFromPorts(Collection<CoreV1EndpointPort> items) {
    for (CoreV1EndpointPort item : items) {CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);_visitables.get("ports").remove(builder);if (this.ports != null) {this.ports.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromPorts(Predicate<CoreV1EndpointPortBuilder> predicate) {
    if (ports == null) return (A) this;
    final Iterator<CoreV1EndpointPortBuilder> each = ports.iterator();
    final List visitables = _visitables.get("ports");
    while (each.hasNext()) {
      CoreV1EndpointPortBuilder builder = each.next();
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
  public List<CoreV1EndpointPort> getPorts() {
    return ports != null ? build(ports) : null;
  }
  public List<CoreV1EndpointPort> buildPorts() {
    return ports != null ? build(ports) : null;
  }
  public CoreV1EndpointPort buildPort(int index) {
    return this.ports.get(index).build();
  }
  public CoreV1EndpointPort buildFirstPort() {
    return this.ports.get(0).build();
  }
  public CoreV1EndpointPort buildLastPort() {
    return this.ports.get(ports.size() - 1).build();
  }
  public CoreV1EndpointPort buildMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate) {
    for (CoreV1EndpointPortBuilder item: ports) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate) {
    for (CoreV1EndpointPortBuilder item: ports) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withPorts(List<CoreV1EndpointPort> ports) {
    if (this.ports != null) { _visitables.get("ports").clear();}
    if (ports != null) {this.ports = new ArrayList(); for (CoreV1EndpointPort item : ports){this.addToPorts(item);}} else { this.ports = null;} return (A) this;
  }
  public A withPorts(io.kubernetes.client.openapi.models.CoreV1EndpointPort... ports) {
    if (this.ports != null) {this.ports.clear(); _visitables.remove("ports"); }
    if (ports != null) {for (CoreV1EndpointPort item :ports){ this.addToPorts(item);}} return (A) this;
  }
  public Boolean hasPorts() {
    return ports != null && !ports.isEmpty();
  }
  public V1EndpointSubsetFluentImpl.PortsNested<A> addNewPort() {
    return new V1EndpointSubsetFluentImpl.PortsNestedImpl();
  }
  public V1EndpointSubsetFluentImpl.PortsNested<A> addNewPortLike(CoreV1EndpointPort item) {
    return new V1EndpointSubsetFluentImpl.PortsNestedImpl(-1, item);
  }
  public V1EndpointSubsetFluentImpl.PortsNested<A> setNewPortLike(int index,CoreV1EndpointPort item) {
    return new V1EndpointSubsetFluentImpl.PortsNestedImpl(index, item);
  }
  public V1EndpointSubsetFluentImpl.PortsNested<A> editPort(int index) {
    if (ports.size() <= index) throw new RuntimeException("Can't edit ports. Index exceeds size.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1EndpointSubsetFluentImpl.PortsNested<A> editFirstPort() {
    if (ports.size() == 0) throw new RuntimeException("Can't edit first ports. The list is empty.");
    return setNewPortLike(0, buildPort(0));
  }
  public V1EndpointSubsetFluentImpl.PortsNested<A> editLastPort() {
    int index = ports.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ports. The list is empty.");
    return setNewPortLike(index, buildPort(index));
  }
  public V1EndpointSubsetFluentImpl.PortsNested<A> editMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate) {
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
    V1EndpointSubsetFluentImpl that = (V1EndpointSubsetFluentImpl) o;
    if (!java.util.Objects.equals(addresses, that.addresses)) return false;

    if (!java.util.Objects.equals(notReadyAddresses, that.notReadyAddresses)) return false;

    if (!java.util.Objects.equals(ports, that.ports)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(addresses,  notReadyAddresses,  ports,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (addresses != null) { sb.append("addresses:"); sb.append(addresses + ","); }
    if (notReadyAddresses != null) { sb.append("notReadyAddresses:"); sb.append(notReadyAddresses + ","); }
    if (ports != null) { sb.append("ports:"); sb.append(ports); }
    sb.append("}");
    return sb.toString();
  }
  class AddressesNestedImpl<N> extends V1EndpointAddressFluentImpl<V1EndpointSubsetFluentImpl.AddressesNested<N>> implements V1EndpointSubsetFluentImpl.AddressesNested<N>,Nested<N>{
    AddressesNestedImpl(int index,V1EndpointAddress item) {
      this.index = index;
      this.builder = new V1EndpointAddressBuilder(this, item);
    }
    AddressesNestedImpl() {
      this.index = -1;
      this.builder = new V1EndpointAddressBuilder(this);
    }
    V1EndpointAddressBuilder builder;
    int index;
    public N and() {
      return (N) V1EndpointSubsetFluentImpl.this.setToAddresses(index,builder.build());
    }
    public N endAddress() {
      return and();
    }
    
  }
  class NotReadyAddressesNestedImpl<N> extends V1EndpointAddressFluentImpl<V1EndpointSubsetFluentImpl.NotReadyAddressesNested<N>> implements V1EndpointSubsetFluentImpl.NotReadyAddressesNested<N>,Nested<N>{
    NotReadyAddressesNestedImpl(int index,V1EndpointAddress item) {
      this.index = index;
      this.builder = new V1EndpointAddressBuilder(this, item);
    }
    NotReadyAddressesNestedImpl() {
      this.index = -1;
      this.builder = new V1EndpointAddressBuilder(this);
    }
    V1EndpointAddressBuilder builder;
    int index;
    public N and() {
      return (N) V1EndpointSubsetFluentImpl.this.setToNotReadyAddresses(index,builder.build());
    }
    public N endNotReadyAddress() {
      return and();
    }
    
  }
  class PortsNestedImpl<N> extends CoreV1EndpointPortFluentImpl<V1EndpointSubsetFluentImpl.PortsNested<N>> implements V1EndpointSubsetFluentImpl.PortsNested<N>,Nested<N>{
    PortsNestedImpl(int index,CoreV1EndpointPort item) {
      this.index = index;
      this.builder = new CoreV1EndpointPortBuilder(this, item);
    }
    PortsNestedImpl() {
      this.index = -1;
      this.builder = new CoreV1EndpointPortBuilder(this);
    }
    CoreV1EndpointPortBuilder builder;
    int index;
    public N and() {
      return (N) V1EndpointSubsetFluentImpl.this.setToPorts(index,builder.build());
    }
    public N endPort() {
      return and();
    }
    
  }
  
}