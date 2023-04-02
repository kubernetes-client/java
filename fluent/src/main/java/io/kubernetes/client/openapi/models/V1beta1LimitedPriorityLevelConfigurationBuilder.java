package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1LimitedPriorityLevelConfigurationBuilder extends V1beta1LimitedPriorityLevelConfigurationFluentImpl<V1beta1LimitedPriorityLevelConfigurationBuilder> implements VisitableBuilder<V1beta1LimitedPriorityLevelConfiguration,V1beta1LimitedPriorityLevelConfigurationBuilder>{
  public V1beta1LimitedPriorityLevelConfigurationBuilder() {
    this(false);
  }
  public V1beta1LimitedPriorityLevelConfigurationBuilder(Boolean validationEnabled) {
    this(new V1beta1LimitedPriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta1LimitedPriorityLevelConfigurationBuilder(V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1LimitedPriorityLevelConfigurationBuilder(V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1LimitedPriorityLevelConfiguration(), validationEnabled);
  }
  public V1beta1LimitedPriorityLevelConfigurationBuilder(V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta1LimitedPriorityLevelConfiguration instance) {
    this(fluent, instance, false);
  }
  public V1beta1LimitedPriorityLevelConfigurationBuilder(V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent,V1beta1LimitedPriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    fluent.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1LimitedPriorityLevelConfigurationBuilder(V1beta1LimitedPriorityLevelConfiguration instance) {
    this(instance,false);
  }
  public V1beta1LimitedPriorityLevelConfigurationBuilder(V1beta1LimitedPriorityLevelConfiguration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    this.withLimitResponse(instance.getLimitResponse());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1LimitedPriorityLevelConfigurationFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1LimitedPriorityLevelConfiguration build() {
    V1beta1LimitedPriorityLevelConfiguration buildable = new V1beta1LimitedPriorityLevelConfiguration();
    buildable.setAssuredConcurrencyShares(fluent.getAssuredConcurrencyShares());
    buildable.setLimitResponse(fluent.getLimitResponse());
    return buildable;
  }
  
}