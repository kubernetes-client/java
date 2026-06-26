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
public class V1FlockerVolumeSourceBuilder extends V1FlockerVolumeSourceFluent<V1FlockerVolumeSourceBuilder> implements VisitableBuilder<V1FlockerVolumeSource,V1FlockerVolumeSourceBuilder>{

  V1FlockerVolumeSourceFluent<?> fluent;

  public V1FlockerVolumeSourceBuilder() {
    this(new V1FlockerVolumeSource());
  }
  
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent) {
    this(fluent, new V1FlockerVolumeSource());
  }
  
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent,V1FlockerVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FlockerVolumeSource build() {
    V1FlockerVolumeSource buildable = new V1FlockerVolumeSource();
    buildable.setDatasetName(fluent.getDatasetName());
    buildable.setDatasetUUID(fluent.getDatasetUUID());
    return buildable;
  }
  
}