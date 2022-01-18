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
public interface V1SelfSubjectAccessReviewSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildNonResourceAttributes instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NonResourceAttributes getNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1NonResourceAttributes buildNonResourceAttributes();

  public A withNonResourceAttributes(
      io.kubernetes.client.openapi.models.V1NonResourceAttributes nonResourceAttributes);

  public java.lang.Boolean hasNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      withNewNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      withNewNonResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1NonResourceAttributes item);

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .NonResourceAttributesNested<
          A>
      editOrNewNonResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
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
  public io.kubernetes.client.openapi.models.V1ResourceAttributes getResourceAttributes();

  public io.kubernetes.client.openapi.models.V1ResourceAttributes buildResourceAttributes();

  public A withResourceAttributes(
      io.kubernetes.client.openapi.models.V1ResourceAttributes resourceAttributes);

  public java.lang.Boolean hasResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      withNewResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      withNewResourceAttributesLike(io.kubernetes.client.openapi.models.V1ResourceAttributes item);

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributes();

  public io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
              .ResourceAttributesNested<
          A>
      editOrNewResourceAttributesLike(
          io.kubernetes.client.openapi.models.V1ResourceAttributes item);

  public interface NonResourceAttributesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NonResourceAttributesFluent<
              io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
                      .NonResourceAttributesNested<
                  N>> {
    public N and();

    public N endNonResourceAttributes();
  }

  public interface ResourceAttributesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ResourceAttributesFluent<
              io.kubernetes.client.openapi.models.V1SelfSubjectAccessReviewSpecFluent
                      .ResourceAttributesNested<
                  N>> {
    public N and();

    public N endResourceAttributes();
  }
}
