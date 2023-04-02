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

import static io.kubernetes.client.util.Preconditions.precondition;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.util.Strings;
import java.util.Objects;

public class GroupVersion {

  private static final GroupVersion GROUP_VERSION_V1 = new GroupVersion("", "v1");

  public static GroupVersion parse(String apiVersion) {
    if ("v1".equals(apiVersion)) {
      // legacy api group
      return GROUP_VERSION_V1;
    }
    precondition(apiVersion, Strings::isNullOrEmpty, () -> "apiVersion can not be null");
    String[] parts = apiVersion.split("/");
    precondition(parts, x -> x.length != 2, () -> "Invalid apiVersion: " + apiVersion);
    return new GroupVersion(parts[0], parts[1]);
  }

  public static GroupVersion parse(KubernetesObject obj) {
    return parse(obj.getApiVersion());
  }

  public GroupVersion(String group, String version) {
    this.group = precondition(group, Objects::isNull, () -> "group must not be null");
    this.version = precondition(version, Objects::isNull, () -> "version must not be null");
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
