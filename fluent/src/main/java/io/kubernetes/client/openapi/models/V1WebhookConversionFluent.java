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
public interface V1WebhookConversionFluent<A extends V1WebhookConversionFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public ApiextensionsV1WebhookClientConfig getClientConfig();

  public ApiextensionsV1WebhookClientConfig buildClientConfig();

  public A withClientConfig(ApiextensionsV1WebhookClientConfig clientConfig);

  public Boolean hasClientConfig();

  public V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfig();

  public V1WebhookConversionFluent.ClientConfigNested<A> withNewClientConfigLike(
      ApiextensionsV1WebhookClientConfig item);

  public V1WebhookConversionFluent.ClientConfigNested<A> editClientConfig();

  public V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfig();

  public V1WebhookConversionFluent.ClientConfigNested<A> editOrNewClientConfigLike(
      ApiextensionsV1WebhookClientConfig item);

  public A addToConversionReviewVersions(Integer index, String item);

  public A setToConversionReviewVersions(Integer index, String item);

  public A addToConversionReviewVersions(java.lang.String... items);

  public A addAllToConversionReviewVersions(Collection<String> items);

  public A removeFromConversionReviewVersions(java.lang.String... items);

  public A removeAllFromConversionReviewVersions(Collection<String> items);

  public List<String> getConversionReviewVersions();

  public String getConversionReviewVersion(Integer index);

  public String getFirstConversionReviewVersion();

  public String getLastConversionReviewVersion();

  public String getMatchingConversionReviewVersion(Predicate<String> predicate);

  public Boolean hasMatchingConversionReviewVersion(Predicate<String> predicate);

  public A withConversionReviewVersions(List<String> conversionReviewVersions);

  public A withConversionReviewVersions(java.lang.String... conversionReviewVersions);

  public Boolean hasConversionReviewVersions();

  public interface ClientConfigNested<N>
      extends Nested<N>,
          ApiextensionsV1WebhookClientConfigFluent<
              V1WebhookConversionFluent.ClientConfigNested<N>> {
    public N and();

    public N endClientConfig();
  }
}
