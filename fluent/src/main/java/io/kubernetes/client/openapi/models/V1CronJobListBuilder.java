package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CronJobListBuilder extends V1CronJobListFluentImpl<V1CronJobListBuilder> implements VisitableBuilder<V1CronJobList,V1CronJobListBuilder>{
  public V1CronJobListBuilder() {
    this(false);
  }
  public V1CronJobListBuilder(Boolean validationEnabled) {
    this(new V1CronJobList(), validationEnabled);
  }
  public V1CronJobListBuilder(V1CronJobListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CronJobListBuilder(V1CronJobListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CronJobList(), validationEnabled);
  }
  public V1CronJobListBuilder(V1CronJobListFluent<?> fluent,V1CronJobList instance) {
    this(fluent, instance, false);
  }
  public V1CronJobListBuilder(V1CronJobListFluent<?> fluent,V1CronJobList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1CronJobListBuilder(V1CronJobList instance) {
    this(instance,false);
  }
  public V1CronJobListBuilder(V1CronJobList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1CronJobListFluent<?> fluent;
  Boolean validationEnabled;
  public V1CronJobList build() {
    V1CronJobList buildable = new V1CronJobList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}