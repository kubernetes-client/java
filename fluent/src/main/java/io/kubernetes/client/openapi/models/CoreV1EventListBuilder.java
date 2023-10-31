package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class CoreV1EventListBuilder extends CoreV1EventListFluent<CoreV1EventListBuilder> implements VisitableBuilder<CoreV1EventList,CoreV1EventListBuilder>{
  public CoreV1EventListBuilder() {
    this(new CoreV1EventList());
  }
  
  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent) {
    this(fluent, new CoreV1EventList());
  }
  
  public CoreV1EventListBuilder(CoreV1EventListFluent<?> fluent,CoreV1EventList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public CoreV1EventListBuilder(CoreV1EventList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  CoreV1EventListFluent<?> fluent;
  
  public CoreV1EventList build() {
    CoreV1EventList buildable = new CoreV1EventList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}