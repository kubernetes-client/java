package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1PriorityLevelConfigurationReferenceBuilder extends V1beta1PriorityLevelConfigurationReferenceFluentImpl<V1beta1PriorityLevelConfigurationReferenceBuilder> implements VisitableBuilder<V1beta1PriorityLevelConfigurationReference,V1beta1PriorityLevelConfigurationReferenceBuilder>{
  public V1beta1PriorityLevelConfigurationReferenceBuilder() {
    this(false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationReference(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta1PriorityLevelConfigurationReference instance) {
    this(fluent, instance, false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent,V1beta1PriorityLevelConfigurationReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(V1beta1PriorityLevelConfigurationReference instance) {
    this(instance,false);
  }
  public V1beta1PriorityLevelConfigurationReferenceBuilder(V1beta1PriorityLevelConfigurationReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1PriorityLevelConfigurationReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1PriorityLevelConfigurationReference build() {
    V1beta1PriorityLevelConfigurationReference buildable = new V1beta1PriorityLevelConfigurationReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}