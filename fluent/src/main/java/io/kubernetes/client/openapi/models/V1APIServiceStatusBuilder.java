package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIServiceStatusBuilder extends V1APIServiceStatusFluentImpl<V1APIServiceStatusBuilder> implements VisitableBuilder<V1APIServiceStatus,V1APIServiceStatusBuilder>{
  public V1APIServiceStatusBuilder() {
    this(false);
  }
  public V1APIServiceStatusBuilder(Boolean validationEnabled) {
    this(new V1APIServiceStatus(), validationEnabled);
  }
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIServiceStatus(), validationEnabled);
  }
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent,V1APIServiceStatus instance) {
    this(fluent, instance, false);
  }
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent,V1APIServiceStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIServiceStatusBuilder(V1APIServiceStatus instance) {
    this(instance,false);
  }
  public V1APIServiceStatusBuilder(V1APIServiceStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1APIServiceStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1APIServiceStatus build() {
    V1APIServiceStatus buildable = new V1APIServiceStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}