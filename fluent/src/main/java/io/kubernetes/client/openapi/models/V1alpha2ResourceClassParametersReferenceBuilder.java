package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClassParametersReferenceBuilder extends V1alpha2ResourceClassParametersReferenceFluent<V1alpha2ResourceClassParametersReferenceBuilder> implements VisitableBuilder<V1alpha2ResourceClassParametersReference,V1alpha2ResourceClassParametersReferenceBuilder>{
  public V1alpha2ResourceClassParametersReferenceBuilder() {
    this(new V1alpha2ResourceClassParametersReference());
  }
  
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReferenceFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClassParametersReference());
  }
  
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReferenceFluent<?> fluent,V1alpha2ResourceClassParametersReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClassParametersReferenceFluent<?> fluent;
  
  public V1alpha2ResourceClassParametersReference build() {
    V1alpha2ResourceClassParametersReference buildable = new V1alpha2ResourceClassParametersReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  

}