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
public class V2HorizontalPodAutoscalerBehaviorFluentImpl<
        A extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<A> {
  public V2HorizontalPodAutoscalerBehaviorFluentImpl() {}

  public V2HorizontalPodAutoscalerBehaviorFluentImpl(
      io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior instance) {
    this.withScaleDown(instance.getScaleDown());

    this.withScaleUp(instance.getScaleUp());
  }

  private io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder scaleDown;
  private io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder scaleUp;

  /**
   * This method has been deprecated, please use method buildScaleDown instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2HPAScalingRules getScaleDown() {
    return this.scaleDown != null ? this.scaleDown.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2HPAScalingRules buildScaleDown() {
    return this.scaleDown != null ? this.scaleDown.build() : null;
  }

  public A withScaleDown(io.kubernetes.client.openapi.models.V2HPAScalingRules scaleDown) {
    _visitables.get("scaleDown").remove(this.scaleDown);
    if (scaleDown != null) {
      this.scaleDown = new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder(scaleDown);
      _visitables.get("scaleDown").add(this.scaleDown);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScaleDown() {
    return this.scaleDown != null;
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      withNewScaleDown() {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluentImpl
        .ScaleDownNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      withNewScaleDownLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item) {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluentImpl
        .ScaleDownNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      editScaleDown() {
    return withNewScaleDownLike(getScaleDown());
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      editOrNewScaleDown() {
    return withNewScaleDownLike(
        getScaleDown() != null
            ? getScaleDown()
            : new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      editOrNewScaleDownLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item) {
    return withNewScaleDownLike(getScaleDown() != null ? getScaleDown() : item);
  }

  /**
   * This method has been deprecated, please use method buildScaleUp instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2HPAScalingRules getScaleUp() {
    return this.scaleUp != null ? this.scaleUp.build() : null;
  }

  public io.kubernetes.client.openapi.models.V2HPAScalingRules buildScaleUp() {
    return this.scaleUp != null ? this.scaleUp.build() : null;
  }

  public A withScaleUp(io.kubernetes.client.openapi.models.V2HPAScalingRules scaleUp) {
    _visitables.get("scaleUp").remove(this.scaleUp);
    if (scaleUp != null) {
      this.scaleUp = new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder(scaleUp);
      _visitables.get("scaleUp").add(this.scaleUp);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScaleUp() {
    return this.scaleUp != null;
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      withNewScaleUp() {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluentImpl
        .ScaleUpNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      withNewScaleUpLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item) {
    return new io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluentImpl
        .ScaleUpNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      editScaleUp() {
    return withNewScaleUpLike(getScaleUp());
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      editOrNewScaleUp() {
    return withNewScaleUpLike(
        getScaleUp() != null
            ? getScaleUp()
            : new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      editOrNewScaleUpLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item) {
    return withNewScaleUpLike(getScaleUp() != null ? getScaleUp() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2HorizontalPodAutoscalerBehaviorFluentImpl that =
        (V2HorizontalPodAutoscalerBehaviorFluentImpl) o;
    if (scaleDown != null ? !scaleDown.equals(that.scaleDown) : that.scaleDown != null)
      return false;
    if (scaleUp != null ? !scaleUp.equals(that.scaleUp) : that.scaleUp != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(scaleDown, scaleUp, super.hashCode());
  }

  public class ScaleDownNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2HPAScalingRulesFluentImpl<
          io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
                  .ScaleDownNested<
              N>>
      implements io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
                  .ScaleDownNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleDownNestedImpl(io.kubernetes.client.openapi.models.V2HPAScalingRules item) {
      this.builder = new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder(this, item);
    }

    ScaleDownNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder builder;

    public N and() {
      return (N) V2HorizontalPodAutoscalerBehaviorFluentImpl.this.withScaleDown(builder.build());
    }

    public N endScaleDown() {
      return and();
    }
  }

  public class ScaleUpNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V2HPAScalingRulesFluentImpl<
          io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
              N>>
      implements io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
                  .ScaleUpNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleUpNestedImpl(io.kubernetes.client.openapi.models.V2HPAScalingRules item) {
      this.builder = new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder(this, item);
    }

    ScaleUpNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder(this);
    }

    io.kubernetes.client.openapi.models.V2HPAScalingRulesBuilder builder;

    public N and() {
      return (N) V2HorizontalPodAutoscalerBehaviorFluentImpl.this.withScaleUp(builder.build());
    }

    public N endScaleUp() {
      return and();
    }
  }
}
