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
public class V1RBDPersistentVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<A> {
  public V1RBDPersistentVolumeSourceFluentImpl() {}

  public V1RBDPersistentVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withImage(instance.getImage());

    this.withKeyring(instance.getKeyring());

    this.withMonitors(instance.getMonitors());

    this.withPool(instance.getPool());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());
  }

  private java.lang.String fsType;
  private java.lang.String image;
  private java.lang.String keyring;
  private java.util.List<java.lang.String> monitors;
  private java.lang.String pool;
  private java.lang.Boolean readOnly;
  private io.kubernetes.client.openapi.models.V1SecretReferenceBuilder secretRef;
  private java.lang.String user;

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

  public java.lang.String getImage() {
    return this.image;
  }

  public A withImage(java.lang.String image) {
    this.image = image;
    return (A) this;
  }

  public java.lang.Boolean hasImage() {
    return this.image != null;
  }

  /** Method is deprecated. use withImage instead. */
  @java.lang.Deprecated
  public A withNewImage(java.lang.String original) {
    return (A) withImage(new String(original));
  }

  public java.lang.String getKeyring() {
    return this.keyring;
  }

  public A withKeyring(java.lang.String keyring) {
    this.keyring = keyring;
    return (A) this;
  }

  public java.lang.Boolean hasKeyring() {
    return this.keyring != null;
  }

  /** Method is deprecated. use withKeyring instead. */
  @java.lang.Deprecated
  public A withNewKeyring(java.lang.String original) {
    return (A) withKeyring(new String(original));
  }

  public A addToMonitors(java.lang.Integer index, java.lang.String item) {
    if (this.monitors == null) {
      this.monitors = new java.util.ArrayList<java.lang.String>();
    }
    this.monitors.add(index, item);
    return (A) this;
  }

  public A setToMonitors(java.lang.Integer index, java.lang.String item) {
    if (this.monitors == null) {
      this.monitors = new java.util.ArrayList<java.lang.String>();
    }
    this.monitors.set(index, item);
    return (A) this;
  }

  public A addToMonitors(java.lang.String... items) {
    if (this.monitors == null) {
      this.monitors = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.monitors.add(item);
    }
    return (A) this;
  }

  public A addAllToMonitors(java.util.Collection<java.lang.String> items) {
    if (this.monitors == null) {
      this.monitors = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.monitors.add(item);
    }
    return (A) this;
  }

  public A removeFromMonitors(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.monitors != null) {
        this.monitors.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromMonitors(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.monitors != null) {
        this.monitors.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getMonitors() {
    return this.monitors;
  }

  public java.lang.String getMonitor(java.lang.Integer index) {
    return this.monitors.get(index);
  }

  public java.lang.String getFirstMonitor() {
    return this.monitors.get(0);
  }

  public java.lang.String getLastMonitor() {
    return this.monitors.get(monitors.size() - 1);
  }

  public java.lang.String getMatchingMonitor(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : monitors) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMonitor(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : monitors) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMonitors(java.util.List<java.lang.String> monitors) {
    if (monitors != null) {
      this.monitors = new java.util.ArrayList();
      for (java.lang.String item : monitors) {
        this.addToMonitors(item);
      }
    } else {
      this.monitors = null;
    }
    return (A) this;
  }

  public A withMonitors(java.lang.String... monitors) {
    if (this.monitors != null) {
      this.monitors.clear();
    }
    if (monitors != null) {
      for (java.lang.String item : monitors) {
        this.addToMonitors(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMonitors() {
    return monitors != null && !monitors.isEmpty();
  }

  public A addNewMonitor(java.lang.String original) {
    return (A) addToMonitors(new String(original));
  }

  public java.lang.String getPool() {
    return this.pool;
  }

  public A withPool(java.lang.String pool) {
    this.pool = pool;
    return (A) this;
  }

  public java.lang.Boolean hasPool() {
    return this.pool != null;
  }

  /** Method is deprecated. use withPool instead. */
  @java.lang.Deprecated
  public A withNewPool(java.lang.String original) {
    return (A) withPool(new String(original));
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
  public io.kubernetes.client.openapi.models.V1SecretReference getSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretReference buildSecretRef() {
    return this.secretRef != null ? this.secretRef.build() : null;
  }

  public A withSecretRef(io.kubernetes.client.openapi.models.V1SecretReference secretRef) {
    _visitables.get("secretRef").remove(this.secretRef);
    if (secretRef != null) {
      this.secretRef = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(secretRef);
      _visitables.get("secretRef").add(this.secretRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecretRef() {
    return this.secretRef != null;
  }

  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRef() {
    return new io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluentImpl
        .SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluentImpl
        .SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return withNewSecretRefLike(getSecretRef() != null ? getSecretRef() : item);
  }

  public java.lang.String getUser() {
    return this.user;
  }

  public A withUser(java.lang.String user) {
    this.user = user;
    return (A) this;
  }

  public java.lang.Boolean hasUser() {
    return this.user != null;
  }

  /** Method is deprecated. use withUser instead. */
  @java.lang.Deprecated
  public A withNewUser(java.lang.String original) {
    return (A) withUser(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RBDPersistentVolumeSourceFluentImpl that = (V1RBDPersistentVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (image != null ? !image.equals(that.image) : that.image != null) return false;
    if (keyring != null ? !keyring.equals(that.keyring) : that.keyring != null) return false;
    if (monitors != null ? !monitors.equals(that.monitors) : that.monitors != null) return false;
    if (pool != null ? !pool.equals(that.pool) : that.pool != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        fsType, image, keyring, monitors, pool, readOnly, secretRef, user, super.hashCode());
  }

  public class SecretRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SecretReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent
                  .SecretRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretRefNestedImpl(io.kubernetes.client.openapi.models.V1SecretReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretReferenceBuilder builder;

    public N and() {
      return (N) V1RBDPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
