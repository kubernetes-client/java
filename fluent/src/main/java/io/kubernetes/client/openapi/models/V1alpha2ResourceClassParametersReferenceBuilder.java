package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClassParametersReferenceBuilder extends V1alpha2ResourceClassParametersReferenceFluentImpl<V1alpha2ResourceClassParametersReferenceBuilder> implements VisitableBuilder<V1alpha2ResourceClassParametersReference,V1alpha2ResourceClassParametersReferenceBuilder>{
  public V1alpha2ResourceClassParametersReferenceBuilder() {
    this(false);
  }
  public V1alpha2ResourceClassParametersReferenceBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClassParametersReference(), validationEnabled);
  }
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClassParametersReference(), validationEnabled);
  }
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReferenceFluent<?> fluent,V1alpha2ResourceClassParametersReference instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReferenceFluent<?> fluent,V1alpha2ResourceClassParametersReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiGroup(instance.getApiGroup());
      fluent.withKind(instance.getKind());
      fluent.withName(instance.getName());
      fluent.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReference instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClassParametersReferenceBuilder(V1alpha2ResourceClassParametersReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiGroup(instance.getApiGroup());
      this.withKind(instance.getKind());
      this.withName(instance.getName());
      this.withNamespace(instance.getNamespace());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClassParametersReferenceFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClassParametersReference build() {
    V1alpha2ResourceClassParametersReference buildable = new V1alpha2ResourceClassParametersReference();
    buildable.setApiGroup(fluent.getApiGroup());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
  
}