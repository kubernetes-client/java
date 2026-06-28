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
public class V1ContainerExtendedResourceRequestBuilder extends V1ContainerExtendedResourceRequestFluent<V1ContainerExtendedResourceRequestBuilder> implements VisitableBuilder<V1ContainerExtendedResourceRequest,V1ContainerExtendedResourceRequestBuilder>{

  V1ContainerExtendedResourceRequestFluent<?> fluent;

  public V1ContainerExtendedResourceRequestBuilder() {
    this(new V1ContainerExtendedResourceRequest());
  }
  
  public V1ContainerExtendedResourceRequestBuilder(V1ContainerExtendedResourceRequestFluent<?> fluent) {
    this(fluent, new V1ContainerExtendedResourceRequest());
  }
  
  public V1ContainerExtendedResourceRequestBuilder(V1ContainerExtendedResourceRequest instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ContainerExtendedResourceRequestBuilder(V1ContainerExtendedResourceRequestFluent<?> fluent,V1ContainerExtendedResourceRequest instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ContainerExtendedResourceRequest build() {
    V1ContainerExtendedResourceRequest buildable = new V1ContainerExtendedResourceRequest();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setRequestName(fluent.getRequestName());
    buildable.setResourceName(fluent.getResourceName());
    return buildable;
  }
  
}