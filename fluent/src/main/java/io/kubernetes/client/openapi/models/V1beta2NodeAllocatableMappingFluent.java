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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1beta2NodeAllocatableMappingFluent<A extends V1beta2NodeAllocatableMappingFluent<A>> extends BaseFluent<A>{

  private String capacityKey;
  private Quantity capacityMultiplier;
  private Quantity deviceMultiplier;

  public V1beta2NodeAllocatableMappingFluent() {
  }
  
  public V1beta2NodeAllocatableMappingFluent(V1beta2NodeAllocatableMapping instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta2NodeAllocatableMapping instance) {
    instance = instance != null ? instance : new V1beta2NodeAllocatableMapping();
    if (instance != null) {
        this.withCapacityKey(instance.getCapacityKey());
        this.withCapacityMultiplier(instance.getCapacityMultiplier());
        this.withDeviceMultiplier(instance.getDeviceMultiplier());
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
    V1beta2NodeAllocatableMappingFluent<?> that = (V1beta2NodeAllocatableMappingFluent<?>) o;
    if (!(Objects.equals(capacityKey, that.capacityKey))) {
      return false;
    }
    if (!(Objects.equals(capacityMultiplier, that.capacityMultiplier))) {
      return false;
    }
    if (!(Objects.equals(deviceMultiplier, that.deviceMultiplier))) {
      return false;
    }
    return true;
  }
  
  public String getCapacityKey() {
    return this.capacityKey;
  }
  
  public Quantity getCapacityMultiplier() {
    return this.capacityMultiplier;
  }
  
  public Quantity getDeviceMultiplier() {
    return this.deviceMultiplier;
  }
  
  public boolean hasCapacityKey() {
    return this.capacityKey != null;
  }
  
  public boolean hasCapacityMultiplier() {
    return this.capacityMultiplier != null;
  }
  
  public boolean hasDeviceMultiplier() {
    return this.deviceMultiplier != null;
  }
  
  public int hashCode() {
    return Objects.hash(capacityKey, capacityMultiplier, deviceMultiplier);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(capacityKey == null)) {
        sb.append("capacityKey:");
        sb.append(capacityKey);
        sb.append(",");
    }
    if (!(capacityMultiplier == null)) {
        sb.append("capacityMultiplier:");
        sb.append(capacityMultiplier);
        sb.append(",");
    }
    if (!(deviceMultiplier == null)) {
        sb.append("deviceMultiplier:");
        sb.append(deviceMultiplier);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCapacityKey(String capacityKey) {
    this.capacityKey = capacityKey;
    return (A) this;
  }
  
  public A withCapacityMultiplier(Quantity capacityMultiplier) {
    this.capacityMultiplier = capacityMultiplier;
    return (A) this;
  }
  
  public A withDeviceMultiplier(Quantity deviceMultiplier) {
    this.deviceMultiplier = deviceMultiplier;
    return (A) this;
  }
  
  public A withNewCapacityMultiplier(String value) {
    return (A) this.withCapacityMultiplier(new Quantity(value));
  }
  
  public A withNewDeviceMultiplier(String value) {
    return (A) this.withDeviceMultiplier(new Quantity(value));
  }
  
}