package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.time.OffsetDateTime;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;

public class V2alpha1CronJobStatusFluentImpl<A extends io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent<A> {

    private java.util.List<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> active;
    private java.time.OffsetDateTime lastScheduleTime;

    public V2alpha1CronJobStatusFluentImpl() {
    }

    public V2alpha1CronJobStatusFluentImpl(io.kubernetes.client.openapi.models.V2alpha1CronJobStatus instance) {
        this.withActive(instance.getActive());
        
        this.withLastScheduleTime(instance.getLastScheduleTime());
    }

    public A addToActive(int index,io.kubernetes.client.openapi.models.V1ObjectReference item) {
        if (this.active == null) {this.active = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();}
        io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);_visitables.get("active").add(index >= 0 ? index : _visitables.get("active").size(), builder);this.active.add(index >= 0 ? index : active.size(), builder); return (A)this;
    }

    public A setToActive(int index,io.kubernetes.client.openapi.models.V1ObjectReference item) {
        if (this.active == null) {this.active = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();}
        io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);
        if (index < 0 || index >= _visitables.get("active").size()) { _visitables.get("active").add(builder); } else { _visitables.get("active").set(index, builder);}
        if (index < 0 || index >= active.size()) { active.add(builder); } else { active.set(index, builder);}
         return (A)this;
    }

    public A addToActive(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
        if (this.active == null) {this.active = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);_visitables.get("active").add(builder);this.active.add(builder);} return (A)this;
    }

    public A addAllToActive(java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items) {
        if (this.active == null) {this.active = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>();}
        for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);_visitables.get("active").add(builder);this.active.add(builder);} return (A)this;
    }

    public A removeFromActive(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
        for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);_visitables.get("active").remove(builder);if (this.active != null) {this.active.remove(builder);}} return (A)this;
    }

    public A removeAllFromActive(java.util.Collection<io.kubernetes.client.openapi.models.V1ObjectReference> items) {
        for (io.kubernetes.client.openapi.models.V1ObjectReference item : items) {io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(item);_visitables.get("active").remove(builder);if (this.active != null) {this.active.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate) {
        if (active == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> each = active.iterator();
        final List visitables = _visitables.get("active");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildActive instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> getActive() {
        return build(active);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> buildActive() {
        return build(active);
    }

    public io.kubernetes.client.openapi.models.V1ObjectReference buildActive(int index) {
        return this.active.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1ObjectReference buildFirstActive() {
        return this.active.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1ObjectReference buildLastActive() {
        return this.active.get(active.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1ObjectReference buildMatchingActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder item: active) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder item: active) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withActive(java.util.List<io.kubernetes.client.openapi.models.V1ObjectReference> active) {
        if (this.active != null) { _visitables.get("active").removeAll(this.active);}
        if (active != null) {this.active = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder>(); for (io.kubernetes.client.openapi.models.V1ObjectReference item : active){this.addToActive(item);}} else { this.active = null;} return (A) this;
    }

    public A withActive(io.kubernetes.client.openapi.models.V1ObjectReference... active) {
        if (this.active != null) {this.active.clear();}
        if (active != null) {for (io.kubernetes.client.openapi.models.V1ObjectReference item :active){ this.addToActive(item);}} return (A) this;
    }

    public java.lang.Boolean hasActive() {
        return active != null && !active.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> addNewActive() {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluentImpl.ActiveNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> addNewActiveLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluentImpl.ActiveNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> setNewActiveLike(int index,io.kubernetes.client.openapi.models.V1ObjectReference item) {
        return new io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluentImpl.ActiveNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editActive(int index) {
        if (active.size() <= index) throw new RuntimeException("Can't edit active. Index exceeds size.");
        return setNewActiveLike(index, buildActive(index));
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editFirstActive() {
        if (active.size() == 0) throw new RuntimeException("Can't edit first active. The list is empty.");
        return setNewActiveLike(0, buildActive(0));
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editLastActive() {
        int index = active.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last active. The list is empty.");
        return setNewActiveLike(index, buildActive(index));
    }

    public io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<A> editMatchingActive(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder> predicate) {
        int index = -1;
        for (int i=0;i<active.size();i++) { 
        if (predicate.test(active.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching active. No match found.");
        return setNewActiveLike(index, buildActive(index));
    }

    public java.time.OffsetDateTime getLastScheduleTime() {
        return this.lastScheduleTime;
    }

    public A withLastScheduleTime(java.time.OffsetDateTime lastScheduleTime) {
        this.lastScheduleTime=lastScheduleTime; return (A) this;
    }

    public java.lang.Boolean hasLastScheduleTime() {
        return this.lastScheduleTime != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V2alpha1CronJobStatusFluentImpl that = (V2alpha1CronJobStatusFluentImpl) o;
        if (active != null ? !active.equals(that.active) :that.active != null) return false;
        if (lastScheduleTime != null ? !lastScheduleTime.equals(that.lastScheduleTime) :that.lastScheduleTime != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(active,  lastScheduleTime,  super.hashCode());
    }

    public class ActiveNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<N>> implements io.kubernetes.client.openapi.models.V2alpha1CronJobStatusFluent.ActiveNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;
        private final int index;

            ActiveNestedImpl(int index,io.kubernetes.client.openapi.models.V1ObjectReference item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
                        
            }

            ActiveNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
                        
            }

            public N and() {
                return (N) V2alpha1CronJobStatusFluentImpl.this.setToActive(index,builder.build());
            }

            public N endActive() {
                return and();
            }
    }


}
