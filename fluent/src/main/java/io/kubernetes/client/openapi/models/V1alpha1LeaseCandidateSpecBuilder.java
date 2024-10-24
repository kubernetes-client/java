package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1LeaseCandidateSpecBuilder extends V1alpha1LeaseCandidateSpecFluent<V1alpha1LeaseCandidateSpecBuilder> implements VisitableBuilder<V1alpha1LeaseCandidateSpec,V1alpha1LeaseCandidateSpecBuilder>{
  public V1alpha1LeaseCandidateSpecBuilder() {
    this(new V1alpha1LeaseCandidateSpec());
  }
  
  public V1alpha1LeaseCandidateSpecBuilder(V1alpha1LeaseCandidateSpecFluent<?> fluent) {
    this(fluent, new V1alpha1LeaseCandidateSpec());
  }
  
  public V1alpha1LeaseCandidateSpecBuilder(V1alpha1LeaseCandidateSpecFluent<?> fluent,V1alpha1LeaseCandidateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1LeaseCandidateSpecBuilder(V1alpha1LeaseCandidateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1LeaseCandidateSpecFluent<?> fluent;
  
  public V1alpha1LeaseCandidateSpec build() {
    V1alpha1LeaseCandidateSpec buildable = new V1alpha1LeaseCandidateSpec();
    buildable.setBinaryVersion(fluent.getBinaryVersion());
    buildable.setEmulationVersion(fluent.getEmulationVersion());
    buildable.setLeaseName(fluent.getLeaseName());
    buildable.setPingTime(fluent.getPingTime());
    buildable.setPreferredStrategies(fluent.getPreferredStrategies());
    buildable.setRenewTime(fluent.getRenewTime());
    return buildable;
  }
  

}