package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3FlowDistinguisherMethodBuilder extends V1beta3FlowDistinguisherMethodFluentImpl<V1beta3FlowDistinguisherMethodBuilder> implements VisitableBuilder<V1beta3FlowDistinguisherMethod,V1beta3FlowDistinguisherMethodBuilder>{
  public V1beta3FlowDistinguisherMethodBuilder() {
    this(false);
  }
  public V1beta3FlowDistinguisherMethodBuilder(Boolean validationEnabled) {
    this(new V1beta3FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethodFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethodFluent<?> fluent,V1beta3FlowDistinguisherMethod instance) {
    this(fluent, instance, false);
  }
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethodFluent<?> fluent,V1beta3FlowDistinguisherMethod instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethod instance) {
    this(instance,false);
  }
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethod instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3FlowDistinguisherMethodFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3FlowDistinguisherMethod build() {
    V1beta3FlowDistinguisherMethod buildable = new V1beta3FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}