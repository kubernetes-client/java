package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NetworkPolicySpecBuilder extends V1NetworkPolicySpecFluentImpl<V1NetworkPolicySpecBuilder> implements VisitableBuilder<V1NetworkPolicySpec,V1NetworkPolicySpecBuilder>{
  public V1NetworkPolicySpecBuilder() {
    this(false);
  }
  public V1NetworkPolicySpecBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicySpec(), validationEnabled);
  }
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicySpec(), validationEnabled);
  }
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent,V1NetworkPolicySpec instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpecFluent<?> fluent,V1NetworkPolicySpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEgress(instance.getEgress());

    fluent.withIngress(instance.getIngress());

    fluent.withPodSelector(instance.getPodSelector());

    fluent.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpec instance) {
    this(instance,false);
  }
  public V1NetworkPolicySpecBuilder(V1NetworkPolicySpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withEgress(instance.getEgress());

    this.withIngress(instance.getIngress());

    this.withPodSelector(instance.getPodSelector());

    this.withPolicyTypes(instance.getPolicyTypes());

    this.validationEnabled = validationEnabled; 
  }
  V1NetworkPolicySpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1NetworkPolicySpec build() {
    V1NetworkPolicySpec buildable = new V1NetworkPolicySpec();
    buildable.setEgress(fluent.getEgress());
    buildable.setIngress(fluent.getIngress());
    buildable.setPodSelector(fluent.getPodSelector());
    buildable.setPolicyTypes(fluent.getPolicyTypes());
    return buildable;
  }
  
}