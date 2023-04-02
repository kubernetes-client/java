package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CSINodeDriverBuilder extends V1CSINodeDriverFluentImpl<V1CSINodeDriverBuilder> implements VisitableBuilder<V1CSINodeDriver,V1CSINodeDriverBuilder>{
  public V1CSINodeDriverBuilder() {
    this(false);
  }
  public V1CSINodeDriverBuilder(Boolean validationEnabled) {
    this(new V1CSINodeDriver(), validationEnabled);
  }
  public V1CSINodeDriverBuilder(V1CSINodeDriverFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CSINodeDriverBuilder(V1CSINodeDriverFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CSINodeDriver(), validationEnabled);
  }
  public V1CSINodeDriverBuilder(V1CSINodeDriverFluent<?> fluent,V1CSINodeDriver instance) {
    this(fluent, instance, false);
  }
  public V1CSINodeDriverBuilder(V1CSINodeDriverFluent<?> fluent,V1CSINodeDriver instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAllocatable(instance.getAllocatable());

    fluent.withName(instance.getName());

    fluent.withNodeID(instance.getNodeID());

    fluent.withTopologyKeys(instance.getTopologyKeys());

    this.validationEnabled = validationEnabled; 
  }
  public V1CSINodeDriverBuilder(V1CSINodeDriver instance) {
    this(instance,false);
  }
  public V1CSINodeDriverBuilder(V1CSINodeDriver instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAllocatable(instance.getAllocatable());

    this.withName(instance.getName());

    this.withNodeID(instance.getNodeID());

    this.withTopologyKeys(instance.getTopologyKeys());

    this.validationEnabled = validationEnabled; 
  }
  V1CSINodeDriverFluent<?> fluent;
  Boolean validationEnabled;
  public V1CSINodeDriver build() {
    V1CSINodeDriver buildable = new V1CSINodeDriver();
    buildable.setAllocatable(fluent.getAllocatable());
    buildable.setName(fluent.getName());
    buildable.setNodeID(fluent.getNodeID());
    buildable.setTopologyKeys(fluent.getTopologyKeys());
    return buildable;
  }
  
}