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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1alpha3ShareableSummaryStatusFluent<A extends V1alpha3ShareableSummaryStatusFluent<A>> extends BaseFluent<A>{

  private ArrayList<V1alpha3ShareableCapacityStatusBuilder> capacity;
  private Integer fullyAvailableDevices;
  private Integer partiallyAvailableDevices;

  public V1alpha3ShareableSummaryStatusFluent() {
  }
  
  public V1alpha3ShareableSummaryStatusFluent(V1alpha3ShareableSummaryStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToCapacity(Collection<V1alpha3ShareableCapacityStatus> items) {
    if (this.capacity == null) {
      this.capacity = new ArrayList<>();
    }
    for (V1alpha3ShareableCapacityStatus item : items) {
        V1alpha3ShareableCapacityStatusBuilder builder = new V1alpha3ShareableCapacityStatusBuilder(item);
        this._visitables.get("capacity").add(builder);
        this.capacity.add(builder);
    }
    return (A) this;
  }
  
  public CapacityNested<A> addNewCapacity() {
    return new CapacityNested<>(-1, null);
  }
  
  public CapacityNested<A> addNewCapacityLike(V1alpha3ShareableCapacityStatus item) {
    return new CapacityNested<>(-1, item);
  }
  
  public A addToCapacity(V1alpha3ShareableCapacityStatus... items) {
    if (this.capacity == null) {
      this.capacity = new ArrayList<>();
    }
    for (V1alpha3ShareableCapacityStatus item : items) {
        V1alpha3ShareableCapacityStatusBuilder builder = new V1alpha3ShareableCapacityStatusBuilder(item);
        this._visitables.get("capacity").add(builder);
        this.capacity.add(builder);
    }
    return (A) this;
  }
  
  public A addToCapacity(int index,V1alpha3ShareableCapacityStatus item) {
    if (this.capacity == null) {
      this.capacity = new ArrayList<>();
    }
    V1alpha3ShareableCapacityStatusBuilder builder = new V1alpha3ShareableCapacityStatusBuilder(item);
    if (index < 0 || index >= this.capacity.size()) {
        this._visitables.get("capacity").add(builder);
        this.capacity.add(builder);
    } else {
        this._visitables.get("capacity").add(builder);
        this.capacity.add(index, builder);
    }
    return (A) this;
  }
  
  public List<V1alpha3ShareableCapacityStatus> buildCapacity() {
    return this.capacity != null ? build(capacity) : null;
  }
  
  public V1alpha3ShareableCapacityStatus buildCapacity(int index) {
    return this.capacity.get(index).build();
  }
  
  public V1alpha3ShareableCapacityStatus buildFirstCapacity() {
    return this.capacity.get(0).build();
  }
  
  public V1alpha3ShareableCapacityStatus buildLastCapacity() {
    return this.capacity.get(capacity.size() - 1).build();
  }
  
  public V1alpha3ShareableCapacityStatus buildMatchingCapacity(Predicate<V1alpha3ShareableCapacityStatusBuilder> predicate) {
      for (V1alpha3ShareableCapacityStatusBuilder item : capacity) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  protected void copyInstance(V1alpha3ShareableSummaryStatus instance) {
    instance = instance != null ? instance : new V1alpha3ShareableSummaryStatus();
    if (instance != null) {
        this.withCapacity(instance.getCapacity());
        this.withFullyAvailableDevices(instance.getFullyAvailableDevices());
        this.withPartiallyAvailableDevices(instance.getPartiallyAvailableDevices());
    }
  }
  
  public CapacityNested<A> editCapacity(int index) {
    if (capacity.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "capacity"));
    }
    return this.setNewCapacityLike(index, this.buildCapacity(index));
  }
  
  public CapacityNested<A> editFirstCapacity() {
    if (capacity.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "capacity"));
    }
    return this.setNewCapacityLike(0, this.buildCapacity(0));
  }
  
  public CapacityNested<A> editLastCapacity() {
    int index = capacity.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "capacity"));
    }
    return this.setNewCapacityLike(index, this.buildCapacity(index));
  }
  
  public CapacityNested<A> editMatchingCapacity(Predicate<V1alpha3ShareableCapacityStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < capacity.size();i++) {
      if (predicate.test(capacity.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "capacity"));
    }
    return this.setNewCapacityLike(index, this.buildCapacity(index));
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
    V1alpha3ShareableSummaryStatusFluent<?> that = (V1alpha3ShareableSummaryStatusFluent<?>) o;
    if (!(Objects.equals(capacity, that.capacity))) {
      return false;
    }
    if (!(Objects.equals(fullyAvailableDevices, that.fullyAvailableDevices))) {
      return false;
    }
    if (!(Objects.equals(partiallyAvailableDevices, that.partiallyAvailableDevices))) {
      return false;
    }
    return true;
  }
  
  public Integer getFullyAvailableDevices() {
    return this.fullyAvailableDevices;
  }
  
  public Integer getPartiallyAvailableDevices() {
    return this.partiallyAvailableDevices;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null && !(this.capacity.isEmpty());
  }
  
  public boolean hasFullyAvailableDevices() {
    return this.fullyAvailableDevices != null;
  }
  
  public boolean hasMatchingCapacity(Predicate<V1alpha3ShareableCapacityStatusBuilder> predicate) {
      for (V1alpha3ShareableCapacityStatusBuilder item : capacity) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasPartiallyAvailableDevices() {
    return this.partiallyAvailableDevices != null;
  }
  
  public int hashCode() {
    return Objects.hash(capacity, fullyAvailableDevices, partiallyAvailableDevices);
  }
  
  public A removeAllFromCapacity(Collection<V1alpha3ShareableCapacityStatus> items) {
    if (this.capacity == null) {
      return (A) this;
    }
    for (V1alpha3ShareableCapacityStatus item : items) {
        V1alpha3ShareableCapacityStatusBuilder builder = new V1alpha3ShareableCapacityStatusBuilder(item);
        _visitables.get("capacity").remove(builder);
        this.capacity.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromCapacity(V1alpha3ShareableCapacityStatus... items) {
    if (this.capacity == null) {
      return (A) this;
    }
    for (V1alpha3ShareableCapacityStatus item : items) {
        V1alpha3ShareableCapacityStatusBuilder builder = new V1alpha3ShareableCapacityStatusBuilder(item);
        _visitables.get("capacity").remove(builder);
        this.capacity.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromCapacity(Predicate<V1alpha3ShareableCapacityStatusBuilder> predicate) {
    if (capacity == null) {
      return (A) this;
    }
    Iterator<V1alpha3ShareableCapacityStatusBuilder> each = capacity.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("capacity");
    while (each.hasNext()) {
        V1alpha3ShareableCapacityStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public CapacityNested<A> setNewCapacityLike(int index,V1alpha3ShareableCapacityStatus item) {
    return new CapacityNested<>(index, item);
  }
  
  public A setToCapacity(int index,V1alpha3ShareableCapacityStatus item) {
    if (this.capacity == null) {
      this.capacity = new ArrayList<>();
    }
    V1alpha3ShareableCapacityStatusBuilder builder = new V1alpha3ShareableCapacityStatusBuilder(item);
    if (index < 0 || index >= this.capacity.size()) {
        this._visitables.get("capacity").add(builder);
        this.capacity.add(builder);
    } else {
        this._visitables.get("capacity").add(builder);
        this.capacity.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(capacity == null) && !(capacity.isEmpty())) {
        sb.append("capacity:");
        sb.append(capacity);
        sb.append(",");
    }
    if (!(fullyAvailableDevices == null)) {
        sb.append("fullyAvailableDevices:");
        sb.append(fullyAvailableDevices);
        sb.append(",");
    }
    if (!(partiallyAvailableDevices == null)) {
        sb.append("partiallyAvailableDevices:");
        sb.append(partiallyAvailableDevices);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCapacity(List<V1alpha3ShareableCapacityStatus> capacity) {
    if (this.capacity != null) {
      this._visitables.get("capacity").clear();
    }
    if (capacity != null) {
        this.capacity = new ArrayList<>();
        for (V1alpha3ShareableCapacityStatus item : capacity) {
          this.addToCapacity(item);
        }
    } else {
      this.capacity = null;
    }
    return (A) this;
  }
  
  public A withCapacity(V1alpha3ShareableCapacityStatus... capacity) {
    if (this.capacity != null) {
        this.capacity.clear();
        _visitables.remove("capacity");
    }
    if (capacity != null) {
      for (V1alpha3ShareableCapacityStatus item : capacity) {
        this.addToCapacity(item);
      }
    }
    return (A) this;
  }
  
  public A withFullyAvailableDevices(Integer fullyAvailableDevices) {
    this.fullyAvailableDevices = fullyAvailableDevices;
    return (A) this;
  }
  
  public A withPartiallyAvailableDevices(Integer partiallyAvailableDevices) {
    this.partiallyAvailableDevices = partiallyAvailableDevices;
    return (A) this;
  }
  public class CapacityNested<N> extends V1alpha3ShareableCapacityStatusFluent<CapacityNested<N>> implements Nested<N>{
  
    V1alpha3ShareableCapacityStatusBuilder builder;
    int index;
  
    CapacityNested(int index,V1alpha3ShareableCapacityStatus item) {
      this.index = index;
      this.builder = new V1alpha3ShareableCapacityStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3ShareableSummaryStatusFluent.this.setToCapacity(index, builder.build());
    }
    
    public N endCapacity() {
      return and();
    }
    
  }
}