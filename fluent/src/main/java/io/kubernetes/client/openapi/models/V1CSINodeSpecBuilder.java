package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSINodeSpecBuilder extends V1CSINodeSpecFluentImpl<V1CSINodeSpecBuilder> implements VisitableBuilder<V1CSINodeSpec,V1CSINodeSpecBuilder>{
  public V1CSINodeSpecBuilder() {
    this(false);
  }
  public V1CSINodeSpecBuilder(Boolean validationEnabled) {
    this(new V1CSINodeSpec(), validationEnabled);
  }
  public V1CSINodeSpecBuilder(V1CSINodeSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSINodeSpecBuilder(V1CSINodeSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSINodeSpec(), validationEnabled);
  }
  public V1CSINodeSpecBuilder(V1CSINodeSpecFluent<?> fluent,V1CSINodeSpec instance) {
    this(fluent, instance, false);
  }
  public V1CSINodeSpecBuilder(V1CSINodeSpecFluent<?> fluent,V1CSINodeSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDrivers(instance.getDrivers());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSINodeSpecBuilder(V1CSINodeSpec instance) {
    this(instance,false);
  }
  public V1CSINodeSpecBuilder(V1CSINodeSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDrivers(instance.getDrivers());

    this.validationEnabled = validationEnabled; 
  }
  V1CSINodeSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSINodeSpec build() {
    V1CSINodeSpec buildable = new V1CSINodeSpec();
    buildable.setDrivers(fluent.getDrivers());
    return buildable;
  }
  
}