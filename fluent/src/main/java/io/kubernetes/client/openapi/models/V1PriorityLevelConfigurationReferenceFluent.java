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
public class V1PriorityLevelConfigurationReferenceFluent<A extends io.kubernetes.client.openapi.models.V1PriorityLevelConfigurationReferenceFluent<A>> extends BaseFluent<A>{

  private String name;

  public V1PriorityLevelConfigurationReferenceFluent() {
  }
  
  public V1PriorityLevelConfigurationReferenceFluent(V1PriorityLevelConfigurationReference instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1PriorityLevelConfigurationReference instance) {
    instance = instance != null ? instance : new V1PriorityLevelConfigurationReference();
    if (instance != null) {
      this.withName(instance.getName());
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
    V1PriorityLevelConfigurationReferenceFluent that = (V1PriorityLevelConfigurationReferenceFluent) o;
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
}