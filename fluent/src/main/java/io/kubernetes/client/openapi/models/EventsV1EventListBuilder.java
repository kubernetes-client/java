package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class EventsV1EventListBuilder extends EventsV1EventListFluent<EventsV1EventListBuilder> implements VisitableBuilder<EventsV1EventList,EventsV1EventListBuilder>{
  public EventsV1EventListBuilder() {
    this(new EventsV1EventList());
  }
  
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent) {
    this(fluent, new EventsV1EventList());
  }
  
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent,EventsV1EventList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EventsV1EventListBuilder(EventsV1EventList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EventsV1EventListFluent<?> fluent;
  
  public EventsV1EventList build() {
    EventsV1EventList buildable = new EventsV1EventList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}