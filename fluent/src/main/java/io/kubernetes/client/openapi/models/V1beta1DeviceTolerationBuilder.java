package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1DeviceTolerationBuilder extends V1beta1DeviceTolerationFluent<V1beta1DeviceTolerationBuilder> implements VisitableBuilder<V1beta1DeviceToleration,V1beta1DeviceTolerationBuilder>{

  V1beta1DeviceTolerationFluent<?> fluent;

  public V1beta1DeviceTolerationBuilder() {
    this(new V1beta1DeviceToleration());
  }
  
  public V1beta1DeviceTolerationBuilder(V1beta1DeviceTolerationFluent<?> fluent) {
    this(fluent, new V1beta1DeviceToleration());
  }
  
  public V1beta1DeviceTolerationBuilder(V1beta1DeviceToleration instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1DeviceTolerationBuilder(V1beta1DeviceTolerationFluent<?> fluent,V1beta1DeviceToleration instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1DeviceToleration build() {
    V1beta1DeviceToleration buildable = new V1beta1DeviceToleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}