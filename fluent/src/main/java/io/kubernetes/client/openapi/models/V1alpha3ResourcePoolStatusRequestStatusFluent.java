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
import java.lang.Integer;
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

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3ResourcePoolStatusRequestStatusFluent<A extends io.kubernetes.client.openapi.models.V1alpha3ResourcePoolStatusRequestStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ConditionBuilder> conditions;
  private Integer poolCount;
  private ArrayList<V1alpha3PoolStatusBuilder> pools;

  public V1alpha3ResourcePoolStatusRequestStatusFluent() {
  }
  
  public V1alpha3ResourcePoolStatusRequestStatusFluent(V1alpha3ResourcePoolStatusRequestStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        this._visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToPools(Collection<V1alpha3PoolStatus> items) {
    if (this.pools == null) {
      this.pools = new ArrayList();
    }
    for (V1alpha3PoolStatus item : items) {
        V1alpha3PoolStatusBuilder builder = new V1alpha3PoolStatusBuilder(item);
        this._visitables.get("pools").add(builder);
        this.pools.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public PoolsNested<A> addNewPool() {
    return new PoolsNested(-1, null);
  }
  
  public PoolsNested<A> addNewPoolLike(V1alpha3PoolStatus item) {
    return new PoolsNested(-1, item);
  }
  
  public A addToConditions(V1Condition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        this._visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= this.conditions.size()) {
        this._visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    } else {
        this._visitables.get("conditions").add(builder);
        this.conditions.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToPools(V1alpha3PoolStatus... items) {
    if (this.pools == null) {
      this.pools = new ArrayList();
    }
    for (V1alpha3PoolStatus item : items) {
        V1alpha3PoolStatusBuilder builder = new V1alpha3PoolStatusBuilder(item);
        this._visitables.get("pools").add(builder);
        this.pools.add(builder);
    }
    return (A) this;
  }
  
  public A addToPools(int index,V1alpha3PoolStatus item) {
    if (this.pools == null) {
      this.pools = new ArrayList();
    }
    V1alpha3PoolStatusBuilder builder = new V1alpha3PoolStatusBuilder(item);
    if (index < 0 || index >= this.pools.size()) {
        this._visitables.get("pools").add(builder);
        this.pools.add(builder);
    } else {
        this._visitables.get("pools").add(builder);
        this.pools.add(index, builder);
    }
    return (A) this;
  }
  
  public V1Condition buildCondition(int index) {
    return this.conditions.get(index).build();
  }
  
  public List<V1Condition> buildConditions() {
    return this.conditions != null ? build(conditions) : null;
  }
  
  public V1Condition buildFirstCondition() {
    return this.conditions.get(0).build();
  }
  
  public V1alpha3PoolStatus buildFirstPool() {
    return this.pools.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1alpha3PoolStatus buildLastPool() {
    return this.pools.get(pools.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha3PoolStatus buildMatchingPool(Predicate<V1alpha3PoolStatusBuilder> predicate) {
      for (V1alpha3PoolStatusBuilder item : pools) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha3PoolStatus buildPool(int index) {
    return this.pools.get(index).build();
  }
  
  public List<V1alpha3PoolStatus> buildPools() {
    return this.pools != null ? build(pools) : null;
  }
  
  protected void copyInstance(V1alpha3ResourcePoolStatusRequestStatus instance) {
    instance = instance != null ? instance : new V1alpha3ResourcePoolStatusRequestStatus();
    if (instance != null) {
        this.withConditions(instance.getConditions());
        this.withPoolCount(instance.getPoolCount());
        this.withPools(instance.getPools());
    }
  }
  
  public ConditionsNested<A> editCondition(int index) {
    if (conditions.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ConditionsNested<A> editFirstCondition() {
    if (conditions.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(0, this.buildCondition(0));
  }
  
  public PoolsNested<A> editFirstPool() {
    if (pools.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "pools"));
    }
    return this.setNewPoolLike(0, this.buildPool(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public PoolsNested<A> editLastPool() {
    int index = pools.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "pools"));
    }
    return this.setNewPoolLike(index, this.buildPool(index));
  }
  
  public ConditionsNested<A> editMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < conditions.size();i++) {
      if (predicate.test(conditions.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public PoolsNested<A> editMatchingPool(Predicate<V1alpha3PoolStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < pools.size();i++) {
      if (predicate.test(pools.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "pools"));
    }
    return this.setNewPoolLike(index, this.buildPool(index));
  }
  
  public PoolsNested<A> editPool(int index) {
    if (pools.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "pools"));
    }
    return this.setNewPoolLike(index, this.buildPool(index));
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
    V1alpha3ResourcePoolStatusRequestStatusFluent that = (V1alpha3ResourcePoolStatusRequestStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(poolCount, that.poolCount))) {
      return false;
    }
    if (!(Objects.equals(pools, that.pools))) {
      return false;
    }
    return true;
  }
  
  public Integer getPoolCount() {
    return this.poolCount;
  }
  
  public boolean hasConditions() {
    return this.conditions != null && !(this.conditions.isEmpty());
  }
  
  public boolean hasMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingPool(Predicate<V1alpha3PoolStatusBuilder> predicate) {
      for (V1alpha3PoolStatusBuilder item : pools) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasPoolCount() {
    return this.poolCount != null;
  }
  
  public boolean hasPools() {
    return this.pools != null && !(this.pools.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(conditions, poolCount, pools);
  }
  
  public A removeAllFromConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromPools(Collection<V1alpha3PoolStatus> items) {
    if (this.pools == null) {
      return (A) this;
    }
    for (V1alpha3PoolStatus item : items) {
        V1alpha3PoolStatusBuilder builder = new V1alpha3PoolStatusBuilder(item);
        _visitables.get("pools").remove(builder);
        this.pools.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromConditions(V1Condition... items) {
    if (this.conditions == null) {
      return (A) this;
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        _visitables.get("conditions").remove(builder);
        this.conditions.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPools(V1alpha3PoolStatus... items) {
    if (this.pools == null) {
      return (A) this;
    }
    for (V1alpha3PoolStatus item : items) {
        V1alpha3PoolStatusBuilder builder = new V1alpha3PoolStatusBuilder(item);
        _visitables.get("pools").remove(builder);
        this.pools.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1ConditionBuilder> each = conditions.iterator();
    List visitables = this._visitables.get("conditions");
    while (each.hasNext()) {
        V1ConditionBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromPools(Predicate<V1alpha3PoolStatusBuilder> predicate) {
    if (pools == null) {
      return (A) this;
    }
    Iterator<V1alpha3PoolStatusBuilder> each = pools.iterator();
    List visitables = this._visitables.get("pools");
    while (each.hasNext()) {
        V1alpha3PoolStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
    return new ConditionsNested(index, item);
  }
  
  public PoolsNested<A> setNewPoolLike(int index,V1alpha3PoolStatus item) {
    return new PoolsNested(index, item);
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList();
    }
    V1ConditionBuilder builder = new V1ConditionBuilder(item);
    if (index < 0 || index >= this.conditions.size()) {
        this._visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    } else {
        this._visitables.get("conditions").add(builder);
        this.conditions.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToPools(int index,V1alpha3PoolStatus item) {
    if (this.pools == null) {
      this.pools = new ArrayList();
    }
    V1alpha3PoolStatusBuilder builder = new V1alpha3PoolStatusBuilder(item);
    if (index < 0 || index >= this.pools.size()) {
        this._visitables.get("pools").add(builder);
        this.pools.add(builder);
    } else {
        this._visitables.get("pools").add(builder);
        this.pools.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(conditions == null) && !(conditions.isEmpty())) {
        sb.append("conditions:");
        sb.append(conditions);
        sb.append(",");
    }
    if (!(poolCount == null)) {
        sb.append("poolCount:");
        sb.append(poolCount);
        sb.append(",");
    }
    if (!(pools == null) && !(pools.isEmpty())) {
        sb.append("pools:");
        sb.append(pools);
    }
    sb.append("}");
    return sb.toString();
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
  
  public A withConditions(V1Condition... conditions) {
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
  
  public A withPoolCount(Integer poolCount) {
    this.poolCount = poolCount;
    return (A) this;
  }
  
  public A withPools(List<V1alpha3PoolStatus> pools) {
    if (this.pools != null) {
      this._visitables.get("pools").clear();
    }
    if (pools != null) {
        this.pools = new ArrayList();
        for (V1alpha3PoolStatus item : pools) {
          this.addToPools(item);
        }
    } else {
      this.pools = null;
    }
    return (A) this;
  }
  
  public A withPools(V1alpha3PoolStatus... pools) {
    if (this.pools != null) {
        this.pools.clear();
        _visitables.remove("pools");
    }
    if (pools != null) {
      for (V1alpha3PoolStatus item : pools) {
        this.addToPools(item);
      }
    }
    return (A) this;
  }
  public class ConditionsNested<N> extends V1ConditionFluent<ConditionsNested<N>> implements Nested<N>{
  
    V1ConditionBuilder builder;
    int index;
  
    ConditionsNested(int index,V1Condition item) {
      this.index = index;
      this.builder = new V1ConditionBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3ResourcePoolStatusRequestStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
  public class PoolsNested<N> extends V1alpha3PoolStatusFluent<PoolsNested<N>> implements Nested<N>{
  
    V1alpha3PoolStatusBuilder builder;
    int index;
  
    PoolsNested(int index,V1alpha3PoolStatus item) {
      this.index = index;
      this.builder = new V1alpha3PoolStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3ResourcePoolStatusRequestStatusFluent.this.setToPools(index, builder.build());
    }
    
    public N endPool() {
      return and();
    }
    
  }
}