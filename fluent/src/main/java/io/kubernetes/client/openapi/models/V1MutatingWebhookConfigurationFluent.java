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
public interface V1MutatingWebhookConfigurationFluent<
        A extends V1MutatingWebhookConfigurationFluent<A>>
    extends Fluent<A> {
  public String getApiVersion();

  public A withApiVersion(String apiVersion);

  public Boolean hasApiVersion();

  public String getKind();

  public A withKind(String kind);

  public Boolean hasKind();

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata();

  public V1ObjectMeta buildMetadata();

  public A withMetadata(V1ObjectMeta metadata);

  public Boolean hasMetadata();

  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadata();

  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> withNewMetadataLike(
      V1ObjectMeta item);

  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> editMetadata();

  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadata();

  public V1MutatingWebhookConfigurationFluent.MetadataNested<A> editOrNewMetadataLike(
      V1ObjectMeta item);

  public A addToWebhooks(Integer index, V1MutatingWebhook item);

  public A setToWebhooks(Integer index, V1MutatingWebhook item);

  public A addToWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items);

  public A addAllToWebhooks(Collection<V1MutatingWebhook> items);

  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... items);

  public A removeAllFromWebhooks(Collection<V1MutatingWebhook> items);

  public A removeMatchingFromWebhooks(Predicate<V1MutatingWebhookBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildWebhooks instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1MutatingWebhook> getWebhooks();

  public List<V1MutatingWebhook> buildWebhooks();

  public V1MutatingWebhook buildWebhook(Integer index);

  public V1MutatingWebhook buildFirstWebhook();

  public V1MutatingWebhook buildLastWebhook();

  public V1MutatingWebhook buildMatchingWebhook(Predicate<V1MutatingWebhookBuilder> predicate);

  public Boolean hasMatchingWebhook(Predicate<V1MutatingWebhookBuilder> predicate);

  public A withWebhooks(List<V1MutatingWebhook> webhooks);

  public A withWebhooks(io.kubernetes.client.openapi.models.V1MutatingWebhook... webhooks);

  public Boolean hasWebhooks();

  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhook();

  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> addNewWebhookLike(
      V1MutatingWebhook item);

  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> setNewWebhookLike(
      Integer index, V1MutatingWebhook item);

  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editWebhook(Integer index);

  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editFirstWebhook();

  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editLastWebhook();

  public V1MutatingWebhookConfigurationFluent.WebhooksNested<A> editMatchingWebhook(
      Predicate<V1MutatingWebhookBuilder> predicate);

  public interface MetadataNested<N>
      extends Nested<N>,
          V1ObjectMetaFluent<V1MutatingWebhookConfigurationFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface WebhooksNested<N>
      extends Nested<N>,
          V1MutatingWebhookFluent<V1MutatingWebhookConfigurationFluent.WebhooksNested<N>> {
    public N and();

    public N endWebhook();
  }
}
