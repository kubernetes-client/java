package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.Long;
import java.util.Collection;
import java.util.Map;

 /**
  * Generated
  */
public interface V1ObjectMetaFluent<A extends V1ObjectMetaFluent<A>> extends Fluent<A>{
  public A addToAnnotations(String key,String value);
  public A addToAnnotations(Map<String,String> map);
  public A removeFromAnnotations(String key);
  public A removeFromAnnotations(Map<String,String> map);
  public Map<String,String> getAnnotations();
  public <K,V>A withAnnotations(Map<String,String> annotations);
  public Boolean hasAnnotations();
  public OffsetDateTime getCreationTimestamp();
  public A withCreationTimestamp(OffsetDateTime creationTimestamp);
  public Boolean hasCreationTimestamp();
  public Long getDeletionGracePeriodSeconds();
  public A withDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds);
  public Boolean hasDeletionGracePeriodSeconds();
  public OffsetDateTime getDeletionTimestamp();
  public A withDeletionTimestamp(OffsetDateTime deletionTimestamp);
  public Boolean hasDeletionTimestamp();
  public A addToFinalizers(Integer index,String item);
  public A setToFinalizers(Integer index,String item);
  public A addToFinalizers(java.lang.String... items);
  public A addAllToFinalizers(Collection<String> items);
  public A removeFromFinalizers(java.lang.String... items);
  public A removeAllFromFinalizers(Collection<String> items);
  public List<String> getFinalizers();
  public String getFinalizer(Integer index);
  public String getFirstFinalizer();
  public String getLastFinalizer();
  public String getMatchingFinalizer(Predicate<String> predicate);
  public Boolean hasMatchingFinalizer(Predicate<String> predicate);
  public A withFinalizers(List<String> finalizers);
  public A withFinalizers(java.lang.String... finalizers);
  public Boolean hasFinalizers();
  public String getGenerateName();
  public A withGenerateName(String generateName);
  public Boolean hasGenerateName();
  public Long getGeneration();
  public A withGeneration(Long generation);
  public Boolean hasGeneration();
  public A addToLabels(String key,String value);
  public A addToLabels(Map<String,String> map);
  public A removeFromLabels(String key);
  public A removeFromLabels(Map<String,String> map);
  public Map<String,String> getLabels();
  public <K,V>A withLabels(Map<String,String> labels);
  public Boolean hasLabels();
  public A addToManagedFields(Integer index,V1ManagedFieldsEntry item);
  public A setToManagedFields(Integer index,V1ManagedFieldsEntry item);
  public A addToManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items);
  public A addAllToManagedFields(Collection<V1ManagedFieldsEntry> items);
  public A removeFromManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... items);
  public A removeAllFromManagedFields(Collection<V1ManagedFieldsEntry> items);
  public A removeMatchingFromManagedFields(Predicate<V1ManagedFieldsEntryBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildManagedFields instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ManagedFieldsEntry> getManagedFields();
  public List<V1ManagedFieldsEntry> buildManagedFields();
  public V1ManagedFieldsEntry buildManagedField(Integer index);
  public V1ManagedFieldsEntry buildFirstManagedField();
  public V1ManagedFieldsEntry buildLastManagedField();
  public V1ManagedFieldsEntry buildMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate);
  public Boolean hasMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate);
  public A withManagedFields(List<V1ManagedFieldsEntry> managedFields);
  public A withManagedFields(io.kubernetes.client.openapi.models.V1ManagedFieldsEntry... managedFields);
  public Boolean hasManagedFields();
  public V1ObjectMetaFluent.ManagedFieldsNested<A> addNewManagedField();
  public V1ObjectMetaFluent.ManagedFieldsNested<A> addNewManagedFieldLike(V1ManagedFieldsEntry item);
  public V1ObjectMetaFluent.ManagedFieldsNested<A> setNewManagedFieldLike(Integer index,V1ManagedFieldsEntry item);
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editManagedField(Integer index);
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editFirstManagedField();
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editLastManagedField();
  public V1ObjectMetaFluent.ManagedFieldsNested<A> editMatchingManagedField(Predicate<V1ManagedFieldsEntryBuilder> predicate);
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  public String getNamespace();
  public A withNamespace(String namespace);
  public Boolean hasNamespace();
  public A addToOwnerReferences(Integer index,V1OwnerReference item);
  public A setToOwnerReferences(Integer index,V1OwnerReference item);
  public A addToOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... items);
  public A addAllToOwnerReferences(Collection<V1OwnerReference> items);
  public A removeFromOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... items);
  public A removeAllFromOwnerReferences(Collection<V1OwnerReference> items);
  public A removeMatchingFromOwnerReferences(Predicate<V1OwnerReferenceBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildOwnerReferences instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1OwnerReference> getOwnerReferences();
  public List<V1OwnerReference> buildOwnerReferences();
  public V1OwnerReference buildOwnerReference(Integer index);
  public V1OwnerReference buildFirstOwnerReference();
  public V1OwnerReference buildLastOwnerReference();
  public V1OwnerReference buildMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate);
  public Boolean hasMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate);
  public A withOwnerReferences(List<V1OwnerReference> ownerReferences);
  public A withOwnerReferences(io.kubernetes.client.openapi.models.V1OwnerReference... ownerReferences);
  public Boolean hasOwnerReferences();
  public V1ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReference();
  public V1ObjectMetaFluent.OwnerReferencesNested<A> addNewOwnerReferenceLike(V1OwnerReference item);
  public V1ObjectMetaFluent.OwnerReferencesNested<A> setNewOwnerReferenceLike(Integer index,V1OwnerReference item);
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editOwnerReference(Integer index);
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editFirstOwnerReference();
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editLastOwnerReference();
  public V1ObjectMetaFluent.OwnerReferencesNested<A> editMatchingOwnerReference(Predicate<V1OwnerReferenceBuilder> predicate);
  public String getResourceVersion();
  public A withResourceVersion(String resourceVersion);
  public Boolean hasResourceVersion();
  public String getSelfLink();
  public A withSelfLink(String selfLink);
  public Boolean hasSelfLink();
  public String getUid();
  public A withUid(String uid);
  public Boolean hasUid();
  public interface ManagedFieldsNested<N> extends Nested<N>,V1ManagedFieldsEntryFluent<V1ObjectMetaFluent.ManagedFieldsNested<N>>{
    public N and();
    public N endManagedField();
    
  }
  public interface OwnerReferencesNested<N> extends Nested<N>,V1OwnerReferenceFluent<V1ObjectMetaFluent.OwnerReferencesNested<N>>{
    public N and();
    public N endOwnerReference();
    
  }
  
}