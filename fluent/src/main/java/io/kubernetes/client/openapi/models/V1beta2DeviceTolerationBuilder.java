package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2DeviceTolerationBuilder extends V1beta2DeviceTolerationFluent<V1beta2DeviceTolerationBuilder> implements VisitableBuilder<V1beta2DeviceToleration,V1beta2DeviceTolerationBuilder>{
  public V1beta2DeviceTolerationBuilder() {
    this(new V1beta2DeviceToleration());
  }
  
  public V1beta2DeviceTolerationBuilder(V1beta2DeviceTolerationFluent<?> fluent) {
    this(fluent, new V1beta2DeviceToleration());
  }
  
  public V1beta2DeviceTolerationBuilder(V1beta2DeviceTolerationFluent<?> fluent,V1beta2DeviceToleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2DeviceTolerationBuilder(V1beta2DeviceToleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2DeviceTolerationFluent<?> fluent;
  
  public V1beta2DeviceToleration build() {
    V1beta2DeviceToleration buildable = new V1beta2DeviceToleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}