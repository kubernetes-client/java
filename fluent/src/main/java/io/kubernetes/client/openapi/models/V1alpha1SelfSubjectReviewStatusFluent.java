package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1SelfSubjectReviewStatusFluent<A extends V1alpha1SelfSubjectReviewStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha1SelfSubjectReviewStatusFluent() {
  }
  
  public V1alpha1SelfSubjectReviewStatusFluent(V1alpha1SelfSubjectReviewStatus instance) {
    this.copyInstance(instance);
  }
  private V1UserInfoBuilder userInfo;
  
  protected void copyInstance(V1alpha1SelfSubjectReviewStatus instance) {
    instance = (instance != null ? instance : new V1alpha1SelfSubjectReviewStatus());
    if (instance != null) {
          this.withUserInfo(instance.getUserInfo());
        }
  }
  
  public V1UserInfo buildUserInfo() {
    return this.userInfo != null ? this.userInfo.build() : null;
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
  
  public boolean hasUserInfo() {
    return this.userInfo != null;
  }
  
  public UserInfoNested<A> withNewUserInfo() {
    return new UserInfoNested(null);
  }
  
  public UserInfoNested<A> withNewUserInfoLike(V1UserInfo item) {
    return new UserInfoNested(item);
  }
  
  public UserInfoNested<A> editUserInfo() {
    return withNewUserInfoLike(java.util.Optional.ofNullable(buildUserInfo()).orElse(null));
  }
  
  public UserInfoNested<A> editOrNewUserInfo() {
    return withNewUserInfoLike(java.util.Optional.ofNullable(buildUserInfo()).orElse(new V1UserInfoBuilder().build()));
  }
  
  public UserInfoNested<A> editOrNewUserInfoLike(V1UserInfo item) {
    return withNewUserInfoLike(java.util.Optional.ofNullable(buildUserInfo()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1SelfSubjectReviewStatusFluent that = (V1alpha1SelfSubjectReviewStatusFluent) o;
    if (!java.util.Objects.equals(userInfo, that.userInfo)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(userInfo,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (userInfo != null) { sb.append("userInfo:"); sb.append(userInfo); }
    sb.append("}");
    return sb.toString();
  }
  public class UserInfoNested<N> extends V1UserInfoFluent<UserInfoNested<N>> implements Nested<N>{
    UserInfoNested(V1UserInfo item) {
      this.builder = new V1UserInfoBuilder(this, item);
    }
    V1UserInfoBuilder builder;
    
    public N and() {
      return (N) V1alpha1SelfSubjectReviewStatusFluent.this.withUserInfo(builder.build());
    }
    
    public N endUserInfo() {
      return and();
    }
    
  
  }

}