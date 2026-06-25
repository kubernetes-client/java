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
public class V1SleepActionBuilder extends V1SleepActionFluent<V1SleepActionBuilder> implements VisitableBuilder<V1SleepAction,V1SleepActionBuilder>{

  V1SleepActionFluent<?> fluent;

  public V1SleepActionBuilder() {
    this(new V1SleepAction());
  }
  
  public V1SleepActionBuilder(V1SleepActionFluent<?> fluent) {
    this(fluent, new V1SleepAction());
  }
  
  public V1SleepActionBuilder(V1SleepAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1SleepActionBuilder(V1SleepActionFluent<?> fluent,V1SleepAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1SleepAction build() {
    V1SleepAction buildable = new V1SleepAction();
    buildable.setSeconds(fluent.getSeconds());
    return buildable;
  }
  
}