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
public interface V1ObjectMetaFluent<
        A extends io.kubernetes.client.openapi.models.V1ObjectMetaFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAnnotations(java.lang.String key, java.lang.String value);

  public A addToAnnotations(java.util.Map<java.lang.String, java.lang.String> map);

  public A removeFromAnnotations(java.lang.String key);

  public A removeFromAnnotations(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  public <K, V> A withAnnotations(java.util.Map<java.lang.String, java.lang.String> annotations);

  public java.lang.Boolean hasAnnotations();

  public java.lang.String getClusterName();

  public A withClusterName(java.lang.String clusterName);

  public java.lang.Boolean hasClusterName();

  /** Method is deprecated. use withClusterName instead. */
  @java.lang.Deprecated
  public A withNewClusterName(java.lang.String original);

  public java.time.OffsetDateTime getCreationTimestamp();

  public A withCreationTimestamp(java.time.OffsetDateTime creationTimestamp);

  public java.lang.Boolean hasCreationTimestamp();

  public java.lang.Long getDeletionGracePeriodSeconds();

  public A withDeletionGracePeriodSeconds(java.lang.Long deletionGracePeriodSeconds);

  public java.lang.Boolean hasDeletionGracePeriodSeconds();

  public java.time.OffsetDateTime getDeletionTimestamp();

  public A withDeletionTimestamp(java.time.OffsetDateTime deletionTimestamp);

  public java.lang.Boolean hasDeletionTimestamp();

  public A addToFinalizers(java.lang.Integer index, java.lang.String item);

  public A setToFinalizers(java.lang.Integer index, java.lang.String item);

  public A addToFinalizers(java.lang.String... items);

  public A addAllToFinalizers(java.util.Collection<java.lang.String> items);

  public A removeFromFinalizers(java.lang.String... items);

  public A removeAllFromFinalizers(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getFinalizers();

  public java.lang.String getFinalizer(java.lang.Integer index);

  public java.lang.String getFirstFinalizer();

  public java.lang.String getLastFinalizer();

  public java.lang.String getMatchingFinalizer(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingFinalizer(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withFinalizers(java.util.List<java.lang.String> finalizers);

  public A withFinalizers(java.lang.String... finalizers);

  public java.lang.Boolean hasFinalizers();

  public A addNewFinalizer(java.lang.String original);

  public java.lang.String getGenerateName();

  public A withGenerateName(java.lang.String generateName);

  public java.lang.Boolean hasGenerateName();

  /** Method is deprecated. use withGenerateName instead. */
  @java.lang.Deprecated
  public A withNewGenerateName(java.lang.String original);

  public java.lang.Long getGeneration();

  public A withGeneration(java.lang.Long generation);

  public java.lang.Boolean hasGeneration();

  public A addToLabels(java.lang.String key, java.lang.String value);

  public A addToLabels(java.util.Map<java.lang.String, java.lang.String> map);

  public A removeFromLabels(java.lang.String key);

  public A removeFromLabels(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getLabels();

  public <K, V> A withLabels(java.util.Map<java.lang.String, java.lang.String> labels);

  public java.lang.Boolean hasLabels();

  public A addToManagedFields(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item);

  public A setToManagedFields(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item);

  public A addToManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items);

  public A addAllToManagedFields(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry> items);

  public A removeFromManagedFields(
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items);

  public A removeAllFromManagedFields(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry> items);

  public A removeMatchingFromManagedFields(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildManagedFields instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry>
      getManagedFields();

  public java.util.List<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry>
      buildManagedFields();

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildManagedField(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildFirstManagedField();

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildLastManagedField();

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildMatchingManagedField(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
          predicate);

  public java.lang.Boolean hasMatchingManagedField(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
          predicate);

  public A withManagedFields(
      java.util.List<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry> managedFields);

  public A withManagedFields(
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... managedFields);

  public java.lang.Boolean hasManagedFields();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      addNewManagedField();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      addNewManagedFieldLike(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item);

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      setNewManagedFieldLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item);

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editManagedField(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editFirstManagedField();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editLastManagedField();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editMatchingManagedField(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
              predicate);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.String getNamespace();

  public A withNamespace(java.lang.String namespace);

  public java.lang.Boolean hasNamespace();

  /** Method is deprecated. use withNamespace instead. */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original);

  public A addToOwnerReferences(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1OwnerReference item);

  public A setToOwnerReferences(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1OwnerReference item);

  public A addToOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... items);

  public A addAllToOwnerReferences(
      java.util.Collection<io.kubernetes.client.openapi.models.V1OwnerReference> items);

  public A removeFromOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... items);

  public A removeAllFromOwnerReferences(
      java.util.Collection<io.kubernetes.client.openapi.models.V1OwnerReference> items);

  public A removeMatchingFromOwnerReferences(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
          predicate);

  /**
   * This method has been deprecated, please use method buildOwnerReferences instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1OwnerReference> getOwnerReferences();

  public java.util.List<io.kubernetes.client.openapi.models.V1OwnerReference>
      buildOwnerReferences();

  public io.kubernetes.client.openapi.models.V1OwnerReference buildOwnerReference(
      java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1OwnerReference buildFirstOwnerReference();

  public io.kubernetes.client.openapi.models.V1OwnerReference buildLastOwnerReference();

  public io.kubernetes.client.openapi.models.V1OwnerReference buildMatchingOwnerReference(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
          predicate);

  public java.lang.Boolean hasMatchingOwnerReference(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
          predicate);

  public A withOwnerReferences(
      java.util.List<io.kubernetes.client.openapi.models.V1OwnerReference> ownerReferences);

  public A withOwnerReferences(
      io.kubernetes.client.openapi.models.V1OwnerReference... ownerReferences);

  public java.lang.Boolean hasOwnerReferences();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      addNewOwnerReference();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      addNewOwnerReferenceLike(io.kubernetes.client.openapi.models.V1OwnerReference item);

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      setNewOwnerReferenceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1OwnerReference item);

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editOwnerReference(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editFirstOwnerReference();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editLastOwnerReference();

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editMatchingOwnerReference(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
              predicate);

  public java.lang.String getResourceVersion();

  public A withResourceVersion(java.lang.String resourceVersion);

  public java.lang.Boolean hasResourceVersion();

  /** Method is deprecated. use withResourceVersion instead. */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String original);

  public java.lang.String getSelfLink();

  public A withSelfLink(java.lang.String selfLink);

  public java.lang.Boolean hasSelfLink();

  /** Method is deprecated. use withSelfLink instead. */
  @java.lang.Deprecated
  public A withNewSelfLink(java.lang.String original);

  public java.lang.String getUid();

  public A withUid(java.lang.String uid);

  public java.lang.Boolean hasUid();

  /** Method is deprecated. use withUid instead. */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original);

  public interface ManagedFieldsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ManagedFieldsEntryFluent<
              io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<N>> {
    public N and();

    public N endManagedField();
  }

  public interface OwnerReferencesNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1OwnerReferenceFluent<
              io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<N>> {
    public N and();

    public N endOwnerReference();
  }
}
