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
public class V1PreconditionsFluentImpl<A extends V1PreconditionsFluent<A>> extends BaseFluent<A>
    implements V1PreconditionsFluent<A> {
  public V1PreconditionsFluentImpl() {}

  public V1PreconditionsFluentImpl(io.kubernetes.client.openapi.models.V1Preconditions instance) {
    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());
  }

  private String resourceVersion;
  private java.lang.String uid;

  public java.lang.String getResourceVersion() {
    return this.resourceVersion;
  }

  public A withResourceVersion(java.lang.String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return (A) this;
  }

  public Boolean hasResourceVersion() {
    return this.resourceVersion != null;
  }

  public java.lang.String getUid() {
    return this.uid;
  }

  public A withUid(java.lang.String uid) {
    this.uid = uid;
    return (A) this;
  }

  public java.lang.Boolean hasUid() {
    return this.uid != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PreconditionsFluentImpl that = (V1PreconditionsFluentImpl) o;
    if (resourceVersion != null
        ? !resourceVersion.equals(that.resourceVersion)
        : that.resourceVersion != null) return false;
    if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(resourceVersion, uid, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (resourceVersion != null) {
      sb.append("resourceVersion:");
      sb.append(resourceVersion + ",");
    }
    if (uid != null) {
      sb.append("uid:");
      sb.append(uid);
    }
    sb.append("}");
    return sb.toString();
  }
}
