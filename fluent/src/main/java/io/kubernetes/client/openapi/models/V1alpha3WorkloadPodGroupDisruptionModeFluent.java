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
import javax.annotation.processing.Generated;

/**
 * Generated
 */
@Generated("io.sundr:builder-annotations")
@SuppressWarnings({"unchecked"})
public class V1alpha3WorkloadPodGroupDisruptionModeFluent<A extends V1alpha3WorkloadPodGroupDisruptionModeFluent<A>> extends BaseFluent<A>{

  private Object all;
  private Object single;

  public V1alpha3WorkloadPodGroupDisruptionModeFluent() {
  }
  
  public V1alpha3WorkloadPodGroupDisruptionModeFluent(V1alpha3WorkloadPodGroupDisruptionMode instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha3WorkloadPodGroupDisruptionMode instance) {
    instance = instance != null ? instance : new V1alpha3WorkloadPodGroupDisruptionMode();
    if (instance != null) {
        this.withAll(instance.getAll());
        this.withSingle(instance.getSingle());
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
    V1alpha3WorkloadPodGroupDisruptionModeFluent<?> that = (V1alpha3WorkloadPodGroupDisruptionModeFluent<?>) o;
    if (!(Objects.equals(all, that.all))) {
      return false;
    }
    if (!(Objects.equals(single, that.single))) {
      return false;
    }
    return true;
  }
  
  public Object getAll() {
    return this.all;
  }
  
  public Object getSingle() {
    return this.single;
  }
  
  public boolean hasAll() {
    return this.all != null;
  }
  
  public boolean hasSingle() {
    return this.single != null;
  }
  
  public int hashCode() {
    return Objects.hash(all, single);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(all == null)) {
        sb.append("all:");
        sb.append(all);
        sb.append(",");
    }
    if (!(single == null)) {
        sb.append("single:");
        sb.append(single);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withAll(Object all) {
    this.all = all;
    return (A) this;
  }
  
  public A withSingle(Object single) {
    this.single = single;
    return (A) this;
  }
  
}