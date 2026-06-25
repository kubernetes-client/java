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
public class V1PodTemplateSpecBuilder extends V1PodTemplateSpecFluent<V1PodTemplateSpecBuilder> implements VisitableBuilder<V1PodTemplateSpec,V1PodTemplateSpecBuilder>{

  V1PodTemplateSpecFluent<?> fluent;

  public V1PodTemplateSpecBuilder() {
    this(new V1PodTemplateSpec());
  }
  
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent) {
    this(fluent, new V1PodTemplateSpec());
  }
  
  public V1PodTemplateSpecBuilder(V1PodTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent,V1PodTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodTemplateSpec build() {
    V1PodTemplateSpec buildable = new V1PodTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}