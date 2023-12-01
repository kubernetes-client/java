package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1TokenReviewStatusFluent<A extends V1TokenReviewStatusFluent<A>> extends BaseFluent<A>{
  public V1TokenReviewStatusFluent() {
  }
  
  public V1TokenReviewStatusFluent(V1TokenReviewStatus instance) {
    this.copyInstance(instance);
  }
  private List<String> audiences;
  private Boolean authenticated;
  private String error;
  private V1UserInfoBuilder user;
  
  protected void copyInstance(V1TokenReviewStatus instance) {
    instance = (instance != null ? instance : new V1TokenReviewStatus());
    if (instance != null) {
          this.withAudiences(instance.getAudiences());
          this.withAuthenticated(instance.getAuthenticated());
          this.withError(instance.getError());
          this.withUser(instance.getUser());
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
  
  public Boolean getAuthenticated() {
    return this.authenticated;
  }
  
  public A withAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return (A) this;
  }
  
  public boolean hasAuthenticated() {
    return this.authenticated != null;
  }
  
  public String getError() {
    return this.error;
  }
  
  public A withError(String error) {
    this.error = error;
    return (A) this;
  }
  
  public boolean hasError() {
    return this.error != null;
  }
  
  public V1UserInfo buildUser() {
    return this.user != null ? this.user.build() : null;
  }
  
  public A withUser(V1UserInfo user) {
    this._visitables.remove("user");
    if (user != null) {
        this.user = new V1UserInfoBuilder(user);
        this._visitables.get("user").add(this.user);
    } else {
        this.user = null;
        this._visitables.get("user").remove(this.user);
    }
    return (A) this;
  }
  
  public boolean hasUser() {
    return this.user != null;
  }
  
  public UserNested<A> withNewUser() {
    return new UserNested(null);
  }
  
  public UserNested<A> withNewUserLike(V1UserInfo item) {
    return new UserNested(item);
  }
  
  public UserNested<A> editUser() {
    return withNewUserLike(java.util.Optional.ofNullable(buildUser()).orElse(null));
  }
  
  public UserNested<A> editOrNewUser() {
    return withNewUserLike(java.util.Optional.ofNullable(buildUser()).orElse(new V1UserInfoBuilder().build()));
  }
  
  public UserNested<A> editOrNewUserLike(V1UserInfo item) {
    return withNewUserLike(java.util.Optional.ofNullable(buildUser()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1TokenReviewStatusFluent that = (V1TokenReviewStatusFluent) o;
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
  public class UserNested<N> extends V1UserInfoFluent<UserNested<N>> implements Nested<N>{
    UserNested(V1UserInfo item) {
      this.builder = new V1UserInfoBuilder(this, item);
    }
    V1UserInfoBuilder builder;
    
    public N and() {
      return (N) V1TokenReviewStatusFluent.this.withUser(builder.build());
    }
    
    public N endUser() {
      return and();
    }
    
  
  }

}