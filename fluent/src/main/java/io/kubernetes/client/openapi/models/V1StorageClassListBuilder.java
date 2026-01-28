package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1StorageClassListBuilder extends V1StorageClassListFluent<V1StorageClassListBuilder> implements VisitableBuilder<V1StorageClassList,V1StorageClassListBuilder>{

  V1StorageClassListFluent<?> fluent;

  public V1StorageClassListBuilder() {
    this(new V1StorageClassList());
  }
  
  public V1StorageClassListBuilder(V1StorageClassListFluent<?> fluent) {
    this(fluent, new V1StorageClassList());
  }
  
  public V1StorageClassListBuilder(V1StorageClassList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1StorageClassListBuilder(V1StorageClassListFluent<?> fluent,V1StorageClassList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1StorageClassList build() {
    V1StorageClassList buildable = new V1StorageClassList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}