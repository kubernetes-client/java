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

public class V1VolumeAttachmentSpecBuilder
    extends V1VolumeAttachmentSpecFluentImpl<V1VolumeAttachmentSpecBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec, V1VolumeAttachmentSpecBuilder> {
  public V1VolumeAttachmentSpecBuilder() {
    this(false);
  }

  public V1VolumeAttachmentSpecBuilder(Boolean validationEnabled) {
    this(new V1VolumeAttachmentSpec(), validationEnabled);
  }

  public V1VolumeAttachmentSpecBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeAttachmentSpecBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachmentSpec(), validationEnabled);
  }

  public V1VolumeAttachmentSpecBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec instance) {
    this(fluent, instance, false);
  }

  public V1VolumeAttachmentSpecBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAttacher(instance.getAttacher());

    fluent.withNodeName(instance.getNodeName());

    fluent.withSource(instance.getSource());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeAttachmentSpecBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec instance) {
    this(instance, false);
  }

  public V1VolumeAttachmentSpecBuilder(
      io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAttacher(instance.getAttacher());

    this.withNodeName(instance.getNodeName());

    this.withSource(instance.getSource());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1VolumeAttachmentSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1VolumeAttachmentSpec build() {
    V1VolumeAttachmentSpec buildable = new V1VolumeAttachmentSpec();
    buildable.setAttacher(fluent.getAttacher());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setSource(fluent.getSource());
    return buildable;
  }
}
