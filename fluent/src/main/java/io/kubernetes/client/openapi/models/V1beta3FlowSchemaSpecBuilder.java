package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3FlowSchemaSpecBuilder extends V1beta3FlowSchemaSpecFluentImpl<V1beta3FlowSchemaSpecBuilder> implements VisitableBuilder<V1beta3FlowSchemaSpec,V1beta3FlowSchemaSpecBuilder>{
  public V1beta3FlowSchemaSpecBuilder() {
    this(false);
  }
  public V1beta3FlowSchemaSpecBuilder(Boolean validationEnabled) {
    this(new V1beta3FlowSchemaSpec(), validationEnabled);
  }
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3FlowSchemaSpec(), validationEnabled);
  }
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpecFluent<?> fluent,V1beta3FlowSchemaSpec instance) {
    this(fluent, instance, false);
  }
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpecFluent<?> fluent,V1beta3FlowSchemaSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withDistinguisherMethod(instance.getDistinguisherMethod());
      fluent.withMatchingPrecedence(instance.getMatchingPrecedence());
      fluent.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());
      fluent.withRules(instance.getRules());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpec instance) {
    this(instance,false);
  }
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withDistinguisherMethod(instance.getDistinguisherMethod());
      this.withMatchingPrecedence(instance.getMatchingPrecedence());
      this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());
      this.withRules(instance.getRules());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3FlowSchemaSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3FlowSchemaSpec build() {
    V1beta3FlowSchemaSpec buildable = new V1beta3FlowSchemaSpec();
    buildable.setDistinguisherMethod(fluent.getDistinguisherMethod());
    buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
    buildable.setPriorityLevelConfiguration(fluent.getPriorityLevelConfiguration());
    buildable.setRules(fluent.getRules());
    return buildable;
  }
  
}