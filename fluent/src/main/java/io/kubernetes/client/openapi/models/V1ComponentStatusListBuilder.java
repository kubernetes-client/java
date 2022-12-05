package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ComponentStatusListBuilder extends V1ComponentStatusListFluentImpl<V1ComponentStatusListBuilder> implements VisitableBuilder<V1ComponentStatusList,V1ComponentStatusListBuilder>{
  public V1ComponentStatusListBuilder() {
    this(false);
  }
  public V1ComponentStatusListBuilder(Boolean validationEnabled) {
    this(new V1ComponentStatusList(), validationEnabled);
  }
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ComponentStatusList(), validationEnabled);
  }
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent,V1ComponentStatusList instance) {
    this(fluent, instance, false);
  }
  public V1ComponentStatusListBuilder(V1ComponentStatusListFluent<?> fluent,V1ComponentStatusList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ComponentStatusListBuilder(V1ComponentStatusList instance) {
    this(instance,false);
  }
  public V1ComponentStatusListBuilder(V1ComponentStatusList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ComponentStatusListFluent<?> fluent;
  Boolean validationEnabled;
  public V1ComponentStatusList build() {
    V1ComponentStatusList buildable = new V1ComponentStatusList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}