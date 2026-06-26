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
public class V1TCPSocketActionBuilder extends V1TCPSocketActionFluent<V1TCPSocketActionBuilder> implements VisitableBuilder<V1TCPSocketAction,V1TCPSocketActionBuilder>{

  V1TCPSocketActionFluent<?> fluent;

  public V1TCPSocketActionBuilder() {
    this(new V1TCPSocketAction());
  }
  
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent) {
    this(fluent, new V1TCPSocketAction());
  }
  
  public V1TCPSocketActionBuilder(V1TCPSocketAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent,V1TCPSocketAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1TCPSocketAction build() {
    V1TCPSocketAction buildable = new V1TCPSocketAction();
    buildable.setHost(fluent.getHost());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  
}