package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2LeaseCandidateBuilder extends V1alpha2LeaseCandidateFluent<V1alpha2LeaseCandidateBuilder> implements VisitableBuilder<V1alpha2LeaseCandidate,V1alpha2LeaseCandidateBuilder>{
  public V1alpha2LeaseCandidateBuilder() {
    this(new V1alpha2LeaseCandidate());
  }
  
  public V1alpha2LeaseCandidateBuilder(V1alpha2LeaseCandidateFluent<?> fluent) {
    this(fluent, new V1alpha2LeaseCandidate());
  }
  
  public V1alpha2LeaseCandidateBuilder(V1alpha2LeaseCandidateFluent<?> fluent,V1alpha2LeaseCandidate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2LeaseCandidateBuilder(V1alpha2LeaseCandidate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2LeaseCandidateFluent<?> fluent;
  
  public V1alpha2LeaseCandidate build() {
    V1alpha2LeaseCandidate buildable = new V1alpha2LeaseCandidate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}