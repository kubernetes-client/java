package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1alpha1StorageVersionStatusFluent<A extends V1alpha1StorageVersionStatusFluent<A>> extends Fluent<A>{
  public String getCommonEncodingVersion();
  public A withCommonEncodingVersion(String commonEncodingVersion);
  public Boolean hasCommonEncodingVersion();
  public A addToConditions(Integer index,V1alpha1StorageVersionCondition item);
  public A setToConditions(Integer index,V1alpha1StorageVersionCondition item);
  public A addToConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items);
  public A addAllToConditions(Collection<V1alpha1StorageVersionCondition> items);
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items);
  public A removeAllFromConditions(Collection<V1alpha1StorageVersionCondition> items);
  public A removeMatchingFromConditions(Predicate<V1alpha1StorageVersionConditionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1StorageVersionCondition> getConditions();
  public List<V1alpha1StorageVersionCondition> buildConditions();
  public V1alpha1StorageVersionCondition buildCondition(Integer index);
  public V1alpha1StorageVersionCondition buildFirstCondition();
  public V1alpha1StorageVersionCondition buildLastCondition();
  public V1alpha1StorageVersionCondition buildMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate);
  public Boolean hasMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate);
  public A withConditions(List<V1alpha1StorageVersionCondition> conditions);
  public A withConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... conditions);
  public Boolean hasConditions();
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> addNewCondition();
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> addNewConditionLike(V1alpha1StorageVersionCondition item);
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1alpha1StorageVersionCondition item);
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editCondition(Integer index);
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editFirstCondition();
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editLastCondition();
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate);
  public A addToStorageVersions(Integer index,V1alpha1ServerStorageVersion item);
  public A setToStorageVersions(Integer index,V1alpha1ServerStorageVersion item);
  public A addToStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items);
  public A addAllToStorageVersions(Collection<V1alpha1ServerStorageVersion> items);
  public A removeFromStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items);
  public A removeAllFromStorageVersions(Collection<V1alpha1ServerStorageVersion> items);
  public A removeMatchingFromStorageVersions(Predicate<V1alpha1ServerStorageVersionBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildStorageVersions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1ServerStorageVersion> getStorageVersions();
  public List<V1alpha1ServerStorageVersion> buildStorageVersions();
  public V1alpha1ServerStorageVersion buildStorageVersion(Integer index);
  public V1alpha1ServerStorageVersion buildFirstStorageVersion();
  public V1alpha1ServerStorageVersion buildLastStorageVersion();
  public V1alpha1ServerStorageVersion buildMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate);
  public Boolean hasMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate);
  public A withStorageVersions(List<V1alpha1ServerStorageVersion> storageVersions);
  public A withStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... storageVersions);
  public Boolean hasStorageVersions();
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> addNewStorageVersion();
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> addNewStorageVersionLike(V1alpha1ServerStorageVersion item);
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> setNewStorageVersionLike(Integer index,V1alpha1ServerStorageVersion item);
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editStorageVersion(Integer index);
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editFirstStorageVersion();
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editLastStorageVersion();
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate);
  public interface ConditionsNested<N> extends Nested<N>,V1alpha1StorageVersionConditionFluent<V1alpha1StorageVersionStatusFluent.ConditionsNested<N>>{
    public N and();
    public N endCondition();
    
  }
  public interface StorageVersionsNested<N> extends Nested<N>,V1alpha1ServerStorageVersionFluent<V1alpha1StorageVersionStatusFluent.StorageVersionsNested<N>>{
    public N and();
    public N endStorageVersion();
    
  }
  
}