package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta1SelfSubjectReviewStatusFluent<A extends V1beta1SelfSubjectReviewStatusFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildUserInfo instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1UserInfo getUserInfo();
  public V1UserInfo buildUserInfo();
  public A withUserInfo(V1UserInfo userInfo);
  public Boolean hasUserInfo();
  public V1beta1SelfSubjectReviewStatusFluent.UserInfoNested<A> withNewUserInfo();
  public V1beta1SelfSubjectReviewStatusFluent.UserInfoNested<A> withNewUserInfoLike(V1UserInfo item);
  public V1beta1SelfSubjectReviewStatusFluent.UserInfoNested<A> editUserInfo();
  public V1beta1SelfSubjectReviewStatusFluent.UserInfoNested<A> editOrNewUserInfo();
  public V1beta1SelfSubjectReviewStatusFluent.UserInfoNested<A> editOrNewUserInfoLike(V1UserInfo item);
  public interface UserInfoNested<N> extends Nested<N>,V1UserInfoFluent<V1beta1SelfSubjectReviewStatusFluent.UserInfoNested<N>>{
    public N and();
    public N endUserInfo();
    
  }
  
}