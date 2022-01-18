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
public class V1ObjectMetaFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ObjectMetaFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ObjectMetaFluent<A> {
  public V1ObjectMetaFluentImpl() {}

  public V1ObjectMetaFluentImpl(io.kubernetes.client.openapi.models.V1ObjectMeta instance) {
    this.withAnnotations(instance.getAnnotations());

    this.withClusterName(instance.getClusterName());

    this.withCreationTimestamp(instance.getCreationTimestamp());

    this.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds());

    this.withDeletionTimestamp(instance.getDeletionTimestamp());

    this.withFinalizers(instance.getFinalizers());

    this.withGenerateName(instance.getGenerateName());

    this.withGeneration(instance.getGeneration());

    this.withLabels(instance.getLabels());

    this.withManagedFields(instance.getManagedFields());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withOwnerReferences(instance.getOwnerReferences());

    this.withResourceVersion(instance.getResourceVersion());

    this.withSelfLink(instance.getSelfLink());

    this.withUid(instance.getUid());
  }

  private java.util.Map<java.lang.String, java.lang.String> annotations;
  private java.lang.String clusterName;
  private java.time.OffsetDateTime creationTimestamp;
  private java.lang.Long deletionGracePeriodSeconds;
  private java.time.OffsetDateTime deletionTimestamp;
  private java.util.List<java.lang.String> finalizers;
  private java.lang.String generateName;
  private java.lang.Long generation;
  private java.util.Map<java.lang.String, java.lang.String> labels;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
      managedFields;
  private java.lang.String name;
  private java.lang.String namespace;
  private java.util.ArrayList<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
      ownerReferences;
  private java.lang.String resourceVersion;
  private java.lang.String selfLink;
  private java.lang.String uid;

  public A addToAnnotations(java.lang.String key, java.lang.String value) {
    if (this.annotations == null && key != null && value != null) {
      this.annotations = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.annotations.put(key, value);
    }
    return (A) this;
  }

  public A addToAnnotations(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.annotations == null && map != null) {
      this.annotations = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.annotations.putAll(map);
    }
    return (A) this;
  }

  public A removeFromAnnotations(java.lang.String key) {
    if (this.annotations == null) {
      return (A) this;
    }
    if (key != null && this.annotations != null) {
      this.annotations.remove(key);
    }
    return (A) this;
  }

  public A removeFromAnnotations(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.annotations == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.annotations != null) {
          this.annotations.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getAnnotations() {
    return this.annotations;
  }

  public <K, V> A withAnnotations(java.util.Map<java.lang.String, java.lang.String> annotations) {
    if (annotations == null) {
      this.annotations = null;
    } else {
      this.annotations = new java.util.LinkedHashMap(annotations);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAnnotations() {
    return this.annotations != null;
  }

  public java.lang.String getClusterName() {
    return this.clusterName;
  }

  public A withClusterName(java.lang.String clusterName) {
    this.clusterName = clusterName;
    return (A) this;
  }

  public java.lang.Boolean hasClusterName() {
    return this.clusterName != null;
  }

  /** Method is deprecated. use withClusterName instead. */
  @java.lang.Deprecated
  public A withNewClusterName(java.lang.String original) {
    return (A) withClusterName(new String(original));
  }

  public java.time.OffsetDateTime getCreationTimestamp() {
    return this.creationTimestamp;
  }

  public A withCreationTimestamp(java.time.OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return (A) this;
  }

  public java.lang.Boolean hasCreationTimestamp() {
    return this.creationTimestamp != null;
  }

  public java.lang.Long getDeletionGracePeriodSeconds() {
    return this.deletionGracePeriodSeconds;
  }

  public A withDeletionGracePeriodSeconds(java.lang.Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasDeletionGracePeriodSeconds() {
    return this.deletionGracePeriodSeconds != null;
  }

  public java.time.OffsetDateTime getDeletionTimestamp() {
    return this.deletionTimestamp;
  }

  public A withDeletionTimestamp(java.time.OffsetDateTime deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return (A) this;
  }

  public java.lang.Boolean hasDeletionTimestamp() {
    return this.deletionTimestamp != null;
  }

  public A addToFinalizers(java.lang.Integer index, java.lang.String item) {
    if (this.finalizers == null) {
      this.finalizers = new java.util.ArrayList<java.lang.String>();
    }
    this.finalizers.add(index, item);
    return (A) this;
  }

  public A setToFinalizers(java.lang.Integer index, java.lang.String item) {
    if (this.finalizers == null) {
      this.finalizers = new java.util.ArrayList<java.lang.String>();
    }
    this.finalizers.set(index, item);
    return (A) this;
  }

  public A addToFinalizers(java.lang.String... items) {
    if (this.finalizers == null) {
      this.finalizers = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.finalizers.add(item);
    }
    return (A) this;
  }

  public A addAllToFinalizers(java.util.Collection<java.lang.String> items) {
    if (this.finalizers == null) {
      this.finalizers = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.finalizers.add(item);
    }
    return (A) this;
  }

  public A removeFromFinalizers(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.finalizers != null) {
        this.finalizers.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromFinalizers(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.finalizers != null) {
        this.finalizers.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getFinalizers() {
    return this.finalizers;
  }

  public java.lang.String getFinalizer(java.lang.Integer index) {
    return this.finalizers.get(index);
  }

  public java.lang.String getFirstFinalizer() {
    return this.finalizers.get(0);
  }

  public java.lang.String getLastFinalizer() {
    return this.finalizers.get(finalizers.size() - 1);
  }

  public java.lang.String getMatchingFinalizer(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : finalizers) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingFinalizer(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : finalizers) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withFinalizers(java.util.List<java.lang.String> finalizers) {
    if (finalizers != null) {
      this.finalizers = new java.util.ArrayList();
      for (java.lang.String item : finalizers) {
        this.addToFinalizers(item);
      }
    } else {
      this.finalizers = null;
    }
    return (A) this;
  }

  public A withFinalizers(java.lang.String... finalizers) {
    if (this.finalizers != null) {
      this.finalizers.clear();
    }
    if (finalizers != null) {
      for (java.lang.String item : finalizers) {
        this.addToFinalizers(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasFinalizers() {
    return finalizers != null && !finalizers.isEmpty();
  }

  public A addNewFinalizer(java.lang.String original) {
    return (A) addToFinalizers(new String(original));
  }

  public java.lang.String getGenerateName() {
    return this.generateName;
  }

  public A withGenerateName(java.lang.String generateName) {
    this.generateName = generateName;
    return (A) this;
  }

  public java.lang.Boolean hasGenerateName() {
    return this.generateName != null;
  }

  /** Method is deprecated. use withGenerateName instead. */
  @java.lang.Deprecated
  public A withNewGenerateName(java.lang.String original) {
    return (A) withGenerateName(new String(original));
  }

  public java.lang.Long getGeneration() {
    return this.generation;
  }

  public A withGeneration(java.lang.Long generation) {
    this.generation = generation;
    return (A) this;
  }

  public java.lang.Boolean hasGeneration() {
    return this.generation != null;
  }

  public A addToLabels(java.lang.String key, java.lang.String value) {
    if (this.labels == null && key != null && value != null) {
      this.labels = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.labels.put(key, value);
    }
    return (A) this;
  }

  public A addToLabels(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.labels == null && map != null) {
      this.labels = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.labels.putAll(map);
    }
    return (A) this;
  }

  public A removeFromLabels(java.lang.String key) {
    if (this.labels == null) {
      return (A) this;
    }
    if (key != null && this.labels != null) {
      this.labels.remove(key);
    }
    return (A) this;
  }

  public A removeFromLabels(java.util.Map<java.lang.String, java.lang.String> map) {
    if (this.labels == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.labels != null) {
          this.labels.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return this.labels;
  }

  public <K, V> A withLabels(java.util.Map<java.lang.String, java.lang.String> labels) {
    if (labels == null) {
      this.labels = null;
    } else {
      this.labels = new java.util.LinkedHashMap(labels);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLabels() {
    return this.labels != null;
  }

  public A addToManagedFields(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item) {
    if (this.managedFields == null) {
      this.managedFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder =
        new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(item);
    _visitables
        .get("managedFields")
        .add(index >= 0 ? index : _visitables.get("managedFields").size(), builder);
    this.managedFields.add(index >= 0 ? index : managedFields.size(), builder);
    return (A) this;
  }

  public A setToManagedFields(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item) {
    if (this.managedFields == null) {
      this.managedFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>();
    }
    io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder =
        new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(item);
    if (index < 0 || index >= _visitables.get("managedFields").size()) {
      _visitables.get("managedFields").add(builder);
    } else {
      _visitables.get("managedFields").set(index, builder);
    }
    if (index < 0 || index >= managedFields.size()) {
      managedFields.add(builder);
    } else {
      managedFields.set(index, builder);
    }
    return (A) this;
  }

  public A addToManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items) {
    if (this.managedFields == null) {
      this.managedFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item : items) {
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder =
          new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(item);
      _visitables.get("managedFields").add(builder);
      this.managedFields.add(builder);
    }
    return (A) this;
  }

  public A addAllToManagedFields(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry> items) {
    if (this.managedFields == null) {
      this.managedFields =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item : items) {
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder =
          new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(item);
      _visitables.get("managedFields").add(builder);
      this.managedFields.add(builder);
    }
    return (A) this;
  }

  public A removeFromManagedFields(
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items) {
    for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item : items) {
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder =
          new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(item);
      _visitables.get("managedFields").remove(builder);
      if (this.managedFields != null) {
        this.managedFields.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromManagedFields(
      java.util.Collection<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry> items) {
    for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item : items) {
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder =
          new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(item);
      _visitables.get("managedFields").remove(builder);
      if (this.managedFields != null) {
        this.managedFields.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromManagedFields(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
          predicate) {
    if (managedFields == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder> each =
        managedFields.iterator();
    final List visitables = _visitables.get("managedFields");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildManagedFields instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry>
      getManagedFields() {
    return managedFields != null ? build(managedFields) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry>
      buildManagedFields() {
    return managedFields != null ? build(managedFields) : null;
  }

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildManagedField(
      java.lang.Integer index) {
    return this.managedFields.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildFirstManagedField() {
    return this.managedFields.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildLastManagedField() {
    return this.managedFields.get(managedFields.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1ManagedFieldsEntry buildMatchingManagedField(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder item : managedFields) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingManagedField(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder item : managedFields) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withManagedFields(
      java.util.List<io.kubernetes.client.openapi.models.V1ManagedFieldsEntry> managedFields) {
    if (this.managedFields != null) {
      _visitables.get("managedFields").removeAll(this.managedFields);
    }
    if (managedFields != null) {
      this.managedFields = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item : managedFields) {
        this.addToManagedFields(item);
      }
    } else {
      this.managedFields = null;
    }
    return (A) this;
  }

  public A withManagedFields(
      io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... managedFields) {
    if (this.managedFields != null) {
      this.managedFields.clear();
    }
    if (managedFields != null) {
      for (io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item : managedFields) {
        this.addToManagedFields(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasManagedFields() {
    return managedFields != null && !managedFields.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      addNewManagedField() {
    return new io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl.ManagedFieldsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      addNewManagedFieldLike(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item) {
    return new io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl.ManagedFieldsNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      setNewManagedFieldLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item) {
    return new io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl.ManagedFieldsNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editManagedField(java.lang.Integer index) {
    if (managedFields.size() <= index)
      throw new RuntimeException("Can't edit managedFields. Index exceeds size.");
    return setNewManagedFieldLike(index, buildManagedField(index));
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editFirstManagedField() {
    if (managedFields.size() == 0)
      throw new RuntimeException("Can't edit first managedFields. The list is empty.");
    return setNewManagedFieldLike(0, buildManagedField(0));
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editLastManagedField() {
    int index = managedFields.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last managedFields. The list is empty.");
    return setNewManagedFieldLike(index, buildManagedField(index));
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<A>
      editMatchingManagedField(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < managedFields.size(); i++) {
      if (predicate.test(managedFields.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching managedFields. No match found.");
    return setNewManagedFieldLike(index, buildManagedField(index));
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public java.lang.String getNamespace() {
    return this.namespace;
  }

  public A withNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return (A) this;
  }

  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }

  /** Method is deprecated. use withNamespace instead. */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String original) {
    return (A) withNamespace(new String(original));
  }

  public A addToOwnerReferences(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1OwnerReference item) {
    if (this.ownerReferences == null) {
      this.ownerReferences =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(item);
    _visitables
        .get("ownerReferences")
        .add(index >= 0 ? index : _visitables.get("ownerReferences").size(), builder);
    this.ownerReferences.add(index >= 0 ? index : ownerReferences.size(), builder);
    return (A) this;
  }

  public A setToOwnerReferences(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1OwnerReference item) {
    if (this.ownerReferences == null) {
      this.ownerReferences =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>();
    }
    io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder =
        new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("ownerReferences").size()) {
      _visitables.get("ownerReferences").add(builder);
    } else {
      _visitables.get("ownerReferences").set(index, builder);
    }
    if (index < 0 || index >= ownerReferences.size()) {
      ownerReferences.add(builder);
    } else {
      ownerReferences.set(index, builder);
    }
    return (A) this;
  }

  public A addToOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... items) {
    if (this.ownerReferences == null) {
      this.ownerReferences =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1OwnerReference item : items) {
      io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(item);
      _visitables.get("ownerReferences").add(builder);
      this.ownerReferences.add(builder);
    }
    return (A) this;
  }

  public A addAllToOwnerReferences(
      java.util.Collection<io.kubernetes.client.openapi.models.V1OwnerReference> items) {
    if (this.ownerReferences == null) {
      this.ownerReferences =
          new java.util.ArrayList<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1OwnerReference item : items) {
      io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(item);
      _visitables.get("ownerReferences").add(builder);
      this.ownerReferences.add(builder);
    }
    return (A) this;
  }

  public A removeFromOwnerReferences(
      io.kubernetes.client.openapi.models.V1OwnerReference... items) {
    for (io.kubernetes.client.openapi.models.V1OwnerReference item : items) {
      io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(item);
      _visitables.get("ownerReferences").remove(builder);
      if (this.ownerReferences != null) {
        this.ownerReferences.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromOwnerReferences(
      java.util.Collection<io.kubernetes.client.openapi.models.V1OwnerReference> items) {
    for (io.kubernetes.client.openapi.models.V1OwnerReference item : items) {
      io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder =
          new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(item);
      _visitables.get("ownerReferences").remove(builder);
      if (this.ownerReferences != null) {
        this.ownerReferences.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromOwnerReferences(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
          predicate) {
    if (ownerReferences == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder> each =
        ownerReferences.iterator();
    final List visitables = _visitables.get("ownerReferences");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildOwnerReferences instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V1OwnerReference> getOwnerReferences() {
    return ownerReferences != null ? build(ownerReferences) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1OwnerReference>
      buildOwnerReferences() {
    return ownerReferences != null ? build(ownerReferences) : null;
  }

  public io.kubernetes.client.openapi.models.V1OwnerReference buildOwnerReference(
      java.lang.Integer index) {
    return this.ownerReferences.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1OwnerReference buildFirstOwnerReference() {
    return this.ownerReferences.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1OwnerReference buildLastOwnerReference() {
    return this.ownerReferences.get(ownerReferences.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1OwnerReference buildMatchingOwnerReference(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder item : ownerReferences) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingOwnerReference(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder item : ownerReferences) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withOwnerReferences(
      java.util.List<io.kubernetes.client.openapi.models.V1OwnerReference> ownerReferences) {
    if (this.ownerReferences != null) {
      _visitables.get("ownerReferences").removeAll(this.ownerReferences);
    }
    if (ownerReferences != null) {
      this.ownerReferences = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1OwnerReference item : ownerReferences) {
        this.addToOwnerReferences(item);
      }
    } else {
      this.ownerReferences = null;
    }
    return (A) this;
  }

  public A withOwnerReferences(
      io.kubernetes.client.openapi.models.V1OwnerReference... ownerReferences) {
    if (this.ownerReferences != null) {
      this.ownerReferences.clear();
    }
    if (ownerReferences != null) {
      for (io.kubernetes.client.openapi.models.V1OwnerReference item : ownerReferences) {
        this.addToOwnerReferences(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasOwnerReferences() {
    return ownerReferences != null && !ownerReferences.isEmpty();
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      addNewOwnerReference() {
    return new io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl
        .OwnerReferencesNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      addNewOwnerReferenceLike(io.kubernetes.client.openapi.models.V1OwnerReference item) {
    return new io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl.OwnerReferencesNestedImpl(
        -1, item);
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      setNewOwnerReferenceLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1OwnerReference item) {
    return new io.kubernetes.client.openapi.models.V1ObjectMetaFluentImpl.OwnerReferencesNestedImpl(
        index, item);
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editOwnerReference(java.lang.Integer index) {
    if (ownerReferences.size() <= index)
      throw new RuntimeException("Can't edit ownerReferences. Index exceeds size.");
    return setNewOwnerReferenceLike(index, buildOwnerReference(index));
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editFirstOwnerReference() {
    if (ownerReferences.size() == 0)
      throw new RuntimeException("Can't edit first ownerReferences. The list is empty.");
    return setNewOwnerReferenceLike(0, buildOwnerReference(0));
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editLastOwnerReference() {
    int index = ownerReferences.size() - 1;
    if (index < 0)
      throw new RuntimeException("Can't edit last ownerReferences. The list is empty.");
    return setNewOwnerReferenceLike(index, buildOwnerReference(index));
  }

  public io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<A>
      editMatchingOwnerReference(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < ownerReferences.size(); i++) {
      if (predicate.test(ownerReferences.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0)
      throw new RuntimeException("Can't edit matching ownerReferences. No match found.");
    return setNewOwnerReferenceLike(index, buildOwnerReference(index));
  }

  public java.lang.String getResourceVersion() {
    return this.resourceVersion;
  }

  public A withResourceVersion(java.lang.String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }

  public java.lang.Boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }

  /** Method is deprecated. use withResourceVersion instead. */
  @java.lang.Deprecated
  public A withNewResourceVersion(java.lang.String original) {
    return (A) withResourceVersion(new String(original));
  }

  public java.lang.String getSelfLink() {
    return this.selfLink;
  }

  public A withSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return (A) this;
  }

  public java.lang.Boolean hasSelfLink() {
    return this.selfLink != null;
  }

  /** Method is deprecated. use withSelfLink instead. */
  @java.lang.Deprecated
  public A withNewSelfLink(java.lang.String original) {
    return (A) withSelfLink(new String(original));
  }

  public java.lang.String getUid() {
    return this.uid;
  }

  public A withUid(java.lang.String uid) {
    this.uid = uid;
    return (A) this;
  }

  public java.lang.Boolean hasUid() {
    return this.uid != null;
  }

  /** Method is deprecated. use withUid instead. */
  @java.lang.Deprecated
  public A withNewUid(java.lang.String original) {
    return (A) withUid(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ObjectMetaFluentImpl that = (V1ObjectMetaFluentImpl) o;
    if (annotations != null ? !annotations.equals(that.annotations) : that.annotations != null)
      return false;
    if (clusterName != null ? !clusterName.equals(that.clusterName) : that.clusterName != null)
      return false;
    if (creationTimestamp != null
        ? !creationTimestamp.equals(that.creationTimestamp)
        : that.creationTimestamp != null) return false;
    if (deletionGracePeriodSeconds != null
        ? !deletionGracePeriodSeconds.equals(that.deletionGracePeriodSeconds)
        : that.deletionGracePeriodSeconds != null) return false;
    if (deletionTimestamp != null
        ? !deletionTimestamp.equals(that.deletionTimestamp)
        : that.deletionTimestamp != null) return false;
    if (finalizers != null ? !finalizers.equals(that.finalizers) : that.finalizers != null)
      return false;
    if (generateName != null ? !generateName.equals(that.generateName) : that.generateName != null)
      return false;
    if (generation != null ? !generation.equals(that.generation) : that.generation != null)
      return false;
    if (labels != null ? !labels.equals(that.labels) : that.labels != null) return false;
    if (managedFields != null
        ? !managedFields.equals(that.managedFields)
        : that.managedFields != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null)
      return false;
    if (ownerReferences != null
        ? !ownerReferences.equals(that.ownerReferences)
        : that.ownerReferences != null) return false;
    if (resourceVersion != null
        ? !resourceVersion.equals(that.resourceVersion)
        : that.resourceVersion != null) return false;
    if (selfLink != null ? !selfLink.equals(that.selfLink) : that.selfLink != null) return false;
    if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        annotations,
        clusterName,
        creationTimestamp,
        deletionGracePeriodSeconds,
        deletionTimestamp,
        finalizers,
        generateName,
        generation,
        labels,
        managedFields,
        name,
        namespace,
        ownerReferences,
        resourceVersion,
        selfLink,
        uid,
        super.hashCode());
  }

  public class ManagedFieldsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ManagedFieldsEntryFluentImpl<
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<N>>
      implements io.kubernetes.client.openapi.models.V1ObjectMetaFluent.ManagedFieldsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ManagedFieldsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1ManagedFieldsEntry item) {
      this.index = index;
      this.builder =
          new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(this, item);
    }

    ManagedFieldsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ManagedFieldsEntryBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ObjectMetaFluentImpl.this.setToManagedFields(index, builder.build());
    }

    public N endManagedField() {
      return and();
    }
  }

  public class OwnerReferencesNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1OwnerReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<N>>
      implements io.kubernetes.client.openapi.models.V1ObjectMetaFluent.OwnerReferencesNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    OwnerReferencesNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1OwnerReference item) {
      this.index = index;
      this.builder = new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(this, item);
    }

    OwnerReferencesNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1OwnerReferenceBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1ObjectMetaFluentImpl.this.setToOwnerReferences(index, builder.build());
    }

    public N endOwnerReference() {
      return and();
    }
  }
}
