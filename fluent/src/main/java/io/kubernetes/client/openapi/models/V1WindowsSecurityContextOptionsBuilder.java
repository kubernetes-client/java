package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1WindowsSecurityContextOptionsBuilder extends V1WindowsSecurityContextOptionsFluent<V1WindowsSecurityContextOptionsBuilder> implements VisitableBuilder<V1WindowsSecurityContextOptions,V1WindowsSecurityContextOptionsBuilder>{
  public V1WindowsSecurityContextOptionsBuilder() {
    this(new V1WindowsSecurityContextOptions());
  }
  
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent) {
    this(fluent, new V1WindowsSecurityContextOptions());
  }
  
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptionsFluent<?> fluent,V1WindowsSecurityContextOptions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1WindowsSecurityContextOptionsBuilder(V1WindowsSecurityContextOptions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1WindowsSecurityContextOptionsFluent<?> fluent;
  
  public V1WindowsSecurityContextOptions build() {
    V1WindowsSecurityContextOptions buildable = new V1WindowsSecurityContextOptions();
    buildable.setGmsaCredentialSpec(fluent.getGmsaCredentialSpec());
    buildable.setGmsaCredentialSpecName(fluent.getGmsaCredentialSpecName());
    buildable.setHostProcess(fluent.getHostProcess());
    buildable.setRunAsUserName(fluent.getRunAsUserName());
    return buildable;
  }
  

}