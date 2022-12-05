package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
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

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1CronJobStatusFluentImpl<A extends V1CronJobStatusFluent<A>> extends BaseFluent<A> implements V1CronJobStatusFluent<A>{
  public V1CronJobStatusFluentImpl() {
  }
  public V1CronJobStatusFluentImpl(V1CronJobStatus instance) {
    this.withActive(instance.getActive());

    this.withLastScheduleTime(instance.getLastScheduleTime());

    this.withLastSuccessfulTime(instance.getLastSuccessfulTime());

  }
  private ArrayList<V1ObjectReferenceBuilder> active;
  private OffsetDateTime lastScheduleTime;
  private OffsetDateTime lastSuccessfulTime;
  public A addToActive(Integer index,V1ObjectReference item) {
    if (this.active == null) {this.active = new ArrayList<V1ObjectReferenceBuilder>();}
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("active").add(index >= 0 ? index : _visitables.get("active").size(), builder);this.active.add(index >= 0 ? index : active.size(), builder); return (A)this;
  }
  public A setToActive(Integer index,V1ObjectReference item) {
    if (this.active == null) {this.active = new ArrayList<V1ObjectReferenceBuilder>();}
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= _visitables.get("active").size()) { _visitables.get("active").add(builder); } else { _visitables.get("active").set(index, builder);}
    if (index < 0 || index >= active.size()) { active.add(builder); } else { active.set(index, builder);}
     return (A)this;
  }
  public A addToActive(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    if (this.active == null) {this.active = new ArrayList<V1ObjectReferenceBuilder>();}
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("active").add(builder);this.active.add(builder);} return (A)this;
  }
  public A addAllToActive(Collection<V1ObjectReference> items) {
    if (this.active == null) {this.active = new ArrayList<V1ObjectReferenceBuilder>();}
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("active").add(builder);this.active.add(builder);} return (A)this;
  }
  public A removeFromActive(io.kubernetes.client.openapi.models.V1ObjectReference... items) {
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("active").remove(builder);if (this.active != null) {this.active.remove(builder);}} return (A)this;
  }
  public A removeAllFromActive(Collection<V1ObjectReference> items) {
    for (V1ObjectReference item : items) {V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);_visitables.get("active").remove(builder);if (this.active != null) {this.active.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromActive(Predicate<V1ObjectReferenceBuilder> predicate) {
    if (active == null) return (A) this;
    final Iterator<V1ObjectReferenceBuilder> each = active.iterator();
    final List visitables = _visitables.get("active");
    while (each.hasNext()) {
      V1ObjectReferenceBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildActive instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1ObjectReference> getActive() {
    return active != null ? build(active) : null;
  }
  public List<V1ObjectReference> buildActive() {
    return active != null ? build(active) : null;
  }
  public V1ObjectReference buildActive(Integer index) {
    return this.active.get(index).build();
  }
  public V1ObjectReference buildFirstActive() {
    return this.active.get(0).build();
  }
  public V1ObjectReference buildLastActive() {
    return this.active.get(active.size() - 1).build();
  }
  public V1ObjectReference buildMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate) {
    for (V1ObjectReferenceBuilder item: active) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate) {
    for (V1ObjectReferenceBuilder item: active) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withActive(List<V1ObjectReference> active) {
    if (this.active != null) { _visitables.get("active").removeAll(this.active);}
    if (active != null) {this.active = new ArrayList(); for (V1ObjectReference item : active){this.addToActive(item);}} else { this.active = null;} return (A) this;
  }
  public A withActive(io.kubernetes.client.openapi.models.V1ObjectReference... active) {
    if (this.active != null) {this.active.clear();}
    if (active != null) {for (V1ObjectReference item :active){ this.addToActive(item);}} return (A) this;
  }
  public Boolean hasActive() {
    return active != null && !active.isEmpty();
  }
  public V1CronJobStatusFluent.ActiveNested<A> addNewActive() {
    return new V1CronJobStatusFluentImpl.ActiveNestedImpl();
  }
  public V1CronJobStatusFluent.ActiveNested<A> addNewActiveLike(V1ObjectReference item) {
    return new V1CronJobStatusFluentImpl.ActiveNestedImpl(-1, item);
  }
  public V1CronJobStatusFluent.ActiveNested<A> setNewActiveLike(Integer index,V1ObjectReference item) {
    return new V1CronJobStatusFluentImpl.ActiveNestedImpl(index, item);
  }
  public V1CronJobStatusFluent.ActiveNested<A> editActive(Integer index) {
    if (active.size() <= index) throw new RuntimeException("Can't edit active. Index exceeds size.");
    return setNewActiveLike(index, buildActive(index));
  }
  public V1CronJobStatusFluent.ActiveNested<A> editFirstActive() {
    if (active.size() == 0) throw new RuntimeException("Can't edit first active. The list is empty.");
    return setNewActiveLike(0, buildActive(0));
  }
  public V1CronJobStatusFluent.ActiveNested<A> editLastActive() {
    int index = active.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last active. The list is empty.");
    return setNewActiveLike(index, buildActive(index));
  }
  public V1CronJobStatusFluent.ActiveNested<A> editMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i=0;i<active.size();i++) { 
    if (predicate.test(active.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching active. No match found.");
    return setNewActiveLike(index, buildActive(index));
  }
  public OffsetDateTime getLastScheduleTime() {
    return this.lastScheduleTime;
  }
  public A withLastScheduleTime(OffsetDateTime lastScheduleTime) {
    this.lastScheduleTime=lastScheduleTime; return (A) this;
  }
  public Boolean hasLastScheduleTime() {
    return this.lastScheduleTime != null;
  }
  public OffsetDateTime getLastSuccessfulTime() {
    return this.lastSuccessfulTime;
  }
  public A withLastSuccessfulTime(OffsetDateTime lastSuccessfulTime) {
    this.lastSuccessfulTime=lastSuccessfulTime; return (A) this;
  }
  public Boolean hasLastSuccessfulTime() {
    return this.lastSuccessfulTime != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1CronJobStatusFluentImpl that = (V1CronJobStatusFluentImpl) o;
    if (active != null ? !active.equals(that.active) :that.active != null) return false;
    if (lastScheduleTime != null ? !lastScheduleTime.equals(that.lastScheduleTime) :that.lastScheduleTime != null) return false;
    if (lastSuccessfulTime != null ? !lastSuccessfulTime.equals(that.lastSuccessfulTime) :that.lastSuccessfulTime != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(active,  lastScheduleTime,  lastSuccessfulTime,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (active != null && !active.isEmpty()) { sb.append("active:"); sb.append(active + ","); }
    if (lastScheduleTime != null) { sb.append("lastScheduleTime:"); sb.append(lastScheduleTime + ","); }
    if (lastSuccessfulTime != null) { sb.append("lastSuccessfulTime:"); sb.append(lastSuccessfulTime); }
    sb.append("}");
    return sb.toString();
  }
  class ActiveNestedImpl<N> extends V1ObjectReferenceFluentImpl<V1CronJobStatusFluent.ActiveNested<N>> implements V1CronJobStatusFluent.ActiveNested<N>,Nested<N>{
    ActiveNestedImpl(Integer index,V1ObjectReference item) {
      this.index = index;
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    ActiveNestedImpl() {
      this.index = -1;
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    Integer index;
    public N and() {
      return (N) V1CronJobStatusFluentImpl.this.setToActive(index,builder.build());
    }
    public N endActive() {
      return and();
    }
    
  }
  
}