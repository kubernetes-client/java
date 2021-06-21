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

public class V1APIServiceStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1APIServiceStatusFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> conditions;

    public V1APIServiceStatusFluentImpl() {
    }

    public V1APIServiceStatusFluentImpl(io.kubernetes.client.openapi.models.V1APIServiceStatus instance) {
        this.withConditions(instance.getConditions());
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1APIServiceCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1APIServiceCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1APIServiceCondition item : items) {io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1APIServiceCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1APIServiceCondition item : items) {io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... items) {
        for (io.kubernetes.client.openapi.models.V1APIServiceCondition item : items) {io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1APIServiceCondition> items) {
        for (io.kubernetes.client.openapi.models.V1APIServiceCondition item : items) {io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder = each.next();
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
        public java.util.List<io.kubernetes.client.openapi.models.V1APIServiceCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1APIServiceCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1APIServiceCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1APIServiceCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1APIServiceCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1APIServiceCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1APIServiceCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1APIServiceStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1APIServiceCondition item) {
        return new io.kubernetes.client.openapi.models.V1APIServiceStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1APIServiceCondition item) {
        return new io.kubernetes.client.openapi.models.V1APIServiceStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder> predicate) {
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
        V1APIServiceStatusFluentImpl that = (V1APIServiceStatusFluentImpl) o;
        if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(conditions,  super.hashCode());
    }

    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1APIServiceConditionFluentImpl<io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1APIServiceStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1APIServiceCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1APIServiceConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1APIServiceStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


}
