package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StorageClassBuilder extends V1StorageClassFluentImpl<V1StorageClassBuilder> implements VisitableBuilder<V1StorageClass,V1StorageClassBuilder>{
  public V1StorageClassBuilder() {
    this(false);
  }
  public V1StorageClassBuilder(Boolean validationEnabled) {
    this(new V1StorageClass(), validationEnabled);
  }
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StorageClass(), validationEnabled);
  }
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent,V1StorageClass instance) {
    this(fluent, instance, false);
  }
  public V1StorageClassBuilder(V1StorageClassFluent<?> fluent,V1StorageClass instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAllowVolumeExpansion(instance.getAllowVolumeExpansion());

    fluent.withAllowedTopologies(instance.getAllowedTopologies());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withMountOptions(instance.getMountOptions());

    fluent.withParameters(instance.getParameters());

    fluent.withProvisioner(instance.getProvisioner());

    fluent.withReclaimPolicy(instance.getReclaimPolicy());

    fluent.withVolumeBindingMode(instance.getVolumeBindingMode());

    this.validationEnabled = validationEnabled; 
  }
  public V1StorageClassBuilder(V1StorageClass instance) {
    this(instance,false);
  }
  public V1StorageClassBuilder(V1StorageClass instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAllowVolumeExpansion(instance.getAllowVolumeExpansion());

    this.withAllowedTopologies(instance.getAllowedTopologies());

    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withMountOptions(instance.getMountOptions());

    this.withParameters(instance.getParameters());

    this.withProvisioner(instance.getProvisioner());

    this.withReclaimPolicy(instance.getReclaimPolicy());

    this.withVolumeBindingMode(instance.getVolumeBindingMode());

    this.validationEnabled = validationEnabled; 
  }
  V1StorageClassFluent<?> fluent;
  Boolean validationEnabled;
  public V1StorageClass build() {
    V1StorageClass buildable = new V1StorageClass();
    buildable.setAllowVolumeExpansion(fluent.getAllowVolumeExpansion());
    buildable.setAllowedTopologies(fluent.getAllowedTopologies());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setMountOptions(fluent.getMountOptions());
    buildable.setParameters(fluent.getParameters());
    buildable.setProvisioner(fluent.getProvisioner());
    buildable.setReclaimPolicy(fluent.getReclaimPolicy());
    buildable.setVolumeBindingMode(fluent.getVolumeBindingMode());
    return buildable;
  }
  
}