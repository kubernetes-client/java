package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Integer;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V1JobStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V1JobStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1JobStatusFluent<A> {

    private java.lang.Integer active;
    private java.time.OffsetDateTime completionTime;
    private java.util.List<io.kubernetes.client.openapi.models.V1JobConditionBuilder> conditions;
    private java.lang.Integer failed;
    private java.time.OffsetDateTime startTime;
    private java.lang.Integer succeeded;

    public V1JobStatusFluentImpl() {
    }

    public V1JobStatusFluentImpl(io.kubernetes.client.openapi.models.V1JobStatus instance) {
        this.withActive(instance.getActive());
        
        this.withCompletionTime(instance.getCompletionTime());
        
        this.withConditions(instance.getConditions());
        
        this.withFailed(instance.getFailed());
        
        this.withStartTime(instance.getStartTime());
        
        this.withSucceeded(instance.getSucceeded());
    }

    public java.lang.Integer getActive() {
        return this.active;
    }

    public A withActive(java.lang.Integer active) {
        this.active=active; return (A) this;
    }

    public java.lang.Boolean hasActive() {
        return this.active != null;
    }

    public java.time.OffsetDateTime getCompletionTime() {
        return this.completionTime;
    }

    public A withCompletionTime(java.time.OffsetDateTime completionTime) {
        this.completionTime=completionTime; return (A) this;
    }

    public java.lang.Boolean hasCompletionTime() {
        return this.completionTime != null;
    }

    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1JobCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JobConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1JobConditionBuilder builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(item);_visitables.get("conditions").add(index >= 0 ? index : _visitables.get("conditions").size(), builder);this.conditions.add(index >= 0 ? index : conditions.size(), builder); return (A)this;
    }

    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1JobCondition item) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JobConditionBuilder>();}
        io.kubernetes.client.openapi.models.V1JobConditionBuilder builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(item);
        if (index < 0 || index >= _visitables.get("conditions").size()) { _visitables.get("conditions").add(builder); } else { _visitables.get("conditions").set(index, builder);}
        if (index < 0 || index >= conditions.size()) { conditions.add(builder); } else { conditions.set(index, builder);}
         return (A)this;
    }

    public A addToConditions(io.kubernetes.client.openapi.models.V1JobCondition... items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JobConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1JobCondition item : items) {io.kubernetes.client.openapi.models.V1JobConditionBuilder builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1JobCondition> items) {
        if (this.conditions == null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JobConditionBuilder>();}
        for (io.kubernetes.client.openapi.models.V1JobCondition item : items) {io.kubernetes.client.openapi.models.V1JobConditionBuilder builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(item);_visitables.get("conditions").add(builder);this.conditions.add(builder);} return (A)this;
    }

    public A removeFromConditions(io.kubernetes.client.openapi.models.V1JobCondition... items) {
        for (io.kubernetes.client.openapi.models.V1JobCondition item : items) {io.kubernetes.client.openapi.models.V1JobConditionBuilder builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1JobCondition> items) {
        for (io.kubernetes.client.openapi.models.V1JobCondition item : items) {io.kubernetes.client.openapi.models.V1JobConditionBuilder builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(item);_visitables.get("conditions").remove(builder);if (this.conditions != null) {this.conditions.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate) {
        if (conditions == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1JobConditionBuilder> each = conditions.iterator();
        final List visitables = _visitables.get("conditions");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1JobConditionBuilder builder = each.next();
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
        public java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> getConditions() {
        return build(conditions);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> buildConditions() {
        return build(conditions);
    }

    public io.kubernetes.client.openapi.models.V1JobCondition buildCondition(int index) {
        return this.conditions.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1JobCondition buildFirstCondition() {
        return this.conditions.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1JobCondition buildLastCondition() {
        return this.conditions.get(conditions.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1JobCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1JobConditionBuilder item: conditions) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1JobConditionBuilder item: conditions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1JobCondition> conditions) {
        if (this.conditions != null) { _visitables.get("conditions").removeAll(this.conditions);}
        if (conditions != null) {this.conditions = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1JobConditionBuilder>(); for (io.kubernetes.client.openapi.models.V1JobCondition item : conditions){this.addToConditions(item);}} else { this.conditions = null;} return (A) this;
    }

    public A withConditions(io.kubernetes.client.openapi.models.V1JobCondition... conditions) {
        if (this.conditions != null) {this.conditions.clear();}
        if (conditions != null) {for (io.kubernetes.client.openapi.models.V1JobCondition item :conditions){ this.addToConditions(item);}} return (A) this;
    }

    public java.lang.Boolean hasConditions() {
        return conditions != null && !conditions.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> addNewCondition() {
        return new io.kubernetes.client.openapi.models.V1JobStatusFluentImpl.ConditionsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1JobCondition item) {
        return new io.kubernetes.client.openapi.models.V1JobStatusFluentImpl.ConditionsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1JobCondition item) {
        return new io.kubernetes.client.openapi.models.V1JobStatusFluentImpl.ConditionsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editCondition(int index) {
        if (conditions.size() <= index) throw new RuntimeException("Can't edit conditions. Index exceeds size.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editFirstCondition() {
        if (conditions.size() == 0) throw new RuntimeException("Can't edit first conditions. The list is empty.");
        return setNewConditionLike(0, buildCondition(0));
    }

    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editLastCondition() {
        int index = conditions.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last conditions. The list is empty.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1JobConditionBuilder> predicate) {
        int index = -1;
        for (int i=0;i<conditions.size();i++) { 
        if (predicate.test(conditions.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching conditions. No match found.");
        return setNewConditionLike(index, buildCondition(index));
    }

    public java.lang.Integer getFailed() {
        return this.failed;
    }

    public A withFailed(java.lang.Integer failed) {
        this.failed=failed; return (A) this;
    }

    public java.lang.Boolean hasFailed() {
        return this.failed != null;
    }

    public java.time.OffsetDateTime getStartTime() {
        return this.startTime;
    }

    public A withStartTime(java.time.OffsetDateTime startTime) {
        this.startTime=startTime; return (A) this;
    }

    public java.lang.Boolean hasStartTime() {
        return this.startTime != null;
    }

    public java.lang.Integer getSucceeded() {
        return this.succeeded;
    }

    public A withSucceeded(java.lang.Integer succeeded) {
        this.succeeded=succeeded; return (A) this;
    }

    public java.lang.Boolean hasSucceeded() {
        return this.succeeded != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1JobStatusFluentImpl that = (V1JobStatusFluentImpl) o;
        if (active != null ? !active.equals(that.active) :that.active != null) return false;
        if (completionTime != null ? !completionTime.equals(that.completionTime) :that.completionTime != null) return false;
        if (conditions != null ? !conditions.equals(that.conditions) :that.conditions != null) return false;
        if (failed != null ? !failed.equals(that.failed) :that.failed != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) :that.startTime != null) return false;
        if (succeeded != null ? !succeeded.equals(that.succeeded) :that.succeeded != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(active,  completionTime,  conditions,  failed,  startTime,  succeeded,  super.hashCode());
    }

    public class ConditionsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1JobConditionFluentImpl<io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<N>> implements io.kubernetes.client.openapi.models.V1JobStatusFluent.ConditionsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1JobConditionBuilder builder;
        private final int index;

            ConditionsNestedImpl(int index,io.kubernetes.client.openapi.models.V1JobCondition item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(this, item);
                        
            }

            ConditionsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1JobConditionBuilder(this);
                        
            }

            public N and() {
                return (N) V1JobStatusFluentImpl.this.setToConditions(index,builder.build());
            }

            public N endCondition() {
                return and();
            }
    }


}
