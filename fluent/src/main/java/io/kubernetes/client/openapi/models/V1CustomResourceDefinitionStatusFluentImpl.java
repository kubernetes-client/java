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
  public class V1CustomResourceDefinitionStatusFluentImpl<A extends V1CustomResourceDefinitionStatusFluent<A>> extends BaseFluent<A> implements V1CustomResourceDefinitionStatusFluent<A>{
  public V1CustomResourceDefinitionStatusFluentImpl() {
  }
  public V1CustomResourceDefinitionStatusFluentImpl(V1CustomResourceDefinitionStatus instance) {
    this.withAcceptedNames(instance.getAcceptedNames());

    this.withConditions(instance.getConditions());

    this.withStoredVersions(instance.getStoredVersions());

  }
  private V1CustomResourceDefinitionNamesBuilder acceptedNames;
  private ArrayList<V1CustomResourceDefinitionConditionBuilder> conditions;
  private List<String> storedVersions;
  
  /**
   * This method has been deprecated, please use method buildAcceptedNames instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CustomResourceDefinitionNames getAcceptedNames() {
    return this.acceptedNames!=null ?this.acceptedNames.build():null;
  }
  public V1CustomResourceDefinitionNames buildAcceptedNames() {
    return this.acceptedNames!=null ?this.acceptedNames.build():null;
  }
  public A withAcceptedNames(V1CustomResourceDefinitionNames acceptedNames) {
    _visitables.get("acceptedNames").remove(this.acceptedNames);
    if (acceptedNames!=null){ this.acceptedNames= new V1CustomResourceDefinitionNamesBuilder(acceptedNames); _visitables.get("acceptedNames").add(this.acceptedNames);} else { this.acceptedNames = null; _visitables.get("acceptedNames").remove(this.acceptedNames); } return (A) this;
  }
  public Boolean hasAcceptedNames() {
    return this.acceptedNames != null;
  }
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNames() {
    return new V1CustomResourceDefinitionStatusFluentImpl.AcceptedNamesNestedImpl();
  }
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> withNewAcceptedNamesLike(V1CustomResourceDefinitionNames item) {
    return new V1CustomResourceDefinitionStatusFluentImpl.AcceptedNamesNestedImpl(item);
  }
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editAcceptedNames() {
    return withNewAcceptedNamesLike(getAcceptedNames());
  }
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNames() {
    return withNewAcceptedNamesLike(getAcceptedNames() != null ? getAcceptedNames(): new V1CustomResourceDefinitionNamesBuilder().build());
  }
  public V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<A> editOrNewAcceptedNamesLike(V1CustomResourceDefinitionNames item) {
    return withNewAcceptedNamesLike(getAcceptedNames() != null ? getAcceptedNames(): item);
  }
  public A addToConditions(Integer index,V1CustomResourceDefinitionCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CustomResourceDefinitionConditionBuilder>();}
    V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1CustomResourceDefinitionCondition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CustomResourceDefinitionConditionBuilder>();}
    V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CustomResourceDefinitionConditionBuilder>();}
    for (V1CustomResourceDefinitionCondition item : items) {V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1CustomResourceDefinitionCondition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1CustomResourceDefinitionConditionBuilder>();}
    for (V1CustomResourceDefinitionCondition item : items) {V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... items) {
    for (V1CustomResourceDefinitionCondition item : items) {V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1CustomResourceDefinitionCondition> items) {
    for (V1CustomResourceDefinitionCondition item : items) {V1CustomResourceDefinitionConditionBuilder builder = new V1CustomResourceDefinitionConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1CustomResourceDefinitionConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1CustomResourceDefinitionConditionBuilder builder = each.next();
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
  public List<V1CustomResourceDefinitionCondition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1CustomResourceDefinitionCondition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1CustomResourceDefinitionCondition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1CustomResourceDefinitionCondition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1CustomResourceDefinitionCondition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1CustomResourceDefinitionCondition buildMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
    for (V1CustomResourceDefinitionConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
    for (V1CustomResourceDefinitionConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1CustomResourceDefinitionCondition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1CustomResourceDefinitionCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1CustomResourceDefinitionCondition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1CustomResourceDefinitionCondition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1CustomResourceDefinitionStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> addNewConditionLike(V1CustomResourceDefinitionCondition item) {
    return new V1CustomResourceDefinitionStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1CustomResourceDefinitionCondition item) {
    return new V1CustomResourceDefinitionStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1CustomResourceDefinitionStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1CustomResourceDefinitionConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public A addToStoredVersions(Integer index,String item) {
    if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
    this.storedVersions.add(index, item);
    return (A)this;
  }
  public A setToStoredVersions(Integer index,String item) {
    if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
    this.storedVersions.set(index, item); return (A)this;
  }
  public A addToStoredVersions(java.lang.String... items) {
    if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
    for (String item : items) {this.storedVersions.add(item);} return (A)this;
  }
  public A addAllToStoredVersions(Collection<String> items) {
    if (this.storedVersions == null) {this.storedVersions = new ArrayList<String>();}
    for (String item : items) {this.storedVersions.add(item);} return (A)this;
  }
  public A removeFromStoredVersions(java.lang.String... items) {
    for (String item : items) {if (this.storedVersions!= null){ this.storedVersions.remove(item);}} return (A)this;
  }
  public A removeAllFromStoredVersions(Collection<String> items) {
    for (String item : items) {if (this.storedVersions!= null){ this.storedVersions.remove(item);}} return (A)this;
  }
  public List<String> getStoredVersions() {
    return this.storedVersions;
  }
  public String getStoredVersion(Integer index) {
    return this.storedVersions.get(index);
  }
  public String getFirstStoredVersion() {
    return this.storedVersions.get(0);
  }
  public String getLastStoredVersion() {
    return this.storedVersions.get(storedVersions.size() - 1);
  }
  public String getMatchingStoredVersion(Predicate<String> predicate) {
    for (String item: storedVersions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingStoredVersion(Predicate<String> predicate) {
    for (String item: storedVersions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withStoredVersions(List<String> storedVersions) {
    if (storedVersions != null) {this.storedVersions = new ArrayList(); for (String item : storedVersions){this.addToStoredVersions(item);}} else { this.storedVersions = null;} return (A) this;
  }
  public A withStoredVersions(java.lang.String... storedVersions) {
    if (this.storedVersions != null) {this.storedVersions.clear();}
    if (storedVersions != null) {for (String item :storedVersions){ this.addToStoredVersions(item);}} return (A) this;
  }
  public Boolean hasStoredVersions() {
    return storedVersions != null && !storedVersions.isEmpty();
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CustomResourceDefinitionStatusFluentImpl that = (V1CustomResourceDefinitionStatusFluentImpl) o;
    if (acceptedNames != null ? !acceptedNames.equals(that.acceptedNames) :that.acceptedNames != null) return false;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (storedVersions != null ? !storedVersions.equals(that.storedVersions) :that.storedVersions != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(acceptedNames,  conditions,  storedVersions,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (acceptedNames != null) { sb.append("acceptedNames:"); sb.append(acceptedNames + ","); }
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (storedVersions != null && !storedVersions.isEmpty()) { sb.append("storedVersions:"); sb.append(storedVersions); }
    sb.append("}");
    return sb.toString();
  }
  class AcceptedNamesNestedImpl<N> extends V1CustomResourceDefinitionNamesFluentImpl<V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>> implements V1CustomResourceDefinitionStatusFluent.AcceptedNamesNested<N>,Nested<N>{
    AcceptedNamesNestedImpl(V1CustomResourceDefinitionNames item) {
      this.builder = new V1CustomResourceDefinitionNamesBuilder(this, item);
    }
    AcceptedNamesNestedImpl() {
      this.builder = new V1CustomResourceDefinitionNamesBuilder(this);
    }
    V1CustomResourceDefinitionNamesBuilder builder;
    public N and() {
      return (N) V1CustomResourceDefinitionStatusFluentImpl.this.withAcceptedNames(builder.build());
    }
    public N endAcceptedNames() {
      return and();
    }
    
  }
  class ConditionsNestedImpl<N> extends V1CustomResourceDefinitionConditionFluentImpl<V1CustomResourceDefinitionStatusFluent.ConditionsNested<N>> implements V1CustomResourceDefinitionStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1CustomResourceDefinitionCondition item) {
      this.index = index;
      this.builder = new V1CustomResourceDefinitionConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1CustomResourceDefinitionConditionBuilder(this);
    }
    V1CustomResourceDefinitionConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1CustomResourceDefinitionStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}