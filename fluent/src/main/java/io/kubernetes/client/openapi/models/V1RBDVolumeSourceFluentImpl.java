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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1RBDVolumeSourceFluentImpl<A extends V1RBDVolumeSourceFluent<A>> extends BaseFluent<A>
    implements V1RBDVolumeSourceFluent<A> {
  public V1RBDVolumeSourceFluentImpl() {}

  public V1RBDVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1RBDVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withImage(instance.getImage());

    this.withKeyring(instance.getKeyring());

    this.withMonitors(instance.getMonitors());

    this.withPool(instance.getPool());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());
  }

  private String fsType;
  private java.lang.String image;
  private java.lang.String keyring;
  private List<java.lang.String> monitors;
  private java.lang.String pool;
  private Boolean readOnly;
  private V1LocalObjectReferenceBuilder secretRef;
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

  public A addToMonitors(Integer index, java.lang.String item) {
    if (this.monitors == null) {
      this.monitors = new ArrayList<java.lang.String>();
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

  public A addAllToMonitors(Collection<java.lang.String> items) {
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

  public java.lang.String getMatchingMonitor(Predicate<java.lang.String> predicate) {
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
  @Deprecated
  public V1LocalObjectReference getSecretRef() {
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

  public V1RBDVolumeSourceFluent.SecretRefNested<A> withNewSecretRef() {
    return new V1RBDVolumeSourceFluentImpl.SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new V1RBDVolumeSourceFluentImpl.SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRefLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RBDVolumeSourceFluentImpl that = (V1RBDVolumeSourceFluentImpl) o;
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

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (image != null) {
      sb.append("image:");
      sb.append(image + ",");
    }
    if (keyring != null) {
      sb.append("keyring:");
      sb.append(keyring + ",");
    }
    if (monitors != null && !monitors.isEmpty()) {
      sb.append("monitors:");
      sb.append(monitors + ",");
    }
    if (pool != null) {
      sb.append("pool:");
      sb.append(pool + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (secretRef != null) {
      sb.append("secretRef:");
      sb.append(secretRef + ",");
    }
    if (user != null) {
      sb.append("user:");
      sb.append(user);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }

  class SecretRefNestedImpl<N>
      extends V1LocalObjectReferenceFluentImpl<V1RBDVolumeSourceFluent.SecretRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent.SecretRefNested<N>,
          Nested<N> {
    SecretRefNestedImpl(V1LocalObjectReference item) {
      this.builder = new V1LocalObjectReferenceBuilder(this, item);
    }

    SecretRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;

    public N and() {
      return (N) V1RBDVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
