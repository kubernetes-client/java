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
public class V1TopologySpreadConstraintFluentImpl<A extends V1TopologySpreadConstraintFluent<A>>
    extends BaseFluent<A> implements V1TopologySpreadConstraintFluent<A> {
  public V1TopologySpreadConstraintFluentImpl() {}

  public V1TopologySpreadConstraintFluentImpl(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance) {
    this.withLabelSelector(instance.getLabelSelector());

    this.withMaxSkew(instance.getMaxSkew());

    this.withTopologyKey(instance.getTopologyKey());

    this.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());
  }

  private V1LabelSelectorBuilder labelSelector;
  private Integer maxSkew;
  private String topologyKey;
  private java.lang.String whenUnsatisfiable;

  /**
   * This method has been deprecated, please use method buildLabelSelector instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1LabelSelector getLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }

  public A withLabelSelector(io.kubernetes.client.openapi.models.V1LabelSelector labelSelector) {
    _visitables.get("labelSelector").remove(this.labelSelector);
    if (labelSelector != null) {
      this.labelSelector = new V1LabelSelectorBuilder(labelSelector);
      _visitables.get("labelSelector").add(this.labelSelector);
    }
    return (A) this;
  }

  public Boolean hasLabelSelector() {
    return this.labelSelector != null;
  }

  public V1TopologySpreadConstraintFluent.LabelSelectorNested<A> withNewLabelSelector() {
    return new V1TopologySpreadConstraintFluentImpl.LabelSelectorNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      withNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return new V1TopologySpreadConstraintFluentImpl.LabelSelectorNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editLabelSelector() {
    return withNewLabelSelectorLike(getLabelSelector());
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editOrNewLabelSelector() {
    return withNewLabelSelectorLike(
        getLabelSelector() != null
            ? getLabelSelector()
            : new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent.LabelSelectorNested<A>
      editOrNewLabelSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
    return withNewLabelSelectorLike(getLabelSelector() != null ? getLabelSelector() : item);
  }

  public java.lang.Integer getMaxSkew() {
    return this.maxSkew;
  }

  public A withMaxSkew(java.lang.Integer maxSkew) {
    this.maxSkew = maxSkew;
    return (A) this;
  }

  public java.lang.Boolean hasMaxSkew() {
    return this.maxSkew != null;
  }

  public java.lang.String getTopologyKey() {
    return this.topologyKey;
  }

  public A withTopologyKey(java.lang.String topologyKey) {
    this.topologyKey = topologyKey;
    return (A) this;
  }

  public java.lang.Boolean hasTopologyKey() {
    return this.topologyKey != null;
  }

  public java.lang.String getWhenUnsatisfiable() {
    return this.whenUnsatisfiable;
  }

  public A withWhenUnsatisfiable(java.lang.String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
    return (A) this;
  }

  public java.lang.Boolean hasWhenUnsatisfiable() {
    return this.whenUnsatisfiable != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1TopologySpreadConstraintFluentImpl that = (V1TopologySpreadConstraintFluentImpl) o;
    if (labelSelector != null
        ? !labelSelector.equals(that.labelSelector)
        : that.labelSelector != null) return false;
    if (maxSkew != null ? !maxSkew.equals(that.maxSkew) : that.maxSkew != null) return false;
    if (topologyKey != null ? !topologyKey.equals(that.topologyKey) : that.topologyKey != null)
      return false;
    if (whenUnsatisfiable != null
        ? !whenUnsatisfiable.equals(that.whenUnsatisfiable)
        : that.whenUnsatisfiable != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        labelSelector, maxSkew, topologyKey, whenUnsatisfiable, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelector != null) {
      sb.append("labelSelector:");
      sb.append(labelSelector + ",");
    }
    if (maxSkew != null) {
      sb.append("maxSkew:");
      sb.append(maxSkew + ",");
    }
    if (topologyKey != null) {
      sb.append("topologyKey:");
      sb.append(topologyKey + ",");
    }
    if (whenUnsatisfiable != null) {
      sb.append("whenUnsatisfiable:");
      sb.append(whenUnsatisfiable);
    }
    sb.append("}");
    return sb.toString();
  }

  class LabelSelectorNestedImpl<N>
      extends V1LabelSelectorFluentImpl<V1TopologySpreadConstraintFluent.LabelSelectorNested<N>>
      implements io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent
                  .LabelSelectorNested<
              N>,
          Nested<N> {
    LabelSelectorNestedImpl(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }

    LabelSelectorNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

    public N and() {
      return (N) V1TopologySpreadConstraintFluentImpl.this.withLabelSelector(builder.build());
    }

    public N endLabelSelector() {
      return and();
    }
  }
}
