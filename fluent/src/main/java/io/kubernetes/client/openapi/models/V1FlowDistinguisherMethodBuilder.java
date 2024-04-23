package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlowDistinguisherMethodBuilder extends V1FlowDistinguisherMethodFluent<V1FlowDistinguisherMethodBuilder> implements VisitableBuilder<V1FlowDistinguisherMethod,V1FlowDistinguisherMethodBuilder>{
  public V1FlowDistinguisherMethodBuilder() {
    this(new V1FlowDistinguisherMethod());
  }
  
  public V1FlowDistinguisherMethodBuilder(V1FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, new V1FlowDistinguisherMethod());
  }
  
  public V1FlowDistinguisherMethodBuilder(V1FlowDistinguisherMethodFluent<?> fluent,V1FlowDistinguisherMethod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlowDistinguisherMethodBuilder(V1FlowDistinguisherMethod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlowDistinguisherMethodFluent<?> fluent;
  
  public V1FlowDistinguisherMethod build() {
    V1FlowDistinguisherMethod buildable = new V1FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}