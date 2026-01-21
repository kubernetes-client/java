package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1VolumeAttributesClassListBuilder extends V1VolumeAttributesClassListFluent<V1VolumeAttributesClassListBuilder> implements VisitableBuilder<V1VolumeAttributesClassList,V1VolumeAttributesClassListBuilder>{

  V1VolumeAttributesClassListFluent<?> fluent;

  public V1VolumeAttributesClassListBuilder() {
    this(new V1VolumeAttributesClassList());
  }
  
  public V1VolumeAttributesClassListBuilder(V1VolumeAttributesClassListFluent<?> fluent) {
    this(fluent, new V1VolumeAttributesClassList());
  }
  
  public V1VolumeAttributesClassListBuilder(V1VolumeAttributesClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeAttributesClassListBuilder(V1VolumeAttributesClassListFluent<?> fluent,V1VolumeAttributesClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1VolumeAttributesClassList build() {
    V1VolumeAttributesClassList buildable = new V1VolumeAttributesClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}