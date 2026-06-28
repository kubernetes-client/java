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
import java.lang.Object;
public class V1VolumeAttributesClassBuilder extends V1VolumeAttributesClassFluent<V1VolumeAttributesClassBuilder> implements VisitableBuilder<V1VolumeAttributesClass,V1VolumeAttributesClassBuilder>{

  V1VolumeAttributesClassFluent<?> fluent;

  public V1VolumeAttributesClassBuilder() {
    this(new V1VolumeAttributesClass());
  }
  
  public V1VolumeAttributesClassBuilder(V1VolumeAttributesClassFluent<?> fluent) {
    this(fluent, new V1VolumeAttributesClass());
  }
  
  public V1VolumeAttributesClassBuilder(V1VolumeAttributesClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeAttributesClassBuilder(V1VolumeAttributesClassFluent<?> fluent,V1VolumeAttributesClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeAttributesClass build() {
    V1VolumeAttributesClass buildable = new V1VolumeAttributesClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setParameters(fluent.getParameters());
    return buildable;
  }
  
}