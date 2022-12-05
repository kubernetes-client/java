package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceDefinitionSpecBuilder extends V1CustomResourceDefinitionSpecFluentImpl<V1CustomResourceDefinitionSpecBuilder> implements VisitableBuilder<V1CustomResourceDefinitionSpec,V1CustomResourceDefinitionSpecBuilder>{
  public V1CustomResourceDefinitionSpecBuilder() {
    this(false);
  }
  public V1CustomResourceDefinitionSpecBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionSpec(), validationEnabled);
  }
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionSpec(), validationEnabled);
  }
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent,V1CustomResourceDefinitionSpec instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpecFluent<?> fluent,V1CustomResourceDefinitionSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConversion(instance.getConversion());

    fluent.withGroup(instance.getGroup());

    fluent.withNames(instance.getNames());

    fluent.withPreserveUnknownFields(instance.getPreserveUnknownFields());

    fluent.withScope(instance.getScope());

    fluent.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpec instance) {
    this(instance,false);
  }
  public V1CustomResourceDefinitionSpecBuilder(V1CustomResourceDefinitionSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConversion(instance.getConversion());

    this.withGroup(instance.getGroup());

    this.withNames(instance.getNames());

    this.withPreserveUnknownFields(instance.getPreserveUnknownFields());

    this.withScope(instance.getScope());

    this.withVersions(instance.getVersions());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceDefinitionSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceDefinitionSpec build() {
    V1CustomResourceDefinitionSpec buildable = new V1CustomResourceDefinitionSpec();
    buildable.setConversion(fluent.getConversion());
    buildable.setGroup(fluent.getGroup());
    buildable.setNames(fluent.getNames());
    buildable.setPreserveUnknownFields(fluent.getPreserveUnknownFields());
    buildable.setScope(fluent.getScope());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }
  
}