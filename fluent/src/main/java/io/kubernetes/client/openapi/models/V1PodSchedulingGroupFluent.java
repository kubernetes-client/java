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
public class V1PodSchedulingGroupFluent<A extends io.kubernetes.client.openapi.models.V1PodSchedulingGroupFluent<A>> extends BaseFluent<A>{

  private String podGroupName;

  public V1PodSchedulingGroupFluent() {
  }
  
  public V1PodSchedulingGroupFluent(V1PodSchedulingGroup instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PodSchedulingGroup instance) {
    instance = instance != null ? instance : new V1PodSchedulingGroup();
    if (instance != null) {
      this.withPodGroupName(instance.getPodGroupName());
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
    V1PodSchedulingGroupFluent that = (V1PodSchedulingGroupFluent) o;
    if (!(Objects.equals(podGroupName, that.podGroupName))) {
      return false;
    }
    return true;
  }
  
  public String getPodGroupName() {
    return this.podGroupName;
  }
  
  public boolean hasPodGroupName() {
    return this.podGroupName != null;
  }
  
  public int hashCode() {
    return Objects.hash(podGroupName);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(podGroupName == null)) {
        sb.append("podGroupName:");
        sb.append(podGroupName);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withPodGroupName(String podGroupName) {
    this.podGroupName = podGroupName;
    return (A) this;
  }
  
}