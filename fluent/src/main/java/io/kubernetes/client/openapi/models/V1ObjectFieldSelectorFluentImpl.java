/*
Copyright 2022 The Kubernetes Authors.
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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ObjectFieldSelectorFluentImpl<A extends V1ObjectFieldSelectorFluent<A>>
    extends BaseFluent<A> implements V1ObjectFieldSelectorFluent<A> {
  public V1ObjectFieldSelectorFluentImpl() {}

  public V1ObjectFieldSelectorFluentImpl(
      io.kubernetes.client.openapi.models.V1ObjectFieldSelector instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withFieldPath(instance.getFieldPath());
  }

  private String apiVersion;
  private java.lang.String fieldPath;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public java.lang.String getFieldPath() {
    return this.fieldPath;
  }

  public A withFieldPath(java.lang.String fieldPath) {
    this.fieldPath = fieldPath;
    return (A) this;
  }

  public java.lang.Boolean hasFieldPath() {
    return this.fieldPath != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ObjectFieldSelectorFluentImpl that = (V1ObjectFieldSelectorFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (fieldPath != null ? !fieldPath.equals(that.fieldPath) : that.fieldPath != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, fieldPath, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (fieldPath != null) {
      sb.append("fieldPath:");
      sb.append(fieldPath);
    }
    sb.append("}");
    return sb.toString();
  }
}
