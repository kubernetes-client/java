package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1APIServiceConditionBuilder extends V1APIServiceConditionFluentImpl<V1APIServiceConditionBuilder> implements VisitableBuilder<V1APIServiceCondition,V1APIServiceConditionBuilder>{
  public V1APIServiceConditionBuilder() {
    this(false);
  }
  public V1APIServiceConditionBuilder(Boolean validationEnabled) {
    this(new V1APIServiceCondition(), validationEnabled);
  }
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1APIServiceCondition(), validationEnabled);
  }
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent,V1APIServiceCondition instance) {
    this(fluent, instance, false);
  }
  public V1APIServiceConditionBuilder(V1APIServiceConditionFluent<?> fluent,V1APIServiceCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1APIServiceConditionBuilder(V1APIServiceCondition instance) {
    this(instance,false);
  }
  public V1APIServiceConditionBuilder(V1APIServiceCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1APIServiceConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1APIServiceCondition build() {
    V1APIServiceCondition buildable = new V1APIServiceCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}