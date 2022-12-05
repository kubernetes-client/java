package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ObjectMetaBuilder extends V1ObjectMetaFluentImpl<V1ObjectMetaBuilder> implements VisitableBuilder<V1ObjectMeta,V1ObjectMetaBuilder>{
  public V1ObjectMetaBuilder() {
    this(false);
  }
  public V1ObjectMetaBuilder(Boolean validationEnabled) {
    this(new V1ObjectMeta(), validationEnabled);
  }
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ObjectMeta(), validationEnabled);
  }
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent,V1ObjectMeta instance) {
    this(fluent, instance, false);
  }
  public V1ObjectMetaBuilder(V1ObjectMetaFluent<?> fluent,V1ObjectMeta instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAnnotations(instance.getAnnotations());

    fluent.withCreationTimestamp(instance.getCreationTimestamp());

    fluent.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds());

    fluent.withDeletionTimestamp(instance.getDeletionTimestamp());

    fluent.withFinalizers(instance.getFinalizers());

    fluent.withGenerateName(instance.getGenerateName());

    fluent.withGeneration(instance.getGeneration());

    fluent.withLabels(instance.getLabels());

    fluent.withManagedFields(instance.getManagedFields());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withOwnerReferences(instance.getOwnerReferences());

    fluent.withResourceVersion(instance.getResourceVersion());

    fluent.withSelfLink(instance.getSelfLink());

    fluent.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  public V1ObjectMetaBuilder(V1ObjectMeta instance) {
    this(instance,false);
  }
  public V1ObjectMetaBuilder(V1ObjectMeta instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAnnotations(instance.getAnnotations());

    this.withCreationTimestamp(instance.getCreationTimestamp());

    this.withDeletionGracePeriodSeconds(instance.getDeletionGracePeriodSeconds());

    this.withDeletionTimestamp(instance.getDeletionTimestamp());

    this.withFinalizers(instance.getFinalizers());

    this.withGenerateName(instance.getGenerateName());

    this.withGeneration(instance.getGeneration());

    this.withLabels(instance.getLabels());

    this.withManagedFields(instance.getManagedFields());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withOwnerReferences(instance.getOwnerReferences());

    this.withResourceVersion(instance.getResourceVersion());

    this.withSelfLink(instance.getSelfLink());

    this.withUid(instance.getUid());

    this.validationEnabled = validationEnabled; 
  }
  V1ObjectMetaFluent<?> fluent;
  Boolean validationEnabled;
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
    buildable.setManagedFields(fluent.getManagedFields());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setOwnerReferences(fluent.getOwnerReferences());
    buildable.setResourceVersion(fluent.getResourceVersion());
    buildable.setSelfLink(fluent.getSelfLink());
    buildable.setUid(fluent.getUid());
    return buildable;
  }
  
}