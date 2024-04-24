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
public class V1alpha1StorageVersionMigrationStatusFluent<A extends V1alpha1StorageVersionMigrationStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha1StorageVersionMigrationStatusFluent() {
  }
  
  public V1alpha1StorageVersionMigrationStatusFluent(V1alpha1StorageVersionMigrationStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1alpha1MigrationConditionBuilder> conditions;
  private String resourceVersion;
  
  protected void copyInstance(V1alpha1StorageVersionMigrationStatus instance) {
    instance = (instance != null ? instance : new V1alpha1StorageVersionMigrationStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withResourceVersion(instance.getResourceVersion());
        }
  }
  
  public A addToConditions(int index,V1alpha1MigrationCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1MigrationConditionBuilder>();}
    V1alpha1MigrationConditionBuilder builder = new V1alpha1MigrationConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1alpha1MigrationCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1MigrationConditionBuilder>();}
    V1alpha1MigrationConditionBuilder builder = new V1alpha1MigrationConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
    return (A)this;
  }
  
  public A addToConditions(io.kubernetes.client.openapi.models.V1alpha1MigrationCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1MigrationConditionBuilder>();}
    for (V1alpha1MigrationCondition item : items) {V1alpha1MigrationConditionBuilder builder = new V1alpha1MigrationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A addAllToConditions(Collection<V1alpha1MigrationCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1alpha1MigrationConditionBuilder>();}
    for (V1alpha1MigrationCondition item : items) {V1alpha1MigrationConditionBuilder builder = new V1alpha1MigrationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1alpha1MigrationCondition... items) {
    if (this.conditions == null) return (A)this;
    for (V1alpha1MigrationCondition item : items) {V1alpha1MigrationConditionBuilder builder = new V1alpha1MigrationConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1alpha1MigrationCondition> items) {
    if (this.conditions == null) return (A)this;
    for (V1alpha1MigrationCondition item : items) {V1alpha1MigrationConditionBuilder builder = new V1alpha1MigrationConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1alpha1MigrationConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1alpha1MigrationConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1alpha1MigrationConditionBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  public List<V1alpha1MigrationCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1alpha1MigrationCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1alpha1MigrationCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1alpha1MigrationCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1alpha1MigrationCondition buildMatchingCondition(Predicate<V1alpha1MigrationConditionBuilder> predicate) {
      for (V1alpha1MigrationConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1alpha1MigrationConditionBuilder> predicate) {
      for (V1alpha1MigrationConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1alpha1MigrationCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1alpha1MigrationCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1alpha1MigrationCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1alpha1MigrationCondition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1alpha1MigrationCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1alpha1MigrationCondition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1alpha1MigrationConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public String getResourceVersion() {
    return this.resourceVersion;
  }
  
  public A withResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }
  
  public boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1StorageVersionMigrationStatusFluent that = (V1alpha1StorageVersionMigrationStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(resourceVersion, that.resourceVersion)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  resourceVersion,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (resourceVersion != null) { sb.append("resourceVersion:"); sb.append(resourceVersion); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1alpha1MigrationConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1alpha1MigrationCondition item) {
      this.index = index;
      this.builder = new V1alpha1MigrationConditionBuilder(this, item);
    }
    V1alpha1MigrationConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha1StorageVersionMigrationStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }

}