package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimTemplateListBuilder extends V1alpha2ResourceClaimTemplateListFluentImpl<V1alpha2ResourceClaimTemplateListBuilder> implements VisitableBuilder<V1alpha2ResourceClaimTemplateList,V1alpha2ResourceClaimTemplateListBuilder>{
  public V1alpha2ResourceClaimTemplateListBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimTemplateListBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimTemplateList(), validationEnabled);
  }
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimTemplateList(), validationEnabled);
  }
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateListFluent<?> fluent,V1alpha2ResourceClaimTemplateList instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateListFluent<?> fluent,V1alpha2ResourceClaimTemplateList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateList instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimTemplateListBuilder(V1alpha2ResourceClaimTemplateList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimTemplateListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimTemplateList build() {
    V1alpha2ResourceClaimTemplateList buildable = new V1alpha2ResourceClaimTemplateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}