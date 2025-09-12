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
public class V1EndpointSubsetFluent<A extends io.kubernetes.client.openapi.models.V1EndpointSubsetFluent<A>> extends BaseFluent<A>{
  public V1EndpointSubsetFluent() {
  }
  
  public V1EndpointSubsetFluent(V1EndpointSubset instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1EndpointAddressBuilder> addresses;
  private ArrayList<V1EndpointAddressBuilder> notReadyAddresses;
  private ArrayList<CoreV1EndpointPortBuilder> ports;
  
  protected void copyInstance(V1EndpointSubset instance) {
    instance = instance != null ? instance : new V1EndpointSubset();
    if (instance != null) {
        this.withAddresses(instance.getAddresses());
        this.withNotReadyAddresses(instance.getNotReadyAddresses());
        this.withPorts(instance.getPorts());
    }
  }
  
  public A addToAddresses(int index,V1EndpointAddress item) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= addresses.size()) {
        _visitables.get("addresses").add(builder);
        addresses.add(builder);
    } else {
        _visitables.get("addresses").add(builder);
        addresses.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToAddresses(int index,V1EndpointAddress item) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= addresses.size()) {
        _visitables.get("addresses").add(builder);
        addresses.add(builder);
    } else {
        _visitables.get("addresses").add(builder);
        addresses.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToAddresses(V1EndpointAddress... items) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("addresses").add(builder);
        this.addresses.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToAddresses(Collection<V1EndpointAddress> items) {
    if (this.addresses == null) {
      this.addresses = new ArrayList();
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("addresses").add(builder);
        this.addresses.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromAddresses(V1EndpointAddress... items) {
    if (this.addresses == null) {
      return (A) this;
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("addresses").remove(builder);
        this.addresses.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromAddresses(Collection<V1EndpointAddress> items) {
    if (this.addresses == null) {
      return (A) this;
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("addresses").remove(builder);
        this.addresses.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromAddresses(Predicate<V1EndpointAddressBuilder> predicate) {
    if (addresses == null) {
      return (A) this;
    }
    Iterator<V1EndpointAddressBuilder> each = addresses.iterator();
    List visitables = _visitables.get("addresses");
    while (each.hasNext()) {
        V1EndpointAddressBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1EndpointAddress> buildAddresses() {
    return this.addresses != null ? build(addresses) : null;
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
      for (V1EndpointAddressBuilder item : addresses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate) {
      for (V1EndpointAddressBuilder item : addresses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAddresses(List<V1EndpointAddress> addresses) {
    if (this.addresses != null) {
      this._visitables.get("addresses").clear();
    }
    if (addresses != null) {
        this.addresses = new ArrayList();
        for (V1EndpointAddress item : addresses) {
          this.addToAddresses(item);
        }
    } else {
      this.addresses = null;
    }
    return (A) this;
  }
  
  public A withAddresses(V1EndpointAddress... addresses) {
    if (this.addresses != null) {
        this.addresses.clear();
        _visitables.remove("addresses");
    }
    if (addresses != null) {
      for (V1EndpointAddress item : addresses) {
        this.addToAddresses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAddresses() {
    return this.addresses != null && !(this.addresses.isEmpty());
  }
  
  public AddressesNested<A> addNewAddress() {
    return new AddressesNested(-1, null);
  }
  
  public AddressesNested<A> addNewAddressLike(V1EndpointAddress item) {
    return new AddressesNested(-1, item);
  }
  
  public AddressesNested<A> setNewAddressLike(int index,V1EndpointAddress item) {
    return new AddressesNested(index, item);
  }
  
  public AddressesNested<A> editAddress(int index) {
    if (index <= addresses.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "addresses"));
    }
    return this.setNewAddressLike(index, this.buildAddress(index));
  }
  
  public AddressesNested<A> editFirstAddress() {
    if (addresses.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "addresses"));
    }
    return this.setNewAddressLike(0, this.buildAddress(0));
  }
  
  public AddressesNested<A> editLastAddress() {
    int index = addresses.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "addresses"));
    }
    return this.setNewAddressLike(index, this.buildAddress(index));
  }
  
  public AddressesNested<A> editMatchingAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < addresses.size();i++) {
      if (predicate.test(addresses.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "addresses"));
    }
    return this.setNewAddressLike(index, this.buildAddress(index));
  }
  
  public A addToNotReadyAddresses(int index,V1EndpointAddress item) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses = new ArrayList();
    }
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= notReadyAddresses.size()) {
        _visitables.get("notReadyAddresses").add(builder);
        notReadyAddresses.add(builder);
    } else {
        _visitables.get("notReadyAddresses").add(builder);
        notReadyAddresses.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToNotReadyAddresses(int index,V1EndpointAddress item) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses = new ArrayList();
    }
    V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
    if (index < 0 || index >= notReadyAddresses.size()) {
        _visitables.get("notReadyAddresses").add(builder);
        notReadyAddresses.add(builder);
    } else {
        _visitables.get("notReadyAddresses").add(builder);
        notReadyAddresses.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToNotReadyAddresses(V1EndpointAddress... items) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses = new ArrayList();
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("notReadyAddresses").add(builder);
        this.notReadyAddresses.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToNotReadyAddresses(Collection<V1EndpointAddress> items) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses = new ArrayList();
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("notReadyAddresses").add(builder);
        this.notReadyAddresses.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromNotReadyAddresses(V1EndpointAddress... items) {
    if (this.notReadyAddresses == null) {
      return (A) this;
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("notReadyAddresses").remove(builder);
        this.notReadyAddresses.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromNotReadyAddresses(Collection<V1EndpointAddress> items) {
    if (this.notReadyAddresses == null) {
      return (A) this;
    }
    for (V1EndpointAddress item : items) {
        V1EndpointAddressBuilder builder = new V1EndpointAddressBuilder(item);
        _visitables.get("notReadyAddresses").remove(builder);
        this.notReadyAddresses.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromNotReadyAddresses(Predicate<V1EndpointAddressBuilder> predicate) {
    if (notReadyAddresses == null) {
      return (A) this;
    }
    Iterator<V1EndpointAddressBuilder> each = notReadyAddresses.iterator();
    List visitables = _visitables.get("notReadyAddresses");
    while (each.hasNext()) {
        V1EndpointAddressBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1EndpointAddress> buildNotReadyAddresses() {
    return this.notReadyAddresses != null ? build(notReadyAddresses) : null;
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
      for (V1EndpointAddressBuilder item : notReadyAddresses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate) {
      for (V1EndpointAddressBuilder item : notReadyAddresses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNotReadyAddresses(List<V1EndpointAddress> notReadyAddresses) {
    if (this.notReadyAddresses != null) {
      this._visitables.get("notReadyAddresses").clear();
    }
    if (notReadyAddresses != null) {
        this.notReadyAddresses = new ArrayList();
        for (V1EndpointAddress item : notReadyAddresses) {
          this.addToNotReadyAddresses(item);
        }
    } else {
      this.notReadyAddresses = null;
    }
    return (A) this;
  }
  
  public A withNotReadyAddresses(V1EndpointAddress... notReadyAddresses) {
    if (this.notReadyAddresses != null) {
        this.notReadyAddresses.clear();
        _visitables.remove("notReadyAddresses");
    }
    if (notReadyAddresses != null) {
      for (V1EndpointAddress item : notReadyAddresses) {
        this.addToNotReadyAddresses(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasNotReadyAddresses() {
    return this.notReadyAddresses != null && !(this.notReadyAddresses.isEmpty());
  }
  
  public NotReadyAddressesNested<A> addNewNotReadyAddress() {
    return new NotReadyAddressesNested(-1, null);
  }
  
  public NotReadyAddressesNested<A> addNewNotReadyAddressLike(V1EndpointAddress item) {
    return new NotReadyAddressesNested(-1, item);
  }
  
  public NotReadyAddressesNested<A> setNewNotReadyAddressLike(int index,V1EndpointAddress item) {
    return new NotReadyAddressesNested(index, item);
  }
  
  public NotReadyAddressesNested<A> editNotReadyAddress(int index) {
    if (index <= notReadyAddresses.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "notReadyAddresses"));
    }
    return this.setNewNotReadyAddressLike(index, this.buildNotReadyAddress(index));
  }
  
  public NotReadyAddressesNested<A> editFirstNotReadyAddress() {
    if (notReadyAddresses.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "notReadyAddresses"));
    }
    return this.setNewNotReadyAddressLike(0, this.buildNotReadyAddress(0));
  }
  
  public NotReadyAddressesNested<A> editLastNotReadyAddress() {
    int index = notReadyAddresses.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "notReadyAddresses"));
    }
    return this.setNewNotReadyAddressLike(index, this.buildNotReadyAddress(index));
  }
  
  public NotReadyAddressesNested<A> editMatchingNotReadyAddress(Predicate<V1EndpointAddressBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < notReadyAddresses.size();i++) {
      if (predicate.test(notReadyAddresses.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "notReadyAddresses"));
    }
    return this.setNewNotReadyAddressLike(index, this.buildNotReadyAddress(index));
  }
  
  public A addToPorts(int index,CoreV1EndpointPort item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToPorts(int index,CoreV1EndpointPort item) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
    if (index < 0 || index >= ports.size()) {
        _visitables.get("ports").add(builder);
        ports.add(builder);
    } else {
        _visitables.get("ports").add(builder);
        ports.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToPorts(CoreV1EndpointPort... items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (CoreV1EndpointPort item : items) {
        CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPorts(Collection<CoreV1EndpointPort> items) {
    if (this.ports == null) {
      this.ports = new ArrayList();
    }
    for (CoreV1EndpointPort item : items) {
        CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
        _visitables.get("ports").add(builder);
        this.ports.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromPorts(CoreV1EndpointPort... items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (CoreV1EndpointPort item : items) {
        CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPorts(Collection<CoreV1EndpointPort> items) {
    if (this.ports == null) {
      return (A) this;
    }
    for (CoreV1EndpointPort item : items) {
        CoreV1EndpointPortBuilder builder = new CoreV1EndpointPortBuilder(item);
        _visitables.get("ports").remove(builder);
        this.ports.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPorts(Predicate<CoreV1EndpointPortBuilder> predicate) {
    if (ports == null) {
      return (A) this;
    }
    Iterator<CoreV1EndpointPortBuilder> each = ports.iterator();
    List visitables = _visitables.get("ports");
    while (each.hasNext()) {
        CoreV1EndpointPortBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<CoreV1EndpointPort> buildPorts() {
    return this.ports != null ? build(ports) : null;
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
      for (CoreV1EndpointPortBuilder item : ports) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate) {
      for (CoreV1EndpointPortBuilder item : ports) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPorts(List<CoreV1EndpointPort> ports) {
    if (this.ports != null) {
      this._visitables.get("ports").clear();
    }
    if (ports != null) {
        this.ports = new ArrayList();
        for (CoreV1EndpointPort item : ports) {
          this.addToPorts(item);
        }
    } else {
      this.ports = null;
    }
    return (A) this;
  }
  
  public A withPorts(CoreV1EndpointPort... ports) {
    if (this.ports != null) {
        this.ports.clear();
        _visitables.remove("ports");
    }
    if (ports != null) {
      for (CoreV1EndpointPort item : ports) {
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
  
  public PortsNested<A> addNewPortLike(CoreV1EndpointPort item) {
    return new PortsNested(-1, item);
  }
  
  public PortsNested<A> setNewPortLike(int index,CoreV1EndpointPort item) {
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
  
  public PortsNested<A> editMatchingPort(Predicate<CoreV1EndpointPortBuilder> predicate) {
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
    V1EndpointSubsetFluent that = (V1EndpointSubsetFluent) o;
    if (!(Objects.equals(addresses, that.addresses))) {
      return false;
    }
    if (!(Objects.equals(notReadyAddresses, that.notReadyAddresses))) {
      return false;
    }
    if (!(Objects.equals(ports, that.ports))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(addresses, notReadyAddresses, ports);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(addresses == null) && !(addresses.isEmpty())) {
        sb.append("addresses:");
        sb.append(addresses);
        sb.append(",");
    }
    if (!(notReadyAddresses == null) && !(notReadyAddresses.isEmpty())) {
        sb.append("notReadyAddresses:");
        sb.append(notReadyAddresses);
        sb.append(",");
    }
    if (!(ports == null) && !(ports.isEmpty())) {
        sb.append("ports:");
        sb.append(ports);
    }
    sb.append("}");
    return sb.toString();
  }
  public class AddressesNested<N> extends V1EndpointAddressFluent<AddressesNested<N>> implements Nested<N>{
    AddressesNested(int index,V1EndpointAddress item) {
      this.index = index;
      this.builder = new V1EndpointAddressBuilder(this, item);
    }
    V1EndpointAddressBuilder builder;
    int index;
    
    public N and() {
      return (N) V1EndpointSubsetFluent.this.setToAddresses(index, builder.build());
    }
    
    public N endAddress() {
      return and();
    }
    
  
  }
  public class NotReadyAddressesNested<N> extends V1EndpointAddressFluent<NotReadyAddressesNested<N>> implements Nested<N>{
    NotReadyAddressesNested(int index,V1EndpointAddress item) {
      this.index = index;
      this.builder = new V1EndpointAddressBuilder(this, item);
    }
    V1EndpointAddressBuilder builder;
    int index;
    
    public N and() {
      return (N) V1EndpointSubsetFluent.this.setToNotReadyAddresses(index, builder.build());
    }
    
    public N endNotReadyAddress() {
      return and();
    }
    
  
  }
  public class PortsNested<N> extends CoreV1EndpointPortFluent<PortsNested<N>> implements Nested<N>{
    PortsNested(int index,CoreV1EndpointPort item) {
      this.index = index;
      this.builder = new CoreV1EndpointPortBuilder(this, item);
    }
    CoreV1EndpointPortBuilder builder;
    int index;
    
    public N and() {
      return (N) V1EndpointSubsetFluent.this.setToPorts(index, builder.build());
    }
    
    public N endPort() {
      return and();
    }
    
  
  }

}