package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DeploymentConditionBuilder extends V1DeploymentConditionFluentImpl<V1DeploymentConditionBuilder> implements VisitableBuilder<V1DeploymentCondition,V1DeploymentConditionBuilder>{
  public V1DeploymentConditionBuilder() {
    this(false);
  }
  public V1DeploymentConditionBuilder(Boolean validationEnabled) {
    this(new V1DeploymentCondition(), validationEnabled);
  }
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DeploymentCondition(), validationEnabled);
  }
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent,V1DeploymentCondition instance) {
    this(fluent, instance, false);
  }
  public V1DeploymentConditionBuilder(V1DeploymentConditionFluent<?> fluent,V1DeploymentCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withLastUpdateTime(instance.getLastUpdateTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1DeploymentConditionBuilder(V1DeploymentCondition instance) {
    this(instance,false);
  }
  public V1DeploymentConditionBuilder(V1DeploymentCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withLastUpdateTime(instance.getLastUpdateTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1DeploymentConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1DeploymentCondition build() {
    V1DeploymentCondition buildable = new V1DeploymentCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setLastUpdateTime(fluent.getLastUpdateTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}