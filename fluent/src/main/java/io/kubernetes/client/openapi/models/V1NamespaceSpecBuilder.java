package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NamespaceSpecBuilder extends V1NamespaceSpecFluentImpl<V1NamespaceSpecBuilder> implements VisitableBuilder<V1NamespaceSpec,V1NamespaceSpecBuilder>{
  public V1NamespaceSpecBuilder() {
    this(false);
  }
  public V1NamespaceSpecBuilder(Boolean validationEnabled) {
    this(new V1NamespaceSpec(), validationEnabled);
  }
  public V1NamespaceSpecBuilder(V1NamespaceSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NamespaceSpecBuilder(V1NamespaceSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NamespaceSpec(), validationEnabled);
  }
  public V1NamespaceSpecBuilder(V1NamespaceSpecFluent<?> fluent,V1NamespaceSpec instance) {
    this(fluent, instance, false);
  }
  public V1NamespaceSpecBuilder(V1NamespaceSpecFluent<?> fluent,V1NamespaceSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFinalizers(instance.getFinalizers());

    this.validationEnabled = validationEnabled; 
  }
  public V1NamespaceSpecBuilder(V1NamespaceSpec instance) {
    this(instance,false);
  }
  public V1NamespaceSpecBuilder(V1NamespaceSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFinalizers(instance.getFinalizers());

    this.validationEnabled = validationEnabled; 
  }
  V1NamespaceSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1NamespaceSpec build() {
    V1NamespaceSpec buildable = new V1NamespaceSpec();
    buildable.setFinalizers(fluent.getFinalizers());
    return buildable;
  }
  
}