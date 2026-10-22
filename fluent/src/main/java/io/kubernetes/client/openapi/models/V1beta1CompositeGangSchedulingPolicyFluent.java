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
public class V1beta1CompositeGangSchedulingPolicyFluent<A extends V1beta1CompositeGangSchedulingPolicyFluent<A>> extends BaseFluent<A>{

  private Integer minGroupCount;

  public V1beta1CompositeGangSchedulingPolicyFluent() {
  }
  
  public V1beta1CompositeGangSchedulingPolicyFluent(V1beta1CompositeGangSchedulingPolicy instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta1CompositeGangSchedulingPolicy instance) {
    instance = instance != null ? instance : new V1beta1CompositeGangSchedulingPolicy();
    if (instance != null) {
      this.withMinGroupCount(instance.getMinGroupCount());
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
    V1beta1CompositeGangSchedulingPolicyFluent<?> that = (V1beta1CompositeGangSchedulingPolicyFluent<?>) o;
    if (!(Objects.equals(minGroupCount, that.minGroupCount))) {
      return false;
    }
    return true;
  }
  
  public Integer getMinGroupCount() {
    return this.minGroupCount;
  }
  
  public boolean hasMinGroupCount() {
    return this.minGroupCount != null;
  }
  
  public int hashCode() {
    return Objects.hash(minGroupCount);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(minGroupCount == null)) {
        sb.append("minGroupCount:");
        sb.append(minGroupCount);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMinGroupCount(Integer minGroupCount) {
    this.minGroupCount = minGroupCount;
    return (A) this;
  }
  
}