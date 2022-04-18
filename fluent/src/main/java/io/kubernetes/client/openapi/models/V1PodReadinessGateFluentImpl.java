/*
Copyright 2022 The Kubernetes Authors.
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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1PodReadinessGateFluentImpl<A extends V1PodReadinessGateFluent<A>>
    extends BaseFluent<A> implements V1PodReadinessGateFluent<A> {
  public V1PodReadinessGateFluentImpl() {}

  public V1PodReadinessGateFluentImpl(
      io.kubernetes.client.openapi.models.V1PodReadinessGate instance) {
    this.withConditionType(instance.getConditionType());
  }

  private String conditionType;

  public java.lang.String getConditionType() {
    return this.conditionType;
  }

  public A withConditionType(java.lang.String conditionType) {
    this.conditionType = conditionType;
    return (A) this;
  }

  public Boolean hasConditionType() {
    return this.conditionType != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PodReadinessGateFluentImpl that = (V1PodReadinessGateFluentImpl) o;
    if (conditionType != null
        ? !conditionType.equals(that.conditionType)
        : that.conditionType != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(conditionType, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (conditionType != null) {
      sb.append("conditionType:");
      sb.append(conditionType);
    }
    sb.append("}");
    return sb.toString();
  }
}
