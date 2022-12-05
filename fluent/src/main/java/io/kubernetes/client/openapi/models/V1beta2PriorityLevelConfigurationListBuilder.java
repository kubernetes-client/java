package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationListBuilder extends V1beta2PriorityLevelConfigurationListFluentImpl<V1beta2PriorityLevelConfigurationListBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationList,V1beta2PriorityLevelConfigurationListBuilder>{
  public V1beta2PriorityLevelConfigurationListBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationListBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationList(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationList(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationListFluent<?> fluent,V1beta2PriorityLevelConfigurationList instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationListFluent<?> fluent,V1beta2PriorityLevelConfigurationList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationList instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationListBuilder(V1beta2PriorityLevelConfigurationList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2PriorityLevelConfigurationListFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2PriorityLevelConfigurationList build() {
    V1beta2PriorityLevelConfigurationList buildable = new V1beta2PriorityLevelConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}