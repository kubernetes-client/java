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
public class V1PodOSBuilder extends V1PodOSFluent<V1PodOSBuilder> implements VisitableBuilder<V1PodOS,V1PodOSBuilder>{

  V1PodOSFluent<?> fluent;

  public V1PodOSBuilder() {
    this(new V1PodOS());
  }
  
  public V1PodOSBuilder(V1PodOSFluent<?> fluent) {
    this(fluent, new V1PodOS());
  }
  
  public V1PodOSBuilder(V1PodOS instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodOSBuilder(V1PodOSFluent<?> fluent,V1PodOS instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodOS build() {
    V1PodOS buildable = new V1PodOS();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}