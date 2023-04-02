package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1CSIStorageCapacityBuilder extends V1beta1CSIStorageCapacityFluentImpl<V1beta1CSIStorageCapacityBuilder> implements VisitableBuilder<V1beta1CSIStorageCapacity,V1beta1CSIStorageCapacityBuilder>{
  public V1beta1CSIStorageCapacityBuilder() {
    this(false);
  }
  public V1beta1CSIStorageCapacityBuilder(Boolean validationEnabled) {
    this(new V1beta1CSIStorageCapacity(), validationEnabled);
  }
  public V1beta1CSIStorageCapacityBuilder(V1beta1CSIStorageCapacityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1CSIStorageCapacityBuilder(V1beta1CSIStorageCapacityFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1CSIStorageCapacity(), validationEnabled);
  }
  public V1beta1CSIStorageCapacityBuilder(V1beta1CSIStorageCapacityFluent<?> fluent,V1beta1CSIStorageCapacity instance) {
    this(fluent, instance, false);
  }
  public V1beta1CSIStorageCapacityBuilder(V1beta1CSIStorageCapacityFluent<?> fluent,V1beta1CSIStorageCapacity instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withCapacity(instance.getCapacity());

    fluent.withKind(instance.getKind());

    fluent.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    fluent.withMetadata(instance.getMetadata());

    fluent.withNodeTopology(instance.getNodeTopology());

    fluent.withStorageClassName(instance.getStorageClassName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1CSIStorageCapacityBuilder(V1beta1CSIStorageCapacity instance) {
    this(instance,false);
  }
  public V1beta1CSIStorageCapacityBuilder(V1beta1CSIStorageCapacity instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withCapacity(instance.getCapacity());

    this.withKind(instance.getKind());

    this.withMaximumVolumeSize(instance.getMaximumVolumeSize());

    this.withMetadata(instance.getMetadata());

    this.withNodeTopology(instance.getNodeTopology());

    this.withStorageClassName(instance.getStorageClassName());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1CSIStorageCapacityFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1CSIStorageCapacity build() {
    V1beta1CSIStorageCapacity buildable = new V1beta1CSIStorageCapacity();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setKind(fluent.getKind());
    buildable.setMaximumVolumeSize(fluent.getMaximumVolumeSize());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setNodeTopology(fluent.getNodeTopology());
    buildable.setStorageClassName(fluent.getStorageClassName());
    return buildable;
  }
  
}