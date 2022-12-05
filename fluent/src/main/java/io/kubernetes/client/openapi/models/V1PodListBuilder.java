package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodListBuilder extends V1PodListFluentImpl<V1PodListBuilder> implements VisitableBuilder<V1PodList,V1PodListBuilder>{
  public V1PodListBuilder() {
    this(false);
  }
  public V1PodListBuilder(Boolean validationEnabled) {
    this(new V1PodList(), validationEnabled);
  }
  public V1PodListBuilder(V1PodListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodListBuilder(V1PodListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodList(), validationEnabled);
  }
  public V1PodListBuilder(V1PodListFluent<?> fluent,V1PodList instance) {
    this(fluent, instance, false);
  }
  public V1PodListBuilder(V1PodListFluent<?> fluent,V1PodList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodListBuilder(V1PodList instance) {
    this(instance,false);
  }
  public V1PodListBuilder(V1PodList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1PodListFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodList build() {
    V1PodList buildable = new V1PodList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}