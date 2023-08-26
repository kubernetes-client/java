package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1beta3SubjectFluent<A extends V1beta3SubjectFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildGroup instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3GroupSubject getGroup();
  public V1beta3GroupSubject buildGroup();
  public A withGroup(V1beta3GroupSubject group);
  public Boolean hasGroup();
  public V1beta3SubjectFluent.GroupNested<A> withNewGroup();
  public V1beta3SubjectFluent.GroupNested<A> withNewGroupLike(V1beta3GroupSubject item);
  public V1beta3SubjectFluent.GroupNested<A> editGroup();
  public V1beta3SubjectFluent.GroupNested<A> editOrNewGroup();
  public V1beta3SubjectFluent.GroupNested<A> editOrNewGroupLike(V1beta3GroupSubject item);
  public String getKind();
  public A withKind(String kind);
  public Boolean hasKind();
  
  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3ServiceAccountSubject getServiceAccount();
  public V1beta3ServiceAccountSubject buildServiceAccount();
  public A withServiceAccount(V1beta3ServiceAccountSubject serviceAccount);
  public Boolean hasServiceAccount();
  public V1beta3SubjectFluent.ServiceAccountNested<A> withNewServiceAccount();
  public V1beta3SubjectFluent.ServiceAccountNested<A> withNewServiceAccountLike(V1beta3ServiceAccountSubject item);
  public V1beta3SubjectFluent.ServiceAccountNested<A> editServiceAccount();
  public V1beta3SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccount();
  public V1beta3SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(V1beta3ServiceAccountSubject item);
  
  /**
   * This method has been deprecated, please use method buildUser instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3UserSubject getUser();
  public V1beta3UserSubject buildUser();
  public A withUser(V1beta3UserSubject user);
  public Boolean hasUser();
  public V1beta3SubjectFluent.UserNested<A> withNewUser();
  public V1beta3SubjectFluent.UserNested<A> withNewUserLike(V1beta3UserSubject item);
  public V1beta3SubjectFluent.UserNested<A> editUser();
  public V1beta3SubjectFluent.UserNested<A> editOrNewUser();
  public V1beta3SubjectFluent.UserNested<A> editOrNewUserLike(V1beta3UserSubject item);
  public interface GroupNested<N> extends Nested<N>,V1beta3GroupSubjectFluent<V1beta3SubjectFluent.GroupNested<N>>{
    public N and();
    public N endGroup();
    
  }
  public interface ServiceAccountNested<N> extends Nested<N>,V1beta3ServiceAccountSubjectFluent<V1beta3SubjectFluent.ServiceAccountNested<N>>{
    public N and();
    public N endServiceAccount();
    
  }
  public interface UserNested<N> extends Nested<N>,V1beta3UserSubjectFluent<V1beta3SubjectFluent.UserNested<N>>{
    public N and();
    public N endUser();
    
  }
  
}