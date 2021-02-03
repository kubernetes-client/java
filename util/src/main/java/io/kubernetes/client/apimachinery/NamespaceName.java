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

public class NamespaceName {

  private final String namespace;
  private final String name;

  public NamespaceName(String namespace, String name) {
    this.namespace = precondition(namespace, Objects::isNull, () -> "namespace must not be null");
    this.name = precondition(name, Objects::isNull, () -> "name must not be null");
  }

  public String getNamespace() {
    return namespace;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NamespaceName that = (NamespaceName) o;
    return Objects.equals(namespace, that.namespace) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, name);
  }
}
