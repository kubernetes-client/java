package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1VolumeAttributesClassListBuilder extends V1alpha1VolumeAttributesClassListFluent<V1alpha1VolumeAttributesClassListBuilder> implements VisitableBuilder<V1alpha1VolumeAttributesClassList,V1alpha1VolumeAttributesClassListBuilder>{
  public V1alpha1VolumeAttributesClassListBuilder() {
    this(new V1alpha1VolumeAttributesClassList());
  }
  
  public V1alpha1VolumeAttributesClassListBuilder(V1alpha1VolumeAttributesClassListFluent<?> fluent) {
    this(fluent, new V1alpha1VolumeAttributesClassList());
  }
  
  public V1alpha1VolumeAttributesClassListBuilder(V1alpha1VolumeAttributesClassListFluent<?> fluent,V1alpha1VolumeAttributesClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1VolumeAttributesClassListBuilder(V1alpha1VolumeAttributesClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1VolumeAttributesClassListFluent<?> fluent;
  
  public V1alpha1VolumeAttributesClassList build() {
    V1alpha1VolumeAttributesClassList buildable = new V1alpha1VolumeAttributesClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}