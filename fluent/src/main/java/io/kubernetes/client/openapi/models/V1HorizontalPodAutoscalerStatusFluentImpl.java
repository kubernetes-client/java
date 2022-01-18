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
public class V1HorizontalPodAutoscalerStatusFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatusFluent<A> {
  public V1HorizontalPodAutoscalerStatusFluentImpl() {}

  public V1HorizontalPodAutoscalerStatusFluentImpl(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerStatus instance) {
    this.withCurrentCPUUtilizationPercentage(instance.getCurrentCPUUtilizationPercentage());

    this.withCurrentReplicas(instance.getCurrentReplicas());

    this.withDesiredReplicas(instance.getDesiredReplicas());

    this.withLastScaleTime(instance.getLastScaleTime());

    this.withObservedGeneration(instance.getObservedGeneration());
  }

  private java.lang.Integer currentCPUUtilizationPercentage;
  private java.lang.Integer currentReplicas;
  private java.lang.Integer desiredReplicas;
  private java.time.OffsetDateTime lastScaleTime;
  private java.lang.Long observedGeneration;

  public java.lang.Integer getCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage;
  }

  public A withCurrentCPUUtilizationPercentage(java.lang.Integer currentCPUUtilizationPercentage) {
    this.currentCPUUtilizationPercentage = currentCPUUtilizationPercentage;
    return (A) this;
  }

  public java.lang.Boolean hasCurrentCPUUtilizationPercentage() {
    return this.currentCPUUtilizationPercentage != null;
  }

  public java.lang.Integer getCurrentReplicas() {
    return this.currentReplicas;
  }

  public A withCurrentReplicas(java.lang.Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasCurrentReplicas() {
    return this.currentReplicas != null;
  }

  public java.lang.Integer getDesiredReplicas() {
    return this.desiredReplicas;
  }

  public A withDesiredReplicas(java.lang.Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasDesiredReplicas() {
    return this.desiredReplicas != null;
  }

  public java.time.OffsetDateTime getLastScaleTime() {
    return this.lastScaleTime;
  }

  public A withLastScaleTime(java.time.OffsetDateTime lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return (A) this;
  }

  public java.lang.Boolean hasLastScaleTime() {
    return this.lastScaleTime != null;
  }

  public java.lang.Long getObservedGeneration() {
    return this.observedGeneration;
  }

  public A withObservedGeneration(java.lang.Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return (A) this;
  }

  public java.lang.Boolean hasObservedGeneration() {
    return this.observedGeneration != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HorizontalPodAutoscalerStatusFluentImpl that = (V1HorizontalPodAutoscalerStatusFluentImpl) o;
    if (currentCPUUtilizationPercentage != null
        ? !currentCPUUtilizationPercentage.equals(that.currentCPUUtilizationPercentage)
        : that.currentCPUUtilizationPercentage != null) return false;
    if (currentReplicas != null
        ? !currentReplicas.equals(that.currentReplicas)
        : that.currentReplicas != null) return false;
    if (desiredReplicas != null
        ? !desiredReplicas.equals(that.desiredReplicas)
        : that.desiredReplicas != null) return false;
    if (lastScaleTime != null
        ? !lastScaleTime.equals(that.lastScaleTime)
        : that.lastScaleTime != null) return false;
    if (observedGeneration != null
        ? !observedGeneration.equals(that.observedGeneration)
        : that.observedGeneration != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        currentCPUUtilizationPercentage,
        currentReplicas,
        desiredReplicas,
        lastScaleTime,
        observedGeneration,
        super.hashCode());
  }
}
