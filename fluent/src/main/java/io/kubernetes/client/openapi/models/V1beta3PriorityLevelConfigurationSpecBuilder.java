package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3PriorityLevelConfigurationSpecBuilder extends V1beta3PriorityLevelConfigurationSpecFluentImpl<V1beta3PriorityLevelConfigurationSpecBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationSpec,V1beta3PriorityLevelConfigurationSpecBuilder>{
  public V1beta3PriorityLevelConfigurationSpecBuilder() {
    this(false);
  }
  public V1beta3PriorityLevelConfigurationSpecBuilder(Boolean validationEnabled) {
    this(new V1beta3PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpecFluent<?> fluent,V1beta3PriorityLevelConfigurationSpec instance) {
    this(fluent, instance, false);
  }
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpecFluent<?> fluent,V1beta3PriorityLevelConfigurationSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withLimited(instance.getLimited());
      fluent.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpec instance) {
    this(instance,false);
  }
  public V1beta3PriorityLevelConfigurationSpecBuilder(V1beta3PriorityLevelConfigurationSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withLimited(instance.getLimited());
      this.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3PriorityLevelConfigurationSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3PriorityLevelConfigurationSpec build() {
    V1beta3PriorityLevelConfigurationSpec buildable = new V1beta3PriorityLevelConfigurationSpec();
    buildable.setLimited(fluent.getLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}