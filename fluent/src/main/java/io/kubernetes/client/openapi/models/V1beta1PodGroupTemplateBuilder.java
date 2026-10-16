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
public class V1beta1PodGroupTemplateBuilder extends V1beta1PodGroupTemplateFluent<V1beta1PodGroupTemplateBuilder> implements VisitableBuilder<V1beta1PodGroupTemplate,V1beta1PodGroupTemplateBuilder>{

  V1beta1PodGroupTemplateFluent<?> fluent;

  public V1beta1PodGroupTemplateBuilder() {
    this(new V1beta1PodGroupTemplate());
  }
  
  public V1beta1PodGroupTemplateBuilder(V1beta1PodGroupTemplateFluent<?> fluent) {
    this(fluent, new V1beta1PodGroupTemplate());
  }
  
  public V1beta1PodGroupTemplateBuilder(V1beta1PodGroupTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1PodGroupTemplateBuilder(V1beta1PodGroupTemplateFluent<?> fluent,V1beta1PodGroupTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1PodGroupTemplate build() {
    V1beta1PodGroupTemplate buildable = new V1beta1PodGroupTemplate();
    buildable.setDisruptionMode(fluent.buildDisruptionMode());
    buildable.setName(fluent.getName());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setPriority(fluent.getPriority());
    buildable.setPriorityClassName(fluent.getPriorityClassName());
    buildable.setResourceClaims(fluent.buildResourceClaims());
    buildable.setSchedulingConstraints(fluent.buildSchedulingConstraints());
    buildable.setSchedulingPolicy(fluent.buildSchedulingPolicy());
    return buildable;
  }
  
}