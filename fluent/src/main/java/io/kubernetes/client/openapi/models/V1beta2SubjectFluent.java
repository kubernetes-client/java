package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta2SubjectFluent<A extends V1beta2SubjectFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildGroup instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2GroupSubject getGroup();
  public V1beta2GroupSubject buildGroup();
  public A withGroup(V1beta2GroupSubject group);
  public Boolean hasGroup();
  public V1beta2SubjectFluent.GroupNested<A> withNewGroup();
  public V1beta2SubjectFluent.GroupNested<A> withNewGroupLike(V1beta2GroupSubject item);
  public V1beta2SubjectFluent.GroupNested<A> editGroup();
  public V1beta2SubjectFluent.GroupNested<A> editOrNewGroup();
  public V1beta2SubjectFluent.GroupNested<A> editOrNewGroupLike(V1beta2GroupSubject item);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2ServiceAccountSubject getServiceAccount();
  public V1beta2ServiceAccountSubject buildServiceAccount();
  public A withServiceAccount(V1beta2ServiceAccountSubject serviceAccount);
  public Boolean hasServiceAccount();
  public V1beta2SubjectFluent.ServiceAccountNested<A> withNewServiceAccount();
  public V1beta2SubjectFluent.ServiceAccountNested<A> withNewServiceAccountLike(V1beta2ServiceAccountSubject item);
  public V1beta2SubjectFluent.ServiceAccountNested<A> editServiceAccount();
  public V1beta2SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccount();
  public V1beta2SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(V1beta2ServiceAccountSubject item);
  
  /**
   * This method has been deprecated, please use method buildUser instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2UserSubject getUser();
  public V1beta2UserSubject buildUser();
  public A withUser(V1beta2UserSubject user);
  public Boolean hasUser();
  public V1beta2SubjectFluent.UserNested<A> withNewUser();
  public V1beta2SubjectFluent.UserNested<A> withNewUserLike(V1beta2UserSubject item);
  public V1beta2SubjectFluent.UserNested<A> editUser();
  public V1beta2SubjectFluent.UserNested<A> editOrNewUser();
  public V1beta2SubjectFluent.UserNested<A> editOrNewUserLike(V1beta2UserSubject item);
  public interface GroupNested<N> extends Nested<N>,V1beta2GroupSubjectFluent<V1beta2SubjectFluent.GroupNested<N>>{
    public N and();
    public N endGroup();
    
  }
  public interface ServiceAccountNested<N> extends Nested<N>,V1beta2ServiceAccountSubjectFluent<V1beta2SubjectFluent.ServiceAccountNested<N>>{
    public N and();
    public N endServiceAccount();
    
  }
  public interface UserNested<N> extends Nested<N>,V1beta2UserSubjectFluent<V1beta2SubjectFluent.UserNested<N>>{
    public N and();
    public N endUser();
    
  }
  
}