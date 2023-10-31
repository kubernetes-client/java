package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class CoreV1EventBuilder extends CoreV1EventFluent<CoreV1EventBuilder> implements VisitableBuilder<CoreV1Event,CoreV1EventBuilder>{
  public CoreV1EventBuilder() {
    this(new CoreV1Event());
  }
  
  public CoreV1EventBuilder(CoreV1EventFluent<?> fluent) {
    this(fluent, new CoreV1Event());
  }
  
  public CoreV1EventBuilder(CoreV1EventFluent<?> fluent,CoreV1Event instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CoreV1EventBuilder(CoreV1Event instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CoreV1EventFluent<?> fluent;
  
  public CoreV1Event build() {
    CoreV1Event buildable = new CoreV1Event();
    buildable.setAction(fluent.getAction());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCount(fluent.getCount());
    buildable.setEventTime(fluent.getEventTime());
    buildable.setFirstTimestamp(fluent.getFirstTimestamp());
    buildable.setInvolvedObject(fluent.buildInvolvedObject());
    buildable.setKind(fluent.getKind());
    buildable.setLastTimestamp(fluent.getLastTimestamp());
    buildable.setMessage(fluent.getMessage());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setReason(fluent.getReason());
    buildable.setRelated(fluent.buildRelated());
    buildable.setReportingComponent(fluent.getReportingComponent());
    buildable.setReportingInstance(fluent.getReportingInstance());
    buildable.setSeries(fluent.buildSeries());
    buildable.setSource(fluent.buildSource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}