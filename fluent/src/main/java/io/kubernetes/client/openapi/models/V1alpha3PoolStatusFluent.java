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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha3PoolStatusFluent<A extends io.kubernetes.client.openapi.models.V1alpha3PoolStatusFluent<A>> extends BaseFluent<A>{

  private Integer allocatedDevices;
  private Integer availableDevices;
  private String driver;
  private Long generation;
  private String nodeName;
  private String poolName;
  private Integer resourceSliceCount;
  private Integer totalDevices;
  private Integer unavailableDevices;
  private String validationError;

  public V1alpha3PoolStatusFluent() {
  }
  
  public V1alpha3PoolStatusFluent(V1alpha3PoolStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3PoolStatus instance) {
    instance = instance != null ? instance : new V1alpha3PoolStatus();
    if (instance != null) {
        this.withAllocatedDevices(instance.getAllocatedDevices());
        this.withAvailableDevices(instance.getAvailableDevices());
        this.withDriver(instance.getDriver());
        this.withGeneration(instance.getGeneration());
        this.withNodeName(instance.getNodeName());
        this.withPoolName(instance.getPoolName());
        this.withResourceSliceCount(instance.getResourceSliceCount());
        this.withTotalDevices(instance.getTotalDevices());
        this.withUnavailableDevices(instance.getUnavailableDevices());
        this.withValidationError(instance.getValidationError());
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
    V1alpha3PoolStatusFluent that = (V1alpha3PoolStatusFluent) o;
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
    if (!(Objects.equals(poolName, that.poolName))) {
      return false;
    }
    if (!(Objects.equals(resourceSliceCount, that.resourceSliceCount))) {
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
  
  public boolean hasNodeName() {
    return this.nodeName != null;
  }
  
  public boolean hasPoolName() {
    return this.poolName != null;
  }
  
  public boolean hasResourceSliceCount() {
    return this.resourceSliceCount != null;
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
    return Objects.hash(allocatedDevices, availableDevices, driver, generation, nodeName, poolName, resourceSliceCount, totalDevices, unavailableDevices, validationError);
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
  
  public A withNodeName(String nodeName) {
    this.nodeName = nodeName;
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
  
}