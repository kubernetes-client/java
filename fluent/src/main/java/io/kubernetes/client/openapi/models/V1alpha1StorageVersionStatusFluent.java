package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1StorageVersionStatusFluent<A extends V1alpha1StorageVersionStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha1StorageVersionStatusFluent() {
  }
  
  public V1alpha1StorageVersionStatusFluent(V1alpha1StorageVersionStatus instance) {
    this.copyInstance(instance);
  }
  private String commonEncodingVersion;
  private ArrayList<V1alpha1StorageVersionConditionBuilder> conditions;
  private ArrayList<V1alpha1ServerStorageVersionBuilder> storageVersions;
  
  protected void copyInstance(V1alpha1StorageVersionStatus instance) {
    instance = (instance != null ? instance : new V1alpha1StorageVersionStatus());
    if (instance != null) {
          this.withCommonEncodingVersion(instance.getCommonEncodingVersion());
          this.withConditions(instance.getConditions());
          this.withStorageVersions(instance.getStorageVersions());
        }
  }
  
  public String getCommonEncodingVersion() {
    return this.commonEncodingVersion;
  }
  
  public A withCommonEncodingVersion(String commonEncodingVersion) {
    this.commonEncodingVersion = commonEncodingVersion;
    return (A) this;
  }
  
  public boolean hasCommonEncodingVersion() {
    return this.commonEncodingVersion != null;
  }
  
  public A addToConditions(int index,V1alpha1StorageVersionCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1StorageVersionConditionBuilder>();}
    V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1alpha1StorageVersionCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1StorageVersionConditionBuilder>();}
    V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
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
    if (this.conditions == null) return (A)this;
    for (V1alpha1StorageVersionCondition item : items) {V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1alpha1StorageVersionCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1alpha1StorageVersionCondition item : items) {V1alpha1StorageVersionConditionBuilder builder = new V1alpha1StorageVersionConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
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
  
  public List<V1alpha1StorageVersionCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1alpha1StorageVersionCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1alpha1StorageVersionCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1alpha1StorageVersionCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1alpha1StorageVersionCondition buildMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate) {
      for (V1alpha1StorageVersionConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate) {
      for (V1alpha1StorageVersionConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1alpha1StorageVersionCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1alpha1StorageVersionCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1alpha1StorageVersionCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1alpha1StorageVersionCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !this.conditions.isEmpty();
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1alpha1StorageVersionCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1alpha1StorageVersionCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1alpha1StorageVersionConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public A addToStorageVersions(int index,V1alpha1ServerStorageVersion item) {
    if (this.storageVersions == null) {this.storageVersions = new ArrayList<V1alpha1ServerStorageVersionBuilder>();}
    V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);
    if (index < 0 || index >= storageVersions.size()) { _visitables.get("storageVersions").add(builder); storageVersions.add(builder); } else { _visitables.get("storageVersions").add(index, builder); storageVersions.add(index, builder);}
    return (A)this;
  }
  
  public A setToStorageVersions(int index,V1alpha1ServerStorageVersion item) {
    if (this.storageVersions == null) {this.storageVersions = new ArrayList<V1alpha1ServerStorageVersionBuilder>();}
    V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);
    if (index < 0 || index >= storageVersions.size()) { _visitables.get("storageVersions").add(builder); storageVersions.add(builder); } else { _visitables.get("storageVersions").set(index, builder); storageVersions.set(index, builder);}
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
    if (this.storageVersions == null) return (A)this;
    for (V1alpha1ServerStorageVersion item : items) {V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").remove(builder); this.storageVersions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromStorageVersions(Collection<V1alpha1ServerStorageVersion> items) {
    if (this.storageVersions == null) return (A)this;
    for (V1alpha1ServerStorageVersion item : items) {V1alpha1ServerStorageVersionBuilder builder = new V1alpha1ServerStorageVersionBuilder(item);_visitables.get("storageVersions").remove(builder); this.storageVersions.remove(builder);} return (A)this;
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
  
  public List<V1alpha1ServerStorageVersion> buildStorageVersions() {
    return this.storageVersions != null ? build(storageVersions) : null;
  }
  
  public V1alpha1ServerStorageVersion buildStorageVersion(int index) {
    return this.storageVersions.get(index).build();
  }
  
  public V1alpha1ServerStorageVersion buildFirstStorageVersion() {
    return this.storageVersions.get(0).build();
  }
  
  public V1alpha1ServerStorageVersion buildLastStorageVersion() {
    return this.storageVersions.get(storageVersions.size() - 1).build();
  }
  
  public V1alpha1ServerStorageVersion buildMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate) {
      for (V1alpha1ServerStorageVersionBuilder item : storageVersions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate) {
      for (V1alpha1ServerStorageVersionBuilder item : storageVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withStorageVersions(List<V1alpha1ServerStorageVersion> storageVersions) {
    if (this.storageVersions != null) {
      this._visitables.get("storageVersions").clear();
    }
    if (storageVersions != null) {
        this.storageVersions = new ArrayList();
        for (V1alpha1ServerStorageVersion item : storageVersions) {
          this.addToStorageVersions(item);
        }
    } else {
      this.storageVersions = null;
    }
    return (A) this;
  }
  
  public A withStorageVersions(io.kubernetes.client.openapi.models.V1alpha1ServerStorageVersion... storageVersions) {
    if (this.storageVersions != null) {
        this.storageVersions.clear();
        _visitables.remove("storageVersions");
    }
    if (storageVersions != null) {
      for (V1alpha1ServerStorageVersion item : storageVersions) {
        this.addToStorageVersions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasStorageVersions() {
    return this.storageVersions != null && !this.storageVersions.isEmpty();
  }
  
  public StorageVersionsNested<A> addNewStorageVersion() {
    return new StorageVersionsNested(-1, null);
  }
  
  public StorageVersionsNested<A> addNewStorageVersionLike(V1alpha1ServerStorageVersion item) {
    return new StorageVersionsNested(-1, item);
  }
  
  public StorageVersionsNested<A> setNewStorageVersionLike(int index,V1alpha1ServerStorageVersion item) {
    return new StorageVersionsNested(index, item);
  }
  
  public StorageVersionsNested<A> editStorageVersion(int index) {
    if (storageVersions.size() <= index) throw new RuntimeException("Can't edit storageVersions. Index exceeds size.");
    return setNewStorageVersionLike(index, buildStorageVersion(index));
  }
  
  public StorageVersionsNested<A> editFirstStorageVersion() {
    if (storageVersions.size() == 0) throw new RuntimeException("Can't edit first storageVersions. The list is empty.");
    return setNewStorageVersionLike(0, buildStorageVersion(0));
  }
  
  public StorageVersionsNested<A> editLastStorageVersion() {
    int index = storageVersions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last storageVersions. The list is empty.");
    return setNewStorageVersionLike(index, buildStorageVersion(index));
  }
  
  public StorageVersionsNested<A> editMatchingStorageVersion(Predicate<V1alpha1ServerStorageVersionBuilder> predicate) {
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
    if (!super.equals(o)) return false;
    V1alpha1StorageVersionStatusFluent that = (V1alpha1StorageVersionStatusFluent) o;
    if (!java.util.Objects.equals(commonEncodingVersion, that.commonEncodingVersion)) return false;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(storageVersions, that.storageVersions)) return false;
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
  public class ConditionsNested<N> extends V1alpha1StorageVersionConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1alpha1StorageVersionCondition item) {
      this.index = index;
      this.builder = new V1alpha1StorageVersionConditionBuilder(this, item);
    }
    V1alpha1StorageVersionConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha1StorageVersionStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class StorageVersionsNested<N> extends V1alpha1ServerStorageVersionFluent<StorageVersionsNested<N>> implements Nested<N>{
    StorageVersionsNested(int index,V1alpha1ServerStorageVersion item) {
      this.index = index;
      this.builder = new V1alpha1ServerStorageVersionBuilder(this, item);
    }
    V1alpha1ServerStorageVersionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha1StorageVersionStatusFluent.this.setToStorageVersions(index,builder.build());
    }
    
    public N endStorageVersion() {
      return and();
    }
    
  
  }

}