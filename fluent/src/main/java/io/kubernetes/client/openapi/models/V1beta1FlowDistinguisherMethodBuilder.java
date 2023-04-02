package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1FlowDistinguisherMethodBuilder extends V1beta1FlowDistinguisherMethodFluentImpl<V1beta1FlowDistinguisherMethodBuilder> implements VisitableBuilder<V1beta1FlowDistinguisherMethod,V1beta1FlowDistinguisherMethodBuilder>{
  public V1beta1FlowDistinguisherMethodBuilder() {
    this(false);
  }
  public V1beta1FlowDistinguisherMethodBuilder(Boolean validationEnabled) {
    this(new V1beta1FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta1FlowDistinguisherMethodBuilder(V1beta1FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1FlowDistinguisherMethodBuilder(V1beta1FlowDistinguisherMethodFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta1FlowDistinguisherMethodBuilder(V1beta1FlowDistinguisherMethodFluent<?> fluent,V1beta1FlowDistinguisherMethod instance) {
    this(fluent, instance, false);
  }
  public V1beta1FlowDistinguisherMethodBuilder(V1beta1FlowDistinguisherMethodFluent<?> fluent,V1beta1FlowDistinguisherMethod instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1FlowDistinguisherMethodBuilder(V1beta1FlowDistinguisherMethod instance) {
    this(instance,false);
  }
  public V1beta1FlowDistinguisherMethodBuilder(V1beta1FlowDistinguisherMethod instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1FlowDistinguisherMethodFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1FlowDistinguisherMethod build() {
    V1beta1FlowDistinguisherMethod buildable = new V1beta1FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}