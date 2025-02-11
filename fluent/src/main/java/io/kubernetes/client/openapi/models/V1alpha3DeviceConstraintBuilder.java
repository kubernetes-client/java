package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3DeviceConstraintBuilder extends V1alpha3DeviceConstraintFluent<V1alpha3DeviceConstraintBuilder> implements VisitableBuilder<V1alpha3DeviceConstraint,V1alpha3DeviceConstraintBuilder>{
  public V1alpha3DeviceConstraintBuilder() {
    this(new V1alpha3DeviceConstraint());
  }
  
  public V1alpha3DeviceConstraintBuilder(V1alpha3DeviceConstraintFluent<?> fluent) {
    this(fluent, new V1alpha3DeviceConstraint());
  }
  
  public V1alpha3DeviceConstraintBuilder(V1alpha3DeviceConstraintFluent<?> fluent,V1alpha3DeviceConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3DeviceConstraintBuilder(V1alpha3DeviceConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3DeviceConstraintFluent<?> fluent;
  
  public V1alpha3DeviceConstraint build() {
    V1alpha3DeviceConstraint buildable = new V1alpha3DeviceConstraint();
    buildable.setMatchAttribute(fluent.getMatchAttribute());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}