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
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V2ContainerResourceMetricSourceFluentImpl<
        A extends V2ContainerResourceMetricSourceFluent<A>>
    extends BaseFluent<A> implements V2ContainerResourceMetricSourceFluent<A> {
  public V2ContainerResourceMetricSourceFluentImpl() {}

  public V2ContainerResourceMetricSourceFluentImpl(V2ContainerResourceMetricSource instance) {
    this.withContainer(instance.getContainer());

    this.withName(instance.getName());

    this.withTarget(instance.getTarget());
  }

  private String container;
  private String name;
  private V2MetricTargetBuilder target;

  public String getContainer() {
    return this.container;
  }

  public A withContainer(String container) {
    this.container = container;
    return (A) this;
  }

  public Boolean hasContainer() {
    return this.container != null;
  }

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

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2MetricTarget getTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public V2MetricTarget buildTarget() {
    return this.target != null ? this.target.build() : null;
  }

  public A withTarget(V2MetricTarget target) {
    _visitables.get("target").remove(this.target);
    if (target != null) {
      this.target = new V2MetricTargetBuilder(target);
      _visitables.get("target").add(this.target);
    } else {
      this.target = null;
      _visitables.get("target").remove(this.target);
    }
    return (A) this;
  }

  public Boolean hasTarget() {
    return this.target != null;
  }

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTarget() {
    return new V2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl();
  }

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> withNewTargetLike(
      V2MetricTarget item) {
    return new V2ContainerResourceMetricSourceFluentImpl.TargetNestedImpl(item);
  }

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(
        getTarget() != null ? getTarget() : new V2MetricTargetBuilder().build());
  }

  public V2ContainerResourceMetricSourceFluent.TargetNested<A> editOrNewTargetLike(
      V2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2ContainerResourceMetricSourceFluentImpl that = (V2ContainerResourceMetricSourceFluentImpl) o;
    if (container != null ? !container.equals(that.container) : that.container != null)
      return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (target != null ? !target.equals(that.target) : that.target != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(container, name, target, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (container != null) {
      sb.append("container:");
      sb.append(container + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (target != null) {
      sb.append("target:");
      sb.append(target);
    }
    sb.append("}");
    return sb.toString();
  }

  class TargetNestedImpl<N>
      extends V2MetricTargetFluentImpl<V2ContainerResourceMetricSourceFluent.TargetNested<N>>
      implements V2ContainerResourceMetricSourceFluent.TargetNested<N>, Nested<N> {
    TargetNestedImpl(V2MetricTarget item) {
      this.builder = new V2MetricTargetBuilder(this, item);
    }

    TargetNestedImpl() {
      this.builder = new V2MetricTargetBuilder(this);
    }

    V2MetricTargetBuilder builder;

    public N and() {
      return (N) V2ContainerResourceMetricSourceFluentImpl.this.withTarget(builder.build());
    }

    public N endTarget() {
      return and();
    }
  }
}
