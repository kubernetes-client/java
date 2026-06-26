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
public class V1CinderVolumeSourceBuilder extends V1CinderVolumeSourceFluent<V1CinderVolumeSourceBuilder> implements VisitableBuilder<V1CinderVolumeSource,V1CinderVolumeSourceBuilder>{

  V1CinderVolumeSourceFluent<?> fluent;

  public V1CinderVolumeSourceBuilder() {
    this(new V1CinderVolumeSource());
  }
  
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CinderVolumeSource());
  }
  
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent,V1CinderVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CinderVolumeSource build() {
    V1CinderVolumeSource buildable = new V1CinderVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  
}