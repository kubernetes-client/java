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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1ReplicationControllerSpecBuilder
    extends V1ReplicationControllerSpecFluentImpl<V1ReplicationControllerSpecBuilder>
    implements VisitableBuilder<V1ReplicationControllerSpec, V1ReplicationControllerSpecBuilder> {
  public V1ReplicationControllerSpecBuilder() {
    this(false);
  }

  public V1ReplicationControllerSpecBuilder(Boolean validationEnabled) {
    this(new V1ReplicationControllerSpec(), validationEnabled);
  }

  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ReplicationControllerSpecBuilder(
      V1ReplicationControllerSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ReplicationControllerSpec(), validationEnabled);
  }

  public V1ReplicationControllerSpecBuilder(
      V1ReplicationControllerSpecFluent<?> fluent, V1ReplicationControllerSpec instance) {
    this(fluent, instance, false);
  }

  public V1ReplicationControllerSpecBuilder(
      V1ReplicationControllerSpecFluent<?> fluent,
      V1ReplicationControllerSpec instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMinReadySeconds(instance.getMinReadySeconds());

    fluent.withReplicas(instance.getReplicas());

    fluent.withSelector(instance.getSelector());

    fluent.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  public V1ReplicationControllerSpecBuilder(V1ReplicationControllerSpec instance) {
    this(instance, false);
  }

  public V1ReplicationControllerSpecBuilder(
      V1ReplicationControllerSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMinReadySeconds(instance.getMinReadySeconds());

    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.withTemplate(instance.getTemplate());

    this.validationEnabled = validationEnabled;
  }

  V1ReplicationControllerSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1ReplicationControllerSpec build() {
    V1ReplicationControllerSpec buildable = new V1ReplicationControllerSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    buildable.setTemplate(fluent.getTemplate());
    return buildable;
  }
}
