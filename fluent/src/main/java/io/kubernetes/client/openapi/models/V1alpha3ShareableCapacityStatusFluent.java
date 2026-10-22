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
public class V1alpha3ShareableCapacityStatusFluent<A extends V1alpha3ShareableCapacityStatusFluent<A>> extends BaseFluent<A>{

  private Quantity available;
  private Quantity consumed;
  private String name;
  private Quantity total;

  public V1alpha3ShareableCapacityStatusFluent() {
  }
  
  public V1alpha3ShareableCapacityStatusFluent(V1alpha3ShareableCapacityStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3ShareableCapacityStatus instance) {
    instance = instance != null ? instance : new V1alpha3ShareableCapacityStatus();
    if (instance != null) {
        this.withAvailable(instance.getAvailable());
        this.withConsumed(instance.getConsumed());
        this.withName(instance.getName());
        this.withTotal(instance.getTotal());
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
    V1alpha3ShareableCapacityStatusFluent<?> that = (V1alpha3ShareableCapacityStatusFluent<?>) o;
    if (!(Objects.equals(available, that.available))) {
      return false;
    }
    if (!(Objects.equals(consumed, that.consumed))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(total, that.total))) {
      return false;
    }
    return true;
  }
  
  public Quantity getAvailable() {
    return this.available;
  }
  
  public Quantity getConsumed() {
    return this.consumed;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Quantity getTotal() {
    return this.total;
  }
  
  public boolean hasAvailable() {
    return this.available != null;
  }
  
  public boolean hasConsumed() {
    return this.consumed != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasTotal() {
    return this.total != null;
  }
  
  public int hashCode() {
    return Objects.hash(available, consumed, name, total);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(available == null)) {
        sb.append("available:");
        sb.append(available);
        sb.append(",");
    }
    if (!(consumed == null)) {
        sb.append("consumed:");
        sb.append(consumed);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(total == null)) {
        sb.append("total:");
        sb.append(total);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAvailable(Quantity available) {
    this.available = available;
    return (A) this;
  }
  
  public A withConsumed(Quantity consumed) {
    this.consumed = consumed;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNewAvailable(String value) {
    return (A) this.withAvailable(new Quantity(value));
  }
  
  public A withNewConsumed(String value) {
    return (A) this.withConsumed(new Quantity(value));
  }
  
  public A withNewTotal(String value) {
    return (A) this.withTotal(new Quantity(value));
  }
  
  public A withTotal(Quantity total) {
    this.total = total;
    return (A) this;
  }
  
}