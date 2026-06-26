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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1NodeAllocatableResourceMappingFluent<A extends io.kubernetes.client.openapi.models.V1beta1NodeAllocatableResourceMappingFluent<A>> extends BaseFluent<A>{

  private Quantity allocationMultiplier;
  private String capacityKey;

  public V1beta1NodeAllocatableResourceMappingFluent() {
  }
  
  public V1beta1NodeAllocatableResourceMappingFluent(V1beta1NodeAllocatableResourceMapping instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta1NodeAllocatableResourceMapping instance) {
    instance = instance != null ? instance : new V1beta1NodeAllocatableResourceMapping();
    if (instance != null) {
        this.withAllocationMultiplier(instance.getAllocationMultiplier());
        this.withCapacityKey(instance.getCapacityKey());
    }
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
    V1beta1NodeAllocatableResourceMappingFluent that = (V1beta1NodeAllocatableResourceMappingFluent) o;
    if (!(Objects.equals(allocationMultiplier, that.allocationMultiplier))) {
      return false;
    }
    if (!(Objects.equals(capacityKey, that.capacityKey))) {
      return false;
    }
    return true;
  }
  
  public Quantity getAllocationMultiplier() {
    return this.allocationMultiplier;
  }
  
  public String getCapacityKey() {
    return this.capacityKey;
  }
  
  public boolean hasAllocationMultiplier() {
    return this.allocationMultiplier != null;
  }
  
  public boolean hasCapacityKey() {
    return this.capacityKey != null;
  }
  
  public int hashCode() {
    return Objects.hash(allocationMultiplier, capacityKey);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocationMultiplier == null)) {
        sb.append("allocationMultiplier:");
        sb.append(allocationMultiplier);
        sb.append(",");
    }
    if (!(capacityKey == null)) {
        sb.append("capacityKey:");
        sb.append(capacityKey);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllocationMultiplier(Quantity allocationMultiplier) {
    this.allocationMultiplier = allocationMultiplier;
    return (A) this;
  }
  
  public A withCapacityKey(String capacityKey) {
    this.capacityKey = capacityKey;
    return (A) this;
  }
  
  public A withNewAllocationMultiplier(String value) {
    return (A) this.withAllocationMultiplier(new Quantity(value));
  }
  
}