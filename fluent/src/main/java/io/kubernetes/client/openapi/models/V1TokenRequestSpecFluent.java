package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TokenRequestSpecFluent<A extends V1TokenRequestSpecFluent<A>> extends BaseFluent<A>{
  public V1TokenRequestSpecFluent() {
  }
  
  public V1TokenRequestSpecFluent(V1TokenRequestSpec instance) {
    this.copyInstance(instance);
  }
  private List<String> audiences;
  private V1BoundObjectReferenceBuilder boundObjectRef;
  private Long expirationSeconds;
  
  protected void copyInstance(V1TokenRequestSpec instance) {
    instance = (instance != null ? instance : new V1TokenRequestSpec());
    if (instance != null) {
          this.withAudiences(instance.getAudiences());
          this.withBoundObjectRef(instance.getBoundObjectRef());
          this.withExpirationSeconds(instance.getExpirationSeconds());
        }
  }
  
  public A addToAudiences(int index,String item) {
    if (this.audiences == null) {this.audiences = new ArrayList<String>();}
    this.audiences.add(index, item);
    return (A)this;
  }
  
  public A setToAudiences(int index,String item) {
    if (this.audiences == null) {this.audiences = new ArrayList<String>();}
    this.audiences.set(index, item); return (A)this;
  }
  
  public A addToAudiences(java.lang.String... items) {
    if (this.audiences == null) {this.audiences = new ArrayList<String>();}
    for (String item : items) {this.audiences.add(item);} return (A)this;
  }
  
  public A addAllToAudiences(Collection<String> items) {
    if (this.audiences == null) {this.audiences = new ArrayList<String>();}
    for (String item : items) {this.audiences.add(item);} return (A)this;
  }
  
  public A removeFromAudiences(java.lang.String... items) {
    if (this.audiences == null) return (A)this;
    for (String item : items) { this.audiences.remove(item);} return (A)this;
  }
  
  public A removeAllFromAudiences(Collection<String> items) {
    if (this.audiences == null) return (A)this;
    for (String item : items) { this.audiences.remove(item);} return (A)this;
  }
  
  public List<String> getAudiences() {
    return this.audiences;
  }
  
  public String getAudience(int index) {
    return this.audiences.get(index);
  }
  
  public String getFirstAudience() {
    return this.audiences.get(0);
  }
  
  public String getLastAudience() {
    return this.audiences.get(audiences.size() - 1);
  }
  
  public String getMatchingAudience(Predicate<String> predicate) {
      for (String item : audiences) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAudience(Predicate<String> predicate) {
      for (String item : audiences) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAudiences(List<String> audiences) {
    if (audiences != null) {
        this.audiences = new ArrayList();
        for (String item : audiences) {
          this.addToAudiences(item);
        }
    } else {
      this.audiences = null;
    }
    return (A) this;
  }
  
  public A withAudiences(java.lang.String... audiences) {
    if (this.audiences != null) {
        this.audiences.clear();
        _visitables.remove("audiences");
    }
    if (audiences != null) {
      for (String item : audiences) {
        this.addToAudiences(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAudiences() {
    return this.audiences != null && !this.audiences.isEmpty();
  }
  
  public V1BoundObjectReference buildBoundObjectRef() {
    return this.boundObjectRef != null ? this.boundObjectRef.build() : null;
  }
  
  public A withBoundObjectRef(V1BoundObjectReference boundObjectRef) {
    this._visitables.remove("boundObjectRef");
    if (boundObjectRef != null) {
        this.boundObjectRef = new V1BoundObjectReferenceBuilder(boundObjectRef);
        this._visitables.get("boundObjectRef").add(this.boundObjectRef);
    } else {
        this.boundObjectRef = null;
        this._visitables.get("boundObjectRef").remove(this.boundObjectRef);
    }
    return (A) this;
  }
  
  public boolean hasBoundObjectRef() {
    return this.boundObjectRef != null;
  }
  
  public BoundObjectRefNested<A> withNewBoundObjectRef() {
    return new BoundObjectRefNested(null);
  }
  
  public BoundObjectRefNested<A> withNewBoundObjectRefLike(V1BoundObjectReference item) {
    return new BoundObjectRefNested(item);
  }
  
  public BoundObjectRefNested<A> editBoundObjectRef() {
    return withNewBoundObjectRefLike(java.util.Optional.ofNullable(buildBoundObjectRef()).orElse(null));
  }
  
  public BoundObjectRefNested<A> editOrNewBoundObjectRef() {
    return withNewBoundObjectRefLike(java.util.Optional.ofNullable(buildBoundObjectRef()).orElse(new V1BoundObjectReferenceBuilder().build()));
  }
  
  public BoundObjectRefNested<A> editOrNewBoundObjectRefLike(V1BoundObjectReference item) {
    return withNewBoundObjectRefLike(java.util.Optional.ofNullable(buildBoundObjectRef()).orElse(item));
  }
  
  public Long getExpirationSeconds() {
    return this.expirationSeconds;
  }
  
  public A withExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TokenRequestSpecFluent that = (V1TokenRequestSpecFluent) o;
    if (!java.util.Objects.equals(audiences, that.audiences)) return false;
    if (!java.util.Objects.equals(boundObjectRef, that.boundObjectRef)) return false;
    if (!java.util.Objects.equals(expirationSeconds, that.expirationSeconds)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(audiences,  boundObjectRef,  expirationSeconds,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audiences != null && !audiences.isEmpty()) { sb.append("audiences:"); sb.append(audiences + ","); }
    if (boundObjectRef != null) { sb.append("boundObjectRef:"); sb.append(boundObjectRef + ","); }
    if (expirationSeconds != null) { sb.append("expirationSeconds:"); sb.append(expirationSeconds); }
    sb.append("}");
    return sb.toString();
  }
  public class BoundObjectRefNested<N> extends V1BoundObjectReferenceFluent<BoundObjectRefNested<N>> implements Nested<N>{
    BoundObjectRefNested(V1BoundObjectReference item) {
      this.builder = new V1BoundObjectReferenceBuilder(this, item);
    }
    V1BoundObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1TokenRequestSpecFluent.this.withBoundObjectRef(builder.build());
    }
    
    public N endBoundObjectRef() {
      return and();
    }
    
  
  }

}