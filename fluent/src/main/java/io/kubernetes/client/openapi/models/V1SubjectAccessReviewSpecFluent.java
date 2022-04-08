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
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1SubjectAccessReviewSpecFluent<A extends V1SubjectAccessReviewSpecFluent<A>>
    extends Fluent<A> {
  public A addToExtra(String key, List<java.lang.String> value);

  public A addToExtra(Map<java.lang.String, java.util.List<java.lang.String>> map);

  public A removeFromExtra(java.lang.String key);

  public A removeFromExtra(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map);

  public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getExtra();

  public <K, V> A withExtra(
      java.util.Map<java.lang.String, java.util.List<java.lang.String>> extra);

  public Boolean hasExtra();

  public A addToGroups(Integer index, java.lang.String item);

  public A setToGroups(java.lang.Integer index, java.lang.String item);

  public A addToGroups(java.lang.String... items);

  public A addAllToGroups(Collection<java.lang.String> items);

  public A removeFromGroups(java.lang.String... items);

  public A removeAllFromGroups(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getGroups();

  public java.lang.String getGroup(java.lang.Integer index);

  public java.lang.String getFirstGroup();

  public java.lang.String getLastGroup();

  public java.lang.String getMatchingGroup(Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingGroup(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withGroups(java.util.List<java.lang.String> groups);

  public A withGroups(java.lang.String... groups);

  public java.lang.Boolean hasGroups();

  /**
   * This method has been deprecated, please use method buildNonResourceAttributes instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1NonResourceAttributes getNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1NonResourceAttributes buildNonResourceAttributes();

  public A withNonResourceAttributes(
      io.kubernetes.client.openapi.models.V1NonResourceAttributes nonResourceAttributes);

  public java.lang.Boolean hasNonResourceAttributes();

  public V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<A>
      withNewNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      withNewNonResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1NonResourceAttributes item);

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editOrNewNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editOrNewNonResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1NonResourceAttributes item);

  /**
   * This method has been deprecated, please use method buildResourceAttributes instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ResourceAttributes getResourceAttributes();

  public io.kubernetes.client.openapi.models.V1ResourceAttributes buildResourceAttributes();

  public A withResourceAttributes(
      io.kubernetes.client.openapi.models.V1ResourceAttributes resourceAttributes);

  public java.lang.Boolean hasResourceAttributes();

  public V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<A> withNewResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      withNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1ResourceAttributes item);

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1ResourceAttributes item);

  public java.lang.String getUid();

  public A withUid(java.lang.String uid);

  public java.lang.Boolean hasUid();

  public java.lang.String getUser();

  public A withUser(java.lang.String user);

  public java.lang.Boolean hasUser();

  public interface NonResourceAttributesNested<N>
      extends Nested<N>,
          V1NonResourceAttributesFluent<
              V1SubjectAccessReviewSpecFluent.NonResourceAttributesNested<N>> {
    public N and();

    public N endNonResourceAttributes();
  }

  public interface ResourceAttributesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ResourceAttributesFluent<V1SubjectAccessReviewSpecFluent.ResourceAttributesNested<N>> {
    public N and();

    public N endResourceAttributes();
  }
}
