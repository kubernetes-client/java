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
public class V1CustomResourceValidationBuilder extends V1CustomResourceValidationFluent<V1CustomResourceValidationBuilder> implements VisitableBuilder<V1CustomResourceValidation,V1CustomResourceValidationBuilder>{

  V1CustomResourceValidationFluent<?> fluent;

  public V1CustomResourceValidationBuilder() {
    this(new V1CustomResourceValidation());
  }
  
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent) {
    this(fluent, new V1CustomResourceValidation());
  }
  
  public V1CustomResourceValidationBuilder(V1CustomResourceValidation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CustomResourceValidationBuilder(V1CustomResourceValidationFluent<?> fluent,V1CustomResourceValidation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CustomResourceValidation build() {
    V1CustomResourceValidation buildable = new V1CustomResourceValidation();
    buildable.setOpenAPIV3Schema(fluent.buildOpenAPIV3Schema());
    return buildable;
  }
  
}