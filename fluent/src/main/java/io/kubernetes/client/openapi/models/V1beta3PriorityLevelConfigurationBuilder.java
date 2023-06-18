package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3PriorityLevelConfigurationBuilder extends V1beta3PriorityLevelConfigurationFluentImpl<V1beta3PriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfiguration,V1beta3PriorityLevelConfigurationBuilder>{
  public V1beta3PriorityLevelConfigurationBuilder() {
    this(false);
  }
  public V1beta3PriorityLevelConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta3PriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3PriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfigurationFluent<?> fluent,V1beta3PriorityLevelConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfigurationFluent<?> fluent,V1beta3PriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
      fluent.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfiguration instance) {
    this(instance,false);
  }
  public V1beta3PriorityLevelConfigurationBuilder(V1beta3PriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3PriorityLevelConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3PriorityLevelConfiguration build() {
    V1beta3PriorityLevelConfiguration buildable = new V1beta3PriorityLevelConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}