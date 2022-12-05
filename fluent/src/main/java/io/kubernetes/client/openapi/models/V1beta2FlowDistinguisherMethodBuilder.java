package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2FlowDistinguisherMethodBuilder extends V1beta2FlowDistinguisherMethodFluentImpl<V1beta2FlowDistinguisherMethodBuilder> implements VisitableBuilder<V1beta2FlowDistinguisherMethod,V1beta2FlowDistinguisherMethodBuilder>{
  public V1beta2FlowDistinguisherMethodBuilder() {
    this(false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethodFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethodFluent<?> fluent,V1beta2FlowDistinguisherMethod instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethodFluent<?> fluent,V1beta2FlowDistinguisherMethod instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethod instance) {
    this(instance,false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethod instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2FlowDistinguisherMethodFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2FlowDistinguisherMethod build() {
    V1beta2FlowDistinguisherMethod buildable = new V1beta2FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}