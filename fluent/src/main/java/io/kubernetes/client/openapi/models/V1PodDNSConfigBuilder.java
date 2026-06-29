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
public class V1PodDNSConfigBuilder extends V1PodDNSConfigFluent<V1PodDNSConfigBuilder> implements VisitableBuilder<V1PodDNSConfig,V1PodDNSConfigBuilder>{

  V1PodDNSConfigFluent<?> fluent;

  public V1PodDNSConfigBuilder() {
    this(new V1PodDNSConfig());
  }
  
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent) {
    this(fluent, new V1PodDNSConfig());
  }
  
  public V1PodDNSConfigBuilder(V1PodDNSConfig instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1PodDNSConfigBuilder(V1PodDNSConfigFluent<?> fluent,V1PodDNSConfig instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1PodDNSConfig build() {
    V1PodDNSConfig buildable = new V1PodDNSConfig();
    buildable.setNameservers(fluent.getNameservers());
    buildable.setOptions(fluent.buildOptions());
    buildable.setSearches(fluent.getSearches());
    return buildable;
  }
  
}