package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClassListBuilder extends V1alpha2ResourceClassListFluentImpl<V1alpha2ResourceClassListBuilder> implements VisitableBuilder<V1alpha2ResourceClassList,V1alpha2ResourceClassListBuilder>{
  public V1alpha2ResourceClassListBuilder() {
    this(false);
  }
  public V1alpha2ResourceClassListBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClassList(), validationEnabled);
  }
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClassList(), validationEnabled);
  }
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassListFluent<?> fluent,V1alpha2ResourceClassList instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassListFluent<?> fluent,V1alpha2ResourceClassList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassList instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClassListBuilder(V1alpha2ResourceClassList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClassListFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClassList build() {
    V1alpha2ResourceClassList buildable = new V1alpha2ResourceClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}