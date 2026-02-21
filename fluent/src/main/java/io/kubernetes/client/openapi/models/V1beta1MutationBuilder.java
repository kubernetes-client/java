package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1MutationBuilder extends V1beta1MutationFluent<V1beta1MutationBuilder> implements VisitableBuilder<V1beta1Mutation,V1beta1MutationBuilder>{

  V1beta1MutationFluent<?> fluent;

  public V1beta1MutationBuilder() {
    this(new V1beta1Mutation());
  }
  
  public V1beta1MutationBuilder(V1beta1MutationFluent<?> fluent) {
    this(fluent, new V1beta1Mutation());
  }
  
  public V1beta1MutationBuilder(V1beta1Mutation instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1MutationBuilder(V1beta1MutationFluent<?> fluent,V1beta1Mutation instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1Mutation build() {
    V1beta1Mutation buildable = new V1beta1Mutation();
    buildable.setApplyConfiguration(fluent.buildApplyConfiguration());
    buildable.setJsonPatch(fluent.buildJsonPatch());
    buildable.setPatchType(fluent.getPatchType());
    return buildable;
  }
  
}