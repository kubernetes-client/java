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
public interface V1TokenReviewStatusFluent<
        A extends io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAudiences(java.lang.Integer index, java.lang.String item);

  public A setToAudiences(java.lang.Integer index, java.lang.String item);

  public A addToAudiences(java.lang.String... items);

  public A addAllToAudiences(java.util.Collection<java.lang.String> items);

  public A removeFromAudiences(java.lang.String... items);

  public A removeAllFromAudiences(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getAudiences();

  public java.lang.String getAudience(java.lang.Integer index);

  public java.lang.String getFirstAudience();

  public java.lang.String getLastAudience();

  public java.lang.String getMatchingAudience(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingAudience(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withAudiences(java.util.List<java.lang.String> audiences);

  public A withAudiences(java.lang.String... audiences);

  public java.lang.Boolean hasAudiences();

  public A addNewAudience(java.lang.String original);

  public java.lang.Boolean getAuthenticated();

  public A withAuthenticated(java.lang.Boolean authenticated);

  public java.lang.Boolean hasAuthenticated();

  public java.lang.String getError();

  public A withError(java.lang.String error);

  public java.lang.Boolean hasError();

  /** Method is deprecated. use withError instead. */
  @java.lang.Deprecated
  public A withNewError(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildUser instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1UserInfo getUser();

  public io.kubernetes.client.openapi.models.V1UserInfo buildUser();

  public A withUser(io.kubernetes.client.openapi.models.V1UserInfo user);

  public java.lang.Boolean hasUser();

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A> withNewUser();

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A>
      withNewUserLike(io.kubernetes.client.openapi.models.V1UserInfo item);

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A> editUser();

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A>
      editOrNewUser();

  public io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<A>
      editOrNewUserLike(io.kubernetes.client.openapi.models.V1UserInfo item);

  public interface UserNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1UserInfoFluent<
              io.kubernetes.client.openapi.models.V1TokenReviewStatusFluent.UserNested<N>> {
    public N and();

    public N endUser();
  }
}
