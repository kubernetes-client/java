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
public interface V1MutatingWebhookConfigurationFluent<
        A extends io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A>
      withNewMetadata();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public A addToWebhooks(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1MutatingWebhook item);

  public A setToWebhooks(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1MutatingWebhook item);

  public A addToWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items);

  public A addAllToWebhooks(
      java.util.Collection<io.kubernetes.client.openapi.models.V1MutatingWebhook> items);

  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items);

  public A removeAllFromWebhooks(
      java.util.Collection<io.kubernetes.client.openapi.models.V1MutatingWebhook> items);

  public A removeMatchingFromWebhooks(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildWebhooks instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1MutatingWebhook> getWebhooks();

  public java.util.List<io.kubernetes.client.openapi.models.V1MutatingWebhook> buildWebhooks();

  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildWebhook(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildFirstWebhook();

  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildLastWebhook();

  public io.kubernetes.client.openapi.models.V1MutatingWebhook buildMatchingWebhook(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>
          predicate);

  public java.lang.Boolean hasMatchingWebhook(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>
          predicate);

  public A withWebhooks(
      java.util.List<io.kubernetes.client.openapi.models.V1MutatingWebhook> webhooks);

  public A withWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... webhooks);

  public java.lang.Boolean hasWebhooks();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A>
      addNewWebhook();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A>
      addNewWebhookLike(io.kubernetes.client.openapi.models.V1MutatingWebhook item);

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A>
      setNewWebhookLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1MutatingWebhook item);

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A>
      editWebhook(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A>
      editFirstWebhook();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A>
      editLastWebhook();

  public io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent.WebhooksNested<A>
      editMatchingWebhook(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1MutatingWebhookBuilder>
              predicate);

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent
                      .MetadataNested<
                  N>> {
    public N and();

    public N endMetadata();
  }

  public interface WebhooksNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1MutatingWebhookFluent<
              io.kubernetes.client.openapi.models.V1MutatingWebhookConfigurationFluent
                      .WebhooksNested<
                  N>> {
    public N and();

    public N endWebhook();
  }
}
