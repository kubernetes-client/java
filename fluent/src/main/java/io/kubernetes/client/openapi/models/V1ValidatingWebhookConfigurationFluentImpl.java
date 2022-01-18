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

import java.util.Iterator;
import java.util.List;

/** Generated */
public class V1ValidatingWebhookConfigurationFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent<A> {
  public V1ValidatingWebhookConfigurationFluentImpl() {}

  public V1ValidatingWebhookConfigurationFluentImpl(
      io.kubernetes.client.openapi.models.V1ValidatingWebhookConfiguration instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withWebhooks(instance.getWebhooks());
  }

  private java.lang.String apiVersion;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
      webhooks;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public java.lang.Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original) {
    return (A) withApiVersion(new String(original));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original) {
    return (A) withKind(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluentImpl
        .MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluentImpl
        .MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
          A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public A addToWebhooks(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ValidatingWebhook item) {
    if (this.webhooks == null) {
      this.webhooks =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder =
        new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(item);
    _visitables
        .get("webhooks")
        .add(index >= 0 ? index : _visitables.get("webhooks").size(), builder);
    this.webhooks.add(index >= 0 ? index : webhooks.size(), builder);
    return (A) this;
  }

  public A setToWebhooks(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ValidatingWebhook item) {
    if (this.webhooks == null) {
      this.webhooks =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder =
        new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(item);
    if (index < 0 || index >= _visitables.get("webhooks").size()) {
      _visitables.get("webhooks").add(builder);
    } else {
      _visitables.get("webhooks").set(index, builder);
    }
    if (index < 0 || index >= webhooks.size()) {
      webhooks.add(builder);
    } else {
      webhooks.set(index, builder);
    }
    return (A) this;
  }

  public A addToWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items) {
    if (this.webhooks == null) {
      this.webhooks =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ValidatingWebhook item : items) {
      io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder =
          new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(item);
      _visitables.get("webhooks").add(builder);
      this.webhooks.add(builder);
    }
    return (A) this;
  }

  public A addAllToWebhooks(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ValidatingWebhook> items) {
    if (this.webhooks == null) {
      this.webhooks =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ValidatingWebhook item : items) {
      io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder =
          new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(item);
      _visitables.get("webhooks").add(builder);
      this.webhooks.add(builder);
    }
    return (A) this;
  }

  public A removeFromWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... items) {
    for (io.kubernetes.client.openapi.models.V1ValidatingWebhook item : items) {
      io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder =
          new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(item);
      _visitables.get("webhooks").remove(builder);
      if (this.webhooks != null) {
        this.webhooks.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromWebhooks(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ValidatingWebhook> items) {
    for (io.kubernetes.client.openapi.models.V1ValidatingWebhook item : items) {
      io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder =
          new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(item);
      _visitables.get("webhooks").remove(builder);
      if (this.webhooks != null) {
        this.webhooks.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromWebhooks(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
          predicate) {
    if (webhooks == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder> each =
        webhooks.iterator();
    final List visitables = _visitables.get("webhooks");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildWebhooks instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> getWebhooks() {
    return webhooks != null ? build(webhooks) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> buildWebhooks() {
    return webhooks != null ? build(webhooks) : null;
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildWebhook(
      java.lang.Integer index) {
    return this.webhooks.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildFirstWebhook() {
    return this.webhooks.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildLastWebhook() {
    return this.webhooks.get(webhooks.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhook buildMatchingWebhook(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder item : webhooks) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingWebhook(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder item : webhooks) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withWebhooks(
      java.util.List<io.kubernetes.client.openapi.models.V1ValidatingWebhook> webhooks) {
    if (this.webhooks != null) {
      _visitables.get("webhooks").removeAll(this.webhooks);
    }
    if (webhooks != null) {
      this.webhooks = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ValidatingWebhook item : webhooks) {
        this.addToWebhooks(item);
      }
    } else {
      this.webhooks = null;
    }
    return (A) this;
  }

  public A withWebhooks(io.kubernetes.client.openapi.models.V1ValidatingWebhook... webhooks) {
    if (this.webhooks != null) {
      this.webhooks.clear();
    }
    if (webhooks != null) {
      for (io.kubernetes.client.openapi.models.V1ValidatingWebhook item : webhooks) {
        this.addToWebhooks(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasWebhooks() {
    return webhooks != null && !webhooks.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      addNewWebhook() {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluentImpl
        .WebhooksNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      addNewWebhookLike(io.kubernetes.client.openapi.models.V1ValidatingWebhook item) {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluentImpl
        .WebhooksNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      setNewWebhookLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ValidatingWebhook item) {
    return new io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluentImpl
        .WebhooksNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editWebhook(java.lang.Integer index) {
    if (webhooks.size() <= index)
      throw new RuntimeException("Can't edit webhooks. Index exceeds size.");
    return setNewWebhookLike(index, buildWebhook(index));
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editFirstWebhook() {
    if (webhooks.size() == 0)
      throw new RuntimeException("Can't edit first webhooks. The list is empty.");
    return setNewWebhookLike(0, buildWebhook(0));
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editLastWebhook() {
    int index = webhooks.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last webhooks. The list is empty.");
    return setNewWebhookLike(index, buildWebhook(index));
  }

  public io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
          A>
      editMatchingWebhook(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < webhooks.size(); i++) {
      if (predicate.test(webhooks.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching webhooks. No match found.");
    return setNewWebhookLike(index, buildWebhook(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ValidatingWebhookConfigurationFluentImpl that =
        (V1ValidatingWebhookConfigurationFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (webhooks != null ? !webhooks.equals(that.webhooks) : that.webhooks != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, kind, metadata, webhooks, super.hashCode());
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.MetadataNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent
                  .MetadataNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1ValidatingWebhookConfigurationFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class WebhooksNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ValidatingWebhookFluentImpl<
          io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent.WebhooksNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1ValidatingWebhookConfigurationFluent
                  .WebhooksNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    WebhooksNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ValidatingWebhook item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(this, item);
    }

    WebhooksNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ValidatingWebhookBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N)
          V1ValidatingWebhookConfigurationFluentImpl.this.setToWebhooks(index, builder.build());
    }

    public N endWebhook() {
      return and();
    }
  }
}
