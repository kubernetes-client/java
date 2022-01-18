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
public class V1ServiceAccountFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ServiceAccountFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ServiceAccountFluent<A> {
  public V1ServiceAccountFluentImpl() {}

  public V1ServiceAccountFluentImpl(io.kubernetes.client.openapi.models.V1ServiceAccount instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withAutomountServiceAccountToken(instance.getAutomountServiceAccountToken());

    this.withImagePullSecrets(instance.getImagePullSecrets());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSecrets(instance.getSecrets());
  }

  private java.lang.String apiVersion;
  private java.lang.Boolean automountServiceAccountToken;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
      imagePullSecrets;
  private java.lang.String kind;
  private io.kubernetes.client.openapi.models.V1ObjectMetaBuilder metadata;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> secrets;

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

  public java.lang.Boolean getAutomountServiceAccountToken() {
    return this.automountServiceAccountToken;
  }

  public A withAutomountServiceAccountToken(java.lang.Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return (A) this;
  }

  public java.lang.Boolean hasAutomountServiceAccountToken() {
    return this.automountServiceAccountToken != null;
  }

  public A addToImagePullSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
    _visitables
        .get("imagePullSecrets")
        .add(index >= 0 ? index : _visitables.get("imagePullSecrets").size(), builder);
    this.imagePullSecrets.add(index >= 0 ? index : imagePullSecrets.size(), builder);
    return (A) this;
  }

  public A setToImagePullSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("imagePullSecrets").size()) {
      _visitables.get("imagePullSecrets").add(builder);
    } else {
      _visitables.get("imagePullSecrets").set(index, builder);
    }
    if (index < 0 || index >= imagePullSecrets.size()) {
      imagePullSecrets.add(builder);
    } else {
      imagePullSecrets.set(index, builder);
    }
    return (A) this;
  }

  public A addToImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").add(builder);
      this.imagePullSecrets.add(builder);
    }
    return (A) this;
  }

  public A addAllToImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").add(builder);
      this.imagePullSecrets.add(builder);
    }
    return (A) this;
  }

  public A removeFromImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").remove(builder);
      if (this.imagePullSecrets != null) {
        this.imagePullSecrets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(item);
      _visitables.get("imagePullSecrets").remove(builder);
      if (this.imagePullSecrets != null) {
        this.imagePullSecrets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromImagePullSecrets(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate) {
    if (imagePullSecrets == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder> each =
        imagePullSecrets.iterator();
    final List visitables = _visitables.get("imagePullSecrets");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      getImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      buildImagePullSecrets() {
    return imagePullSecrets != null ? build(imagePullSecrets) : null;
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildImagePullSecret(
      java.lang.Integer index) {
    return this.imagePullSecrets.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildFirstImagePullSecret() {
    return this.imagePullSecrets.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildLastImagePullSecret() {
    return this.imagePullSecrets.get(imagePullSecrets.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder item :
        imagePullSecrets) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder item :
        imagePullSecrets) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withImagePullSecrets(
      java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference> imagePullSecrets) {
    if (this.imagePullSecrets != null) {
      _visitables.get("imagePullSecrets").removeAll(this.imagePullSecrets);
    }
    if (imagePullSecrets != null) {
      this.imagePullSecrets = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : imagePullSecrets) {
        this.addToImagePullSecrets(item);
      }
    } else {
      this.imagePullSecrets = null;
    }
    return (A) this;
  }

  public A withImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets) {
    if (this.imagePullSecrets != null) {
      this.imagePullSecrets.clear();
    }
    if (imagePullSecrets != null) {
      for (io.kubernetes.client.openapi.models.V1LocalObjectReference item : imagePullSecrets) {
        this.addToImagePullSecrets(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasImagePullSecrets() {
    return imagePullSecrets != null && !imagePullSecrets.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      addNewImagePullSecret() {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl
        .ImagePullSecretsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      addNewImagePullSecretLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl
        .ImagePullSecretsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      setNewImagePullSecretLike(
          java.lang.Integer index,
          io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl
        .ImagePullSecretsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editImagePullSecret(java.lang.Integer index) {
    if (imagePullSecrets.size() <= index)
      throw new RuntimeException("Can't edit imagePullSecrets. Index exceeds size.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editFirstImagePullSecret() {
    if (imagePullSecrets.size() == 0)
      throw new RuntimeException("Can't edit first imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(0, buildImagePullSecret(0));
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editLastImagePullSecret() {
    int index = imagePullSecrets.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last imagePullSecrets. The list is empty.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editMatchingImagePullSecret(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < imagePullSecrets.size(); i++) {
      if (predicate.test(imagePullSecrets.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching imagePullSecrets. No match found.");
    return setNewImagePullSecretLike(index, buildImagePullSecret(index));
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

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      withNewMetadata() {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl.MetadataNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public A addToSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
    if (this.secrets == null) {
      this.secrets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
    _visitables.get("secrets").add(index >= 0 ? index : _visitables.get("secrets").size(), builder);
    this.secrets.add(index >= 0 ? index : secrets.size(), builder);
    return (A) this;
  }

  public A setToSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
    if (this.secrets == null) {
      this.secrets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("secrets").size()) {
      _visitables.get("secrets").add(builder);
    } else {
      _visitables.get("secrets").set(index, builder);
    }
    if (index < 0 || index >= secrets.size()) {
      secrets.add(builder);
    } else {
      secrets.set(index, builder);
    }
    return (A) this;
  }

  public A addToSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    if (this.secrets == null) {
      this.secrets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("secrets").add(builder);
      this.secrets.add(builder);
    }
    return (A) this;
  }

  public A addAllToSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items) {
    if (this.secrets == null) {
      this.secrets =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("secrets").add(builder);
      this.secrets.add(builder);
    }
    return (A) this;
  }

  public A removeFromSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("secrets").remove(builder);
      if (this.secrets != null) {
        this.secrets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items) {
    for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
      _visitables.get("secrets").remove(builder);
      if (this.secrets != null) {
        this.secrets.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromSecrets(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate) {
    if (secrets == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> each =
        secrets.iterator();
    final List visitables = _visitables.get("secrets");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildSecrets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> getSecrets() {
    return secrets != null ? build(secrets) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> buildSecrets() {
    return secrets != null ? build(secrets) : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildSecret(
      java.lang.Integer index) {
    return this.secrets.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildFirstSecret() {
    return this.secrets.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildLastSecret() {
    return this.secrets.get(secrets.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildMatchingSecret(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder item : secrets) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingSecret(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder item : secrets) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withSecrets(
      java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> secrets) {
    if (this.secrets != null) {
      _visitables.get("secrets").removeAll(this.secrets);
    }
    if (secrets != null) {
      this.secrets = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ObjectReference item : secrets) {
        this.addToSecrets(item);
      }
    } else {
      this.secrets = null;
    }
    return (A) this;
  }

  public A withSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... secrets) {
    if (this.secrets != null) {
      this.secrets.clear();
    }
    if (secrets != null) {
      for (io.kubernetes.client.openapi.models.V1ObjectReference item : secrets) {
        this.addToSecrets(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecrets() {
    return secrets != null && !secrets.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      addNewSecret() {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl.SecretsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      addNewSecretLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl.SecretsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      setNewSecretLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1ServiceAccountFluentImpl.SecretsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A> editSecret(
      java.lang.Integer index) {
    if (secrets.size() <= index)
      throw new RuntimeException("Can't edit secrets. Index exceeds size.");
    return setNewSecretLike(index, buildSecret(index));
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      editFirstSecret() {
    if (secrets.size() == 0)
      throw new RuntimeException("Can't edit first secrets. The list is empty.");
    return setNewSecretLike(0, buildSecret(0));
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      editLastSecret() {
    int index = secrets.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last secrets. The list is empty.");
    return setNewSecretLike(index, buildSecret(index));
  }

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      editMatchingSecret(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < secrets.size(); i++) {
      if (predicate.test(secrets.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching secrets. No match found.");
    return setNewSecretLike(index, buildSecret(index));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceAccountFluentImpl that = (V1ServiceAccountFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (automountServiceAccountToken != null
        ? !automountServiceAccountToken.equals(that.automountServiceAccountToken)
        : that.automountServiceAccountToken != null) return false;
    if (imagePullSecrets != null
        ? !imagePullSecrets.equals(that.imagePullSecrets)
        : that.imagePullSecrets != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    if (secrets != null ? !secrets.equals(that.secrets) : that.secrets != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        apiVersion,
        automountServiceAccountToken,
        imagePullSecrets,
        kind,
        metadata,
        secrets,
        super.hashCode());
  }

  public class ImagePullSecretsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ImagePullSecretsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this, item);
    }

    ImagePullSecretsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ServiceAccountFluentImpl.this.setToImagePullSecrets(index, builder.build());
    }

    public N endImagePullSecret() {
      return and();
    }
  }

  public class MetadataNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl<
          io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ObjectMeta item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectMetaBuilder builder;

    public N and() {
      return (N) V1ServiceAccountFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }

  public class SecretsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    SecretsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ServiceAccountFluentImpl.this.setToSecrets(index, builder.build());
    }

    public N endSecret() {
      return and();
    }
  }
}
