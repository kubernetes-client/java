package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ObjectMetaBuilder extends V1ObjectMetaFluent<V1ObjectMetaBuilder> implements VisitableBuilder<V1ObjectMeta,V1ObjectMetaBuilder>{
  public V1ObjectMetaBuilder() {
    this(new V1ObjectMeta());
  }
  
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent) {
    this(fluent, new V1ObjectMeta());
  }
  
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent,V1ObjectMeta instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ObjectMetaBuilder(V1ObjectMeta instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ObjectMetaFluent<?> fluent;
  
  public V1ObjectMeta build() {
    V1ObjectMeta buildable = new V1ObjectMeta();
    buildable.setAnnotations(fluent.getAnnotations());
    buildable.setCreationTimestamp(fluent.getCreationTimestamp());
    buildable.setDeletionGracePeriodSeconds(fluent.getDeletionGracePeriodSeconds());
    buildable.setDeletionTimestamp(fluent.getDeletionTimestamp());
    buildable.setFinalizers(fluent.getFinalizers());
    buildable.setGenerateName(fluent.getGenerateName());
    buildable.setGeneration(fluent.getGeneration());
    buildable.setLabels(fluent.getLabels());
    buildable.setManagedFields(fluent.buildManagedFields());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setOwnerReferences(fluent.buildOwnerReferences());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setSelfLink(fluent.getSelfLink());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  

}