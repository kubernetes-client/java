package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodAffinityTermBuilder extends V1PodAffinityTermFluentImpl<V1PodAffinityTermBuilder> implements VisitableBuilder<V1PodAffinityTerm,V1PodAffinityTermBuilder>{
  public V1PodAffinityTermBuilder() {
    this(false);
  }
  public V1PodAffinityTermBuilder(Boolean validationEnabled) {
    this(new V1PodAffinityTerm(), validationEnabled);
  }
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodAffinityTerm(), validationEnabled);
  }
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent,V1PodAffinityTerm instance) {
    this(fluent, instance, false);
  }
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent,V1PodAffinityTerm instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLabelSelector(instance.getLabelSelector());

    fluent.withNamespaceSelector(instance.getNamespaceSelector());

    fluent.withNamespaces(instance.getNamespaces());

    fluent.withTopologyKey(instance.getTopologyKey());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodAffinityTermBuilder(V1PodAffinityTerm instance) {
    this(instance,false);
  }
  public V1PodAffinityTermBuilder(V1PodAffinityTerm instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLabelSelector(instance.getLabelSelector());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withNamespaces(instance.getNamespaces());

    this.withTopologyKey(instance.getTopologyKey());

    this.validationEnabled = validationEnabled; 
  }
  V1PodAffinityTermFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodAffinityTerm build() {
    V1PodAffinityTerm buildable = new V1PodAffinityTerm();
    buildable.setLabelSelector(fluent.getLabelSelector());
    buildable.setNamespaceSelector(fluent.getNamespaceSelector());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setTopologyKey(fluent.getTopologyKey());
    return buildable;
  }
  
}