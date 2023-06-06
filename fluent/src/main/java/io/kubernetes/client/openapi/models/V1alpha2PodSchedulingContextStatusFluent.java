package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha2PodSchedulingContextStatusFluent<A extends V1alpha2PodSchedulingContextStatusFluent<A>> extends Fluent<A>{
  public A addToResourceClaims(int index,V1alpha2ResourceClaimSchedulingStatus item);
  public A setToResourceClaims(int index,V1alpha2ResourceClaimSchedulingStatus item);
  public A addToResourceClaims(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus... items);
  public A addAllToResourceClaims(Collection<V1alpha2ResourceClaimSchedulingStatus> items);
  public A removeFromResourceClaims(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus... items);
  public A removeAllFromResourceClaims(Collection<V1alpha2ResourceClaimSchedulingStatus> items);
  public A removeMatchingFromResourceClaims(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildResourceClaims instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha2ResourceClaimSchedulingStatus> getResourceClaims();
  public List<V1alpha2ResourceClaimSchedulingStatus> buildResourceClaims();
  public V1alpha2ResourceClaimSchedulingStatus buildResourceClaim(int index);
  public V1alpha2ResourceClaimSchedulingStatus buildFirstResourceClaim();
  public V1alpha2ResourceClaimSchedulingStatus buildLastResourceClaim();
  public V1alpha2ResourceClaimSchedulingStatus buildMatchingResourceClaim(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate);
  public Boolean hasMatchingResourceClaim(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate);
  public A withResourceClaims(List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims);
  public A withResourceClaims(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus... resourceClaims);
  public Boolean hasResourceClaims();
  public V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<A> addNewResourceClaim();
  public V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<A> addNewResourceClaimLike(V1alpha2ResourceClaimSchedulingStatus item);
  public V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<A> setNewResourceClaimLike(int index,V1alpha2ResourceClaimSchedulingStatus item);
  public V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<A> editResourceClaim(int index);
  public V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<A> editFirstResourceClaim();
  public V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<A> editLastResourceClaim();
  public V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<A> editMatchingResourceClaim(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate);
  public interface ResourceClaimsNested<N> extends Nested<N>,V1alpha2ResourceClaimSchedulingStatusFluent<V1alpha2PodSchedulingContextStatusFluent.ResourceClaimsNested<N>>{
    public N and();
    public N endResourceClaim();
    
  }
  
}