package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2LeaseCandidateListBuilder extends V1alpha2LeaseCandidateListFluent<V1alpha2LeaseCandidateListBuilder> implements VisitableBuilder<V1alpha2LeaseCandidateList,V1alpha2LeaseCandidateListBuilder>{
  public V1alpha2LeaseCandidateListBuilder() {
    this(new V1alpha2LeaseCandidateList());
  }
  
  public V1alpha2LeaseCandidateListBuilder(V1alpha2LeaseCandidateListFluent<?> fluent) {
    this(fluent, new V1alpha2LeaseCandidateList());
  }
  
  public V1alpha2LeaseCandidateListBuilder(V1alpha2LeaseCandidateListFluent<?> fluent,V1alpha2LeaseCandidateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2LeaseCandidateListBuilder(V1alpha2LeaseCandidateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2LeaseCandidateListFluent<?> fluent;
  
  public V1alpha2LeaseCandidateList build() {
    V1alpha2LeaseCandidateList buildable = new V1alpha2LeaseCandidateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}