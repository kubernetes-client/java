package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1DeviceConstraintBuilder extends V1beta1DeviceConstraintFluent<V1beta1DeviceConstraintBuilder> implements VisitableBuilder<V1beta1DeviceConstraint,V1beta1DeviceConstraintBuilder>{
  public V1beta1DeviceConstraintBuilder() {
    this(new V1beta1DeviceConstraint());
  }
  
  public V1beta1DeviceConstraintBuilder(V1beta1DeviceConstraintFluent<?> fluent) {
    this(fluent, new V1beta1DeviceConstraint());
  }
  
  public V1beta1DeviceConstraintBuilder(V1beta1DeviceConstraintFluent<?> fluent,V1beta1DeviceConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1DeviceConstraintBuilder(V1beta1DeviceConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1DeviceConstraintFluent<?> fluent;
  
  public V1beta1DeviceConstraint build() {
    V1beta1DeviceConstraint buildable = new V1beta1DeviceConstraint();
    buildable.setMatchAttribute(fluent.getMatchAttribute());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}