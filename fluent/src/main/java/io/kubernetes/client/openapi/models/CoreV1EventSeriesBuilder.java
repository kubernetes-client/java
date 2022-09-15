/*
Copyright 2022 The Kubernetes Authors.
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

public class CoreV1EventSeriesBuilder extends CoreV1EventSeriesFluentImpl<CoreV1EventSeriesBuilder>
    implements VisitableBuilder<CoreV1EventSeries, CoreV1EventSeriesBuilder> {
  public CoreV1EventSeriesBuilder() {
    this(false);
  }

  public CoreV1EventSeriesBuilder(Boolean validationEnabled) {
    this(new CoreV1EventSeries(), validationEnabled);
  }

  public CoreV1EventSeriesBuilder(CoreV1EventSeriesFluent<?> fluent) {
    this(fluent, false);
  }

  public CoreV1EventSeriesBuilder(CoreV1EventSeriesFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new CoreV1EventSeries(), validationEnabled);
  }

  public CoreV1EventSeriesBuilder(CoreV1EventSeriesFluent<?> fluent, CoreV1EventSeries instance) {
    this(fluent, instance, false);
  }

  public CoreV1EventSeriesBuilder(
      CoreV1EventSeriesFluent<?> fluent, CoreV1EventSeries instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCount(instance.getCount());

    fluent.withLastObservedTime(instance.getLastObservedTime());

    this.validationEnabled = validationEnabled;
  }

  public CoreV1EventSeriesBuilder(CoreV1EventSeries instance) {
    this(instance, false);
  }

  public CoreV1EventSeriesBuilder(CoreV1EventSeries instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCount(instance.getCount());

    this.withLastObservedTime(instance.getLastObservedTime());

    this.validationEnabled = validationEnabled;
  }

  CoreV1EventSeriesFluent<?> fluent;
  Boolean validationEnabled;

  public CoreV1EventSeries build() {
    CoreV1EventSeries buildable = new CoreV1EventSeries();
    buildable.setCount(fluent.getCount());
    buildable.setLastObservedTime(fluent.getLastObservedTime());
    return buildable;
  }
}
