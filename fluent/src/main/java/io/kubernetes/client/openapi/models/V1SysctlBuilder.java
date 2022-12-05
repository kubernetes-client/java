package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SysctlBuilder extends V1SysctlFluentImpl<V1SysctlBuilder> implements VisitableBuilder<V1Sysctl,V1SysctlBuilder>{
  public V1SysctlBuilder() {
    this(false);
  }
  public V1SysctlBuilder(Boolean validationEnabled) {
    this(new V1Sysctl(), validationEnabled);
  }
  public V1SysctlBuilder(V1SysctlFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SysctlBuilder(V1SysctlFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Sysctl(), validationEnabled);
  }
  public V1SysctlBuilder(V1SysctlFluent<?> fluent,V1Sysctl instance) {
    this(fluent, instance, false);
  }
  public V1SysctlBuilder(V1SysctlFluent<?> fluent,V1Sysctl instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V1SysctlBuilder(V1Sysctl instance) {
    this(instance,false);
  }
  public V1SysctlBuilder(V1Sysctl instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V1SysctlFluent<?> fluent;
  Boolean validationEnabled;
  public V1Sysctl build() {
    V1Sysctl buildable = new V1Sysctl();
    buildable.setName(fluent.getName());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}