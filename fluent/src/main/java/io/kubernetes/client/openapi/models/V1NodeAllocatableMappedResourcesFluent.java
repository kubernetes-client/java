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
public class V1NodeAllocatableMappedResourcesFluent<A extends V1NodeAllocatableMappedResourcesFluent<A>> extends BaseFluent<A>{

  private String name;
  private Quantity quantity;

  public V1NodeAllocatableMappedResourcesFluent() {
  }
  
  public V1NodeAllocatableMappedResourcesFluent(V1NodeAllocatableMappedResources instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NodeAllocatableMappedResources instance) {
    instance = instance != null ? instance : new V1NodeAllocatableMappedResources();
    if (instance != null) {
        this.withName(instance.getName());
        this.withQuantity(instance.getQuantity());
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
    V1NodeAllocatableMappedResourcesFluent<?> that = (V1NodeAllocatableMappedResourcesFluent<?>) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    if (!(Objects.equals(quantity, that.quantity))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Quantity getQuantity() {
    return this.quantity;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean hasQuantity() {
    return this.quantity != null;
  }
  
  public int hashCode() {
    return Objects.hash(name, quantity);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
        sb.append(",");
    }
    if (!(quantity == null)) {
        sb.append("quantity:");
        sb.append(quantity);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public A withNewQuantity(String value) {
    return (A) this.withQuantity(new Quantity(value));
  }
  
  public A withQuantity(Quantity quantity) {
    this.quantity = quantity;
    return (A) this;
  }
  
}