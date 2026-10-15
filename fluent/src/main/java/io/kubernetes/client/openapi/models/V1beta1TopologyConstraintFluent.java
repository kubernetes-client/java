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
public class V1beta1TopologyConstraintFluent<A extends V1beta1TopologyConstraintFluent<A>> extends BaseFluent<A>{

  private String key;

  public V1beta1TopologyConstraintFluent() {
  }
  
  public V1beta1TopologyConstraintFluent(V1beta1TopologyConstraint instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta1TopologyConstraint instance) {
    instance = instance != null ? instance : new V1beta1TopologyConstraint();
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
    V1beta1TopologyConstraintFluent<?> that = (V1beta1TopologyConstraintFluent<?>) o;
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