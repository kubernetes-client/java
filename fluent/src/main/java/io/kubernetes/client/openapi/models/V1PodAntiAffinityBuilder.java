package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodAntiAffinityBuilder extends V1PodAntiAffinityFluentImpl<V1PodAntiAffinityBuilder> implements VisitableBuilder<V1PodAntiAffinity,V1PodAntiAffinityBuilder>{
  public V1PodAntiAffinityBuilder() {
    this(false);
  }
  public V1PodAntiAffinityBuilder(Boolean validationEnabled) {
    this(new V1PodAntiAffinity(), validationEnabled);
  }
  public V1PodAntiAffinityBuilder(V1PodAntiAffinityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodAntiAffinityBuilder(V1PodAntiAffinityFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodAntiAffinity(), validationEnabled);
  }
  public V1PodAntiAffinityBuilder(V1PodAntiAffinityFluent<?> fluent,V1PodAntiAffinity instance) {
    this(fluent, instance, false);
  }
  public V1PodAntiAffinityBuilder(V1PodAntiAffinityFluent<?> fluent,V1PodAntiAffinity instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodAntiAffinityBuilder(V1PodAntiAffinity instance) {
    this(instance,false);
  }
  public V1PodAntiAffinityBuilder(V1PodAntiAffinity instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled; 
  }
  V1PodAntiAffinityFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodAntiAffinity build() {
    V1PodAntiAffinity buildable = new V1PodAntiAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  
}