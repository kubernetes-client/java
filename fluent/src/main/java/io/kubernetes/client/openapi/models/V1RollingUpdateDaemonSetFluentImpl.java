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

import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1RollingUpdateDaemonSetFluentImpl<A extends V1RollingUpdateDaemonSetFluent<A>>
    extends BaseFluent<A> implements V1RollingUpdateDaemonSetFluent<A> {
  public V1RollingUpdateDaemonSetFluentImpl() {}

  public V1RollingUpdateDaemonSetFluentImpl(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance) {
    this.withMaxSurge(instance.getMaxSurge());

    this.withMaxUnavailable(instance.getMaxUnavailable());
  }

  private IntOrString maxSurge;
  private io.kubernetes.client.custom.IntOrString maxUnavailable;

  public io.kubernetes.client.custom.IntOrString getMaxSurge() {
    return this.maxSurge;
  }

  public A withMaxSurge(io.kubernetes.client.custom.IntOrString maxSurge) {
    this.maxSurge = maxSurge;
    return (A) this;
  }

  public Boolean hasMaxSurge() {
    return this.maxSurge != null;
  }

  public A withNewMaxSurge(int value) {
    return (A) withMaxSurge(new IntOrString(value));
  }

  public A withNewMaxSurge(String value) {
    return (A) withMaxSurge(new IntOrString(value));
  }

  public io.kubernetes.client.custom.IntOrString getMaxUnavailable() {
    return this.maxUnavailable;
  }

  public A withMaxUnavailable(io.kubernetes.client.custom.IntOrString maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return (A) this;
  }

  public java.lang.Boolean hasMaxUnavailable() {
    return this.maxUnavailable != null;
  }

  public A withNewMaxUnavailable(int value) {
    return (A) withMaxUnavailable(new IntOrString(value));
  }

  public A withNewMaxUnavailable(java.lang.String value) {
    return (A) withMaxUnavailable(new IntOrString(value));
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1RollingUpdateDaemonSetFluentImpl that = (V1RollingUpdateDaemonSetFluentImpl) o;
    if (maxSurge != null ? !maxSurge.equals(that.maxSurge) : that.maxSurge != null) return false;
    if (maxUnavailable != null
        ? !maxUnavailable.equals(that.maxUnavailable)
        : that.maxUnavailable != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(maxSurge, maxUnavailable, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (maxSurge != null) {
      sb.append("maxSurge:");
      sb.append(maxSurge + ",");
    }
    if (maxUnavailable != null) {
      sb.append("maxUnavailable:");
      sb.append(maxUnavailable);
    }
    sb.append("}");
    return sb.toString();
  }
}
