package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3PriorityLevelConfigurationListBuilder extends V1beta3PriorityLevelConfigurationListFluentImpl<V1beta3PriorityLevelConfigurationListBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationList,V1beta3PriorityLevelConfigurationListBuilder>{
  public V1beta3PriorityLevelConfigurationListBuilder() {
    this(false);
  }
  public V1beta3PriorityLevelConfigurationListBuilder(Boolean validationEnabled) {
    this(new V1beta3PriorityLevelConfigurationList(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3PriorityLevelConfigurationList(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationListFluent<?> fluent,V1beta3PriorityLevelConfigurationList instance) {
    this(fluent, instance, false);
  }
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationListFluent<?> fluent,V1beta3PriorityLevelConfigurationList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationList instance) {
    this(instance,false);
  }
  public V1beta3PriorityLevelConfigurationListBuilder(V1beta3PriorityLevelConfigurationList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3PriorityLevelConfigurationListFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3PriorityLevelConfigurationList build() {
    V1beta3PriorityLevelConfigurationList buildable = new V1beta3PriorityLevelConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}