package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class EventsV1EventBuilder extends EventsV1EventFluentImpl<EventsV1EventBuilder> implements VisitableBuilder<EventsV1Event,EventsV1EventBuilder>{
  public EventsV1EventBuilder() {
    this(false);
  }
  public EventsV1EventBuilder(Boolean validationEnabled) {
    this(new EventsV1Event(), validationEnabled);
  }
  public EventsV1EventBuilder(EventsV1EventFluent<?> fluent) {
    this(fluent, false);
  }
  public EventsV1EventBuilder(EventsV1EventFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new EventsV1Event(), validationEnabled);
  }
  public EventsV1EventBuilder(EventsV1EventFluent<?> fluent,EventsV1Event instance) {
    this(fluent, instance, false);
  }
  public EventsV1EventBuilder(EventsV1EventFluent<?> fluent,EventsV1Event instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAction(instance.getAction());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDeprecatedCount(instance.getDeprecatedCount());

    fluent.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp());

    fluent.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp());

    fluent.withDeprecatedSource(instance.getDeprecatedSource());

    fluent.withEventTime(instance.getEventTime());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withNote(instance.getNote());

    fluent.withReason(instance.getReason());

    fluent.withRegarding(instance.getRegarding());

    fluent.withRelated(instance.getRelated());

    fluent.withReportingController(instance.getReportingController());

    fluent.withReportingInstance(instance.getReportingInstance());

    fluent.withSeries(instance.getSeries());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public EventsV1EventBuilder(EventsV1Event instance) {
    this(instance,false);
  }
  public EventsV1EventBuilder(EventsV1Event instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAction(instance.getAction());

    this.withApiVersion(instance.getApiVersion());

    this.withDeprecatedCount(instance.getDeprecatedCount());

    this.withDeprecatedFirstTimestamp(instance.getDeprecatedFirstTimestamp());

    this.withDeprecatedLastTimestamp(instance.getDeprecatedLastTimestamp());

    this.withDeprecatedSource(instance.getDeprecatedSource());

    this.withEventTime(instance.getEventTime());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withNote(instance.getNote());

    this.withReason(instance.getReason());

    this.withRegarding(instance.getRegarding());

    this.withRelated(instance.getRelated());

    this.withReportingController(instance.getReportingController());

    this.withReportingInstance(instance.getReportingInstance());

    this.withSeries(instance.getSeries());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  EventsV1EventFluent<?> fluent;
  Boolean validationEnabled;
  public EventsV1Event build() {
    EventsV1Event buildable = new EventsV1Event();
    buildable.setAction(fluent.getAction());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeprecatedCount(fluent.getDeprecatedCount());
    buildable.setDeprecatedFirstTimestamp(fluent.getDeprecatedFirstTimestamp());
    buildable.setDeprecatedLastTimestamp(fluent.getDeprecatedLastTimestamp());
    buildable.setDeprecatedSource(fluent.getDeprecatedSource());
    buildable.setEventTime(fluent.getEventTime());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setNote(fluent.getNote());
    buildable.setReason(fluent.getReason());
    buildable.setRegarding(fluent.getRegarding());
    buildable.setRelated(fluent.getRelated());
    buildable.setReportingController(fluent.getReportingController());
    buildable.setReportingInstance(fluent.getReportingInstance());
    buildable.setSeries(fluent.getSeries());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}