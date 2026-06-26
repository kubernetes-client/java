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
public class V1beta2DeviceAttributeBuilder extends V1beta2DeviceAttributeFluent<V1beta2DeviceAttributeBuilder> implements VisitableBuilder<V1beta2DeviceAttribute,V1beta2DeviceAttributeBuilder>{

  V1beta2DeviceAttributeFluent<?> fluent;

  public V1beta2DeviceAttributeBuilder() {
    this(new V1beta2DeviceAttribute());
  }
  
  public V1beta2DeviceAttributeBuilder(V1beta2DeviceAttributeFluent<?> fluent) {
    this(fluent, new V1beta2DeviceAttribute());
  }
  
  public V1beta2DeviceAttributeBuilder(V1beta2DeviceAttribute instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceAttributeBuilder(V1beta2DeviceAttributeFluent<?> fluent,V1beta2DeviceAttribute instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceAttribute build() {
    V1beta2DeviceAttribute buildable = new V1beta2DeviceAttribute();
    buildable.setBool(fluent.getBool());
    buildable.setBools(fluent.getBools());
    buildable.setInt(fluent.getInt());
    buildable.setInts(fluent.getInts());
    buildable.setString(fluent.getString());
    buildable.setStrings(fluent.getStrings());
    buildable.setVersion(fluent.getVersion());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }
  
}