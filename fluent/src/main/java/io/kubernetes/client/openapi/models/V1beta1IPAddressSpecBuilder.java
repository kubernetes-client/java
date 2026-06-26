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
public class V1beta1IPAddressSpecBuilder extends V1beta1IPAddressSpecFluent<V1beta1IPAddressSpecBuilder> implements VisitableBuilder<V1beta1IPAddressSpec,V1beta1IPAddressSpecBuilder>{

  V1beta1IPAddressSpecFluent<?> fluent;

  public V1beta1IPAddressSpecBuilder() {
    this(new V1beta1IPAddressSpec());
  }
  
  public V1beta1IPAddressSpecBuilder(V1beta1IPAddressSpecFluent<?> fluent) {
    this(fluent, new V1beta1IPAddressSpec());
  }
  
  public V1beta1IPAddressSpecBuilder(V1beta1IPAddressSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1IPAddressSpecBuilder(V1beta1IPAddressSpecFluent<?> fluent,V1beta1IPAddressSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1IPAddressSpec build() {
    V1beta1IPAddressSpec buildable = new V1beta1IPAddressSpec();
    buildable.setParentRef(fluent.buildParentRef());
    return buildable;
  }
  
}