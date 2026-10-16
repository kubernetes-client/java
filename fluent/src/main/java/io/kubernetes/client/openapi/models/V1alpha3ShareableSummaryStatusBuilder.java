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
public class V1alpha3ShareableSummaryStatusBuilder extends V1alpha3ShareableSummaryStatusFluent<V1alpha3ShareableSummaryStatusBuilder> implements VisitableBuilder<V1alpha3ShareableSummaryStatus,V1alpha3ShareableSummaryStatusBuilder>{

  V1alpha3ShareableSummaryStatusFluent<?> fluent;

  public V1alpha3ShareableSummaryStatusBuilder() {
    this(new V1alpha3ShareableSummaryStatus());
  }
  
  public V1alpha3ShareableSummaryStatusBuilder(V1alpha3ShareableSummaryStatusFluent<?> fluent) {
    this(fluent, new V1alpha3ShareableSummaryStatus());
  }
  
  public V1alpha3ShareableSummaryStatusBuilder(V1alpha3ShareableSummaryStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha3ShareableSummaryStatusBuilder(V1alpha3ShareableSummaryStatusFluent<?> fluent,V1alpha3ShareableSummaryStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha3ShareableSummaryStatus build() {
    V1alpha3ShareableSummaryStatus buildable = new V1alpha3ShareableSummaryStatus();
    buildable.setCapacity(fluent.buildCapacity());
    buildable.setFullyAvailableDevices(fluent.getFullyAvailableDevices());
    buildable.setPartiallyAvailableDevices(fluent.getPartiallyAvailableDevices());
    return buildable;
  }
  
}