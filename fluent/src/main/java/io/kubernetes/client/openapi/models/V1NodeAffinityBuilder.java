package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeAffinityBuilder extends V1NodeAffinityFluent<V1NodeAffinityBuilder> implements VisitableBuilder<V1NodeAffinity,V1NodeAffinityBuilder>{
  public V1NodeAffinityBuilder() {
    this(new V1NodeAffinity());
  }
  
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent) {
    this(fluent, new V1NodeAffinity());
  }
  
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent,V1NodeAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeAffinityBuilder(V1NodeAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeAffinityFluent<?> fluent;
  
  public V1NodeAffinity build() {
    V1NodeAffinity buildable = new V1NodeAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  

}