package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PreconditionsBuilder extends V1PreconditionsFluentImpl<V1PreconditionsBuilder> implements VisitableBuilder<V1Preconditions,V1PreconditionsBuilder>{
  public V1PreconditionsBuilder() {
    this(false);
  }
  public V1PreconditionsBuilder(Boolean validationEnabled) {
    this(new V1Preconditions(), validationEnabled);
  }
  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Preconditions(), validationEnabled);
  }
  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent,V1Preconditions instance) {
    this(fluent, instance, false);
  }
  public V1PreconditionsBuilder(V1PreconditionsFluent<?> fluent,V1Preconditions instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  public V1PreconditionsBuilder(V1Preconditions instance) {
    this(instance,false);
  }
  public V1PreconditionsBuilder(V1Preconditions instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withResourceVersion(instance.getResourceVersion());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  V1PreconditionsFluent<?> fluent;
  Boolean validationEnabled;
  public V1Preconditions build() {
    V1Preconditions buildable = new V1Preconditions();
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}