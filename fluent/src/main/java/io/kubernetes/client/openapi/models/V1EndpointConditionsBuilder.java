package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointConditionsBuilder extends V1EndpointConditionsFluent<V1EndpointConditionsBuilder> implements VisitableBuilder<V1EndpointConditions,V1EndpointConditionsBuilder>{
  public V1EndpointConditionsBuilder() {
    this(new V1EndpointConditions());
  }
  
  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent) {
    this(fluent, new V1EndpointConditions());
  }
  
  public V1EndpointConditionsBuilder(V1EndpointConditionsFluent<?> fluent,V1EndpointConditions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointConditionsBuilder(V1EndpointConditions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointConditionsFluent<?> fluent;
  
  public V1EndpointConditions build() {
    V1EndpointConditions buildable = new V1EndpointConditions();
    buildable.setReady(fluent.getReady());
    buildable.setServing(fluent.getServing());
    buildable.setTerminating(fluent.getTerminating());
    return buildable;
  }
  

}