package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSIDriverListBuilder extends V1CSIDriverListFluentImpl<V1CSIDriverListBuilder> implements VisitableBuilder<V1CSIDriverList,V1CSIDriverListBuilder>{
  public V1CSIDriverListBuilder() {
    this(false);
  }
  public V1CSIDriverListBuilder(Boolean validationEnabled) {
    this(new V1CSIDriverList(), validationEnabled);
  }
  public V1CSIDriverListBuilder(V1CSIDriverListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSIDriverListBuilder(V1CSIDriverListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSIDriverList(), validationEnabled);
  }
  public V1CSIDriverListBuilder(V1CSIDriverListFluent<?> fluent,V1CSIDriverList instance) {
    this(fluent, instance, false);
  }
  public V1CSIDriverListBuilder(V1CSIDriverListFluent<?> fluent,V1CSIDriverList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSIDriverListBuilder(V1CSIDriverList instance) {
    this(instance,false);
  }
  public V1CSIDriverListBuilder(V1CSIDriverList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1CSIDriverListFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSIDriverList build() {
    V1CSIDriverList buildable = new V1CSIDriverList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}