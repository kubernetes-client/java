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
  public class V1beta3SubjectFluentImpl<A extends V1beta3SubjectFluent<A>> extends BaseFluent<A> implements V1beta3SubjectFluent<A>{
  public V1beta3SubjectFluentImpl() {
  }
  public V1beta3SubjectFluentImpl(V1beta3Subject instance) {
    if (instance != null) {
      this.withGroup(instance.getGroup());
      this.withKind(instance.getKind());
      this.withServiceAccount(instance.getServiceAccount());
      this.withUser(instance.getUser());
    }
  }
  private V1beta3GroupSubjectBuilder group;
  private String kind;
  private V1beta3ServiceAccountSubjectBuilder serviceAccount;
  private V1beta3UserSubjectBuilder user;
  
  /**
   * This method has been deprecated, please use method buildGroup instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3GroupSubject getGroup() {
    return this.group!=null ?this.group.build():null;
  }
  public V1beta3GroupSubject buildGroup() {
    return this.group!=null ?this.group.build():null;
  }
  public A withGroup(V1beta3GroupSubject group) {
    _visitables.get("group").remove(this.group);
    if (group!=null){ this.group= new V1beta3GroupSubjectBuilder(group); _visitables.get("group").add(this.group);} else { this.group = null; _visitables.get("group").remove(this.group); } return (A) this;
  }
  public Boolean hasGroup() {
    return this.group != null;
  }
  public V1beta3SubjectFluentImpl.GroupNested<A> withNewGroup() {
    return new V1beta3SubjectFluentImpl.GroupNestedImpl();
  }
  public V1beta3SubjectFluentImpl.GroupNested<A> withNewGroupLike(V1beta3GroupSubject item) {
    return new V1beta3SubjectFluentImpl.GroupNestedImpl(item);
  }
  public V1beta3SubjectFluentImpl.GroupNested<A> editGroup() {
    return withNewGroupLike(getGroup());
  }
  public V1beta3SubjectFluentImpl.GroupNested<A> editOrNewGroup() {
    return withNewGroupLike(getGroup() != null ? getGroup(): new V1beta3GroupSubjectBuilder().build());
  }
  public V1beta3SubjectFluentImpl.GroupNested<A> editOrNewGroupLike(V1beta3GroupSubject item) {
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
  public V1beta3ServiceAccountSubject getServiceAccount() {
    return this.serviceAccount!=null ?this.serviceAccount.build():null;
  }
  public V1beta3ServiceAccountSubject buildServiceAccount() {
    return this.serviceAccount!=null ?this.serviceAccount.build():null;
  }
  public A withServiceAccount(V1beta3ServiceAccountSubject serviceAccount) {
    _visitables.get("serviceAccount").remove(this.serviceAccount);
    if (serviceAccount!=null){ this.serviceAccount= new V1beta3ServiceAccountSubjectBuilder(serviceAccount); _visitables.get("serviceAccount").add(this.serviceAccount);} else { this.serviceAccount = null; _visitables.get("serviceAccount").remove(this.serviceAccount); } return (A) this;
  }
  public Boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }
  public V1beta3SubjectFluentImpl.ServiceAccountNested<A> withNewServiceAccount() {
    return new V1beta3SubjectFluentImpl.ServiceAccountNestedImpl();
  }
  public V1beta3SubjectFluentImpl.ServiceAccountNested<A> withNewServiceAccountLike(V1beta3ServiceAccountSubject item) {
    return new V1beta3SubjectFluentImpl.ServiceAccountNestedImpl(item);
  }
  public V1beta3SubjectFluentImpl.ServiceAccountNested<A> editServiceAccount() {
    return withNewServiceAccountLike(getServiceAccount());
  }
  public V1beta3SubjectFluentImpl.ServiceAccountNested<A> editOrNewServiceAccount() {
    return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): new V1beta3ServiceAccountSubjectBuilder().build());
  }
  public V1beta3SubjectFluentImpl.ServiceAccountNested<A> editOrNewServiceAccountLike(V1beta3ServiceAccountSubject item) {
    return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildUser instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1beta3UserSubject getUser() {
    return this.user!=null ?this.user.build():null;
  }
  public V1beta3UserSubject buildUser() {
    return this.user!=null ?this.user.build():null;
  }
  public A withUser(V1beta3UserSubject user) {
    _visitables.get("user").remove(this.user);
    if (user!=null){ this.user= new V1beta3UserSubjectBuilder(user); _visitables.get("user").add(this.user);} else { this.user = null; _visitables.get("user").remove(this.user); } return (A) this;
  }
  public Boolean hasUser() {
    return this.user != null;
  }
  public V1beta3SubjectFluentImpl.UserNested<A> withNewUser() {
    return new V1beta3SubjectFluentImpl.UserNestedImpl();
  }
  public V1beta3SubjectFluentImpl.UserNested<A> withNewUserLike(V1beta3UserSubject item) {
    return new V1beta3SubjectFluentImpl.UserNestedImpl(item);
  }
  public V1beta3SubjectFluentImpl.UserNested<A> editUser() {
    return withNewUserLike(getUser());
  }
  public V1beta3SubjectFluentImpl.UserNested<A> editOrNewUser() {
    return withNewUserLike(getUser() != null ? getUser(): new V1beta3UserSubjectBuilder().build());
  }
  public V1beta3SubjectFluentImpl.UserNested<A> editOrNewUserLike(V1beta3UserSubject item) {
    return withNewUserLike(getUser() != null ? getUser(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta3SubjectFluentImpl that = (V1beta3SubjectFluentImpl) o;
    if (!java.util.Objects.equals(group, that.group)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(serviceAccount, that.serviceAccount)) return false;

    if (!java.util.Objects.equals(user, that.user)) return false;

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
  class GroupNestedImpl<N> extends V1beta3GroupSubjectFluentImpl<V1beta3SubjectFluentImpl.GroupNested<N>> implements V1beta3SubjectFluentImpl.GroupNested<N>,Nested<N>{
    GroupNestedImpl(V1beta3GroupSubject item) {
      this.builder = new V1beta3GroupSubjectBuilder(this, item);
    }
    GroupNestedImpl() {
      this.builder = new V1beta3GroupSubjectBuilder(this);
    }
    V1beta3GroupSubjectBuilder builder;
    public N and() {
      return (N) V1beta3SubjectFluentImpl.this.withGroup(builder.build());
    }
    public N endGroup() {
      return and();
    }
    
  }
  class ServiceAccountNestedImpl<N> extends V1beta3ServiceAccountSubjectFluentImpl<V1beta3SubjectFluentImpl.ServiceAccountNested<N>> implements V1beta3SubjectFluentImpl.ServiceAccountNested<N>,Nested<N>{
    ServiceAccountNestedImpl(V1beta3ServiceAccountSubject item) {
      this.builder = new V1beta3ServiceAccountSubjectBuilder(this, item);
    }
    ServiceAccountNestedImpl() {
      this.builder = new V1beta3ServiceAccountSubjectBuilder(this);
    }
    V1beta3ServiceAccountSubjectBuilder builder;
    public N and() {
      return (N) V1beta3SubjectFluentImpl.this.withServiceAccount(builder.build());
    }
    public N endServiceAccount() {
      return and();
    }
    
  }
  class UserNestedImpl<N> extends V1beta3UserSubjectFluentImpl<V1beta3SubjectFluentImpl.UserNested<N>> implements V1beta3SubjectFluentImpl.UserNested<N>,Nested<N>{
    UserNestedImpl(V1beta3UserSubject item) {
      this.builder = new V1beta3UserSubjectBuilder(this, item);
    }
    UserNestedImpl() {
      this.builder = new V1beta3UserSubjectBuilder(this);
    }
    V1beta3UserSubjectBuilder builder;
    public N and() {
      return (N) V1beta3SubjectFluentImpl.this.withUser(builder.build());
    }
    public N endUser() {
      return and();
    }
    
  }
  
}