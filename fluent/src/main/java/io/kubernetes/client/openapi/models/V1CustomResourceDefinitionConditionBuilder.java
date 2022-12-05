package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceDefinitionConditionBuilder extends V1CustomResourceDefinitionConditionFluentImpl<V1CustomResourceDefinitionConditionBuilder> implements VisitableBuilder<V1CustomResourceDefinitionCondition,V1CustomResourceDefinitionConditionBuilder>{
  public V1CustomResourceDefinitionConditionBuilder() {
    this(false);
  }
  public V1CustomResourceDefinitionConditionBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionCondition(), validationEnabled);
  }
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionCondition(), validationEnabled);
  }
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent,V1CustomResourceDefinitionCondition instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionConditionFluent<?> fluent,V1CustomResourceDefinitionCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionCondition instance) {
    this(instance,false);
  }
  public V1CustomResourceDefinitionConditionBuilder(V1CustomResourceDefinitionCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceDefinitionConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceDefinitionCondition build() {
    V1CustomResourceDefinitionCondition buildable = new V1CustomResourceDefinitionCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}