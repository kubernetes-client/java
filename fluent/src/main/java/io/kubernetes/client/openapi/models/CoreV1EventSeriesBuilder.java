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
public class CoreV1EventSeriesBuilder extends CoreV1EventSeriesFluent<CoreV1EventSeriesBuilder> implements VisitableBuilder<CoreV1EventSeries,CoreV1EventSeriesBuilder>{

  CoreV1EventSeriesFluent<?> fluent;

  public CoreV1EventSeriesBuilder() {
    this(new CoreV1EventSeries());
  }
  
  public CoreV1EventSeriesBuilder(CoreV1EventSeriesFluent<?> fluent) {
    this(fluent, new CoreV1EventSeries());
  }
  
  public CoreV1EventSeriesBuilder(CoreV1EventSeries instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public CoreV1EventSeriesBuilder(CoreV1EventSeriesFluent<?> fluent,CoreV1EventSeries instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public CoreV1EventSeries build() {
    CoreV1EventSeries buildable = new CoreV1EventSeries();
    buildable.setCount(fluent.getCount());
    buildable.setLastObservedTime(fluent.getLastObservedTime());
    return buildable;
  }
  
}