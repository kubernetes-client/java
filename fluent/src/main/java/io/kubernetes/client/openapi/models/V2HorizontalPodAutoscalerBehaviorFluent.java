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
public interface V2HorizontalPodAutoscalerBehaviorFluent<
        A extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildScaleDown instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2HPAScalingRules getScaleDown();

  public io.kubernetes.client.openapi.models.V2HPAScalingRules buildScaleDown();

  public A withScaleDown(io.kubernetes.client.openapi.models.V2HPAScalingRules scaleDown);

  public java.lang.Boolean hasScaleDown();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      withNewScaleDown();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      withNewScaleDownLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item);

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      editScaleDown();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      editOrNewScaleDown();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
              .ScaleDownNested<
          A>
      editOrNewScaleDownLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item);

  /**
   * This method has been deprecated, please use method buildScaleUp instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2HPAScalingRules getScaleUp();

  public io.kubernetes.client.openapi.models.V2HPAScalingRules buildScaleUp();

  public A withScaleUp(io.kubernetes.client.openapi.models.V2HPAScalingRules scaleUp);

  public java.lang.Boolean hasScaleUp();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      withNewScaleUp();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      withNewScaleUpLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item);

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      editScaleUp();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      editOrNewScaleUp();

  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent.ScaleUpNested<
          A>
      editOrNewScaleUpLike(io.kubernetes.client.openapi.models.V2HPAScalingRules item);

  public interface ScaleDownNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<
              io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
                      .ScaleDownNested<
                  N>> {
    public N and();

    public N endScaleDown();
  }

  public interface ScaleUpNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V2HPAScalingRulesFluent<
              io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent
                      .ScaleUpNested<
                  N>> {
    public N and();

    public N endScaleUp();
  }
}
