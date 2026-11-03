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
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1alpha3PoolStatusFluent<A extends V1alpha3PoolStatusFluent<A>> extends BaseFluent<A>{

  private Integer allocatedDevices;
  private Integer availableDevices;
  private String driver;
  private Long generation;
  private String nodeName;
  private ArrayList<V1alpha3PartitionTypeStatusBuilder> partitionSummary;
  private String poolName;
  private Integer resourceSliceCount;
  private V1alpha3ShareableSummaryStatusBuilder shareableSummary;
  private Integer totalDevices;
  private Integer unavailableDevices;
  private String validationError;

  public V1alpha3PoolStatusFluent() {
  }
  
  public V1alpha3PoolStatusFluent(V1alpha3PoolStatus instance) {
    this.copyInstance(instance);
  }

  public A addAllToPartitionSummary(Collection<V1alpha3PartitionTypeStatus> items) {
    if (this.partitionSummary == null) {
      this.partitionSummary = new ArrayList<>();
    }
    for (V1alpha3PartitionTypeStatus item : items) {
        V1alpha3PartitionTypeStatusBuilder builder = new V1alpha3PartitionTypeStatusBuilder(item);
        this._visitables.get("partitionSummary").add(builder);
        this.partitionSummary.add(builder);
    }
    return (A) this;
  }
  
  public PartitionSummaryNested<A> addNewPartitionSummary() {
    return new PartitionSummaryNested<>(-1, null);
  }
  
  public PartitionSummaryNested<A> addNewPartitionSummaryLike(V1alpha3PartitionTypeStatus item) {
    return new PartitionSummaryNested<>(-1, item);
  }
  
  public A addToPartitionSummary(V1alpha3PartitionTypeStatus... items) {
    if (this.partitionSummary == null) {
      this.partitionSummary = new ArrayList<>();
    }
    for (V1alpha3PartitionTypeStatus item : items) {
        V1alpha3PartitionTypeStatusBuilder builder = new V1alpha3PartitionTypeStatusBuilder(item);
        this._visitables.get("partitionSummary").add(builder);
        this.partitionSummary.add(builder);
    }
    return (A) this;
  }
  
  public A addToPartitionSummary(int index,V1alpha3PartitionTypeStatus item) {
    if (this.partitionSummary == null) {
      this.partitionSummary = new ArrayList<>();
    }
    V1alpha3PartitionTypeStatusBuilder builder = new V1alpha3PartitionTypeStatusBuilder(item);
    if (index < 0 || index >= this.partitionSummary.size()) {
        this._visitables.get("partitionSummary").add(builder);
        this.partitionSummary.add(builder);
    } else {
        this._visitables.get("partitionSummary").add(builder);
        this.partitionSummary.add(index, builder);
    }
    return (A) this;
  }
  
  public V1alpha3PartitionTypeStatus buildFirstPartitionSummary() {
    return this.partitionSummary.get(0).build();
  }
  
  public V1alpha3PartitionTypeStatus buildLastPartitionSummary() {
    return this.partitionSummary.get(partitionSummary.size() - 1).build();
  }
  
  public V1alpha3PartitionTypeStatus buildMatchingPartitionSummary(Predicate<V1alpha3PartitionTypeStatusBuilder> predicate) {
      for (V1alpha3PartitionTypeStatusBuilder item : partitionSummary) {
        if (predicate.test(item)) {
          return item.build();
        }
      }
      return null;
  }
  
  public List<V1alpha3PartitionTypeStatus> buildPartitionSummary() {
    return this.partitionSummary != null ? build(partitionSummary) : null;
  }
  
  public V1alpha3PartitionTypeStatus buildPartitionSummary(int index) {
    return this.partitionSummary.get(index).build();
  }
  
  public V1alpha3ShareableSummaryStatus buildShareableSummary() {
    return this.shareableSummary != null ? this.shareableSummary.build() : null;
  }
  
  protected void copyInstance(V1alpha3PoolStatus instance) {
    instance = instance != null ? instance : new V1alpha3PoolStatus();
    if (instance != null) {
        this.withAllocatedDevices(instance.getAllocatedDevices());
        this.withAvailableDevices(instance.getAvailableDevices());
        this.withDriver(instance.getDriver());
        this.withGeneration(instance.getGeneration());
        this.withNodeName(instance.getNodeName());
        this.withPartitionSummary(instance.getPartitionSummary());
        this.withPoolName(instance.getPoolName());
        this.withResourceSliceCount(instance.getResourceSliceCount());
        this.withShareableSummary(instance.getShareableSummary());
        this.withTotalDevices(instance.getTotalDevices());
        this.withUnavailableDevices(instance.getUnavailableDevices());
        this.withValidationError(instance.getValidationError());
    }
  }
  
  public PartitionSummaryNested<A> editFirstPartitionSummary() {
    if (partitionSummary.size() == 0) {
      throw new RuntimeException(String.format("Can't edit first %s. The list is empty.", "partitionSummary"));
    }
    return this.setNewPartitionSummaryLike(0, this.buildPartitionSummary(0));
  }
  
  public PartitionSummaryNested<A> editLastPartitionSummary() {
    int index = partitionSummary.size() - 1;
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit last %s. The list is empty.", "partitionSummary"));
    }
    return this.setNewPartitionSummaryLike(index, this.buildPartitionSummary(index));
  }
  
  public PartitionSummaryNested<A> editMatchingPartitionSummary(Predicate<V1alpha3PartitionTypeStatusBuilder> predicate) {
    int index = -1;
    for (int i = 0;i < partitionSummary.size();i++) {
      if (predicate.test(partitionSummary.get(i))) {
          index = i;
          break;
      }
    }
    if (index < 0) {
      throw new RuntimeException(String.format("Can't edit matching %s. No match found.", "partitionSummary"));
    }
    return this.setNewPartitionSummaryLike(index, this.buildPartitionSummary(index));
  }
  
  public ShareableSummaryNested<A> editOrNewShareableSummary() {
    return this.withNewShareableSummaryLike(Optional.ofNullable(this.buildShareableSummary()).orElse(new V1alpha3ShareableSummaryStatusBuilder().build()));
  }
  
  public ShareableSummaryNested<A> editOrNewShareableSummaryLike(V1alpha3ShareableSummaryStatus item) {
    return this.withNewShareableSummaryLike(Optional.ofNullable(this.buildShareableSummary()).orElse(item));
  }
  
  public PartitionSummaryNested<A> editPartitionSummary(int index) {
    if (partitionSummary.size() <= index) {
      throw new RuntimeException(String.format("Can't edit %s. Index exceeds size.", "partitionSummary"));
    }
    return this.setNewPartitionSummaryLike(index, this.buildPartitionSummary(index));
  }
  
  public ShareableSummaryNested<A> editShareableSummary() {
    return this.withNewShareableSummaryLike(Optional.ofNullable(this.buildShareableSummary()).orElse(null));
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
    V1alpha3PoolStatusFluent<?> that = (V1alpha3PoolStatusFluent<?>) o;
    if (!(Objects.equals(allocatedDevices, that.allocatedDevices))) {
      return false;
    }
    if (!(Objects.equals(availableDevices, that.availableDevices))) {
      return false;
    }
    if (!(Objects.equals(driver, that.driver))) {
      return false;
    }
    if (!(Objects.equals(generation, that.generation))) {
      return false;
    }
    if (!(Objects.equals(nodeName, that.nodeName))) {
      return false;
    }
    if (!(Objects.equals(partitionSummary, that.partitionSummary))) {
      return false;
    }
    if (!(Objects.equals(poolName, that.poolName))) {
      return false;
    }
    if (!(Objects.equals(resourceSliceCount, that.resourceSliceCount))) {
      return false;
    }
    if (!(Objects.equals(shareableSummary, that.shareableSummary))) {
      return false;
    }
    if (!(Objects.equals(totalDevices, that.totalDevices))) {
      return false;
    }
    if (!(Objects.equals(unavailableDevices, that.unavailableDevices))) {
      return false;
    }
    if (!(Objects.equals(validationError, that.validationError))) {
      return false;
    }
    return true;
  }
  
  public Integer getAllocatedDevices() {
    return this.allocatedDevices;
  }
  
  public Integer getAvailableDevices() {
    return this.availableDevices;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public Long getGeneration() {
    return this.generation;
  }
  
  public String getNodeName() {
    return this.nodeName;
  }
  
  public String getPoolName() {
    return this.poolName;
  }
  
  public Integer getResourceSliceCount() {
    return this.resourceSliceCount;
  }
  
  public Integer getTotalDevices() {
    return this.totalDevices;
  }
  
  public Integer getUnavailableDevices() {
    return this.unavailableDevices;
  }
  
  public String getValidationError() {
    return this.validationError;
  }
  
  public boolean hasAllocatedDevices() {
    return this.allocatedDevices != null;
  }
  
  public boolean hasAvailableDevices() {
    return this.availableDevices != null;
  }
  
  public boolean hasDriver() {
    return this.driver != null;
  }
  
  public boolean hasGeneration() {
    return this.generation != null;
  }
  
  public boolean hasMatchingPartitionSummary(Predicate<V1alpha3PartitionTypeStatusBuilder> predicate) {
      for (V1alpha3PartitionTypeStatusBuilder item : partitionSummary) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean hasPartitionSummary() {
    return this.partitionSummary != null && !(this.partitionSummary.isEmpty());
  }
  
  public boolean hasPoolName() {
    return this.poolName != null;
  }
  
  public boolean hasResourceSliceCount() {
    return this.resourceSliceCount != null;
  }
  
  public boolean hasShareableSummary() {
    return this.shareableSummary != null;
  }
  
  public boolean hasTotalDevices() {
    return this.totalDevices != null;
  }
  
  public boolean hasUnavailableDevices() {
    return this.unavailableDevices != null;
  }
  
  public boolean hasValidationError() {
    return this.validationError != null;
  }
  
  public int hashCode() {
    return Objects.hash(allocatedDevices, availableDevices, driver, generation, nodeName, partitionSummary, poolName, resourceSliceCount, shareableSummary, totalDevices, unavailableDevices, validationError);
  }
  
  public A removeAllFromPartitionSummary(Collection<V1alpha3PartitionTypeStatus> items) {
    if (this.partitionSummary == null) {
      return (A) this;
    }
    for (V1alpha3PartitionTypeStatus item : items) {
        V1alpha3PartitionTypeStatusBuilder builder = new V1alpha3PartitionTypeStatusBuilder(item);
        _visitables.get("partitionSummary").remove(builder);
        this.partitionSummary.remove(builder);
    }
    return (A) this;
  }
  
  public A removeFromPartitionSummary(V1alpha3PartitionTypeStatus... items) {
    if (this.partitionSummary == null) {
      return (A) this;
    }
    for (V1alpha3PartitionTypeStatus item : items) {
        V1alpha3PartitionTypeStatusBuilder builder = new V1alpha3PartitionTypeStatusBuilder(item);
        _visitables.get("partitionSummary").remove(builder);
        this.partitionSummary.remove(builder);
    }
    return (A) this;
  }
  
  public A removeMatchingFromPartitionSummary(Predicate<V1alpha3PartitionTypeStatusBuilder> predicate) {
    if (partitionSummary == null) {
      return (A) this;
    }
    Iterator<V1alpha3PartitionTypeStatusBuilder> each = partitionSummary.iterator();
    @SuppressWarnings({"rawtypes"})
    List visitables = this._visitables.get("partitionSummary");
    while (each.hasNext()) {
        V1alpha3PartitionTypeStatusBuilder builder = each.next();
        if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
        }
    }
    return (A) this;
  }
  
  public PartitionSummaryNested<A> setNewPartitionSummaryLike(int index,V1alpha3PartitionTypeStatus item) {
    return new PartitionSummaryNested<>(index, item);
  }
  
  public A setToPartitionSummary(int index,V1alpha3PartitionTypeStatus item) {
    if (this.partitionSummary == null) {
      this.partitionSummary = new ArrayList<>();
    }
    V1alpha3PartitionTypeStatusBuilder builder = new V1alpha3PartitionTypeStatusBuilder(item);
    if (index < 0 || index >= this.partitionSummary.size()) {
        this._visitables.get("partitionSummary").add(builder);
        this.partitionSummary.add(builder);
    } else {
        this._visitables.get("partitionSummary").add(builder);
        this.partitionSummary.set(index, builder);
    }
    return (A) this;
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocatedDevices == null)) {
        sb.append("allocatedDevices:");
        sb.append(allocatedDevices);
        sb.append(",");
    }
    if (!(availableDevices == null)) {
        sb.append("availableDevices:");
        sb.append(availableDevices);
        sb.append(",");
    }
    if (!(driver == null)) {
        sb.append("driver:");
        sb.append(driver);
        sb.append(",");
    }
    if (!(generation == null)) {
        sb.append("generation:");
        sb.append(generation);
        sb.append(",");
    }
    if (!(nodeName == null)) {
        sb.append("nodeName:");
        sb.append(nodeName);
        sb.append(",");
    }
    if (!(partitionSummary == null) && !(partitionSummary.isEmpty())) {
        sb.append("partitionSummary:");
        sb.append(partitionSummary);
        sb.append(",");
    }
    if (!(poolName == null)) {
        sb.append("poolName:");
        sb.append(poolName);
        sb.append(",");
    }
    if (!(resourceSliceCount == null)) {
        sb.append("resourceSliceCount:");
        sb.append(resourceSliceCount);
        sb.append(",");
    }
    if (!(shareableSummary == null)) {
        sb.append("shareableSummary:");
        sb.append(shareableSummary);
        sb.append(",");
    }
    if (!(totalDevices == null)) {
        sb.append("totalDevices:");
        sb.append(totalDevices);
        sb.append(",");
    }
    if (!(unavailableDevices == null)) {
        sb.append("unavailableDevices:");
        sb.append(unavailableDevices);
        sb.append(",");
    }
    if (!(validationError == null)) {
        sb.append("validationError:");
        sb.append(validationError);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllocatedDevices(Integer allocatedDevices) {
    this.allocatedDevices = allocatedDevices;
    return (A) this;
  }
  
  public A withAvailableDevices(Integer availableDevices) {
    this.availableDevices = availableDevices;
    return (A) this;
  }
  
  public A withDriver(String driver) {
    this.driver = driver;
    return (A) this;
  }
  
  public A withGeneration(Long generation) {
    this.generation = generation;
    return (A) this;
  }
  
  public ShareableSummaryNested<A> withNewShareableSummary() {
    return new ShareableSummaryNested<>(null);
  }
  
  public ShareableSummaryNested<A> withNewShareableSummaryLike(V1alpha3ShareableSummaryStatus item) {
    return new ShareableSummaryNested<>(item);
  }
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
    return (A) this;
  }
  
  public A withPartitionSummary(List<V1alpha3PartitionTypeStatus> partitionSummary) {
    if (this.partitionSummary != null) {
      this._visitables.get("partitionSummary").clear();
    }
    if (partitionSummary != null) {
        this.partitionSummary = new ArrayList<>();
        for (V1alpha3PartitionTypeStatus item : partitionSummary) {
          this.addToPartitionSummary(item);
        }
    } else {
      this.partitionSummary = null;
    }
    return (A) this;
  }
  
  public A withPartitionSummary(V1alpha3PartitionTypeStatus... partitionSummary) {
    if (this.partitionSummary != null) {
        this.partitionSummary.clear();
        _visitables.remove("partitionSummary");
    }
    if (partitionSummary != null) {
      for (V1alpha3PartitionTypeStatus item : partitionSummary) {
        this.addToPartitionSummary(item);
      }
    }
    return (A) this;
  }
  
  public A withPoolName(String poolName) {
    this.poolName = poolName;
    return (A) this;
  }
  
  public A withResourceSliceCount(Integer resourceSliceCount) {
    this.resourceSliceCount = resourceSliceCount;
    return (A) this;
  }
  
  public A withShareableSummary(V1alpha3ShareableSummaryStatus shareableSummary) {
    this._visitables.remove("shareableSummary");
    if (shareableSummary != null) {
        this.shareableSummary = new V1alpha3ShareableSummaryStatusBuilder(shareableSummary);
        this._visitables.get("shareableSummary").add(this.shareableSummary);
    } else {
        this._visitables.get("shareableSummary").remove(this.shareableSummary);
        this.shareableSummary = null;
    }
    return (A) this;
  }
  
  public A withTotalDevices(Integer totalDevices) {
    this.totalDevices = totalDevices;
    return (A) this;
  }
  
  public A withUnavailableDevices(Integer unavailableDevices) {
    this.unavailableDevices = unavailableDevices;
    return (A) this;
  }
  
  public A withValidationError(String validationError) {
    this.validationError = validationError;
    return (A) this;
  }
  public class PartitionSummaryNested<N> extends V1alpha3PartitionTypeStatusFluent<PartitionSummaryNested<N>> implements Nested<N>{
  
    V1alpha3PartitionTypeStatusBuilder builder;
    int index;
  
    PartitionSummaryNested(int index,V1alpha3PartitionTypeStatus item) {
      this.index = index;
      this.builder = new V1alpha3PartitionTypeStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3PoolStatusFluent.this.setToPartitionSummary(index, builder.build());
    }
    
    public N endPartitionSummary() {
      return and();
    }
    
  }
  public class ShareableSummaryNested<N> extends V1alpha3ShareableSummaryStatusFluent<ShareableSummaryNested<N>> implements Nested<N>{
  
    V1alpha3ShareableSummaryStatusBuilder builder;
  
    ShareableSummaryNested(V1alpha3ShareableSummaryStatus item) {
      this.builder = new V1alpha3ShareableSummaryStatusBuilder(this, item);
    }
  
    public N and() {
      return (N) V1alpha3PoolStatusFluent.this.withShareableSummary(builder.build());
    }
    
    public N endShareableSummary() {
      return and();
    }
    
  }
}