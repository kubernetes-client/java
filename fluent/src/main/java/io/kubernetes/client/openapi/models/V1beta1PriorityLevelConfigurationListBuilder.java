package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1PriorityLevelConfigurationListBuilder extends V1beta1PriorityLevelConfigurationListFluentImpl<V1beta1PriorityLevelConfigurationListBuilder> implements VisitableBuilder<V1beta1PriorityLevelConfigurationList,V1beta1PriorityLevelConfigurationListBuilder>{
  public V1beta1PriorityLevelConfigurationListBuilder() {
    this(false);
  }
  public V1beta1PriorityLevelConfigurationListBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationList(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationListBuilder(V1beta1PriorityLevelConfigurationListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PriorityLevelConfigurationListBuilder(V1beta1PriorityLevelConfigurationListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationList(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationListBuilder(V1beta1PriorityLevelConfigurationListFluent<?> fluent,V1beta1PriorityLevelConfigurationList instance) {
    this(fluent, instance, false);
  }
  public V1beta1PriorityLevelConfigurationListBuilder(V1beta1PriorityLevelConfigurationListFluent<?> fluent,V1beta1PriorityLevelConfigurationList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PriorityLevelConfigurationListBuilder(V1beta1PriorityLevelConfigurationList instance) {
    this(instance,false);
  }
  public V1beta1PriorityLevelConfigurationListBuilder(V1beta1PriorityLevelConfigurationList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1PriorityLevelConfigurationListFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1PriorityLevelConfigurationList build() {
    V1beta1PriorityLevelConfigurationList buildable = new V1beta1PriorityLevelConfigurationList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}