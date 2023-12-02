package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodAntiAffinityBuilder extends V1PodAntiAffinityFluent<V1PodAntiAffinityBuilder> implements VisitableBuilder<V1PodAntiAffinity,V1PodAntiAffinityBuilder>{
  public V1PodAntiAffinityBuilder() {
    this(new V1PodAntiAffinity());
  }
  
  public V1PodAntiAffinityBuilder(V1PodAntiAffinityFluent<?> fluent) {
    this(fluent, new V1PodAntiAffinity());
  }
  
  public V1PodAntiAffinityBuilder(V1PodAntiAffinityFluent<?> fluent,V1PodAntiAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodAntiAffinityBuilder(V1PodAntiAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodAntiAffinityFluent<?> fluent;
  
  public V1PodAntiAffinity build() {
    V1PodAntiAffinity buildable = new V1PodAntiAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.buildPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.buildRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  

}