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
public class V1EnvFromSourceFluentImpl<A extends V1EnvFromSourceFluent<A>> extends BaseFluent<A>
    implements V1EnvFromSourceFluent<A> {
  public V1EnvFromSourceFluentImpl() {}

  public V1EnvFromSourceFluentImpl(io.kubernetes.client.openapi.models.V1EnvFromSource instance) {
    this.withConfigMapRef(instance.getConfigMapRef());

    this.withPrefix(instance.getPrefix());

    this.withSecretRef(instance.getSecretRef());
  }

  private V1ConfigMapEnvSourceBuilder configMapRef;
  private String prefix;
  private V1SecretEnvSourceBuilder secretRef;

  /**
   * This method has been deprecated, please use method buildConfigMapRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1ConfigMapEnvSource getConfigMapRef() {
    return this.configMapRef != null ? this.configMapRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapEnvSource buildConfigMapRef() {
    return this.configMapRef != null ? this.configMapRef.build() : null;
  }

  public A withConfigMapRef(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource configMapRef) {
    _visitables.get("configMapRef").remove(this.configMapRef);
    if (configMapRef != null) {
      this.configMapRef = new V1ConfigMapEnvSourceBuilder(configMapRef);
      _visitables.get("configMapRef").add(this.configMapRef);
    }
    return (A) this;
  }

  public Boolean hasConfigMapRef() {
    return this.configMapRef != null;
  }

  public V1EnvFromSourceFluent.ConfigMapRefNested<A> withNewConfigMapRef() {
    return new V1EnvFromSourceFluentImpl.ConfigMapRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      withNewConfigMapRefLike(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource item) {
    return new V1EnvFromSourceFluentImpl.ConfigMapRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      editConfigMapRef() {
    return withNewConfigMapRefLike(getConfigMapRef());
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      editOrNewConfigMapRef() {
    return withNewConfigMapRefLike(
        getConfigMapRef() != null
            ? getConfigMapRef()
            : new io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<A>
      editOrNewConfigMapRefLike(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource item) {
    return withNewConfigMapRefLike(getConfigMapRef() != null ? getConfigMapRef() : item);
  }

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public A withPrefix(java.lang.String prefix) {
    this.prefix = prefix;
    return (A) this;
  }

  public java.lang.Boolean hasPrefix() {
    return this.prefix != null;
  }

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretEnvSource getSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretEnvSource buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretEnvSource secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef != null) {
      this.secretRef = new V1SecretEnvSourceBuilder(secretRef);
      _visitables.get("secretRef").add(this.secretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecretRef() {
    return this.secretRef != null;
  }

  public V1EnvFromSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1EnvFromSourceFluentImpl.SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretEnvSource item) {
    return new io.kubernetes.client.openapi.models.V1EnvFromSourceFluentImpl.SecretRefNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretEnvSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretEnvSource item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EnvFromSourceFluentImpl that = (V1EnvFromSourceFluentImpl) o;
    if (configMapRef != null ? !configMapRef.equals(that.configMapRef) : that.configMapRef != null)
      return false;
    if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(configMapRef, prefix, secretRef, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (configMapRef != null) {
      sb.append("configMapRef:");
      sb.append(configMapRef + ",");
    }
    if (prefix != null) {
      sb.append("prefix:");
      sb.append(prefix + ",");
    }
    if (secretRef != null) {
      sb.append("secretRef:");
      sb.append(secretRef);
    }
    sb.append("}");
    return sb.toString();
  }

  class ConfigMapRefNestedImpl<N>
      extends V1ConfigMapEnvSourceFluentImpl<V1EnvFromSourceFluent.ConfigMapRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.ConfigMapRefNested<N>,
          Nested<N> {
    ConfigMapRefNestedImpl(io.kubernetes.client.openapi.models.V1ConfigMapEnvSource item) {
      this.builder = new V1ConfigMapEnvSourceBuilder(this, item);
    }

    ConfigMapRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ConfigMapEnvSourceBuilder builder;

    public N and() {
      return (N) V1EnvFromSourceFluentImpl.this.withConfigMapRef(builder.build());
    }

    public N endConfigMapRef() {
      return and();
    }
  }

  class SecretRefNestedImpl<N>
      extends V1SecretEnvSourceFluentImpl<V1EnvFromSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1EnvFromSourceFluent.SecretRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretRefNestedImpl(V1SecretEnvSource item) {
      this.builder = new V1SecretEnvSourceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretEnvSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretEnvSourceBuilder builder;

    public N and() {
      return (N) V1EnvFromSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
