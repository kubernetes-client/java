package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Long;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ObjectMetaFluent<A extends io.kubernetes.client.openapi.models.V1ObjectMetaFluent<A>> extends BaseFluent<A>{

  private Map<String,String> annotations;
  private OffsetDateTime creationTimestamp;
  private Long deletionGracePeriodSeconds;
  private OffsetDateTime deletionTimestamp;
  private List<String> finalizers;
  private String generateName;
  private Long generation;
  private Map<String,String> labels;
  private ArrayList<V1ManagedFieldsEntryBuilder> managedFields;
  private String name;
  private String namespace;
  private ArrayList<V1OwnerReferenceBuilder> ownerReferences;
  private String resourceVersion;
  private String selfLink;
  private String uid;

  public V1ObjectMetaFluent() {
  }
  
  public V1ObjectMetaFluent(V1ObjectMeta instance) {
    this.copyInstance(instance);
  }

  public A addAllToFinalizers(Collection<String> items) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    for (String item : items) {
      this.finalizers.add(item);
    }
    return (A) this;
  }
  
  public A addAllToManagedFields(Collection<V1ManagedFieldsEntry> items) {
    if (this.managedFields == null) {
      this.managedFields = new ArrayList();
    }
    for (V1ManagedFieldsEntry item : items) {
        V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);
        _visitables.get("managedFields").add(builder);
        this.managedFields.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToOwnerReferences(Collection<V1OwnerReference> items) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList();
    }
    for (V1OwnerReference item : items) {
        V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);
        _visitables.get("ownerReferences").add(builder);
        this.ownerReferences.add(builder);
    }
    return (A) this;
  }
  
  public ManagedFieldsNested<A> addNewManagedField() {
    return new ManagedFieldsNested(-1, null);
  }
  
  public ManagedFieldsNested<A> addNewManagedFieldLike(V1ManagedFieldsEntry item) {
    return new ManagedFieldsNested(-1, item);
  }
  
  public OwnerReferencesNested<A> addNewOwnerReference() {
    return new OwnerReferencesNested(-1, null);
  }
  
  public OwnerReferencesNested<A> addNewOwnerReferenceLike(V1OwnerReference item) {
    return new OwnerReferencesNested(-1, item);
  }
  
  public A addToAnnotations(Map<String,String> map) {
    if (this.annotations == null && map != null) {
      this.annotations = new LinkedHashMap();
    }
    if (map != null) {
      this.annotations.putAll(map);
    }
    return (A) this;
  }
  
  public A addToAnnotations(String key,String value) {
    if (this.annotations == null && key != null && value != null) {
      this.annotations = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.annotations.put(key, value);
    }
    return (A) this;
  }
  
  public A addToFinalizers(String... items) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    for (String item : items) {
      this.finalizers.add(item);
    }
    return (A) this;
  }
  
  public A addToFinalizers(int index,String item) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    this.finalizers.add(index, item);
    return (A) this;
  }
  
  public A addToLabels(Map<String,String> map) {
    if (this.labels == null && map != null) {
      this.labels = new LinkedHashMap();
    }
    if (map != null) {
      this.labels.putAll(map);
    }
    return (A) this;
  }
  
  public A addToLabels(String key,String value) {
    if (this.labels == null && key != null && value != null) {
      this.labels = new LinkedHashMap();
    }
    if (key != null && value != null) {
      this.labels.put(key, value);
    }
    return (A) this;
  }
  
  public A addToManagedFields(V1ManagedFieldsEntry... items) {
    if (this.managedFields == null) {
      this.managedFields = new ArrayList();
    }
    for (V1ManagedFieldsEntry item : items) {
        V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);
        _visitables.get("managedFields").add(builder);
        this.managedFields.add(builder);
    }
    return (A) this;
  }
  
  public A addToManagedFields(int index,V1ManagedFieldsEntry item) {
    if (this.managedFields == null) {
      this.managedFields = new ArrayList();
    }
    V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);
    if (index < 0 || index >= managedFields.size()) {
        _visitables.get("managedFields").add(builder);
        managedFields.add(builder);
    } else {
        _visitables.get("managedFields").add(builder);
        managedFields.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToOwnerReferences(V1OwnerReference... items) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList();
    }
    for (V1OwnerReference item : items) {
        V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);
        _visitables.get("ownerReferences").add(builder);
        this.ownerReferences.add(builder);
    }
    return (A) this;
  }
  
  public A addToOwnerReferences(int index,V1OwnerReference item) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList();
    }
    V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);
    if (index < 0 || index >= ownerReferences.size()) {
        _visitables.get("ownerReferences").add(builder);
        ownerReferences.add(builder);
    } else {
        _visitables.get("ownerReferences").add(builder);
        ownerReferences.add(index, builder);
    }
    return (A) this;
  }
  
  public V1ManagedFieldsEntry buildFirstManagedField() {
    return this.managedFields.get(0).build();
  }
  
  public V1OwnerReference buildFirstOwnerReference() {
    return this.ownerReferences.get(0).build();
  }
  
  public V1ManagedFieldsEntry buildLastManagedField() {
    return this.managedFields.get(managedFields.size() - 1).build();
  }
  
  public V1OwnerReference buildLastOwnerReference() {
    return this.ownerReferences.get(ownerReferences.size() - 1).build();
  }
  
  public V1ManagedFieldsEntry buildManagedField(int index) {
    return this.managedFields.get(index).build();
  }
  
  public List<V1ManagedFieldsEntry> buildManagedFields() {
    return this.managedFields != null ? build(managedFields) : null;
  }
  
  public V1ManagedFieldsEntry buildMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
      for (V1ManagedFieldsEntryBuilder item : managedFields) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1OwnerReference buildMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate) {
      for (V1OwnerReferenceBuilder item : ownerReferences) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1OwnerReference buildOwnerReference(int index) {
    return this.ownerReferences.get(index).build();
  }
  
  public List<V1OwnerReference> buildOwnerReferences() {
    return this.ownerReferences != null ? build(ownerReferences) : null;
  }
  
  protected void copyInstance(V1ObjectMeta instance) {
    instance = instance != null ? instance : new V1ObjectMeta();
    if (instance != null) {
        this.withAnnotations(instance.getAnnotations());
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
  }
  
  public ManagedFieldsNested<A> editFirstManagedField() {
    if (managedFields.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "managedFields"));
    }
    return this.setNewManagedFieldLike(0, this.buildManagedField(0));
  }
  
  public OwnerReferencesNested<A> editFirstOwnerReference() {
    if (ownerReferences.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "ownerReferences"));
    }
    return this.setNewOwnerReferenceLike(0, this.buildOwnerReference(0));
  }
  
  public ManagedFieldsNested<A> editLastManagedField() {
    int index = managedFields.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "managedFields"));
    }
    return this.setNewManagedFieldLike(index, this.buildManagedField(index));
  }
  
  public OwnerReferencesNested<A> editLastOwnerReference() {
    int index = ownerReferences.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "ownerReferences"));
    }
    return this.setNewOwnerReferenceLike(index, this.buildOwnerReference(index));
  }
  
  public ManagedFieldsNested<A> editManagedField(int index) {
    if (managedFields.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "managedFields"));
    }
    return this.setNewManagedFieldLike(index, this.buildManagedField(index));
  }
  
  public ManagedFieldsNested<A> editMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < managedFields.size();i++) {
      if (predicate.test(managedFields.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "managedFields"));
    }
    return this.setNewManagedFieldLike(index, this.buildManagedField(index));
  }
  
  public OwnerReferencesNested<A> editMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < ownerReferences.size();i++) {
      if (predicate.test(ownerReferences.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "ownerReferences"));
    }
    return this.setNewOwnerReferenceLike(index, this.buildOwnerReference(index));
  }
  
  public OwnerReferencesNested<A> editOwnerReference(int index) {
    if (ownerReferences.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "ownerReferences"));
    }
    return this.setNewOwnerReferenceLike(index, this.buildOwnerReference(index));
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1ObjectMetaFluent that = (V1ObjectMetaFluent) o;
    if (!(Objects.equals(annotations, that.annotations))) {
      return false;
    }
    if (!(Objects.equals(creationTimestamp, that.creationTimestamp))) {
      return false;
    }
    if (!(Objects.equals(deletionGracePeriodSeconds, that.deletionGracePeriodSeconds))) {
      return false;
    }
    if (!(Objects.equals(deletionTimestamp, that.deletionTimestamp))) {
      return false;
    }
    if (!(Objects.equals(finalizers, that.finalizers))) {
      return false;
    }
    if (!(Objects.equals(generateName, that.generateName))) {
      return false;
    }
    if (!(Objects.equals(generation, that.generation))) {
      return false;
    }
    if (!(Objects.equals(labels, that.labels))) {
      return false;
    }
    if (!(Objects.equals(managedFields, that.managedFields))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    if (!(Objects.equals(ownerReferences, that.ownerReferences))) {
      return false;
    }
    if (!(Objects.equals(resourceVersion, that.resourceVersion))) {
      return false;
    }
    if (!(Objects.equals(selfLink, that.selfLink))) {
      return false;
    }
    if (!(Objects.equals(uid, that.uid))) {
      return false;
    }
    return true;
  }
  
  public Map<String,String> getAnnotations() {
    return this.annotations;
  }
  
  public OffsetDateTime getCreationTimestamp() {
    return this.creationTimestamp;
  }
  
  public Long getDeletionGracePeriodSeconds() {
    return this.deletionGracePeriodSeconds;
  }
  
  public OffsetDateTime getDeletionTimestamp() {
    return this.deletionTimestamp;
  }
  
  public String getFinalizer(int index) {
    return this.finalizers.get(index);
  }
  
  public List<String> getFinalizers() {
    return this.finalizers;
  }
  
  public String getFirstFinalizer() {
    return this.finalizers.get(0);
  }
  
  public String getGenerateName() {
    return this.generateName;
  }
  
  public Long getGeneration() {
    return this.generation;
  }
  
  public Map<String,String> getLabels() {
    return this.labels;
  }
  
  public String getLastFinalizer() {
    return this.finalizers.get(finalizers.size() - 1);
  }
  
  public String getMatchingFinalizer(Predicate<String> predicate) {
      for (String item : finalizers) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  
  public String getSelfLink() {
    return this.selfLink;
  }
  
  public String getUid() {
    return this.uid;
  }
  
  public boolean hasAnnotations() {
    return this.annotations != null;
  }
  
  public boolean hasCreationTimestamp() {
    return this.creationTimestamp != null;
  }
  
  public boolean hasDeletionGracePeriodSeconds() {
    return this.deletionGracePeriodSeconds != null;
  }
  
  public boolean hasDeletionTimestamp() {
    return this.deletionTimestamp != null;
  }
  
  public boolean hasFinalizers() {
    return this.finalizers != null && !(this.finalizers.isEmpty());
  }
  
  public boolean hasGenerateName() {
    return this.generateName != null;
  }
  
  public boolean hasGeneration() {
    return this.generation != null;
  }
  
  public boolean hasLabels() {
    return this.labels != null;
  }
  
  public boolean hasManagedFields() {
    return this.managedFields != null && !(this.managedFields.isEmpty());
  }
  
  public boolean hasMatchingFinalizer(Predicate<String> predicate) {
      for (String item : finalizers) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
      for (V1ManagedFieldsEntryBuilder item : managedFields) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate) {
      for (V1OwnerReferenceBuilder item : ownerReferences) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public boolean hasOwnerReferences() {
    return this.ownerReferences != null && !(this.ownerReferences.isEmpty());
  }
  
  public boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  public boolean hasSelfLink() {
    return this.selfLink != null;
  }
  
  public boolean hasUid() {
    return this.uid != null;
  }
  
  public int hashCode() {
    return Objects.hash(annotations, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, labels, managedFields, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
  }
  
  public A removeAllFromFinalizers(Collection<String> items) {
    if (this.finalizers == null) {
      return (A) this;
    }
    for (String item : items) {
      this.finalizers.remove(item);
    }
    return (A) this;
  }
  
  public A removeAllFromManagedFields(Collection<V1ManagedFieldsEntry> items) {
    if (this.managedFields == null) {
      return (A) this;
    }
    for (V1ManagedFieldsEntry item : items) {
        V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);
        _visitables.get("managedFields").remove(builder);
        this.managedFields.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromOwnerReferences(Collection<V1OwnerReference> items) {
    if (this.ownerReferences == null) {
      return (A) this;
    }
    for (V1OwnerReference item : items) {
        V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);
        _visitables.get("ownerReferences").remove(builder);
        this.ownerReferences.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromAnnotations(String key) {
    if (this.annotations == null) {
      return (A) this;
    }
    if (key != null && this.annotations != null) {
      this.annotations.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromAnnotations(Map<String,String> map) {
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
  
  public A removeFromFinalizers(String... items) {
    if (this.finalizers == null) {
      return (A) this;
    }
    for (String item : items) {
      this.finalizers.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromLabels(String key) {
    if (this.labels == null) {
      return (A) this;
    }
    if (key != null && this.labels != null) {
      this.labels.remove(key);
    }
    return (A) this;
  }
  
  public A removeFromLabels(Map<String,String> map) {
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
  
  public A removeFromManagedFields(V1ManagedFieldsEntry... items) {
    if (this.managedFields == null) {
      return (A) this;
    }
    for (V1ManagedFieldsEntry item : items) {
        V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);
        _visitables.get("managedFields").remove(builder);
        this.managedFields.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromOwnerReferences(V1OwnerReference... items) {
    if (this.ownerReferences == null) {
      return (A) this;
    }
    for (V1OwnerReference item : items) {
        V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);
        _visitables.get("ownerReferences").remove(builder);
        this.ownerReferences.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromManagedFields(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
    if (managedFields == null) {
      return (A) this;
    }
    Iterator<V1ManagedFieldsEntryBuilder> each = managedFields.iterator();
    List visitables = _visitables.get("managedFields");
    while (each.hasNext()) {
        V1ManagedFieldsEntryBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromOwnerReferences(Predicate<V1OwnerReferenceBuilder> predicate) {
    if (ownerReferences == null) {
      return (A) this;
    }
    Iterator<V1OwnerReferenceBuilder> each = ownerReferences.iterator();
    List visitables = _visitables.get("ownerReferences");
    while (each.hasNext()) {
        V1OwnerReferenceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ManagedFieldsNested<A> setNewManagedFieldLike(int index,V1ManagedFieldsEntry item) {
    return new ManagedFieldsNested(index, item);
  }
  
  public OwnerReferencesNested<A> setNewOwnerReferenceLike(int index,V1OwnerReference item) {
    return new OwnerReferencesNested(index, item);
  }
  
  public A setToFinalizers(int index,String item) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList();
    }
    this.finalizers.set(index, item);
    return (A) this;
  }
  
  public A setToManagedFields(int index,V1ManagedFieldsEntry item) {
    if (this.managedFields == null) {
      this.managedFields = new ArrayList();
    }
    V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);
    if (index < 0 || index >= managedFields.size()) {
        _visitables.get("managedFields").add(builder);
        managedFields.add(builder);
    } else {
        _visitables.get("managedFields").add(builder);
        managedFields.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToOwnerReferences(int index,V1OwnerReference item) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList();
    }
    V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);
    if (index < 0 || index >= ownerReferences.size()) {
        _visitables.get("ownerReferences").add(builder);
        ownerReferences.add(builder);
    } else {
        _visitables.get("ownerReferences").add(builder);
        ownerReferences.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(annotations == null) && !(annotations.isEmpty())) {
        sb.append("annotations:");
        sb.append(annotations);
        sb.append(",");
    }
    if (!(creationTimestamp == null)) {
        sb.append("creationTimestamp:");
        sb.append(creationTimestamp);
        sb.append(",");
    }
    if (!(deletionGracePeriodSeconds == null)) {
        sb.append("deletionGracePeriodSeconds:");
        sb.append(deletionGracePeriodSeconds);
        sb.append(",");
    }
    if (!(deletionTimestamp == null)) {
        sb.append("deletionTimestamp:");
        sb.append(deletionTimestamp);
        sb.append(",");
    }
    if (!(finalizers == null) && !(finalizers.isEmpty())) {
        sb.append("finalizers:");
        sb.append(finalizers);
        sb.append(",");
    }
    if (!(generateName == null)) {
        sb.append("generateName:");
        sb.append(generateName);
        sb.append(",");
    }
    if (!(generation == null)) {
        sb.append("generation:");
        sb.append(generation);
        sb.append(",");
    }
    if (!(labels == null) && !(labels.isEmpty())) {
        sb.append("labels:");
        sb.append(labels);
        sb.append(",");
    }
    if (!(managedFields == null) && !(managedFields.isEmpty())) {
        sb.append("managedFields:");
        sb.append(managedFields);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(namespace == null)) {
        sb.append("namespace:");
        sb.append(namespace);
        sb.append(",");
    }
    if (!(ownerReferences == null) && !(ownerReferences.isEmpty())) {
        sb.append("ownerReferences:");
        sb.append(ownerReferences);
        sb.append(",");
    }
    if (!(resourceVersion == null)) {
        sb.append("resourceVersion:");
        sb.append(resourceVersion);
        sb.append(",");
    }
    if (!(selfLink == null)) {
        sb.append("selfLink:");
        sb.append(selfLink);
        sb.append(",");
    }
    if (!(uid == null)) {
        sb.append("uid:");
        sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public <K,V>A withAnnotations(Map<String,String> annotations) {
    if (annotations == null) {
      this.annotations = null;
    } else {
      this.annotations = new LinkedHashMap(annotations);
    }
    return (A) this;
  }
  
  public A withCreationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return (A) this;
  }
  
  public A withDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return (A) this;
  }
  
  public A withDeletionTimestamp(OffsetDateTime deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return (A) this;
  }
  
  public A withFinalizers(List<String> finalizers) {
    if (finalizers != null) {
        this.finalizers = new ArrayList();
        for (String item : finalizers) {
          this.addToFinalizers(item);
        }
    } else {
      this.finalizers = null;
    }
    return (A) this;
  }
  
  public A withFinalizers(String... finalizers) {
    if (this.finalizers != null) {
        this.finalizers.clear();
        _visitables.remove("finalizers");
    }
    if (finalizers != null) {
      for (String item : finalizers) {
        this.addToFinalizers(item);
      }
    }
    return (A) this;
  }
  
  public A withGenerateName(String generateName) {
    this.generateName = generateName;
    return (A) this;
  }
  
  public A withGeneration(Long generation) {
    this.generation = generation;
    return (A) this;
  }
  
  public <K,V>A withLabels(Map<String,String> labels) {
    if (labels == null) {
      this.labels = null;
    } else {
      this.labels = new LinkedHashMap(labels);
    }
    return (A) this;
  }
  
  public A withManagedFields(List<V1ManagedFieldsEntry> managedFields) {
    if (this.managedFields != null) {
      this._visitables.get("managedFields").clear();
    }
    if (managedFields != null) {
        this.managedFields = new ArrayList();
        for (V1ManagedFieldsEntry item : managedFields) {
          this.addToManagedFields(item);
        }
    } else {
      this.managedFields = null;
    }
    return (A) this;
  }
  
  public A withManagedFields(V1ManagedFieldsEntry... managedFields) {
    if (this.managedFields != null) {
        this.managedFields.clear();
        _visitables.remove("managedFields");
    }
    if (managedFields != null) {
      for (V1ManagedFieldsEntry item : managedFields) {
        this.addToManagedFields(item);
      }
    }
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public A withOwnerReferences(List<V1OwnerReference> ownerReferences) {
    if (this.ownerReferences != null) {
      this._visitables.get("ownerReferences").clear();
    }
    if (ownerReferences != null) {
        this.ownerReferences = new ArrayList();
        for (V1OwnerReference item : ownerReferences) {
          this.addToOwnerReferences(item);
        }
    } else {
      this.ownerReferences = null;
    }
    return (A) this;
  }
  
  public A withOwnerReferences(V1OwnerReference... ownerReferences) {
    if (this.ownerReferences != null) {
        this.ownerReferences.clear();
        _visitables.remove("ownerReferences");
    }
    if (ownerReferences != null) {
      for (V1OwnerReference item : ownerReferences) {
        this.addToOwnerReferences(item);
      }
    }
    return (A) this;
  }
  
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }
  
  public A withSelfLink(String selfLink) {
    this.selfLink = selfLink;
    return (A) this;
  }
  
  public A withUid(String uid) {
    this.uid = uid;
    return (A) this;
  }
  public class ManagedFieldsNested<N> extends V1ManagedFieldsEntryFluent<ManagedFieldsNested<N>> implements Nested<N>{
  
    V1ManagedFieldsEntryBuilder builder;
    int index;
  
    ManagedFieldsNested(int index,V1ManagedFieldsEntry item) {
      this.index = index;
      this.builder = new V1ManagedFieldsEntryBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ObjectMetaFluent.this.setToManagedFields(index, builder.build());
    }
    
    public N endManagedField() {
      return and();
    }
    
  }
  public class OwnerReferencesNested<N> extends V1OwnerReferenceFluent<OwnerReferencesNested<N>> implements Nested<N>{
  
    V1OwnerReferenceBuilder builder;
    int index;
  
    OwnerReferencesNested(int index,V1OwnerReference item) {
      this.index = index;
      this.builder = new V1OwnerReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1ObjectMetaFluent.this.setToOwnerReferences(index, builder.build());
    }
    
    public N endOwnerReference() {
      return and();
    }
    
  }
}