package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TolerationBuilder extends V1TolerationFluentImpl<V1TolerationBuilder> implements VisitableBuilder<V1Toleration,V1TolerationBuilder>{
  public V1TolerationBuilder() {
    this(false);
  }
  public V1TolerationBuilder(Boolean validationEnabled) {
    this(new V1Toleration(), validationEnabled);
  }
  public V1TolerationBuilder(V1TolerationFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TolerationBuilder(V1TolerationFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Toleration(), validationEnabled);
  }
  public V1TolerationBuilder(V1TolerationFluent<?> fluent,V1Toleration instance) {
    this(fluent, instance, false);
  }
  public V1TolerationBuilder(V1TolerationFluent<?> fluent,V1Toleration instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEffect(instance.getEffect());

    fluent.withKey(instance.getKey());

    fluent.withOperator(instance.getOperator());

    fluent.withTolerationSeconds(instance.getTolerationSeconds());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V1TolerationBuilder(V1Toleration instance) {
    this(instance,false);
  }
  public V1TolerationBuilder(V1Toleration instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withTolerationSeconds(instance.getTolerationSeconds());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V1TolerationFluent<?> fluent;
  Boolean validationEnabled;
  public V1Toleration build() {
    V1Toleration buildable = new V1Toleration();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setTolerationSeconds(fluent.getTolerationSeconds());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}