package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicaSetListBuilder extends V1ReplicaSetListFluentImpl<V1ReplicaSetListBuilder> implements VisitableBuilder<V1ReplicaSetList,V1ReplicaSetListBuilder>{
  public V1ReplicaSetListBuilder() {
    this(false);
  }
  public V1ReplicaSetListBuilder(Boolean validationEnabled) {
    this(new V1ReplicaSetList(), validationEnabled);
  }
  public V1ReplicaSetListBuilder(V1ReplicaSetListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicaSetListBuilder(V1ReplicaSetListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicaSetList(), validationEnabled);
  }
  public V1ReplicaSetListBuilder(V1ReplicaSetListFluent<?> fluent,V1ReplicaSetList instance) {
    this(fluent, instance, false);
  }
  public V1ReplicaSetListBuilder(V1ReplicaSetListFluent<?> fluent,V1ReplicaSetList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicaSetListBuilder(V1ReplicaSetList instance) {
    this(instance,false);
  }
  public V1ReplicaSetListBuilder(V1ReplicaSetList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicaSetListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicaSetList build() {
    V1ReplicaSetList buildable = new V1ReplicaSetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}