package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1IngressClassParametersReferenceBuilder extends V1IngressClassParametersReferenceFluentImpl<V1IngressClassParametersReferenceBuilder> implements VisitableBuilder<V1IngressClassParametersReference,V1IngressClassParametersReferenceBuilder>{
  public V1IngressClassParametersReferenceBuilder() {
    this(false);
  }
  public V1IngressClassParametersReferenceBuilder(Boolean validationEnabled) {
    this(new V1IngressClassParametersReference(), validationEnabled);
  }
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1IngressClassParametersReference(), validationEnabled);
  }
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent,V1IngressClassParametersReference instance) {
    this(fluent, instance, false);
  }
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReferenceFluent<?> fluent,V1IngressClassParametersReference instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroup(instance.getApiGroup());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withScope(instance.getScope());

    this.validationEnabled = validationEnabled; 
  }
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReference instance) {
    this(instance,false);
  }
  public V1IngressClassParametersReferenceBuilder(V1IngressClassParametersReference instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withScope(instance.getScope());

    this.validationEnabled = validationEnabled; 
  }
  V1IngressClassParametersReferenceFluent<?> fluent;
  Boolean validationEnabled;
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