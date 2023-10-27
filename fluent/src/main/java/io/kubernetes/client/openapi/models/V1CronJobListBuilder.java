package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CronJobListBuilder extends V1CronJobListFluent<V1CronJobListBuilder> implements VisitableBuilder<V1CronJobList,V1CronJobListBuilder>{
  public V1CronJobListBuilder() {
    this(new V1CronJobList());
  }
  
  public V1CronJobListBuilder(V1CronJobListFluent<?> fluent) {
    this(fluent, new V1CronJobList());
  }
  
  public V1CronJobListBuilder(V1CronJobListFluent<?> fluent,V1CronJobList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CronJobListBuilder(V1CronJobList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CronJobListFluent<?> fluent;
  
  public V1CronJobList build() {
    V1CronJobList buildable = new V1CronJobList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}