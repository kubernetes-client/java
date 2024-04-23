package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1QueuingConfigurationBuilder extends V1QueuingConfigurationFluent<V1QueuingConfigurationBuilder> implements VisitableBuilder<V1QueuingConfiguration,V1QueuingConfigurationBuilder>{
  public V1QueuingConfigurationBuilder() {
    this(new V1QueuingConfiguration());
  }
  
  public V1QueuingConfigurationBuilder(V1QueuingConfigurationFluent<?> fluent) {
    this(fluent, new V1QueuingConfiguration());
  }
  
  public V1QueuingConfigurationBuilder(V1QueuingConfigurationFluent<?> fluent,V1QueuingConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1QueuingConfigurationBuilder(V1QueuingConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1QueuingConfigurationFluent<?> fluent;
  
  public V1QueuingConfiguration build() {
    V1QueuingConfiguration buildable = new V1QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }
  

}