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
public class V1KeyToPathFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1KeyToPathFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1KeyToPathFluent<A> {
  public V1KeyToPathFluentImpl() {}

  public V1KeyToPathFluentImpl(io.kubernetes.client.openapi.models.V1KeyToPath instance) {
    this.withKey(instance.getKey());

    this.withMode(instance.getMode());

    this.withPath(instance.getPath());
  }

  private java.lang.String key;
  private java.lang.Integer mode;
  private java.lang.String path;

  public java.lang.String getKey() {
    return this.key;
  }

  public A withKey(java.lang.String key) {
    this.key = key;
    return (A) this;
  }

  public java.lang.Boolean hasKey() {
    return this.key != null;
  }

  /** Method is deprecated. use withKey instead. */
  @java.lang.Deprecated
  public A withNewKey(java.lang.String original) {
    return (A) withKey(new String(original));
  }

  public java.lang.Integer getMode() {
    return this.mode;
  }

  public A withMode(java.lang.Integer mode) {
    this.mode = mode;
    return (A) this;
  }

  public java.lang.Boolean hasMode() {
    return this.mode != null;
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

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1KeyToPathFluentImpl that = (V1KeyToPathFluentImpl) o;
    if (key != null ? !key.equals(that.key) : that.key != null) return false;
    if (mode != null ? !mode.equals(that.mode) : that.mode != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(key, mode, path, super.hashCode());
  }
}
