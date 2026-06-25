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
public class V1VolumeNodeResourcesBuilder extends V1VolumeNodeResourcesFluent<V1VolumeNodeResourcesBuilder> implements VisitableBuilder<V1VolumeNodeResources,V1VolumeNodeResourcesBuilder>{

  V1VolumeNodeResourcesFluent<?> fluent;

  public V1VolumeNodeResourcesBuilder() {
    this(new V1VolumeNodeResources());
  }
  
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent) {
    this(fluent, new V1VolumeNodeResources());
  }
  
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeNodeResourcesBuilder(V1VolumeNodeResourcesFluent<?> fluent,V1VolumeNodeResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeNodeResources build() {
    V1VolumeNodeResources buildable = new V1VolumeNodeResources();
    buildable.setCount(fluent.getCount());
    return buildable;
  }
  
}