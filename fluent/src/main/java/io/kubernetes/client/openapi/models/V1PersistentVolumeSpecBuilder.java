package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeSpecBuilder extends V1PersistentVolumeSpecFluent<V1PersistentVolumeSpecBuilder> implements VisitableBuilder<V1PersistentVolumeSpec,V1PersistentVolumeSpecBuilder>{
  public V1PersistentVolumeSpecBuilder() {
    this(new V1PersistentVolumeSpec());
  }
  
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpecFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeSpec());
  }
  
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpecFluent<?> fluent,V1PersistentVolumeSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeSpecFluent<?> fluent;
  
  public V1PersistentVolumeSpec build() {
    V1PersistentVolumeSpec buildable = new V1PersistentVolumeSpec();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setAwsElasticBlockStore(fluent.buildAwsElasticBlockStore());
    buildable.setAzureDisk(fluent.buildAzureDisk());
    buildable.setAzureFile(fluent.buildAzureFile());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setCephfs(fluent.buildCephfs());
    buildable.setCinder(fluent.buildCinder());
    buildable.setClaimRef(fluent.buildClaimRef());
    buildable.setCsi(fluent.buildCsi());
    buildable.setFc(fluent.buildFc());
    buildable.setFlexVolume(fluent.buildFlexVolume());
    buildable.setFlocker(fluent.buildFlocker());
    buildable.setGcePersistentDisk(fluent.buildGcePersistentDisk());
    buildable.setGlusterfs(fluent.buildGlusterfs());
    buildable.setHostPath(fluent.buildHostPath());
    buildable.setIscsi(fluent.buildIscsi());
    buildable.setLocal(fluent.buildLocal());
    buildable.setMountOptions(fluent.getMountOptions());
    buildable.setNfs(fluent.buildNfs());
    buildable.setNodeAffinity(fluent.buildNodeAffinity());
    buildable.setPersistentVolumeReclaimPolicy(fluent.getPersistentVolumeReclaimPolicy());
    buildable.setPhotonPersistentDisk(fluent.buildPhotonPersistentDisk());
    buildable.setPortworxVolume(fluent.buildPortworxVolume());
    buildable.setQuobyte(fluent.buildQuobyte());
    buildable.setRbd(fluent.buildRbd());
    buildable.setScaleIO(fluent.buildScaleIO());
    buildable.setStorageClassName(fluent.getStorageClassName());
    buildable.setStorageos(fluent.buildStorageos());
    buildable.setVolumeAttributesClassName(fluent.getVolumeAttributesClassName());
    buildable.setVolumeMode(fluent.getVolumeMode());
    buildable.setVsphereVolume(fluent.buildVsphereVolume());
    return buildable;
  }
  

}