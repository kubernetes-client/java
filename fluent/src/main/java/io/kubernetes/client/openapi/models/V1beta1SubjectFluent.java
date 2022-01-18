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
public interface V1beta1SubjectFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1SubjectFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildGroup instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1GroupSubject getGroup();

  public io.kubernetes.client.openapi.models.V1beta1GroupSubject buildGroup();

  public A withGroup(io.kubernetes.client.openapi.models.V1beta1GroupSubject group);

  public java.lang.Boolean hasGroup();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> withNewGroup();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> withNewGroupLike(
      io.kubernetes.client.openapi.models.V1beta1GroupSubject item);

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> editGroup();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> editOrNewGroup();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<A> editOrNewGroupLike(
      io.kubernetes.client.openapi.models.V1beta1GroupSubject item);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject getServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject buildServiceAccount();

  public A withServiceAccount(
      io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject serviceAccount);

  public java.lang.Boolean hasServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A>
      withNewServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A>
      withNewServiceAccountLike(
          io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject item);

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A>
      editServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A>
      editOrNewServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<A>
      editOrNewServiceAccountLike(
          io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject item);

  /**
   * This method has been deprecated, please use method buildUser instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1beta1UserSubject getUser();

  public io.kubernetes.client.openapi.models.V1beta1UserSubject buildUser();

  public A withUser(io.kubernetes.client.openapi.models.V1beta1UserSubject user);

  public java.lang.Boolean hasUser();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> withNewUser();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> withNewUserLike(
      io.kubernetes.client.openapi.models.V1beta1UserSubject item);

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> editUser();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> editOrNewUser();

  public io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<A> editOrNewUserLike(
      io.kubernetes.client.openapi.models.V1beta1UserSubject item);

  public interface GroupNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1GroupSubjectFluent<
              io.kubernetes.client.openapi.models.V1beta1SubjectFluent.GroupNested<N>> {
    public N and();

    public N endGroup();
  }

  public interface ServiceAccountNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<
              io.kubernetes.client.openapi.models.V1beta1SubjectFluent.ServiceAccountNested<N>> {
    public N and();

    public N endServiceAccount();
  }

  public interface UserNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1beta1UserSubjectFluent<
              io.kubernetes.client.openapi.models.V1beta1SubjectFluent.UserNested<N>> {
    public N and();

    public N endUser();
  }
}
