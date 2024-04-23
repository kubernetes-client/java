package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClassBuilder extends V1alpha2ResourceClassFluent<V1alpha2ResourceClassBuilder> implements VisitableBuilder<V1alpha2ResourceClass,V1alpha2ResourceClassBuilder>{
  public V1alpha2ResourceClassBuilder() {
    this(new V1alpha2ResourceClass());
  }
  
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClassFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClass());
  }
  
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClassFluent<?> fluent,V1alpha2ResourceClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClassFluent<?> fluent;
  
  public V1alpha2ResourceClass build() {
    V1alpha2ResourceClass buildable = new V1alpha2ResourceClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setParametersRef(fluent.buildParametersRef());
    buildable.setStructuredParameters(fluent.getStructuredParameters());
    buildable.setSuitableNodes(fluent.buildSuitableNodes());
    return buildable;
  }
  

}