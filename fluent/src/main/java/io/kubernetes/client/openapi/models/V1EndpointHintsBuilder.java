package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EndpointHintsBuilder extends V1EndpointHintsFluent<V1EndpointHintsBuilder> implements VisitableBuilder<V1EndpointHints,V1EndpointHintsBuilder>{
  public V1EndpointHintsBuilder() {
    this(new V1EndpointHints());
  }
  
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent) {
    this(fluent, new V1EndpointHints());
  }
  
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent,V1EndpointHints instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EndpointHintsBuilder(V1EndpointHints instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EndpointHintsFluent<?> fluent;
  
  public V1EndpointHints build() {
    V1EndpointHints buildable = new V1EndpointHints();
    buildable.setForZones(fluent.buildForZones());
    return buildable;
  }
  

}