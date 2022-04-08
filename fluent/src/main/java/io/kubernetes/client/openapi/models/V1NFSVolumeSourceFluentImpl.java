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
public class V1NFSVolumeSourceFluentImpl<A extends V1NFSVolumeSourceFluent<A>> extends BaseFluent<A>
    implements V1NFSVolumeSourceFluent<A> {
  public V1NFSVolumeSourceFluentImpl() {}

  public V1NFSVolumeSourceFluentImpl(
      io.kubernetes.client.openapi.models.V1NFSVolumeSource instance) {
    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.withServer(instance.getServer());
  }

  private String path;
  private Boolean readOnly;
  private java.lang.String server;

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

  public java.lang.String getServer() {
    return this.server;
  }

  public A withServer(java.lang.String server) {
    this.server = server;
    return (A) this;
  }

  public java.lang.Boolean hasServer() {
    return this.server != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1NFSVolumeSourceFluentImpl that = (V1NFSVolumeSourceFluentImpl) o;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (server != null ? !server.equals(that.server) : that.server != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(path, readOnly, server, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (path != null) {
      sb.append("path:");
      sb.append(path + ",");
    }
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (server != null) {
      sb.append("server:");
      sb.append(server);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }
}
