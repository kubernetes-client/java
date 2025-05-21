package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1LeaseCandidateSpecBuilder extends V1beta1LeaseCandidateSpecFluent<V1beta1LeaseCandidateSpecBuilder> implements VisitableBuilder<V1beta1LeaseCandidateSpec,V1beta1LeaseCandidateSpecBuilder>{
  public V1beta1LeaseCandidateSpecBuilder() {
    this(new V1beta1LeaseCandidateSpec());
  }
  
  public V1beta1LeaseCandidateSpecBuilder(V1beta1LeaseCandidateSpecFluent<?> fluent) {
    this(fluent, new V1beta1LeaseCandidateSpec());
  }
  
  public V1beta1LeaseCandidateSpecBuilder(V1beta1LeaseCandidateSpecFluent<?> fluent,V1beta1LeaseCandidateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1LeaseCandidateSpecBuilder(V1beta1LeaseCandidateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1LeaseCandidateSpecFluent<?> fluent;
  
  public V1beta1LeaseCandidateSpec build() {
    V1beta1LeaseCandidateSpec buildable = new V1beta1LeaseCandidateSpec();
    buildable.setBinaryVersion(fluent.getBinaryVersion());
    buildable.setEmulationVersion(fluent.getEmulationVersion());
    buildable.setLeaseName(fluent.getLeaseName());
    buildable.setPingTime(fluent.getPingTime());
    buildable.setRenewTime(fluent.getRenewTime());
    buildable.setStrategy(fluent.getStrategy());
    return buildable;
  }
  

}