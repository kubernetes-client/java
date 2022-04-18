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
public class V1HostPathVolumeSourceFluentImpl<A extends V1HostPathVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1HostPathVolumeSourceFluent<A> {
  public V1HostPathVolumeSourceFluentImpl() {}

  public V1HostPathVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance) {
    this.withPath(instance.getPath());

    this.withType(instance.getType());
  }

  private String path;
  private java.lang.String type;

  public java.lang.String getPath() {
    return this.path;
  }

  public A withPath(java.lang.String path) {
    this.path = path;
    return (A) this;
  }

  public Boolean hasPath() {
    return this.path != null;
  }

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HostPathVolumeSourceFluentImpl that = (V1HostPathVolumeSourceFluentImpl) o;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(path, type, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (path != null) {
      sb.append("path:");
      sb.append(path + ",");
    }
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
}
