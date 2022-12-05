package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1JobSpecBuilder extends V1JobSpecFluentImpl<V1JobSpecBuilder> implements VisitableBuilder<V1JobSpec,V1JobSpecBuilder>{
  public V1JobSpecBuilder() {
    this(false);
  }
  public V1JobSpecBuilder(Boolean validationEnabled) {
    this(new V1JobSpec(), validationEnabled);
  }
  public V1JobSpecBuilder(V1JobSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1JobSpecBuilder(V1JobSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1JobSpec(), validationEnabled);
  }
  public V1JobSpecBuilder(V1JobSpecFluent<?> fluent,V1JobSpec instance) {
    this(fluent, instance, false);
  }
  public V1JobSpecBuilder(V1JobSpecFluent<?> fluent,V1JobSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    fluent.withBackoffLimit(instance.getBackoffLimit());

    fluent.withCompletionMode(instance.getCompletionMode());

    fluent.withCompletions(instance.getCompletions());

    fluent.withManualSelector(instance.getManualSelector());

    fluent.withParallelism(instance.getParallelism());

    fluent.withPodFailurePolicy(instance.getPodFailurePolicy());

    fluent.withSelector(instance.getSelector());

    fluent.withSuspend(instance.getSuspend());

    fluent.withTemplate(instance.getTemplate());

    fluent.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());

    this.validationEnabled = validationEnabled; 
  }
  public V1JobSpecBuilder(V1JobSpec instance) {
    this(instance,false);
  }
  public V1JobSpecBuilder(V1JobSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withActiveDeadlineSeconds(instance.getActiveDeadlineSeconds());

    this.withBackoffLimit(instance.getBackoffLimit());

    this.withCompletionMode(instance.getCompletionMode());

    this.withCompletions(instance.getCompletions());

    this.withManualSelector(instance.getManualSelector());

    this.withParallelism(instance.getParallelism());

    this.withPodFailurePolicy(instance.getPodFailurePolicy());

    this.withSelector(instance.getSelector());

    this.withSuspend(instance.getSuspend());

    this.withTemplate(instance.getTemplate());

    this.withTtlSecondsAfterFinished(instance.getTtlSecondsAfterFinished());

    this.validationEnabled = validationEnabled; 
  }
  V1JobSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1JobSpec build() {
    V1JobSpec buildable = new V1JobSpec();
    buildable.setActiveDeadlineSeconds(fluent.getActiveDeadlineSeconds());
    buildable.setBackoffLimit(fluent.getBackoffLimit());
    buildable.setCompletionMode(fluent.getCompletionMode());
    buildable.setCompletions(fluent.getCompletions());
    buildable.setManualSelector(fluent.getManualSelector());
    buildable.setParallelism(fluent.getParallelism());
    buildable.setPodFailurePolicy(fluent.getPodFailurePolicy());
    buildable.setSelector(fluent.getSelector());
    buildable.setSuspend(fluent.getSuspend());
    buildable.setTemplate(fluent.getTemplate());
    buildable.setTtlSecondsAfterFinished(fluent.getTtlSecondsAfterFinished());
    return buildable;
  }
  
}