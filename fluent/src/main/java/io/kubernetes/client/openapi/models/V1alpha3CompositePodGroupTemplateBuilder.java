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
public class V1alpha3CompositePodGroupTemplateBuilder extends V1alpha3CompositePodGroupTemplateFluent<V1alpha3CompositePodGroupTemplateBuilder> implements VisitableBuilder<V1alpha3CompositePodGroupTemplate,V1alpha3CompositePodGroupTemplateBuilder>{

  V1alpha3CompositePodGroupTemplateFluent<?> fluent;

  public V1alpha3CompositePodGroupTemplateBuilder() {
    this(new V1alpha3CompositePodGroupTemplate());
  }
  
  public V1alpha3CompositePodGroupTemplateBuilder(V1alpha3CompositePodGroupTemplateFluent<?> fluent) {
    this(fluent, new V1alpha3CompositePodGroupTemplate());
  }
  
  public V1alpha3CompositePodGroupTemplateBuilder(V1alpha3CompositePodGroupTemplate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3CompositePodGroupTemplateBuilder(V1alpha3CompositePodGroupTemplateFluent<?> fluent,V1alpha3CompositePodGroupTemplate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3CompositePodGroupTemplate build() {
    V1alpha3CompositePodGroupTemplate buildable = new V1alpha3CompositePodGroupTemplate();
    buildable.setCompositePodGroupTemplates(fluent.buildCompositePodGroupTemplates());
    buildable.setDisruptionMode(fluent.buildDisruptionMode());
    buildable.setName(fluent.getName());
    buildable.setPodGroupTemplates(fluent.buildPodGroupTemplates());
    buildable.setPreemptionPolicy(fluent.getPreemptionPolicy());
    buildable.setPriority(fluent.getPriority());
    buildable.setPriorityClassName(fluent.getPriorityClassName());
    buildable.setSchedulingConstraints(fluent.buildSchedulingConstraints());
    buildable.setSchedulingPolicy(fluent.buildSchedulingPolicy());
    return buildable;
  }
  
}