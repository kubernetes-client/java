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

import java.util.Objects;

public class GroupVersionKind extends GroupVersion {

  private final String kind;

  public GroupVersionKind(String group, String version, String kind) {
    super(group, version);
    this.kind = precondition(kind, Objects::isNull, () -> "kind must not be null");
  }

  public String getKind() {
    return kind;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    GroupVersionKind that = (GroupVersionKind) o;
    return Objects.equals(kind, that.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), kind);
  }
}
