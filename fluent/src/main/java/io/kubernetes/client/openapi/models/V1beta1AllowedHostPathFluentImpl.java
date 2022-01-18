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
public class V1beta1AllowedHostPathFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1beta1AllowedHostPathFluent<A> {
  public V1beta1AllowedHostPathFluentImpl() {}

  public V1beta1AllowedHostPathFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1AllowedHostPath instance) {
    this.withPathPrefix(instance.getPathPrefix());

    this.withReadOnly(instance.getReadOnly());
  }

  private java.lang.String pathPrefix;
  private java.lang.Boolean readOnly;

  public java.lang.String getPathPrefix() {
    return this.pathPrefix;
  }

  public A withPathPrefix(java.lang.String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return (A) this;
  }

  public java.lang.Boolean hasPathPrefix() {
    return this.pathPrefix != null;
  }

  /** Method is deprecated. use withPathPrefix instead. */
  @java.lang.Deprecated
  public A withNewPathPrefix(java.lang.String original) {
    return (A) withPathPrefix(new String(original));
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
    V1beta1AllowedHostPathFluentImpl that = (V1beta1AllowedHostPathFluentImpl) o;
    if (pathPrefix != null ? !pathPrefix.equals(that.pathPrefix) : that.pathPrefix != null)
      return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(pathPrefix, readOnly, super.hashCode());
  }
}
