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

public class V1beta1AllowedFlexVolumeBuilder
    extends V1beta1AllowedFlexVolumeFluentImpl<V1beta1AllowedFlexVolumeBuilder>
    implements VisitableBuilder<
        V1beta1AllowedFlexVolume,
        io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeBuilder> {
  public V1beta1AllowedFlexVolumeBuilder() {
    this(false);
  }

  public V1beta1AllowedFlexVolumeBuilder(Boolean validationEnabled) {
    this(new V1beta1AllowedFlexVolume(), validationEnabled);
  }

  public V1beta1AllowedFlexVolumeBuilder(V1beta1AllowedFlexVolumeFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1AllowedFlexVolumeBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1AllowedFlexVolume(), validationEnabled);
  }

  public V1beta1AllowedFlexVolumeBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance) {
    this(fluent, instance, false);
  }

  public V1beta1AllowedFlexVolumeBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withDriver(instance.getDriver());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1AllowedFlexVolumeBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance) {
    this(instance, false);
  }

  public V1beta1AllowedFlexVolumeBuilder(
      io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withDriver(instance.getDriver());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolumeFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1AllowedFlexVolume build() {
    V1beta1AllowedFlexVolume buildable = new V1beta1AllowedFlexVolume();
    buildable.setDriver(fluent.getDriver());
    return buildable;
  }
}
