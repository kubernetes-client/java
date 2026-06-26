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

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ContainerStateRunningFluent<A extends io.kubernetes.client.openapi.models.V1ContainerStateRunningFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime startedAt;

  public V1ContainerStateRunningFluent() {
  }
  
  public V1ContainerStateRunningFluent(V1ContainerStateRunning instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ContainerStateRunning instance) {
    instance = instance != null ? instance : new V1ContainerStateRunning();
    if (instance != null) {
      this.withStartedAt(instance.getStartedAt());
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
    V1ContainerStateRunningFluent that = (V1ContainerStateRunningFluent) o;
    if (!(Objects.equals(startedAt, that.startedAt))) {
      return false;
    }
    return true;
  }
  
  public OffsetDateTime getStartedAt() {
    return this.startedAt;
  }
  
  public boolean hasStartedAt() {
    return this.startedAt != null;
  }
  
  public int hashCode() {
    return Objects.hash(startedAt);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(startedAt == null)) {
        sb.append("startedAt:");
        sb.append(startedAt);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return (A) this;
  }
  
}