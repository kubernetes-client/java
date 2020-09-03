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

import com.google.common.base.Objects;

public class GroupVersionResource extends GroupVersion {

  private final String resource;

  public GroupVersionResource(String group, String version, String resource) {
    super(group, version);
    if (resource == null) {
      throw new IllegalArgumentException("resource must not be null");
    }
    this.resource = resource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    GroupVersionResource that = (GroupVersionResource) o;
    return Objects.equal(resource, that.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(super.hashCode(), resource);
  }

  public String getResource() {
    return resource;
  }
}
