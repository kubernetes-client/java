package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Long;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1ValidatingAdmissionPolicyStatusFluent<A extends V1alpha1ValidatingAdmissionPolicyStatusFluent<A>> extends BaseFluent<A>{
  public V1alpha1ValidatingAdmissionPolicyStatusFluent() {
  }
  
  public V1alpha1ValidatingAdmissionPolicyStatusFluent(V1alpha1ValidatingAdmissionPolicyStatus instance) {
    this.copyInstance(instance);
  }
  private ArrayList<V1ConditionBuilder> conditions;
  private Long observedGeneration;
  private V1alpha1TypeCheckingBuilder typeChecking;
  
  protected void copyInstance(V1alpha1ValidatingAdmissionPolicyStatus instance) {
    instance = (instance != null ? instance : new V1alpha1ValidatingAdmissionPolicyStatus());
    if (instance != null) {
          this.withConditions(instance.getConditions());
          this.withObservedGeneration(instance.getObservedGeneration());
          this.withTypeChecking(instance.getTypeChecking());
        }
  }
  
  public A addToConditions(int index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").add(index, builder); conditions.add(index, builder);}
    return (A)this;
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {this.conditions = new ArrayList<V1ConditionBuilder>();}
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= conditions.size()) { _visitables.get("conditions").add(builder); conditions.add(builder); } else { _visitables.get("conditions").set(index, builder); conditions.set(index, builder);}
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
    if (this.conditions == null) return (A)this;
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
  }
  
  public A removeAllFromConditions(Collection<V1Condition> items) {
    if (this.conditions == null) return (A)this;
    for (V1Condition item : items) {V1ConditionBuilder builder = new V1ConditionBuilder(item);_visitables.get("conditions").remove(builder); this.conditions.remove(builder);} return (A)this;
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
  
  public List<V1Condition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1Condition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList();
        for (V1Condition item : conditions) {
          this.addToConditions(item);
        }
    } else {
      this.conditions = null;
    }
    return (A) this;
  }
  
  public A withConditions(io.kubernetes.client.openapi.models.V1Condition... conditions) {
    if (this.conditions != null) {
        this.conditions.clear();
        _visitables.remove("conditions");
    }
    if (conditions != null) {
      for (V1Condition item : conditions) {
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
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
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
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    int index = -1;
    for (int i=0;i<conditions.size();i++) { 
    if (predicate.test(conditions.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
    return setNewConditionLike(index, buildCondition(index));
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
  }
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public V1alpha1TypeChecking buildTypeChecking() {
    return this.typeChecking != null ? this.typeChecking.build() : null;
  }
  
  public A withTypeChecking(V1alpha1TypeChecking typeChecking) {
    this._visitables.remove("typeChecking");
    if (typeChecking != null) {
        this.typeChecking = new V1alpha1TypeCheckingBuilder(typeChecking);
        this._visitables.get("typeChecking").add(this.typeChecking);
    } else {
        this.typeChecking = null;
        this._visitables.get("typeChecking").remove(this.typeChecking);
    }
    return (A) this;
  }
  
  public boolean hasTypeChecking() {
    return this.typeChecking != null;
  }
  
  public TypeCheckingNested<A> withNewTypeChecking() {
    return new TypeCheckingNested(null);
  }
  
  public TypeCheckingNested<A> withNewTypeCheckingLike(V1alpha1TypeChecking item) {
    return new TypeCheckingNested(item);
  }
  
  public TypeCheckingNested<A> editTypeChecking() {
    return withNewTypeCheckingLike(java.util.Optional.ofNullable(buildTypeChecking()).orElse(null));
  }
  
  public TypeCheckingNested<A> editOrNewTypeChecking() {
    return withNewTypeCheckingLike(java.util.Optional.ofNullable(buildTypeChecking()).orElse(new V1alpha1TypeCheckingBuilder().build()));
  }
  
  public TypeCheckingNested<A> editOrNewTypeCheckingLike(V1alpha1TypeChecking item) {
    return withNewTypeCheckingLike(java.util.Optional.ofNullable(buildTypeChecking()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ValidatingAdmissionPolicyStatusFluent that = (V1alpha1ValidatingAdmissionPolicyStatusFluent) o;
    if (!java.util.Objects.equals(conditions, that.conditions)) return false;
    if (!java.util.Objects.equals(observedGeneration, that.observedGeneration)) return false;
    if (!java.util.Objects.equals(typeChecking, that.typeChecking)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(conditions,  observedGeneration,  typeChecking,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditions != null && !conditions.isEmpty()) { sb.append("conditions:"); sb.append(conditions + ","); }
    if (observedGeneration != null) { sb.append("observedGeneration:"); sb.append(observedGeneration + ","); }
    if (typeChecking != null) { sb.append("typeChecking:"); sb.append(typeChecking); }
    sb.append("}");
    return sb.toString();
  }
  public class ConditionsNested<N> extends V1ConditionFluent<ConditionsNested<N>> implements Nested<N>{
    ConditionsNested(int index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
    V1ConditionBuilder builder;
    int index;
    
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyStatusFluent.this.setToConditions(index,builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  
  }
  public class TypeCheckingNested<N> extends V1alpha1TypeCheckingFluent<TypeCheckingNested<N>> implements Nested<N>{
    TypeCheckingNested(V1alpha1TypeChecking item) {
      this.builder = new V1alpha1TypeCheckingBuilder(this, item);
    }
    V1alpha1TypeCheckingBuilder builder;
    
    public N and() {
      return (N) V1alpha1ValidatingAdmissionPolicyStatusFluent.this.withTypeChecking(builder.build());
    }
    
    public N endTypeChecking() {
      return and();
    }
    
  
  }

}