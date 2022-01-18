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

/** Generated */
public class V1GlusterfsVolumeSourceFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<A> {
  public V1GlusterfsVolumeSourceFluentImpl() {}

  public V1GlusterfsVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource instance) {
    this.withEndpoints(instance.getEndpoints());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());
  }

  private java.lang.String endpoints;
  private java.lang.String path;
  private java.lang.Boolean readOnly;

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

  /** Method is deprecated. use withEndpoints instead. */
  @java.lang.Deprecated
  public A withNewEndpoints(java.lang.String original) {
    return (A) withEndpoints(new String(original));
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

  /** Method is deprecated. use withPath instead. */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String original) {
    return (A) withPath(new String(original));
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GlusterfsVolumeSourceFluentImpl that = (V1GlusterfsVolumeSourceFluentImpl) o;
    if (endpoints != null ? !endpoints.equals(that.endpoints) : that.endpoints != null)
      return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(endpoints, path, readOnly, super.hashCode());
  }
}
