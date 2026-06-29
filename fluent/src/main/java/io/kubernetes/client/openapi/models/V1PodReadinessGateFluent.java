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
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodReadinessGateFluent<A extends io.kubernetes.client.openapi.models.V1PodReadinessGateFluent<A>> extends BaseFluent<A>{

  private String conditionType;

  public V1PodReadinessGateFluent() {
  }
  
  public V1PodReadinessGateFluent(V1PodReadinessGate instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PodReadinessGate instance) {
    instance = instance != null ? instance : new V1PodReadinessGate();
    if (instance != null) {
      this.withConditionType(instance.getConditionType());
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
    V1PodReadinessGateFluent that = (V1PodReadinessGateFluent) o;
    if (!(Objects.equals(conditionType, that.conditionType))) {
      return false;
    }
    return true;
  }
  
  public String getConditionType() {
    return this.conditionType;
  }
  
  public boolean hasConditionType() {
    return this.conditionType != null;
  }
  
  public int hashCode() {
    return Objects.hash(conditionType);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(conditionType == null)) {
        sb.append("conditionType:");
        sb.append(conditionType);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withConditionType(String conditionType) {
    this.conditionType = conditionType;
    return (A) this;
  }
  
}