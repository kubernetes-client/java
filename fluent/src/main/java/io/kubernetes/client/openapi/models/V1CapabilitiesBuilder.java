package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CapabilitiesBuilder extends V1CapabilitiesFluent<V1CapabilitiesBuilder> implements VisitableBuilder<V1Capabilities,V1CapabilitiesBuilder>{
  public V1CapabilitiesBuilder() {
    this(new V1Capabilities());
  }
  
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent) {
    this(fluent, new V1Capabilities());
  }
  
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent,V1Capabilities instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CapabilitiesBuilder(V1Capabilities instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CapabilitiesFluent<?> fluent;
  
  public V1Capabilities build() {
    V1Capabilities buildable = new V1Capabilities();
    buildable.setAdd(fluent.getAdd());
    buildable.setDrop(fluent.getDrop());
    return buildable;
  }
  

}