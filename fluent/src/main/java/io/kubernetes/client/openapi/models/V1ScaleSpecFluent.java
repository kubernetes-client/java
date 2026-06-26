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
public class V1ScaleSpecFluent<A extends io.kubernetes.client.openapi.models.V1ScaleSpecFluent<A>> extends BaseFluent<A>{

  private Integer replicas;

  public V1ScaleSpecFluent() {
  }
  
  public V1ScaleSpecFluent(V1ScaleSpec instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ScaleSpec instance) {
    instance = instance != null ? instance : new V1ScaleSpec();
    if (instance != null) {
      this.withReplicas(instance.getReplicas());
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
    V1ScaleSpecFluent that = (V1ScaleSpecFluent) o;
    if (!(Objects.equals(replicas, that.replicas))) {
      return false;
    }
    return true;
  }
  
  public Integer getReplicas() {
    return this.replicas;
  }
  
  public boolean hasReplicas() {
    return this.replicas != null;
  }
  
  public int hashCode() {
    return Objects.hash(replicas);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(replicas == null)) {
        sb.append("replicas:");
        sb.append(replicas);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }
  
}