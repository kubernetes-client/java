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

public class V1JobSpecBuilder
    extends io.kubernetes.client.openapi.models.V1JobSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1JobSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1JobSpec,
        io.kubernetes.client.openapi.models.V1JobSpecBuilder> {
  public V1JobSpecBuilder() {
    this(false);
  }

  public V1JobSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1JobSpec(), validationEnabled);
  }

  public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1JobSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1JobSpec(), validationEnabled);
  }

  public V1JobSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobSpec instance) {
    this(fluent, instance, false);
  }

  public V1JobSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1JobSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    fluent.withBackoffLimit(instance.getBackoffLimit());

    fluent.withCompletionMode(instance.getCompletionMode());

    fluent.withCompletions(instance.getCompletions());

    fluent.withManualSelector(instance.getManualSelector());

    fluent.withParallelism(instance.getParallelism());

    fluent.withSelector(instance.getSelector());

    fluent.withSuspend(instance.getSuspend());

    fluent.withTemplate(instance.getTemplate());

    fluent.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());

    this.validationEnabled = validationEnabled;
  }

  public V1JobSpecBuilder(io.kubernetes.client.openapi.models.V1JobSpec instance) {
    this(instance, false);
  }

  public V1JobSpecBuilder(
      io.kubernetes.client.openapi.models.V1JobSpec instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    this.withBackoffLimit(instance.getBackoffLimit());

    this.withCompletionMode(instance.getCompletionMode());

    this.withCompletions(instance.getCompletions());

    this.withManualSelector(instance.getManualSelector());

    this.withParallelism(instance.getParallelism());

    this.withSelector(instance.getSelector());

    this.withSuspend(instance.getSuspend());

    this.withTemplate(instance.getTemplate());

    this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1JobSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1JobSpec build() {
    V1JobSpec buildable = new V1JobSpec();
    buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
    buildable.setBackoffLimit(fluent.getBackoffLimit());
    buildable.setCompletionMode(fluent.getCompletionMode());
    buildable.setCompletions(fluent.getCompletions());
    buildable.setManualSelector(fluent.getManualSelector());
    buildable.setParallelism(fluent.getParallelism());
    buildable.setSelector(fluent.getSelector());
    buildable.setSuspend(fluent.getSuspend());
    buildable.setTemplate(fluent.getTemplate());
    buildable.setTtlSecondsAfterFinished(fluent.getTtlSecondsAfterFinished());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1JobSpecBuilder that = (V1JobSpecBuilder) o;
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
