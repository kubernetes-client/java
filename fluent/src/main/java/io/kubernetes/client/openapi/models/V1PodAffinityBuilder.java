package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodAffinityBuilder extends V1PodAffinityFluent<V1PodAffinityBuilder> implements VisitableBuilder<V1PodAffinity,V1PodAffinityBuilder>{
  public V1PodAffinityBuilder() {
    this(new V1PodAffinity());
  }
  
  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent) {
    this(fluent, new V1PodAffinity());
  }
  
  public V1PodAffinityBuilder(V1PodAffinityFluent<?> fluent,V1PodAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodAffinityBuilder(V1PodAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodAffinityFluent<?> fluent;
  
  public V1PodAffinity build() {
    V1PodAffinity buildable = new V1PodAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  

}