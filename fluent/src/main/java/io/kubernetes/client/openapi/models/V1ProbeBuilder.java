package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ProbeBuilder extends V1ProbeFluent<V1ProbeBuilder> implements VisitableBuilder<V1Probe,V1ProbeBuilder>{
  public V1ProbeBuilder() {
    this(new V1Probe());
  }
  
  public V1ProbeBuilder(V1ProbeFluent<?> fluent) {
    this(fluent, new V1Probe());
  }
  
  public V1ProbeBuilder(V1ProbeFluent<?> fluent,V1Probe instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ProbeBuilder(V1Probe instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ProbeFluent<?> fluent;
  
  public V1Probe build() {
    V1Probe buildable = new V1Probe();
    buildable.setExec(fluent.buildExec());
    buildable.setFailureThreshold(fluent.getFailureThreshold());
    buildable.setGrpc(fluent.buildGrpc());
    buildable.setHttpGet(fluent.buildHttpGet());
    buildable.setInitialDelaySeconds(fluent.getInitialDelaySeconds());
    buildable.setPeriodSeconds(fluent.getPeriodSeconds());
    buildable.setSuccessThreshold(fluent.getSuccessThreshold());
    buildable.setTcpSocket(fluent.buildTcpSocket());
    buildable.setTerminationGracePeriodSeconds(fluent.getTerminationGracePeriodSeconds());
    buildable.setTimeoutSeconds(fluent.getTimeoutSeconds());
    return buildable;
  }
  

}