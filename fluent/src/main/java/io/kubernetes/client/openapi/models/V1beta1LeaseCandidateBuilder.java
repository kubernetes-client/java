package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1LeaseCandidateBuilder extends V1beta1LeaseCandidateFluent<V1beta1LeaseCandidateBuilder> implements VisitableBuilder<V1beta1LeaseCandidate,V1beta1LeaseCandidateBuilder>{
  public V1beta1LeaseCandidateBuilder() {
    this(new V1beta1LeaseCandidate());
  }
  
  public V1beta1LeaseCandidateBuilder(V1beta1LeaseCandidateFluent<?> fluent) {
    this(fluent, new V1beta1LeaseCandidate());
  }
  
  public V1beta1LeaseCandidateBuilder(V1beta1LeaseCandidateFluent<?> fluent,V1beta1LeaseCandidate instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1LeaseCandidateBuilder(V1beta1LeaseCandidate instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1LeaseCandidateFluent<?> fluent;
  
  public V1beta1LeaseCandidate build() {
    V1beta1LeaseCandidate buildable = new V1beta1LeaseCandidate();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}