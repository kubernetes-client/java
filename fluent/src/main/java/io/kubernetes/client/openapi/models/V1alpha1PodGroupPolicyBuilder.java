package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1PodGroupPolicyBuilder extends V1alpha1PodGroupPolicyFluent<V1alpha1PodGroupPolicyBuilder> implements VisitableBuilder<V1alpha1PodGroupPolicy,V1alpha1PodGroupPolicyBuilder>{

  V1alpha1PodGroupPolicyFluent<?> fluent;

  public V1alpha1PodGroupPolicyBuilder() {
    this(new V1alpha1PodGroupPolicy());
  }
  
  public V1alpha1PodGroupPolicyBuilder(V1alpha1PodGroupPolicyFluent<?> fluent) {
    this(fluent, new V1alpha1PodGroupPolicy());
  }
  
  public V1alpha1PodGroupPolicyBuilder(V1alpha1PodGroupPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1PodGroupPolicyBuilder(V1alpha1PodGroupPolicyFluent<?> fluent,V1alpha1PodGroupPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1PodGroupPolicy build() {
    V1alpha1PodGroupPolicy buildable = new V1alpha1PodGroupPolicy();
    buildable.setBasic(fluent.getBasic());
    buildable.setGang(fluent.buildGang());
    return buildable;
  }
  
}