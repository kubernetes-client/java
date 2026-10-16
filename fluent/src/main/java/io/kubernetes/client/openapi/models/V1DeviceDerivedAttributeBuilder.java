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
import javax.annotation.processing.Generated;
@Generated("io.sundr:builder-annotations")
public class V1DeviceDerivedAttributeBuilder extends V1DeviceDerivedAttributeFluent<V1DeviceDerivedAttributeBuilder> implements VisitableBuilder<V1DeviceDerivedAttribute,V1DeviceDerivedAttributeBuilder>{

  V1DeviceDerivedAttributeFluent<?> fluent;

  public V1DeviceDerivedAttributeBuilder() {
    this(new V1DeviceDerivedAttribute());
  }
  
  public V1DeviceDerivedAttributeBuilder(V1DeviceDerivedAttributeFluent<?> fluent) {
    this(fluent, new V1DeviceDerivedAttribute());
  }
  
  public V1DeviceDerivedAttributeBuilder(V1DeviceDerivedAttribute instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceDerivedAttributeBuilder(V1DeviceDerivedAttributeFluent<?> fluent,V1DeviceDerivedAttribute instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceDerivedAttribute build() {
    V1DeviceDerivedAttribute buildable = new V1DeviceDerivedAttribute();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}