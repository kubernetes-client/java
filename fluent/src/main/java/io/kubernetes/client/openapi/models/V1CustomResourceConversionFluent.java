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
public interface V1CustomResourceConversionFluent<A extends V1CustomResourceConversionFluent<A>>
    extends Fluent<A> {
  public String getStrategy();

  public A withStrategy(String strategy);

  public Boolean hasStrategy();

  /**
   * This method has been deprecated, please use method buildWebhook instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1WebhookConversion getWebhook();

  public V1WebhookConversion buildWebhook();

  public A withWebhook(V1WebhookConversion webhook);

  public Boolean hasWebhook();

  public V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhook();

  public V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhookLike(
      V1WebhookConversion item);

  public V1CustomResourceConversionFluent.WebhookNested<A> editWebhook();

  public V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhook();

  public V1CustomResourceConversionFluent.WebhookNested<A> editOrNewWebhookLike(
      V1WebhookConversion item);

  public interface WebhookNested<N>
      extends Nested<N>,
          V1WebhookConversionFluent<V1CustomResourceConversionFluent.WebhookNested<N>> {
    public N and();

    public N endWebhook();
  }
}
