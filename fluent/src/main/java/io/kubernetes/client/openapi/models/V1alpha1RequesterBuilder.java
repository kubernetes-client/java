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
public class V1alpha1RequesterBuilder extends V1alpha1RequesterFluent<V1alpha1RequesterBuilder> implements VisitableBuilder<V1alpha1Requester,V1alpha1RequesterBuilder>{

  V1alpha1RequesterFluent<?> fluent;

  public V1alpha1RequesterBuilder() {
    this(new V1alpha1Requester());
  }
  
  public V1alpha1RequesterBuilder(V1alpha1RequesterFluent<?> fluent) {
    this(fluent, new V1alpha1Requester());
  }
  
  public V1alpha1RequesterBuilder(V1alpha1Requester instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1RequesterBuilder(V1alpha1RequesterFluent<?> fluent,V1alpha1Requester instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1Requester build() {
    V1alpha1Requester buildable = new V1alpha1Requester();
    buildable.setIntent(fluent.getIntent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}