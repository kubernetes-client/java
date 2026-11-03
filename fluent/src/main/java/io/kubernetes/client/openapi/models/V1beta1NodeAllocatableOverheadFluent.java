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
public class V1beta1NodeAllocatableOverheadFluent<A extends V1beta1NodeAllocatableOverheadFluent<A>> extends BaseFluent<A>{

  private Quantity perContainer;
  private Quantity perPod;

  public V1beta1NodeAllocatableOverheadFluent() {
  }
  
  public V1beta1NodeAllocatableOverheadFluent(V1beta1NodeAllocatableOverhead instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta1NodeAllocatableOverhead instance) {
    instance = instance != null ? instance : new V1beta1NodeAllocatableOverhead();
    if (instance != null) {
        this.withPerContainer(instance.getPerContainer());
        this.withPerPod(instance.getPerPod());
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
    V1beta1NodeAllocatableOverheadFluent<?> that = (V1beta1NodeAllocatableOverheadFluent<?>) o;
    if (!(Objects.equals(perContainer, that.perContainer))) {
      return false;
    }
    if (!(Objects.equals(perPod, that.perPod))) {
      return false;
    }
    return true;
  }
  
  public Quantity getPerContainer() {
    return this.perContainer;
  }
  
  public Quantity getPerPod() {
    return this.perPod;
  }
  
  public boolean hasPerContainer() {
    return this.perContainer != null;
  }
  
  public boolean hasPerPod() {
    return this.perPod != null;
  }
  
  public int hashCode() {
    return Objects.hash(perContainer, perPod);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(perContainer == null)) {
        sb.append("perContainer:");
        sb.append(perContainer);
        sb.append(",");
    }
    if (!(perPod == null)) {
        sb.append("perPod:");
        sb.append(perPod);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withNewPerContainer(String value) {
    return (A) this.withPerContainer(new Quantity(value));
  }
  
  public A withNewPerPod(String value) {
    return (A) this.withPerPod(new Quantity(value));
  }
  
  public A withPerContainer(Quantity perContainer) {
    this.perContainer = perContainer;
    return (A) this;
  }
  
  public A withPerPod(Quantity perPod) {
    this.perPod = perPod;
    return (A) this;
  }
  
}