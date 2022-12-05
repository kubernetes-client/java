package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EndpointHintsBuilder extends V1EndpointHintsFluentImpl<V1EndpointHintsBuilder> implements VisitableBuilder<V1EndpointHints,V1EndpointHintsBuilder>{
  public V1EndpointHintsBuilder() {
    this(false);
  }
  public V1EndpointHintsBuilder(Boolean validationEnabled) {
    this(new V1EndpointHints(), validationEnabled);
  }
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EndpointHints(), validationEnabled);
  }
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent,V1EndpointHints instance) {
    this(fluent, instance, false);
  }
  public V1EndpointHintsBuilder(V1EndpointHintsFluent<?> fluent,V1EndpointHints instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointHintsBuilder(V1EndpointHints instance) {
    this(instance,false);
  }
  public V1EndpointHintsBuilder(V1EndpointHints instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled; 
  }
  V1EndpointHintsFluent<?> fluent;
  Boolean validationEnabled;
  public V1EndpointHints build() {
    V1EndpointHints buildable = new V1EndpointHints();
    buildable.setForZones(fluent.getForZones());
    return buildable;
  }
  
}