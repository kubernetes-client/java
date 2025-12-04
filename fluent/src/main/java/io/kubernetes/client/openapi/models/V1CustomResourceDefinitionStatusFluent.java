package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CustomResourceDefinitionStatusFluent<A extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionStatusFluent<A>> extends BaseFluent<A>{

  private V1CustomResourceDefinitionNamesBuilder acceptedNames;
  private ArrayList<V1CustomResourceDefinitionConditionBuilder> conditions;
  private List<String> storedVersions;

  public V1CustomResourceDefinitionStatusFluent() {
  }
  
  public V1CustomResourceDefinitionStatusFluent(V1CustomResourceDefinitionStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1CustomResourceDefinitionCondition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1CustomResourceDefinitionCondition item : items) {
        V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToStoredVersions(Collection<String> items) {
    if (this.storedVersions == null) {
      this.storedVersions = new ArrayList();
    }
    for (String item : items) {
      this.storedVersions.add(item);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1CustomResourceDefinitionCondition item) {
    return new ConditionsNested(-1, item);
  }
  
  public A addToConditions(V1CustomResourceDefinitionCondition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1CustomResourceDefinitionCondition item : items) {
        V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);
        _visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1CustomResourceDefinitionCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToStoredVersions(String... items) {
    if (this.storedVersions == null) {
      this.storedVersions = new ArrayList();
    }
    for (String item : items) {
      this.storedVersions.add(item);
    }
    return (A) this;
  }
  
  public A addToStoredVersions(int index,String item) {
    if (this.storedVersions == null) {
      this.storedVersions = new ArrayList();
    }
    this.storedVersions.add(index, item);
    return (A) this;
  }
  
  public V1CustomResourceDefinitionNames buildAcceptedNames() {
    return this.acceptedNames != null ? this.acceptedNames.build() : null;
  }
  
  public V1CustomResourceDefinitionCondition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1CustomResourceDefinitionCondition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1CustomResourceDefinitionCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1CustomResourceDefinitionCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1CustomResourceDefinitionCondition buildMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
      for (V1CustomResourceDefinitionConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1CustomResourceDefinitionStatus instance) {
    instance = instance != null ? instance : new V1CustomResourceDefinitionStatus();
    if (instance != null) {
        this.withAcceptedNames(instance.getAcceptedNames());
        this.withConditions(instance.getConditions());
        this.withStoredVersions(instance.getStoredVersions());
    }
  }
  
  public AcceptedNamesNested<A> editAcceptedNames() {
    return this.withNewAcceptedNamesLike(Optional.ofNullable(this.buildAcceptedNames()).orElse(null));
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public AcceptedNamesNested<A> editOrNewAcceptedNames() {
    return this.withNewAcceptedNamesLike(Optional.ofNullable(this.buildAcceptedNames()).orElse(new V1CustomResourceDefinitionNamesBuilder().build()));
  }
  
  public AcceptedNamesNested<A> editOrNewAcceptedNamesLike(V1CustomResourceDefinitionNames item) {
    return this.withNewAcceptedNamesLike(Optional.ofNullable(this.buildAcceptedNames()).orElse(item));
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
    V1CustomResourceDefinitionStatusFluent that = (V1CustomResourceDefinitionStatusFluent) o;
    if (!(Objects.equals(acceptedNames, that.acceptedNames))) {
      return false;
    }
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(storedVersions, that.storedVersions))) {
      return false;
    }
    return true;
  }
  
  public String getFirstStoredVersion() {
    return this.storedVersions.get(0);
  }
  
  public String getLastStoredVersion() {
    return this.storedVersions.get(storedVersions.size() - 1);
  }
  
  public String getMatchingStoredVersion(Predicate<String> predicate) {
      for (String item : storedVersions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public String getStoredVersion(int index) {
    return this.storedVersions.get(index);
  }
  
  public List<String> getStoredVersions() {
    return this.storedVersions;
  }
  
  public boolean hasAcceptedNames() {
    return this.acceptedNames != null;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
      for (V1CustomResourceDefinitionConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingStoredVersion(Predicate<String> predicate) {
      for (String item : storedVersions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasStoredVersions() {
    return this.storedVersions != null && !(this.storedVersions.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(acceptedNames, conditions, storedVersions);
  }
  
  public A removeAllFromConditions(Collection<V1CustomResourceDefinitionCondition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1CustomResourceDefinitionCondition item : items) {
        V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromStoredVersions(Collection<String> items) {
    if (this.storedVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.storedVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1CustomResourceDefinitionCondition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1CustomResourceDefinitionCondition item : items) {
        V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromStoredVersions(String... items) {
    if (this.storedVersions == null) {
      return (A) this;
    }
    for (String item : items) {
      this.storedVersions.remove(item);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1CustomResourceDefinitionConditionBuilder> each = conditions.iterator();
    List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
        V1CustomResourceDefinitionConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1CustomResourceDefinitionCondition item) {
    return new ConditionsNested(index, item);
  }
  
  public A setToConditions(int index,V1CustomResourceDefinitionCondition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) {
        _visitables.get("conditions").add(builder);
        conditions.add(builder);
    } else {
        _visitables.get("conditions").add(builder);
        conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToStoredVersions(int index,String item) {
    if (this.storedVersions == null) {
      this.storedVersions = new ArrayList();
    }
    this.storedVersions.set(index, item);
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(acceptedNames == null)) {
        sb.append("acceptedNames:");
        sb.append(acceptedNames);
        sb.append(",");
    }
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(storedVersions == null) && !(storedVersions.isEmpty())) {
        sb.append("storedVersions:");
        sb.append(storedVersions);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAcceptedNames(V1CustomResourceDefinitionNames acceptedNames) {
    this._visitables.remove("acceptedNames");
    if (acceptedNames != null) {
        this.acceptedNames = new V1CustomResourceDefinitionNamesBuilder(acceptedNames);
        this._visitables.get("acceptedNames").add(this.acceptedNames);
    } else {
        this.acceptedNames = null;
        this._visitables.get("acceptedNames").remove(this.acceptedNames);
    }
    return (A) this;
  }
  
  public A withConditions(List<V1CustomResourceDefinitionCondition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1CustomResourceDefinitionCondition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(V1CustomResourceDefinitionCondition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1CustomResourceDefinitionCondition item : conditions) {
        this.addToConditions(item);
      }
    }
    return (A) this;
  }
  
  public AcceptedNamesNested<A> withNewAcceptedNames() {
    return new AcceptedNamesNested(null);
  }
  
  public AcceptedNamesNested<A> withNewAcceptedNamesLike(V1CustomResourceDefinitionNames item) {
    return new AcceptedNamesNested(item);
  }
  
  public A withStoredVersions(List<String> storedVersions) {
    if (storedVersions != null) {
        this.storedVersions = new ArrayList();
        for (String item : storedVersions) {
          this.addToStoredVersions(item);
        }
    } else {
      this.storedVersions = null;
    }
    return (A) this;
  }
  
  public A withStoredVersions(String... storedVersions) {
    if (this.storedVersions != null) {
        this.storedVersions.clear();
        _visitables.remove("storedVersions");
    }
    if (storedVersions != null) {
      for (String item : storedVersions) {
        this.addToStoredVersions(item);
      }
    }
    return (A) this;
  }
  public class AcceptedNamesNested<N> extends V1CustomResourceDefinitionNamesFluent<AcceptedNamesNested<N>> implements Nested<N>{
  
    V1CustomResourceDefinitionNamesBuilder builder;
  
    AcceptedNamesNested(V1CustomResourceDefinitionNames item) {
      this.builder = new V1CustomResourceDefinitionNamesBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CustomResourceDefinitionStatusFluent.this.withAcceptedNames(builder.build());
    }
    
    public N endAcceptedNames() {
      return and();
    }
    
  }
  public class ConditionsNested<N> extends V1CustomResourceDefinitionConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1CustomResourceDefinitionConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1CustomResourceDefinitionCondition item) {
      this.index = index;
      this.builder = new V1CustomResourceDefinitionConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CustomResourceDefinitionStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
}