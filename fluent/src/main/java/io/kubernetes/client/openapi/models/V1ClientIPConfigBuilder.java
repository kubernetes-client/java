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
public class V1ClientIPConfigBuilder extends V1ClientIPConfigFluent<V1ClientIPConfigBuilder> implements VisitableBuilder<V1ClientIPConfig,V1ClientIPConfigBuilder>{

  V1ClientIPConfigFluent<?> fluent;

  public V1ClientIPConfigBuilder() {
    this(new V1ClientIPConfig());
  }
  
  public V1ClientIPConfigBuilder(V1ClientIPConfigFluent<?> fluent) {
    this(fluent, new V1ClientIPConfig());
  }
  
  public V1ClientIPConfigBuilder(V1ClientIPConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ClientIPConfigBuilder(V1ClientIPConfigFluent<?> fluent,V1ClientIPConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ClientIPConfig build() {
    V1ClientIPConfig buildable = new V1ClientIPConfig();
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
  
}