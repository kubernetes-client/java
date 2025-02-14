package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2LeaseCandidateSpecBuilder extends V1alpha2LeaseCandidateSpecFluent<V1alpha2LeaseCandidateSpecBuilder> implements VisitableBuilder<V1alpha2LeaseCandidateSpec,V1alpha2LeaseCandidateSpecBuilder>{
  public V1alpha2LeaseCandidateSpecBuilder() {
    this(new V1alpha2LeaseCandidateSpec());
  }
  
  public V1alpha2LeaseCandidateSpecBuilder(V1alpha2LeaseCandidateSpecFluent<?> fluent) {
    this(fluent, new V1alpha2LeaseCandidateSpec());
  }
  
  public V1alpha2LeaseCandidateSpecBuilder(V1alpha2LeaseCandidateSpecFluent<?> fluent,V1alpha2LeaseCandidateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2LeaseCandidateSpecBuilder(V1alpha2LeaseCandidateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2LeaseCandidateSpecFluent<?> fluent;
  
  public V1alpha2LeaseCandidateSpec build() {
    V1alpha2LeaseCandidateSpec buildable = new V1alpha2LeaseCandidateSpec();
    buildable.setBinaryVersion(fluent.getBinaryVersion());
    buildable.setEmulationVersion(fluent.getEmulationVersion());
    buildable.setLeaseName(fluent.getLeaseName());
    buildable.setPingTime(fluent.getPingTime());
    buildable.setRenewTime(fluent.getRenewTime());
    buildable.setStrategy(fluent.getStrategy());
    return buildable;
  }
  

}