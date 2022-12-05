package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class CoreV1EventListBuilder extends CoreV1EventListFluentImpl<CoreV1EventListBuilder> implements VisitableBuilder<CoreV1EventList,CoreV1EventListBuilder>{
  public CoreV1EventListBuilder() {
    this(false);
  }
  public CoreV1EventListBuilder(Boolean validationEnabled) {
    this(new CoreV1EventList(), validationEnabled);
  }
  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent) {
    this(fluent, false);
  }
  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new CoreV1EventList(), validationEnabled);
  }
  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent,CoreV1EventList instance) {
    this(fluent, instance, false);
  }
  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent,CoreV1EventList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public CoreV1EventListBuilder(CoreV1EventList instance) {
    this(instance,false);
  }
  public CoreV1EventListBuilder(CoreV1EventList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  CoreV1EventListFluent<?> fluent;
  Boolean validationEnabled;
  public CoreV1EventList build() {
    CoreV1EventList buildable = new CoreV1EventList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}