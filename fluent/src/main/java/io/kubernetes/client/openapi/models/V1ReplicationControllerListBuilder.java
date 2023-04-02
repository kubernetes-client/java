package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicationControllerListBuilder extends V1ReplicationControllerListFluentImpl<V1ReplicationControllerListBuilder> implements VisitableBuilder<V1ReplicationControllerList,V1ReplicationControllerListBuilder>{
  public V1ReplicationControllerListBuilder() {
    this(false);
  }
  public V1ReplicationControllerListBuilder(Boolean validationEnabled) {
    this(new V1ReplicationControllerList(), validationEnabled);
  }
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicationControllerList(), validationEnabled);
  }
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent,V1ReplicationControllerList instance) {
    this(fluent, instance, false);
  }
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent,V1ReplicationControllerList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicationControllerListBuilder(V1ReplicationControllerList instance) {
    this(instance,false);
  }
  public V1ReplicationControllerListBuilder(V1ReplicationControllerList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicationControllerListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicationControllerList build() {
    V1ReplicationControllerList buildable = new V1ReplicationControllerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}