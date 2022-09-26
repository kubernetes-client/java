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

public class V1AWSElasticBlockStoreVolumeSourceBuilder
    extends V1AWSElasticBlockStoreVolumeSourceFluentImpl<V1AWSElasticBlockStoreVolumeSourceBuilder>
    implements VisitableBuilder<
        V1AWSElasticBlockStoreVolumeSource, V1AWSElasticBlockStoreVolumeSourceBuilder> {
  public V1AWSElasticBlockStoreVolumeSourceBuilder() {
    this(false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1AWSElasticBlockStoreVolumeSource(), validationEnabled);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,
      V1AWSElasticBlockStoreVolumeSource instance) {
    this(fluent, instance, false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,
      V1AWSElasticBlockStoreVolumeSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withFsType(instance.getFsType());

    fluent.withPartition(instance.getPartition());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSource instance) {
    this(instance, false);
  }

  public V1AWSElasticBlockStoreVolumeSourceBuilder(
      V1AWSElasticBlockStoreVolumeSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withFsType(instance.getFsType());

    this.withPartition(instance.getPartition());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled;
  }

  V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1AWSElasticBlockStoreVolumeSource build() {
    V1AWSElasticBlockStoreVolumeSource buildable = new V1AWSElasticBlockStoreVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
}
