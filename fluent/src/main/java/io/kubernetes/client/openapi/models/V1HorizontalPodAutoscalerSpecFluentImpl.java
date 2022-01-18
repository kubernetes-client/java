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
public class V1HorizontalPodAutoscalerSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<A> {
  public V1HorizontalPodAutoscalerSpecFluentImpl() {}

  public V1HorizontalPodAutoscalerSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance) {
    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());
  }

  private java.lang.Integer maxReplicas;
  private java.lang.Integer minReplicas;
  private io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder scaleTargetRef;
  private java.lang.Integer targetCPUUtilizationPercentage;

  public java.lang.Integer getMaxReplicas() {
    return this.maxReplicas;
  }

  public A withMaxReplicas(java.lang.Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasMaxReplicas() {
    return this.maxReplicas != null;
  }

  public java.lang.Integer getMinReplicas() {
    return this.minReplicas;
  }

  public A withMinReplicas(java.lang.Integer minReplicas) {
    this.minReplicas = minReplicas;
    return (A) this;
  }

  public java.lang.Boolean hasMinReplicas() {
    return this.minReplicas != null;
  }

  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference getScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CrossVersionObjectReference buildScaleTargetRef() {
    return this.scaleTargetRef != null ? this.scaleTargetRef.build() : null;
  }

  public A withScaleTargetRef(
      io.kubernetes.client.openapi.models.V1CrossVersionObjectReference scaleTargetRef) {
    _visitables.get("scaleTargetRef").remove(this.scaleTargetRef);
    if (scaleTargetRef != null) {
      this.scaleTargetRef =
          new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder(
              scaleTargetRef);
      _visitables.get("scaleTargetRef").add(this.scaleTargetRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScaleTargetRef() {
    return this.scaleTargetRef != null;
  }

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRef() {
    return new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluentImpl
        .ScaleTargetRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      withNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluentImpl
        .ScaleTargetRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editScaleTargetRef() {
    return withNewScaleTargetRefLike(getScaleTargetRef());
  }

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRef() {
    return withNewScaleTargetRefLike(
        getScaleTargetRef() != null
            ? getScaleTargetRef()
            : new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
              .ScaleTargetRefNested<
          A>
      editOrNewScaleTargetRefLike(
          io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item) {
    return withNewScaleTargetRefLike(getScaleTargetRef() != null ? getScaleTargetRef() : item);
  }

  public java.lang.Integer getTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage;
  }

  public A withTargetCPUUtilizationPercentage(java.lang.Integer targetCPUUtilizationPercentage) {
    this.targetCPUUtilizationPercentage = targetCPUUtilizationPercentage;
    return (A) this;
  }

  public java.lang.Boolean hasTargetCPUUtilizationPercentage() {
    return this.targetCPUUtilizationPercentage != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HorizontalPodAutoscalerSpecFluentImpl that = (V1HorizontalPodAutoscalerSpecFluentImpl) o;
    if (maxReplicas != null ? !maxReplicas.equals(that.maxReplicas) : that.maxReplicas != null)
      return false;
    if (minReplicas != null ? !minReplicas.equals(that.minReplicas) : that.minReplicas != null)
      return false;
    if (scaleTargetRef != null
        ? !scaleTargetRef.equals(that.scaleTargetRef)
        : that.scaleTargetRef != null) return false;
    if (targetCPUUtilizationPercentage != null
        ? !targetCPUUtilizationPercentage.equals(that.targetCPUUtilizationPercentage)
        : that.targetCPUUtilizationPercentage != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        maxReplicas, minReplicas, scaleTargetRef, targetCPUUtilizationPercentage, super.hashCode());
  }

  public class ScaleTargetRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
                  .ScaleTargetRefNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent
                  .ScaleTargetRefNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleTargetRefNestedImpl(
        io.kubernetes.client.openapi.models.V1CrossVersionObjectReference item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder(this, item);
    }

    ScaleTargetRefNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CrossVersionObjectReferenceBuilder builder;

    public N and() {
      return (N) V1HorizontalPodAutoscalerSpecFluentImpl.this.withScaleTargetRef(builder.build());
    }

    public N endScaleTargetRef() {
      return and();
    }
  }
}
