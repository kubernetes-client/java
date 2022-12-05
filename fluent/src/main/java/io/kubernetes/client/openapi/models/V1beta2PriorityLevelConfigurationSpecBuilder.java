package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationSpecBuilder extends V1beta2PriorityLevelConfigurationSpecFluentImpl<V1beta2PriorityLevelConfigurationSpecBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationSpec,V1beta2PriorityLevelConfigurationSpecBuilder>{
  public V1beta2PriorityLevelConfigurationSpecBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,V1beta2PriorityLevelConfigurationSpec instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpecFluent<?> fluent,V1beta2PriorityLevelConfigurationSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLimited(instance.getLimited());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpec instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationSpecBuilder(V1beta2PriorityLevelConfigurationSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLimited(instance.getLimited());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2PriorityLevelConfigurationSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2PriorityLevelConfigurationSpec build() {
    V1beta2PriorityLevelConfigurationSpec buildable = new V1beta2PriorityLevelConfigurationSpec();
    buildable.setLimited(fluent.getLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}