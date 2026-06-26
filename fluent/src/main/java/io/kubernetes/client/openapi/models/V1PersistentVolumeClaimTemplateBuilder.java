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
public class V1PersistentVolumeClaimTemplateBuilder extends V1PersistentVolumeClaimTemplateFluent<V1PersistentVolumeClaimTemplateBuilder> implements VisitableBuilder<V1PersistentVolumeClaimTemplate,V1PersistentVolumeClaimTemplateBuilder>{

  V1PersistentVolumeClaimTemplateFluent<?> fluent;

  public V1PersistentVolumeClaimTemplateBuilder() {
    this(new V1PersistentVolumeClaimTemplate());
  }
  
  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplateFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimTemplate());
  }
  
  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimTemplateBuilder(V1PersistentVolumeClaimTemplateFluent<?> fluent,V1PersistentVolumeClaimTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PersistentVolumeClaimTemplate build() {
    V1PersistentVolumeClaimTemplate buildable = new V1PersistentVolumeClaimTemplate();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}