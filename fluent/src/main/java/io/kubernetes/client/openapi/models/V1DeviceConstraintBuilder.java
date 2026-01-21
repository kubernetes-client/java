package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceConstraintBuilder extends V1DeviceConstraintFluent<V1DeviceConstraintBuilder> implements VisitableBuilder<V1DeviceConstraint,V1DeviceConstraintBuilder>{

  V1DeviceConstraintFluent<?> fluent;

  public V1DeviceConstraintBuilder() {
    this(new V1DeviceConstraint());
  }
  
  public V1DeviceConstraintBuilder(V1DeviceConstraintFluent<?> fluent) {
    this(fluent, new V1DeviceConstraint());
  }
  
  public V1DeviceConstraintBuilder(V1DeviceConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1DeviceConstraintBuilder(V1DeviceConstraintFluent<?> fluent,V1DeviceConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1DeviceConstraint build() {
    V1DeviceConstraint buildable = new V1DeviceConstraint();
    buildable.setDistinctAttribute(fluent.getDistinctAttribute());
    buildable.setMatchAttribute(fluent.getMatchAttribute());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}