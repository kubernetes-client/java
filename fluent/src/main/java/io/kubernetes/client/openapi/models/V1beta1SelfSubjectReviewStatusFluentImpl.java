package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta1SelfSubjectReviewStatusFluentImpl<A extends V1beta1SelfSubjectReviewStatusFluent<A>> extends BaseFluent<A> implements V1beta1SelfSubjectReviewStatusFluent<A>{
  public V1beta1SelfSubjectReviewStatusFluentImpl() {
  }
  public V1beta1SelfSubjectReviewStatusFluentImpl(V1beta1SelfSubjectReviewStatus instance) {
    if (instance != null) {
      this.withUserInfo(instance.getUserInfo());
    }
  }
  private V1UserInfoBuilder userInfo;
  
  /**
   * This method has been deprecated, please use method buildUserInfo instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1UserInfo getUserInfo() {
    return this.userInfo!=null ?this.userInfo.build():null;
  }
  public V1UserInfo buildUserInfo() {
    return this.userInfo!=null ?this.userInfo.build():null;
  }
  public A withUserInfo(V1UserInfo userInfo) {
    _visitables.get("userInfo").remove(this.userInfo);
    if (userInfo!=null){ this.userInfo= new V1UserInfoBuilder(userInfo); _visitables.get("userInfo").add(this.userInfo);} else { this.userInfo = null; _visitables.get("userInfo").remove(this.userInfo); } return (A) this;
  }
  public Boolean hasUserInfo() {
    return this.userInfo != null;
  }
  public V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNested<A> withNewUserInfo() {
    return new V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNestedImpl();
  }
  public V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNested<A> withNewUserInfoLike(V1UserInfo item) {
    return new V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNestedImpl(item);
  }
  public V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNested<A> editUserInfo() {
    return withNewUserInfoLike(getUserInfo());
  }
  public V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNested<A> editOrNewUserInfo() {
    return withNewUserInfoLike(getUserInfo() != null ? getUserInfo(): new V1UserInfoBuilder().build());
  }
  public V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNested<A> editOrNewUserInfoLike(V1UserInfo item) {
    return withNewUserInfoLike(getUserInfo() != null ? getUserInfo(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1SelfSubjectReviewStatusFluentImpl that = (V1beta1SelfSubjectReviewStatusFluentImpl) o;
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
  class UserInfoNestedImpl<N> extends V1UserInfoFluentImpl<V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNested<N>> implements V1beta1SelfSubjectReviewStatusFluentImpl.UserInfoNested<N>,Nested<N>{
    UserInfoNestedImpl(V1UserInfo item) {
      this.builder = new V1UserInfoBuilder(this, item);
    }
    UserInfoNestedImpl() {
      this.builder = new V1UserInfoBuilder(this);
    }
    V1UserInfoBuilder builder;
    public N and() {
      return (N) V1beta1SelfSubjectReviewStatusFluentImpl.this.withUserInfo(builder.build());
    }
    public N endUserInfo() {
      return and();
    }
    
  }
  
}