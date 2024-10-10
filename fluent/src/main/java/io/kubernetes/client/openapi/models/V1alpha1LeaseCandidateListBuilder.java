package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1LeaseCandidateListBuilder extends V1alpha1LeaseCandidateListFluent<V1alpha1LeaseCandidateListBuilder> implements VisitableBuilder<V1alpha1LeaseCandidateList,V1alpha1LeaseCandidateListBuilder>{
  public V1alpha1LeaseCandidateListBuilder() {
    this(new V1alpha1LeaseCandidateList());
  }
  
  public V1alpha1LeaseCandidateListBuilder(V1alpha1LeaseCandidateListFluent<?> fluent) {
    this(fluent, new V1alpha1LeaseCandidateList());
  }
  
  public V1alpha1LeaseCandidateListBuilder(V1alpha1LeaseCandidateListFluent<?> fluent,V1alpha1LeaseCandidateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1LeaseCandidateListBuilder(V1alpha1LeaseCandidateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1LeaseCandidateListFluent<?> fluent;
  
  public V1alpha1LeaseCandidateList build() {
    V1alpha1LeaseCandidateList buildable = new V1alpha1LeaseCandidateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}