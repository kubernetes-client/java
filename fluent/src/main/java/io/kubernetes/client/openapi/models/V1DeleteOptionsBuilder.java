package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DeleteOptionsBuilder extends V1DeleteOptionsFluent<V1DeleteOptionsBuilder> implements VisitableBuilder<V1DeleteOptions,V1DeleteOptionsBuilder>{
  public V1DeleteOptionsBuilder() {
    this(new V1DeleteOptions());
  }
  
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent) {
    this(fluent, new V1DeleteOptions());
  }
  
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent,V1DeleteOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeleteOptionsBuilder(V1DeleteOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeleteOptionsFluent<?> fluent;
  
  public V1DeleteOptions build() {
    V1DeleteOptions buildable = new V1DeleteOptions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDryRun(fluent.getDryRun());
    buildable.setGracePeriodSeconds(fluent.getGracePeriodSeconds());
    buildable.setKind(fluent.getKind());
    buildable.setOrphanDependents(fluent.getOrphanDependents());
    buildable.setPreconditions(fluent.buildPreconditions());
    buildable.setPropagationPolicy(fluent.getPropagationPolicy());
    return buildable;
  }
  

}