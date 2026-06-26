/*
Copyright 2020 The Kubernetes Authors.
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
import java.lang.Object;
public class V1AWSElasticBlockStoreVolumeSourceBuilder extends V1AWSElasticBlockStoreVolumeSourceFluent<V1AWSElasticBlockStoreVolumeSourceBuilder> implements VisitableBuilder<V1AWSElasticBlockStoreVolumeSource,V1AWSElasticBlockStoreVolumeSourceBuilder>{

  V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent;

  public V1AWSElasticBlockStoreVolumeSourceBuilder() {
    this(new V1AWSElasticBlockStoreVolumeSource());
  }
  
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent) {
    this(fluent, new V1AWSElasticBlockStoreVolumeSource());
  }
  
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1AWSElasticBlockStoreVolumeSourceBuilder(V1AWSElasticBlockStoreVolumeSourceFluent<?> fluent,V1AWSElasticBlockStoreVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1AWSElasticBlockStoreVolumeSource build() {
    V1AWSElasticBlockStoreVolumeSource buildable = new V1AWSElasticBlockStoreVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPartition(fluent.getPartition());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  
}