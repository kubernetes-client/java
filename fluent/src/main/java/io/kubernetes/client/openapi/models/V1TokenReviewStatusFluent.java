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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1TokenReviewStatusFluent<A extends V1TokenReviewStatusFluent<A>>
    extends Fluent<A> {
  public A addToAudiences(Integer index, String item);

  public A setToAudiences(java.lang.Integer index, java.lang.String item);

  public A addToAudiences(java.lang.String... items);

  public A addAllToAudiences(Collection<java.lang.String> items);

  public A removeFromAudiences(java.lang.String... items);

  public A removeAllFromAudiences(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getAudiences();

  public java.lang.String getAudience(java.lang.Integer index);

  public java.lang.String getFirstAudience();

  public java.lang.String getLastAudience();

  public java.lang.String getMatchingAudience(Predicate<java.lang.String> predicate);

  public Boolean hasMatchingAudience(java.util.function.Predicate<java.lang.String> predicate);

  public A withAudiences(java.util.List<java.lang.String> audiences);

  public A withAudiences(java.lang.String... audiences);

  public java.lang.Boolean hasAudiences();

  public java.lang.Boolean getAuthenticated();

  public A withAuthenticated(java.lang.Boolean authenticated);

  public java.lang.Boolean hasAuthenticated();

  public java.lang.String getError();

  public A withError(java.lang.String error);

  public java.lang.Boolean hasError();

  /**
   * This method has been deprecated, please use method buildUser instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1UserInfo getUser();

  public io.kubernetes.client.openapi.models.V1UserInfo buildUser();

  public A withUser(io.kubernetes.client.openapi.models.V1UserInfo user);

  public java.lang.Boolean hasUser();

  public V1TokenReviewStatusFluent.UserNested<A> withNewUser();

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A>
      withNewUserLike(io.kubernetes.client.openapi.models.V1UserInfo item);

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A> editUser();

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A>
      editOrNewUser();

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A>
      editOrNewUserLike(io.kubernetes.client.openapi.models.V1UserInfo item);

  public A withAuthenticated();

  public interface UserNested<N>
      extends Nested<N>, V1UserInfoFluent<V1TokenReviewStatusFluent.UserNested<N>> {
    public N and();

    public N endUser();
  }
}
