package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1CapacityRequestPolicyRangeBuilder extends V1beta1CapacityRequestPolicyRangeFluent<V1beta1CapacityRequestPolicyRangeBuilder> implements VisitableBuilder<V1beta1CapacityRequestPolicyRange,V1beta1CapacityRequestPolicyRangeBuilder>{

  V1beta1CapacityRequestPolicyRangeFluent<?> fluent;

  public V1beta1CapacityRequestPolicyRangeBuilder() {
    this(new V1beta1CapacityRequestPolicyRange());
  }
  
  public V1beta1CapacityRequestPolicyRangeBuilder(V1beta1CapacityRequestPolicyRangeFluent<?> fluent) {
    this(fluent, new V1beta1CapacityRequestPolicyRange());
  }
  
  public V1beta1CapacityRequestPolicyRangeBuilder(V1beta1CapacityRequestPolicyRange instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1CapacityRequestPolicyRangeBuilder(V1beta1CapacityRequestPolicyRangeFluent<?> fluent,V1beta1CapacityRequestPolicyRange instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1CapacityRequestPolicyRange build() {
    V1beta1CapacityRequestPolicyRange buildable = new V1beta1CapacityRequestPolicyRange();
    buildable.setMax(fluent.getMax());
    buildable.setMin(fluent.getMin());
    buildable.setStep(fluent.getStep());
    return buildable;
  }
  
}