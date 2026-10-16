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
public class V1alpha3PartitionTypeStatusFluent<A extends V1alpha3PartitionTypeStatusFluent<A>> extends BaseFluent<A>{

  private Integer allocatable;
  private String attribute;
  private Integer total;
  private String type;

  public V1alpha3PartitionTypeStatusFluent() {
  }
  
  public V1alpha3PartitionTypeStatusFluent(V1alpha3PartitionTypeStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3PartitionTypeStatus instance) {
    instance = instance != null ? instance : new V1alpha3PartitionTypeStatus();
    if (instance != null) {
        this.withAllocatable(instance.getAllocatable());
        this.withAttribute(instance.getAttribute());
        this.withTotal(instance.getTotal());
        this.withType(instance.getType());
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
    V1alpha3PartitionTypeStatusFluent<?> that = (V1alpha3PartitionTypeStatusFluent<?>) o;
    if (!(Objects.equals(allocatable, that.allocatable))) {
      return false;
    }
    if (!(Objects.equals(attribute, that.attribute))) {
      return false;
    }
    if (!(Objects.equals(total, that.total))) {
      return false;
    }
    if (!(Objects.equals(type, that.type))) {
      return false;
    }
    return true;
  }
  
  public Integer getAllocatable() {
    return this.allocatable;
  }
  
  public String getAttribute() {
    return this.attribute;
  }
  
  public Integer getTotal() {
    return this.total;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean hasAllocatable() {
    return this.allocatable != null;
  }
  
  public boolean hasAttribute() {
    return this.attribute != null;
  }
  
  public boolean hasTotal() {
    return this.total != null;
  }
  
  public boolean hasType() {
    return this.type != null;
  }
  
  public int hashCode() {
    return Objects.hash(allocatable, attribute, total, type);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(allocatable == null)) {
        sb.append("allocatable:");
        sb.append(allocatable);
        sb.append(",");
    }
    if (!(attribute == null)) {
        sb.append("attribute:");
        sb.append(attribute);
        sb.append(",");
    }
    if (!(total == null)) {
        sb.append("total:");
        sb.append(total);
        sb.append(",");
    }
    if (!(type == null)) {
        sb.append("type:");
        sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAllocatable(Integer allocatable) {
    this.allocatable = allocatable;
    return (A) this;
  }
  
  public A withAttribute(String attribute) {
    this.attribute = attribute;
    return (A) this;
  }
  
  public A withTotal(Integer total) {
    this.total = total;
    return (A) this;
  }
  
  public A withType(String type) {
    this.type = type;
    return (A) this;
  }
  
}