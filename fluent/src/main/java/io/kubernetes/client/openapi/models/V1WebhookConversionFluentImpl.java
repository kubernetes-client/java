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
public class V1WebhookConversionFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1WebhookConversionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1WebhookConversionFluent<A> {
  public V1WebhookConversionFluentImpl() {}

  public V1WebhookConversionFluentImpl(
      io.kubernetes.client.openapi.models.V1WebhookConversion instance) {
    this.withClientConfig(instance.getClientConfig());

    this.withConversionReviewVersions(instance.getConversionReviewVersions());
  }

  private io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigBuilder
      clientConfig;
  private java.util.List<java.lang.String> conversionReviewVersions;

  /**
   * This method has been deprecated, please use method buildClientConfig instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig getClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }

  public io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig
      buildClientConfig() {
    return this.clientConfig != null ? this.clientConfig.build() : null;
  }

  public A withClientConfig(
      io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig clientConfig) {
    _visitables.get("clientConfig").remove(this.clientConfig);
    if (clientConfig != null) {
      this.clientConfig =
          new io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigBuilder(
              clientConfig);
      _visitables.get("clientConfig").add(this.clientConfig);
    }
    return (A) this;
  }

  public java.lang.Boolean hasClientConfig() {
    return this.clientConfig != null;
  }

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      withNewClientConfig() {
    return new io.kubernetes.client.openapi.models.V1WebhookConversionFluentImpl
        .ClientConfigNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      withNewClientConfigLike(
          io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig item) {
    return new io.kubernetes.client.openapi.models.V1WebhookConversionFluentImpl
        .ClientConfigNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      editClientConfig() {
    return withNewClientConfigLike(getClientConfig());
  }

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      editOrNewClientConfig() {
    return withNewClientConfigLike(
        getClientConfig() != null
            ? getClientConfig()
            : new io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<A>
      editOrNewClientConfigLike(
          io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig item) {
    return withNewClientConfigLike(getClientConfig() != null ? getClientConfig() : item);
  }

  public A addToConversionReviewVersions(java.lang.Integer index, java.lang.String item) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    this.conversionReviewVersions.add(index, item);
    return (A) this;
  }

  public A setToConversionReviewVersions(java.lang.Integer index, java.lang.String item) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    this.conversionReviewVersions.set(index, item);
    return (A) this;
  }

  public A addToConversionReviewVersions(java.lang.String... items) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.conversionReviewVersions.add(item);
    }
    return (A) this;
  }

  public A addAllToConversionReviewVersions(java.util.Collection<java.lang.String> items) {
    if (this.conversionReviewVersions == null) {
      this.conversionReviewVersions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.conversionReviewVersions.add(item);
    }
    return (A) this;
  }

  public A removeFromConversionReviewVersions(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.conversionReviewVersions != null) {
        this.conversionReviewVersions.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromConversionReviewVersions(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.conversionReviewVersions != null) {
        this.conversionReviewVersions.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getConversionReviewVersions() {
    return this.conversionReviewVersions;
  }

  public java.lang.String getConversionReviewVersion(java.lang.Integer index) {
    return this.conversionReviewVersions.get(index);
  }

  public java.lang.String getFirstConversionReviewVersion() {
    return this.conversionReviewVersions.get(0);
  }

  public java.lang.String getLastConversionReviewVersion() {
    return this.conversionReviewVersions.get(conversionReviewVersions.size() - 1);
  }

  public java.lang.String getMatchingConversionReviewVersion(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : conversionReviewVersions) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingConversionReviewVersion(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : conversionReviewVersions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withConversionReviewVersions(java.util.List<java.lang.String> conversionReviewVersions) {
    if (conversionReviewVersions != null) {
      this.conversionReviewVersions = new java.util.ArrayList();
      for (java.lang.String item : conversionReviewVersions) {
        this.addToConversionReviewVersions(item);
      }
    } else {
      this.conversionReviewVersions = null;
    }
    return (A) this;
  }

  public A withConversionReviewVersions(java.lang.String... conversionReviewVersions) {
    if (this.conversionReviewVersions != null) {
      this.conversionReviewVersions.clear();
    }
    if (conversionReviewVersions != null) {
      for (java.lang.String item : conversionReviewVersions) {
        this.addToConversionReviewVersions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasConversionReviewVersions() {
    return conversionReviewVersions != null && !conversionReviewVersions.isEmpty();
  }

  public A addNewConversionReviewVersion(java.lang.String original) {
    return (A) addToConversionReviewVersions(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1WebhookConversionFluentImpl that = (V1WebhookConversionFluentImpl) o;
    if (clientConfig != null ? !clientConfig.equals(that.clientConfig) : that.clientConfig != null)
      return false;
    if (conversionReviewVersions != null
        ? !conversionReviewVersions.equals(that.conversionReviewVersions)
        : that.conversionReviewVersions != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(clientConfig, conversionReviewVersions, super.hashCode());
  }

  public class ClientConfigNestedImpl<N>
      extends io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigFluentImpl<
          io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<N>>
      implements io.kubernetes.client.openapi.models.V1WebhookConversionFluent.ClientConfigNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ClientConfigNestedImpl(
        io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfig item) {
      this.builder =
          new io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigBuilder(
              this, item);
    }

    ClientConfigNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigBuilder(this);
    }

    io.kubernetes.client.openapi.models.ApiextensionsV1WebhookClientConfigBuilder builder;

    public N and() {
      return (N) V1WebhookConversionFluentImpl.this.withClientConfig(builder.build());
    }

    public N endClientConfig() {
      return and();
    }
  }
}
