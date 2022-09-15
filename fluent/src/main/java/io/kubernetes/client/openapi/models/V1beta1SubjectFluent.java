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
public interface V1beta1SubjectFluent<A extends V1beta1SubjectFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildGroup instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1GroupSubject getGroup();

  public V1beta1GroupSubject buildGroup();

  public A withGroup(V1beta1GroupSubject group);

  public Boolean hasGroup();

  public V1beta1SubjectFluent.GroupNested<A> withNewGroup();

  public V1beta1SubjectFluent.GroupNested<A> withNewGroupLike(V1beta1GroupSubject item);

  public V1beta1SubjectFluent.GroupNested<A> editGroup();

  public V1beta1SubjectFluent.GroupNested<A> editOrNewGroup();

  public V1beta1SubjectFluent.GroupNested<A> editOrNewGroupLike(V1beta1GroupSubject item);

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildServiceAccount instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1ServiceAccountSubject getServiceAccount();

  public V1beta1ServiceAccountSubject buildServiceAccount();

  public A withServiceAccount(V1beta1ServiceAccountSubject serviceAccount);

  public Boolean hasServiceAccount();

  public V1beta1SubjectFluent.ServiceAccountNested<A> withNewServiceAccount();

  public V1beta1SubjectFluent.ServiceAccountNested<A> withNewServiceAccountLike(
      V1beta1ServiceAccountSubject item);

  public V1beta1SubjectFluent.ServiceAccountNested<A> editServiceAccount();

  public V1beta1SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccount();

  public V1beta1SubjectFluent.ServiceAccountNested<A> editOrNewServiceAccountLike(
      V1beta1ServiceAccountSubject item);

  /**
   * This method has been deprecated, please use method buildUser instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta1UserSubject getUser();

  public V1beta1UserSubject buildUser();

  public A withUser(V1beta1UserSubject user);

  public Boolean hasUser();

  public V1beta1SubjectFluent.UserNested<A> withNewUser();

  public V1beta1SubjectFluent.UserNested<A> withNewUserLike(V1beta1UserSubject item);

  public V1beta1SubjectFluent.UserNested<A> editUser();

  public V1beta1SubjectFluent.UserNested<A> editOrNewUser();

  public V1beta1SubjectFluent.UserNested<A> editOrNewUserLike(V1beta1UserSubject item);

  public interface GroupNested<N>
      extends Nested<N>, V1beta1GroupSubjectFluent<V1beta1SubjectFluent.GroupNested<N>> {
    public N and();

    public N endGroup();
  }

  public interface ServiceAccountNested<N>
      extends Nested<N>,
          V1beta1ServiceAccountSubjectFluent<V1beta1SubjectFluent.ServiceAccountNested<N>> {
    public N and();

    public N endServiceAccount();
  }

  public interface UserNested<N>
      extends Nested<N>, V1beta1UserSubjectFluent<V1beta1SubjectFluent.UserNested<N>> {
    public N and();

    public N endUser();
  }
}
