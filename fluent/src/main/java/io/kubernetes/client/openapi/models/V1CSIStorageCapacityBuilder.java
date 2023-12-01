package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSIStorageCapacityBuilder extends V1CSIStorageCapacityFluent<V1CSIStorageCapacityBuilder> implements VisitableBuilder<V1CSIStorageCapacity,V1CSIStorageCapacityBuilder>{
  public V1CSIStorageCapacityBuilder() {
    this(new V1CSIStorageCapacity());
  }
  
  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacityFluent<?> fluent) {
    this(fluent, new V1CSIStorageCapacity());
  }
  
  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacityFluent<?> fluent,V1CSIStorageCapacity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSIStorageCapacityBuilder(V1CSIStorageCapacity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSIStorageCapacityFluent<?> fluent;
  
  public V1CSIStorageCapacity build() {
    V1CSIStorageCapacity buildable = new V1CSIStorageCapacity();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setKind(fluent.getKind());
    buildable.setMaximumVolumeSize(fluent.getMaximumVolumeSize());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setNodeTopology(fluent.buildNodeTopology());
    buildable.setStorageClassName(fluent.getStorageClassName());
    return buildable;
  }
  

}