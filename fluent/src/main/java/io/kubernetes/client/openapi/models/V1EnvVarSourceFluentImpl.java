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
public class V1EnvVarSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1EnvVarSourceFluent<A> {
  public V1EnvVarSourceFluentImpl() {}

  public V1EnvVarSourceFluentImpl(io.kubernetes.client.openapi.models.V1EnvVarSource instance) {
    this.withConfigMapKeyRef(instance.getConfigMapKeyRef());

    this.withFieldRef(instance.getFieldRef());

    this.withResourceFieldRef(instance.getResourceFieldRef());

    this.withSecretKeyRef(instance.getSecretKeyRef());
  }

  private io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder configMapKeyRef;
  private io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder fieldRef;
  private io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder resourceFieldRef;
  private io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder secretKeyRef;

  /**
   * This method has been deprecated, please use method buildConfigMapKeyRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ConfigMapKeySelector getConfigMapKeyRef() {
    return this.configMapKeyRef != null ? this.configMapKeyRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapKeySelector buildConfigMapKeyRef() {
    return this.configMapKeyRef != null ? this.configMapKeyRef.build() : null;
  }

  public A withConfigMapKeyRef(
      io.kubernetes.client.openapi.models.V1ConfigMapKeySelector configMapKeyRef) {
    _visitables.get("configMapKeyRef").remove(this.configMapKeyRef);
    if (configMapKeyRef != null) {
      this.configMapKeyRef =
          new io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder(configMapKeyRef);
      _visitables.get("configMapKeyRef").add(this.configMapKeyRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasConfigMapKeyRef() {
    return this.configMapKeyRef != null;
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      withNewConfigMapKeyRef() {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl
        .ConfigMapKeyRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      withNewConfigMapKeyRefLike(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector item) {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl
        .ConfigMapKeyRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      editConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(getConfigMapKeyRef());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      editOrNewConfigMapKeyRef() {
    return withNewConfigMapKeyRefLike(
        getConfigMapKeyRef() != null
            ? getConfigMapKeyRef()
            : new io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<A>
      editOrNewConfigMapKeyRefLike(
          io.kubernetes.client.openapi.models.V1ConfigMapKeySelector item) {
    return withNewConfigMapKeyRefLike(getConfigMapKeyRef() != null ? getConfigMapKeyRef() : item);
  }

  /**
   * This method has been deprecated, please use method buildFieldRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectFieldSelector getFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectFieldSelector buildFieldRef() {
    return this.fieldRef != null ? this.fieldRef.build() : null;
  }

  public A withFieldRef(io.kubernetes.client.openapi.models.V1ObjectFieldSelector fieldRef) {
    _visitables.get("fieldRef").remove(this.fieldRef);
    if (fieldRef != null) {
      this.fieldRef =
          new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder(fieldRef);
      _visitables.get("fieldRef").add(this.fieldRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasFieldRef() {
    return this.fieldRef != null;
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      withNewFieldRef() {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl.FieldRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      withNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item) {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl.FieldRefNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A> editFieldRef() {
    return withNewFieldRefLike(getFieldRef());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      editOrNewFieldRef() {
    return withNewFieldRefLike(
        getFieldRef() != null
            ? getFieldRef()
            : new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<A>
      editOrNewFieldRefLike(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item) {
    return withNewFieldRefLike(getFieldRef() != null ? getFieldRef() : item);
  }

  /**
   * This method has been deprecated, please use method buildResourceFieldRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector getResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector buildResourceFieldRef() {
    return this.resourceFieldRef != null ? this.resourceFieldRef.build() : null;
  }

  public A withResourceFieldRef(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector resourceFieldRef) {
    _visitables.get("resourceFieldRef").remove(this.resourceFieldRef);
    if (resourceFieldRef != null) {
      this.resourceFieldRef =
          new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder(resourceFieldRef);
      _visitables.get("resourceFieldRef").add(this.resourceFieldRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasResourceFieldRef() {
    return this.resourceFieldRef != null;
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      withNewResourceFieldRef() {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl
        .ResourceFieldRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      withNewResourceFieldRefLike(
          io.kubernetes.client.openapi.models.V1ResourceFieldSelector item) {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl
        .ResourceFieldRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      editResourceFieldRef() {
    return withNewResourceFieldRefLike(getResourceFieldRef());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRef() {
    return withNewResourceFieldRefLike(
        getResourceFieldRef() != null
            ? getResourceFieldRef()
            : new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<A>
      editOrNewResourceFieldRefLike(
          io.kubernetes.client.openapi.models.V1ResourceFieldSelector item) {
    return withNewResourceFieldRefLike(
        getResourceFieldRef() != null ? getResourceFieldRef() : item);
  }

  /**
   * This method has been deprecated, please use method buildSecretKeyRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSecretKeyRef() {
    return this.secretKeyRef != null ? this.secretKeyRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretKeySelector buildSecretKeyRef() {
    return this.secretKeyRef != null ? this.secretKeyRef.build() : null;
  }

  public A withSecretKeyRef(io.kubernetes.client.openapi.models.V1SecretKeySelector secretKeyRef) {
    _visitables.get("secretKeyRef").remove(this.secretKeyRef);
    if (secretKeyRef != null) {
      this.secretKeyRef =
          new io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder(secretKeyRef);
      _visitables.get("secretKeyRef").add(this.secretKeyRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecretKeyRef() {
    return this.secretKeyRef != null;
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      withNewSecretKeyRef() {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl
        .SecretKeyRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      withNewSecretKeyRefLike(io.kubernetes.client.openapi.models.V1SecretKeySelector item) {
    return new io.kubernetes.client.openapi.models.V1EnvVarSourceFluentImpl.SecretKeyRefNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      editSecretKeyRef() {
    return withNewSecretKeyRefLike(getSecretKeyRef());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      editOrNewSecretKeyRef() {
    return withNewSecretKeyRefLike(
        getSecretKeyRef() != null
            ? getSecretKeyRef()
            : new io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<A>
      editOrNewSecretKeyRefLike(io.kubernetes.client.openapi.models.V1SecretKeySelector item) {
    return withNewSecretKeyRefLike(getSecretKeyRef() != null ? getSecretKeyRef() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1EnvVarSourceFluentImpl that = (V1EnvVarSourceFluentImpl) o;
    if (configMapKeyRef != null
        ? !configMapKeyRef.equals(that.configMapKeyRef)
        : that.configMapKeyRef != null) return false;
    if (fieldRef != null ? !fieldRef.equals(that.fieldRef) : that.fieldRef != null) return false;
    if (resourceFieldRef != null
        ? !resourceFieldRef.equals(that.resourceFieldRef)
        : that.resourceFieldRef != null) return false;
    if (secretKeyRef != null ? !secretKeyRef.equals(that.secretKeyRef) : that.secretKeyRef != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef, super.hashCode());
  }

  public class ConfigMapKeyRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ConfigMapKeyRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConfigMapKeyRefNestedImpl(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder(this, item);
    }

    ConfigMapKeyRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorBuilder builder;

    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withConfigMapKeyRef(builder.build());
    }

    public N endConfigMapKeyRef() {
      return and();
    }
  }

  public class FieldRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.FieldRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    FieldRefNestedImpl(io.kubernetes.client.openapi.models.V1ObjectFieldSelector item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder(this, item);
    }

    FieldRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectFieldSelectorBuilder builder;

    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withFieldRef(builder.build());
    }

    public N endFieldRef() {
      return and();
    }
  }

  public class ResourceFieldRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.ResourceFieldRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ResourceFieldRefNestedImpl(io.kubernetes.client.openapi.models.V1ResourceFieldSelector item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder(this, item);
    }

    ResourceFieldRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder builder;

    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withResourceFieldRef(builder.build());
    }

    public N endResourceFieldRef() {
      return and();
    }
  }

  public class SecretKeyRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SecretKeySelectorFluentImpl<
          io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1EnvVarSourceFluent.SecretKeyRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretKeyRefNestedImpl(io.kubernetes.client.openapi.models.V1SecretKeySelector item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder(this, item);
    }

    SecretKeyRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretKeySelectorBuilder builder;

    public N and() {
      return (N) V1EnvVarSourceFluentImpl.this.withSecretKeyRef(builder.build());
    }

    public N endSecretKeyRef() {
      return and();
    }
  }
}
