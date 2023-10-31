package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3FlowDistinguisherMethodBuilder extends V1beta3FlowDistinguisherMethodFluent<V1beta3FlowDistinguisherMethodBuilder> implements VisitableBuilder<V1beta3FlowDistinguisherMethod,V1beta3FlowDistinguisherMethodBuilder>{
  public V1beta3FlowDistinguisherMethodBuilder() {
    this(new V1beta3FlowDistinguisherMethod());
  }
  
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, new V1beta3FlowDistinguisherMethod());
  }
  
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethodFluent<?> fluent,V1beta3FlowDistinguisherMethod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3FlowDistinguisherMethodBuilder(V1beta3FlowDistinguisherMethod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3FlowDistinguisherMethodFluent<?> fluent;
  
  public V1beta3FlowDistinguisherMethod build() {
    V1beta3FlowDistinguisherMethod buildable = new V1beta3FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}