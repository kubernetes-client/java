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
public class V1NodeSwapStatusFluent<A extends io.kubernetes.client.openapi.models.V1NodeSwapStatusFluent<A>> extends BaseFluent<A>{

  private Long capacity;

  public V1NodeSwapStatusFluent() {
  }
  
  public V1NodeSwapStatusFluent(V1NodeSwapStatus instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NodeSwapStatus instance) {
    instance = instance != null ? instance : new V1NodeSwapStatus();
    if (instance != null) {
      this.withCapacity(instance.getCapacity());
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
    V1NodeSwapStatusFluent that = (V1NodeSwapStatusFluent) o;
    if (!(Objects.equals(capacity, that.capacity))) {
      return false;
    }
    return true;
  }
  
  public Long getCapacity() {
    return this.capacity;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public int hashCode() {
    return Objects.hash(capacity);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(capacity == null)) {
        sb.append("capacity:");
        sb.append(capacity);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withCapacity(Long capacity) {
    this.capacity = capacity;
    return (A) this;
  }
  
}