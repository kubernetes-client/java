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
public interface V1ServiceAccountFluent<
        A extends io.kubernetes.client.openapi.models.V1ServiceAccountFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.Boolean getAutomountServiceAccountToken();

  public A withAutomountServiceAccountToken(java.lang.Boolean automountServiceAccountToken);

  public java.lang.Boolean hasAutomountServiceAccountToken();

  public A addToImagePullSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public A setToImagePullSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public A addToImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items);

  public A addAllToImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items);

  public A removeFromImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... items);

  public A removeAllFromImagePullSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1LocalObjectReference> items);

  public A removeMatchingFromImagePullSecrets(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildImagePullSecrets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      getImagePullSecrets();

  public java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference>
      buildImagePullSecrets();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildImagePullSecret(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildFirstImagePullSecret();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildLastImagePullSecret();

  public io.kubernetes.client.openapi.models.V1LocalObjectReference buildMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate);

  public java.lang.Boolean hasMatchingImagePullSecret(
      java.util.function.Predicate<
              io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
          predicate);

  public A withImagePullSecrets(
      java.util.List<io.kubernetes.client.openapi.models.V1LocalObjectReference> imagePullSecrets);

  public A withImagePullSecrets(
      io.kubernetes.client.openapi.models.V1LocalObjectReference... imagePullSecrets);

  public java.lang.Boolean hasImagePullSecrets();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      addNewImagePullSecret();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      addNewImagePullSecretLike(io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      setNewImagePullSecretLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1LocalObjectReference item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editImagePullSecret(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editFirstImagePullSecret();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editLastImagePullSecret();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<A>
      editMatchingImagePullSecret(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1LocalObjectReferenceBuilder>
              predicate);

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      withNewMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      editMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public A addToSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item);

  public A setToSecrets(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item);

  public A addToSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items);

  public A addAllToSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items);

  public A removeFromSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... items);

  public A removeAllFromSecrets(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items);

  public A removeMatchingFromSecrets(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildSecrets instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> getSecrets();

  public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> buildSecrets();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildSecret(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ObjectReference buildFirstSecret();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildLastSecret();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildMatchingSecret(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate);

  public java.lang.Boolean hasMatchingSecret(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
          predicate);

  public A withSecrets(
      java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> secrets);

  public A withSecrets(io.kubernetes.client.openapi.models.V1ObjectReference... secrets);

  public java.lang.Boolean hasSecrets();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A> addNewSecret();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      addNewSecretLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      setNewSecretLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A> editSecret(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      editFirstSecret();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      editLastSecret();

  public io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<A>
      editMatchingSecret(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>
              predicate);

  public interface ImagePullSecretsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LocalObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1ServiceAccountFluent.ImagePullSecretsNested<
                  N>> {
    public N and();

    public N endImagePullSecret();
  }

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1ServiceAccountFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }

  public interface SecretsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1ServiceAccountFluent.SecretsNested<N>> {
    public N and();

    public N endSecret();
  }
}
