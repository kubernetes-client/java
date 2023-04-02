package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecurityContextBuilder extends V1SecurityContextFluentImpl<V1SecurityContextBuilder> implements VisitableBuilder<V1SecurityContext,V1SecurityContextBuilder>{
  public V1SecurityContextBuilder() {
    this(false);
  }
  public V1SecurityContextBuilder(Boolean validationEnabled) {
    this(new V1SecurityContext(), validationEnabled);
  }
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SecurityContext(), validationEnabled);
  }
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent,V1SecurityContext instance) {
    this(fluent, instance, false);
  }
  public V1SecurityContextBuilder(V1SecurityContextFluent<?> fluent,V1SecurityContext instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());

    fluent.withCapabilities(instance.getCapabilities());

    fluent.withPrivileged(instance.getPrivileged());

    fluent.withProcMount(instance.getProcMount());

    fluent.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());

    fluent.withRunAsGroup(instance.getRunAsGroup());

    fluent.withRunAsNonRoot(instance.getRunAsNonRoot());

    fluent.withRunAsUser(instance.getRunAsUser());

    fluent.withSeLinuxOptions(instance.getSeLinuxOptions());

    fluent.withSeccompProfile(instance.getSeccompProfile());

    fluent.withWindowsOptions(instance.getWindowsOptions());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecurityContextBuilder(V1SecurityContext instance) {
    this(instance,false);
  }
  public V1SecurityContextBuilder(V1SecurityContext instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAllowPrivilegeEscalation(instance.getAllowPrivilegeEscalation());

    this.withCapabilities(instance.getCapabilities());

    this.withPrivileged(instance.getPrivileged());

    this.withProcMount(instance.getProcMount());

    this.withReadOnlyRootFilesystem(instance.getReadOnlyRootFilesystem());

    this.withRunAsGroup(instance.getRunAsGroup());

    this.withRunAsNonRoot(instance.getRunAsNonRoot());

    this.withRunAsUser(instance.getRunAsUser());

    this.withSeLinuxOptions(instance.getSeLinuxOptions());

    this.withSeccompProfile(instance.getSeccompProfile());

    this.withWindowsOptions(instance.getWindowsOptions());

    this.validationEnabled = validationEnabled; 
  }
  V1SecurityContextFluent<?> fluent;
  Boolean validationEnabled;
  public V1SecurityContext build() {
    V1SecurityContext buildable = new V1SecurityContext();
    buildable.setAllowPrivilegeEscalation(fluent.getAllowPrivilegeEscalation());
    buildable.setCapabilities(fluent.getCapabilities());
    buildable.setPrivileged(fluent.getPrivileged());
    buildable.setProcMount(fluent.getProcMount());
    buildable.setReadOnlyRootFilesystem(fluent.getReadOnlyRootFilesystem());
    buildable.setRunAsGroup(fluent.getRunAsGroup());
    buildable.setRunAsNonRoot(fluent.getRunAsNonRoot());
    buildable.setRunAsUser(fluent.getRunAsUser());
    buildable.setSeLinuxOptions(fluent.getSeLinuxOptions());
    buildable.setSeccompProfile(fluent.getSeccompProfile());
    buildable.setWindowsOptions(fluent.getWindowsOptions());
    return buildable;
  }
  
}