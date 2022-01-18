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

public class V2beta2HorizontalPodAutoscalerSpecBuilder
    extends io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluentImpl<
        io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpec,
        io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecBuilder> {
  public V2beta2HorizontalPodAutoscalerSpecBuilder() {
    this(false);
  }

  public V2beta2HorizontalPodAutoscalerSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerSpec(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerSpec(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpec instance) {
    this(fluent, instance, false);
  }

  public V2beta2HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withBehavior(instance.getBehavior());

    fluent.withMaxReplicas(instance.getMaxReplicas());

    fluent.withMetrics(instance.getMetrics());

    fluent.withMinReplicas(instance.getMinReplicas());

    fluent.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpec instance) {
    this(instance, false);
  }

  public V2beta2HorizontalPodAutoscalerSpecBuilder(
      io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withBehavior(instance.getBehavior());

    this.withMaxReplicas(instance.getMaxReplicas());

    this.withMetrics(instance.getMetrics());

    this.withMinReplicas(instance.getMinReplicas());

    this.withScaleTargetRef(instance.getScaleTargetRef());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V2beta2HorizontalPodAutoscalerSpec build() {
    V2beta2HorizontalPodAutoscalerSpec buildable = new V2beta2HorizontalPodAutoscalerSpec();
    buildable.setBehavior(fluent.getBehavior());
    buildable.setMaxReplicas(fluent.getMaxReplicas());
    buildable.setMetrics(fluent.getMetrics());
    buildable.setMinReplicas(fluent.getMinReplicas());
    buildable.setScaleTargetRef(fluent.getScaleTargetRef());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2beta2HorizontalPodAutoscalerSpecBuilder that = (V2beta2HorizontalPodAutoscalerSpecBuilder) o;
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
