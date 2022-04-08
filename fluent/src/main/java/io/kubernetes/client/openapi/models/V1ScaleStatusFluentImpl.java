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
public class V1ScaleStatusFluentImpl<A extends V1ScaleStatusFluent<A>> extends BaseFluent<A>
    implements V1ScaleStatusFluent<A> {
  public V1ScaleStatusFluentImpl() {}

  public V1ScaleStatusFluentImpl(io.kubernetes.client.openapi.models.V1ScaleStatus instance) {
    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());
  }

  private Integer replicas;
  private String selector;

  public java.lang.Integer getReplicas() {
    return this.replicas;
  }

  public A withReplicas(java.lang.Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }

  public Boolean hasReplicas() {
    return this.replicas != null;
  }

  public java.lang.String getSelector() {
    return this.selector;
  }

  public A withSelector(java.lang.String selector) {
    this.selector = selector;
    return (A) this;
  }

  public java.lang.Boolean hasSelector() {
    return this.selector != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScaleStatusFluentImpl that = (V1ScaleStatusFluentImpl) o;
    if (replicas != null ? !replicas.equals(that.replicas) : that.replicas != null) return false;
    if (selector != null ? !selector.equals(that.selector) : that.selector != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(replicas, selector, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (replicas != null) {
      sb.append("replicas:");
      sb.append(replicas + ",");
    }
    if (selector != null) {
      sb.append("selector:");
      sb.append(selector);
    }
    sb.append("}");
    return sb.toString();
  }
}
