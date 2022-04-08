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
public class V1VolumeDeviceFluentImpl<A extends V1VolumeDeviceFluent<A>> extends BaseFluent<A>
    implements V1VolumeDeviceFluent<A> {
  public V1VolumeDeviceFluentImpl() {}

  public V1VolumeDeviceFluentImpl(io.kubernetes.client.openapi.models.V1VolumeDevice instance) {
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());
  }

  private String devicePath;
  private java.lang.String name;

  public java.lang.String getDevicePath() {
    return this.devicePath;
  }

  public A withDevicePath(java.lang.String devicePath) {
    this.devicePath = devicePath;
    return (A) this;
  }

  public Boolean hasDevicePath() {
    return this.devicePath != null;
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

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeDeviceFluentImpl that = (V1VolumeDeviceFluentImpl) o;
    if (devicePath != null ? !devicePath.equals(that.devicePath) : that.devicePath != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(devicePath, name, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (devicePath != null) {
      sb.append("devicePath:");
      sb.append(devicePath + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
}
