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
import java.lang.Long;
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
public class V1alpha1EvictionStatusFluent<A extends V1alpha1EvictionStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1ConditionBuilder> conditions;
  private Long observedGeneration;
  private ArrayList<V1alpha1RequesterBuilder> requesters;
  private ArrayList<V1alpha1ResponderStatusBuilder> responders;
  private ArrayList<V1alpha1TargetResponderBuilder> targetResponders;

  public V1alpha1EvictionStatusFluent() {
  }
  
  public V1alpha1EvictionStatusFluent(V1alpha1EvictionStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToConditions(Collection<V1Condition> items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    for (V1Condition item : items) {
        V1ConditionBuilder builder = new V1ConditionBuilder(item);
        this._visitables.get("conditions").add(builder);
        this.conditions.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToRequesters(Collection<V1alpha1Requester> items) {
    if (this.requesters == null) {
      this.requesters = new ArrayList<>();
    }
    for (V1alpha1Requester item : items) {
        V1alpha1RequesterBuilder builder = new V1alpha1RequesterBuilder(item);
        this._visitables.get("requesters").add(builder);
        this.requesters.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToResponders(Collection<V1alpha1ResponderStatus> items) {
    if (this.responders == null) {
      this.responders = new ArrayList<>();
    }
    for (V1alpha1ResponderStatus item : items) {
        V1alpha1ResponderStatusBuilder builder = new V1alpha1ResponderStatusBuilder(item);
        this._visitables.get("responders").add(builder);
        this.responders.add(builder);
    }
    return (A) this;
  }
  
  public A addAllToTargetResponders(Collection<V1alpha1TargetResponder> items) {
    if (this.targetResponders == null) {
      this.targetResponders = new ArrayList<>();
    }
    for (V1alpha1TargetResponder item : items) {
        V1alpha1TargetResponderBuilder builder = new V1alpha1TargetResponderBuilder(item);
        this._visitables.get("targetResponders").add(builder);
        this.targetResponders.add(builder);
    }
    return (A) this;
  }
  
  public ConditionsNested<A> addNewCondition() {
    return new ConditionsNested<>(-1, null);
  }
  
  public ConditionsNested<A> addNewConditionLike(V1Condition item) {
    return new ConditionsNested<>(-1, item);
  }
  
  public RequestersNested<A> addNewRequester() {
    return new RequestersNested<>(-1, null);
  }
  
  public RequestersNested<A> addNewRequesterLike(V1alpha1Requester item) {
    return new RequestersNested<>(-1, item);
  }
  
  public RespondersNested<A> addNewResponder() {
    return new RespondersNested<>(-1, null);
  }
  
  public RespondersNested<A> addNewResponderLike(V1alpha1ResponderStatus item) {
    return new RespondersNested<>(-1, item);
  }
  
  public TargetRespondersNested<A> addNewTargetResponder() {
    return new TargetRespondersNested<>(-1, null);
  }
  
  public TargetRespondersNested<A> addNewTargetResponderLike(V1alpha1TargetResponder item) {
    return new TargetRespondersNested<>(-1, item);
  }
  
  public A addToConditions(V1Condition... items) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
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
      this.conditions = new ArrayList<>();
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
  
  public A addToRequesters(V1alpha1Requester... items) {
    if (this.requesters == null) {
      this.requesters = new ArrayList<>();
    }
    for (V1alpha1Requester item : items) {
        V1alpha1RequesterBuilder builder = new V1alpha1RequesterBuilder(item);
        this._visitables.get("requesters").add(builder);
        this.requesters.add(builder);
    }
    return (A) this;
  }
  
  public A addToRequesters(int index,V1alpha1Requester item) {
    if (this.requesters == null) {
      this.requesters = new ArrayList<>();
    }
    V1alpha1RequesterBuilder builder = new V1alpha1RequesterBuilder(item);
    if (index < 0 || index >= this.requesters.size()) {
        this._visitables.get("requesters").add(builder);
        this.requesters.add(builder);
    } else {
        this._visitables.get("requesters").add(builder);
        this.requesters.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToResponders(V1alpha1ResponderStatus... items) {
    if (this.responders == null) {
      this.responders = new ArrayList<>();
    }
    for (V1alpha1ResponderStatus item : items) {
        V1alpha1ResponderStatusBuilder builder = new V1alpha1ResponderStatusBuilder(item);
        this._visitables.get("responders").add(builder);
        this.responders.add(builder);
    }
    return (A) this;
  }
  
  public A addToResponders(int index,V1alpha1ResponderStatus item) {
    if (this.responders == null) {
      this.responders = new ArrayList<>();
    }
    V1alpha1ResponderStatusBuilder builder = new V1alpha1ResponderStatusBuilder(item);
    if (index < 0 || index >= this.responders.size()) {
        this._visitables.get("responders").add(builder);
        this.responders.add(builder);
    } else {
        this._visitables.get("responders").add(builder);
        this.responders.add(index, builder);
    }
    return (A) this;
  }
  
  public A addToTargetResponders(V1alpha1TargetResponder... items) {
    if (this.targetResponders == null) {
      this.targetResponders = new ArrayList<>();
    }
    for (V1alpha1TargetResponder item : items) {
        V1alpha1TargetResponderBuilder builder = new V1alpha1TargetResponderBuilder(item);
        this._visitables.get("targetResponders").add(builder);
        this.targetResponders.add(builder);
    }
    return (A) this;
  }
  
  public A addToTargetResponders(int index,V1alpha1TargetResponder item) {
    if (this.targetResponders == null) {
      this.targetResponders = new ArrayList<>();
    }
    V1alpha1TargetResponderBuilder builder = new V1alpha1TargetResponderBuilder(item);
    if (index < 0 || index >= this.targetResponders.size()) {
        this._visitables.get("targetResponders").add(builder);
        this.targetResponders.add(builder);
    } else {
        this._visitables.get("targetResponders").add(builder);
        this.targetResponders.add(index, builder);
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
  
  public V1alpha1Requester buildFirstRequester() {
    return this.requesters.get(0).build();
  }
  
  public V1alpha1ResponderStatus buildFirstResponder() {
    return this.responders.get(0).build();
  }
  
  public V1alpha1TargetResponder buildFirstTargetResponder() {
    return this.targetResponders.get(0).build();
  }
  
  public V1Condition buildLastCondition() {
    return this.conditions.get(conditions.size() - 1).build();
  }
  
  public V1alpha1Requester buildLastRequester() {
    return this.requesters.get(requesters.size() - 1).build();
  }
  
  public V1alpha1ResponderStatus buildLastResponder() {
    return this.responders.get(responders.size() - 1).build();
  }
  
  public V1alpha1TargetResponder buildLastTargetResponder() {
    return this.targetResponders.get(targetResponders.size() - 1).build();
  }
  
  public V1Condition buildMatchingCondition(Predicate<V1ConditionBuilder> predicate) {
      for (V1ConditionBuilder item : conditions) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha1Requester buildMatchingRequester(Predicate<V1alpha1RequesterBuilder> predicate) {
      for (V1alpha1RequesterBuilder item : requesters) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha1ResponderStatus buildMatchingResponder(Predicate<V1alpha1ResponderStatusBuilder> predicate) {
      for (V1alpha1ResponderStatusBuilder item : responders) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha1TargetResponder buildMatchingTargetResponder(Predicate<V1alpha1TargetResponderBuilder> predicate) {
      for (V1alpha1TargetResponderBuilder item : targetResponders) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public V1alpha1Requester buildRequester(int index) {
    return this.requesters.get(index).build();
  }
  
  public List<V1alpha1Requester> buildRequesters() {
    return this.requesters != null ? build(requesters) : null;
  }
  
  public V1alpha1ResponderStatus buildResponder(int index) {
    return this.responders.get(index).build();
  }
  
  public List<V1alpha1ResponderStatus> buildResponders() {
    return this.responders != null ? build(responders) : null;
  }
  
  public V1alpha1TargetResponder buildTargetResponder(int index) {
    return this.targetResponders.get(index).build();
  }
  
  public List<V1alpha1TargetResponder> buildTargetResponders() {
    return this.targetResponders != null ? build(targetResponders) : null;
  }
  
  protected void copyInstance(V1alpha1EvictionStatus instance) {
    instance = instance != null ? instance : new V1alpha1EvictionStatus();
    if (instance != null) {
        this.withConditions(instance.getConditions());
        this.withObservedGeneration(instance.getObservedGeneration());
        this.withRequesters(instance.getRequesters());
        this.withResponders(instance.getResponders());
        this.withTargetResponders(instance.getTargetResponders());
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
  
  public RequestersNested<A> editFirstRequester() {
    if (requesters.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "requesters"));
    }
    return this.setNewRequesterLike(0, this.buildRequester(0));
  }
  
  public RespondersNested<A> editFirstResponder() {
    if (responders.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "responders"));
    }
    return this.setNewResponderLike(0, this.buildResponder(0));
  }
  
  public TargetRespondersNested<A> editFirstTargetResponder() {
    if (targetResponders.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "targetResponders"));
    }
    return this.setNewTargetResponderLike(0, this.buildTargetResponder(0));
  }
  
  public ConditionsNested<A> editLastCondition() {
    int index = conditions.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "conditions"));
    }
    return this.setNewConditionLike(index, this.buildCondition(index));
  }
  
  public RequestersNested<A> editLastRequester() {
    int index = requesters.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "requesters"));
    }
    return this.setNewRequesterLike(index, this.buildRequester(index));
  }
  
  public RespondersNested<A> editLastResponder() {
    int index = responders.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "responders"));
    }
    return this.setNewResponderLike(index, this.buildResponder(index));
  }
  
  public TargetRespondersNested<A> editLastTargetResponder() {
    int index = targetResponders.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "targetResponders"));
    }
    return this.setNewTargetResponderLike(index, this.buildTargetResponder(index));
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
  
  public RequestersNested<A> editMatchingRequester(Predicate<V1alpha1RequesterBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < requesters.size();i++) {
      if (predicate.test(requesters.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "requesters"));
    }
    return this.setNewRequesterLike(index, this.buildRequester(index));
  }
  
  public RespondersNested<A> editMatchingResponder(Predicate<V1alpha1ResponderStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < responders.size();i++) {
      if (predicate.test(responders.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "responders"));
    }
    return this.setNewResponderLike(index, this.buildResponder(index));
  }
  
  public TargetRespondersNested<A> editMatchingTargetResponder(Predicate<V1alpha1TargetResponderBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < targetResponders.size();i++) {
      if (predicate.test(targetResponders.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "targetResponders"));
    }
    return this.setNewTargetResponderLike(index, this.buildTargetResponder(index));
  }
  
  public RequestersNested<A> editRequester(int index) {
    if (requesters.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "requesters"));
    }
    return this.setNewRequesterLike(index, this.buildRequester(index));
  }
  
  public RespondersNested<A> editResponder(int index) {
    if (responders.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "responders"));
    }
    return this.setNewResponderLike(index, this.buildResponder(index));
  }
  
  public TargetRespondersNested<A> editTargetResponder(int index) {
    if (targetResponders.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "targetResponders"));
    }
    return this.setNewTargetResponderLike(index, this.buildTargetResponder(index));
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
    V1alpha1EvictionStatusFluent<?> that = (V1alpha1EvictionStatusFluent<?>) o;
    if (!(Objects.equals(conditions, that.conditions))) {
      return false;
    }
    if (!(Objects.equals(observedGeneration, that.observedGeneration))) {
      return false;
    }
    if (!(Objects.equals(requesters, that.requesters))) {
      return false;
    }
    if (!(Objects.equals(responders, that.responders))) {
      return false;
    }
    if (!(Objects.equals(targetResponders, that.targetResponders))) {
      return false;
    }
    return true;
  }
  
  public Long getObservedGeneration() {
    return this.observedGeneration;
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
  
  public boolean hasMatchingRequester(Predicate<V1alpha1RequesterBuilder> predicate) {
      for (V1alpha1RequesterBuilder item : requesters) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingResponder(Predicate<V1alpha1ResponderStatusBuilder> predicate) {
      for (V1alpha1ResponderStatusBuilder item : responders) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasMatchingTargetResponder(Predicate<V1alpha1TargetResponderBuilder> predicate) {
      for (V1alpha1TargetResponderBuilder item : targetResponders) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }
  
  public boolean hasRequesters() {
    return this.requesters != null && !(this.requesters.isEmpty());
  }
  
  public boolean hasResponders() {
    return this.responders != null && !(this.responders.isEmpty());
  }
  
  public boolean hasTargetResponders() {
    return this.targetResponders != null && !(this.targetResponders.isEmpty());
  }
  
  public int hashCode() {
    return Objects.hash(conditions, observedGeneration, requesters, responders, targetResponders);
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
  
  public A removeAllFromRequesters(Collection<V1alpha1Requester> items) {
    if (this.requesters == null) {
      return (A) this;
    }
    for (V1alpha1Requester item : items) {
        V1alpha1RequesterBuilder builder = new V1alpha1RequesterBuilder(item);
        _visitables.get("requesters").remove(builder);
        this.requesters.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromResponders(Collection<V1alpha1ResponderStatus> items) {
    if (this.responders == null) {
      return (A) this;
    }
    for (V1alpha1ResponderStatus item : items) {
        V1alpha1ResponderStatusBuilder builder = new V1alpha1ResponderStatusBuilder(item);
        _visitables.get("responders").remove(builder);
        this.responders.remove(builder);
    }
    return (A) this;
  }
  
  public A removeAllFromTargetResponders(Collection<V1alpha1TargetResponder> items) {
    if (this.targetResponders == null) {
      return (A) this;
    }
    for (V1alpha1TargetResponder item : items) {
        V1alpha1TargetResponderBuilder builder = new V1alpha1TargetResponderBuilder(item);
        _visitables.get("targetResponders").remove(builder);
        this.targetResponders.remove(builder);
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
  
  public A removeFromRequesters(V1alpha1Requester... items) {
    if (this.requesters == null) {
      return (A) this;
    }
    for (V1alpha1Requester item : items) {
        V1alpha1RequesterBuilder builder = new V1alpha1RequesterBuilder(item);
        _visitables.get("requesters").remove(builder);
        this.requesters.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromResponders(V1alpha1ResponderStatus... items) {
    if (this.responders == null) {
      return (A) this;
    }
    for (V1alpha1ResponderStatus item : items) {
        V1alpha1ResponderStatusBuilder builder = new V1alpha1ResponderStatusBuilder(item);
        _visitables.get("responders").remove(builder);
        this.responders.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromTargetResponders(V1alpha1TargetResponder... items) {
    if (this.targetResponders == null) {
      return (A) this;
    }
    for (V1alpha1TargetResponder item : items) {
        V1alpha1TargetResponderBuilder builder = new V1alpha1TargetResponderBuilder(item);
        _visitables.get("targetResponders").remove(builder);
        this.targetResponders.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromConditions(Predicate<V1ConditionBuilder> predicate) {
    if (conditions == null) {
      return (A) this;
    }
    Iterator<V1ConditionBuilder> each = conditions.iterator();
    @SuppressWarnings({"rawtypes"})
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
  
  public A removeMatchingFromRequesters(Predicate<V1alpha1RequesterBuilder> predicate) {
    if (requesters == null) {
      return (A) this;
    }
    Iterator<V1alpha1RequesterBuilder> each = requesters.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("requesters");
    while (each.hasNext()) {
        V1alpha1RequesterBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromResponders(Predicate<V1alpha1ResponderStatusBuilder> predicate) {
    if (responders == null) {
      return (A) this;
    }
    Iterator<V1alpha1ResponderStatusBuilder> each = responders.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("responders");
    while (each.hasNext()) {
        V1alpha1ResponderStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public A removeMatchingFromTargetResponders(Predicate<V1alpha1TargetResponderBuilder> predicate) {
    if (targetResponders == null) {
      return (A) this;
    }
    Iterator<V1alpha1TargetResponderBuilder> each = targetResponders.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("targetResponders");
    while (each.hasNext()) {
        V1alpha1TargetResponderBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public ConditionsNested<A> setNewConditionLike(int index,V1Condition item) {
    return new ConditionsNested<>(index, item);
  }
  
  public RequestersNested<A> setNewRequesterLike(int index,V1alpha1Requester item) {
    return new RequestersNested<>(index, item);
  }
  
  public RespondersNested<A> setNewResponderLike(int index,V1alpha1ResponderStatus item) {
    return new RespondersNested<>(index, item);
  }
  
  public TargetRespondersNested<A> setNewTargetResponderLike(int index,V1alpha1TargetResponder item) {
    return new TargetRespondersNested<>(index, item);
  }
  
  public A setToConditions(int index,V1Condition item) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
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
  
  public A setToRequesters(int index,V1alpha1Requester item) {
    if (this.requesters == null) {
      this.requesters = new ArrayList<>();
    }
    V1alpha1RequesterBuilder builder = new V1alpha1RequesterBuilder(item);
    if (index < 0 || index >= this.requesters.size()) {
        this._visitables.get("requesters").add(builder);
        this.requesters.add(builder);
    } else {
        this._visitables.get("requesters").add(builder);
        this.requesters.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToResponders(int index,V1alpha1ResponderStatus item) {
    if (this.responders == null) {
      this.responders = new ArrayList<>();
    }
    V1alpha1ResponderStatusBuilder builder = new V1alpha1ResponderStatusBuilder(item);
    if (index < 0 || index >= this.responders.size()) {
        this._visitables.get("responders").add(builder);
        this.responders.add(builder);
    } else {
        this._visitables.get("responders").add(builder);
        this.responders.set(index, builder);
    }
    return (A) this;
  }
  
  public A setToTargetResponders(int index,V1alpha1TargetResponder item) {
    if (this.targetResponders == null) {
      this.targetResponders = new ArrayList<>();
    }
    V1alpha1TargetResponderBuilder builder = new V1alpha1TargetResponderBuilder(item);
    if (index < 0 || index >= this.targetResponders.size()) {
        this._visitables.get("targetResponders").add(builder);
        this.targetResponders.add(builder);
    } else {
        this._visitables.get("targetResponders").add(builder);
        this.targetResponders.set(index, builder);
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
    if (!(observedGeneration == null)) {
        sb.append("observedGeneration:");
        sb.append(observedGeneration);
        sb.append(",");
    }
    if (!(requesters == null) && !(requesters.isEmpty())) {
        sb.append("requesters:");
        sb.append(requesters);
        sb.append(",");
    }
    if (!(responders == null) && !(responders.isEmpty())) {
        sb.append("responders:");
        sb.append(responders);
        sb.append(",");
    }
    if (!(targetResponders == null) && !(targetResponders.isEmpty())) {
        sb.append("targetResponders:");
        sb.append(targetResponders);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withConditions(List<V1Condition> conditions) {
    if (this.conditions != null) {
      this._visitables.get("conditions").clear();
    }
    if (conditions != null) {
        this.conditions = new ArrayList<>();
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
  
  public A withObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }
  
  public A withRequesters(List<V1alpha1Requester> requesters) {
    if (this.requesters != null) {
      this._visitables.get("requesters").clear();
    }
    if (requesters != null) {
        this.requesters = new ArrayList<>();
        for (V1alpha1Requester item : requesters) {
          this.addToRequesters(item);
        }
    } else {
      this.requesters = null;
    }
    return (A) this;
  }
  
  public A withRequesters(V1alpha1Requester... requesters) {
    if (this.requesters != null) {
        this.requesters.clear();
        _visitables.remove("requesters");
    }
    if (requesters != null) {
      for (V1alpha1Requester item : requesters) {
        this.addToRequesters(item);
      }
    }
    return (A) this;
  }
  
  public A withResponders(List<V1alpha1ResponderStatus> responders) {
    if (this.responders != null) {
      this._visitables.get("responders").clear();
    }
    if (responders != null) {
        this.responders = new ArrayList<>();
        for (V1alpha1ResponderStatus item : responders) {
          this.addToResponders(item);
        }
    } else {
      this.responders = null;
    }
    return (A) this;
  }
  
  public A withResponders(V1alpha1ResponderStatus... responders) {
    if (this.responders != null) {
        this.responders.clear();
        _visitables.remove("responders");
    }
    if (responders != null) {
      for (V1alpha1ResponderStatus item : responders) {
        this.addToResponders(item);
      }
    }
    return (A) this;
  }
  
  public A withTargetResponders(List<V1alpha1TargetResponder> targetResponders) {
    if (this.targetResponders != null) {
      this._visitables.get("targetResponders").clear();
    }
    if (targetResponders != null) {
        this.targetResponders = new ArrayList<>();
        for (V1alpha1TargetResponder item : targetResponders) {
          this.addToTargetResponders(item);
        }
    } else {
      this.targetResponders = null;
    }
    return (A) this;
  }
  
  public A withTargetResponders(V1alpha1TargetResponder... targetResponders) {
    if (this.targetResponders != null) {
        this.targetResponders.clear();
        _visitables.remove("targetResponders");
    }
    if (targetResponders != null) {
      for (V1alpha1TargetResponder item : targetResponders) {
        this.addToTargetResponders(item);
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
      return (N) V1alpha1EvictionStatusFluent.this.setToConditions(index, builder.build());
    }
    
    public N endCondition() {
      return and();
    }
    
  }
  public class RequestersNested<N> extends V1alpha1RequesterFluent<RequestersNested<N>> implements Nested<N>{
  
    V1alpha1RequesterBuilder builder;
    int index;
  
    RequestersNested(int index,V1alpha1Requester item) {
      this.index = index;
      this.builder = new V1alpha1RequesterBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1EvictionStatusFluent.this.setToRequesters(index, builder.build());
    }
    
    public N endRequester() {
      return and();
    }
    
  }
  public class RespondersNested<N> extends V1alpha1ResponderStatusFluent<RespondersNested<N>> implements Nested<N>{
  
    V1alpha1ResponderStatusBuilder builder;
    int index;
  
    RespondersNested(int index,V1alpha1ResponderStatus item) {
      this.index = index;
      this.builder = new V1alpha1ResponderStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1EvictionStatusFluent.this.setToResponders(index, builder.build());
    }
    
    public N endResponder() {
      return and();
    }
    
  }
  public class TargetRespondersNested<N> extends V1alpha1TargetResponderFluent<TargetRespondersNested<N>> implements Nested<N>{
  
    V1alpha1TargetResponderBuilder builder;
    int index;
  
    TargetRespondersNested(int index,V1alpha1TargetResponder item) {
      this.index = index;
      this.builder = new V1alpha1TargetResponderBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha1EvictionStatusFluent.this.setToTargetResponders(index, builder.build());
    }
    
    public N endTargetResponder() {
      return and();
    }
    
  }
}