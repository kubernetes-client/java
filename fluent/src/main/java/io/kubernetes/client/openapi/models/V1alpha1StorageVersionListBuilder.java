package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1StorageVersionListBuilder extends V1alpha1StorageVersionListFluent<V1alpha1StorageVersionListBuilder> implements VisitableBuilder<V1alpha1StorageVersionList,V1alpha1StorageVersionListBuilder>{
  public V1alpha1StorageVersionListBuilder() {
    this(new V1alpha1StorageVersionList());
  }
  
  public V1alpha1StorageVersionListBuilder(V1alpha1StorageVersionListFluent<?> fluent) {
    this(fluent, new V1alpha1StorageVersionList());
  }
  
  public V1alpha1StorageVersionListBuilder(V1alpha1StorageVersionListFluent<?> fluent,V1alpha1StorageVersionList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1StorageVersionListBuilder(V1alpha1StorageVersionList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1StorageVersionListFluent<?> fluent;
  
  public V1alpha1StorageVersionList build() {
    V1alpha1StorageVersionList buildable = new V1alpha1StorageVersionList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}