package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PriorityClassListBuilder extends V1PriorityClassListFluentImpl<V1PriorityClassListBuilder> implements VisitableBuilder<V1PriorityClassList,V1PriorityClassListBuilder>{
  public V1PriorityClassListBuilder() {
    this(false);
  }
  public V1PriorityClassListBuilder(Boolean validationEnabled) {
    this(new V1PriorityClassList(), validationEnabled);
  }
  public V1PriorityClassListBuilder(V1PriorityClassListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PriorityClassListBuilder(V1PriorityClassListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PriorityClassList(), validationEnabled);
  }
  public V1PriorityClassListBuilder(V1PriorityClassListFluent<?> fluent,V1PriorityClassList instance) {
    this(fluent, instance, false);
  }
  public V1PriorityClassListBuilder(V1PriorityClassListFluent<?> fluent,V1PriorityClassList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PriorityClassListBuilder(V1PriorityClassList instance) {
    this(instance,false);
  }
  public V1PriorityClassListBuilder(V1PriorityClassList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1PriorityClassListFluent<?> fluent;
  Boolean validationEnabled;
  public V1PriorityClassList build() {
    V1PriorityClassList buildable = new V1PriorityClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}