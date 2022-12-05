package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeListBuilder extends V1PersistentVolumeListFluentImpl<V1PersistentVolumeListBuilder> implements VisitableBuilder<V1PersistentVolumeList,V1PersistentVolumeListBuilder>{
  public V1PersistentVolumeListBuilder() {
    this(false);
  }
  public V1PersistentVolumeListBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeList(), validationEnabled);
  }
  public V1PersistentVolumeListBuilder(V1PersistentVolumeListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeListBuilder(V1PersistentVolumeListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeList(), validationEnabled);
  }
  public V1PersistentVolumeListBuilder(V1PersistentVolumeListFluent<?> fluent,V1PersistentVolumeList instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeListBuilder(V1PersistentVolumeListFluent<?> fluent,V1PersistentVolumeList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeListBuilder(V1PersistentVolumeList instance) {
    this(instance,false);
  }
  public V1PersistentVolumeListBuilder(V1PersistentVolumeList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeListFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolumeList build() {
    V1PersistentVolumeList buildable = new V1PersistentVolumeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}