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
public class V1CephFSPersistentVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<A> {
  public V1CephFSPersistentVolumeSourceFluentImpl() {}

  public V1CephFSPersistentVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource instance) {
    this.withMonitors(instance.getMonitors());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretFile(instance.getSecretFile());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());
  }

  private java.util.List<java.lang.String> monitors;
  private java.lang.String path;
  private java.lang.Boolean readOnly;
  private java.lang.String secretFile;
  private io.kubernetes.client.openapi.models.V1SecretReferenceBuilder secretRef;
  private java.lang.String user;

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

  public java.lang.String getPath() {
    return this.path;
  }

  public A withPath(java.lang.String path) {
    this.path = path;
    return (A) this;
  }

  public java.lang.Boolean hasPath() {
    return this.path != null;
  }

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original) {
    return (A) withPath(new String(original));
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

  public java.lang.String getSecretFile() {
    return this.secretFile;
  }

  public A withSecretFile(java.lang.String secretFile) {
    this.secretFile = secretFile;
    return (A) this;
  }

  public java.lang.Boolean hasSecretFile() {
    return this.secretFile != null;
  }

  /** Method is deprecated. use withSecretFile instead. */
  @java.lang.Deprecated
  public A withNewSecretFile(java.lang.String original) {
    return (A) withSecretFile(new String(original));
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

  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRef() {
    return new io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluentImpl
        .SecretRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A>
      withNewSecretRefLike(io.kubernetes.client.openapi.models.V1SecretReference item) {
    return new io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluentImpl
        .SecretRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A>
      editSecretRef() {
    return withNewSecretRefLike(getSecretRef());
  }

  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A>
      editOrNewSecretRef() {
    return withNewSecretRefLike(
        getSecretRef() != null
            ? getSecretRef()
            : new io.kubernetes.client.openapi.models.V1SecretReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<A>
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
    V1CephFSPersistentVolumeSourceFluentImpl that = (V1CephFSPersistentVolumeSourceFluentImpl) o;
    if (monitors != null ? !monitors.equals(that.monitors) : that.monitors != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretFile != null ? !secretFile.equals(that.secretFile) : that.secretFile != null)
      return false;
    if (secretRef != null ? !secretRef.equals(that.secretRef) : that.secretRef != null)
      return false;
    if (user != null ? !user.equals(that.user) : that.user != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        monitors, path, readOnly, secretFile, secretRef, user, super.hashCode());
  }

  public class SecretRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SecretReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent.SecretRefNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent
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
      return (N) V1CephFSPersistentVolumeSourceFluentImpl.this.withSecretRef(builder.build());
    }

    public N endSecretRef() {
      return and();
    }
  }
}
