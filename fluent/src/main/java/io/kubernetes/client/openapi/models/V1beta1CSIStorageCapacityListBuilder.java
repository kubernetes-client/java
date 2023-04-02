package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1CSIStorageCapacityListBuilder extends V1beta1CSIStorageCapacityListFluentImpl<V1beta1CSIStorageCapacityListBuilder> implements VisitableBuilder<V1beta1CSIStorageCapacityList,V1beta1CSIStorageCapacityListBuilder>{
  public V1beta1CSIStorageCapacityListBuilder() {
    this(false);
  }
  public V1beta1CSIStorageCapacityListBuilder(Boolean validationEnabled) {
    this(new V1beta1CSIStorageCapacityList(), validationEnabled);
  }
  public V1beta1CSIStorageCapacityListBuilder(V1beta1CSIStorageCapacityListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1CSIStorageCapacityListBuilder(V1beta1CSIStorageCapacityListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1CSIStorageCapacityList(), validationEnabled);
  }
  public V1beta1CSIStorageCapacityListBuilder(V1beta1CSIStorageCapacityListFluent<?> fluent,V1beta1CSIStorageCapacityList instance) {
    this(fluent, instance, false);
  }
  public V1beta1CSIStorageCapacityListBuilder(V1beta1CSIStorageCapacityListFluent<?> fluent,V1beta1CSIStorageCapacityList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1CSIStorageCapacityListBuilder(V1beta1CSIStorageCapacityList instance) {
    this(instance,false);
  }
  public V1beta1CSIStorageCapacityListBuilder(V1beta1CSIStorageCapacityList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1CSIStorageCapacityListFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1CSIStorageCapacityList build() {
    V1beta1CSIStorageCapacityList buildable = new V1beta1CSIStorageCapacityList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}