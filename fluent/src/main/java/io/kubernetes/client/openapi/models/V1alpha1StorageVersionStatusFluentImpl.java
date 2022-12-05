package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1StorageVersionStatusFluentImpl<A extends V1alpha1StorageVersionStatusFluent<A>> extends BaseFluent<A> implements V1alpha1StorageVersionStatusFluent<A>{
  public V1alpha1StorageVersionStatusFluentImpl() {
  }
  public V1alpha1StorageVersionStatusFluentImpl(V1alpha1StorageVersionStatus instance) {
    this.withCommonEncodingVersion(instance.getCommonEncodingVersion());

    this.withConditions(instance.getConditions());

    this.withStorageVersions(instance.getStorageVersions());

  }
  private String commonEncodingVersion;
  private ArrayList<V1alpha1StorageVersionConditionBuilder> conditions;
  private ArrayList<V1alpha1ServerStorageVersionBuilder> storageVersions;
  public String getCommonEncodingVersion() {
    return this.commonEncodingVersion;
  }
  public A withCommonEncodingVersion(String commonEncodingVersion) {
    this.commonEncodingVersion=commonEncodingVersion; return (A) this;
  }
  public Boolean hasCommonEncodingVersion() {
    return this.commonEncodingVersion != null;
  }
  public A addToConditions(Integer index,V1alpha1StorageVersionCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1StorageVersionConditionBuilder>();}
    V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1alpha1StorageVersionCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1StorageVersionConditionBuilder>();}
    V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1StorageVersionConditionBuilder>();}
    for (V1alpha1StorageVersionCondition item : items) {V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1alpha1StorageVersionCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1StorageVersionConditionBuilder>();}
    for (V1alpha1StorageVersionCondition item : items) {V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... items) {
    for (V1alpha1StorageVersionCondition item : items) {V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1alpha1StorageVersionCondition> items) {
    for (V1alpha1StorageVersionCondition item : items) {V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1alpha1StorageVersionConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1alpha1StorageVersionConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1alpha1StorageVersionConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildConditions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1StorageVersionCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1alpha1StorageVersionCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1alpha1StorageVersionCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1alpha1StorageVersionCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1alpha1StorageVersionCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1alpha1StorageVersionCondition buildMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate) {
    for (V1alpha1StorageVersionConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate) {
    for (V1alpha1StorageVersionConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1alpha1StorageVersionCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1alpha1StorageVersionCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1alpha1StorageVersionCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1alpha1StorageVersionStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> addNewConditionLike(V1alpha1StorageVersionCondition item) {
    return new V1alpha1StorageVersionStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1alpha1StorageVersionCondition item) {
    return new V1alpha1StorageVersionStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1alpha1StorageVersionStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public A addToStorageVersions(Integer index,V1alpha1ServerStorageVersion item) {
    if (this.storageVersions == null) {this.storageVersions = new ArrayList<V1alpha1ServerStorageVersionBuilder>();}
    V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").add(index >= 0 ? index : _visitables.get("storageVersions").size(), builder);this.storageVersions.add(index >= 0 ? index : storageVersions.size(), builder); return (A)this;
  }
  public A setToStorageVersions(Integer index,V1alpha1ServerStorageVersion item) {
    if (this.storageVersions == null) {this.storageVersions = new ArrayList<V1alpha1ServerStorageVersionBuilder>();}
    V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);
    if (index < 0 || index >= _visitables.get("storageVersions").size()) { _visitables.get("storageVersions").add(builder); } else { _visitables.get("storageVersions").set(index, builder);}
    if (index < 0 || index >= storageVersions.size()) { storageVersions.add(builder); } else { storageVersions.set(index, builder);}
     return (A)this;
  }
  public A addToStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items) {
    if (this.storageVersions == null) {this.storageVersions = new ArrayList<V1alpha1ServerStorageVersionBuilder>();}
    for (V1alpha1ServerStorageVersion item : items) {V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").add(builder);this.storageVersions.add(builder);} return (A)this;
  }
  public A addAllToStorageVersions(Collection<V1alpha1ServerStorageVersion> items) {
    if (this.storageVersions == null) {this.storageVersions = new ArrayList<V1alpha1ServerStorageVersionBuilder>();}
    for (V1alpha1ServerStorageVersion item : items) {V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").add(builder);this.storageVersions.add(builder);} return (A)this;
  }
  public A removeFromStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... items) {
    for (V1alpha1ServerStorageVersion item : items) {V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").remove(builder);if (this.storageVersions != null) {this.storageVersions.remove(builder);}} return (A)this;
  }
  public A removeAllFromStorageVersions(Collection<V1alpha1ServerStorageVersion> items) {
    for (V1alpha1ServerStorageVersion item : items) {V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").remove(builder);if (this.storageVersions != null) {this.storageVersions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromStorageVersions(Predicate<V1alpha1ServerStorageVersionBuilder> predicate) {
    if (storageVersions == null) return (A) this;
    final Iterator<V1alpha1ServerStorageVersionBuilder> each = storageVersions.iterator();
    final List visitables = _visitables.get("storageVersions");
    while (each.hasNext()) {
      V1alpha1ServerStorageVersionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildStorageVersions instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1alpha1ServerStorageVersion> getStorageVersions() {
    return storageVersions != null ? build(storageVersions) : null;
  }
  public List<V1alpha1ServerStorageVersion> buildStorageVersions() {
    return storageVersions != null ? build(storageVersions) : null;
  }
  public V1alpha1ServerStorageVersion buildStorageVersion(Integer index) {
    return this.storageVersions.get(index).build();
  }
  public V1alpha1ServerStorageVersion buildFirstStorageVersion() {
    return this.storageVersions.get(0).build();
  }
  public V1alpha1ServerStorageVersion buildLastStorageVersion() {
    return this.storageVersions.get(storageVersions.size() - 1).build();
  }
  public V1alpha1ServerStorageVersion buildMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate) {
    for (V1alpha1ServerStorageVersionBuilder item: storageVersions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate) {
    for (V1alpha1ServerStorageVersionBuilder item: storageVersions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withStorageVersions(List<V1alpha1ServerStorageVersion> storageVersions) {
    if (this.storageVersions != null) { _visitables.get("storageVersions").removeAll(this.storageVersions);}
    if (storageVersions != null) {this.storageVersions = new ArrayList(); for (V1alpha1ServerStorageVersion item : storageVersions){this.addToStorageVersions(item);}} else { this.storageVersions = null;} return (A) this;
  }
  public A withStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... storageVersions) {
    if (this.storageVersions != null) {this.storageVersions.clear();}
    if (storageVersions != null) {for (V1alpha1ServerStorageVersion item :storageVersions){ this.addToStorageVersions(item);}} return (A) this;
  }
  public Boolean hasStorageVersions() {
    return storageVersions != null && !storageVersions.isEmpty();
  }
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> addNewStorageVersion() {
    return new V1alpha1StorageVersionStatusFluentImpl.StorageVersionsNestedImpl();
  }
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> addNewStorageVersionLike(V1alpha1ServerStorageVersion item) {
    return new V1alpha1StorageVersionStatusFluentImpl.StorageVersionsNestedImpl(-1, item);
  }
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> setNewStorageVersionLike(Integer index,V1alpha1ServerStorageVersion item) {
    return new V1alpha1StorageVersionStatusFluentImpl.StorageVersionsNestedImpl(index, item);
  }
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editStorageVersion(Integer index) {
    if (storageVersions.size() <= index) throw new RuntimeException("Can't edit storageVersions. Index exceeds size.");
    return setNewStorageVersionLike(index, buildStorageVersion(index));
  }
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editFirstStorageVersion() {
    if (storageVersions.size() == 0) throw new RuntimeException("Can't edit first storageVersions. The list is empty.");
    return setNewStorageVersionLike(0, buildStorageVersion(0));
  }
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editLastStorageVersion() {
    int index = storageVersions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last storageVersions. The list is empty.");
    return setNewStorageVersionLike(index, buildStorageVersion(index));
  }
  public V1alpha1StorageVersionStatusFluent.StorageVersionsNested<A> editMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<storageVersions.size();i++) { 
    if (predicate.test(storageVersions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching storageVersions. No match found.");
    return setNewStorageVersionLike(index, buildStorageVersion(index));
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1StorageVersionStatusFluentImpl that = (V1alpha1StorageVersionStatusFluentImpl) o;
    if (commonEncodingVersion != null ? !commonEncodingVersion.equals(that.commonEncodingVersion) :that.commonEncodingVersion != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (storageVersions != null ? !storageVersions.equals(that.storageVersions) :that.storageVersions != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(commonEncodingVersion,  conditions,  storageVersions,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (commonEncodingVersion != null) { sb.append("commonEncodingVersion:"); sb.append(commonEncodingVersion + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (storageVersions != null && !storageVersions.isEmpty()) { sb.append("storageVersions:"); sb.append(storageVersions); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1alpha1StorageVersionConditionFluentImpl<V1alpha1StorageVersionStatusFluent.ConditionsNested<N>> implements V1alpha1StorageVersionStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1alpha1StorageVersionCondition item) {
      this.index = index;
      this.builder = new V1alpha1StorageVersionConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha1StorageVersionConditionBuilder(this);
    }
    V1alpha1StorageVersionConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1alpha1StorageVersionStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  class StorageVersionsNestedImpl<N> extends V1alpha1ServerStorageVersionFluentImpl<V1alpha1StorageVersionStatusFluent.StorageVersionsNested<N>> implements V1alpha1StorageVersionStatusFluent.StorageVersionsNested<N>,Nested<N>{
    StorageVersionsNestedImpl(Integer index,V1alpha1ServerStorageVersion item) {
      this.index = index;
      this.builder = new V1alpha1ServerStorageVersionBuilder(this, item);
    }
    StorageVersionsNestedImpl() {
      this.index = -1;
      this.builder = new V1alpha1ServerStorageVersionBuilder(this);
    }
    V1alpha1ServerStorageVersionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1alpha1StorageVersionStatusFluentImpl.this.setToStorageVersions(index,builder.build());
    }
    public N endStorageVersion() {
      return and();
    }
    
  }
  
}