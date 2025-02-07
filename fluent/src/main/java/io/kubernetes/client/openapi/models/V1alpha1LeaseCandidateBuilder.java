package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1LeaseCandidateBuilder extends V1alpha1LeaseCandidateFluent<V1alpha1LeaseCandidateBuilder> implements VisitableBuilder<V1alpha1LeaseCandidate,V1alpha1LeaseCandidateBuilder>{
  public V1alpha1LeaseCandidateBuilder() {
    this(new V1alpha1LeaseCandidate());
  }
  
  public V1alpha1LeaseCandidateBuilder(V1alpha1LeaseCandidateFluent<?> fluent) {
    this(fluent, new V1alpha1LeaseCandidate());
  }
  
  public V1alpha1LeaseCandidateBuilder(V1alpha1LeaseCandidateFluent<?> fluent,V1alpha1LeaseCandidate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1LeaseCandidateBuilder(V1alpha1LeaseCandidate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1LeaseCandidateFluent<?> fluent;
  
  public V1alpha1LeaseCandidate build() {
    V1alpha1LeaseCandidate buildable = new V1alpha1LeaseCandidate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}