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
public class V1alpha1MatchResourcesBuilder extends V1alpha1MatchResourcesFluent<V1alpha1MatchResourcesBuilder> implements VisitableBuilder<V1alpha1MatchResources,V1alpha1MatchResourcesBuilder>{

  V1alpha1MatchResourcesFluent<?> fluent;

  public V1alpha1MatchResourcesBuilder() {
    this(new V1alpha1MatchResources());
  }
  
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent) {
    this(fluent, new V1alpha1MatchResources());
  }
  
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResources instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1MatchResourcesBuilder(V1alpha1MatchResourcesFluent<?> fluent,V1alpha1MatchResources instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1MatchResources build() {
    V1alpha1MatchResources buildable = new V1alpha1MatchResources();
    buildable.setExcludeResourceRules(fluent.buildExcludeResourceRules());
    buildable.setMatchPolicy(fluent.getMatchPolicy());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setObjectSelector(fluent.buildObjectSelector());
    buildable.setResourceRules(fluent.buildResourceRules());
    return buildable;
  }
  
}