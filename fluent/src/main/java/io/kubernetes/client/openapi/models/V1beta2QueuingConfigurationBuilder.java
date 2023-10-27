package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2QueuingConfigurationBuilder extends V1beta2QueuingConfigurationFluent<V1beta2QueuingConfigurationBuilder> implements VisitableBuilder<V1beta2QueuingConfiguration,V1beta2QueuingConfigurationBuilder>{
  public V1beta2QueuingConfigurationBuilder() {
    this(new V1beta2QueuingConfiguration());
  }
  
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfigurationFluent<?> fluent) {
    this(fluent, new V1beta2QueuingConfiguration());
  }
  
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfigurationFluent<?> fluent,V1beta2QueuingConfiguration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2QueuingConfigurationBuilder(V1beta2QueuingConfiguration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2QueuingConfigurationFluent<?> fluent;
  
  public V1beta2QueuingConfiguration build() {
    V1beta2QueuingConfiguration buildable = new V1beta2QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }
  

}