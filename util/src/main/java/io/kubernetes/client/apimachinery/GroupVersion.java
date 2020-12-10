/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.apimachinery;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.util.Strings;
import java.util.Objects;

public class GroupVersion {

  public static GroupVersion parse(String apiVersion) {
    if (Strings.isNullOrEmpty(apiVersion)) {
      throw new IllegalArgumentException("No apiVersion found on object");
    }
    if ("v1".equals(apiVersion)) {
      // legacy api group
      return new GroupVersion("", "v1");
    }
    String[] parts = apiVersion.split("/");
    if (parts.length != 2) {
      throw new IllegalArgumentException("Invalid apiVersion found on object: " + apiVersion);
    }
    return new GroupVersion(parts[0], parts[1]);
  }

  public static GroupVersion parse(KubernetesObject obj) {
    return parse(obj.getApiVersion());
  }

  public GroupVersion(String group, String version) {
    if (group == null) {
      throw new IllegalArgumentException("group must not be null");
    }
    if (version == null) {
      throw new IllegalArgumentException("version must not be null");
    }
    this.group = group;
    this.version = version;
  }

  private final String group;

  private final String version;

  public String getGroup() {
    return group;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupVersion that = (GroupVersion) o;
    return Objects.equals(group, that.group) && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, version);
  }
}
