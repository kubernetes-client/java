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
import java.util.Optional;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1ResourceClaimStatusFluent<A extends io.kubernetes.client.openapi.models.V1beta1ResourceClaimStatusFluent<A>> extends BaseFluent<A>{
  public V1beta1ResourceClaimStatusFluent() {
  }
  
  public V1beta1ResourceClaimStatusFluent(V1beta1ResourceClaimStatus instance) {
    this.copyInstance(instance);
  }
  private V1beta1AllocationResultBuilder allocation;
  private ArrayList<V1beta1AllocatedDeviceStatusBuilder> devices;
  private ArrayList<V1beta1ResourceClaimConsumerReferenceBuilder> reservedFor;
  
  protected void copyInstance(V1beta1ResourceClaimStatus instance) {
    instance = instance != null ? instance : new V1beta1ResourceClaimStatus();
    if (instance != null) {
        this.withAllocation(instance.getAllocation());
        this.withDevices(instance.getDevices());
        this.withReservedFor(instance.getReservedFor());
    }
  }
  
  public V1beta1AllocationResult buildAllocation() {
    return this.allocation != null ? this.allocation.build() : null;
  }
  
  public A withAllocation(V1beta1AllocationResult allocation) {
    this._visitables.remove("allocation");
    if (allocation != null) {
        this.allocation = new V1beta1AllocationResultBuilder(allocation);
        this._visitables.get("allocation").add(this.allocation);
    } else {
        this.allocation = null;
        this._visitables.get("allocation").remove(this.allocation);
    }
    return (A) this;
  }
  
  public boolean hasAllocation() {
    return this.allocation != null;
  }
  
  public AllocationNested<A> withNewAllocation() {
    return new AllocationNested(null);
  }
  
  public AllocationNested<A> withNewAllocationLike(V1beta1AllocationResult item) {
    return new AllocationNested(item);
  }
  
  public AllocationNested<A> editAllocation() {
    return this.withNewAllocationLike(Optional.ofNullable(this.buildAllocation()).orElse(null));
  }
  
  public AllocationNested<A> editOrNewAllocation() {
    return this.withNewAllocationLike(Optional.ofNullable(this.buildAllocation()).orElse(new V1beta1AllocationResultBuilder().build()));
  }
  
  public AllocationNested<A> editOrNewAllocationLike(V1beta1AllocationResult item) {
    return this.withNewAllocationLike(Optional.ofNullable(this.buildAllocation()).orElse(item));
  }
  
  public A addToDevices(int index,V1beta1AllocatedDeviceStatus item) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    V1beta1AllocatedDeviceStatusBuilder builder = new V1beta1AllocatedDeviceStatusBuilder(item);
    if (index < 0 || index >= devices.size()) {
        _visitables.get("devices").add(builder);
        devices.add(builder);
    } else {
        _visitables.get("devices").add(builder);
        devices.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToDevices(int index,V1beta1AllocatedDeviceStatus item) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    V1beta1AllocatedDeviceStatusBuilder builder = new V1beta1AllocatedDeviceStatusBuilder(item);
    if (index < 0 || index >= devices.size()) {
        _visitables.get("devices").add(builder);
        devices.add(builder);
    } else {
        _visitables.get("devices").add(builder);
        devices.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToDevices(V1beta1AllocatedDeviceStatus... items) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    for (V1beta1AllocatedDeviceStatus item : items) {
        V1beta1AllocatedDeviceStatusBuilder builder = new V1beta1AllocatedDeviceStatusBuilder(item);
        _visitables.get("devices").add(builder);
        this.devices.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToDevices(Collection<V1beta1AllocatedDeviceStatus> items) {
    if (this.devices == null) {
      this.devices = new ArrayList();
    }
    for (V1beta1AllocatedDeviceStatus item : items) {
        V1beta1AllocatedDeviceStatusBuilder builder = new V1beta1AllocatedDeviceStatusBuilder(item);
        _visitables.get("devices").add(builder);
        this.devices.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromDevices(V1beta1AllocatedDeviceStatus... items) {
    if (this.devices == null) {
      return (A) this;
    }
    for (V1beta1AllocatedDeviceStatus item : items) {
        V1beta1AllocatedDeviceStatusBuilder builder = new V1beta1AllocatedDeviceStatusBuilder(item);
        _visitables.get("devices").remove(builder);
        this.devices.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromDevices(Collection<V1beta1AllocatedDeviceStatus> items) {
    if (this.devices == null) {
      return (A) this;
    }
    for (V1beta1AllocatedDeviceStatus item : items) {
        V1beta1AllocatedDeviceStatusBuilder builder = new V1beta1AllocatedDeviceStatusBuilder(item);
        _visitables.get("devices").remove(builder);
        this.devices.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromDevices(Predicate<V1beta1AllocatedDeviceStatusBuilder> predicate) {
    if (devices == null) {
      return (A) this;
    }
    Iterator<V1beta1AllocatedDeviceStatusBuilder> each = devices.iterator();
    List visitables = _visitables.get("devices");
    while (each.hasNext()) {
        V1beta1AllocatedDeviceStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1AllocatedDeviceStatus> buildDevices() {
    return this.devices != null ? build(devices) : null;
  }
  
  public V1beta1AllocatedDeviceStatus buildDevice(int index) {
    return this.devices.get(index).build();
  }
  
  public V1beta1AllocatedDeviceStatus buildFirstDevice() {
    return this.devices.get(0).build();
  }
  
  public V1beta1AllocatedDeviceStatus buildLastDevice() {
    return this.devices.get(devices.size() - 1).build();
  }
  
  public V1beta1AllocatedDeviceStatus buildMatchingDevice(Predicate<V1beta1AllocatedDeviceStatusBuilder> predicate) {
      for (V1beta1AllocatedDeviceStatusBuilder item : devices) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingDevice(Predicate<V1beta1AllocatedDeviceStatusBuilder> predicate) {
      for (V1beta1AllocatedDeviceStatusBuilder item : devices) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withDevices(List<V1beta1AllocatedDeviceStatus> devices) {
    if (this.devices != null) {
      this._visitables.get("devices").clear();
    }
    if (devices != null) {
        this.devices = new ArrayList();
        for (V1beta1AllocatedDeviceStatus item : devices) {
          this.addToDevices(item);
        }
    } else {
      this.devices = null;
    }
    return (A) this;
  }
  
  public A withDevices(V1beta1AllocatedDeviceStatus... devices) {
    if (this.devices != null) {
        this.devices.clear();
        _visitables.remove("devices");
    }
    if (devices != null) {
      for (V1beta1AllocatedDeviceStatus item : devices) {
        this.addToDevices(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasDevices() {
    return this.devices != null && !(this.devices.isEmpty());
  }
  
  public DevicesNested<A> addNewDevice() {
    return new DevicesNested(-1, null);
  }
  
  public DevicesNested<A> addNewDeviceLike(V1beta1AllocatedDeviceStatus item) {
    return new DevicesNested(-1, item);
  }
  
  public DevicesNested<A> setNewDeviceLike(int index,V1beta1AllocatedDeviceStatus item) {
    return new DevicesNested(index, item);
  }
  
  public DevicesNested<A> editDevice(int index) {
    if (index <= devices.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "devices"));
    }
    return this.setNewDeviceLike(index, this.buildDevice(index));
  }
  
  public DevicesNested<A> editFirstDevice() {
    if (devices.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "devices"));
    }
    return this.setNewDeviceLike(0, this.buildDevice(0));
  }
  
  public DevicesNested<A> editLastDevice() {
    int index = devices.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "devices"));
    }
    return this.setNewDeviceLike(index, this.buildDevice(index));
  }
  
  public DevicesNested<A> editMatchingDevice(Predicate<V1beta1AllocatedDeviceStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < devices.size();i++) {
      if (predicate.test(devices.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "devices"));
    }
    return this.setNewDeviceLike(index, this.buildDevice(index));
  }
  
  public A addToReservedFor(int index,V1beta1ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList();
    }
    V1beta1ResourceClaimConsumerReferenceBuilder builder = new V1beta1ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) {
        _visitables.get("reservedFor").add(builder);
        reservedFor.add(builder);
    } else {
        _visitables.get("reservedFor").add(builder);
        reservedFor.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToReservedFor(int index,V1beta1ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList();
    }
    V1beta1ResourceClaimConsumerReferenceBuilder builder = new V1beta1ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) {
        _visitables.get("reservedFor").add(builder);
        reservedFor.add(builder);
    } else {
        _visitables.get("reservedFor").add(builder);
        reservedFor.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToReservedFor(V1beta1ResourceClaimConsumerReference... items) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList();
    }
    for (V1beta1ResourceClaimConsumerReference item : items) {
        V1beta1ResourceClaimConsumerReferenceBuilder builder = new V1beta1ResourceClaimConsumerReferenceBuilder(item);
        _visitables.get("reservedFor").add(builder);
        this.reservedFor.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToReservedFor(Collection<V1beta1ResourceClaimConsumerReference> items) {
    if (this.reservedFor == null) {
      this.reservedFor = new ArrayList();
    }
    for (V1beta1ResourceClaimConsumerReference item : items) {
        V1beta1ResourceClaimConsumerReferenceBuilder builder = new V1beta1ResourceClaimConsumerReferenceBuilder(item);
        _visitables.get("reservedFor").add(builder);
        this.reservedFor.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromReservedFor(V1beta1ResourceClaimConsumerReference... items) {
    if (this.reservedFor == null) {
      return (A) this;
    }
    for (V1beta1ResourceClaimConsumerReference item : items) {
        V1beta1ResourceClaimConsumerReferenceBuilder builder = new V1beta1ResourceClaimConsumerReferenceBuilder(item);
        _visitables.get("reservedFor").remove(builder);
        this.reservedFor.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromReservedFor(Collection<V1beta1ResourceClaimConsumerReference> items) {
    if (this.reservedFor == null) {
      return (A) this;
    }
    for (V1beta1ResourceClaimConsumerReference item : items) {
        V1beta1ResourceClaimConsumerReferenceBuilder builder = new V1beta1ResourceClaimConsumerReferenceBuilder(item);
        _visitables.get("reservedFor").remove(builder);
        this.reservedFor.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromReservedFor(Predicate<V1beta1ResourceClaimConsumerReferenceBuilder> predicate) {
    if (reservedFor == null) {
      return (A) this;
    }
    Iterator<V1beta1ResourceClaimConsumerReferenceBuilder> each = reservedFor.iterator();
    List visitables = _visitables.get("reservedFor");
    while (each.hasNext()) {
        V1beta1ResourceClaimConsumerReferenceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<V1beta1ResourceClaimConsumerReference> buildReservedFor() {
    return this.reservedFor != null ? build(reservedFor) : null;
  }
  
  public V1beta1ResourceClaimConsumerReference buildReservedFor(int index) {
    return this.reservedFor.get(index).build();
  }
  
  public V1beta1ResourceClaimConsumerReference buildFirstReservedFor() {
    return this.reservedFor.get(0).build();
  }
  
  public V1beta1ResourceClaimConsumerReference buildLastReservedFor() {
    return this.reservedFor.get(reservedFor.size() - 1).build();
  }
  
  public V1beta1ResourceClaimConsumerReference buildMatchingReservedFor(Predicate<V1beta1ResourceClaimConsumerReferenceBuilder> predicate) {
      for (V1beta1ResourceClaimConsumerReferenceBuilder item : reservedFor) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingReservedFor(Predicate<V1beta1ResourceClaimConsumerReferenceBuilder> predicate) {
      for (V1beta1ResourceClaimConsumerReferenceBuilder item : reservedFor) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withReservedFor(List<V1beta1ResourceClaimConsumerReference> reservedFor) {
    if (this.reservedFor != null) {
      this._visitables.get("reservedFor").clear();
    }
    if (reservedFor != null) {
        this.reservedFor = new ArrayList();
        for (V1beta1ResourceClaimConsumerReference item : reservedFor) {
          this.addToReservedFor(item);
        }
    } else {
      this.reservedFor = null;
    }
    return (A) this;
  }
  
  public A withReservedFor(V1beta1ResourceClaimConsumerReference... reservedFor) {
    if (this.reservedFor != null) {
        this.reservedFor.clear();
        _visitables.remove("reservedFor");
    }
    if (reservedFor != null) {
      for (V1beta1ResourceClaimConsumerReference item : reservedFor) {
        this.addToReservedFor(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasReservedFor() {
    return this.reservedFor != null && !(this.reservedFor.isEmpty());
  }
  
  public ReservedForNested<A> addNewReservedFor() {
    return new ReservedForNested(-1, null);
  }
  
  public ReservedForNested<A> addNewReservedForLike(V1beta1ResourceClaimConsumerReference item) {
    return new ReservedForNested(-1, item);
  }
  
  public ReservedForNested<A> setNewReservedForLike(int index,V1beta1ResourceClaimConsumerReference item) {
    return new ReservedForNested(index, item);
  }
  
  public ReservedForNested<A> editReservedFor(int index) {
    if (index <= reservedFor.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "reservedFor"));
    }
    return this.setNewReservedForLike(index, this.buildReservedFor(index));
  }
  
  public ReservedForNested<A> editFirstReservedFor() {
    if (reservedFor.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "reservedFor"));
    }
    return this.setNewReservedForLike(0, this.buildReservedFor(0));
  }
  
  public ReservedForNested<A> editLastReservedFor() {
    int index = reservedFor.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "reservedFor"));
    }
    return this.setNewReservedForLike(index, this.buildReservedFor(index));
  }
  
  public ReservedForNested<A> editMatchingReservedFor(Predicate<V1beta1ResourceClaimConsumerReferenceBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < reservedFor.size();i++) {
      if (predicate.test(reservedFor.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "reservedFor"));
    }
    return this.setNewReservedForLike(index, this.buildReservedFor(index));
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
    V1beta1ResourceClaimStatusFluent that = (V1beta1ResourceClaimStatusFluent) o;
    if (!(Objects.equals(allocation, that.allocation))) {
      return false;
    }
    if (!(Objects.equals(devices, that.devices))) {
      return false;
    }
    if (!(Objects.equals(reservedFor, that.reservedFor))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(allocation, devices, reservedFor);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocation == null)) {
        sb.append("allocation:");
        sb.append(allocation);
        sb.append(",");
    }
    if (!(devices == null) && !(devices.isEmpty())) {
        sb.append("devices:");
        sb.append(devices);
        sb.append(",");
    }
    if (!(reservedFor == null) && !(reservedFor.isEmpty())) {
        sb.append("reservedFor:");
        sb.append(reservedFor);
    }
    sb.append("}");
    return sb.toString();
  }
  public class AllocationNested<N> extends V1beta1AllocationResultFluent<AllocationNested<N>> implements Nested<N>{
    AllocationNested(V1beta1AllocationResult item) {
      this.builder = new V1beta1AllocationResultBuilder(this, item);
    }
    V1beta1AllocationResultBuilder builder;
    
    public N and() {
      return (N) V1beta1ResourceClaimStatusFluent.this.withAllocation(builder.build());
    }
    
    public N endAllocation() {
      return and();
    }
    
  
  }
  public class DevicesNested<N> extends V1beta1AllocatedDeviceStatusFluent<DevicesNested<N>> implements Nested<N>{
    DevicesNested(int index,V1beta1AllocatedDeviceStatus item) {
      this.index = index;
      this.builder = new V1beta1AllocatedDeviceStatusBuilder(this, item);
    }
    V1beta1AllocatedDeviceStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1ResourceClaimStatusFluent.this.setToDevices(index, builder.build());
    }
    
    public N endDevice() {
      return and();
    }
    
  
  }
  public class ReservedForNested<N> extends V1beta1ResourceClaimConsumerReferenceFluent<ReservedForNested<N>> implements Nested<N>{
    ReservedForNested(int index,V1beta1ResourceClaimConsumerReference item) {
      this.index = index;
      this.builder = new V1beta1ResourceClaimConsumerReferenceBuilder(this, item);
    }
    V1beta1ResourceClaimConsumerReferenceBuilder builder;
    int index;
    
    public N and() {
      return (N) V1beta1ResourceClaimStatusFluent.this.setToReservedFor(index, builder.build());
    }
    
    public N endReservedFor() {
      return and();
    }
    
  
  }

}