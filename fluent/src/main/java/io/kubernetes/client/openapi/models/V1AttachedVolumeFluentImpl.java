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
public class V1AttachedVolumeFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1AttachedVolumeFluent<A> {
  public V1AttachedVolumeFluentImpl() {}

  public V1AttachedVolumeFluentImpl(io.kubernetes.client.openapi.models.V1AttachedVolume instance) {
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());
  }

  private java.lang.String devicePath;
  private java.lang.String name;

  public java.lang.String getDevicePath() {
    return this.devicePath;
  }

  public A withDevicePath(java.lang.String devicePath) {
    this.devicePath = devicePath;
    return (A) this;
  }

  public java.lang.Boolean hasDevicePath() {
    return this.devicePath != null;
  }

  /** Method is deprecated. use withDevicePath instead. */
  @java.lang.Deprecated
  public A withNewDevicePath(java.lang.String original) {
    return (A) withDevicePath(new String(original));
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AttachedVolumeFluentImpl that = (V1AttachedVolumeFluentImpl) o;
    if (devicePath != null ? !devicePath.equals(that.devicePath) : that.devicePath != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(devicePath, name, super.hashCode());
  }
}
