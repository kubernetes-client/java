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
public class V1alpha3DeviceTaintBuilder extends V1alpha3DeviceTaintFluent<V1alpha3DeviceTaintBuilder> implements VisitableBuilder<V1alpha3DeviceTaint,V1alpha3DeviceTaintBuilder>{

  V1alpha3DeviceTaintFluent<?> fluent;

  public V1alpha3DeviceTaintBuilder() {
    this(new V1alpha3DeviceTaint());
  }
  
  public V1alpha3DeviceTaintBuilder(V1alpha3DeviceTaintFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceTaint());
  }
  
  public V1alpha3DeviceTaintBuilder(V1alpha3DeviceTaint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3DeviceTaintBuilder(V1alpha3DeviceTaintFluent<?> fluent,V1alpha3DeviceTaint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3DeviceTaint build() {
    V1alpha3DeviceTaint buildable = new V1alpha3DeviceTaint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}