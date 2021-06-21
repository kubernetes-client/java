package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1beta1PriorityLevelConfigurationStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> conditions;

    public V1beta1PriorityLevelConfigurationStatusFluentImpl() {
    }

    public V1beta1PriorityLevelConfigurationStatusFluentImpl(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatus instance) {
        this.withConditions(instance.getConditions());
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item : items) {io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item : items) {io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... items) {
        for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item : items) {io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> items) {
        for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item : items) {io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item) {
        return new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item) {
        return new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<conditions.size();i++) { 
        if (predicate.test(conditions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1PriorityLevelConfigurationStatusFluentImpl that = (V1beta1PriorityLevelConfigurationStatusFluentImpl) o;
        if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(conditions,  super.hashCode());
    }

    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionFluentImpl<io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1PriorityLevelConfigurationConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1PriorityLevelConfigurationStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


}
