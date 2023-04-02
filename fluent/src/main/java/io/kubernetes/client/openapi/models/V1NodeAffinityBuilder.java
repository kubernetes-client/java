package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeAffinityBuilder extends V1NodeAffinityFluentImpl<V1NodeAffinityBuilder> implements VisitableBuilder<V1NodeAffinity,V1NodeAffinityBuilder>{
  public V1NodeAffinityBuilder() {
    this(false);
  }
  public V1NodeAffinityBuilder(Boolean validationEnabled) {
    this(new V1NodeAffinity(), validationEnabled);
  }
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeAffinity(), validationEnabled);
  }
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent,V1NodeAffinity instance) {
    this(fluent, instance, false);
  }
  public V1NodeAffinityBuilder(V1NodeAffinityFluent<?> fluent,V1NodeAffinity instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    fluent.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeAffinityBuilder(V1NodeAffinity instance) {
    this(instance,false);
  }
  public V1NodeAffinityBuilder(V1NodeAffinity instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPreferredDuringSchedulingIgnoredDuringExecution(instance.getPreferredDuringSchedulingIgnoredDuringExecution());

    this.withRequiredDuringSchedulingIgnoredDuringExecution(instance.getRequiredDuringSchedulingIgnoredDuringExecution());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeAffinityFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeAffinity build() {
    V1NodeAffinity buildable = new V1NodeAffinity();
    buildable.setPreferredDuringSchedulingIgnoredDuringExecution(fluent.getPreferredDuringSchedulingIgnoredDuringExecution());
    buildable.setRequiredDuringSchedulingIgnoredDuringExecution(fluent.getRequiredDuringSchedulingIgnoredDuringExecution());
    return buildable;
  }
  
}