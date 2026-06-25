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
public class V1HTTPGetActionBuilder extends V1HTTPGetActionFluent<V1HTTPGetActionBuilder> implements VisitableBuilder<V1HTTPGetAction,V1HTTPGetActionBuilder>{

  V1HTTPGetActionFluent<?> fluent;

  public V1HTTPGetActionBuilder() {
    this(new V1HTTPGetAction());
  }
  
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent) {
    this(fluent, new V1HTTPGetAction());
  }
  
  public V1HTTPGetActionBuilder(V1HTTPGetAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1HTTPGetActionBuilder(V1HTTPGetActionFluent<?> fluent,V1HTTPGetAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1HTTPGetAction build() {
    V1HTTPGetAction buildable = new V1HTTPGetAction();
    buildable.setHost(fluent.getHost());
    buildable.setHttpHeaders(fluent.buildHttpHeaders());
    buildable.setPath(fluent.getPath());
    buildable.setPort(fluent.getPort());
    buildable.setScheme(fluent.getScheme());
    return buildable;
  }
  
}