package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1TokenRequestSpecFluentImpl<A extends V1TokenRequestSpecFluent<A>> extends BaseFluent<A> implements V1TokenRequestSpecFluent<A>{
  public V1TokenRequestSpecFluentImpl() {
  }
  public V1TokenRequestSpecFluentImpl(V1TokenRequestSpec instance) {
    this.withAudiences(instance.getAudiences());

    this.withBoundObjectRef(instance.getBoundObjectRef());

    this.withExpirationSeconds(instance.getExpirationSeconds());

  }
  private List<String> audiences;
  private V1BoundObjectReferenceBuilder boundObjectRef;
  private Long expirationSeconds;
  public A addToAudiences(Integer index,String item) {
    if (this.audiences == null) {this.audiences = new ArrayList<String>();}
    this.audiences.add(index, item);
    return (A)this;
  }
  public A setToAudiences(Integer index,String item) {
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
    for (String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
  }
  public A removeAllFromAudiences(Collection<String> items) {
    for (String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
  }
  public List<String> getAudiences() {
    return this.audiences;
  }
  public String getAudience(Integer index) {
    return this.audiences.get(index);
  }
  public String getFirstAudience() {
    return this.audiences.get(0);
  }
  public String getLastAudience() {
    return this.audiences.get(audiences.size() - 1);
  }
  public String getMatchingAudience(Predicate<String> predicate) {
    for (String item: audiences) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAudience(Predicate<String> predicate) {
    for (String item: audiences) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAudiences(List<String> audiences) {
    if (audiences != null) {this.audiences = new ArrayList(); for (String item : audiences){this.addToAudiences(item);}} else { this.audiences = null;} return (A) this;
  }
  public A withAudiences(java.lang.String... audiences) {
    if (this.audiences != null) {this.audiences.clear();}
    if (audiences != null) {for (String item :audiences){ this.addToAudiences(item);}} return (A) this;
  }
  public Boolean hasAudiences() {
    return audiences != null && !audiences.isEmpty();
  }
  
  /**
   * This method has been deprecated, please use method buildBoundObjectRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1BoundObjectReference getBoundObjectRef() {
    return this.boundObjectRef!=null ?this.boundObjectRef.build():null;
  }
  public V1BoundObjectReference buildBoundObjectRef() {
    return this.boundObjectRef!=null ?this.boundObjectRef.build():null;
  }
  public A withBoundObjectRef(V1BoundObjectReference boundObjectRef) {
    _visitables.get("boundObjectRef").remove(this.boundObjectRef);
    if (boundObjectRef!=null){ this.boundObjectRef= new V1BoundObjectReferenceBuilder(boundObjectRef); _visitables.get("boundObjectRef").add(this.boundObjectRef);} else { this.boundObjectRef = null; _visitables.get("boundObjectRef").remove(this.boundObjectRef); } return (A) this;
  }
  public Boolean hasBoundObjectRef() {
    return this.boundObjectRef != null;
  }
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRef() {
    return new V1TokenRequestSpecFluentImpl.BoundObjectRefNestedImpl();
  }
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> withNewBoundObjectRefLike(V1BoundObjectReference item) {
    return new V1TokenRequestSpecFluentImpl.BoundObjectRefNestedImpl(item);
  }
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editBoundObjectRef() {
    return withNewBoundObjectRefLike(getBoundObjectRef());
  }
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRef() {
    return withNewBoundObjectRefLike(getBoundObjectRef() != null ? getBoundObjectRef(): new V1BoundObjectReferenceBuilder().build());
  }
  public V1TokenRequestSpecFluent.BoundObjectRefNested<A> editOrNewBoundObjectRefLike(V1BoundObjectReference item) {
    return withNewBoundObjectRefLike(getBoundObjectRef() != null ? getBoundObjectRef(): item);
  }
  public Long getExpirationSeconds() {
    return this.expirationSeconds;
  }
  public A withExpirationSeconds(Long expirationSeconds) {
    this.expirationSeconds=expirationSeconds; return (A) this;
  }
  public Boolean hasExpirationSeconds() {
    return this.expirationSeconds != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TokenRequestSpecFluentImpl that = (V1TokenRequestSpecFluentImpl) o;
    if (audiences != null ? !audiences.equals(that.audiences) :that.audiences != null) return false;
    if (boundObjectRef != null ? !boundObjectRef.equals(that.boundObjectRef) :that.boundObjectRef != null) return false;
    if (expirationSeconds != null ? !expirationSeconds.equals(that.expirationSeconds) :that.expirationSeconds != null) return false;
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
  class BoundObjectRefNestedImpl<N> extends V1BoundObjectReferenceFluentImpl<V1TokenRequestSpecFluent.BoundObjectRefNested<N>> implements V1TokenRequestSpecFluent.BoundObjectRefNested<N>,Nested<N>{
    BoundObjectRefNestedImpl(V1BoundObjectReference item) {
      this.builder = new V1BoundObjectReferenceBuilder(this, item);
    }
    BoundObjectRefNestedImpl() {
      this.builder = new V1BoundObjectReferenceBuilder(this);
    }
    V1BoundObjectReferenceBuilder builder;
    public N and() {
      return (N) V1TokenRequestSpecFluentImpl.this.withBoundObjectRef(builder.build());
    }
    public N endBoundObjectRef() {
      return and();
    }
    
  }
  
}