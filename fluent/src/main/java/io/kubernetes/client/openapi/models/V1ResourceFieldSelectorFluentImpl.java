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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.BaseFluent;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ResourceFieldSelectorFluentImpl<A extends V1ResourceFieldSelectorFluent<A>>
    extends BaseFluent<A> implements V1ResourceFieldSelectorFluent<A> {
  public V1ResourceFieldSelectorFluentImpl() {}

  public V1ResourceFieldSelectorFluentImpl(
      io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance) {
    this.withContainerName(instance.getContainerName());

    this.withDivisor(instance.getDivisor());

    this.withResource(instance.getResource());
  }

  private String containerName;
  private Quantity divisor;
  private java.lang.String resource;

  public java.lang.String getContainerName() {
    return this.containerName;
  }

  public A withContainerName(java.lang.String containerName) {
    this.containerName = containerName;
    return (A) this;
  }

  public Boolean hasContainerName() {
    return this.containerName != null;
  }

  public io.kubernetes.client.custom.Quantity getDivisor() {
    return this.divisor;
  }

  public A withDivisor(io.kubernetes.client.custom.Quantity divisor) {
    this.divisor = divisor;
    return (A) this;
  }

  public java.lang.Boolean hasDivisor() {
    return this.divisor != null;
  }

  public A withNewDivisor(java.lang.String value) {
    return (A) withDivisor(new Quantity(value));
  }

  public java.lang.String getResource() {
    return this.resource;
  }

  public A withResource(java.lang.String resource) {
    this.resource = resource;
    return (A) this;
  }

  public java.lang.Boolean hasResource() {
    return this.resource != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ResourceFieldSelectorFluentImpl that = (V1ResourceFieldSelectorFluentImpl) o;
    if (containerName != null
        ? !containerName.equals(that.containerName)
        : that.containerName != null) return false;
    if (divisor != null ? !divisor.equals(that.divisor) : that.divisor != null) return false;
    if (resource != null ? !resource.equals(that.resource) : that.resource != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(containerName, divisor, resource, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (containerName != null) {
      sb.append("containerName:");
      sb.append(containerName + ",");
    }
    if (divisor != null) {
      sb.append("divisor:");
      sb.append(divisor + ",");
    }
    if (resource != null) {
      sb.append("resource:");
      sb.append(resource);
    }
    sb.append("}");
    return sb.toString();
  }
}
