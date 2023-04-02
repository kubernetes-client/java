package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1PriorityLevelConfigurationBuilder extends V1beta1PriorityLevelConfigurationFluentImpl<V1beta1PriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta1PriorityLevelConfiguration,V1beta1PriorityLevelConfigurationBuilder>{
  public V1beta1PriorityLevelConfigurationBuilder() {
    this(false);
  }
  public V1beta1PriorityLevelConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationBuilder(V1beta1PriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PriorityLevelConfigurationBuilder(V1beta1PriorityLevelConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationBuilder(V1beta1PriorityLevelConfigurationFluent<?> fluent,V1beta1PriorityLevelConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta1PriorityLevelConfigurationBuilder(V1beta1PriorityLevelConfigurationFluent<?> fluent,V1beta1PriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PriorityLevelConfigurationBuilder(V1beta1PriorityLevelConfiguration instance) {
    this(instance,false);
  }
  public V1beta1PriorityLevelConfigurationBuilder(V1beta1PriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1PriorityLevelConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1PriorityLevelConfiguration build() {
    V1beta1PriorityLevelConfiguration buildable = new V1beta1PriorityLevelConfiguration();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}