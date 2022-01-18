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
public class V1GroupVersionForDiscoveryFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<A> {
  public V1GroupVersionForDiscoveryFluentImpl() {}

  public V1GroupVersionForDiscoveryFluentImpl(
      io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery instance) {
    this.withGroupVersion(instance.getGroupVersion());

    this.withVersion(instance.getVersion());
  }

  private java.lang.String groupVersion;
  private java.lang.String version;

  public java.lang.String getGroupVersion() {
    return this.groupVersion;
  }

  public A withGroupVersion(java.lang.String groupVersion) {
    this.groupVersion = groupVersion;
    return (A) this;
  }

  public java.lang.Boolean hasGroupVersion() {
    return this.groupVersion != null;
  }

  /** Method is deprecated. use withGroupVersion instead. */
  @java.lang.Deprecated
  public A withNewGroupVersion(java.lang.String original) {
    return (A) withGroupVersion(new String(original));
  }

  public java.lang.String getVersion() {
    return this.version;
  }

  public A withVersion(java.lang.String version) {
    this.version = version;
    return (A) this;
  }

  public java.lang.Boolean hasVersion() {
    return this.version != null;
  }

  /** Method is deprecated. use withVersion instead. */
  @java.lang.Deprecated
  public A withNewVersion(java.lang.String original) {
    return (A) withVersion(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GroupVersionForDiscoveryFluentImpl that = (V1GroupVersionForDiscoveryFluentImpl) o;
    if (groupVersion != null ? !groupVersion.equals(that.groupVersion) : that.groupVersion != null)
      return false;
    if (version != null ? !version.equals(that.version) : that.version != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(groupVersion, version, super.hashCode());
  }
}
