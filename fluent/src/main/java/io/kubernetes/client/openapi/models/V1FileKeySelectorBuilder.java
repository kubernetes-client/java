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
public class V1FileKeySelectorBuilder extends V1FileKeySelectorFluent<V1FileKeySelectorBuilder> implements VisitableBuilder<V1FileKeySelector,V1FileKeySelectorBuilder>{

  V1FileKeySelectorFluent<?> fluent;

  public V1FileKeySelectorBuilder() {
    this(new V1FileKeySelector());
  }
  
  public V1FileKeySelectorBuilder(V1FileKeySelectorFluent<?> fluent) {
    this(fluent, new V1FileKeySelector());
  }
  
  public V1FileKeySelectorBuilder(V1FileKeySelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FileKeySelectorBuilder(V1FileKeySelectorFluent<?> fluent,V1FileKeySelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FileKeySelector build() {
    V1FileKeySelector buildable = new V1FileKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setOptional(fluent.getOptional());
    buildable.setPath(fluent.getPath());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  
}