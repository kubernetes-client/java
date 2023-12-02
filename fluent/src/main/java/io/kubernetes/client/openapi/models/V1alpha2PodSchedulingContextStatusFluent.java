package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2PodSchedulingContextStatusFluent<A extends V1alpha2PodSchedulingContextStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha2PodSchedulingContextStatusFluent() {
  }
  
  public V1alpha2PodSchedulingContextStatusFluent(V1alpha2PodSchedulingContextStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1alpha2ResourceClaimSchedulingStatusBuilder> resourceClaims;
  
  protected void copyInstance(V1alpha2PodSchedulingContextStatus instance) {
    instance = (instance != null ? instance : new V1alpha2PodSchedulingContextStatus());
    if (instance != null) {
          this.withResourceClaims(instance.getResourceClaims());
        }
  }
  
  public A addToResourceClaims(int index,V1alpha2ResourceClaimSchedulingStatus item) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1alpha2ResourceClaimSchedulingStatusBuilder>();}
    V1alpha2ResourceClaimSchedulingStatusBuilder builder = new V1alpha2ResourceClaimSchedulingStatusBuilder(item);
    if (index < 0 || index >= resourceClaims.size()) { _visitables.get("resourceClaims").add(builder); resourceClaims.add(builder); } else { _visitables.get("resourceClaims").add(index, builder); resourceClaims.add(index, builder);}
    return (A)this;
  }
  
  public A setToResourceClaims(int index,V1alpha2ResourceClaimSchedulingStatus item) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1alpha2ResourceClaimSchedulingStatusBuilder>();}
    V1alpha2ResourceClaimSchedulingStatusBuilder builder = new V1alpha2ResourceClaimSchedulingStatusBuilder(item);
    if (index < 0 || index >= resourceClaims.size()) { _visitables.get("resourceClaims").add(builder); resourceClaims.add(builder); } else { _visitables.get("resourceClaims").set(index, builder); resourceClaims.set(index, builder);}
    return (A)this;
  }
  
  public A addToResourceClaims(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus... items) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1alpha2ResourceClaimSchedulingStatusBuilder>();}
    for (V1alpha2ResourceClaimSchedulingStatus item : items) {V1alpha2ResourceClaimSchedulingStatusBuilder builder = new V1alpha2ResourceClaimSchedulingStatusBuilder(item);_visitables.get("resourceClaims").add(builder);this.resourceClaims.add(builder);} return (A)this;
  }
  
  public A addAllToResourceClaims(Collection<V1alpha2ResourceClaimSchedulingStatus> items) {
    if (this.resourceClaims == null) {this.resourceClaims = new ArrayList<V1alpha2ResourceClaimSchedulingStatusBuilder>();}
    for (V1alpha2ResourceClaimSchedulingStatus item : items) {V1alpha2ResourceClaimSchedulingStatusBuilder builder = new V1alpha2ResourceClaimSchedulingStatusBuilder(item);_visitables.get("resourceClaims").add(builder);this.resourceClaims.add(builder);} return (A)this;
  }
  
  public A removeFromResourceClaims(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus... items) {
    if (this.resourceClaims == null) return (A)this;
    for (V1alpha2ResourceClaimSchedulingStatus item : items) {V1alpha2ResourceClaimSchedulingStatusBuilder builder = new V1alpha2ResourceClaimSchedulingStatusBuilder(item);_visitables.get("resourceClaims").remove(builder); this.resourceClaims.remove(builder);} return (A)this;
  }
  
  public A removeAllFromResourceClaims(Collection<V1alpha2ResourceClaimSchedulingStatus> items) {
    if (this.resourceClaims == null) return (A)this;
    for (V1alpha2ResourceClaimSchedulingStatus item : items) {V1alpha2ResourceClaimSchedulingStatusBuilder builder = new V1alpha2ResourceClaimSchedulingStatusBuilder(item);_visitables.get("resourceClaims").remove(builder); this.resourceClaims.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromResourceClaims(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate) {
    if (resourceClaims == null) return (A) this;
    final Iterator<V1alpha2ResourceClaimSchedulingStatusBuilder> each = resourceClaims.iterator();
    final List visitables = _visitables.get("resourceClaims");
    while (each.hasNext()) {
      V1alpha2ResourceClaimSchedulingStatusBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha2ResourceClaimSchedulingStatus> buildResourceClaims() {
    return this.resourceClaims != null ? build(resourceClaims) : null;
  }
  
  public V1alpha2ResourceClaimSchedulingStatus buildResourceClaim(int index) {
    return this.resourceClaims.get(index).build();
  }
  
  public V1alpha2ResourceClaimSchedulingStatus buildFirstResourceClaim() {
    return this.resourceClaims.get(0).build();
  }
  
  public V1alpha2ResourceClaimSchedulingStatus buildLastResourceClaim() {
    return this.resourceClaims.get(resourceClaims.size() - 1).build();
  }
  
  public V1alpha2ResourceClaimSchedulingStatus buildMatchingResourceClaim(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate) {
      for (V1alpha2ResourceClaimSchedulingStatusBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingResourceClaim(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate) {
      for (V1alpha2ResourceClaimSchedulingStatusBuilder item : resourceClaims) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withResourceClaims(List<V1alpha2ResourceClaimSchedulingStatus> resourceClaims) {
    if (this.resourceClaims != null) {
      this._visitables.get("resourceClaims").clear();
    }
    if (resourceClaims != null) {
        this.resourceClaims = new ArrayList();
        for (V1alpha2ResourceClaimSchedulingStatus item : resourceClaims) {
          this.addToResourceClaims(item);
        }
    } else {
      this.resourceClaims = null;
    }
    return (A) this;
  }
  
  public A withResourceClaims(io.kubernetes.client.openapi.models.V1alpha2ResourceClaimSchedulingStatus... resourceClaims) {
    if (this.resourceClaims != null) {
        this.resourceClaims.clear();
        _visitables.remove("resourceClaims");
    }
    if (resourceClaims != null) {
      for (V1alpha2ResourceClaimSchedulingStatus item : resourceClaims) {
        this.addToResourceClaims(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasResourceClaims() {
    return this.resourceClaims != null && !this.resourceClaims.isEmpty();
  }
  
  public ResourceClaimsNested<A> addNewResourceClaim() {
    return new ResourceClaimsNested(-1, null);
  }
  
  public ResourceClaimsNested<A> addNewResourceClaimLike(V1alpha2ResourceClaimSchedulingStatus item) {
    return new ResourceClaimsNested(-1, item);
  }
  
  public ResourceClaimsNested<A> setNewResourceClaimLike(int index,V1alpha2ResourceClaimSchedulingStatus item) {
    return new ResourceClaimsNested(index, item);
  }
  
  public ResourceClaimsNested<A> editResourceClaim(int index) {
    if (resourceClaims.size() <= index) throw new RuntimeException("Can't edit resourceClaims. Index exceeds size.");
    return setNewResourceClaimLike(index, buildResourceClaim(index));
  }
  
  public ResourceClaimsNested<A> editFirstResourceClaim() {
    if (resourceClaims.size() == 0) throw new RuntimeException("Can't edit first resourceClaims. The list is empty.");
    return setNewResourceClaimLike(0, buildResourceClaim(0));
  }
  
  public ResourceClaimsNested<A> editLastResourceClaim() {
    int index = resourceClaims.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last resourceClaims. The list is empty.");
    return setNewResourceClaimLike(index, buildResourceClaim(index));
  }
  
  public ResourceClaimsNested<A> editMatchingResourceClaim(Predicate<V1alpha2ResourceClaimSchedulingStatusBuilder> predicate) {
    int index = -1;
    for (int i=0;i<resourceClaims.size();i++) { 
    if (predicate.test(resourceClaims.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching resourceClaims. No match found.");
    return setNewResourceClaimLike(index, buildResourceClaim(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2PodSchedulingContextStatusFluent that = (V1alpha2PodSchedulingContextStatusFluent) o;
    if (!java.util.Objects.equals(resourceClaims, that.resourceClaims)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(resourceClaims,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (resourceClaims != null && !resourceClaims.isEmpty()) { sb.append("resourceClaims:"); sb.append(resourceClaims); }
    sb.append("}");
    return sb.toString();
  }
  public class ResourceClaimsNested<N> extends V1alpha2ResourceClaimSchedulingStatusFluent<ResourceClaimsNested<N>> implements Nested<N>{
    ResourceClaimsNested(int index,V1alpha2ResourceClaimSchedulingStatus item) {
      this.index = index;
      this.builder = new V1alpha2ResourceClaimSchedulingStatusBuilder(this, item);
    }
    V1alpha2ResourceClaimSchedulingStatusBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha2PodSchedulingContextStatusFluent.this.setToResourceClaims(index,builder.build());
    }
    
    public N endResourceClaim() {
      return and();
    }
    
  
  }

}