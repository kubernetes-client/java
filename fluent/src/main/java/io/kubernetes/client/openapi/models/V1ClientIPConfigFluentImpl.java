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
public class V1ClientIPConfigFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1ClientIPConfigFluent<A> {
  public V1ClientIPConfigFluentImpl() {}

  public V1ClientIPConfigFluentImpl(io.kubernetes.client.openapi.models.V1ClientIPConfig instance) {
    this.withTimeoutSeconds(instance.getTimeoutSeconds());
  }

  private java.lang.Integer timeoutSeconds;

  public java.lang.Integer getTimeoutSeconds() {
    return this.timeoutSeconds;
  }

  public A withTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasTimeoutSeconds() {
    return this.timeoutSeconds != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ClientIPConfigFluentImpl that = (V1ClientIPConfigFluentImpl) o;
    if (timeoutSeconds != null
        ? !timeoutSeconds.equals(that.timeoutSeconds)
        : that.timeoutSeconds != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(timeoutSeconds, super.hashCode());
  }
}
