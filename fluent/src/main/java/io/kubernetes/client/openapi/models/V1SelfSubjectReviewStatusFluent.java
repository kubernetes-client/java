package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SelfSubjectReviewStatusFluent<A extends io.kubernetes.client.openapi.models.V1SelfSubjectReviewStatusFluent<A>> extends BaseFluent<A>{

  private V1UserInfoBuilder userInfo;

  public V1SelfSubjectReviewStatusFluent() {
  }
  
  public V1SelfSubjectReviewStatusFluent(V1SelfSubjectReviewStatus instance) {
    this.copyInstance(instance);
  }

  public V1UserInfo buildUserInfo() {
    return this.userInfo != null ? this.userInfo.build() : null;
  }
  
  protected void copyInstance(V1SelfSubjectReviewStatus instance) {
    instance = instance != null ? instance : new V1SelfSubjectReviewStatus();
    if (instance != null) {
      this.withUserInfo(instance.getUserInfo());
    }
  }
  
  public UserInfoNested<A> editOrNewUserInfo() {
    return this.withNewUserInfoLike(Optional.ofNullable(this.buildUserInfo()).orElse(new V1UserInfoBuilder().build()));
  }
  
  public UserInfoNested<A> editOrNewUserInfoLike(V1UserInfo item) {
    return this.withNewUserInfoLike(Optional.ofNullable(this.buildUserInfo()).orElse(item));
  }
  
  public UserInfoNested<A> editUserInfo() {
    return this.withNewUserInfoLike(Optional.ofNullable(this.buildUserInfo()).orElse(null));
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
    V1SelfSubjectReviewStatusFluent that = (V1SelfSubjectReviewStatusFluent) o;
    if (!(Objects.equals(userInfo, that.userInfo))) {
      return false;
    }
    return true;
  }
  
  public boolean hasUserInfo() {
    return this.userInfo != null;
  }
  
  public int hashCode() {
    return Objects.hash(userInfo);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(userInfo == null)) {
        sb.append("userInfo:");
        sb.append(userInfo);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public UserInfoNested<A> withNewUserInfo() {
    return new UserInfoNested(null);
  }
  
  public UserInfoNested<A> withNewUserInfoLike(V1UserInfo item) {
    return new UserInfoNested(item);
  }
  
  public A withUserInfo(V1UserInfo userInfo) {
    this._visitables.remove("userInfo");
    if (userInfo != null) {
        this.userInfo = new V1UserInfoBuilder(userInfo);
        this._visitables.get("userInfo").add(this.userInfo);
    } else {
        this.userInfo = null;
        this._visitables.get("userInfo").remove(this.userInfo);
    }
    return (A) this;
  }
  public class UserInfoNested<N> extends V1UserInfoFluent<UserInfoNested<N>> implements Nested<N>{
  
    V1UserInfoBuilder builder;
  
    UserInfoNested(V1UserInfo item) {
      this.builder = new V1UserInfoBuilder(this, item);
    }
  
    public N and() {
      return (N) V1SelfSubjectReviewStatusFluent.this.withUserInfo(builder.build());
    }
    
    public N endUserInfo() {
      return and();
    }
    
  }
}