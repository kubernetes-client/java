package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ComponentStatusBuilder extends V1ComponentStatusFluentImpl<V1ComponentStatusBuilder> implements VisitableBuilder<V1ComponentStatus,V1ComponentStatusBuilder>{
  public V1ComponentStatusBuilder() {
    this(false);
  }
  public V1ComponentStatusBuilder(Boolean validationEnabled) {
    this(new V1ComponentStatus(), validationEnabled);
  }
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ComponentStatus(), validationEnabled);
  }
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent,V1ComponentStatus instance) {
    this(fluent, instance, false);
  }
  public V1ComponentStatusBuilder(V1ComponentStatusFluent<?> fluent,V1ComponentStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withConditions(instance.getConditions());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ComponentStatusBuilder(V1ComponentStatus instance) {
    this(instance,false);
  }
  public V1ComponentStatusBuilder(V1ComponentStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withConditions(instance.getConditions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1ComponentStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1ComponentStatus build() {
    V1ComponentStatus buildable = new V1ComponentStatus();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setConditions(fluent.getConditions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}