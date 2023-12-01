package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3QueuingConfigurationBuilder extends V1beta3QueuingConfigurationFluent<V1beta3QueuingConfigurationBuilder> implements VisitableBuilder<V1beta3QueuingConfiguration,V1beta3QueuingConfigurationBuilder>{
  public V1beta3QueuingConfigurationBuilder() {
    this(new V1beta3QueuingConfiguration());
  }
  
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfigurationFluent<?> fluent) {
    this(fluent, new V1beta3QueuingConfiguration());
  }
  
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfigurationFluent<?> fluent,V1beta3QueuingConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3QueuingConfigurationBuilder(V1beta3QueuingConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3QueuingConfigurationFluent<?> fluent;
  
  public V1beta3QueuingConfiguration build() {
    V1beta3QueuingConfiguration buildable = new V1beta3QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }
  

}