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

public class V1HorizontalPodAutoscalerSpecBuilder
    extends io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec,
        io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecBuilder> {
  public V1HorizontalPodAutoscalerSpecBuilder() {
    this(false);
  }

  public V1HorizontalPodAutoscalerSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1HorizontalPodAutoscalerSpec(), validationEnabled);
  }

  public V1HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1HorizontalPodAutoscalerSpec(), validationEnabled);
  }

  public V1HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance) {
    this(fluent, instance, false);
  }

  public V1HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMaxReplicas(instance.getMaxReplicas());

    fluent.withMinReplicas(instance.getMinReplicas());

    fluent.withScaleTargetRef(instance.getScaleTargetRef());

    fluent.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());

    this.validationEnabled = validationEnabled;
  }

  public V1HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance) {
    this(instance, false);
  }

  public V1HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.withTargetCPUUtilizationPercentage(instance.getTargetCPUUtilizationPercentage());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerSpec build() {
    V1HorizontalPodAutoscalerSpec buildable = new V1HorizontalPodAutoscalerSpec();
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.getScaleTargetRef());
    buildable.setTargetCPUUtilizationPercentage(fluent.getTargetCPUUtilizationPercentage());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HorizontalPodAutoscalerSpecBuilder that = (V1HorizontalPodAutoscalerSpecBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
