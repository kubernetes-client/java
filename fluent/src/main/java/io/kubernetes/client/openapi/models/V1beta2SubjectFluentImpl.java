/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

/** Generated */
public class V1beta2SubjectFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta2SubjectFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta2SubjectFluent<A> {
  public V1beta2SubjectFluentImpl() {}

  public V1beta2SubjectFluentImpl(io.kubernetes.client.openapi.models.V1beta2Subject instance) {
    this.withGroup(instance.getGroup());

    this.withKind(instance.getKind());

    this.withServiceAccount(instance.getServiceAccount());

    this.withUser(instance.getUser());
  }

  private io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder group;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder serviceAccount;
  private io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder user;

  /**
   * This method has been deprecated, please use method buildGroup instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2GroupSubject getGroup() {
    return this.group != null ? this.group.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2GroupSubject buildGroup() {
    return this.group != null ? this.group.build() : null;
  }

  public A withGroup(io.kubernetes.client.openapi.models.V1beta2GroupSubject group) {
    _visitables.get("group").remove(this.group);
    if (group != null) {
      this.group = new io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder(group);
      _visitables.get("group").add(this.group);
    }
    return (A) this;
  }

  public java.lang.Boolean hasGroup() {
    return this.group != null;
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> withNewGroup() {
    return new io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl.GroupNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> withNewGroupLike(
      io.kubernetes.client.openapi.models.V1beta2GroupSubject item) {
    return new io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl.GroupNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> editGroup() {
    return withNewGroupLike(getGroup());
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> editOrNewGroup() {
    return withNewGroupLike(
        getGroup() != null
            ? getGroup()
            : new io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> editOrNewGroupLike(
      io.kubernetes.client.openapi.models.V1beta2GroupSubject item) {
    return withNewGroupLike(getGroup() != null ? getGroup() : item);
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject getServiceAccount() {
    return this.serviceAccount != null ? this.serviceAccount.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject buildServiceAccount() {
    return this.serviceAccount != null ? this.serviceAccount.build() : null;
  }

  public A withServiceAccount(
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject serviceAccount) {
    _visitables.get("serviceAccount").remove(this.serviceAccount);
    if (serviceAccount != null) {
      this.serviceAccount =
          new io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder(
              serviceAccount);
      _visitables.get("serviceAccount").add(this.serviceAccount);
    }
    return (A) this;
  }

  public java.lang.Boolean hasServiceAccount() {
    return this.serviceAccount != null;
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      withNewServiceAccount() {
    return new io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl
        .ServiceAccountNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      withNewServiceAccountLike(
          io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject item) {
    return new io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl
        .ServiceAccountNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      editServiceAccount() {
    return withNewServiceAccountLike(getServiceAccount());
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      editOrNewServiceAccount() {
    return withNewServiceAccountLike(
        getServiceAccount() != null
            ? getServiceAccount()
            : new io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      editOrNewServiceAccountLike(
          io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject item) {
    return withNewServiceAccountLike(getServiceAccount() != null ? getServiceAccount() : item);
  }

  /**
   * This method has been deprecated, please use method buildUser instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta2UserSubject getUser() {
    return this.user != null ? this.user.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2UserSubject buildUser() {
    return this.user != null ? this.user.build() : null;
  }

  public A withUser(io.kubernetes.client.openapi.models.V1beta2UserSubject user) {
    _visitables.get("user").remove(this.user);
    if (user != null) {
      this.user = new io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder(user);
      _visitables.get("user").add(this.user);
    }
    return (A) this;
  }

  public java.lang.Boolean hasUser() {
    return this.user != null;
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> withNewUser() {
    return new io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl.UserNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> withNewUserLike(
      io.kubernetes.client.openapi.models.V1beta2UserSubject item) {
    return new io.kubernetes.client.openapi.models.V1beta2SubjectFluentImpl.UserNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> editUser() {
    return withNewUserLike(getUser());
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> editOrNewUser() {
    return withNewUserLike(
        getUser() != null
            ? getUser()
            : new io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> editOrNewUserLike(
      io.kubernetes.client.openapi.models.V1beta2UserSubject item) {
    return withNewUserLike(getUser() != null ? getUser() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2SubjectFluentImpl that = (V1beta2SubjectFluentImpl) o;
    if (group != null ? !group.equals(that.group) : that.group != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (serviceAccount != null
        ? !serviceAccount.equals(that.serviceAccount)
        : that.serviceAccount != null) return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(group, kind, serviceAccount, user, super.hashCode());
  }

  public class GroupNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2GroupSubjectFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    GroupNestedImpl(io.kubernetes.client.openapi.models.V1beta2GroupSubject item) {
      this.builder = new io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder(this, item);
    }

    GroupNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder builder;

    public N and() {
      return (N) V1beta2SubjectFluentImpl.this.withGroup(builder.build());
    }

    public N endGroup() {
      return and();
    }
  }

  public class ServiceAccountNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ServiceAccountNestedImpl(
        io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder(this, item);
    }

    ServiceAccountNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubjectBuilder builder;

    public N and() {
      return (N) V1beta2SubjectFluentImpl.this.withServiceAccount(builder.build());
    }

    public N endServiceAccount() {
      return and();
    }
  }

  public class UserNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1beta2UserSubjectFluentImpl<
          io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    UserNestedImpl(io.kubernetes.client.openapi.models.V1beta2UserSubject item) {
      this.builder = new io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder(this, item);
    }

    UserNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2UserSubjectBuilder builder;

    public N and() {
      return (N) V1beta2SubjectFluentImpl.this.withUser(builder.build());
    }

    public N endUser() {
      return and();
    }
  }
}
