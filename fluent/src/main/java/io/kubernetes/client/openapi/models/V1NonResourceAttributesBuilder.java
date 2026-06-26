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
public class V1NonResourceAttributesBuilder extends V1NonResourceAttributesFluent<V1NonResourceAttributesBuilder> implements VisitableBuilder<V1NonResourceAttributes,V1NonResourceAttributesBuilder>{

  V1NonResourceAttributesFluent<?> fluent;

  public V1NonResourceAttributesBuilder() {
    this(new V1NonResourceAttributes());
  }
  
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent) {
    this(fluent, new V1NonResourceAttributes());
  }
  
  public V1NonResourceAttributesBuilder(V1NonResourceAttributes instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1NonResourceAttributesBuilder(V1NonResourceAttributesFluent<?> fluent,V1NonResourceAttributes instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1NonResourceAttributes build() {
    V1NonResourceAttributes buildable = new V1NonResourceAttributes();
    buildable.setPath(fluent.getPath());
    buildable.setVerb(fluent.getVerb());
    return buildable;
  }
  
}