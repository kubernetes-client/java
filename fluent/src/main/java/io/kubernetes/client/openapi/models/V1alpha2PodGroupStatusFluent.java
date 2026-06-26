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

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2PodGroupStatusFluent<A extends io.kubernetes.client.openapi.models.V1alpha2PodGroupStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ConditionBuilder> conditions;
  private ArrayList<V1alpha2PodGroupResourceClaimStatusBuilder> resourceClaimStatuses;

  public V1alpha2PodGroupStatusFluent() {
  }
  
  public V1alpha2PodGroupStatusFluent(V1alpha2PodGroupStatus instance) {
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
  
  public A addAllToResourceClaimStatuses(Collection<V1alpha2PodGroupResourceClaimStatus> items) {
    if (this.resourceClaimStatuses == null) {
      this.resourceClaimStatuses = new ArrayList();
    }
    for (V1alpha2PodGroupResourceClaimStatus item : items) {
        V1alpha2PodGroupResourceClaimStatusBuilder builder = new V1alpha2PodGroupResourceClaimStatusBuilder(item);
        this._visitables.get("resourceClaimStatuses").add(builder);
        this.resourceClaimStatuses.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested(-1, item);
  }
  
  public ResourceClaimStatusesNested<A> addNewResourceClaimStatus() {
    return new ResourceClaimStatusesNested(-1, null);
  }
  
  public ResourceClaimStatusesNested<A> addNewResourceClaimStatusLike(V1alpha2PodGroupResourceClaimStatus item) {
    return new ResourceClaimStatusesNested(-1, item);
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
  
  public A addToResourceClaimStatuses(V1alpha2PodGroupResourceClaimStatus... items) {
    if (this.resourceClaimStatuses == null) {
      this.resourceClaimStatuses = new ArrayList();
    }
    for (V1alpha2PodGroupResourceClaimStatus item : items) {
        V1alpha2PodGroupResourceClaimStatusBuilder builder = new V1alpha2PodGroupResourceClaimStatusBuilder(item);
        this._visitables.get("resourceClaimStatuses").add(builder);
        this.resourceClaimStatuses.add(builder);
    }
    return (A) this;
  }
  
  public A addToResourceClaimStatuses(int index,V1alpha2PodGroupResourceClaimStatus item) {
    if (this.resourceClaimStatuses == null) {
      this.resourceClaimStatuses = new ArrayList();
    }
    V1alpha2PodGroupResourceClaimStatusBuilder builder = new V1alpha2PodGroupResourceClaimStatusBuilder(item);
    if (index < 0 || index >= this.resourceClaimStatuses.size()) {
        this._visitables.get("resourceClaimStatuses").add(builder);
        this.resourceClaimStatuses.add(builder);
    } else {
        this._visitables.get("resourceClaimStatuses").add(builder);
        this.resourceClaimStatuses.add(index, builder);
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
  
  public V1alpha2PodGroupResourceClaimStatus buildFirstResourceClaimStatus() {
    return this.resourceClaimStatuses.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1alpha2PodGroupResourceClaimStatus buildLastResourceClaimStatus() {
    return this.resourceClaimStatuses.get(resourceClaimStatuses.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha2PodGroupResourceClaimStatus buildMatchingResourceClaimStatus(Predicate<V1alpha2PodGroupResourceClaimStatusBuilder> predicate) {
      for (V1alpha2PodGroupResourceClaimStatusBuilder item : resourceClaimStatuses) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha2PodGroupResourceClaimStatus buildResourceClaimStatus(int index) {
    return this.resourceClaimStatuses.get(index).build();
  }
  
  public List<V1alpha2PodGroupResourceClaimStatus> buildResourceClaimStatuses() {
    return this.resourceClaimStatuses != null ? build(resourceClaimStatuses) : null;
  }
  
  protected void copyInstance(V1alpha2PodGroupStatus instance) {
    instance = instance != null ? instance : new V1alpha2PodGroupStatus();
    if (instance != null) {
        this.withConditions(instance.getConditions());
        this.withResourceClaimStatuses(instance.getResourceClaimStatuses());
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
  
  public ResourceClaimStatusesNested<A> editFirstResourceClaimStatus() {
    if (resourceClaimStatuses.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "resourceClaimStatuses"));
    }
    return this.setNewResourceClaimStatusLike(0, this.buildResourceClaimStatus(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public ResourceClaimStatusesNested<A> editLastResourceClaimStatus() {
    int index = resourceClaimStatuses.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "resourceClaimStatuses"));
    }
    return this.setNewResourceClaimStatusLike(index, this.buildResourceClaimStatus(index));
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
  
  public ResourceClaimStatusesNested<A> editMatchingResourceClaimStatus(Predicate<V1alpha2PodGroupResourceClaimStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < resourceClaimStatuses.size();i++) {
      if (predicate.test(resourceClaimStatuses.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "resourceClaimStatuses"));
    }
    return this.setNewResourceClaimStatusLike(index, this.buildResourceClaimStatus(index));
  }
  
  public ResourceClaimStatusesNested<A> editResourceClaimStatus(int index) {
    if (resourceClaimStatuses.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "resourceClaimStatuses"));
    }
    return this.setNewResourceClaimStatusLike(index, this.buildResourceClaimStatus(index));
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
    V1alpha2PodGroupStatusFluent that = (V1alpha2PodGroupStatusFluent) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(resourceClaimStatuses, that.resourceClaimStatuses))) {
      return false;
    }
    return true;
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
  
  public boolean hasMatchingResourceClaimStatus(Predicate<V1alpha2PodGroupResourceClaimStatusBuilder> predicate) {
      for (V1alpha2PodGroupResourceClaimStatusBuilder item : resourceClaimStatuses) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasResourceClaimStatuses() {
    return this.resourceClaimStatuses != null && !(this.resourceClaimStatuses.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(conditions, resourceClaimStatuses);
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
  
  public A removeAllFromResourceClaimStatuses(Collection<V1alpha2PodGroupResourceClaimStatus> items) {
    if (this.resourceClaimStatuses == null) {
      return (A) this;
    }
    for (V1alpha2PodGroupResourceClaimStatus item : items) {
        V1alpha2PodGroupResourceClaimStatusBuilder builder = new V1alpha2PodGroupResourceClaimStatusBuilder(item);
        _visitables.get("resourceClaimStatuses").remove(builder);
        this.resourceClaimStatuses.remove(builder);
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
  
  public A removeFromResourceClaimStatuses(V1alpha2PodGroupResourceClaimStatus... items) {
    if (this.resourceClaimStatuses == null) {
      return (A) this;
    }
    for (V1alpha2PodGroupResourceClaimStatus item : items) {
        V1alpha2PodGroupResourceClaimStatusBuilder builder = new V1alpha2PodGroupResourceClaimStatusBuilder(item);
        _visitables.get("resourceClaimStatuses").remove(builder);
        this.resourceClaimStatuses.remove(builder);
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
  
  public A removeMatchingFromResourceClaimStatuses(Predicate<V1alpha2PodGroupResourceClaimStatusBuilder> predicate) {
    if (resourceClaimStatuses == null) {
      return (A) this;
    }
    Iterator<V1alpha2PodGroupResourceClaimStatusBuilder> each = resourceClaimStatuses.iterator();
    List visitables = this._visitables.get("resourceClaimStatuses");
    while (each.hasNext()) {
        V1alpha2PodGroupResourceClaimStatusBuilder builder = each.next();
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
  
  public ResourceClaimStatusesNested<A> setNewResourceClaimStatusLike(int index,V1alpha2PodGroupResourceClaimStatus item) {
    return new ResourceClaimStatusesNested(index, item);
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
  
  public A setToResourceClaimStatuses(int index,V1alpha2PodGroupResourceClaimStatus item) {
    if (this.resourceClaimStatuses == null) {
      this.resourceClaimStatuses = new ArrayList();
    }
    V1alpha2PodGroupResourceClaimStatusBuilder builder = new V1alpha2PodGroupResourceClaimStatusBuilder(item);
    if (index < 0 || index >= this.resourceClaimStatuses.size()) {
        this._visitables.get("resourceClaimStatuses").add(builder);
        this.resourceClaimStatuses.add(builder);
    } else {
        this._visitables.get("resourceClaimStatuses").add(builder);
        this.resourceClaimStatuses.set(index, builder);
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
    if (!(resourceClaimStatuses == null) && !(resourceClaimStatuses.isEmpty())) {
        sb.append("resourceClaimStatuses:");
        sb.append(resourceClaimStatuses);
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
  
  public A withResourceClaimStatuses(List<V1alpha2PodGroupResourceClaimStatus> resourceClaimStatuses) {
    if (this.resourceClaimStatuses != null) {
      this._visitables.get("resourceClaimStatuses").clear();
    }
    if (resourceClaimStatuses != null) {
        this.resourceClaimStatuses = new ArrayList();
        for (V1alpha2PodGroupResourceClaimStatus item : resourceClaimStatuses) {
          this.addToResourceClaimStatuses(item);
        }
    } else {
      this.resourceClaimStatuses = null;
    }
    return (A) this;
  }
  
  public A withResourceClaimStatuses(V1alpha2PodGroupResourceClaimStatus... resourceClaimStatuses) {
    if (this.resourceClaimStatuses != null) {
        this.resourceClaimStatuses.clear();
        _visitables.remove("resourceClaimStatuses");
    }
    if (resourceClaimStatuses != null) {
      for (V1alpha2PodGroupResourceClaimStatus item : resourceClaimStatuses) {
        this.addToResourceClaimStatuses(item);
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
      return (N) V1alpha2PodGroupStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
  public class ResourceClaimStatusesNested<N> extends V1alpha2PodGroupResourceClaimStatusFluent<ResourceClaimStatusesNested<N>> implements Nested<N>{
  
    V1alpha2PodGroupResourceClaimStatusBuilder builder;
    int index;
  
    ResourceClaimStatusesNested(int index,V1alpha2PodGroupResourceClaimStatus item) {
      this.index = index;
      this.builder = new V1alpha2PodGroupResourceClaimStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha2PodGroupStatusFluent.this.setToResourceClaimStatuses(index, builder.build());
    }
    
    public N endResourceClaimStatus() {
      return and();
    }
    
  }
}