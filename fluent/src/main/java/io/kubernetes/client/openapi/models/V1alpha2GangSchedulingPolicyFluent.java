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

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2GangSchedulingPolicyFluent<A extends io.kubernetes.client.openapi.models.V1alpha2GangSchedulingPolicyFluent<A>> extends BaseFluent<A>{

  private Integer minCount;

  public V1alpha2GangSchedulingPolicyFluent() {
  }
  
  public V1alpha2GangSchedulingPolicyFluent(V1alpha2GangSchedulingPolicy instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha2GangSchedulingPolicy instance) {
    instance = instance != null ? instance : new V1alpha2GangSchedulingPolicy();
    if (instance != null) {
      this.withMinCount(instance.getMinCount());
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
    V1alpha2GangSchedulingPolicyFluent that = (V1alpha2GangSchedulingPolicyFluent) o;
    if (!(Objects.equals(minCount, that.minCount))) {
      return false;
    }
    return true;
  }
  
  public Integer getMinCount() {
    return this.minCount;
  }
  
  public boolean hasMinCount() {
    return this.minCount != null;
  }
  
  public int hashCode() {
    return Objects.hash(minCount);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(minCount == null)) {
        sb.append("minCount:");
        sb.append(minCount);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMinCount(Integer minCount) {
    this.minCount = minCount;
    return (A) this;
  }
  
}