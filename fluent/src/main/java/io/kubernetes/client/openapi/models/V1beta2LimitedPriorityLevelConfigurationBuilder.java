package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2LimitedPriorityLevelConfigurationBuilder extends V1beta2LimitedPriorityLevelConfigurationFluentImpl<V1beta2LimitedPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta2LimitedPriorityLevelConfiguration,V1beta2LimitedPriorityLevelConfigurationBuilder>{
  public V1beta2LimitedPriorityLevelConfigurationBuilder() {
    this(false);
  }
  public V1beta2LimitedPriorityLevelConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta2LimitedPriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2LimitedPriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta2LimitedPriorityLevelConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta2LimitedPriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    fluent.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfiguration instance) {
    this(instance,false);
  }
  public V1beta2LimitedPriorityLevelConfigurationBuilder(V1beta2LimitedPriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    this.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2LimitedPriorityLevelConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2LimitedPriorityLevelConfiguration build() {
    V1beta2LimitedPriorityLevelConfiguration buildable = new V1beta2LimitedPriorityLevelConfiguration();
    buildable.setAssuredConcurrencyShares(fluent.getAssuredConcurrencyShares());
    buildable.setLimitResponse(fluent.getLimitResponse());
    return buildable;
  }
  
}