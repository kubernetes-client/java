package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class EventsV1EventSeriesBuilder extends EventsV1EventSeriesFluent<EventsV1EventSeriesBuilder> implements VisitableBuilder<EventsV1EventSeries,EventsV1EventSeriesBuilder>{
  public EventsV1EventSeriesBuilder() {
    this(new EventsV1EventSeries());
  }
  
  public EventsV1EventSeriesBuilder(EventsV1EventSeriesFluent<?> fluent) {
    this(fluent, new EventsV1EventSeries());
  }
  
  public EventsV1EventSeriesBuilder(EventsV1EventSeriesFluent<?> fluent,EventsV1EventSeries instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public EventsV1EventSeriesBuilder(EventsV1EventSeries instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  EventsV1EventSeriesFluent<?> fluent;
  
  public EventsV1EventSeries build() {
    EventsV1EventSeries buildable = new EventsV1EventSeries();
    buildable.setCount(fluent.getCount());
    buildable.setLastObservedTime(fluent.getLastObservedTime());
    return buildable;
  }
  

}