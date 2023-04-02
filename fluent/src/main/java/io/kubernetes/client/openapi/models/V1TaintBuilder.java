package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1TaintBuilder extends V1TaintFluentImpl<V1TaintBuilder> implements VisitableBuilder<V1Taint,V1TaintBuilder>{
  public V1TaintBuilder() {
    this(false);
  }
  public V1TaintBuilder(Boolean validationEnabled) {
    this(new V1Taint(), validationEnabled);
  }
  public V1TaintBuilder(V1TaintFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TaintBuilder(V1TaintFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Taint(), validationEnabled);
  }
  public V1TaintBuilder(V1TaintFluent<?> fluent,V1Taint instance) {
    this(fluent, instance, false);
  }
  public V1TaintBuilder(V1TaintFluent<?> fluent,V1Taint instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEffect(instance.getEffect());

    fluent.withKey(instance.getKey());

    fluent.withTimeAdded(instance.getTimeAdded());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V1TaintBuilder(V1Taint instance) {
    this(instance,false);
  }
  public V1TaintBuilder(V1Taint instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withEffect(instance.getEffect());

    this.withKey(instance.getKey());

    this.withTimeAdded(instance.getTimeAdded());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V1TaintFluent<?> fluent;
  Boolean validationEnabled;
  public V1Taint build() {
    V1Taint buildable = new V1Taint();
    buildable.setEffect(fluent.getEffect());
    buildable.setKey(fluent.getKey());
    buildable.setTimeAdded(fluent.getTimeAdded());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}