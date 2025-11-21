package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceConstraintBuilder extends V1beta2DeviceConstraintFluent<V1beta2DeviceConstraintBuilder> implements VisitableBuilder<V1beta2DeviceConstraint,V1beta2DeviceConstraintBuilder>{

  V1beta2DeviceConstraintFluent<?> fluent;

  public V1beta2DeviceConstraintBuilder() {
    this(new V1beta2DeviceConstraint());
  }
  
  public V1beta2DeviceConstraintBuilder(V1beta2DeviceConstraintFluent<?> fluent) {
    this(fluent, new V1beta2DeviceConstraint());
  }
  
  public V1beta2DeviceConstraintBuilder(V1beta2DeviceConstraint instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2DeviceConstraintBuilder(V1beta2DeviceConstraintFluent<?> fluent,V1beta2DeviceConstraint instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2DeviceConstraint build() {
    V1beta2DeviceConstraint buildable = new V1beta2DeviceConstraint();
    buildable.setDistinctAttribute(fluent.getDistinctAttribute());
    buildable.setMatchAttribute(fluent.getMatchAttribute());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}