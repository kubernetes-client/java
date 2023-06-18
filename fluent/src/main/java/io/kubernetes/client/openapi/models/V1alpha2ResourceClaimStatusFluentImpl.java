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
  public class V1alpha2ResourceClaimStatusFluentImpl<A extends V1alpha2ResourceClaimStatusFluent<A>> extends BaseFluent<A> implements V1alpha2ResourceClaimStatusFluent<A>{
  public V1alpha2ResourceClaimStatusFluentImpl() {
  }
  public V1alpha2ResourceClaimStatusFluentImpl(V1alpha2ResourceClaimStatus instance) {
    if (instance != null) {
      this.withAllocation(instance.getAllocation());
      this.withDeallocationRequested(instance.getDeallocationRequested());
      this.withDriverName(instance.getDriverName());
      this.withReservedFor(instance.getReservedFor());
    }
  }
  private V1alpha2AllocationResultBuilder allocation;
  private Boolean deallocationRequested;
  private String driverName;
  private ArrayList<V1alpha2ResourceClaimConsumerReferenceBuilder> reservedFor;
  
  /**
   * This method has been deprecated, please use method buildAllocation instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2AllocationResult getAllocation() {
    return this.allocation!=null ?this.allocation.build():null;
  }
  public V1alpha2AllocationResult buildAllocation() {
    return this.allocation!=null ?this.allocation.build():null;
  }
  public A withAllocation(V1alpha2AllocationResult allocation) {
    _visitables.get("allocation").remove(this.allocation);
    if (allocation!=null){ this.allocation= new V1alpha2AllocationResultBuilder(allocation); _visitables.get("allocation").add(this.allocation);} else { this.allocation = null; _visitables.get("allocation").remove(this.allocation); } return (A) this;
  }
  public Boolean hasAllocation() {
    return this.allocation != null;
  }
  public V1alpha2ResourceClaimStatusFluentImpl.AllocationNested<A> withNewAllocation() {
    return new V1alpha2ResourceClaimStatusFluentImpl.AllocationNestedImpl();
  }
  public V1alpha2ResourceClaimStatusFluentImpl.AllocationNested<A> withNewAllocationLike(V1alpha2AllocationResult item) {
    return new V1alpha2ResourceClaimStatusFluentImpl.AllocationNestedImpl(item);
  }
  public V1alpha2ResourceClaimStatusFluentImpl.AllocationNested<A> editAllocation() {
    return withNewAllocationLike(getAllocation());
  }
  public V1alpha2ResourceClaimStatusFluentImpl.AllocationNested<A> editOrNewAllocation() {
    return withNewAllocationLike(getAllocation() != null ? getAllocation(): new V1alpha2AllocationResultBuilder().build());
  }
  public V1alpha2ResourceClaimStatusFluentImpl.AllocationNested<A> editOrNewAllocationLike(V1alpha2AllocationResult item) {
    return withNewAllocationLike(getAllocation() != null ? getAllocation(): item);
  }
  public Boolean getDeallocationRequested() {
    return this.deallocationRequested;
  }
  public A withDeallocationRequested(Boolean deallocationRequested) {
    this.deallocationRequested=deallocationRequested; return (A) this;
  }
  public Boolean hasDeallocationRequested() {
    return this.deallocationRequested != null;
  }
  public String getDriverName() {
    return this.driverName;
  }
  public A withDriverName(String driverName) {
    this.driverName=driverName; return (A) this;
  }
  public Boolean hasDriverName() {
    return this.driverName != null;
  }
  public A addToReservedFor(int index,V1alpha2ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha2ResourceClaimConsumerReferenceBuilder>();}
    V1alpha2ResourceClaimConsumerReferenceBuilder builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) { _visitables.get("reservedFor").add(builder); reservedFor.add(builder); } else { _visitables.get("reservedFor").add(index, builder); reservedFor.add(index, builder);}
    return (A)this;
  }
  public A setToReservedFor(int index,V1alpha2ResourceClaimConsumerReference item) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha2ResourceClaimConsumerReferenceBuilder>();}
    V1alpha2ResourceClaimConsumerReferenceBuilder builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(item);
    if (index < 0 || index >= reservedFor.size()) { _visitables.get("reservedFor").add(builder); reservedFor.add(builder); } else { _visitables.get("reservedFor").set(index, builder); reservedFor.set(index, builder);}
    return (A)this;
  }
  public A addToReservedFor(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference... items) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha2ResourceClaimConsumerReferenceBuilder>();}
    for (V1alpha2ResourceClaimConsumerReference item : items) {V1alpha2ResourceClaimConsumerReferenceBuilder builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").add(builder);this.reservedFor.add(builder);} return (A)this;
  }
  public A addAllToReservedFor(Collection<V1alpha2ResourceClaimConsumerReference> items) {
    if (this.reservedFor == null) {this.reservedFor = new ArrayList<V1alpha2ResourceClaimConsumerReferenceBuilder>();}
    for (V1alpha2ResourceClaimConsumerReference item : items) {V1alpha2ResourceClaimConsumerReferenceBuilder builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").add(builder);this.reservedFor.add(builder);} return (A)this;
  }
  public A removeFromReservedFor(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference... items) {
    for (V1alpha2ResourceClaimConsumerReference item : items) {V1alpha2ResourceClaimConsumerReferenceBuilder builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").remove(builder);if (this.reservedFor != null) {this.reservedFor.remove(builder);}} return (A)this;
  }
  public A removeAllFromReservedFor(Collection<V1alpha2ResourceClaimConsumerReference> items) {
    for (V1alpha2ResourceClaimConsumerReference item : items) {V1alpha2ResourceClaimConsumerReferenceBuilder builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(item);_visitables.get("reservedFor").remove(builder);if (this.reservedFor != null) {this.reservedFor.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate) {
    if (reservedFor == null) return (A) this;
    final Iterator<V1alpha2ResourceClaimConsumerReferenceBuilder> each = reservedFor.iterator();
    final List visitables = _visitables.get("reservedFor");
    while (each.hasNext()) {
      V1alpha2ResourceClaimConsumerReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildReservedFor instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha2ResourceClaimConsumerReference> getReservedFor() {
    return reservedFor != null ? build(reservedFor) : null;
  }
  public List<V1alpha2ResourceClaimConsumerReference> buildReservedFor() {
    return reservedFor != null ? build(reservedFor) : null;
  }
  public V1alpha2ResourceClaimConsumerReference buildReservedFor(int index) {
    return this.reservedFor.get(index).build();
  }
  public V1alpha2ResourceClaimConsumerReference buildFirstReservedFor() {
    return this.reservedFor.get(0).build();
  }
  public V1alpha2ResourceClaimConsumerReference buildLastReservedFor() {
    return this.reservedFor.get(reservedFor.size() - 1).build();
  }
  public V1alpha2ResourceClaimConsumerReference buildMatchingReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate) {
    for (V1alpha2ResourceClaimConsumerReferenceBuilder item: reservedFor) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate) {
    for (V1alpha2ResourceClaimConsumerReferenceBuilder item: reservedFor) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withReservedFor(List<V1alpha2ResourceClaimConsumerReference> reservedFor) {
    if (this.reservedFor != null) { _visitables.get("reservedFor").clear();}
    if (reservedFor != null) {this.reservedFor = new ArrayList(); for (V1alpha2ResourceClaimConsumerReference item : reservedFor){this.addToReservedFor(item);}} else { this.reservedFor = null;} return (A) this;
  }
  public A withReservedFor(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference... reservedFor) {
    if (this.reservedFor != null) {this.reservedFor.clear(); _visitables.remove("reservedFor"); }
    if (reservedFor != null) {for (V1alpha2ResourceClaimConsumerReference item :reservedFor){ this.addToReservedFor(item);}} return (A) this;
  }
  public Boolean hasReservedFor() {
    return reservedFor != null && !reservedFor.isEmpty();
  }
  public V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<A> addNewReservedFor() {
    return new V1alpha2ResourceClaimStatusFluentImpl.ReservedForNestedImpl();
  }
  public V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<A> addNewReservedForLike(V1alpha2ResourceClaimConsumerReference item) {
    return new V1alpha2ResourceClaimStatusFluentImpl.ReservedForNestedImpl(-1, item);
  }
  public V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<A> setNewReservedForLike(int index,V1alpha2ResourceClaimConsumerReference item) {
    return new V1alpha2ResourceClaimStatusFluentImpl.ReservedForNestedImpl(index, item);
  }
  public V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<A> editReservedFor(int index) {
    if (reservedFor.size() <= index) throw new RuntimeException("Can't edit reservedFor. Index exceeds size.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  public V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<A> editFirstReservedFor() {
    if (reservedFor.size() == 0) throw new RuntimeException("Can't edit first reservedFor. The list is empty.");
    return setNewReservedForLike(0, buildReservedFor(0));
  }
  public V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<A> editLastReservedFor() {
    int index = reservedFor.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last reservedFor. The list is empty.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  public V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<A> editMatchingReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<reservedFor.size();i++) { 
    if (predicate.test(reservedFor.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching reservedFor. No match found.");
    return setNewReservedForLike(index, buildReservedFor(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2ResourceClaimStatusFluentImpl that = (V1alpha2ResourceClaimStatusFluentImpl) o;
    if (!java.util.Objects.equals(allocation, that.allocation)) return false;

    if (!java.util.Objects.equals(deallocationRequested, that.deallocationRequested)) return false;

    if (!java.util.Objects.equals(driverName, that.driverName)) return false;

    if (!java.util.Objects.equals(reservedFor, that.reservedFor)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(allocation,  deallocationRequested,  driverName,  reservedFor,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (allocation != null) { sb.append("allocation:"); sb.append(allocation + ","); }
    if (deallocationRequested != null) { sb.append("deallocationRequested:"); sb.append(deallocationRequested + ","); }
    if (driverName != null) { sb.append("driverName:"); sb.append(driverName + ","); }
    if (reservedFor != null) { sb.append("reservedFor:"); sb.append(reservedFor); }
    sb.append("}");
    return sb.toString();
  }
  public A withDeallocationRequested() {
    return withDeallocationRequested(true);
  }
  class AllocationNestedImpl<N> extends V1alpha2AllocationResultFluentImpl<V1alpha2ResourceClaimStatusFluentImpl.AllocationNested<N>> implements V1alpha2ResourceClaimStatusFluentImpl.AllocationNested<N>,Nested<N>{
    AllocationNestedImpl(V1alpha2AllocationResult item) {
      this.builder = new V1alpha2AllocationResultBuilder(this, item);
    }
    AllocationNestedImpl() {
      this.builder = new V1alpha2AllocationResultBuilder(this);
    }
    V1alpha2AllocationResultBuilder builder;
    public N and() {
      return (N) V1alpha2ResourceClaimStatusFluentImpl.this.withAllocation(builder.build());
    }
    public N endAllocation() {
      return and();
    }
    
  }
  class ReservedForNestedImpl<N> extends V1alpha2ResourceClaimConsumerReferenceFluentImpl<V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<N>> implements V1alpha2ResourceClaimStatusFluentImpl.ReservedForNested<N>,Nested<N>{
    ReservedForNestedImpl(int index,V1alpha2ResourceClaimConsumerReference item) {
      this.index = index;
      this.builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(this, item);
    }
    ReservedForNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha2ResourceClaimConsumerReferenceBuilder(this);
    }
    V1alpha2ResourceClaimConsumerReferenceBuilder builder;
    int index;
    public N and() {
      return (N) V1alpha2ResourceClaimStatusFluentImpl.this.setToReservedFor(index,builder.build());
    }
    public N endReservedFor() {
      return and();
    }
    
  }
  
}