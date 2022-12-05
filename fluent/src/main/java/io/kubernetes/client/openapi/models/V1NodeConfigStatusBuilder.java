package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeConfigStatusBuilder extends V1NodeConfigStatusFluentImpl<V1NodeConfigStatusBuilder> implements VisitableBuilder<V1NodeConfigStatus,V1NodeConfigStatusBuilder>{
  public V1NodeConfigStatusBuilder() {
    this(false);
  }
  public V1NodeConfigStatusBuilder(Boolean validationEnabled) {
    this(new V1NodeConfigStatus(), validationEnabled);
  }
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeConfigStatus(), validationEnabled);
  }
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent,V1NodeConfigStatus instance) {
    this(fluent, instance, false);
  }
  public V1NodeConfigStatusBuilder(V1NodeConfigStatusFluent<?> fluent,V1NodeConfigStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withActive(instance.getActive());

    fluent.withAssigned(instance.getAssigned());

    fluent.withError(instance.getError());

    fluent.withLastKnownGood(instance.getLastKnownGood());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeConfigStatusBuilder(V1NodeConfigStatus instance) {
    this(instance,false);
  }
  public V1NodeConfigStatusBuilder(V1NodeConfigStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withActive(instance.getActive());

    this.withAssigned(instance.getAssigned());

    this.withError(instance.getError());

    this.withLastKnownGood(instance.getLastKnownGood());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeConfigStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeConfigStatus build() {
    V1NodeConfigStatus buildable = new V1NodeConfigStatus();
    buildable.setActive(fluent.getActive());
    buildable.setAssigned(fluent.getAssigned());
    buildable.setError(fluent.getError());
    buildable.setLastKnownGood(fluent.getLastKnownGood());
    return buildable;
  }
  
}