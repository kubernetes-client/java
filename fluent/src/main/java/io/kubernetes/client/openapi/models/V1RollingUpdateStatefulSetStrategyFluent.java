/*
Copyright 2020 The Kubernetes Authors.
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

import io.kubernetes.client.custom.IntOrString;
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
public class V1RollingUpdateStatefulSetStrategyFluent<A extends io.kubernetes.client.openapi.models.V1RollingUpdateStatefulSetStrategyFluent<A>> extends BaseFluent<A>{

  private IntOrString maxUnavailable;
  private Integer partition;

  public V1RollingUpdateStatefulSetStrategyFluent() {
  }
  
  public V1RollingUpdateStatefulSetStrategyFluent(V1RollingUpdateStatefulSetStrategy instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1RollingUpdateStatefulSetStrategy instance) {
    instance = instance != null ? instance : new V1RollingUpdateStatefulSetStrategy();
    if (instance != null) {
        this.withMaxUnavailable(instance.getMaxUnavailable());
        this.withPartition(instance.getPartition());
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
    V1RollingUpdateStatefulSetStrategyFluent that = (V1RollingUpdateStatefulSetStrategyFluent) o;
    if (!(Objects.equals(maxUnavailable, that.maxUnavailable))) {
      return false;
    }
    if (!(Objects.equals(partition, that.partition))) {
      return false;
    }
    return true;
  }
  
  public IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }
  
  public Integer getPartition() {
    return this.partition;
  }
  
  public boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }
  
  public boolean hasPartition() {
    return this.partition != null;
  }
  
  public int hashCode() {
    return Objects.hash(maxUnavailable, partition);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(maxUnavailable == null)) {
        sb.append("maxUnavailable:");
        sb.append(maxUnavailable);
        sb.append(",");
    }
    if (!(partition == null)) {
        sb.append("partition:");
        sb.append(partition);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withMaxUnavailable(IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }
  
  public A withNewMaxUnavailable(int value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public A withNewMaxUnavailable(String value) {
    return (A) this.withMaxUnavailable(new IntOrString(value));
  }
  
  public A withPartition(Integer partition) {
    this.partition = partition;
    return (A) this;
  }
  
}