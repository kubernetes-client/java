package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ScaleStatusBuilder extends V1ScaleStatusFluentImpl<V1ScaleStatusBuilder> implements VisitableBuilder<V1ScaleStatus,V1ScaleStatusBuilder>{
  public V1ScaleStatusBuilder() {
    this(false);
  }
  public V1ScaleStatusBuilder(Boolean validationEnabled) {
    this(new V1ScaleStatus(), validationEnabled);
  }
  public V1ScaleStatusBuilder(V1ScaleStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ScaleStatusBuilder(V1ScaleStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ScaleStatus(), validationEnabled);
  }
  public V1ScaleStatusBuilder(V1ScaleStatusFluent<?> fluent,V1ScaleStatus instance) {
    this(fluent, instance, false);
  }
  public V1ScaleStatusBuilder(V1ScaleStatusFluent<?> fluent,V1ScaleStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withReplicas(instance.getReplicas());

    fluent.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  public V1ScaleStatusBuilder(V1ScaleStatus instance) {
    this(instance,false);
  }
  public V1ScaleStatusBuilder(V1ScaleStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withReplicas(instance.getReplicas());

    this.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  V1ScaleStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1ScaleStatus build() {
    V1ScaleStatus buildable = new V1ScaleStatus();
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  
}