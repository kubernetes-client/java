package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CustomResourceDefinitionSpecBuilder extends V1CustomResourceDefinitionSpecFluent<V1CustomResourceDefinitionSpecBuilder> implements VisitableBuilder<V1CustomResourceDefinitionSpec,V1CustomResourceDefinitionSpecBuilder>{
  public V1CustomResourceDefinitionSpecBuilder() {
    this(new V1CustomResourceDefinitionSpec());
  }
  
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent) {
    this(fluent, new V1CustomResourceDefinitionSpec());
  }
  
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent,V1CustomResourceDefinitionSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CustomResourceDefinitionSpecFluent<?> fluent;
  
  public V1CustomResourceDefinitionSpec build() {
    V1CustomResourceDefinitionSpec buildable = new V1CustomResourceDefinitionSpec();
    buildable.setConversion(fluent.buildConversion());
    buildable.setGroup(fluent.getGroup());
    buildable.setNames(fluent.buildNames());
    buildable.setPreserveUnknownFields(fluent.getPreserveUnknownFields());
    buildable.setScope(fluent.getScope());
    buildable.setVersions(fluent.buildVersions());
    return buildable;
  }
  

}