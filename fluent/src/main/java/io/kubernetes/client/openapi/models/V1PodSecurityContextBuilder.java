package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodSecurityContextBuilder extends V1PodSecurityContextFluent<V1PodSecurityContextBuilder> implements VisitableBuilder<V1PodSecurityContext,V1PodSecurityContextBuilder>{
  public V1PodSecurityContextBuilder() {
    this(new V1PodSecurityContext());
  }
  
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent) {
    this(fluent, new V1PodSecurityContext());
  }
  
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent,V1PodSecurityContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodSecurityContextBuilder(V1PodSecurityContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodSecurityContextFluent<?> fluent;
  
  public V1PodSecurityContext build() {
    V1PodSecurityContext buildable = new V1PodSecurityContext();
    buildable.setAppArmorProfile(fluent.buildAppArmorProfile());
    buildable.setFsGroup(fluent.getFsGroup());
    buildable.setFsGroupChangePolicy(fluent.getFsGroupChangePolicy());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.buildSeLinuxOptions());
    buildable.setSeccompProfile(fluent.buildSeccompProfile());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setSysctls(fluent.buildSysctls());
    buildable.setWindowsOptions(fluent.buildWindowsOptions());
    return buildable;
  }
  

}