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
public class EventsV1EventListBuilder extends EventsV1EventListFluent<EventsV1EventListBuilder> implements VisitableBuilder<EventsV1EventList,EventsV1EventListBuilder>{

  EventsV1EventListFluent<?> fluent;

  public EventsV1EventListBuilder() {
    this(new EventsV1EventList());
  }
  
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent) {
    this(fluent, new EventsV1EventList());
  }
  
  public EventsV1EventListBuilder(EventsV1EventList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent,EventsV1EventList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public EventsV1EventList build() {
    EventsV1EventList buildable = new EventsV1EventList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}