package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2CapacityRequestPolicyRangeBuilder extends V1beta2CapacityRequestPolicyRangeFluent<V1beta2CapacityRequestPolicyRangeBuilder> implements VisitableBuilder<V1beta2CapacityRequestPolicyRange,V1beta2CapacityRequestPolicyRangeBuilder>{

  V1beta2CapacityRequestPolicyRangeFluent<?> fluent;

  public V1beta2CapacityRequestPolicyRangeBuilder() {
    this(new V1beta2CapacityRequestPolicyRange());
  }
  
  public V1beta2CapacityRequestPolicyRangeBuilder(V1beta2CapacityRequestPolicyRangeFluent<?> fluent) {
    this(fluent, new V1beta2CapacityRequestPolicyRange());
  }
  
  public V1beta2CapacityRequestPolicyRangeBuilder(V1beta2CapacityRequestPolicyRange instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2CapacityRequestPolicyRangeBuilder(V1beta2CapacityRequestPolicyRangeFluent<?> fluent,V1beta2CapacityRequestPolicyRange instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2CapacityRequestPolicyRange build() {
    V1beta2CapacityRequestPolicyRange buildable = new V1beta2CapacityRequestPolicyRange();
    buildable.setMax(fluent.getMax());
    buildable.setMin(fluent.getMin());
    buildable.setStep(fluent.getStep());
    return buildable;
  }
  
}