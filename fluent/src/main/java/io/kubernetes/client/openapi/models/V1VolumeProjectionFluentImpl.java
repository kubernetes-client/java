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
public class V1VolumeProjectionFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1VolumeProjectionFluent<A> {
  public V1VolumeProjectionFluentImpl() {}

  public V1VolumeProjectionFluentImpl(
      io.kubernetes.client.openapi.models.V1VolumeProjection instance) {
    this.withConfigMap(instance.getConfigMap());

    this.withDownwardAPI(instance.getDownwardAPI());

    this.withSecret(instance.getSecret());

    this.withServiceAccountToken(instance.getServiceAccountToken());
  }

  private io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder configMap;
  private io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder downwardAPI;
  private io.kubernetes.client.openapi.models.V1SecretProjectionBuilder secret;
  private io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder
      serviceAccountToken;

  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ConfigMapProjection getConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapProjection buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }

  public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapProjection configMap) {
    _visitables.get("configMap").remove(this.configMap);
    if (configMap != null) {
      this.configMap =
          new io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder(configMap);
      _visitables.get("configMap").add(this.configMap);
    }
    return (A) this;
  }

  public java.lang.Boolean hasConfigMap() {
    return this.configMap != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A>
      withNewConfigMap() {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl
        .ConfigMapNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A>
      withNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapProjection item) {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl.ConfigMapNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A>
      editConfigMap() {
    return withNewConfigMapLike(getConfigMap());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A>
      editOrNewConfigMap() {
    return withNewConfigMapLike(
        getConfigMap() != null
            ? getConfigMap()
            : new io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<A>
      editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapProjection item) {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap() : item);
  }

  /**
   * This method has been deprecated, please use method buildDownwardAPI instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DownwardAPIProjection getDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIProjection buildDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }

  public A withDownwardAPI(
      io.kubernetes.client.openapi.models.V1DownwardAPIProjection downwardAPI) {
    _visitables.get("downwardAPI").remove(this.downwardAPI);
    if (downwardAPI != null) {
      this.downwardAPI =
          new io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder(downwardAPI);
      _visitables.get("downwardAPI").add(this.downwardAPI);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A>
      withNewDownwardAPI() {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl
        .DownwardAPINestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A>
      withNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIProjection item) {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl
        .DownwardAPINestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A>
      editDownwardAPI() {
    return withNewDownwardAPILike(getDownwardAPI());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A>
      editOrNewDownwardAPI() {
    return withNewDownwardAPILike(
        getDownwardAPI() != null
            ? getDownwardAPI()
            : new io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<A>
      editOrNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIProjection item) {
    return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI() : item);
  }

  /**
   * This method has been deprecated, please use method buildSecret instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretProjection getSecret() {
    return this.secret != null ? this.secret.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretProjection buildSecret() {
    return this.secret != null ? this.secret.build() : null;
  }

  public A withSecret(io.kubernetes.client.openapi.models.V1SecretProjection secret) {
    _visitables.get("secret").remove(this.secret);
    if (secret != null) {
      this.secret = new io.kubernetes.client.openapi.models.V1SecretProjectionBuilder(secret);
      _visitables.get("secret").add(this.secret);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecret() {
    return this.secret != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A>
      withNewSecret() {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl.SecretNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A>
      withNewSecretLike(io.kubernetes.client.openapi.models.V1SecretProjection item) {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl.SecretNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A> editSecret() {
    return withNewSecretLike(getSecret());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A>
      editOrNewSecret() {
    return withNewSecretLike(
        getSecret() != null
            ? getSecret()
            : new io.kubernetes.client.openapi.models.V1SecretProjectionBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<A>
      editOrNewSecretLike(io.kubernetes.client.openapi.models.V1SecretProjection item) {
    return withNewSecretLike(getSecret() != null ? getSecret() : item);
  }

  /**
   * This method has been deprecated, please use method buildServiceAccountToken instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection
      getServiceAccountToken() {
    return this.serviceAccountToken != null ? this.serviceAccountToken.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection
      buildServiceAccountToken() {
    return this.serviceAccountToken != null ? this.serviceAccountToken.build() : null;
  }

  public A withServiceAccountToken(
      io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection serviceAccountToken) {
    _visitables.get("serviceAccountToken").remove(this.serviceAccountToken);
    if (serviceAccountToken != null) {
      this.serviceAccountToken =
          new io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder(
              serviceAccountToken);
      _visitables.get("serviceAccountToken").add(this.serviceAccountToken);
    }
    return (A) this;
  }

  public java.lang.Boolean hasServiceAccountToken() {
    return this.serviceAccountToken != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A>
      withNewServiceAccountToken() {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl
        .ServiceAccountTokenNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A>
      withNewServiceAccountTokenLike(
          io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection item) {
    return new io.kubernetes.client.openapi.models.V1VolumeProjectionFluentImpl
        .ServiceAccountTokenNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A>
      editServiceAccountToken() {
    return withNewServiceAccountTokenLike(getServiceAccountToken());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A>
      editOrNewServiceAccountToken() {
    return withNewServiceAccountTokenLike(
        getServiceAccountToken() != null
            ? getServiceAccountToken()
            : new io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<A>
      editOrNewServiceAccountTokenLike(
          io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection item) {
    return withNewServiceAccountTokenLike(
        getServiceAccountToken() != null ? getServiceAccountToken() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeProjectionFluentImpl that = (V1VolumeProjectionFluentImpl) o;
    if (configMap != null ? !configMap.equals(that.configMap) : that.configMap != null)
      return false;
    if (downwardAPI != null ? !downwardAPI.equals(that.downwardAPI) : that.downwardAPI != null)
      return false;
    if (secret != null ? !secret.equals(that.secret) : that.secret != null) return false;
    if (serviceAccountToken != null
        ? !serviceAccountToken.equals(that.serviceAccountToken)
        : that.serviceAccountToken != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        configMap, downwardAPI, secret, serviceAccountToken, super.hashCode());
  }

  public class ConfigMapNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ConfigMapProjectionFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ConfigMapNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConfigMapNestedImpl(io.kubernetes.client.openapi.models.V1ConfigMapProjection item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder(this, item);
    }

    ConfigMapNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ConfigMapProjectionBuilder builder;

    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withConfigMap(builder.build());
    }

    public N endConfigMap() {
      return and();
    }
  }

  public class DownwardAPINestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1DownwardAPIProjectionFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.DownwardAPINested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    DownwardAPINestedImpl(io.kubernetes.client.openapi.models.V1DownwardAPIProjection item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder(this, item);
    }

    DownwardAPINestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1DownwardAPIProjectionBuilder builder;

    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withDownwardAPI(builder.build());
    }

    public N endDownwardAPI() {
      return and();
    }
  }

  public class SecretNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SecretProjectionFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.SecretNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretNestedImpl(io.kubernetes.client.openapi.models.V1SecretProjection item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretProjectionBuilder(this, item);
    }

    SecretNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretProjectionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretProjectionBuilder builder;

    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withSecret(builder.build());
    }

    public N endSecret() {
      return and();
    }
  }

  public class ServiceAccountTokenNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeProjectionFluent.ServiceAccountTokenNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeProjectionFluent
                  .ServiceAccountTokenNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ServiceAccountTokenNestedImpl(
        io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjection item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder(
              this, item);
    }

    ServiceAccountTokenNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ServiceAccountTokenProjectionBuilder builder;

    public N and() {
      return (N) V1VolumeProjectionFluentImpl.this.withServiceAccountToken(builder.build());
    }

    public N endServiceAccountToken() {
      return and();
    }
  }
}
