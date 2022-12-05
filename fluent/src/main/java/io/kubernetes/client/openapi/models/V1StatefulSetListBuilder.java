package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StatefulSetListBuilder extends V1StatefulSetListFluentImpl<V1StatefulSetListBuilder> implements VisitableBuilder<V1StatefulSetList,V1StatefulSetListBuilder>{
  public V1StatefulSetListBuilder() {
    this(false);
  }
  public V1StatefulSetListBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetList(), validationEnabled);
  }
  public V1StatefulSetListBuilder(V1StatefulSetListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StatefulSetListBuilder(V1StatefulSetListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StatefulSetList(), validationEnabled);
  }
  public V1StatefulSetListBuilder(V1StatefulSetListFluent<?> fluent,V1StatefulSetList instance) {
    this(fluent, instance, false);
  }
  public V1StatefulSetListBuilder(V1StatefulSetListFluent<?> fluent,V1StatefulSetList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1StatefulSetListBuilder(V1StatefulSetList instance) {
    this(instance,false);
  }
  public V1StatefulSetListBuilder(V1StatefulSetList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1StatefulSetListFluent<?> fluent;
  Boolean validationEnabled;
  public V1StatefulSetList build() {
    V1StatefulSetList buildable = new V1StatefulSetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}