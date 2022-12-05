package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.Long;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1ObjectMetaFluentImpl<A extends V1ObjectMetaFluent<A>> extends BaseFluent<A> implements V1ObjectMetaFluent<A>{
  public V1ObjectMetaFluentImpl() {
  }
  public V1ObjectMetaFluentImpl(V1ObjectMeta instance) {
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
  public A addToAnnotations(String key,String value) {
    if(this.annotations == null && key != null && value != null) { this.annotations = new LinkedHashMap(); }
    if(key != null && value != null) {this.annotations.put(key, value);} return (A)this;
  }
  public A addToAnnotations(Map<String,String> map) {
    if(this.annotations == null && map != null) { this.annotations = new LinkedHashMap(); }
    if(map != null) { this.annotations.putAll(map);} return (A)this;
  }
  public A removeFromAnnotations(String key) {
    if(this.annotations == null) { return (A) this; }
    if(key != null && this.annotations != null) {this.annotations.remove(key);} return (A)this;
  }
  public A removeFromAnnotations(Map<String,String> map) {
    if(this.annotations == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.annotations != null){this.annotations.remove(key);}}} return (A)this;
  }
  public Map<String,String> getAnnotations() {
    return this.annotations;
  }
  public <K,V>A withAnnotations(Map<String,String> annotations) {
    if (annotations == null) { this.annotations =  null;} else {this.annotations = new LinkedHashMap(annotations);} return (A) this;
  }
  public Boolean hasAnnotations() {
    return this.annotations != null;
  }
  public OffsetDateTime getCreationTimestamp() {
    return this.creationTimestamp;
  }
  public A withCreationTimestamp(OffsetDateTime creationTimestamp) {
    this.creationTimestamp=creationTimestamp; return (A) this;
  }
  public Boolean hasCreationTimestamp() {
    return this.creationTimestamp != null;
  }
  public Long getDeletionGracePeriodSeconds() {
    return this.deletionGracePeriodSeconds;
  }
  public A withDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds=deletionGracePeriodSeconds; return (A) this;
  }
  public Boolean hasDeletionGracePeriodSeconds() {
    return this.deletionGracePeriodSeconds != null;
  }
  public OffsetDateTime getDeletionTimestamp() {
    return this.deletionTimestamp;
  }
  public A withDeletionTimestamp(OffsetDateTime deletionTimestamp) {
    this.deletionTimestamp=deletionTimestamp; return (A) this;
  }
  public Boolean hasDeletionTimestamp() {
    return this.deletionTimestamp != null;
  }
  public A addToFinalizers(Integer index,String item) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    this.finalizers.add(index, item);
    return (A)this;
  }
  public A setToFinalizers(Integer index,String item) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    this.finalizers.set(index, item); return (A)this;
  }
  public A addToFinalizers(java.lang.String... items) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    for (String item : items) {this.finalizers.add(item);} return (A)this;
  }
  public A addAllToFinalizers(Collection<String> items) {
    if (this.finalizers == null) {this.finalizers = new ArrayList<String>();}
    for (String item : items) {this.finalizers.add(item);} return (A)this;
  }
  public A removeFromFinalizers(java.lang.String... items) {
    for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
  }
  public A removeAllFromFinalizers(Collection<String> items) {
    for (String item : items) {if (this.finalizers!= null){ this.finalizers.remove(item);}} return (A)this;
  }
  public List<String> getFinalizers() {
    return this.finalizers;
  }
  public String getFinalizer(Integer index) {
    return this.finalizers.get(index);
  }
  public String getFirstFinalizer() {
    return this.finalizers.get(0);
  }
  public String getLastFinalizer() {
    return this.finalizers.get(finalizers.size() - 1);
  }
  public String getMatchingFinalizer(Predicate<String> predicate) {
    for (String item: finalizers) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingFinalizer(Predicate<String> predicate) {
    for (String item: finalizers) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withFinalizers(List<String> finalizers) {
    if (finalizers != null) {this.finalizers = new ArrayList(); for (String item : finalizers){this.addToFinalizers(item);}} else { this.finalizers = null;} return (A) this;
  }
  public A withFinalizers(java.lang.String... finalizers) {
    if (this.finalizers != null) {this.finalizers.clear();}
    if (finalizers != null) {for (String item :finalizers){ this.addToFinalizers(item);}} return (A) this;
  }
  public Boolean hasFinalizers() {
    return finalizers != null && !finalizers.isEmpty();
  }
  public String getGenerateName() {
    return this.generateName;
  }
  public A withGenerateName(String generateName) {
    this.generateName=generateName; return (A) this;
  }
  public Boolean hasGenerateName() {
    return this.generateName != null;
  }
  public Long getGeneration() {
    return this.generation;
  }
  public A withGeneration(Long generation) {
    this.generation=generation; return (A) this;
  }
  public Boolean hasGeneration() {
    return this.generation != null;
  }
  public A addToLabels(String key,String value) {
    if(this.labels == null && key != null && value != null) { this.labels = new LinkedHashMap(); }
    if(key != null && value != null) {this.labels.put(key, value);} return (A)this;
  }
  public A addToLabels(Map<String,String> map) {
    if(this.labels == null && map != null) { this.labels = new LinkedHashMap(); }
    if(map != null) { this.labels.putAll(map);} return (A)this;
  }
  public A removeFromLabels(String key) {
    if(this.labels == null) { return (A) this; }
    if(key != null && this.labels != null) {this.labels.remove(key);} return (A)this;
  }
  public A removeFromLabels(Map<String,String> map) {
    if(this.labels == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.labels != null){this.labels.remove(key);}}} return (A)this;
  }
  public Map<String,String> getLabels() {
    return this.labels;
  }
  public <K,V>A withLabels(Map<String,String> labels) {
    if (labels == null) { this.labels =  null;} else {this.labels = new LinkedHashMap(labels);} return (A) this;
  }
  public Boolean hasLabels() {
    return this.labels != null;
  }
  public A addToManagedFields(Integer index,V1ManagedFieldsEntry item) {
    if (this.managedFields == null) {this.managedFields = new ArrayList<V1ManagedFieldsEntryBuilder>();}
    V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);_visitables.get("managedFields").add(index >= 0 ? index : _visitables.get("managedFields").size(), builder);this.managedFields.add(index >= 0 ? index : managedFields.size(), builder); return (A)this;
  }
  public A setToManagedFields(Integer index,V1ManagedFieldsEntry item) {
    if (this.managedFields == null) {this.managedFields = new ArrayList<V1ManagedFieldsEntryBuilder>();}
    V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);
    if (index < 0 || index >= _visitables.get("managedFields").size()) { _visitables.get("managedFields").add(builder); } else { _visitables.get("managedFields").set(index, builder);}
    if (index < 0 || index >= managedFields.size()) { managedFields.add(builder); } else { managedFields.set(index, builder);}
     return (A)this;
  }
  public A addToManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items) {
    if (this.managedFields == null) {this.managedFields = new ArrayList<V1ManagedFieldsEntryBuilder>();}
    for (V1ManagedFieldsEntry item : items) {V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);_visitables.get("managedFields").add(builder);this.managedFields.add(builder);} return (A)this;
  }
  public A addAllToManagedFields(Collection<V1ManagedFieldsEntry> items) {
    if (this.managedFields == null) {this.managedFields = new ArrayList<V1ManagedFieldsEntryBuilder>();}
    for (V1ManagedFieldsEntry item : items) {V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);_visitables.get("managedFields").add(builder);this.managedFields.add(builder);} return (A)this;
  }
  public A removeFromManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items) {
    for (V1ManagedFieldsEntry item : items) {V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);_visitables.get("managedFields").remove(builder);if (this.managedFields != null) {this.managedFields.remove(builder);}} return (A)this;
  }
  public A removeAllFromManagedFields(Collection<V1ManagedFieldsEntry> items) {
    for (V1ManagedFieldsEntry item : items) {V1ManagedFieldsEntryBuilder builder = new V1ManagedFieldsEntryBuilder(item);_visitables.get("managedFields").remove(builder);if (this.managedFields != null) {this.managedFields.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromManagedFields(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
    if (managedFields == null) return (A) this;
    final Iterator<V1ManagedFieldsEntryBuilder> each = managedFields.iterator();
    final List visitables = _visitables.get("managedFields");
    while (each.hasNext()) {
      V1ManagedFieldsEntryBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildManagedFields instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ManagedFieldsEntry> getManagedFields() {
    return managedFields != null ? build(managedFields) : null;
  }
  public List<V1ManagedFieldsEntry> buildManagedFields() {
    return managedFields != null ? build(managedFields) : null;
  }
  public V1ManagedFieldsEntry buildManagedField(Integer index) {
    return this.managedFields.get(index).build();
  }
  public V1ManagedFieldsEntry buildFirstManagedField() {
    return this.managedFields.get(0).build();
  }
  public V1ManagedFieldsEntry buildLastManagedField() {
    return this.managedFields.get(managedFields.size() - 1).build();
  }
  public V1ManagedFieldsEntry buildMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
    for (V1ManagedFieldsEntryBuilder item: managedFields) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
    for (V1ManagedFieldsEntryBuilder item: managedFields) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withManagedFields(List<V1ManagedFieldsEntry> managedFields) {
    if (this.managedFields != null) { _visitables.get("managedFields").removeAll(this.managedFields);}
    if (managedFields != null) {this.managedFields = new ArrayList(); for (V1ManagedFieldsEntry item : managedFields){this.addToManagedFields(item);}} else { this.managedFields = null;} return (A) this;
  }
  public A withManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... managedFields) {
    if (this.managedFields != null) {this.managedFields.clear();}
    if (managedFields != null) {for (V1ManagedFieldsEntry item :managedFields){ this.addToManagedFields(item);}} return (A) this;
  }
  public Boolean hasManagedFields() {
    return managedFields != null && !managedFields.isEmpty();
  }
  public V1ObjectMetaFluent.ManagedFieldsNested<A> addNewManagedField() {
    return new V1ObjectMetaFluentImpl.ManagedFieldsNestedImpl();
  }
  public V1ObjectMetaFluent.ManagedFieldsNested<A> addNewManagedFieldLike(V1ManagedFieldsEntry item) {
    return new V1ObjectMetaFluentImpl.ManagedFieldsNestedImpl(-1, item);
  }
  public V1ObjectMetaFluent.ManagedFieldsNested<A> setNewManagedFieldLike(Integer index,V1ManagedFieldsEntry item) {
    return new V1ObjectMetaFluentImpl.ManagedFieldsNestedImpl(index, item);
  }
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editManagedField(Integer index) {
    if (managedFields.size() <= index) throw new RuntimeException("Can't edit managedFields. Index exceeds size.");
    return setNewManagedFieldLike(index, buildManagedField(index));
  }
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editFirstManagedField() {
    if (managedFields.size() == 0) throw new RuntimeException("Can't edit first managedFields. The list is empty.");
    return setNewManagedFieldLike(0, buildManagedField(0));
  }
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editLastManagedField() {
    int index = managedFields.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last managedFields. The list is empty.");
    return setNewManagedFieldLike(index, buildManagedField(index));
  }
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate) {
    int index = -1;
    for (int i=0;i<managedFields.size();i++) { 
    if (predicate.test(managedFields.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching managedFields. No match found.");
    return setNewManagedFieldLike(index, buildManagedField(index));
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public Boolean hasNamespace() {
    return this.namespace != null;
  }
  public A addToOwnerReferences(Integer index,V1OwnerReference item) {
    if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<V1OwnerReferenceBuilder>();}
    V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);_visitables.get("ownerReferences").add(index >= 0 ? index : _visitables.get("ownerReferences").size(), builder);this.ownerReferences.add(index >= 0 ? index : ownerReferences.size(), builder); return (A)this;
  }
  public A setToOwnerReferences(Integer index,V1OwnerReference item) {
    if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<V1OwnerReferenceBuilder>();}
    V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("ownerReferences").size()) { _visitables.get("ownerReferences").add(builder); } else { _visitables.get("ownerReferences").set(index, builder);}
    if (index < 0 || index >= ownerReferences.size()) { ownerReferences.add(builder); } else { ownerReferences.set(index, builder);}
     return (A)this;
  }
  public A addToOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... items) {
    if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<V1OwnerReferenceBuilder>();}
    for (V1OwnerReference item : items) {V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);_visitables.get("ownerReferences").add(builder);this.ownerReferences.add(builder);} return (A)this;
  }
  public A addAllToOwnerReferences(Collection<V1OwnerReference> items) {
    if (this.ownerReferences == null) {this.ownerReferences = new ArrayList<V1OwnerReferenceBuilder>();}
    for (V1OwnerReference item : items) {V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);_visitables.get("ownerReferences").add(builder);this.ownerReferences.add(builder);} return (A)this;
  }
  public A removeFromOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... items) {
    for (V1OwnerReference item : items) {V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);_visitables.get("ownerReferences").remove(builder);if (this.ownerReferences != null) {this.ownerReferences.remove(builder);}} return (A)this;
  }
  public A removeAllFromOwnerReferences(Collection<V1OwnerReference> items) {
    for (V1OwnerReference item : items) {V1OwnerReferenceBuilder builder = new V1OwnerReferenceBuilder(item);_visitables.get("ownerReferences").remove(builder);if (this.ownerReferences != null) {this.ownerReferences.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromOwnerReferences(Predicate<V1OwnerReferenceBuilder> predicate) {
    if (ownerReferences == null) return (A) this;
    final Iterator<V1OwnerReferenceBuilder> each = ownerReferences.iterator();
    final List visitables = _visitables.get("ownerReferences");
    while (each.hasNext()) {
      V1OwnerReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildOwnerReferences instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1OwnerReference> getOwnerReferences() {
    return ownerReferences != null ? build(ownerReferences) : null;
  }
  public List<V1OwnerReference> buildOwnerReferences() {
    return ownerReferences != null ? build(ownerReferences) : null;
  }
  public V1OwnerReference buildOwnerReference(Integer index) {
    return this.ownerReferences.get(index).build();
  }
  public V1OwnerReference buildFirstOwnerReference() {
    return this.ownerReferences.get(0).build();
  }
  public V1OwnerReference buildLastOwnerReference() {
    return this.ownerReferences.get(ownerReferences.size() - 1).build();
  }
  public V1OwnerReference buildMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate) {
    for (V1OwnerReferenceBuilder item: ownerReferences) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate) {
    for (V1OwnerReferenceBuilder item: ownerReferences) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withOwnerReferences(List<V1OwnerReference> ownerReferences) {
    if (this.ownerReferences != null) { _visitables.get("ownerReferences").removeAll(this.ownerReferences);}
    if (ownerReferences != null) {this.ownerReferences = new ArrayList(); for (V1OwnerReference item : ownerReferences){this.addToOwnerReferences(item);}} else { this.ownerReferences = null;} return (A) this;
  }
  public A withOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... ownerReferences) {
    if (this.ownerReferences != null) {this.ownerReferences.clear();}
    if (ownerReferences != null) {for (V1OwnerReference item :ownerReferences){ this.addToOwnerReferences(item);}} return (A) this;
  }
  public Boolean hasOwnerReferences() {
    return ownerReferences != null && !ownerReferences.isEmpty();
  }
  public V1ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReference() {
    return new V1ObjectMetaFluentImpl.OwnerReferencesNestedImpl();
  }
  public V1ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReferenceLike(V1OwnerReference item) {
    return new V1ObjectMetaFluentImpl.OwnerReferencesNestedImpl(-1, item);
  }
  public V1ObjectMetaFluent.OwnerReferencesNested<A> setNewOwnerReferenceLike(Integer index,V1OwnerReference item) {
    return new V1ObjectMetaFluentImpl.OwnerReferencesNestedImpl(index, item);
  }
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editOwnerReference(Integer index) {
    if (ownerReferences.size() <= index) throw new RuntimeException("Can't edit ownerReferences. Index exceeds size.");
    return setNewOwnerReferenceLike(index, buildOwnerReference(index));
  }
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editFirstOwnerReference() {
    if (ownerReferences.size() == 0) throw new RuntimeException("Can't edit first ownerReferences. The list is empty.");
    return setNewOwnerReferenceLike(0, buildOwnerReference(0));
  }
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editLastOwnerReference() {
    int index = ownerReferences.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last ownerReferences. The list is empty.");
    return setNewOwnerReferenceLike(index, buildOwnerReference(index));
  }
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<ownerReferences.size();i++) { 
    if (predicate.test(ownerReferences.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching ownerReferences. No match found.");
    return setNewOwnerReferenceLike(index, buildOwnerReference(index));
  }
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion=resourceVersion; return (A) this;
  }
  public Boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  public String getSelfLink() {
    return this.selfLink;
  }
  public A withSelfLink(String selfLink) {
    this.selfLink=selfLink; return (A) this;
  }
  public Boolean hasSelfLink() {
    return this.selfLink != null;
  }
  public String getUid() {
    return this.uid;
  }
  public A withUid(String uid) {
    this.uid=uid; return (A) this;
  }
  public Boolean hasUid() {
    return this.uid != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ObjectMetaFluentImpl that = (V1ObjectMetaFluentImpl) o;
    if (annotations != null ? !annotations.equals(that.annotations) :that.annotations != null) return false;
    if (creationTimestamp != null ? !creationTimestamp.equals(that.creationTimestamp) :that.creationTimestamp != null) return false;
    if (deletionGracePeriodSeconds != null ? !deletionGracePeriodSeconds.equals(that.deletionGracePeriodSeconds) :that.deletionGracePeriodSeconds != null) return false;
    if (deletionTimestamp != null ? !deletionTimestamp.equals(that.deletionTimestamp) :that.deletionTimestamp != null) return false;
    if (finalizers != null ? !finalizers.equals(that.finalizers) :that.finalizers != null) return false;
    if (generateName != null ? !generateName.equals(that.generateName) :that.generateName != null) return false;
    if (generation != null ? !generation.equals(that.generation) :that.generation != null) return false;
    if (labels != null ? !labels.equals(that.labels) :that.labels != null) return false;
    if (managedFields != null ? !managedFields.equals(that.managedFields) :that.managedFields != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    if (ownerReferences != null ? !ownerReferences.equals(that.ownerReferences) :that.ownerReferences != null) return false;
    if (resourceVersion != null ? !resourceVersion.equals(that.resourceVersion) :that.resourceVersion != null) return false;
    if (selfLink != null ? !selfLink.equals(that.selfLink) :that.selfLink != null) return false;
    if (uid != null ? !uid.equals(that.uid) :that.uid != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(annotations,  creationTimestamp,  deletionGracePeriodSeconds,  deletionTimestamp,  finalizers,  generateName,  generation,  labels,  managedFields,  name,  namespace,  ownerReferences,  resourceVersion,  selfLink,  uid,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (annotations != null && !annotations.isEmpty()) { sb.append("annotations:"); sb.append(annotations + ","); }
    if (creationTimestamp != null) { sb.append("creationTimestamp:"); sb.append(creationTimestamp + ","); }
    if (deletionGracePeriodSeconds != null) { sb.append("deletionGracePeriodSeconds:"); sb.append(deletionGracePeriodSeconds + ","); }
    if (deletionTimestamp != null) { sb.append("deletionTimestamp:"); sb.append(deletionTimestamp + ","); }
    if (finalizers != null && !finalizers.isEmpty()) { sb.append("finalizers:"); sb.append(finalizers + ","); }
    if (generateName != null) { sb.append("generateName:"); sb.append(generateName + ","); }
    if (generation != null) { sb.append("generation:"); sb.append(generation + ","); }
    if (labels != null && !labels.isEmpty()) { sb.append("labels:"); sb.append(labels + ","); }
    if (managedFields != null && !managedFields.isEmpty()) { sb.append("managedFields:"); sb.append(managedFields + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (ownerReferences != null && !ownerReferences.isEmpty()) { sb.append("ownerReferences:"); sb.append(ownerReferences + ","); }
    if (resourceVersion != null) { sb.append("resourceVersion:"); sb.append(resourceVersion + ","); }
    if (selfLink != null) { sb.append("selfLink:"); sb.append(selfLink + ","); }
    if (uid != null) { sb.append("uid:"); sb.append(uid); }
    sb.append("}");
    return sb.toString();
  }
  class ManagedFieldsNestedImpl<N> extends V1ManagedFieldsEntryFluentImpl<V1ObjectMetaFluent.ManagedFieldsNested<N>> implements V1ObjectMetaFluent.ManagedFieldsNested<N>,Nested<N>{
    ManagedFieldsNestedImpl(Integer index,V1ManagedFieldsEntry item) {
      this.index = index;
      this.builder = new V1ManagedFieldsEntryBuilder(this, item);
    }
    ManagedFieldsNestedImpl() {
      this.index = -1;
      this.builder = new V1ManagedFieldsEntryBuilder(this);
    }
    V1ManagedFieldsEntryBuilder builder;
    Integer index;
    public N and() {
      return (N) V1ObjectMetaFluentImpl.this.setToManagedFields(index,builder.build());
    }
    public N endManagedField() {
      return and();
    }
    
  }
  class OwnerReferencesNestedImpl<N> extends V1OwnerReferenceFluentImpl<V1ObjectMetaFluent.OwnerReferencesNested<N>> implements V1ObjectMetaFluent.OwnerReferencesNested<N>,Nested<N>{
    OwnerReferencesNestedImpl(Integer index,V1OwnerReference item) {
      this.index = index;
      this.builder = new V1OwnerReferenceBuilder(this, item);
    }
    OwnerReferencesNestedImpl() {
      this.index = -1;
      this.builder = new V1OwnerReferenceBuilder(this);
    }
    V1OwnerReferenceBuilder builder;
    Integer index;
    public N and() {
      return (N) V1ObjectMetaFluentImpl.this.setToOwnerReferences(index,builder.build());
    }
    public N endOwnerReference() {
      return and();
    }
    
  }
  
}