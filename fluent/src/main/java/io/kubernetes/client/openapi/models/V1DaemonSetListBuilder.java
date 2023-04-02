package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DaemonSetListBuilder extends V1DaemonSetListFluentImpl<V1DaemonSetListBuilder> implements VisitableBuilder<V1DaemonSetList,V1DaemonSetListBuilder>{
  public V1DaemonSetListBuilder() {
    this(false);
  }
  public V1DaemonSetListBuilder(Boolean validationEnabled) {
    this(new V1DaemonSetList(), validationEnabled);
  }
  public V1DaemonSetListBuilder(V1DaemonSetListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DaemonSetListBuilder(V1DaemonSetListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DaemonSetList(), validationEnabled);
  }
  public V1DaemonSetListBuilder(V1DaemonSetListFluent<?> fluent,V1DaemonSetList instance) {
    this(fluent, instance, false);
  }
  public V1DaemonSetListBuilder(V1DaemonSetListFluent<?> fluent,V1DaemonSetList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1DaemonSetListBuilder(V1DaemonSetList instance) {
    this(instance,false);
  }
  public V1DaemonSetListBuilder(V1DaemonSetList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1DaemonSetListFluent<?> fluent;
  Boolean validationEnabled;
  public V1DaemonSetList build() {
    V1DaemonSetList buildable = new V1DaemonSetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}