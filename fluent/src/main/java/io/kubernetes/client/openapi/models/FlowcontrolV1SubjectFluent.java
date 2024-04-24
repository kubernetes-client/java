package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class FlowcontrolV1SubjectFluent<A extends FlowcontrolV1SubjectFluent<A>> extends BaseFluent<A>{
  public FlowcontrolV1SubjectFluent() {
  }
  
  public FlowcontrolV1SubjectFluent(FlowcontrolV1Subject instance) {
    this.copyInstance(instance);
  }
  private V1GroupSubjectBuilder group;
  private String kind;
  private V1ServiceAccountSubjectBuilder serviceAccount;
  private V1UserSubjectBuilder user;
  
  protected void copyInstance(FlowcontrolV1Subject instance) {
    instance = (instance != null ? instance : new FlowcontrolV1Subject());
    if (instance != null) {
          this.withGroup(instance.getGroup());
          this.withKind(instance.getKind());
          this.withServiceAccount(instance.getServiceAccount());
          this.withUser(instance.getUser());
        }
  }
  
  public V1GroupSubject buildGroup() {
    return this.group != null ? this.group.build() : null;
  }
  
  public A withGroup(V1GroupSubject group) {
    this._visitables.remove("group");
    if (group != null) {
        this.group = new V1GroupSubjectBuilder(group);
        this._visitables.get("group").add(this.group);
    } else {
        this.group = null;
        this._visitables.get("group").remove(this.group);
    }
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public GroupNested<A> withNewGroup() {
    return new GroupNested(null);
  }
  
  public GroupNested<A> withNewGroupLike(V1GroupSubject item) {
    return new GroupNested(item);
  }
  
  public GroupNested<A> editGroup() {
    return withNewGroupLike(java.util.Optional.ofNullable(buildGroup()).orElse(null));
  }
  
  public GroupNested<A> editOrNewGroup() {
    return withNewGroupLike(java.util.Optional.ofNullable(buildGroup()).orElse(new V1GroupSubjectBuilder().build()));
  }
  
  public GroupNested<A> editOrNewGroupLike(V1GroupSubject item) {
    return withNewGroupLike(java.util.Optional.ofNullable(buildGroup()).orElse(item));
  }
  
  public String getKind() {
    return this.kind;
  }
  
  public A withKind(String kind) {
    this.kind = kind;
    return (A) this;
  }
  
  public boolean hasKind() {
    return this.kind != null;
  }
  
  public V1ServiceAccountSubject buildServiceAccount() {
    return this.serviceAccount != null ? this.serviceAccount.build() : null;
  }
  
  public A withServiceAccount(V1ServiceAccountSubject serviceAccount) {
    this._visitables.remove("serviceAccount");
    if (serviceAccount != null) {
        this.serviceAccount = new V1ServiceAccountSubjectBuilder(serviceAccount);
        this._visitables.get("serviceAccount").add(this.serviceAccount);
    } else {
        this.serviceAccount = null;
        this._visitables.get("serviceAccount").remove(this.serviceAccount);
    }
    return (A) this;
  }
  
  public boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }
  
  public ServiceAccountNested<A> withNewServiceAccount() {
    return new ServiceAccountNested(null);
  }
  
  public ServiceAccountNested<A> withNewServiceAccountLike(V1ServiceAccountSubject item) {
    return new ServiceAccountNested(item);
  }
  
  public ServiceAccountNested<A> editServiceAccount() {
    return withNewServiceAccountLike(java.util.Optional.ofNullable(buildServiceAccount()).orElse(null));
  }
  
  public ServiceAccountNested<A> editOrNewServiceAccount() {
    return withNewServiceAccountLike(java.util.Optional.ofNullable(buildServiceAccount()).orElse(new V1ServiceAccountSubjectBuilder().build()));
  }
  
  public ServiceAccountNested<A> editOrNewServiceAccountLike(V1ServiceAccountSubject item) {
    return withNewServiceAccountLike(java.util.Optional.ofNullable(buildServiceAccount()).orElse(item));
  }
  
  public V1UserSubject buildUser() {
    return this.user != null ? this.user.build() : null;
  }
  
  public A withUser(V1UserSubject user) {
    this._visitables.remove("user");
    if (user != null) {
        this.user = new V1UserSubjectBuilder(user);
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
  
  public UserNested<A> withNewUserLike(V1UserSubject item) {
    return new UserNested(item);
  }
  
  public UserNested<A> editUser() {
    return withNewUserLike(java.util.Optional.ofNullable(buildUser()).orElse(null));
  }
  
  public UserNested<A> editOrNewUser() {
    return withNewUserLike(java.util.Optional.ofNullable(buildUser()).orElse(new V1UserSubjectBuilder().build()));
  }
  
  public UserNested<A> editOrNewUserLike(V1UserSubject item) {
    return withNewUserLike(java.util.Optional.ofNullable(buildUser()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    FlowcontrolV1SubjectFluent that = (FlowcontrolV1SubjectFluent) o;
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
  public class GroupNested<N> extends V1GroupSubjectFluent<GroupNested<N>> implements Nested<N>{
    GroupNested(V1GroupSubject item) {
      this.builder = new V1GroupSubjectBuilder(this, item);
    }
    V1GroupSubjectBuilder builder;
    
    public N and() {
      return (N) FlowcontrolV1SubjectFluent.this.withGroup(builder.build());
    }
    
    public N endGroup() {
      return and();
    }
    
  
  }
  public class ServiceAccountNested<N> extends V1ServiceAccountSubjectFluent<ServiceAccountNested<N>> implements Nested<N>{
    ServiceAccountNested(V1ServiceAccountSubject item) {
      this.builder = new V1ServiceAccountSubjectBuilder(this, item);
    }
    V1ServiceAccountSubjectBuilder builder;
    
    public N and() {
      return (N) FlowcontrolV1SubjectFluent.this.withServiceAccount(builder.build());
    }
    
    public N endServiceAccount() {
      return and();
    }
    
  
  }
  public class UserNested<N> extends V1UserSubjectFluent<UserNested<N>> implements Nested<N>{
    UserNested(V1UserSubject item) {
      this.builder = new V1UserSubjectBuilder(this, item);
    }
    V1UserSubjectBuilder builder;
    
    public N and() {
      return (N) FlowcontrolV1SubjectFluent.this.withUser(builder.build());
    }
    
    public N endUser() {
      return and();
    }
    
  
  }

}