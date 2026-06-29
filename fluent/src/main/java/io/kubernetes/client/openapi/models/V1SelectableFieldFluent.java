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
public class V1SelectableFieldFluent<A extends io.kubernetes.client.openapi.models.V1SelectableFieldFluent<A>> extends BaseFluent<A>{

  private String jsonPath;

  public V1SelectableFieldFluent() {
  }
  
  public V1SelectableFieldFluent(V1SelectableField instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1SelectableField instance) {
    instance = instance != null ? instance : new V1SelectableField();
    if (instance != null) {
      this.withJsonPath(instance.getJsonPath());
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
    V1SelectableFieldFluent that = (V1SelectableFieldFluent) o;
    if (!(Objects.equals(jsonPath, that.jsonPath))) {
      return false;
    }
    return true;
  }
  
  public String getJsonPath() {
    return this.jsonPath;
  }
  
  public boolean hasJsonPath() {
    return this.jsonPath != null;
  }
  
  public int hashCode() {
    return Objects.hash(jsonPath);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(jsonPath == null)) {
        sb.append("jsonPath:");
        sb.append(jsonPath);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return (A) this;
  }
  
}