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
public class V1FlexVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<A> {
  public V1FlexVolumeSourceFluentImpl() {}

  public V1FlexVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1FlexVolumeSource instance) {
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());
  }

  private java.lang.String driver;
  private java.lang.String fsType;
  private java.util.Map<java.lang.String, java.lang.String> options;
  private java.lang.Boolean readOnly;
  private io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder secretRef;

  public java.lang.String getDriver() {
    return this.driver;
  }

  public A withDriver(java.lang.String driver) {
    this.driver = driver;
    return (A) this;
  }

  public java.lang.Boolean hasDriver() {
    return this.driver != null;
  }

  /** Method is deprecated. use withDriver instead. */
  @java.lang.Deprecated
  public A withNewDriver(java.lang.String original) {
    return (A) withDriver(new String(original));
  }

  public java.lang.String getFsType() {
    return this.fsType;
  }

  public A withFsType(java.lang.String fsType) {
    this.fsType = fsType;
    return (A) this;
  }

  public java.lang.Boolean hasFsType() {
    return this.fsType != null;
  }

  /** Method is deprecated. use withFsType instead. */
  @java.lang.Deprecated
  public A withNewFsType(java.lang.String original) {
    return (A) withFsType(new String(original));
  }

  public A addToOptions(java.lang.String key, java.lang.String value) {
    if (this.options == null && key != null && value != null) {
      this.options = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.options.put(key, value);
    }
    return (A) this;
  }

  public A addToOptions(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.options == null && map != null) {
      this.options = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.options.putAll(map);
    }
    return (A) this;
  }

  public A removeFromOptions(java.lang.String key) {
    if (this.options == null) {
      return (A) this;
    }
    if (key != null && this.options != null) {
      this.options.remove(key);
    }
    return (A) this;
  }

  public A removeFromOptions(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.options == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.options != null) {
          this.options.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getOptions() {
    return this.options;
  }

  public <K, V> A withOptions(java.util.Map<java.lang.String, java.lang.String> options) {
    if (options == null) {
      this.options = null;
    } else {
      this.options = new java.util.LinkedHashMap(options);
    }
    return (A) this;
  }

  public java.lang.Boolean hasOptions() {
    return this.options != null;
  }

  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  /**
   * This method has been deprecated, please use method buildSecretRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalObjectReference getSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public A withSecretRef(io.kubernetes.client.openapi.models.V1LocalObjectReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef != null) {
      this.secretRef =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(secretRef);
      _visitables.get("secretRef").add(this.secretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecretRef() {
    return this.secretRef != null;
  }

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRef() {
    return new io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluentImpl
        .SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluentImpl.SecretRefNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1FlexVolumeSourceFluentImpl that = (V1FlexVolumeSourceFluentImpl) o;
    if (driver != null ? !driver.equals(that.driver) : that.driver != null) return false;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (options != null ? !options.equals(that.options) : that.options != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(driver, fsType, options, readOnly, secretRef, super.hashCode());
  }

  public class SecretRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent.SecretRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretRefNestedImpl(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1FlexVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
