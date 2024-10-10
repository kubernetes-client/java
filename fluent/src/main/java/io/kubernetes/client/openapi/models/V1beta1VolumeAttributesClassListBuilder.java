package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1VolumeAttributesClassListBuilder extends V1beta1VolumeAttributesClassListFluent<V1beta1VolumeAttributesClassListBuilder> implements VisitableBuilder<V1beta1VolumeAttributesClassList,V1beta1VolumeAttributesClassListBuilder>{
  public V1beta1VolumeAttributesClassListBuilder() {
    this(new V1beta1VolumeAttributesClassList());
  }
  
  public V1beta1VolumeAttributesClassListBuilder(V1beta1VolumeAttributesClassListFluent<?> fluent) {
    this(fluent, new V1beta1VolumeAttributesClassList());
  }
  
  public V1beta1VolumeAttributesClassListBuilder(V1beta1VolumeAttributesClassListFluent<?> fluent,V1beta1VolumeAttributesClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1VolumeAttributesClassListBuilder(V1beta1VolumeAttributesClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1VolumeAttributesClassListFluent<?> fluent;
  
  public V1beta1VolumeAttributesClassList build() {
    V1beta1VolumeAttributesClassList buildable = new V1beta1VolumeAttributesClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}