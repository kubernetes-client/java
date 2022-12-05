package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1WindowsSecurityContextOptionsBuilder extends V1WindowsSecurityContextOptionsFluentImpl<V1WindowsSecurityContextOptionsBuilder> implements VisitableBuilder<V1WindowsSecurityContextOptions,V1WindowsSecurityContextOptionsBuilder>{
  public V1WindowsSecurityContextOptionsBuilder() {
    this(false);
  }
  public V1WindowsSecurityContextOptionsBuilder(Boolean validationEnabled) {
    this(new V1WindowsSecurityContextOptions(), validationEnabled);
  }
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1WindowsSecurityContextOptions(), validationEnabled);
  }
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent,V1WindowsSecurityContextOptions instance) {
    this(fluent, instance, false);
  }
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent,V1WindowsSecurityContextOptions instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());

    fluent.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());

    fluent.withHostProcess(instance.getHostProcess());

    fluent.withRunAsUserName(instance.getRunAsUserName());

    this.validationEnabled = validationEnabled; 
  }
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptions instance) {
    this(instance,false);
  }
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptions instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withGmsaCredentialSpec(instance.getGmsaCredentialSpec());

    this.withGmsaCredentialSpecName(instance.getGmsaCredentialSpecName());

    this.withHostProcess(instance.getHostProcess());

    this.withRunAsUserName(instance.getRunAsUserName());

    this.validationEnabled = validationEnabled; 
  }
  V1WindowsSecurityContextOptionsFluent<?> fluent;
  Boolean validationEnabled;
  public V1WindowsSecurityContextOptions build() {
    V1WindowsSecurityContextOptions buildable = new V1WindowsSecurityContextOptions();
    buildable.setGmsaCredentialSpec(fluent.getGmsaCredentialSpec());
    buildable.setGmsaCredentialSpecName(fluent.getGmsaCredentialSpecName());
    buildable.setHostProcess(fluent.getHostProcess());
    buildable.setRunAsUserName(fluent.getRunAsUserName());
    return buildable;
  }
  
}