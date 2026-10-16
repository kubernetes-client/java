/*
Copyright 2026 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1VolumeHealthStatusFluent<A extends V1VolumeHealthStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1VolumeHealthConditionBuilder> healthConditions;
  private OffsetDateTime lastTransitionTime;

  public V1VolumeHealthStatusFluent() {
  }
  
  public V1VolumeHealthStatusFluent(V1VolumeHealthStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToHealthConditions(Collection<V1VolumeHealthCondition> items) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    for (V1VolumeHealthCondition item : items) {
        V1VolumeHealthConditionBuilder builder = new V1VolumeHealthConditionBuilder(item);
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(builder);
    }
    return (A) this;
  }
  
  public HealthConditionsNested<A> addNewHealthCondition() {
    return new HealthConditionsNested<>(-1, null);
  }
  
  public HealthConditionsNested<A> addNewHealthConditionLike(V1VolumeHealthCondition item) {
    return new HealthConditionsNested<>(-1, item);
  }
  
  public A addToHealthConditions(V1VolumeHealthCondition... items) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    for (V1VolumeHealthCondition item : items) {
        V1VolumeHealthConditionBuilder builder = new V1VolumeHealthConditionBuilder(item);
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToHealthConditions(int index,V1VolumeHealthCondition item) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    V1VolumeHealthConditionBuilder builder = new V1VolumeHealthConditionBuilder(item);
    if (index < 0 || index >= this.healthConditions.size()) {
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(builder);
    } else {
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1VolumeHealthCondition buildFirstHealthCondition() {
    return this.healthConditions.get(0).build();
  }
  
  public V1VolumeHealthCondition buildHealthCondition(int index) {
    return this.healthConditions.get(index).build();
  }
  
  public List<V1VolumeHealthCondition> buildHealthConditions() {
    return this.healthConditions != null ? build(healthConditions) : null;
  }
  
  public V1VolumeHealthCondition buildLastHealthCondition() {
    return this.healthConditions.get(healthConditions.size() - 1).build();
  }
  
  public V1VolumeHealthCondition buildMatchingHealthCondition(Predicate<V1VolumeHealthConditionBuilder> predicate) {
      for (V1VolumeHealthConditionBuilder item : healthConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1VolumeHealthStatus instance) {
    instance = instance != null ? instance : new V1VolumeHealthStatus();
    if (instance != null) {
        this.withHealthConditions(instance.getHealthConditions());
        this.withLastTransitionTime(instance.getLastTransitionTime());
    }
  }
  
  public HealthConditionsNested<A> editFirstHealthCondition() {
    if (healthConditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "healthConditions"));
    }
    return this.setNewHealthConditionLike(0, this.buildHealthCondition(0));
  }
  
  public HealthConditionsNested<A> editHealthCondition(int index) {
    if (healthConditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "healthConditions"));
    }
    return this.setNewHealthConditionLike(index, this.buildHealthCondition(index));
  }
  
  public HealthConditionsNested<A> editLastHealthCondition() {
    int index = healthConditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "healthConditions"));
    }
    return this.setNewHealthConditionLike(index, this.buildHealthCondition(index));
  }
  
  public HealthConditionsNested<A> editMatchingHealthCondition(Predicate<V1VolumeHealthConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < healthConditions.size();i++) {
      if (predicate.test(healthConditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "healthConditions"));
    }
    return this.setNewHealthConditionLike(index, this.buildHealthCondition(index));
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
    V1VolumeHealthStatusFluent<?> that = (V1VolumeHealthStatusFluent<?>) o;
    if (!(Objects.equals(healthConditions, that.healthConditions))) {
      return false;
    }
    if (!(Objects.equals(lastTransitionTime, that.lastTransitionTime))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getLastTransitionTime() {
    return this.lastTransitionTime;
  }
  
  public boolean hasHealthConditions() {
    return this.healthConditions != null && !(this.healthConditions.isEmpty());
  }
  
  public boolean hasLastTransitionTime() {
    return this.lastTransitionTime != null;
  }
  
  public boolean hasMatchingHealthCondition(Predicate<V1VolumeHealthConditionBuilder> predicate) {
      for (V1VolumeHealthConditionBuilder item : healthConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public int hashCode() {
    return Objects.hash(healthConditions, lastTransitionTime);
  }
  
  public A removeAllFromHealthConditions(Collection<V1VolumeHealthCondition> items) {
    if (this.healthConditions == null) {
      return (A) this;
    }
    for (V1VolumeHealthCondition item : items) {
        V1VolumeHealthConditionBuilder builder = new V1VolumeHealthConditionBuilder(item);
        _visitables.get("healthConditions").remove(builder);
        this.healthConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromHealthConditions(V1VolumeHealthCondition... items) {
    if (this.healthConditions == null) {
      return (A) this;
    }
    for (V1VolumeHealthCondition item : items) {
        V1VolumeHealthConditionBuilder builder = new V1VolumeHealthConditionBuilder(item);
        _visitables.get("healthConditions").remove(builder);
        this.healthConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromHealthConditions(Predicate<V1VolumeHealthConditionBuilder> predicate) {
    if (healthConditions == null) {
      return (A) this;
    }
    Iterator<V1VolumeHealthConditionBuilder> each = healthConditions.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("healthConditions");
    while (each.hasNext()) {
        V1VolumeHealthConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public HealthConditionsNested<A> setNewHealthConditionLike(int index,V1VolumeHealthCondition item) {
    return new HealthConditionsNested<>(index, item);
  }
  
  public A setToHealthConditions(int index,V1VolumeHealthCondition item) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    V1VolumeHealthConditionBuilder builder = new V1VolumeHealthConditionBuilder(item);
    if (index < 0 || index >= this.healthConditions.size()) {
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(builder);
    } else {
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(healthConditions == null) && !(healthConditions.isEmpty())) {
        sb.append("healthConditions:");
        sb.append(healthConditions);
        sb.append(",");
    }
    if (!(lastTransitionTime == null)) {
        sb.append("lastTransitionTime:");
        sb.append(lastTransitionTime);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHealthConditions(List<V1VolumeHealthCondition> healthConditions) {
    if (this.healthConditions != null) {
      this._visitables.get("healthConditions").clear();
    }
    if (healthConditions != null) {
        this.healthConditions = new ArrayList<>();
        for (V1VolumeHealthCondition item : healthConditions) {
          this.addToHealthConditions(item);
        }
    } else {
      this.healthConditions = null;
    }
    return (A) this;
  }
  
  public A withHealthConditions(V1VolumeHealthCondition... healthConditions) {
    if (this.healthConditions != null) {
        this.healthConditions.clear();
        _visitables.remove("healthConditions");
    }
    if (healthConditions != null) {
      for (V1VolumeHealthCondition item : healthConditions) {
        this.addToHealthConditions(item);
      }
    }
    return (A) this;
  }
  
  public A withLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return (A) this;
  }
  public class HealthConditionsNested<N> extends V1VolumeHealthConditionFluent<HealthConditionsNested<N>> implements Nested<N>{
  
    V1VolumeHealthConditionBuilder builder;
    int index;
  
    HealthConditionsNested(int index,V1VolumeHealthCondition item) {
      this.index = index;
      this.builder = new V1VolumeHealthConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1VolumeHealthStatusFluent.this.setToHealthConditions(index, builder.build());
    }
    
    public N endHealthCondition() {
      return and();
    }
    
  }
}