/*
Copyright 2026 The Kubernetes Authors.
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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1StorageHealthBuilder extends V1StorageHealthFluent<V1StorageHealthBuilder> implements VisitableBuilder<V1StorageHealth,V1StorageHealthBuilder>{

  V1StorageHealthFluent<?> fluent;

  public V1StorageHealthBuilder() {
    this(new V1StorageHealth());
  }
  
  public V1StorageHealthBuilder(V1StorageHealthFluent<?> fluent) {
    this(fluent, new V1StorageHealth());
  }
  
  public V1StorageHealthBuilder(V1StorageHealth instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageHealthBuilder(V1StorageHealthFluent<?> fluent,V1StorageHealth instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageHealth build() {
    V1StorageHealth buildable = new V1StorageHealth();
    buildable.setHealthConditions(fluent.buildHealthConditions());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}