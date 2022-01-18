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
public interface V1CustomResourceConversionFluent<
        A extends io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getStrategy();

  public A withStrategy(java.lang.String strategy);

  public java.lang.Boolean hasStrategy();

  /** Method is deprecated. use withStrategy instead. */
  @java.lang.Deprecated
  public A withNewStrategy(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildWebhook instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1WebhookConversion getWebhook();

  public io.kubernetes.client.openapi.models.V1WebhookConversion buildWebhook();

  public A withWebhook(io.kubernetes.client.openapi.models.V1WebhookConversion webhook);

  public java.lang.Boolean hasWebhook();

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      withNewWebhook();

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      withNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item);

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      editWebhook();

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      editOrNewWebhook();

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      editOrNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item);

  public interface WebhookNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1WebhookConversionFluent<
              io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<
                  N>> {
    public N and();

    public N endWebhook();
  }
}
