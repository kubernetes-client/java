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

public class EventsV1EventSeriesBuilder
    extends EventsV1EventSeriesFluentImpl<EventsV1EventSeriesBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.EventsV1EventSeries, EventsV1EventSeriesBuilder> {
  public EventsV1EventSeriesBuilder() {
    this(false);
  }

  public EventsV1EventSeriesBuilder(Boolean validationEnabled) {
    this(new EventsV1EventSeries(), validationEnabled);
  }

  public EventsV1EventSeriesBuilder(
      io.kubernetes.client.openapi.models.EventsV1EventSeriesFluent<?> fluent) {
    this(fluent, false);
  }

  public EventsV1EventSeriesBuilder(
      io.kubernetes.client.openapi.models.EventsV1EventSeriesFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new EventsV1EventSeries(), validationEnabled);
  }

  public EventsV1EventSeriesBuilder(
      io.kubernetes.client.openapi.models.EventsV1EventSeriesFluent<?> fluent,
      io.kubernetes.client.openapi.models.EventsV1EventSeries instance) {
    this(fluent, instance, false);
  }

  public EventsV1EventSeriesBuilder(
      io.kubernetes.client.openapi.models.EventsV1EventSeriesFluent<?> fluent,
      io.kubernetes.client.openapi.models.EventsV1EventSeries instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCount(instance.getCount());

    fluent.withLastObservedTime(instance.getLastObservedTime());

    this.validationEnabled = validationEnabled;
  }

  public EventsV1EventSeriesBuilder(
      io.kubernetes.client.openapi.models.EventsV1EventSeries instance) {
    this(instance, false);
  }

  public EventsV1EventSeriesBuilder(
      io.kubernetes.client.openapi.models.EventsV1EventSeries instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withCount(instance.getCount());

    this.withLastObservedTime(instance.getLastObservedTime());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.EventsV1EventSeriesFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.EventsV1EventSeries build() {
    EventsV1EventSeries buildable = new EventsV1EventSeries();
    buildable.setCount(fluent.getCount());
    buildable.setLastObservedTime(fluent.getLastObservedTime());
    return buildable;
  }
}
