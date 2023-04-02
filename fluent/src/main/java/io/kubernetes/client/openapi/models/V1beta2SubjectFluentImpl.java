package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1beta2SubjectFluentImpl<A extends V1beta2SubjectFluent<A>> extends BaseFluent<A> implements V1beta2SubjectFluent<A>{
  public V1beta2SubjectFluentImpl() {
  }
  public V1beta2SubjectFluentImpl(V1beta2Subject instance) {
    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withServiceAccount(instance.getServiceAccount());

    this.withUser(instance.getUser());

  }
  private V1beta2GroupSubjectBuilder group;
  private String kind;
  private V1beta2ServiceAccountSubjectBuilder serviceAccount;
  private V1beta2UserSubjectBuilder user;
  
  /**
   * This method has been deprecated, please use method buildGroup instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2GroupSubject getGroup() {
    return this.group!=null ?this.group.build():null;
  }
  public V1beta2GroupSubject buildGroup() {
    return this.group!=null ?this.group.build():null;
  }
  public A withGroup(V1beta2GroupSubject group) {
    _visitables.get("group").remove(this.group);
    if (group!=null){ this.group= new V1beta2GroupSubjectBuilder(group); _visitables.get("group").add(this.group);} else { this.group = null; _visitables.get("group").remove(this.group); } return (A) this;
  }
  public Boolean hasGroup() {
    return this.group != null;
  }
  public V1beta2SubjectFluent.GroupNested<A> withNewGroup() {
    return new V1beta2SubjectFluentImpl.GroupNestedImpl();
  }
  public V1beta2SubjectFluent.GroupNested<A> withNewGroupLike(V1beta2GroupSubject item) {
    return new V1beta2SubjectFluentImpl.GroupNestedImpl(item);
  }
  public V1beta2SubjectFluent.GroupNested<A> editGroup() {
    return withNewGroupLike(getGroup());
  }
  public V1beta2SubjectFluent.GroupNested<A> editOrNewGroup() {
    return withNewGroupLike(getGroup() != null ? getGroup(): new V1beta2GroupSubjectBuilder().build());
  }
  public V1beta2SubjectFluent.GroupNested<A> editOrNewGroupLike(V1beta2GroupSubject item) {
    return withNewGroupLike(getGroup() != null ? getGroup(): item);
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2ServiceAccountSubject getServiceAccount() {
    return this.serviceAccount!=null ?this.serviceAccount.build():null;
  }
  public V1beta2ServiceAccountSubject buildServiceAccount() {
    return this.serviceAccount!=null ?this.serviceAccount.build():null;
  }
  public A withServiceAccount(V1beta2ServiceAccountSubject serviceAccount) {
    _visitables.get("serviceAccount").remove(this.serviceAccount);
    if (serviceAccount!=null){ this.serviceAccount= new V1beta2ServiceAccountSubjectBuilder(serviceAccount); _visitables.get("serviceAccount").add(this.serviceAccount);} else { this.serviceAccount = null; _visitables.get("serviceAccount").remove(this.serviceAccount); } return (A) this;
  }
  public Boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }
  public V1beta2SubjectFluent.ServiceAccountNested<A> withNewServiceAccount() {
    return new V1beta2SubjectFluentImpl.ServiceAccountNestedImpl();
  }
  public V1beta2SubjectFluent.ServiceAccountNested<A> withNewServiceAccountLike(V1beta2ServiceAccountSubject item) {
    return new V1beta2SubjectFluentImpl.ServiceAccountNestedImpl(item);
  }
  public V1beta2SubjectFluent.ServiceAccountNested<A> editServiceAccount() {
    return withNewServiceAccountLike(getServiceAccount());
  }
  public V1beta2SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccount() {
    return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): new V1beta2ServiceAccountSubjectBuilder().build());
  }
  public V1beta2SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(V1beta2ServiceAccountSubject item) {
    return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildUser instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2UserSubject getUser() {
    return this.user!=null ?this.user.build():null;
  }
  public V1beta2UserSubject buildUser() {
    return this.user!=null ?this.user.build():null;
  }
  public A withUser(V1beta2UserSubject user) {
    _visitables.get("user").remove(this.user);
    if (user!=null){ this.user= new V1beta2UserSubjectBuilder(user); _visitables.get("user").add(this.user);} else { this.user = null; _visitables.get("user").remove(this.user); } return (A) this;
  }
  public Boolean hasUser() {
    return this.user != null;
  }
  public V1beta2SubjectFluent.UserNested<A> withNewUser() {
    return new V1beta2SubjectFluentImpl.UserNestedImpl();
  }
  public V1beta2SubjectFluent.UserNested<A> withNewUserLike(V1beta2UserSubject item) {
    return new V1beta2SubjectFluentImpl.UserNestedImpl(item);
  }
  public V1beta2SubjectFluent.UserNested<A> editUser() {
    return withNewUserLike(getUser());
  }
  public V1beta2SubjectFluent.UserNested<A> editOrNewUser() {
    return withNewUserLike(getUser() != null ? getUser(): new V1beta2UserSubjectBuilder().build());
  }
  public V1beta2SubjectFluent.UserNested<A> editOrNewUserLike(V1beta2UserSubject item) {
    return withNewUserLike(getUser() != null ? getUser(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2SubjectFluentImpl that = (V1beta2SubjectFluentImpl) o;
    if (group != null ? !group.equals(that.group) :that.group != null) return false;
    if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
    if (serviceAccount != null ? !serviceAccount.equals(that.serviceAccount) :that.serviceAccount != null) return false;
    if (user != null ? !user.equals(that.user) :that.user != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(group,  kind,  serviceAccount,  user,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (serviceAccount != null) { sb.append("serviceAccount:"); sb.append(serviceAccount + ","); }
    if (user != null) { sb.append("user:"); sb.append(user); }
    sb.append("}");
    return sb.toString();
  }
  class GroupNestedImpl<N> extends V1beta2GroupSubjectFluentImpl<V1beta2SubjectFluent.GroupNested<N>> implements V1beta2SubjectFluent.GroupNested<N>,Nested<N>{
    GroupNestedImpl(V1beta2GroupSubject item) {
      this.builder = new V1beta2GroupSubjectBuilder(this, item);
    }
    GroupNestedImpl() {
      this.builder = new V1beta2GroupSubjectBuilder(this);
    }
    V1beta2GroupSubjectBuilder builder;
    public N and() {
      return (N) V1beta2SubjectFluentImpl.this.withGroup(builder.build());
    }
    public N endGroup() {
      return and();
    }
    
  }
  class ServiceAccountNestedImpl<N> extends V1beta2ServiceAccountSubjectFluentImpl<V1beta2SubjectFluent.ServiceAccountNested<N>> implements V1beta2SubjectFluent.ServiceAccountNested<N>,Nested<N>{
    ServiceAccountNestedImpl(V1beta2ServiceAccountSubject item) {
      this.builder = new V1beta2ServiceAccountSubjectBuilder(this, item);
    }
    ServiceAccountNestedImpl() {
      this.builder = new V1beta2ServiceAccountSubjectBuilder(this);
    }
    V1beta2ServiceAccountSubjectBuilder builder;
    public N and() {
      return (N) V1beta2SubjectFluentImpl.this.withServiceAccount(builder.build());
    }
    public N endServiceAccount() {
      return and();
    }
    
  }
  class UserNestedImpl<N> extends V1beta2UserSubjectFluentImpl<V1beta2SubjectFluent.UserNested<N>> implements V1beta2SubjectFluent.UserNested<N>,Nested<N>{
    UserNestedImpl(V1beta2UserSubject item) {
      this.builder = new V1beta2UserSubjectBuilder(this, item);
    }
    UserNestedImpl() {
      this.builder = new V1beta2UserSubjectBuilder(this);
    }
    V1beta2UserSubjectBuilder builder;
    public N and() {
      return (N) V1beta2SubjectFluentImpl.this.withUser(builder.build());
    }
    public N endUser() {
      return and();
    }
    
  }
  
}