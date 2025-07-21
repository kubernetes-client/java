package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1LeaseCandidateListBuilder extends V1beta1LeaseCandidateListFluent<V1beta1LeaseCandidateListBuilder> implements VisitableBuilder<V1beta1LeaseCandidateList,V1beta1LeaseCandidateListBuilder>{
  public V1beta1LeaseCandidateListBuilder() {
    this(new V1beta1LeaseCandidateList());
  }
  
  public V1beta1LeaseCandidateListBuilder(V1beta1LeaseCandidateListFluent<?> fluent) {
    this(fluent, new V1beta1LeaseCandidateList());
  }
  
  public V1beta1LeaseCandidateListBuilder(V1beta1LeaseCandidateListFluent<?> fluent,V1beta1LeaseCandidateList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1LeaseCandidateListBuilder(V1beta1LeaseCandidateList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1LeaseCandidateListFluent<?> fluent;
  
  public V1beta1LeaseCandidateList build() {
    V1beta1LeaseCandidateList buildable = new V1beta1LeaseCandidateList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}