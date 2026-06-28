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
public class V1alpha2PodGroupTemplateReferenceBuilder extends V1alpha2PodGroupTemplateReferenceFluent<V1alpha2PodGroupTemplateReferenceBuilder> implements VisitableBuilder<V1alpha2PodGroupTemplateReference,V1alpha2PodGroupTemplateReferenceBuilder>{

  V1alpha2PodGroupTemplateReferenceFluent<?> fluent;

  public V1alpha2PodGroupTemplateReferenceBuilder() {
    this(new V1alpha2PodGroupTemplateReference());
  }
  
  public V1alpha2PodGroupTemplateReferenceBuilder(V1alpha2PodGroupTemplateReferenceFluent<?> fluent) {
    this(fluent, new V1alpha2PodGroupTemplateReference());
  }
  
  public V1alpha2PodGroupTemplateReferenceBuilder(V1alpha2PodGroupTemplateReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha2PodGroupTemplateReferenceBuilder(V1alpha2PodGroupTemplateReferenceFluent<?> fluent,V1alpha2PodGroupTemplateReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha2PodGroupTemplateReference build() {
    V1alpha2PodGroupTemplateReference buildable = new V1alpha2PodGroupTemplateReference();
    buildable.setWorkload(fluent.buildWorkload());
    return buildable;
  }
  
}