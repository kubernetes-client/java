package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class CoreV1EventBuilder extends CoreV1EventFluentImpl<CoreV1EventBuilder> implements VisitableBuilder<CoreV1Event,CoreV1EventBuilder>{
  public CoreV1EventBuilder() {
    this(false);
  }
  public CoreV1EventBuilder(Boolean validationEnabled) {
    this(new CoreV1Event(), validationEnabled);
  }
  public CoreV1EventBuilder(CoreV1EventFluent<?> fluent) {
    this(fluent, false);
  }
  public CoreV1EventBuilder(CoreV1EventFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new CoreV1Event(), validationEnabled);
  }
  public CoreV1EventBuilder(CoreV1EventFluent<?> fluent,CoreV1Event instance) {
    this(fluent, instance, false);
  }
  public CoreV1EventBuilder(CoreV1EventFluent<?> fluent,CoreV1Event instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAction(instance.getAction());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withCount(instance.getCount());

    fluent.withEventTime(instance.getEventTime());

    fluent.withFirstTimestamp(instance.getFirstTimestamp());

    fluent.withInvolvedObject(instance.getInvolvedObject());

    fluent.withKind(instance.getKind());

    fluent.withLastTimestamp(instance.getLastTimestamp());

    fluent.withMessage(instance.getMessage());

    fluent.withMetadata(instance.getMetadata());

    fluent.withReason(instance.getReason());

    fluent.withRelated(instance.getRelated());

    fluent.withReportingComponent(instance.getReportingComponent());

    fluent.withReportingInstance(instance.getReportingInstance());

    fluent.withSeries(instance.getSeries());

    fluent.withSource(instance.getSource());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public CoreV1EventBuilder(CoreV1Event instance) {
    this(instance,false);
  }
  public CoreV1EventBuilder(CoreV1Event instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAction(instance.getAction());

    this.withApiVersion(instance.getApiVersion());

    this.withCount(instance.getCount());

    this.withEventTime(instance.getEventTime());

    this.withFirstTimestamp(instance.getFirstTimestamp());

    this.withInvolvedObject(instance.getInvolvedObject());

    this.withKind(instance.getKind());

    this.withLastTimestamp(instance.getLastTimestamp());

    this.withMessage(instance.getMessage());

    this.withMetadata(instance.getMetadata());

    this.withReason(instance.getReason());

    this.withRelated(instance.getRelated());

    this.withReportingComponent(instance.getReportingComponent());

    this.withReportingInstance(instance.getReportingInstance());

    this.withSeries(instance.getSeries());

    this.withSource(instance.getSource());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  CoreV1EventFluent<?> fluent;
  Boolean validationEnabled;
  public CoreV1Event build() {
    CoreV1Event buildable = new CoreV1Event();
    buildable.setAction(fluent.getAction());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCount(fluent.getCount());
    buildable.setEventTime(fluent.getEventTime());
    buildable.setFirstTimestamp(fluent.getFirstTimestamp());
    buildable.setInvolvedObject(fluent.getInvolvedObject());
    buildable.setKind(fluent.getKind());
    buildable.setLastTimestamp(fluent.getLastTimestamp());
    buildable.setMessage(fluent.getMessage());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setReason(fluent.getReason());
    buildable.setRelated(fluent.getRelated());
    buildable.setReportingComponent(fluent.getReportingComponent());
    buildable.setReportingInstance(fluent.getReportingInstance());
    buildable.setSeries(fluent.getSeries());
    buildable.setSource(fluent.getSource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}