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

public class V1CSIDriverSpecBuilder extends V1CSIDriverSpecFluentImpl<V1CSIDriverSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CSIDriverSpec,
        io.kubernetes.client.openapi.models.V1CSIDriverSpecBuilder> {
  public V1CSIDriverSpecBuilder() {
    this(false);
  }

  public V1CSIDriverSpecBuilder(Boolean validationEnabled) {
    this(new V1CSIDriverSpec(), validationEnabled);
  }

  public V1CSIDriverSpecBuilder(V1CSIDriverSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CSIDriverSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CSIDriverSpec(), validationEnabled);
  }

  public V1CSIDriverSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSIDriverSpec instance) {
    this(fluent, instance, false);
  }

  public V1CSIDriverSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CSIDriverSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAttachRequired(instance.getAttachRequired());

    fluent.withFsGroupPolicy(instance.getFsGroupPolicy());

    fluent.withPodInfoOnMount(instance.getPodInfoOnMount());

    fluent.withRequiresRepublish(instance.getRequiresRepublish());

    fluent.withStorageCapacity(instance.getStorageCapacity());

    fluent.withTokenRequests(instance.getTokenRequests());

    fluent.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());

    this.validationEnabled = validationEnabled;
  }

  public V1CSIDriverSpecBuilder(io.kubernetes.client.openapi.models.V1CSIDriverSpec instance) {
    this(instance, false);
  }

  public V1CSIDriverSpecBuilder(
      io.kubernetes.client.openapi.models.V1CSIDriverSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAttachRequired(instance.getAttachRequired());

    this.withFsGroupPolicy(instance.getFsGroupPolicy());

    this.withPodInfoOnMount(instance.getPodInfoOnMount());

    this.withRequiresRepublish(instance.getRequiresRepublish());

    this.withStorageCapacity(instance.getStorageCapacity());

    this.withTokenRequests(instance.getTokenRequests());

    this.withVolumeLifecycleModes(instance.getVolumeLifecycleModes());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CSIDriverSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CSIDriverSpec build() {
    V1CSIDriverSpec buildable = new V1CSIDriverSpec();
    buildable.setAttachRequired(fluent.getAttachRequired());
    buildable.setFsGroupPolicy(fluent.getFsGroupPolicy());
    buildable.setPodInfoOnMount(fluent.getPodInfoOnMount());
    buildable.setRequiresRepublish(fluent.getRequiresRepublish());
    buildable.setStorageCapacity(fluent.getStorageCapacity());
    buildable.setTokenRequests(fluent.getTokenRequests());
    buildable.setVolumeLifecycleModes(fluent.getVolumeLifecycleModes());
    return buildable;
  }
}
