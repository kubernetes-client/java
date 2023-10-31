package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StorageClassBuilder extends V1StorageClassFluent<V1StorageClassBuilder> implements VisitableBuilder<V1StorageClass,V1StorageClassBuilder>{
  public V1StorageClassBuilder() {
    this(new V1StorageClass());
  }
  
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent) {
    this(fluent, new V1StorageClass());
  }
  
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent,V1StorageClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StorageClassBuilder(V1StorageClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StorageClassFluent<?> fluent;
  
  public V1StorageClass build() {
    V1StorageClass buildable = new V1StorageClass();
    buildable.setAllowVolumeExpansion(fluent.getAllowVolumeExpansion());
    buildable.setAllowedTopologies(fluent.buildAllowedTopologies());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setMountOptions(fluent.getMountOptions());
    buildable.setParameters(fluent.getParameters());
    buildable.setProvisioner(fluent.getProvisioner());
    buildable.setReclaimPolicy(fluent.getReclaimPolicy());
    buildable.setVolumeBindingMode(fluent.getVolumeBindingMode());
    return buildable;
  }
  

}