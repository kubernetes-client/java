package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimListBuilder extends V1alpha2ResourceClaimListFluentImpl<V1alpha2ResourceClaimListBuilder> implements VisitableBuilder<V1alpha2ResourceClaimList,V1alpha2ResourceClaimListBuilder>{
  public V1alpha2ResourceClaimListBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimListBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimList(), validationEnabled);
  }
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimList(), validationEnabled);
  }
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimListFluent<?> fluent,V1alpha2ResourceClaimList instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimListFluent<?> fluent,V1alpha2ResourceClaimList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimList instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimListBuilder(V1alpha2ResourceClaimList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimList build() {
    V1alpha2ResourceClaimList buildable = new V1alpha2ResourceClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}