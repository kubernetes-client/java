package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TokenRequestSpecFluent<A extends io.kubernetes.client.openapi.models.V1TokenRequestSpecFluent<A>> extends BaseFluent<A>{

  private List<String> audiences;
  private V1BoundObjectReferenceBuilder boundObjectRef;
  private Long expirationSeconds;

  public V1TokenRequestSpecFluent() {
  }
  
  public V1TokenRequestSpecFluent(V1TokenRequestSpec instance) {
    this.copyInstance(instance);
  }

  public A addAllToAudiences(Collection<String> items) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    for (String item : items) {
      this.audiences.add(item);
    }
    return (A) this;
  }
  
  public A addToAudiences(String... items) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    for (String item : items) {
      this.audiences.add(item);
    }
    return (A) this;
  }
  
  public A addToAudiences(int index,String item) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    this.audiences.add(index, item);
    return (A) this;
  }
  
  public V1BoundObjectReference buildBoundObjectRef() {
    return this.boundObjectRef != null ? this.boundObjectRef.build() : null;
  }
  
  protected void copyInstance(V1TokenRequestSpec instance) {
    instance = instance != null ? instance : new V1TokenRequestSpec();
    if (instance != null) {
        this.withAudiences(instance.getAudiences());
        this.withBoundObjectRef(instance.getBoundObjectRef());
        this.withExpirationSeconds(instance.getExpirationSeconds());
    }
  }
  
  public BoundObjectRefNested<A> editBoundObjectRef() {
    return this.withNewBoundObjectRefLike(Optional.ofNullable(this.buildBoundObjectRef()).orElse(null));
  }
  
  public BoundObjectRefNested<A> editOrNewBoundObjectRef() {
    return this.withNewBoundObjectRefLike(Optional.ofNullable(this.buildBoundObjectRef()).orElse(new V1BoundObjectReferenceBuilder().build()));
  }
  
  public BoundObjectRefNested<A> editOrNewBoundObjectRefLike(V1BoundObjectReference item) {
    return this.withNewBoundObjectRefLike(Optional.ofNullable(this.buildBoundObjectRef()).orElse(item));
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
    V1TokenRequestSpecFluent that = (V1TokenRequestSpecFluent) o;
    if (!(Objects.equals(audiences, that.audiences))) {
      return false;
    }
    if (!(Objects.equals(boundObjectRef, that.boundObjectRef))) {
      return false;
    }
    if (!(Objects.equals(expirationSeconds, that.expirationSeconds))) {
      return false;
    }
    return true;
  }
  
  public String getAudience(int index) {
    return this.audiences.get(index);
  }
  
  public List<String> getAudiences() {
    return this.audiences;
  }
  
  public Long getExpirationSeconds() {
    return this.expirationSeconds;
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
  
  public boolean hasAudiences() {
    return this.audiences != null && !(this.audiences.isEmpty());
  }
  
  public boolean hasBoundObjectRef() {
    return this.boundObjectRef != null;
  }
  
  public boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  
  public boolean hasMatchingAudience(Predicate<String> predicate) {
      for (String item : audiences) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(audiences, boundObjectRef, expirationSeconds);
  }
  
  public A removeAllFromAudiences(Collection<String> items) {
    if (this.audiences == null) {
      return (A) this;
    }
    for (String item : items) {
      this.audiences.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromAudiences(String... items) {
    if (this.audiences == null) {
      return (A) this;
    }
    for (String item : items) {
      this.audiences.remove(item);
    }
    return (A) this;
  }
  
  public A setToAudiences(int index,String item) {
    if (this.audiences == null) {
      this.audiences = new ArrayList();
    }
    this.audiences.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(audiences == null) && !(audiences.isEmpty())) {
        sb.append("audiences:");
        sb.append(audiences);
        sb.append(",");
    }
    if (!(boundObjectRef == null)) {
        sb.append("boundObjectRef:");
        sb.append(boundObjectRef);
        sb.append(",");
    }
    if (!(expirationSeconds == null)) {
        sb.append("expirationSeconds:");
        sb.append(expirationSeconds);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withAudiences(String... audiences) {
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
  
  public A withExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
    return (A) this;
  }
  
  public BoundObjectRefNested<A> withNewBoundObjectRef() {
    return new BoundObjectRefNested(null);
  }
  
  public BoundObjectRefNested<A> withNewBoundObjectRefLike(V1BoundObjectReference item) {
    return new BoundObjectRefNested(item);
  }
  public class BoundObjectRefNested<N> extends V1BoundObjectReferenceFluent<BoundObjectRefNested<N>> implements Nested<N>{
  
    V1BoundObjectReferenceBuilder builder;
  
    BoundObjectRefNested(V1BoundObjectReference item) {
      this.builder = new V1BoundObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1TokenRequestSpecFluent.this.withBoundObjectRef(builder.build());
    }
    
    public N endBoundObjectRef() {
      return and();
    }
    
  }
}