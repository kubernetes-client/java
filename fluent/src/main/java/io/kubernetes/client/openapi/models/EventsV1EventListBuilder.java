package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class EventsV1EventListBuilder extends EventsV1EventListFluentImpl<EventsV1EventListBuilder> implements VisitableBuilder<EventsV1EventList,EventsV1EventListBuilder>{
  public EventsV1EventListBuilder() {
    this(false);
  }
  public EventsV1EventListBuilder(Boolean validationEnabled) {
    this(new EventsV1EventList(), validationEnabled);
  }
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent) {
    this(fluent, false);
  }
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new EventsV1EventList(), validationEnabled);
  }
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent,EventsV1EventList instance) {
    this(fluent, instance, false);
  }
  public EventsV1EventListBuilder(EventsV1EventListFluent<?> fluent,EventsV1EventList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public EventsV1EventListBuilder(EventsV1EventList instance) {
    this(instance,false);
  }
  public EventsV1EventListBuilder(EventsV1EventList instance,Boolean validationEnabled) {
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