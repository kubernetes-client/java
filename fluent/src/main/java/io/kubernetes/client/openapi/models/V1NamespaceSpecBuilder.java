package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NamespaceSpecBuilder extends V1NamespaceSpecFluent<V1NamespaceSpecBuilder> implements VisitableBuilder<V1NamespaceSpec,V1NamespaceSpecBuilder>{
  public V1NamespaceSpecBuilder() {
    this(new V1NamespaceSpec());
  }
  
  public V1NamespaceSpecBuilder(V1NamespaceSpecFluent<?> fluent) {
    this(fluent, new V1NamespaceSpec());
  }
  
  public V1NamespaceSpecBuilder(V1NamespaceSpecFluent<?> fluent,V1NamespaceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NamespaceSpecBuilder(V1NamespaceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NamespaceSpecFluent<?> fluent;
  
  public V1NamespaceSpec build() {
    V1NamespaceSpec buildable = new V1NamespaceSpec();
    buildable.setFinalizers(fluent.getFinalizers());
    return buildable;
  }
  

}