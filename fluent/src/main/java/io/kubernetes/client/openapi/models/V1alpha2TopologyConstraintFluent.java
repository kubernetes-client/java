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
public class V1alpha2TopologyConstraintFluent<A extends io.kubernetes.client.openapi.models.V1alpha2TopologyConstraintFluent<A>> extends BaseFluent<A>{

  private String key;

  public V1alpha2TopologyConstraintFluent() {
  }
  
  public V1alpha2TopologyConstraintFluent(V1alpha2TopologyConstraint instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha2TopologyConstraint instance) {
    instance = instance != null ? instance : new V1alpha2TopologyConstraint();
    if (instance != null) {
      this.withKey(instance.getKey());
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
    V1alpha2TopologyConstraintFluent that = (V1alpha2TopologyConstraintFluent) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    return true;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public int hashCode() {
    return Objects.hash(key);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
}