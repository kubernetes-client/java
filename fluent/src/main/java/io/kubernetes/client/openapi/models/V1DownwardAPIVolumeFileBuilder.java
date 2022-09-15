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

public class V1DownwardAPIVolumeFileBuilder
    extends V1DownwardAPIVolumeFileFluentImpl<V1DownwardAPIVolumeFileBuilder>
    implements VisitableBuilder<V1DownwardAPIVolumeFile, V1DownwardAPIVolumeFileBuilder> {
  public V1DownwardAPIVolumeFileBuilder() {
    this(false);
  }

  public V1DownwardAPIVolumeFileBuilder(Boolean validationEnabled) {
    this(new V1DownwardAPIVolumeFile(), validationEnabled);
  }

  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFileFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DownwardAPIVolumeFileBuilder(
      V1DownwardAPIVolumeFileFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1DownwardAPIVolumeFile(), validationEnabled);
  }

  public V1DownwardAPIVolumeFileBuilder(
      V1DownwardAPIVolumeFileFluent<?> fluent, V1DownwardAPIVolumeFile instance) {
    this(fluent, instance, false);
  }

  public V1DownwardAPIVolumeFileBuilder(
      V1DownwardAPIVolumeFileFluent<?> fluent,
      V1DownwardAPIVolumeFile instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFieldRef(instance.getFieldRef());

    fluent.withMode(instance.getMode());

    fluent.withPath(instance.getPath());

    fluent.withResourceFieldRef(instance.getResourceFieldRef());

    this.validationEnabled = validationEnabled;
  }

  public V1DownwardAPIVolumeFileBuilder(V1DownwardAPIVolumeFile instance) {
    this(instance, false);
  }

  public V1DownwardAPIVolumeFileBuilder(
      V1DownwardAPIVolumeFile instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withFieldRef(instance.getFieldRef());

    this.withMode(instance.getMode());

    this.withPath(instance.getPath());

    this.withResourceFieldRef(instance.getResourceFieldRef());

    this.validationEnabled = validationEnabled;
  }

  V1DownwardAPIVolumeFileFluent<?> fluent;
  Boolean validationEnabled;

  public V1DownwardAPIVolumeFile build() {
    V1DownwardAPIVolumeFile buildable = new V1DownwardAPIVolumeFile();
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    buildable.setResourceFieldRef(fluent.getResourceFieldRef());
    return buildable;
  }
}
