package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1TokenReviewStatusFluentImpl<A extends V1TokenReviewStatusFluent<A>> extends BaseFluent<A> implements V1TokenReviewStatusFluent<A>{
  public V1TokenReviewStatusFluentImpl() {
  }
  public V1TokenReviewStatusFluentImpl(V1TokenReviewStatus instance) {
    if (instance != null) {
      this.withAudiences(instance.getAudiences());
      this.withAuthenticated(instance.getAuthenticated());
      this.withError(instance.getError());
      this.withUser(instance.getUser());
    }
  }
  private List<String> audiences;
  private Boolean authenticated;
  private String error;
  private V1UserInfoBuilder user;
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
    for (String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
  }
  public A removeAllFromAudiences(Collection<String> items) {
    for (String item : items) {if (this.audiences!= null){ this.audiences.remove(item);}} return (A)this;
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
    for (String item: audiences) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAudience(Predicate<String> predicate) {
    for (String item: audiences) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAudiences(List<String> audiences) {
    if (audiences != null) {this.audiences = new ArrayList(); for (String item : audiences){this.addToAudiences(item);}} else { this.audiences = null;} return (A) this;
  }
  public A withAudiences(java.lang.String... audiences) {
    if (this.audiences != null) {this.audiences.clear(); _visitables.remove("audiences"); }
    if (audiences != null) {for (String item :audiences){ this.addToAudiences(item);}} return (A) this;
  }
  public Boolean hasAudiences() {
    return audiences != null && !audiences.isEmpty();
  }
  public Boolean getAuthenticated() {
    return this.authenticated;
  }
  public A withAuthenticated(Boolean authenticated) {
    this.authenticated=authenticated; return (A) this;
  }
  public Boolean hasAuthenticated() {
    return this.authenticated != null;
  }
  public String getError() {
    return this.error;
  }
  public A withError(String error) {
    this.error=error; return (A) this;
  }
  public Boolean hasError() {
    return this.error != null;
  }
  
  /**
   * This method has been deprecated, please use method buildUser instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1UserInfo getUser() {
    return this.user!=null ?this.user.build():null;
  }
  public V1UserInfo buildUser() {
    return this.user!=null ?this.user.build():null;
  }
  public A withUser(V1UserInfo user) {
    _visitables.get("user").remove(this.user);
    if (user!=null){ this.user= new V1UserInfoBuilder(user); _visitables.get("user").add(this.user);} else { this.user = null; _visitables.get("user").remove(this.user); } return (A) this;
  }
  public Boolean hasUser() {
    return this.user != null;
  }
  public V1TokenReviewStatusFluentImpl.UserNested<A> withNewUser() {
    return new V1TokenReviewStatusFluentImpl.UserNestedImpl();
  }
  public V1TokenReviewStatusFluentImpl.UserNested<A> withNewUserLike(V1UserInfo item) {
    return new V1TokenReviewStatusFluentImpl.UserNestedImpl(item);
  }
  public V1TokenReviewStatusFluentImpl.UserNested<A> editUser() {
    return withNewUserLike(getUser());
  }
  public V1TokenReviewStatusFluentImpl.UserNested<A> editOrNewUser() {
    return withNewUserLike(getUser() != null ? getUser(): new V1UserInfoBuilder().build());
  }
  public V1TokenReviewStatusFluentImpl.UserNested<A> editOrNewUserLike(V1UserInfo item) {
    return withNewUserLike(getUser() != null ? getUser(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TokenReviewStatusFluentImpl that = (V1TokenReviewStatusFluentImpl) o;
    if (!java.util.Objects.equals(audiences, that.audiences)) return false;

    if (!java.util.Objects.equals(authenticated, that.authenticated)) return false;

    if (!java.util.Objects.equals(error, that.error)) return false;

    if (!java.util.Objects.equals(user, that.user)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(audiences,  authenticated,  error,  user,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (audiences != null && !audiences.isEmpty()) { sb.append("audiences:"); sb.append(audiences + ","); }
    if (authenticated != null) { sb.append("authenticated:"); sb.append(authenticated + ","); }
    if (error != null) { sb.append("error:"); sb.append(error + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  public A withAuthenticated() {
    return withAuthenticated(true);
  }
  class UserNestedImpl<N> extends V1UserInfoFluentImpl<V1TokenReviewStatusFluentImpl.UserNested<N>> implements V1TokenReviewStatusFluentImpl.UserNested<N>,Nested<N>{
    UserNestedImpl(V1UserInfo item) {
      this.builder = new V1UserInfoBuilder(this, item);
    }
    UserNestedImpl() {
      this.builder = new V1UserInfoBuilder(this);
    }
    V1UserInfoBuilder builder;
    public N and() {
      return (N) V1TokenReviewStatusFluentImpl.this.withUser(builder.build());
    }
    public N endUser() {
      return and();
    }
    
  }
  
}