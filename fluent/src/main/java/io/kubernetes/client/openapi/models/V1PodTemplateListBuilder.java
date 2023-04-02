package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodTemplateListBuilder extends V1PodTemplateListFluentImpl<V1PodTemplateListBuilder> implements VisitableBuilder<V1PodTemplateList,V1PodTemplateListBuilder>{
  public V1PodTemplateListBuilder() {
    this(false);
  }
  public V1PodTemplateListBuilder(Boolean validationEnabled) {
    this(new V1PodTemplateList(), validationEnabled);
  }
  public V1PodTemplateListBuilder(V1PodTemplateListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodTemplateListBuilder(V1PodTemplateListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodTemplateList(), validationEnabled);
  }
  public V1PodTemplateListBuilder(V1PodTemplateListFluent<?> fluent,V1PodTemplateList instance) {
    this(fluent, instance, false);
  }
  public V1PodTemplateListBuilder(V1PodTemplateListFluent<?> fluent,V1PodTemplateList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodTemplateListBuilder(V1PodTemplateList instance) {
    this(instance,false);
  }
  public V1PodTemplateListBuilder(V1PodTemplateList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1PodTemplateListFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodTemplateList build() {
    V1PodTemplateList buildable = new V1PodTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}