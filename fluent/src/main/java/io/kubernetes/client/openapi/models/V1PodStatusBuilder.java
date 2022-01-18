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

public class V1PodStatusBuilder
    extends io.kubernetes.client.openapi.models.V1PodStatusFluentImpl<
        io.kubernetes.client.openapi.models.V1PodStatusBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1PodStatus,
        io.kubernetes.client.openapi.models.V1PodStatusBuilder> {
  public V1PodStatusBuilder() {
    this(false);
  }

  public V1PodStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodStatus(), validationEnabled);
  }

  public V1PodStatusBuilder(io.kubernetes.client.openapi.models.V1PodStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodStatusFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodStatus(), validationEnabled);
  }

  public V1PodStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodStatus instance) {
    this(fluent, instance, false);
  }

  public V1PodStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodStatusFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1PodStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    fluent.withContainerStatuses(instance.getContainerStatuses());

    fluent.withEphemeralContainerStatuses(instance.getEphemeralContainerStatuses());

    fluent.withHostIP(instance.getHostIP());

    fluent.withInitContainerStatuses(instance.getInitContainerStatuses());

    fluent.withMessage(instance.getMessage());

    fluent.withNominatedNodeName(instance.getNominatedNodeName());

    fluent.withPhase(instance.getPhase());

    fluent.withPodIP(instance.getPodIP());

    fluent.withPodIPs(instance.getPodIPs());

    fluent.withQosClass(instance.getQosClass());

    fluent.withReason(instance.getReason());

    fluent.withStartTime(instance.getStartTime());

    this.validationEnabled = validationEnabled;
  }

  public V1PodStatusBuilder(io.kubernetes.client.openapi.models.V1PodStatus instance) {
    this(instance, false);
  }

  public V1PodStatusBuilder(
      io.kubernetes.client.openapi.models.V1PodStatus instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.withContainerStatuses(instance.getContainerStatuses());

    this.withEphemeralContainerStatuses(instance.getEphemeralContainerStatuses());

    this.withHostIP(instance.getHostIP());

    this.withInitContainerStatuses(instance.getInitContainerStatuses());

    this.withMessage(instance.getMessage());

    this.withNominatedNodeName(instance.getNominatedNodeName());

    this.withPhase(instance.getPhase());

    this.withPodIP(instance.getPodIP());

    this.withPodIPs(instance.getPodIPs());

    this.withQosClass(instance.getQosClass());

    this.withReason(instance.getReason());

    this.withStartTime(instance.getStartTime());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1PodStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1PodStatus build() {
    V1PodStatus buildable = new V1PodStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setContainerStatuses(fluent.getContainerStatuses());
    buildable.setEphemeralContainerStatuses(fluent.getEphemeralContainerStatuses());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setInitContainerStatuses(fluent.getInitContainerStatuses());
    buildable.setMessage(fluent.getMessage());
    buildable.setNominatedNodeName(fluent.getNominatedNodeName());
    buildable.setPhase(fluent.getPhase());
    buildable.setPodIP(fluent.getPodIP());
    buildable.setPodIPs(fluent.getPodIPs());
    buildable.setQosClass(fluent.getQosClass());
    buildable.setReason(fluent.getReason());
    buildable.setStartTime(fluent.getStartTime());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodStatusBuilder that = (V1PodStatusBuilder) o;
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
