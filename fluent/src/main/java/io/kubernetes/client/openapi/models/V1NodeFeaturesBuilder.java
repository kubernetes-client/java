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
public class V1NodeFeaturesBuilder extends V1NodeFeaturesFluent<V1NodeFeaturesBuilder> implements VisitableBuilder<V1NodeFeatures,V1NodeFeaturesBuilder>{

  V1NodeFeaturesFluent<?> fluent;

  public V1NodeFeaturesBuilder() {
    this(new V1NodeFeatures());
  }
  
  public V1NodeFeaturesBuilder(V1NodeFeaturesFluent<?> fluent) {
    this(fluent, new V1NodeFeatures());
  }
  
  public V1NodeFeaturesBuilder(V1NodeFeatures instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NodeFeaturesBuilder(V1NodeFeaturesFluent<?> fluent,V1NodeFeatures instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NodeFeatures build() {
    V1NodeFeatures buildable = new V1NodeFeatures();
    buildable.setSupplementalGroupsPolicy(fluent.getSupplementalGroupsPolicy());
    return buildable;
  }
  
}