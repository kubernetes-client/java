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
public class V1GlusterfsPersistentVolumeSourceFluentImpl<
        A extends V1GlusterfsPersistentVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1GlusterfsPersistentVolumeSourceFluent<A> {
  public V1GlusterfsPersistentVolumeSourceFluentImpl() {}

  public V1GlusterfsPersistentVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance) {
    this.withEndpoints(instance.getEndpoints());

    this.withEndpointsNamespace(instance.getEndpointsNamespace());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());
  }

  private String endpoints;
  private java.lang.String endpointsNamespace;
  private java.lang.String path;
  private Boolean readOnly;

  public java.lang.String getEndpoints() {
    return this.endpoints;
  }

  public A withEndpoints(java.lang.String endpoints) {
    this.endpoints = endpoints;
    return (A) this;
  }

  public java.lang.Boolean hasEndpoints() {
    return this.endpoints != null;
  }

  public java.lang.String getEndpointsNamespace() {
    return this.endpointsNamespace;
  }

  public A withEndpointsNamespace(java.lang.String endpointsNamespace) {
    this.endpointsNamespace = endpointsNamespace;
    return (A) this;
  }

  public java.lang.Boolean hasEndpointsNamespace() {
    return this.endpointsNamespace != null;
  }

  public java.lang.String getPath() {
    return this.path;
  }

  public A withPath(java.lang.String path) {
    this.path = path;
    return (A) this;
  }

  public java.lang.Boolean hasPath() {
    return this.path != null;
  }

  public java.lang.Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public java.lang.Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GlusterfsPersistentVolumeSourceFluentImpl that =
        (V1GlusterfsPersistentVolumeSourceFluentImpl) o;
    if (endpoints != null ? !endpoints.equals(that.endpoints) : that.endpoints != null)
      return false;
    if (endpointsNamespace != null
        ? !endpointsNamespace.equals(that.endpointsNamespace)
        : that.endpointsNamespace != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(endpoints, endpointsNamespace, path, readOnly, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (endpoints != null) {
      sb.append("endpoints:");
      sb.append(endpoints + ",");
    }
    if (endpointsNamespace != null) {
      sb.append("endpointsNamespace:");
      sb.append(endpointsNamespace + ",");
    }
    if (path != null) {
      sb.append("path:");
      sb.append(path + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }
}
