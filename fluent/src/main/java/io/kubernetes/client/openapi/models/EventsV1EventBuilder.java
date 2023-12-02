package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class EventsV1EventBuilder extends EventsV1EventFluent<EventsV1EventBuilder> implements VisitableBuilder<EventsV1Event,EventsV1EventBuilder>{
  public EventsV1EventBuilder() {
    this(new EventsV1Event());
  }
  
  public EventsV1EventBuilder(EventsV1EventFluent<?> fluent) {
    this(fluent, new EventsV1Event());
  }
  
  public EventsV1EventBuilder(EventsV1EventFluent<?> fluent,EventsV1Event instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EventsV1EventBuilder(EventsV1Event instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EventsV1EventFluent<?> fluent;
  
  public EventsV1Event build() {
    EventsV1Event buildable = new EventsV1Event();
    buildable.setAction(fluent.getAction());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeprecatedCount(fluent.getDeprecatedCount());
    buildable.setDeprecatedFirstTimestamp(fluent.getDeprecatedFirstTimestamp());
    buildable.setDeprecatedLastTimestamp(fluent.getDeprecatedLastTimestamp());
    buildable.setDeprecatedSource(fluent.buildDeprecatedSource());
    buildable.setEventTime(fluent.getEventTime());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setNote(fluent.getNote());
    buildable.setReason(fluent.getReason());
    buildable.setRegarding(fluent.buildRegarding());
    buildable.setRelated(fluent.buildRelated());
    buildable.setReportingController(fluent.getReportingController());
    buildable.setReportingInstance(fluent.getReportingInstance());
    buildable.setSeries(fluent.buildSeries());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}