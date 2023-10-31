package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SysctlBuilder extends V1SysctlFluent<V1SysctlBuilder> implements VisitableBuilder<V1Sysctl,V1SysctlBuilder>{
  public V1SysctlBuilder() {
    this(new V1Sysctl());
  }
  
  public V1SysctlBuilder(V1SysctlFluent<?> fluent) {
    this(fluent, new V1Sysctl());
  }
  
  public V1SysctlBuilder(V1SysctlFluent<?> fluent,V1Sysctl instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SysctlBuilder(V1Sysctl instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SysctlFluent<?> fluent;
  
  public V1Sysctl build() {
    V1Sysctl buildable = new V1Sysctl();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}