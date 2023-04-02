package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodStatusBuilder extends V1PodStatusFluentImpl<V1PodStatusBuilder> implements VisitableBuilder<V1PodStatus,V1PodStatusBuilder>{
  public V1PodStatusBuilder() {
    this(false);
  }
  public V1PodStatusBuilder(Boolean validationEnabled) {
    this(new V1PodStatus(), validationEnabled);
  }
  public V1PodStatusBuilder(V1PodStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodStatusBuilder(V1PodStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodStatus(), validationEnabled);
  }
  public V1PodStatusBuilder(V1PodStatusFluent<?> fluent,V1PodStatus instance) {
    this(fluent, instance, false);
  }
  public V1PodStatusBuilder(V1PodStatusFluent<?> fluent,V1PodStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withContainerStatuses(instance.getContainerStatuses());

    fluent.withEphemeralContainerStatuses(instance.getEphemeralContainerStatuses());

    fluent.withHostIP(instance.getHostIP());

    fluent.withInitContainerStatuses(instance.getInitContainerStatuses());

    fluent.withMessage(instance.getMessage());

    fluent.withNominatedNodeName(instance.getNominatedNodeName());

    fluent.withPhase(instance.getPhase());

    fluent.withPodIP(instance.getPodIP());

    fluent.withPodIPs(instance.getPodIPs());

    fluent.withQosClass(instance.getQosClass());

    fluent.withReason(instance.getReason());

    fluent.withStartTime(instance.getStartTime());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodStatusBuilder(V1PodStatus instance) {
    this(instance,false);
  }
  public V1PodStatusBuilder(V1PodStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withContainerStatuses(instance.getContainerStatuses());

    this.withEphemeralContainerStatuses(instance.getEphemeralContainerStatuses());

    this.withHostIP(instance.getHostIP());

    this.withInitContainerStatuses(instance.getInitContainerStatuses());

    this.withMessage(instance.getMessage());

    this.withNominatedNodeName(instance.getNominatedNodeName());

    this.withPhase(instance.getPhase());

    this.withPodIP(instance.getPodIP());

    this.withPodIPs(instance.getPodIPs());

    this.withQosClass(instance.getQosClass());

    this.withReason(instance.getReason());

    this.withStartTime(instance.getStartTime());

    this.validationEnabled = validationEnabled; 
  }
  V1PodStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodStatus build() {
    V1PodStatus buildable = new V1PodStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setContainerStatuses(fluent.getContainerStatuses());
    buildable.setEphemeralContainerStatuses(fluent.getEphemeralContainerStatuses());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setInitContainerStatuses(fluent.getInitContainerStatuses());
    buildable.setMessage(fluent.getMessage());
    buildable.setNominatedNodeName(fluent.getNominatedNodeName());
    buildable.setPhase(fluent.getPhase());
    buildable.setPodIP(fluent.getPodIP());
    buildable.setPodIPs(fluent.getPodIPs());
    buildable.setQosClass(fluent.getQosClass());
    buildable.setReason(fluent.getReason());
    buildable.setStartTime(fluent.getStartTime());
    return buildable;
  }
  
}