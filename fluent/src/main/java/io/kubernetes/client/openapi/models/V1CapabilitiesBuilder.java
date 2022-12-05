package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CapabilitiesBuilder extends V1CapabilitiesFluentImpl<V1CapabilitiesBuilder> implements VisitableBuilder<V1Capabilities,V1CapabilitiesBuilder>{
  public V1CapabilitiesBuilder() {
    this(false);
  }
  public V1CapabilitiesBuilder(Boolean validationEnabled) {
    this(new V1Capabilities(), validationEnabled);
  }
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Capabilities(), validationEnabled);
  }
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent,V1Capabilities instance) {
    this(fluent, instance, false);
  }
  public V1CapabilitiesBuilder(V1CapabilitiesFluent<?> fluent,V1Capabilities instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAdd(instance.getAdd());

    fluent.withDrop(instance.getDrop());

    this.validationEnabled = validationEnabled; 
  }
  public V1CapabilitiesBuilder(V1Capabilities instance) {
    this(instance,false);
  }
  public V1CapabilitiesBuilder(V1Capabilities instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAdd(instance.getAdd());

    this.withDrop(instance.getDrop());

    this.validationEnabled = validationEnabled; 
  }
  V1CapabilitiesFluent<?> fluent;
  Boolean validationEnabled;
  public V1Capabilities build() {
    V1Capabilities buildable = new V1Capabilities();
    buildable.setAdd(fluent.getAdd());
    buildable.setDrop(fluent.getDrop());
    return buildable;
  }
  
}