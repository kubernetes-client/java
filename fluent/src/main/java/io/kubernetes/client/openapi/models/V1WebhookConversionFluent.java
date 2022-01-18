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
public interface V1WebhookConversionFluent<
        A extends io.kubernetes.client.openapi.models.V1WebhookConversionFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig getClientConfig();

  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig buildClientConfig();

  public A withClientConfig(
      io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig clientConfig);

  public java.lang.Boolean hasClientConfig();

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      withNewClientConfig();

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      withNewClientConfigLike(
          io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig item);

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      editClientConfig();

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      editOrNewClientConfig();

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      editOrNewClientConfigLike(
          io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig item);

  public A addToConversionReviewVersions(java.lang.Integer index, java.lang.String item);

  public A setToConversionReviewVersions(java.lang.Integer index, java.lang.String item);

  public A addToConversionReviewVersions(java.lang.String... items);

  public A addAllToConversionReviewVersions(java.util.Collection<java.lang.String> items);

  public A removeFromConversionReviewVersions(java.lang.String... items);

  public A removeAllFromConversionReviewVersions(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getConversionReviewVersions();

  public java.lang.String getConversionReviewVersion(java.lang.Integer index);

  public java.lang.String getFirstConversionReviewVersion();

  public java.lang.String getLastConversionReviewVersion();

  public java.lang.String getMatchingConversionReviewVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingConversionReviewVersion(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withConversionReviewVersions(java.util.List<java.lang.String> conversionReviewVersions);

  public A withConversionReviewVersions(java.lang.String... conversionReviewVersions);

  public java.lang.Boolean hasConversionReviewVersions();

  public A addNewConversionReviewVersion(java.lang.String original);

  public interface ClientConfigNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluent<
              io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<N>> {
    public N and();

    public N endClientConfig();
  }
}
