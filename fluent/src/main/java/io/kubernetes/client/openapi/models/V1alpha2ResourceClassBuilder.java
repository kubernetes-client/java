package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClassBuilder extends V1alpha2ResourceClassFluentImpl<V1alpha2ResourceClassBuilder> implements VisitableBuilder<V1alpha2ResourceClass,V1alpha2ResourceClassBuilder>{
  public V1alpha2ResourceClassBuilder() {
    this(false);
  }
  public V1alpha2ResourceClassBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClass(), validationEnabled);
  }
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClassFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClassFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClass(), validationEnabled);
  }
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClassFluent<?> fluent,V1alpha2ResourceClass instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClassFluent<?> fluent,V1alpha2ResourceClass instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withDriverName(instance.getDriverName());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withParametersRef(instance.getParametersRef());
      fluent.withSuitableNodes(instance.getSuitableNodes());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClass instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClassBuilder(V1alpha2ResourceClass instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withDriverName(instance.getDriverName());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withParametersRef(instance.getParametersRef());
      this.withSuitableNodes(instance.getSuitableNodes());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClassFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClass build() {
    V1alpha2ResourceClass buildable = new V1alpha2ResourceClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setParametersRef(fluent.getParametersRef());
    buildable.setSuitableNodes(fluent.getSuitableNodes());
    return buildable;
  }
  
}