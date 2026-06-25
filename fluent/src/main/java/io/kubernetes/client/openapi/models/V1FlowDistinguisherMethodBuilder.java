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
public class V1FlowDistinguisherMethodBuilder extends V1FlowDistinguisherMethodFluent<V1FlowDistinguisherMethodBuilder> implements VisitableBuilder<V1FlowDistinguisherMethod,V1FlowDistinguisherMethodBuilder>{

  V1FlowDistinguisherMethodFluent<?> fluent;

  public V1FlowDistinguisherMethodBuilder() {
    this(new V1FlowDistinguisherMethod());
  }
  
  public V1FlowDistinguisherMethodBuilder(V1FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, new V1FlowDistinguisherMethod());
  }
  
  public V1FlowDistinguisherMethodBuilder(V1FlowDistinguisherMethod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1FlowDistinguisherMethodBuilder(V1FlowDistinguisherMethodFluent<?> fluent,V1FlowDistinguisherMethod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1FlowDistinguisherMethod build() {
    V1FlowDistinguisherMethod buildable = new V1FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}