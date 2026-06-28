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
public class V1ObjectFieldSelectorFluent<A extends io.kubernetes.client.openapi.models.V1ObjectFieldSelectorFluent<A>> extends BaseFluent<A>{

  private String apiVersion;
  private String fieldPath;

  public V1ObjectFieldSelectorFluent() {
  }
  
  public V1ObjectFieldSelectorFluent(V1ObjectFieldSelector instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ObjectFieldSelector instance) {
    instance = instance != null ? instance : new V1ObjectFieldSelector();
    if (instance != null) {
        this.withApiVersion(instance.getApiVersion());
        this.withFieldPath(instance.getFieldPath());
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
    V1ObjectFieldSelectorFluent that = (V1ObjectFieldSelectorFluent) o;
    if (!(Objects.equals(apiVersion, that.apiVersion))) {
      return false;
    }
    if (!(Objects.equals(fieldPath, that.fieldPath))) {
      return false;
    }
    return true;
  }
  
  public String getApiVersion() {
    return this.apiVersion;
  }
  
  public String getFieldPath() {
    return this.fieldPath;
  }
  
  public boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  
  public boolean hasFieldPath() {
    return this.fieldPath != null;
  }
  
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(apiVersion == null)) {
        sb.append("apiVersion:");
        sb.append(apiVersion);
        sb.append(",");
    }
    if (!(fieldPath == null)) {
        sb.append("fieldPath:");
        sb.append(fieldPath);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }
  
  public A withFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return (A) this;
  }
  
}