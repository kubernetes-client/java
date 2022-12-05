package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodSecurityContextBuilder extends V1PodSecurityContextFluentImpl<V1PodSecurityContextBuilder> implements VisitableBuilder<V1PodSecurityContext,V1PodSecurityContextBuilder>{
  public V1PodSecurityContextBuilder() {
    this(false);
  }
  public V1PodSecurityContextBuilder(Boolean validationEnabled) {
    this(new V1PodSecurityContext(), validationEnabled);
  }
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodSecurityContext(), validationEnabled);
  }
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent,V1PodSecurityContext instance) {
    this(fluent, instance, false);
  }
  public V1PodSecurityContextBuilder(V1PodSecurityContextFluent<?> fluent,V1PodSecurityContext instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsGroup(instance.getFsGroup());

    fluent.withFsGroupChangePolicy(instance.getFsGroupChangePolicy());

    fluent.withRunAsGroup(instance.getRunAsGroup());

    fluent.withRunAsNonRoot(instance.getRunAsNonRoot());

    fluent.withRunAsUser(instance.getRunAsUser());

    fluent.withSeLinuxOptions(instance.getSeLinuxOptions());

    fluent.withSeccompProfile(instance.getSeccompProfile());

    fluent.withSupplementalGroups(instance.getSupplementalGroups());

    fluent.withSysctls(instance.getSysctls());

    fluent.withWindowsOptions(instance.getWindowsOptions());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodSecurityContextBuilder(V1PodSecurityContext instance) {
    this(instance,false);
  }
  public V1PodSecurityContextBuilder(V1PodSecurityContext instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsGroup(instance.getFsGroup());

    this.withFsGroupChangePolicy(instance.getFsGroupChangePolicy());

    this.withRunAsGroup(instance.getRunAsGroup());

    this.withRunAsNonRoot(instance.getRunAsNonRoot());

    this.withRunAsUser(instance.getRunAsUser());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.withSeccompProfile(instance.getSeccompProfile());

    this.withSupplementalGroups(instance.getSupplementalGroups());

    this.withSysctls(instance.getSysctls());

    this.withWindowsOptions(instance.getWindowsOptions());

    this.validationEnabled = validationEnabled; 
  }
  V1PodSecurityContextFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodSecurityContext build() {
    V1PodSecurityContext buildable = new V1PodSecurityContext();
    buildable.setFsGroup(fluent.getFsGroup());
    buildable.setFsGroupChangePolicy(fluent.getFsGroupChangePolicy());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.getSeLinuxOptions());
    buildable.setSeccompProfile(fluent.getSeccompProfile());
    buildable.setSupplementalGroups(fluent.getSupplementalGroups());
    buildable.setSysctls(fluent.getSysctls());
    buildable.setWindowsOptions(fluent.getWindowsOptions());
    return buildable;
  }
  
}