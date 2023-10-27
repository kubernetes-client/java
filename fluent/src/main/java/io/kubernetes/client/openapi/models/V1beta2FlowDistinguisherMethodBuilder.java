package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2FlowDistinguisherMethodBuilder extends V1beta2FlowDistinguisherMethodFluent<V1beta2FlowDistinguisherMethodBuilder> implements VisitableBuilder<V1beta2FlowDistinguisherMethod,V1beta2FlowDistinguisherMethodBuilder>{
  public V1beta2FlowDistinguisherMethodBuilder() {
    this(new V1beta2FlowDistinguisherMethod());
  }
  
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, new V1beta2FlowDistinguisherMethod());
  }
  
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethodFluent<?> fluent,V1beta2FlowDistinguisherMethod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2FlowDistinguisherMethodBuilder(V1beta2FlowDistinguisherMethod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2FlowDistinguisherMethodFluent<?> fluent;
  
  public V1beta2FlowDistinguisherMethod build() {
    V1beta2FlowDistinguisherMethod buildable = new V1beta2FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}