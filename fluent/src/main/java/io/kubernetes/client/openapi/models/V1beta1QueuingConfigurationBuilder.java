package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1QueuingConfigurationBuilder extends V1beta1QueuingConfigurationFluentImpl<V1beta1QueuingConfigurationBuilder> implements VisitableBuilder<V1beta1QueuingConfiguration,V1beta1QueuingConfigurationBuilder>{
  public V1beta1QueuingConfigurationBuilder() {
    this(false);
  }
  public V1beta1QueuingConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta1QueuingConfiguration(), validationEnabled);
  }
  public V1beta1QueuingConfigurationBuilder(V1beta1QueuingConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1QueuingConfigurationBuilder(V1beta1QueuingConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1QueuingConfiguration(), validationEnabled);
  }
  public V1beta1QueuingConfigurationBuilder(V1beta1QueuingConfigurationFluent<?> fluent,V1beta1QueuingConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta1QueuingConfigurationBuilder(V1beta1QueuingConfigurationFluent<?> fluent,V1beta1QueuingConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHandSize(instance.getHandSize());

    fluent.withQueueLengthLimit(instance.getQueueLengthLimit());

    fluent.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1QueuingConfigurationBuilder(V1beta1QueuingConfiguration instance) {
    this(instance,false);
  }
  public V1beta1QueuingConfigurationBuilder(V1beta1QueuingConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withHandSize(instance.getHandSize());

    this.withQueueLengthLimit(instance.getQueueLengthLimit());

    this.withQueues(instance.getQueues());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1QueuingConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1QueuingConfiguration build() {
    V1beta1QueuingConfiguration buildable = new V1beta1QueuingConfiguration();
    buildable.setHandSize(fluent.getHandSize());
    buildable.setQueueLengthLimit(fluent.getQueueLengthLimit());
    buildable.setQueues(fluent.getQueues());
    return buildable;
  }
  
}