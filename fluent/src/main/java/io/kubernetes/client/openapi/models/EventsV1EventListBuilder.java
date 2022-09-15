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

public class EventsV1EventListBuilder extends EventsV1EventListFluentImpl<EventsV1EventListBuilder>
    implements VisitableBuilder<EventsV1EventList, EventsV1EventListBuilder> {
  public EventsV1EventListBuilder() {
    this(false);
  }

  public EventsV1EventListBuilder(Boolean validationEnabled) {
    this(new EventsV1EventList(), validationEnabled);
  }

  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent) {
    this(fluent, false);
  }

  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new EventsV1EventList(), validationEnabled);
  }

  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent, EventsV1EventList instance) {
    this(fluent, instance, false);
  }

  public EventsV1EventListBuilder(
      EventsV1EventListFluent<?> fluent, EventsV1EventList instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public EventsV1EventListBuilder(EventsV1EventList instance) {
    this(instance, false);
  }

  public EventsV1EventListBuilder(EventsV1EventList instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  EventsV1EventListFluent<?> fluent;
  Boolean validationEnabled;

  public EventsV1EventList build() {
    EventsV1EventList buildable = new EventsV1EventList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
