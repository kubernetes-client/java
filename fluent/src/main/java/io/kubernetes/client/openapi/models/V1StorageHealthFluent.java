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
public class V1StorageHealthFluent<A extends V1StorageHealthFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1StorageHealthConditionBuilder> healthConditions;
  private String name;

  public V1StorageHealthFluent() {
  }
  
  public V1StorageHealthFluent(V1StorageHealth instance) {
    this.copyInstance(instance);
  }

  public A addAllToHealthConditions(Collection<V1StorageHealthCondition> items) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    for (V1StorageHealthCondition item : items) {
        V1StorageHealthConditionBuilder builder = new V1StorageHealthConditionBuilder(item);
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(builder);
    }
    return (A) this;
  }
  
  public HealthConditionsNested<A> addNewHealthCondition() {
    return new HealthConditionsNested<>(-1, null);
  }
  
  public HealthConditionsNested<A> addNewHealthConditionLike(V1StorageHealthCondition item) {
    return new HealthConditionsNested<>(-1, item);
  }
  
  public A addToHealthConditions(V1StorageHealthCondition... items) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    for (V1StorageHealthCondition item : items) {
        V1StorageHealthConditionBuilder builder = new V1StorageHealthConditionBuilder(item);
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToHealthConditions(int index,V1StorageHealthCondition item) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    V1StorageHealthConditionBuilder builder = new V1StorageHealthConditionBuilder(item);
    if (index < 0 || index >= this.healthConditions.size()) {
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(builder);
    } else {
        this._visitables.get("healthConditions").add(builder);
        this.healthConditions.add(index, builder);
    }
    return (A) this;
  }
  
  public V1StorageHealthCondition buildFirstHealthCondition() {
    return this.healthConditions.get(0).build();
  }
  
  public V1StorageHealthCondition buildHealthCondition(int index) {
    return this.healthConditions.get(index).build();
  }
  
  public List<V1StorageHealthCondition> buildHealthConditions() {
    return this.healthConditions != null ? build(healthConditions) : null;
  }
  
  public V1StorageHealthCondition buildLastHealthCondition() {
    return this.healthConditions.get(healthConditions.size() - 1).build();
  }
  
  public V1StorageHealthCondition buildMatchingHealthCondition(Predicate<V1StorageHealthConditionBuilder> predicate) {
      for (V1StorageHealthConditionBuilder item : healthConditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1StorageHealth instance) {
    instance = instance != null ? instance : new V1StorageHealth();
    if (instance != null) {
        this.withHealthConditions(instance.getHealthConditions());
        this.withName(instance.getName());
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
  
  public HealthConditionsNested<A> editMatchingHealthCondition(Predicate<V1StorageHealthConditionBuilder> predicate) {
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
    V1StorageHealthFluent<?> that = (V1StorageHealthFluent<?>) o;
    if (!(Objects.equals(healthConditions, that.healthConditions))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasHealthConditions() {
    return this.healthConditions != null && !(this.healthConditions.isEmpty());
  }
  
  public boolean hasMatchingHealthCondition(Predicate<V1StorageHealthConditionBuilder> predicate) {
      for (V1StorageHealthConditionBuilder item : healthConditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(healthConditions, name);
  }
  
  public A removeAllFromHealthConditions(Collection<V1StorageHealthCondition> items) {
    if (this.healthConditions == null) {
      return (A) this;
    }
    for (V1StorageHealthCondition item : items) {
        V1StorageHealthConditionBuilder builder = new V1StorageHealthConditionBuilder(item);
        _visitables.get("healthConditions").remove(builder);
        this.healthConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromHealthConditions(V1StorageHealthCondition... items) {
    if (this.healthConditions == null) {
      return (A) this;
    }
    for (V1StorageHealthCondition item : items) {
        V1StorageHealthConditionBuilder builder = new V1StorageHealthConditionBuilder(item);
        _visitables.get("healthConditions").remove(builder);
        this.healthConditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromHealthConditions(Predicate<V1StorageHealthConditionBuilder> predicate) {
    if (healthConditions == null) {
      return (A) this;
    }
    Iterator<V1StorageHealthConditionBuilder> each = healthConditions.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("healthConditions");
    while (each.hasNext()) {
        V1StorageHealthConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public HealthConditionsNested<A> setNewHealthConditionLike(int index,V1StorageHealthCondition item) {
    return new HealthConditionsNested<>(index, item);
  }
  
  public A setToHealthConditions(int index,V1StorageHealthCondition item) {
    if (this.healthConditions == null) {
      this.healthConditions = new ArrayList<>();
    }
    V1StorageHealthConditionBuilder builder = new V1StorageHealthConditionBuilder(item);
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
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withHealthConditions(List<V1StorageHealthCondition> healthConditions) {
    if (this.healthConditions != null) {
      this._visitables.get("healthConditions").clear();
    }
    if (healthConditions != null) {
        this.healthConditions = new ArrayList<>();
        for (V1StorageHealthCondition item : healthConditions) {
          this.addToHealthConditions(item);
        }
    } else {
      this.healthConditions = null;
    }
    return (A) this;
  }
  
  public A withHealthConditions(V1StorageHealthCondition... healthConditions) {
    if (this.healthConditions != null) {
        this.healthConditions.clear();
        _visitables.remove("healthConditions");
    }
    if (healthConditions != null) {
      for (V1StorageHealthCondition item : healthConditions) {
        this.addToHealthConditions(item);
      }
    }
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  public class HealthConditionsNested<N> extends V1StorageHealthConditionFluent<HealthConditionsNested<N>> implements Nested<N>{
  
    V1StorageHealthConditionBuilder builder;
    int index;
  
    HealthConditionsNested(int index,V1StorageHealthCondition item) {
      this.index = index;
      this.builder = new V1StorageHealthConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1StorageHealthFluent.this.setToHealthConditions(index, builder.build());
    }
    
    public N endHealthCondition() {
      return and();
    }
    
  }
}