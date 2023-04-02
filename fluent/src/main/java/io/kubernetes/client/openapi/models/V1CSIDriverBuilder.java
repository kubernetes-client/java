package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSIDriverBuilder extends V1CSIDriverFluentImpl<V1CSIDriverBuilder> implements VisitableBuilder<V1CSIDriver,V1CSIDriverBuilder>{
  public V1CSIDriverBuilder() {
    this(false);
  }
  public V1CSIDriverBuilder(Boolean validationEnabled) {
    this(new V1CSIDriver(), validationEnabled);
  }
  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSIDriver(), validationEnabled);
  }
  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent,V1CSIDriver instance) {
    this(fluent, instance, false);
  }
  public V1CSIDriverBuilder(V1CSIDriverFluent<?> fluent,V1CSIDriver instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSIDriverBuilder(V1CSIDriver instance) {
    this(instance,false);
  }
  public V1CSIDriverBuilder(V1CSIDriver instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled; 
  }
  V1CSIDriverFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSIDriver build() {
    V1CSIDriver buildable = new V1CSIDriver();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
  
}