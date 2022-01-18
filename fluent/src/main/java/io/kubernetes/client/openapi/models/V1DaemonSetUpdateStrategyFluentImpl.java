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

/** Generated */
public class V1DaemonSetUpdateStrategyFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent<A> {
  public V1DaemonSetUpdateStrategyFluentImpl() {}

  public V1DaemonSetUpdateStrategyFluentImpl(
      io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy instance) {
    this.withRollingUpdate(instance.getRollingUpdate());

    this.withType(instance.getType());
  }

  private io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder rollingUpdate;
  private io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy.TypeEnum type;

  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet getRollingUpdate() {
    return this.rollingUpdate != null ? this.rollingUpdate.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet buildRollingUpdate() {
    return this.rollingUpdate != null ? this.rollingUpdate.build() : null;
  }

  public A withRollingUpdate(
      io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet rollingUpdate) {
    _visitables.get("rollingUpdate").remove(this.rollingUpdate);
    if (rollingUpdate != null) {
      this.rollingUpdate =
          new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder(rollingUpdate);
      _visitables.get("rollingUpdate").add(this.rollingUpdate);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRollingUpdate() {
    return this.rollingUpdate != null;
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A>
      withNewRollingUpdate() {
    return new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluentImpl
        .RollingUpdateNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A>
      withNewRollingUpdateLike(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item) {
    return new io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluentImpl
        .RollingUpdateNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A>
      editRollingUpdate() {
    return withNewRollingUpdateLike(getRollingUpdate());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A>
      editOrNewRollingUpdate() {
    return withNewRollingUpdateLike(
        getRollingUpdate() != null
            ? getRollingUpdate()
            : new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A>
      editOrNewRollingUpdateLike(
          io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item) {
    return withNewRollingUpdateLike(getRollingUpdate() != null ? getRollingUpdate() : item);
  }

  public io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy.TypeEnum getType() {
    return this.type;
  }

  public A withType(io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategy.TypeEnum type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1DaemonSetUpdateStrategyFluentImpl that = (V1DaemonSetUpdateStrategyFluentImpl) o;
    if (rollingUpdate != null
        ? !rollingUpdate.equals(that.rollingUpdate)
        : that.rollingUpdate != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(rollingUpdate, type, super.hashCode());
  }

  public class RollingUpdateNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluentImpl<
          io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1DaemonSetUpdateStrategyFluent
                  .RollingUpdateNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    RollingUpdateNestedImpl(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder(this, item);
    }

    RollingUpdateNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder builder;

    public N and() {
      return (N) V1DaemonSetUpdateStrategyFluentImpl.this.withRollingUpdate(builder.build());
    }

    public N endRollingUpdate() {
      return and();
    }
  }
}
