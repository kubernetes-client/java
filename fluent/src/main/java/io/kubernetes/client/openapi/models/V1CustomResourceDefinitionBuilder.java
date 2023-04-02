package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceDefinitionBuilder extends V1CustomResourceDefinitionFluentImpl<V1CustomResourceDefinitionBuilder> implements VisitableBuilder<V1CustomResourceDefinition,V1CustomResourceDefinitionBuilder>{
  public V1CustomResourceDefinitionBuilder() {
    this(false);
  }
  public V1CustomResourceDefinitionBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinition(), validationEnabled);
  }
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinitionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinitionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinition(), validationEnabled);
  }
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinitionFluent<?> fluent,V1CustomResourceDefinition instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinitionFluent<?> fluent,V1CustomResourceDefinition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinition instance) {
    this(instance,false);
  }
  public V1CustomResourceDefinitionBuilder(V1CustomResourceDefinition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceDefinitionFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceDefinition build() {
    V1CustomResourceDefinition buildable = new V1CustomResourceDefinition();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}