package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodStatusBuilder extends V1PodStatusFluent<V1PodStatusBuilder> implements VisitableBuilder<V1PodStatus,V1PodStatusBuilder>{
  public V1PodStatusBuilder() {
    this(new V1PodStatus());
  }
  
  public V1PodStatusBuilder(V1PodStatusFluent<?> fluent) {
    this(fluent, new V1PodStatus());
  }
  
  public V1PodStatusBuilder(V1PodStatusFluent<?> fluent,V1PodStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodStatusBuilder(V1PodStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodStatusFluent<?> fluent;
  
  public V1PodStatus build() {
    V1PodStatus buildable = new V1PodStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setContainerStatuses(fluent.buildContainerStatuses());
    buildable.setEphemeralContainerStatuses(fluent.buildEphemeralContainerStatuses());
    buildable.setHostIP(fluent.getHostIP());
    buildable.setHostIPs(fluent.buildHostIPs());
    buildable.setInitContainerStatuses(fluent.buildInitContainerStatuses());
    buildable.setMessage(fluent.getMessage());
    buildable.setNominatedNodeName(fluent.getNominatedNodeName());
    buildable.setPhase(fluent.getPhase());
    buildable.setPodIP(fluent.getPodIP());
    buildable.setPodIPs(fluent.buildPodIPs());
    buildable.setQosClass(fluent.getQosClass());
    buildable.setReason(fluent.getReason());
    buildable.setResize(fluent.getResize());
    buildable.setResourceClaimStatuses(fluent.buildResourceClaimStatuses());
    buildable.setStartTime(fluent.getStartTime());
    return buildable;
  }
  

}