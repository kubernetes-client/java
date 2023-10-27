package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressClassParametersReferenceBuilder extends V1IngressClassParametersReferenceFluent<V1IngressClassParametersReferenceBuilder> implements VisitableBuilder<V1IngressClassParametersReference,V1IngressClassParametersReferenceBuilder>{
  public V1IngressClassParametersReferenceBuilder() {
    this(new V1IngressClassParametersReference());
  }
  
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent) {
    this(fluent, new V1IngressClassParametersReference());
  }
  
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent,V1IngressClassParametersReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressClassParametersReferenceFluent<?> fluent;
  
  public V1IngressClassParametersReference build() {
    V1IngressClassParametersReference buildable = new V1IngressClassParametersReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setScope(fluent.getScope());
    return buildable;
  }
  

}