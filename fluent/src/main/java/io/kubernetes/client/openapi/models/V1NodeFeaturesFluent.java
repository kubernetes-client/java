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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1NodeFeaturesFluent<A extends io.kubernetes.client.openapi.models.V1NodeFeaturesFluent<A>> extends BaseFluent<A>{

  private Boolean supplementalGroupsPolicy;

  public V1NodeFeaturesFluent() {
  }
  
  public V1NodeFeaturesFluent(V1NodeFeatures instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1NodeFeatures instance) {
    instance = instance != null ? instance : new V1NodeFeatures();
    if (instance != null) {
      this.withSupplementalGroupsPolicy(instance.getSupplementalGroupsPolicy());
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
    V1NodeFeaturesFluent that = (V1NodeFeaturesFluent) o;
    if (!(Objects.equals(supplementalGroupsPolicy, that.supplementalGroupsPolicy))) {
      return false;
    }
    return true;
  }
  
  public Boolean getSupplementalGroupsPolicy() {
    return this.supplementalGroupsPolicy;
  }
  
  public boolean hasSupplementalGroupsPolicy() {
    return this.supplementalGroupsPolicy != null;
  }
  
  public int hashCode() {
    return Objects.hash(supplementalGroupsPolicy);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(supplementalGroupsPolicy == null)) {
        sb.append("supplementalGroupsPolicy:");
        sb.append(supplementalGroupsPolicy);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withSupplementalGroupsPolicy() {
    return withSupplementalGroupsPolicy(true);
  }
  
  public A withSupplementalGroupsPolicy(Boolean supplementalGroupsPolicy) {
    this.supplementalGroupsPolicy = supplementalGroupsPolicy;
    return (A) this;
  }
  
}