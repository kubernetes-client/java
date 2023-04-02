package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class EventsV1EventSeriesBuilder extends EventsV1EventSeriesFluentImpl<EventsV1EventSeriesBuilder> implements VisitableBuilder<EventsV1EventSeries,EventsV1EventSeriesBuilder>{
  public EventsV1EventSeriesBuilder() {
    this(false);
  }
  public EventsV1EventSeriesBuilder(Boolean validationEnabled) {
    this(new EventsV1EventSeries(), validationEnabled);
  }
  public EventsV1EventSeriesBuilder(EventsV1EventSeriesFluent<?> fluent) {
    this(fluent, false);
  }
  public EventsV1EventSeriesBuilder(EventsV1EventSeriesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new EventsV1EventSeries(), validationEnabled);
  }
  public EventsV1EventSeriesBuilder(EventsV1EventSeriesFluent<?> fluent,EventsV1EventSeries instance) {
    this(fluent, instance, false);
  }
  public EventsV1EventSeriesBuilder(EventsV1EventSeriesFluent<?> fluent,EventsV1EventSeries instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCount(instance.getCount());

    fluent.withLastObservedTime(instance.getLastObservedTime());

    this.validationEnabled = validationEnabled; 
  }
  public EventsV1EventSeriesBuilder(EventsV1EventSeries instance) {
    this(instance,false);
  }
  public EventsV1EventSeriesBuilder(EventsV1EventSeries instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCount(instance.getCount());

    this.withLastObservedTime(instance.getLastObservedTime());

    this.validationEnabled = validationEnabled; 
  }
  EventsV1EventSeriesFluent<?> fluent;
  Boolean validationEnabled;
  public EventsV1EventSeries build() {
    EventsV1EventSeries buildable = new EventsV1EventSeries();
    buildable.setCount(fluent.getCount());
    buildable.setLastObservedTime(fluent.getLastObservedTime());
    return buildable;
  }
  
}