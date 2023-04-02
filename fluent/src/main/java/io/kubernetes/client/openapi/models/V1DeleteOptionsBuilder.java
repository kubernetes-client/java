package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DeleteOptionsBuilder extends V1DeleteOptionsFluentImpl<V1DeleteOptionsBuilder> implements VisitableBuilder<V1DeleteOptions,V1DeleteOptionsBuilder>{
  public V1DeleteOptionsBuilder() {
    this(false);
  }
  public V1DeleteOptionsBuilder(Boolean validationEnabled) {
    this(new V1DeleteOptions(), validationEnabled);
  }
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DeleteOptions(), validationEnabled);
  }
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent,V1DeleteOptions instance) {
    this(fluent, instance, false);
  }
  public V1DeleteOptionsBuilder(V1DeleteOptionsFluent<?> fluent,V1DeleteOptions instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withDryRun(instance.getDryRun());

    fluent.withGracePeriodSeconds(instance.getGracePeriodSeconds());

    fluent.withKind(instance.getKind());

    fluent.withOrphanDependents(instance.getOrphanDependents());

    fluent.withPreconditions(instance.getPreconditions());

    fluent.withPropagationPolicy(instance.getPropagationPolicy());

    this.validationEnabled = validationEnabled; 
  }
  public V1DeleteOptionsBuilder(V1DeleteOptions instance) {
    this(instance,false);
  }
  public V1DeleteOptionsBuilder(V1DeleteOptions instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withDryRun(instance.getDryRun());

    this.withGracePeriodSeconds(instance.getGracePeriodSeconds());

    this.withKind(instance.getKind());

    this.withOrphanDependents(instance.getOrphanDependents());

    this.withPreconditions(instance.getPreconditions());

    this.withPropagationPolicy(instance.getPropagationPolicy());

    this.validationEnabled = validationEnabled; 
  }
  V1DeleteOptionsFluent<?> fluent;
  Boolean validationEnabled;
  public V1DeleteOptions build() {
    V1DeleteOptions buildable = new V1DeleteOptions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDryRun(fluent.getDryRun());
    buildable.setGracePeriodSeconds(fluent.getGracePeriodSeconds());
    buildable.setKind(fluent.getKind());
    buildable.setOrphanDependents(fluent.getOrphanDependents());
    buildable.setPreconditions(fluent.getPreconditions());
    buildable.setPropagationPolicy(fluent.getPropagationPolicy());
    return buildable;
  }
  
}