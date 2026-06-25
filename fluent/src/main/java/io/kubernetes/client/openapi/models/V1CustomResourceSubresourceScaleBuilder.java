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
public class V1CustomResourceSubresourceScaleBuilder extends V1CustomResourceSubresourceScaleFluent<V1CustomResourceSubresourceScaleBuilder> implements VisitableBuilder<V1CustomResourceSubresourceScale,V1CustomResourceSubresourceScaleBuilder>{

  V1CustomResourceSubresourceScaleFluent<?> fluent;

  public V1CustomResourceSubresourceScaleBuilder() {
    this(new V1CustomResourceSubresourceScale());
  }
  
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent) {
    this(fluent, new V1CustomResourceSubresourceScale());
  }
  
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScale instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceSubresourceScaleBuilder(V1CustomResourceSubresourceScaleFluent<?> fluent,V1CustomResourceSubresourceScale instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceSubresourceScale build() {
    V1CustomResourceSubresourceScale buildable = new V1CustomResourceSubresourceScale();
    buildable.setLabelSelectorPath(fluent.getLabelSelectorPath());
    buildable.setSpecReplicasPath(fluent.getSpecReplicasPath());
    buildable.setStatusReplicasPath(fluent.getStatusReplicasPath());
    return buildable;
  }
  
}