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
  public class V1PodDisruptionBudgetStatusFluentImpl<A extends V1PodDisruptionBudgetStatusFluent<A>> extends BaseFluent<A> implements V1PodDisruptionBudgetStatusFluent<A>{
  public V1PodDisruptionBudgetStatusFluentImpl() {
  }
  public V1PodDisruptionBudgetStatusFluentImpl(V1PodDisruptionBudgetStatus instance) {
    this.withConditions(instance.getConditions());

    this.withCurrentHealthy(instance.getCurrentHealthy());

    this.withDesiredHealthy(instance.getDesiredHealthy());

    this.withDisruptedPods(instance.getDisruptedPods());

    this.withDisruptionsAllowed(instance.getDisruptionsAllowed());

    this.withExpectedPods(instance.getExpectedPods());

    this.withObservedGeneration(instance.getObservedGeneration());

  }
  private ArrayList<V1ConditionBuilder> conditions;
  private Integer currentHealthy;
  private Integer desiredHealthy;
  private Map<String,OffsetDateTime> disruptedPods;
  private Integer disruptionsAllowed;
  private Integer expectedPods;
  private Long observedGeneration;
  public A addToConditions(Integer index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
  }
  public A setToConditions(Integer index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
    if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
     return (A)this;
  }
  public A addToConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
  }
  public A removeFromConditions(io.kubernetes.client.openapi.models.V1Condition... items) {
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeAllFromConditions(Collection<V1Condition> items) {
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) return (A) this;
    final Iterator<V1ConditionBuilder> each = conditions.iterator();
    final List visitables = _visitables.get("conditions");
    while (each.hasNext()) {
      V1ConditionBuilder builder = each.next();
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
  public List<V1Condition> getConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public List<V1Condition> buildConditions() {
    return conditions != null ? build(conditions) : null;
  }
  public V1Condition buildCondition(Integer index) {
    return this.conditions.get(index).build();
  }
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    for (V1ConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    for (V1ConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
    if (conditions != null) {this.conditions = new ArrayList(); for (V1Condition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
  }
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions) {
    if (this.conditions != null) {this.conditions.clear();}
    if (conditions != null) {for (V1Condition item :conditions){ this.addToConditions(item);}} return (A) this;
  }
  public Boolean hasConditions() {
    return conditions != null && !conditions.isEmpty();
  }
  public V1PodDisruptionBudgetStatusFluent.ConditionsNested<A> addNewCondition() {
    return new V1PodDisruptionBudgetStatusFluentImpl.ConditionsNestedImpl();
  }
  public V1PodDisruptionBudgetStatusFluent.ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new V1PodDisruptionBudgetStatusFluentImpl.ConditionsNestedImpl(-1, item);
  }
  public V1PodDisruptionBudgetStatusFluent.ConditionsNested<A> setNewConditionLike(Integer index,V1Condition item) {
    return new V1PodDisruptionBudgetStatusFluentImpl.ConditionsNestedImpl(index, item);
  }
  public V1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editCondition(Integer index) {
    if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
    return setNewConditionLike(0, buildCondition(0));
  }
  public V1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public V1PodDisruptionBudgetStatusFluent.ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  public Integer getCurrentHealthy() {
    return this.currentHealthy;
  }
  public A withCurrentHealthy(Integer currentHealthy) {
    this.currentHealthy=currentHealthy; return (A) this;
  }
  public Boolean hasCurrentHealthy() {
    return this.currentHealthy != null;
  }
  public Integer getDesiredHealthy() {
    return this.desiredHealthy;
  }
  public A withDesiredHealthy(Integer desiredHealthy) {
    this.desiredHealthy=desiredHealthy; return (A) this;
  }
  public Boolean hasDesiredHealthy() {
    return this.desiredHealthy != null;
  }
  public A addToDisruptedPods(String key,OffsetDateTime value) {
    if(this.disruptedPods == null && key != null && value != null) { this.disruptedPods = new LinkedHashMap(); }
    if(key != null && value != null) {this.disruptedPods.put(key, value);} return (A)this;
  }
  public A addToDisruptedPods(Map<String,OffsetDateTime> map) {
    if(this.disruptedPods == null && map != null) { this.disruptedPods = new LinkedHashMap(); }
    if(map != null) { this.disruptedPods.putAll(map);} return (A)this;
  }
  public A removeFromDisruptedPods(String key) {
    if(this.disruptedPods == null) { return (A) this; }
    if(key != null && this.disruptedPods != null) {this.disruptedPods.remove(key);} return (A)this;
  }
  public A removeFromDisruptedPods(Map<String,OffsetDateTime> map) {
    if(this.disruptedPods == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.disruptedPods != null){this.disruptedPods.remove(key);}}} return (A)this;
  }
  public Map<String,OffsetDateTime> getDisruptedPods() {
    return this.disruptedPods;
  }
  public <K,V>A withDisruptedPods(Map<String,OffsetDateTime> disruptedPods) {
    if (disruptedPods == null) { this.disruptedPods =  null;} else {this.disruptedPods = new LinkedHashMap(disruptedPods);} return (A) this;
  }
  public Boolean hasDisruptedPods() {
    return this.disruptedPods != null;
  }
  public Integer getDisruptionsAllowed() {
    return this.disruptionsAllowed;
  }
  public A withDisruptionsAllowed(Integer disruptionsAllowed) {
    this.disruptionsAllowed=disruptionsAllowed; return (A) this;
  }
  public Boolean hasDisruptionsAllowed() {
    return this.disruptionsAllowed != null;
  }
  public Integer getExpectedPods() {
    return this.expectedPods;
  }
  public A withExpectedPods(Integer expectedPods) {
    this.expectedPods=expectedPods; return (A) this;
  }
  public Boolean hasExpectedPods() {
    return this.expectedPods != null;
  }
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration=observedGeneration; return (A) this;
  }
  public Boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodDisruptionBudgetStatusFluentImpl that = (V1PodDisruptionBudgetStatusFluentImpl) o;
    if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
    if (currentHealthy != null ? !currentHealthy.equals(that.currentHealthy) :that.currentHealthy != null) return false;
    if (desiredHealthy != null ? !desiredHealthy.equals(that.desiredHealthy) :that.desiredHealthy != null) return false;
    if (disruptedPods != null ? !disruptedPods.equals(that.disruptedPods) :that.disruptedPods != null) return false;
    if (disruptionsAllowed != null ? !disruptionsAllowed.equals(that.disruptionsAllowed) :that.disruptionsAllowed != null) return false;
    if (expectedPods != null ? !expectedPods.equals(that.expectedPods) :that.expectedPods != null) return false;
    if (observedGeneration != null ? !observedGeneration.equals(that.observedGeneration) :that.observedGeneration != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(conditions,  currentHealthy,  desiredHealthy,  disruptedPods,  disruptionsAllowed,  expectedPods,  observedGeneration,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (currentHealthy != null) { sb.append("currentHealthy:"); sb.append(currentHealthy + ","); }
    if (desiredHealthy != null) { sb.append("desiredHealthy:"); sb.append(desiredHealthy + ","); }
    if (disruptedPods != null && !disruptedPods.isEmpty()) { sb.append("disruptedPods:"); sb.append(disruptedPods + ","); }
    if (disruptionsAllowed != null) { sb.append("disruptionsAllowed:"); sb.append(disruptionsAllowed + ","); }
    if (expectedPods != null) { sb.append("expectedPods:"); sb.append(expectedPods + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration); }
    sb.append("}");
    return sb.toString();
  }
  class ConditionsNestedImpl<N> extends V1ConditionFluentImpl<V1PodDisruptionBudgetStatusFluent.ConditionsNested<N>> implements V1PodDisruptionBudgetStatusFluent.ConditionsNested<N>,Nested<N>{
    ConditionsNestedImpl(Integer index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
    ConditionsNestedImpl() {
      this.index = -1;
      this.builder = new V1ConditionBuilder(this);
    }
    V1ConditionBuilder builder;
    Integer index;
    public N and() {
      return (N) V1PodDisruptionBudgetStatusFluentImpl.this.setToConditions(index,builder.build());
    }
    public N endCondition() {
      return and();
    }
    
  }
  
}