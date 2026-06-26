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
public class V1AppArmorProfileBuilder extends V1AppArmorProfileFluent<V1AppArmorProfileBuilder> implements VisitableBuilder<V1AppArmorProfile,V1AppArmorProfileBuilder>{

  V1AppArmorProfileFluent<?> fluent;

  public V1AppArmorProfileBuilder() {
    this(new V1AppArmorProfile());
  }
  
  public V1AppArmorProfileBuilder(V1AppArmorProfileFluent<?> fluent) {
    this(fluent, new V1AppArmorProfile());
  }
  
  public V1AppArmorProfileBuilder(V1AppArmorProfile instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1AppArmorProfileBuilder(V1AppArmorProfileFluent<?> fluent,V1AppArmorProfile instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1AppArmorProfile build() {
    V1AppArmorProfile buildable = new V1AppArmorProfile();
    buildable.setLocalhostProfile(fluent.getLocalhostProfile());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}