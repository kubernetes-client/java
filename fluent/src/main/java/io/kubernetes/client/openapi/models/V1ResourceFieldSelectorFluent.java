/*
Copyright 2026 The Kubernetes Authors.
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
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ResourceFieldSelectorFluent<A extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<A>> extends BaseFluent<A>{

  private String containerName;
  private Quantity divisor;
  private String resource;

  public V1ResourceFieldSelectorFluent() {
  }
  
  public V1ResourceFieldSelectorFluent(V1ResourceFieldSelector instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1ResourceFieldSelector instance) {
    instance = instance != null ? instance : new V1ResourceFieldSelector();
    if (instance != null) {
        this.withContainerName(instance.getContainerName());
        this.withDivisor(instance.getDivisor());
        this.withResource(instance.getResource());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1ResourceFieldSelectorFluent that = (V1ResourceFieldSelectorFluent) o;
    if (!(Objects.equals(containerName, that.containerName))) {
      return false;
    }
    if (!(Objects.equals(divisor, that.divisor))) {
      return false;
    }
    if (!(Objects.equals(resource, that.resource))) {
      return false;
    }
    return true;
  }
  
  public String getContainerName() {
    return this.containerName;
  }
  
  public Quantity getDivisor() {
    return this.divisor;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public boolean hasContainerName() {
    return this.containerName != null;
  }
  
  public boolean hasDivisor() {
    return this.divisor != null;
  }
  
  public boolean hasResource() {
    return this.resource != null;
  }
  
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(containerName == null)) {
        sb.append("containerName:");
        sb.append(containerName);
        sb.append(",");
    }
    if (!(divisor == null)) {
        sb.append("divisor:");
        sb.append(divisor);
        sb.append(",");
    }
    if (!(resource == null)) {
        sb.append("resource:");
        sb.append(resource);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withContainerName(String containerName) {
    this.containerName = containerName;
    return (A) this;
  }
  
  public A withDivisor(Quantity divisor) {
    this.divisor = divisor;
    return (A) this;
  }
  
  public A withNewDivisor(String value) {
    return (A) this.withDivisor(new Quantity(value));
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
}