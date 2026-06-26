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
public class V1HTTPIngressPathBuilder extends V1HTTPIngressPathFluent<V1HTTPIngressPathBuilder> implements VisitableBuilder<V1HTTPIngressPath,V1HTTPIngressPathBuilder>{

  V1HTTPIngressPathFluent<?> fluent;

  public V1HTTPIngressPathBuilder() {
    this(new V1HTTPIngressPath());
  }
  
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent) {
    this(fluent, new V1HTTPIngressPath());
  }
  
  public V1HTTPIngressPathBuilder(V1HTTPIngressPath instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HTTPIngressPathBuilder(V1HTTPIngressPathFluent<?> fluent,V1HTTPIngressPath instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HTTPIngressPath build() {
    V1HTTPIngressPath buildable = new V1HTTPIngressPath();
    buildable.setBackend(fluent.buildBackend());
    buildable.setPath(fluent.getPath());
    buildable.setPathType(fluent.getPathType());
    return buildable;
  }
  
}