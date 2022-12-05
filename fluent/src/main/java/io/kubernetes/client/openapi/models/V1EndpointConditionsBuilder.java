package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointConditionsBuilder extends V1EndpointConditionsFluentImpl<V1EndpointConditionsBuilder> implements VisitableBuilder<V1EndpointConditions,V1EndpointConditionsBuilder>{
  public V1EndpointConditionsBuilder() {
    this(false);
  }
  public V1EndpointConditionsBuilder(Boolean validationEnabled) {
    this(new V1EndpointConditions(), validationEnabled);
  }
  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EndpointConditions(), validationEnabled);
  }
  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent,V1EndpointConditions instance) {
    this(fluent, instance, false);
  }
  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent,V1EndpointConditions instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withReady(instance.getReady());

    fluent.withServing(instance.getServing());

    fluent.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointConditionsBuilder(V1EndpointConditions instance) {
    this(instance,false);
  }
  public V1EndpointConditionsBuilder(V1EndpointConditions instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withReady(instance.getReady());

    this.withServing(instance.getServing());

    this.withTerminating(instance.getTerminating());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointConditionsFluent<?> fluent;
  Boolean validationEnabled;
  public V1EndpointConditions build() {
    V1EndpointConditions buildable = new V1EndpointConditions();
    buildable.setReady(fluent.getReady());
    buildable.setServing(fluent.getServing());
    buildable.setTerminating(fluent.getTerminating());
    return buildable;
  }
  
}