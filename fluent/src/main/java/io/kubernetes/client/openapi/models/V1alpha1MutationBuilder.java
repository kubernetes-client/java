package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MutationBuilder extends V1alpha1MutationFluent<V1alpha1MutationBuilder> implements VisitableBuilder<V1alpha1Mutation,V1alpha1MutationBuilder>{
  public V1alpha1MutationBuilder() {
    this(new V1alpha1Mutation());
  }
  
  public V1alpha1MutationBuilder(V1alpha1MutationFluent<?> fluent) {
    this(fluent, new V1alpha1Mutation());
  }
  
  public V1alpha1MutationBuilder(V1alpha1MutationFluent<?> fluent,V1alpha1Mutation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MutationBuilder(V1alpha1Mutation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MutationFluent<?> fluent;
  
  public V1alpha1Mutation build() {
    V1alpha1Mutation buildable = new V1alpha1Mutation();
    buildable.setApplyConfiguration(fluent.buildApplyConfiguration());
    buildable.setJsonPatch(fluent.buildJsonPatch());
    buildable.setPatchType(fluent.getPatchType());
    return buildable;
  }
  

}