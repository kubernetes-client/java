package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ObjectReferenceBuilder extends V1ObjectReferenceFluent<V1ObjectReferenceBuilder> implements VisitableBuilder<V1ObjectReference,V1ObjectReferenceBuilder>{
  public V1ObjectReferenceBuilder() {
    this(new V1ObjectReference());
  }
  
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent) {
    this(fluent, new V1ObjectReference());
  }
  
  public V1ObjectReferenceBuilder(V1ObjectReferenceFluent<?> fluent,V1ObjectReference instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ObjectReferenceBuilder(V1ObjectReference instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ObjectReferenceFluent<?> fluent;
  
  public V1ObjectReference build() {
    V1ObjectReference buildable = new V1ObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setFieldPath(fluent.getFieldPath());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}