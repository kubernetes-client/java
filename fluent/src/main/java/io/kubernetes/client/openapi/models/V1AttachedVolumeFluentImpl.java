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
public class V1AttachedVolumeFluentImpl<A extends V1AttachedVolumeFluent<A>> extends BaseFluent<A>
    implements V1AttachedVolumeFluent<A> {
  public V1AttachedVolumeFluentImpl() {}

  public V1AttachedVolumeFluentImpl(V1AttachedVolume instance) {
    this.withDevicePath(instance.getDevicePath());

    this.withName(instance.getName());
  }

  private String devicePath;
  private String name;

  public String getDevicePath() {
    return this.devicePath;
  }

  public A withDevicePath(String devicePath) {
    this.devicePath = devicePath;
    return (A) this;
  }

  public Boolean hasDevicePath() {
    return this.devicePath != null;
  }

  public String getName() {
    return this.name;
  }

  public A withName(String name) {
    this.name = name;
    return (A) this;
  }

  public Boolean hasName() {
    return this.name != null;
  }

  public boolean equals(Object o) {
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

  public String toString() {
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
