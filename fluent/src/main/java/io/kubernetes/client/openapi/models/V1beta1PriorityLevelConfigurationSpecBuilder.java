package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1PriorityLevelConfigurationSpecBuilder extends V1beta1PriorityLevelConfigurationSpecFluentImpl<V1beta1PriorityLevelConfigurationSpecBuilder> implements VisitableBuilder<V1beta1PriorityLevelConfigurationSpec,V1beta1PriorityLevelConfigurationSpecBuilder>{
  public V1beta1PriorityLevelConfigurationSpecBuilder() {
    this(false);
  }
  public V1beta1PriorityLevelConfigurationSpecBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationSpecBuilder(V1beta1PriorityLevelConfigurationSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PriorityLevelConfigurationSpecBuilder(V1beta1PriorityLevelConfigurationSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationSpec(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationSpecBuilder(V1beta1PriorityLevelConfigurationSpecFluent<?> fluent,V1beta1PriorityLevelConfigurationSpec instance) {
    this(fluent, instance, false);
  }
  public V1beta1PriorityLevelConfigurationSpecBuilder(V1beta1PriorityLevelConfigurationSpecFluent<?> fluent,V1beta1PriorityLevelConfigurationSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLimited(instance.getLimited());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PriorityLevelConfigurationSpecBuilder(V1beta1PriorityLevelConfigurationSpec instance) {
    this(instance,false);
  }
  public V1beta1PriorityLevelConfigurationSpecBuilder(V1beta1PriorityLevelConfigurationSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLimited(instance.getLimited());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1PriorityLevelConfigurationSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1PriorityLevelConfigurationSpec build() {
    V1beta1PriorityLevelConfigurationSpec buildable = new V1beta1PriorityLevelConfigurationSpec();
    buildable.setLimited(fluent.getLimited());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}