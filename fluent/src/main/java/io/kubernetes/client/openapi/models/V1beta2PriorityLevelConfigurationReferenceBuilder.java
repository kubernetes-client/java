package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationReferenceBuilder extends V1beta2PriorityLevelConfigurationReferenceFluentImpl<V1beta2PriorityLevelConfigurationReferenceBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationReference,V1beta2PriorityLevelConfigurationReferenceBuilder>{
  public V1beta2PriorityLevelConfigurationReferenceBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta2PriorityLevelConfigurationReference instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta2PriorityLevelConfigurationReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReference instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationReferenceBuilder(V1beta2PriorityLevelConfigurationReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2PriorityLevelConfigurationReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2PriorityLevelConfigurationReference build() {
    V1beta2PriorityLevelConfigurationReference buildable = new V1beta2PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}