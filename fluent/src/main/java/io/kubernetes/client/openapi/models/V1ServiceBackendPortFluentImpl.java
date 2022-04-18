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
public class V1ServiceBackendPortFluentImpl<A extends V1ServiceBackendPortFluent<A>>
    extends BaseFluent<A> implements V1ServiceBackendPortFluent<A> {
  public V1ServiceBackendPortFluentImpl() {}

  public V1ServiceBackendPortFluentImpl(
      io.kubernetes.client.openapi.models.V1ServiceBackendPort instance) {
    this.withName(instance.getName());

    this.withNumber(instance.getNumber());
  }

  private String name;
  private Integer number;

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public Boolean hasName() {
    return this.name != null;
  }

  public java.lang.Integer getNumber() {
    return this.number;
  }

  public A withNumber(java.lang.Integer number) {
    this.number = number;
    return (A) this;
  }

  public java.lang.Boolean hasNumber() {
    return this.number != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ServiceBackendPortFluentImpl that = (V1ServiceBackendPortFluentImpl) o;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (number != null ? !number.equals(that.number) : that.number != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(name, number, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (number != null) {
      sb.append("number:");
      sb.append(number);
    }
    sb.append("}");
    return sb.toString();
  }
}
