package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1WorkloadListBuilder extends V1alpha1WorkloadListFluent<V1alpha1WorkloadListBuilder> implements VisitableBuilder<V1alpha1WorkloadList,V1alpha1WorkloadListBuilder>{

  V1alpha1WorkloadListFluent<?> fluent;

  public V1alpha1WorkloadListBuilder() {
    this(new V1alpha1WorkloadList());
  }
  
  public V1alpha1WorkloadListBuilder(V1alpha1WorkloadListFluent<?> fluent) {
    this(fluent, new V1alpha1WorkloadList());
  }
  
  public V1alpha1WorkloadListBuilder(V1alpha1WorkloadList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1WorkloadListBuilder(V1alpha1WorkloadListFluent<?> fluent,V1alpha1WorkloadList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1WorkloadList build() {
    V1alpha1WorkloadList buildable = new V1alpha1WorkloadList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}