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

public class V1DeploymentSpecBuilder
    extends io.kubernetes.client.openapi.models.V1DeploymentSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1DeploymentSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1DeploymentSpec,
        io.kubernetes.client.openapi.models.V1DeploymentSpecBuilder> {
  public V1DeploymentSpecBuilder() {
    this(false);
  }

  public V1DeploymentSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1DeploymentSpec(), validationEnabled);
  }

  public V1DeploymentSpecBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DeploymentSpecBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1DeploymentSpec(), validationEnabled);
  }

  public V1DeploymentSpecBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DeploymentSpec instance) {
    this(fluent, instance, false);
  }

  public V1DeploymentSpecBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1DeploymentSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withPaused(instance.getPaused());

    fluent.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());

    fluent.withReplicas(instance.getReplicas());

    fluent.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    fluent.withSelector(instance.getSelector());

    fluent.withStrategy(instance.getStrategy());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  public V1DeploymentSpecBuilder(io.kubernetes.client.openapi.models.V1DeploymentSpec instance) {
    this(instance, false);
  }

  public V1DeploymentSpecBuilder(
      io.kubernetes.client.openapi.models.V1DeploymentSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withPaused(instance.getPaused());

    this.withProgressDeadlineSeconds(instance.getProgressDeadlineSeconds());

    this.withReplicas(instance.getReplicas());

    this.withRevisionHistoryLimit(instance.getRevisionHistoryLimit());

    this.withSelector(instance.getSelector());

    this.withStrategy(instance.getStrategy());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1DeploymentSpec build() {
    V1DeploymentSpec buildable = new V1DeploymentSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setPaused(fluent.getPaused());
    buildable.setProgressDeadlineSeconds(fluent.getProgressDeadlineSeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setRevisionHistoryLimit(fluent.getRevisionHistoryLimit());
    buildable.setSelector(fluent.getSelector());
    buildable.setStrategy(fluent.getStrategy());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DeploymentSpecBuilder that = (V1DeploymentSpecBuilder) o;
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
