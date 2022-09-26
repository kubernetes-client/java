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
public class V1beta2ServiceAccountSubjectFluentImpl<A extends V1beta2ServiceAccountSubjectFluent<A>>
    extends BaseFluent<A> implements V1beta2ServiceAccountSubjectFluent<A> {
  public V1beta2ServiceAccountSubjectFluentImpl() {}

  public V1beta2ServiceAccountSubjectFluentImpl(V1beta2ServiceAccountSubject instance) {
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());
  }

  private String name;
  private String namespace;

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

  public String getNamespace() {
    return this.namespace;
  }

  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }

  public Boolean hasNamespace() {
    return this.namespace != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2ServiceAccountSubjectFluentImpl that = (V1beta2ServiceAccountSubjectFluentImpl) o;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(name, namespace, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (namespace != null) {
      sb.append("namespace:");
      sb.append(namespace);
    }
    sb.append("}");
    return sb.toString();
  }
}
