package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3PriorityLevelConfigurationReferenceBuilder extends V1beta3PriorityLevelConfigurationReferenceFluentImpl<V1beta3PriorityLevelConfigurationReferenceBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationReference,V1beta3PriorityLevelConfigurationReferenceBuilder>{
  public V1beta3PriorityLevelConfigurationReferenceBuilder() {
    this(false);
  }
  public V1beta3PriorityLevelConfigurationReferenceBuilder(Boolean validationEnabled) {
    this(new V1beta3PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta3PriorityLevelConfigurationReference instance) {
    this(fluent, instance, false);
  }
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta3PriorityLevelConfigurationReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReference instance) {
    this(instance,false);
  }
  public V1beta3PriorityLevelConfigurationReferenceBuilder(V1beta3PriorityLevelConfigurationReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3PriorityLevelConfigurationReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3PriorityLevelConfigurationReference build() {
    V1beta3PriorityLevelConfigurationReference buildable = new V1beta3PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}