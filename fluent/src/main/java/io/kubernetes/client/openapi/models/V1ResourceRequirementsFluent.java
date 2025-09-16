package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import io.kubernetes.client.custom.Quantity;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.RuntimeException;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.util.Map;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceRequirementsFluent<A extends io.kubernetes.client.openapi.models.V1ResourceRequirementsFluent<A>> extends BaseFluent<A>{
  public V1ResourceRequirementsFluent() {
  }
  
  public V1ResourceRequirementsFluent(V1ResourceRequirements instance) {
    this.copyInstance(instance);
  }
  private ArrayList<CoreV1ResourceClaimBuilder> claims;
  private Map<String,Quantity> limits;
  private Map<String,Quantity> requests;
  
  protected void copyInstance(V1ResourceRequirements instance) {
    instance = instance != null ? instance : new V1ResourceRequirements();
    if (instance != null) {
        this.withClaims(instance.getClaims());
        this.withLimits(instance.getLimits());
        this.withRequests(instance.getRequests());
    }
  }
  
  public A addToClaims(int index,CoreV1ResourceClaim item) {
    if (this.claims == null) {
      this.claims = new ArrayList();
    }
    CoreV1ResourceClaimBuilder builder = new CoreV1ResourceClaimBuilder(item);
    if (index < 0 || index >= claims.size()) {
        _visitables.get("claims").add(builder);
        claims.add(builder);
    } else {
        _visitables.get("claims").add(builder);
        claims.add(index, builder);
    }
    return (A) this;
  }
  
  public A setToClaims(int index,CoreV1ResourceClaim item) {
    if (this.claims == null) {
      this.claims = new ArrayList();
    }
    CoreV1ResourceClaimBuilder builder = new CoreV1ResourceClaimBuilder(item);
    if (index < 0 || index >= claims.size()) {
        _visitables.get("claims").add(builder);
        claims.add(builder);
    } else {
        _visitables.get("claims").add(builder);
        claims.set(index, builder);
    }
    return (A) this;
  }
  
  public A addToClaims(CoreV1ResourceClaim... items) {
    if (this.claims == null) {
      this.claims = new ArrayList();
    }
    for (CoreV1ResourceClaim item : items) {
        CoreV1ResourceClaimBuilder builder = new CoreV1ResourceClaimBuilder(item);
        _visitables.get("claims").add(builder);
        this.claims.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToClaims(Collection<CoreV1ResourceClaim> items) {
    if (this.claims == null) {
      this.claims = new ArrayList();
    }
    for (CoreV1ResourceClaim item : items) {
        CoreV1ResourceClaimBuilder builder = new CoreV1ResourceClaimBuilder(item);
        _visitables.get("claims").add(builder);
        this.claims.add(builder);
    }
    return (A) this;
  }
  
  public A removeFromClaims(CoreV1ResourceClaim... items) {
    if (this.claims == null) {
      return (A) this;
    }
    for (CoreV1ResourceClaim item : items) {
        CoreV1ResourceClaimBuilder builder = new CoreV1ResourceClaimBuilder(item);
        _visitables.get("claims").remove(builder);
        this.claims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromClaims(Collection<CoreV1ResourceClaim> items) {
    if (this.claims == null) {
      return (A) this;
    }
    for (CoreV1ResourceClaim item : items) {
        CoreV1ResourceClaimBuilder builder = new CoreV1ResourceClaimBuilder(item);
        _visitables.get("claims").remove(builder);
        this.claims.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromClaims(Predicate<CoreV1ResourceClaimBuilder> predicate) {
    if (claims == null) {
      return (A) this;
    }
    Iterator<CoreV1ResourceClaimBuilder> each = claims.iterator();
    List visitables = _visitables.get("claims");
    while (each.hasNext()) {
        CoreV1ResourceClaimBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public List<CoreV1ResourceClaim> buildClaims() {
    return this.claims != null ? build(claims) : null;
  }
  
  public CoreV1ResourceClaim buildClaim(int index) {
    return this.claims.get(index).build();
  }
  
  public CoreV1ResourceClaim buildFirstClaim() {
    return this.claims.get(0).build();
  }
  
  public CoreV1ResourceClaim buildLastClaim() {
    return this.claims.get(claims.size() - 1).build();
  }
  
  public CoreV1ResourceClaim buildMatchingClaim(Predicate<CoreV1ResourceClaimBuilder> predicate) {
      for (CoreV1ResourceClaimBuilder item : claims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingClaim(Predicate<CoreV1ResourceClaimBuilder> predicate) {
      for (CoreV1ResourceClaimBuilder item : claims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withClaims(List<CoreV1ResourceClaim> claims) {
    if (this.claims != null) {
      this._visitables.get("claims").clear();
    }
    if (claims != null) {
        this.claims = new ArrayList();
        for (CoreV1ResourceClaim item : claims) {
          this.addToClaims(item);
        }
    } else {
      this.claims = null;
    }
    return (A) this;
  }
  
  public A withClaims(CoreV1ResourceClaim... claims) {
    if (this.claims != null) {
        this.claims.clear();
        _visitables.remove("claims");
    }
    if (claims != null) {
      for (CoreV1ResourceClaim item : claims) {
        this.addToClaims(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasClaims() {
    return this.claims != null && !(this.claims.isEmpty());
  }
  
  public ClaimsNested<A> addNewClaim() {
    return new ClaimsNested(-1, null);
  }
  
  public ClaimsNested<A> addNewClaimLike(CoreV1ResourceClaim item) {
    return new ClaimsNested(-1, item);
  }
  
  public ClaimsNested<A> setNewClaimLike(int index,CoreV1ResourceClaim item) {
    return new ClaimsNested(index, item);
  }
  
  public ClaimsNested<A> editClaim(int index) {
    if (index <= claims.size()) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "claims"));
    }
    return this.setNewClaimLike(index, this.buildClaim(index));
  }
  
  public ClaimsNested<A> editFirstClaim() {
    if (claims.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "claims"));
    }
    return this.setNewClaimLike(0, this.buildClaim(0));
  }
  
  public ClaimsNested<A> editLastClaim() {
    int index = claims.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "claims"));
    }
    return this.setNewClaimLike(index, this.buildClaim(index));
  }
  
  public ClaimsNested<A> editMatchingClaim(Predicate<CoreV1ResourceClaimBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < claims.size();i++) {
      if (predicate.test(claims.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "claims"));
    }
    return this.setNewClaimLike(index, this.buildClaim(index));
  }
  
  public A addToLimits(String key,Quantity value) {
    if (this.limits == null && key != null && value != null) {
      this.limits = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.limits.put(key, value);
    }
    return (A) this;
  }
  
  public A addToLimits(Map<String,Quantity> map) {
    if (this.limits == null && map != null) {
      this.limits = new LinkedHashMap();
    }
    if (map != null) {
      this.limits.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromLimits(String key) {
    if (this.limits == null) {
      return (A) this;
    }
    if (key != null && this.limits != null) {
      this.limits.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromLimits(Map<String,Quantity> map) {
    if (this.limits == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.limits != null) {
          this.limits.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public Map<String,Quantity> getLimits() {
    return this.limits;
  }
  
  public <K,V>A withLimits(Map<String,Quantity> limits) {
    if (limits == null) {
      this.limits = null;
    } else {
      this.limits = new LinkedHashMap(limits);
    }
    return (A) this;
  }
  
  public boolean hasLimits() {
    return this.limits != null;
  }
  
  public A addToRequests(String key,Quantity value) {
    if (this.requests == null && key != null && value != null) {
      this.requests = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.requests.put(key, value);
    }
    return (A) this;
  }
  
  public A addToRequests(Map<String,Quantity> map) {
    if (this.requests == null && map != null) {
      this.requests = new LinkedHashMap();
    }
    if (map != null) {
      this.requests.putAll(map);
    }
    return (A) this;
  }
  
  public A removeFromRequests(String key) {
    if (this.requests == null) {
      return (A) this;
    }
    if (key != null && this.requests != null) {
      this.requests.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromRequests(Map<String,Quantity> map) {
    if (this.requests == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.requests != null) {
          this.requests.remove(key);
        }
      }
    }
    return (A) this;
  }
  
  public Map<String,Quantity> getRequests() {
    return this.requests;
  }
  
  public <K,V>A withRequests(Map<String,Quantity> requests) {
    if (requests == null) {
      this.requests = null;
    } else {
      this.requests = new LinkedHashMap(requests);
    }
    return (A) this;
  }
  
  public boolean hasRequests() {
    return this.requests != null;
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
    V1ResourceRequirementsFluent that = (V1ResourceRequirementsFluent) o;
    if (!(Objects.equals(claims, that.claims))) {
      return false;
    }
    if (!(Objects.equals(limits, that.limits))) {
      return false;
    }
    if (!(Objects.equals(requests, that.requests))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(claims, limits, requests);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(claims == null) && !(claims.isEmpty())) {
        sb.append("claims:");
        sb.append(claims);
        sb.append(",");
    }
    if (!(limits == null) && !(limits.isEmpty())) {
        sb.append("limits:");
        sb.append(limits);
        sb.append(",");
    }
    if (!(requests == null) && !(requests.isEmpty())) {
        sb.append("requests:");
        sb.append(requests);
    }
    sb.append("}");
    return sb.toString();
  }
  public class ClaimsNested<N> extends CoreV1ResourceClaimFluent<ClaimsNested<N>> implements Nested<N>{
    ClaimsNested(int index,CoreV1ResourceClaim item) {
      this.index = index;
      this.builder = new CoreV1ResourceClaimBuilder(this, item);
    }
    CoreV1ResourceClaimBuilder builder;
    int index;
    
    public N and() {
      return (N) V1ResourceRequirementsFluent.this.setToClaims(index, builder.build());
    }
    
    public N endClaim() {
      return and();
    }
    
  
  }

}