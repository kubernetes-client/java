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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V1beta2SubjectFluent<A extends V1beta2SubjectFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildGroup instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2GroupSubject getGroup();

  public io.kubernetes.client.openapi.models.V1beta2GroupSubject buildGroup();

  public A withGroup(io.kubernetes.client.openapi.models.V1beta2GroupSubject group);

  public Boolean hasGroup();

  public V1beta2SubjectFluent.GroupNested<A> withNewGroup();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> withNewGroupLike(
      io.kubernetes.client.openapi.models.V1beta2GroupSubject item);

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> editGroup();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> editOrNewGroup();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.GroupNested<A> editOrNewGroupLike(
      io.kubernetes.client.openapi.models.V1beta2GroupSubject item);

  public String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta2ServiceAccountSubject getServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject buildServiceAccount();

  public A withServiceAccount(
      io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject serviceAccount);

  public java.lang.Boolean hasServiceAccount();

  public V1beta2SubjectFluent.ServiceAccountNested<A> withNewServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      withNewServiceAccountLike(
          io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject item);

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      editServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      editOrNewServiceAccount();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.ServiceAccountNested<A>
      editOrNewServiceAccountLike(
          io.kubernetes.client.openapi.models.V1beta2ServiceAccountSubject item);

  /**
   * This method has been deprecated, please use method buildUser instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1beta2UserSubject getUser();

  public io.kubernetes.client.openapi.models.V1beta2UserSubject buildUser();

  public A withUser(io.kubernetes.client.openapi.models.V1beta2UserSubject user);

  public java.lang.Boolean hasUser();

  public V1beta2SubjectFluent.UserNested<A> withNewUser();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> withNewUserLike(
      io.kubernetes.client.openapi.models.V1beta2UserSubject item);

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> editUser();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> editOrNewUser();

  public io.kubernetes.client.openapi.models.V1beta2SubjectFluent.UserNested<A> editOrNewUserLike(
      io.kubernetes.client.openapi.models.V1beta2UserSubject item);

  public interface GroupNested<N>
      extends Nested<N>, V1beta2GroupSubjectFluent<V1beta2SubjectFluent.GroupNested<N>> {
    public N and();

    public N endGroup();
  }

  public interface ServiceAccountNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1beta2ServiceAccountSubjectFluent<V1beta2SubjectFluent.ServiceAccountNested<N>> {
    public N and();

    public N endServiceAccount();
  }

  public interface UserNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1beta2UserSubjectFluent<V1beta2SubjectFluent.UserNested<N>> {
    public N and();

    public N endUser();
  }
}
