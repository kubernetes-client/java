package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CustomResourceDefinitionListBuilder extends V1CustomResourceDefinitionListFluentImpl<V1CustomResourceDefinitionListBuilder> implements VisitableBuilder<V1CustomResourceDefinitionList,V1CustomResourceDefinitionListBuilder>{
  public V1CustomResourceDefinitionListBuilder() {
    this(false);
  }
  public V1CustomResourceDefinitionListBuilder(Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionList(), validationEnabled);
  }
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionList(), validationEnabled);
  }
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionListFluent<?> fluent,V1CustomResourceDefinitionList instance) {
    this(fluent, instance, false);
  }
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionListFluent<?> fluent,V1CustomResourceDefinitionList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionList instance) {
    this(instance,false);
  }
  public V1CustomResourceDefinitionListBuilder(V1CustomResourceDefinitionList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1CustomResourceDefinitionListFluent<?> fluent;
  Boolean validationEnabled;
  public V1CustomResourceDefinitionList build() {
    V1CustomResourceDefinitionList buildable = new V1CustomResourceDefinitionList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}