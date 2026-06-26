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
public class DiscoveryV1EndpointPortBuilder extends DiscoveryV1EndpointPortFluent<DiscoveryV1EndpointPortBuilder> implements VisitableBuilder<DiscoveryV1EndpointPort,DiscoveryV1EndpointPortBuilder>{

  DiscoveryV1EndpointPortFluent<?> fluent;

  public DiscoveryV1EndpointPortBuilder() {
    this(new DiscoveryV1EndpointPort());
  }
  
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent) {
    this(fluent, new DiscoveryV1EndpointPort());
  }
  
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public DiscoveryV1EndpointPortBuilder(DiscoveryV1EndpointPortFluent<?> fluent,DiscoveryV1EndpointPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public DiscoveryV1EndpointPort build() {
    DiscoveryV1EndpointPort buildable = new DiscoveryV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  
}