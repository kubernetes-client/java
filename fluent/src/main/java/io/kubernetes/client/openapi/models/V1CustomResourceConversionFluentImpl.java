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

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1CustomResourceConversionFluentImpl<A extends V1CustomResourceConversionFluent<A>>
    extends BaseFluent<A> implements V1CustomResourceConversionFluent<A> {
  public V1CustomResourceConversionFluentImpl() {}

  public V1CustomResourceConversionFluentImpl(
      io.kubernetes.client.openapi.models.V1CustomResourceConversion instance) {
    this.withStrategy(instance.getStrategy());

    this.withWebhook(instance.getWebhook());
  }

  private String strategy;
  private V1WebhookConversionBuilder webhook;

  public java.lang.String getStrategy() {
    return this.strategy;
  }

  public A withStrategy(java.lang.String strategy) {
    this.strategy = strategy;
    return (A) this;
  }

  public Boolean hasStrategy() {
    return this.strategy != null;
  }

  /**
   * This method has been deprecated, please use method buildWebhook instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1WebhookConversion getWebhook() {
    return this.webhook != null ? this.webhook.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1WebhookConversion buildWebhook() {
    return this.webhook != null ? this.webhook.build() : null;
  }

  public A withWebhook(io.kubernetes.client.openapi.models.V1WebhookConversion webhook) {
    _visitables.get("webhook").remove(this.webhook);
    if (webhook != null) {
      this.webhook = new V1WebhookConversionBuilder(webhook);
      _visitables.get("webhook").add(this.webhook);
    }
    return (A) this;
  }

  public java.lang.Boolean hasWebhook() {
    return this.webhook != null;
  }

  public V1CustomResourceConversionFluent.WebhookNested<A> withNewWebhook() {
    return new V1CustomResourceConversionFluentImpl.WebhookNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      withNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item) {
    return new V1CustomResourceConversionFluentImpl.WebhookNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      editWebhook() {
    return withNewWebhookLike(getWebhook());
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      editOrNewWebhook() {
    return withNewWebhookLike(
        getWebhook() != null
            ? getWebhook()
            : new io.kubernetes.client.openapi.models.V1WebhookConversionBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<A>
      editOrNewWebhookLike(io.kubernetes.client.openapi.models.V1WebhookConversion item) {
    return withNewWebhookLike(getWebhook() != null ? getWebhook() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceConversionFluentImpl that = (V1CustomResourceConversionFluentImpl) o;
    if (strategy != null ? !strategy.equals(that.strategy) : that.strategy != null) return false;
    if (webhook != null ? !webhook.equals(that.webhook) : that.webhook != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(strategy, webhook, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (strategy != null) {
      sb.append("strategy:");
      sb.append(strategy + ",");
    }
    if (webhook != null) {
      sb.append("webhook:");
      sb.append(webhook);
    }
    sb.append("}");
    return sb.toString();
  }

  class WebhookNestedImpl<N>
      extends V1WebhookConversionFluentImpl<V1CustomResourceConversionFluent.WebhookNested<N>>
      implements io.kubernetes.client.openapi.models.V1CustomResourceConversionFluent.WebhookNested<
              N>,
          Nested<N> {
    WebhookNestedImpl(V1WebhookConversion item) {
      this.builder = new V1WebhookConversionBuilder(this, item);
    }

    WebhookNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1WebhookConversionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1WebhookConversionBuilder builder;

    public N and() {
      return (N) V1CustomResourceConversionFluentImpl.this.withWebhook(builder.build());
    }

    public N endWebhook() {
      return and();
    }
  }
}
