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
public class V1alpha2WorkloadPodGroupTemplateReferenceBuilder extends V1alpha2WorkloadPodGroupTemplateReferenceFluent<V1alpha2WorkloadPodGroupTemplateReferenceBuilder> implements VisitableBuilder<V1alpha2WorkloadPodGroupTemplateReference,V1alpha2WorkloadPodGroupTemplateReferenceBuilder>{

  V1alpha2WorkloadPodGroupTemplateReferenceFluent<?> fluent;

  public V1alpha2WorkloadPodGroupTemplateReferenceBuilder() {
    this(new V1alpha2WorkloadPodGroupTemplateReference());
  }
  
  public V1alpha2WorkloadPodGroupTemplateReferenceBuilder(V1alpha2WorkloadPodGroupTemplateReferenceFluent<?> fluent) {
    this(fluent, new V1alpha2WorkloadPodGroupTemplateReference());
  }
  
  public V1alpha2WorkloadPodGroupTemplateReferenceBuilder(V1alpha2WorkloadPodGroupTemplateReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2WorkloadPodGroupTemplateReferenceBuilder(V1alpha2WorkloadPodGroupTemplateReferenceFluent<?> fluent,V1alpha2WorkloadPodGroupTemplateReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2WorkloadPodGroupTemplateReference build() {
    V1alpha2WorkloadPodGroupTemplateReference buildable = new V1alpha2WorkloadPodGroupTemplateReference();
    buildable.setPodGroupTemplateName(fluent.getPodGroupTemplateName());
    buildable.setWorkloadName(fluent.getWorkloadName());
    return buildable;
  }
  
}