package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2QueuingConfigurationBuilder extends V1beta2QueuingConfigurationFluentImpl<V1beta2QueuingConfigurationBuilder> implements VisitableBuilder<V1beta2QueuingConfiguration,V1beta2QueuingConfigurationBuilder>{
  public V1beta2QueuingConfigurationBuilder() {
    this(false);
  }
  public V1beta2QueuingConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta2QueuingConfiguration(), validationEnabled);
  }
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2QueuingConfiguration(), validationEnabled);
  }
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfigurationFluent<?> fluent,V1beta2QueuingConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfigurationFluent<?> fluent,V1beta2QueuingConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHandSize(instance.getHandSize());

    fluent.withQueueLengthLimit(instance.getQueueLengthLimit());

    fluent.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfiguration instance) {
    this(instance,false);
  }
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHandSize(instance.getHandSize());

    this.withQueueLengthLimit(instance.getQueueLengthLimit());

    this.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2QueuingConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2QueuingConfiguration build() {
    V1beta2QueuingConfiguration buildable = new V1beta2QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }
  
}