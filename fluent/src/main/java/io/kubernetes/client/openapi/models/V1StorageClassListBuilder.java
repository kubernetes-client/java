package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StorageClassListBuilder extends V1StorageClassListFluentImpl<V1StorageClassListBuilder> implements VisitableBuilder<V1StorageClassList,V1StorageClassListBuilder>{
  public V1StorageClassListBuilder() {
    this(false);
  }
  public V1StorageClassListBuilder(Boolean validationEnabled) {
    this(new V1StorageClassList(), validationEnabled);
  }
  public V1StorageClassListBuilder(V1StorageClassListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StorageClassListBuilder(V1StorageClassListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StorageClassList(), validationEnabled);
  }
  public V1StorageClassListBuilder(V1StorageClassListFluent<?> fluent,V1StorageClassList instance) {
    this(fluent, instance, false);
  }
  public V1StorageClassListBuilder(V1StorageClassListFluent<?> fluent,V1StorageClassList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1StorageClassListBuilder(V1StorageClassList instance) {
    this(instance,false);
  }
  public V1StorageClassListBuilder(V1StorageClassList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1StorageClassListFluent<?> fluent;
  Boolean validationEnabled;
  public V1StorageClassList build() {
    V1StorageClassList buildable = new V1StorageClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}