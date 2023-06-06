package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3QueuingConfigurationBuilder extends V1beta3QueuingConfigurationFluentImpl<V1beta3QueuingConfigurationBuilder> implements VisitableBuilder<V1beta3QueuingConfiguration,V1beta3QueuingConfigurationBuilder>{
  public V1beta3QueuingConfigurationBuilder() {
    this(false);
  }
  public V1beta3QueuingConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta3QueuingConfiguration(), validationEnabled);
  }
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3QueuingConfiguration(), validationEnabled);
  }
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfigurationFluent<?> fluent,V1beta3QueuingConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfigurationFluent<?> fluent,V1beta3QueuingConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withHandSize(instance.getHandSize());
      fluent.withQueueLengthLimit(instance.getQueueLengthLimit());
      fluent.withQueues(instance.getQueues());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfiguration instance) {
    this(instance,false);
  }
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withHandSize(instance.getHandSize());
      this.withQueueLengthLimit(instance.getQueueLengthLimit());
      this.withQueues(instance.getQueues());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3QueuingConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3QueuingConfiguration build() {
    V1beta3QueuingConfiguration buildable = new V1beta3QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }
  
}