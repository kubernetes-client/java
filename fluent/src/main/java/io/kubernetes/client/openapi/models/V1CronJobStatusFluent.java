package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1CronJobStatusFluent<A extends io.kubernetes.client.openapi.models.V1CronJobStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ObjectReferenceBuilder> active;
  private OffsetDateTime lastScheduleTime;
  private OffsetDateTime lastSuccessfulTime;

  public V1CronJobStatusFluent() {
  }
  
  public V1CronJobStatusFluent(V1CronJobStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToActive(Collection<V1ObjectReference> items) {
    if (this.active == null) {
      this.active = new ArrayList();
    }
    for (V1ObjectReference item : items) {
        V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
        _visitables.get("active").add(builder);
        this.active.add(builder);
    }
    return (A) this;
  }
  
  public ActiveNested<A> addNewActive() {
    return new ActiveNested(-1, null);
  }
  
  public ActiveNested<A> addNewActiveLike(V1ObjectReference item) {
    return new ActiveNested(-1, item);
  }
  
  public A addToActive(V1ObjectReference... items) {
    if (this.active == null) {
      this.active = new ArrayList();
    }
    for (V1ObjectReference item : items) {
        V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
        _visitables.get("active").add(builder);
        this.active.add(builder);
    }
    return (A) this;
  }
  
  public A addToActive(int index,V1ObjectReference item) {
    if (this.active == null) {
      this.active = new ArrayList();
    }
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= active.size()) {
        _visitables.get("active").add(builder);
        active.add(builder);
    } else {
        _visitables.get("active").add(builder);
        active.add(index, builder);
    }
    return (A) this;
  }
  
  public List<V1ObjectReference> buildActive() {
    return this.active != null ? build(active) : null;
  }
  
  public V1ObjectReference buildActive(int index) {
    return this.active.get(index).build();
  }
  
  public V1ObjectReference buildFirstActive() {
    return this.active.get(0).build();
  }
  
  public V1ObjectReference buildLastActive() {
    return this.active.get(active.size() - 1).build();
  }
  
  public V1ObjectReference buildMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate) {
      for (V1ObjectReferenceBuilder item : active) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1CronJobStatus instance) {
    instance = instance != null ? instance : new V1CronJobStatus();
    if (instance != null) {
        this.withActive(instance.getActive());
        this.withLastScheduleTime(instance.getLastScheduleTime());
        this.withLastSuccessfulTime(instance.getLastSuccessfulTime());
    }
  }
  
  public ActiveNested<A> editActive(int index) {
    if (active.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "active"));
    }
    return this.setNewActiveLike(index, this.buildActive(index));
  }
  
  public ActiveNested<A> editFirstActive() {
    if (active.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "active"));
    }
    return this.setNewActiveLike(0, this.buildActive(0));
  }
  
  public ActiveNested<A> editLastActive() {
    int index = active.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "active"));
    }
    return this.setNewActiveLike(index, this.buildActive(index));
  }
  
  public ActiveNested<A> editMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < active.size();i++) {
      if (predicate.test(active.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "active"));
    }
    return this.setNewActiveLike(index, this.buildActive(index));
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
    V1CronJobStatusFluent that = (V1CronJobStatusFluent) o;
    if (!(Objects.equals(active, that.active))) {
      return false;
    }
    if (!(Objects.equals(lastScheduleTime, that.lastScheduleTime))) {
      return false;
    }
    if (!(Objects.equals(lastSuccessfulTime, that.lastSuccessfulTime))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getLastScheduleTime() {
    return this.lastScheduleTime;
  }
  
  public OffsetDateTime getLastSuccessfulTime() {
    return this.lastSuccessfulTime;
  }
  
  public boolean hasActive() {
    return this.active != null && !(this.active.isEmpty());
  }
  
  public boolean hasLastScheduleTime() {
    return this.lastScheduleTime != null;
  }
  
  public boolean hasLastSuccessfulTime() {
    return this.lastSuccessfulTime != null;
  }
  
  public boolean hasMatchingActive(Predicate<V1ObjectReferenceBuilder> predicate) {
      for (V1ObjectReferenceBuilder item : active) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime, lastSuccessfulTime);
  }
  
  public A removeAllFromActive(Collection<V1ObjectReference> items) {
    if (this.active == null) {
      return (A) this;
    }
    for (V1ObjectReference item : items) {
        V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
        _visitables.get("active").remove(builder);
        this.active.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromActive(V1ObjectReference... items) {
    if (this.active == null) {
      return (A) this;
    }
    for (V1ObjectReference item : items) {
        V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
        _visitables.get("active").remove(builder);
        this.active.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromActive(Predicate<V1ObjectReferenceBuilder> predicate) {
    if (active == null) {
      return (A) this;
    }
    Iterator<V1ObjectReferenceBuilder> each = active.iterator();
    List visitables = _visitables.get("active");
    while (each.hasNext()) {
        V1ObjectReferenceBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ActiveNested<A> setNewActiveLike(int index,V1ObjectReference item) {
    return new ActiveNested(index, item);
  }
  
  public A setToActive(int index,V1ObjectReference item) {
    if (this.active == null) {
      this.active = new ArrayList();
    }
    V1ObjectReferenceBuilder builder = new V1ObjectReferenceBuilder(item);
    if (index < 0 || index >= active.size()) {
        _visitables.get("active").add(builder);
        active.add(builder);
    } else {
        _visitables.get("active").add(builder);
        active.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(active == null) && !(active.isEmpty())) {
        sb.append("active:");
        sb.append(active);
        sb.append(",");
    }
    if (!(lastScheduleTime == null)) {
        sb.append("lastScheduleTime:");
        sb.append(lastScheduleTime);
        sb.append(",");
    }
    if (!(lastSuccessfulTime == null)) {
        sb.append("lastSuccessfulTime:");
        sb.append(lastSuccessfulTime);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withActive(List<V1ObjectReference> active) {
    if (this.active != null) {
      this._visitables.get("active").clear();
    }
    if (active != null) {
        this.active = new ArrayList();
        for (V1ObjectReference item : active) {
          this.addToActive(item);
        }
    } else {
      this.active = null;
    }
    return (A) this;
  }
  
  public A withActive(V1ObjectReference... active) {
    if (this.active != null) {
        this.active.clear();
        _visitables.remove("active");
    }
    if (active != null) {
      for (V1ObjectReference item : active) {
        this.addToActive(item);
      }
    }
    return (A) this;
  }
  
  public A withLastScheduleTime(OffsetDateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
    return (A) this;
  }
  
  public A withLastSuccessfulTime(OffsetDateTime lastSuccessfulTime) {
    this.lastSuccessfulTime = lastSuccessfulTime;
    return (A) this;
  }
  public class ActiveNested<N> extends V1ObjectReferenceFluent<ActiveNested<N>> implements Nested<N>{
  
    V1ObjectReferenceBuilder builder;
    int index;
  
    ActiveNested(int index,V1ObjectReference item) {
      this.index = index;
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
  
    public N and() {
      return (N) V1CronJobStatusFluent.this.setToActive(index, builder.build());
    }
    
    public N endActive() {
      return and();
    }
    
  }
}