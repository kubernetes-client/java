package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1TokenReviewSpecFluentImpl<A extends V1TokenReviewSpecFluent<A>> extends BaseFluent<A> implements V1TokenReviewSpecFluent<A>{
  public V1TokenReviewSpecFluentImpl() {
  }
  public V1TokenReviewSpecFluentImpl(V1TokenReviewSpec instance) {
    this.withAudiences(instance.getAudiences());

    this.withToken(instance.getToken());

  }
  private List<String> audiences;
  private String token;
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
  public String getToken() {
    return this.token;
  }
  public A withToken(String token) {
    this.token=token; return (A) this;
  }
  public Boolean hasToken() {
    return this.token != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TokenReviewSpecFluentImpl that = (V1TokenReviewSpecFluentImpl) o;
    if (audiences != null ? !audiences.equals(that.audiences) :that.audiences != null) return false;
    if (token != null ? !token.equals(that.token) :that.token != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(audiences,  token,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audiences != null && !audiences.isEmpty()) { sb.append("audiences:"); sb.append(audiences + ","); }
    if (token != null) { sb.append("token:"); sb.append(token); }
    sb.append("}");
    return sb.toString();
  }
  
}