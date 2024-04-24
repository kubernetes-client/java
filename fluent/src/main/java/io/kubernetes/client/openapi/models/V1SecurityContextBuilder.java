package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecurityContextBuilder extends V1SecurityContextFluent<V1SecurityContextBuilder> implements VisitableBuilder<V1SecurityContext,V1SecurityContextBuilder>{
  public V1SecurityContextBuilder() {
    this(new V1SecurityContext());
  }
  
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent) {
    this(fluent, new V1SecurityContext());
  }
  
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent,V1SecurityContext instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecurityContextBuilder(V1SecurityContext instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecurityContextFluent<?> fluent;
  
  public V1SecurityContext build() {
    V1SecurityContext buildable = new V1SecurityContext();
    buildable.setAllowPrivilegeEscalation(fluent.getAllowPrivilegeEscalation());
    buildable.setAppArmorProfile(fluent.buildAppArmorProfile());
    buildable.setCapabilities(fluent.buildCapabilities());
    buildable.setPrivileged(fluent.getPrivileged());
    buildable.setProcMount(fluent.getProcMount());
    buildable.setReadOnlyRootFilesystem(fluent.getReadOnlyRootFilesystem());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.buildSeLinuxOptions());
    buildable.setSeccompProfile(fluent.buildSeccompProfile());
    buildable.setWindowsOptions(fluent.buildWindowsOptions());
    return buildable;
  }
  

}