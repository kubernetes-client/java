package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ConfigMapListBuilder extends V1ConfigMapListFluentImpl<V1ConfigMapListBuilder> implements VisitableBuilder<V1ConfigMapList,V1ConfigMapListBuilder>{
  public V1ConfigMapListBuilder() {
    this(false);
  }
  public V1ConfigMapListBuilder(Boolean validationEnabled) {
    this(new V1ConfigMapList(), validationEnabled);
  }
  public V1ConfigMapListBuilder(V1ConfigMapListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ConfigMapListBuilder(V1ConfigMapListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ConfigMapList(), validationEnabled);
  }
  public V1ConfigMapListBuilder(V1ConfigMapListFluent<?> fluent,V1ConfigMapList instance) {
    this(fluent, instance, false);
  }
  public V1ConfigMapListBuilder(V1ConfigMapListFluent<?> fluent,V1ConfigMapList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ConfigMapListBuilder(V1ConfigMapList instance) {
    this(instance,false);
  }
  public V1ConfigMapListBuilder(V1ConfigMapList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ConfigMapListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ConfigMapList build() {
    V1ConfigMapList buildable = new V1ConfigMapList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}