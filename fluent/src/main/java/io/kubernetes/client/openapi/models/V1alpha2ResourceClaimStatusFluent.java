package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2ResourceClaimStatusFluent<A extends V1alpha2ResourceClaimStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAllocation instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha2AllocationResult getAllocation();
  public V1alpha2AllocationResult buildAllocation();
  public A withAllocation(V1alpha2AllocationResult allocation);
  public Boolean hasAllocation();
  public V1alpha2ResourceClaimStatusFluent.AllocationNested<A> withNewAllocation();
  public V1alpha2ResourceClaimStatusFluent.AllocationNested<A> withNewAllocationLike(V1alpha2AllocationResult item);
  public V1alpha2ResourceClaimStatusFluent.AllocationNested<A> editAllocation();
  public V1alpha2ResourceClaimStatusFluent.AllocationNested<A> editOrNewAllocation();
  public V1alpha2ResourceClaimStatusFluent.AllocationNested<A> editOrNewAllocationLike(V1alpha2AllocationResult item);
  public Boolean getDeallocationRequested();
  public A withDeallocationRequested(Boolean deallocationRequested);
  public Boolean hasDeallocationRequested();
  public String getDriverName();
  public A withDriverName(String driverName);
  public Boolean hasDriverName();
  public A addToReservedFor(int index,V1alpha2ResourceClaimConsumerReference item);
  public A setToReservedFor(int index,V1alpha2ResourceClaimConsumerReference item);
  public A addToReservedFor(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference... items);
  public A addAllToReservedFor(Collection<V1alpha2ResourceClaimConsumerReference> items);
  public A removeFromReservedFor(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference... items);
  public A removeAllFromReservedFor(Collection<V1alpha2ResourceClaimConsumerReference> items);
  public A removeMatchingFromReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildReservedFor instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha2ResourceClaimConsumerReference> getReservedFor();
  public List<V1alpha2ResourceClaimConsumerReference> buildReservedFor();
  public V1alpha2ResourceClaimConsumerReference buildReservedFor(int index);
  public V1alpha2ResourceClaimConsumerReference buildFirstReservedFor();
  public V1alpha2ResourceClaimConsumerReference buildLastReservedFor();
  public V1alpha2ResourceClaimConsumerReference buildMatchingReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate);
  public Boolean hasMatchingReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate);
  public A withReservedFor(List<V1alpha2ResourceClaimConsumerReference> reservedFor);
  public A withReservedFor(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimConsumerReference... reservedFor);
  public Boolean hasReservedFor();
  public V1alpha2ResourceClaimStatusFluent.ReservedForNested<A> addNewReservedFor();
  public V1alpha2ResourceClaimStatusFluent.ReservedForNested<A> addNewReservedForLike(V1alpha2ResourceClaimConsumerReference item);
  public V1alpha2ResourceClaimStatusFluent.ReservedForNested<A> setNewReservedForLike(int index,V1alpha2ResourceClaimConsumerReference item);
  public V1alpha2ResourceClaimStatusFluent.ReservedForNested<A> editReservedFor(int index);
  public V1alpha2ResourceClaimStatusFluent.ReservedForNested<A> editFirstReservedFor();
  public V1alpha2ResourceClaimStatusFluent.ReservedForNested<A> editLastReservedFor();
  public V1alpha2ResourceClaimStatusFluent.ReservedForNested<A> editMatchingReservedFor(Predicate<V1alpha2ResourceClaimConsumerReferenceBuilder> predicate);
  public A withDeallocationRequested();
  public interface AllocationNested<N> extends Nested<N>,V1alpha2AllocationResultFluent<V1alpha2ResourceClaimStatusFluent.AllocationNested<N>>{
    public N and();
    public N endAllocation();
    
  }
  public interface ReservedForNested<N> extends Nested<N>,V1alpha2ResourceClaimConsumerReferenceFluent<V1alpha2ResourceClaimStatusFluent.ReservedForNested<N>>{
    public N and();
    public N endReservedFor();
    
  }
  
}