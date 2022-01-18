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
public interface V1HorizontalPodAutoscalerSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.Integer getMaxReplicas();

  public A withMaxReplicas(java.lang.Integer maxReplicas);

  public java.lang.Boolean hasMaxReplicas();

  public java.lang.Integer getMinReplicas();

  public A withMinReplicas(java.lang.Integer minReplicas);

  public java.lang.Boolean hasMinReplicas();

  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference getScaleTargetRef();

  public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference buildScaleTargetRef();

  public A withScaleTargetRef(
      io.kubernetes.client.openapi.models.V1CrossVersionObjectReference scaleTargetRef);

  public java.lang.Boolean hasScaleTargetRef();

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRef();

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item);

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editScaleTargetRef();

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRef();

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item);

  public java.lang.Integer getTargetCPUUtilizationPercentage();

  public A withTargetCPUUtilizationPercentage(java.lang.Integer targetCPUUtilizationPercentage);

  public java.lang.Boolean hasTargetCPUUtilizationPercentage();

  public interface ScaleTargetRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
                      .ScaleTargetRefNested<
                  N>> {
    public N and();

    public N endScaleTargetRef();
  }
}
