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

public class V1ReplicationControllerSpecBuilder
    extends io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluentImpl<
        io.kubernetes.client.openapi.models.V1ReplicationControllerSpecBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1ReplicationControllerSpec,
        io.kubernetes.client.openapi.models.V1ReplicationControllerSpecBuilder> {
  public V1ReplicationControllerSpecBuilder() {
    this(false);
  }

  public V1ReplicationControllerSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ReplicationControllerSpec(), validationEnabled);
  }

  public V1ReplicationControllerSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicationControllerSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1ReplicationControllerSpec(), validationEnabled);
  }

  public V1ReplicationControllerSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpec instance) {
    this(fluent, instance, false);
  }

  public V1ReplicationControllerSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withReplicas(instance.getReplicas());

    fluent.withSelector(instance.getSelector());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  public V1ReplicationControllerSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpec instance) {
    this(instance, false);
  }

  public V1ReplicationControllerSpecBuilder(
      io.kubernetes.client.openapi.models.V1ReplicationControllerSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1ReplicationControllerSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1ReplicationControllerSpec build() {
    V1ReplicationControllerSpec buildable = new V1ReplicationControllerSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ReplicationControllerSpecBuilder that = (V1ReplicationControllerSpecBuilder) o;
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
