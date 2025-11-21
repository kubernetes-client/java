package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1CapacityRequestPolicyRangeBuilder extends V1CapacityRequestPolicyRangeFluent<V1CapacityRequestPolicyRangeBuilder> implements VisitableBuilder<V1CapacityRequestPolicyRange,V1CapacityRequestPolicyRangeBuilder>{

  V1CapacityRequestPolicyRangeFluent<?> fluent;

  public V1CapacityRequestPolicyRangeBuilder() {
    this(new V1CapacityRequestPolicyRange());
  }
  
  public V1CapacityRequestPolicyRangeBuilder(V1CapacityRequestPolicyRangeFluent<?> fluent) {
    this(fluent, new V1CapacityRequestPolicyRange());
  }
  
  public V1CapacityRequestPolicyRangeBuilder(V1CapacityRequestPolicyRange instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1CapacityRequestPolicyRangeBuilder(V1CapacityRequestPolicyRangeFluent<?> fluent,V1CapacityRequestPolicyRange instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1CapacityRequestPolicyRange build() {
    V1CapacityRequestPolicyRange buildable = new V1CapacityRequestPolicyRange();
    buildable.setMax(fluent.getMax());
    buildable.setMin(fluent.getMin());
    buildable.setStep(fluent.getStep());
    return buildable;
  }
  
}