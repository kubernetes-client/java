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
public class V1RollingUpdateStatefulSetStrategyFluentImpl<
        A extends V1RollingUpdateStatefulSetStrategyFluent<A>>
    extends BaseFluent<A> implements V1RollingUpdateStatefulSetStrategyFluent<A> {
  public V1RollingUpdateStatefulSetStrategyFluentImpl() {}

  public V1RollingUpdateStatefulSetStrategyFluentImpl(
      io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategy instance) {
    this.withPartition(instance.getPartition());
  }

  private Integer partition;

  public java.lang.Integer getPartition() {
    return this.partition;
  }

  public A withPartition(java.lang.Integer partition) {
    this.partition = partition;
    return (A) this;
  }

  public Boolean hasPartition() {
    return this.partition != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RollingUpdateStatefulSetStrategyFluentImpl that =
        (V1RollingUpdateStatefulSetStrategyFluentImpl) o;
    if (partition != null ? !partition.equals(that.partition) : that.partition != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(partition, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (partition != null) {
      sb.append("partition:");
      sb.append(partition);
    }
    sb.append("}");
    return sb.toString();
  }
}
