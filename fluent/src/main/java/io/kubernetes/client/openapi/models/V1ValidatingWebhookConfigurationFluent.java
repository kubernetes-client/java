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
public interface V1ValidatingWebhookConfigurationFluent<
        A extends V1ValidatingWebhookConfigurationFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public Boolean hasApiVersion();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public V1ValidatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata();

  public V1ValidatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(
      io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public A addToWebhooks(
      Integer index, io.kubernetes.client.openapi.models.V1ValidatingWebhook item);

  public A setToWebhooks(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ValidatingWebhook item);

  public A addToWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items);

  public A addAllToWebhooks(
      Collection<io.kubernetes.client.openapi.models.V1ValidatingWebhook> items);

  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items);

  public A removeAllFromWebhooks(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ValidatingWebhook> items);

  public A removeMatchingFromWebhooks(Predicate<V1ValidatingWebhookBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildWebhooks instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> getWebhooks();

  public java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> buildWebhooks();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildWebhook(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildFirstWebhook();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildLastWebhook();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildMatchingWebhook(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
          predicate);

  public java.lang.Boolean hasMatchingWebhook(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
          predicate);

  public A withWebhooks(
      java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> webhooks);

  public A withWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... webhooks);

  public java.lang.Boolean hasWebhooks();

  public V1ValidatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      addNewWebhookLike(io.kubernetes.client.openapi.models.V1ValidatingWebhook item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      setNewWebhookLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ValidatingWebhook item);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editWebhook(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editFirstWebhook();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editLastWebhook();

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editMatchingWebhook(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
              predicate);

  public interface MetadataNested<N>
      extends Nested<N>,
          V1ObjectMetaFluent<V1ValidatingWebhookConfigurationFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface WebhooksNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ValidatingWebhookFluent<V1ValidatingWebhookConfigurationFluent.WebhooksNested<N>> {
    public N and();

    public N endWebhook();
  }
}
