package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

 /**
  * Generated
  */
public interface V1ResourceRequirementsFluent<A extends V1ResourceRequirementsFluent<A>> extends Fluent<A>{
  public A addToClaims(int index,V1ResourceClaim item);
  public A setToClaims(int index,V1ResourceClaim item);
  public A addToClaims(io.kubernetes.client.openapi.models.V1ResourceClaim... items);
  public A addAllToClaims(Collection<V1ResourceClaim> items);
  public A removeFromClaims(io.kubernetes.client.openapi.models.V1ResourceClaim... items);
  public A removeAllFromClaims(Collection<V1ResourceClaim> items);
  public A removeMatchingFromClaims(Predicate<V1ResourceClaimBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildClaims instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ResourceClaim> getClaims();
  public List<V1ResourceClaim> buildClaims();
  public V1ResourceClaim buildClaim(int index);
  public V1ResourceClaim buildFirstClaim();
  public V1ResourceClaim buildLastClaim();
  public V1ResourceClaim buildMatchingClaim(Predicate<V1ResourceClaimBuilder> predicate);
  public Boolean hasMatchingClaim(Predicate<V1ResourceClaimBuilder> predicate);
  public A withClaims(List<V1ResourceClaim> claims);
  public A withClaims(io.kubernetes.client.openapi.models.V1ResourceClaim... claims);
  public Boolean hasClaims();
  public V1ResourceRequirementsFluent.ClaimsNested<A> addNewClaim();
  public V1ResourceRequirementsFluent.ClaimsNested<A> addNewClaimLike(V1ResourceClaim item);
  public V1ResourceRequirementsFluent.ClaimsNested<A> setNewClaimLike(int index,V1ResourceClaim item);
  public V1ResourceRequirementsFluent.ClaimsNested<A> editClaim(int index);
  public V1ResourceRequirementsFluent.ClaimsNested<A> editFirstClaim();
  public V1ResourceRequirementsFluent.ClaimsNested<A> editLastClaim();
  public V1ResourceRequirementsFluent.ClaimsNested<A> editMatchingClaim(Predicate<V1ResourceClaimBuilder> predicate);
  public A addToLimits(String key,Quantity value);
  public A addToLimits(Map<String,Quantity> map);
  public A removeFromLimits(String key);
  public A removeFromLimits(Map<String,Quantity> map);
  public Map<String,Quantity> getLimits();
  public <K,V>A withLimits(Map<String,Quantity> limits);
  public Boolean hasLimits();
  public A addToRequests(String key,Quantity value);
  public A addToRequests(Map<String,Quantity> map);
  public A removeFromRequests(String key);
  public A removeFromRequests(Map<String,Quantity> map);
  public Map<String,Quantity> getRequests();
  public <K,V>A withRequests(Map<String,Quantity> requests);
  public Boolean hasRequests();
  public interface ClaimsNested<N> extends Nested<N>,V1ResourceClaimFluent<V1ResourceRequirementsFluent.ClaimsNested<N>>{
    public N and();
    public N endClaim();
    
  }
  
}