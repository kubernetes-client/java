package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeSpecBuilder extends V1PersistentVolumeSpecFluentImpl<V1PersistentVolumeSpecBuilder> implements VisitableBuilder<V1PersistentVolumeSpec,V1PersistentVolumeSpecBuilder>{
  public V1PersistentVolumeSpecBuilder() {
    this(false);
  }
  public V1PersistentVolumeSpecBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolumeSpec(), validationEnabled);
  }
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolumeSpec(), validationEnabled);
  }
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpecFluent<?> fluent,V1PersistentVolumeSpec instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpecFluent<?> fluent,V1PersistentVolumeSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAccessModes(instance.getAccessModes());

    fluent.withAwsElasticBlockStore(instance.getAwsElasticBlockStore());

    fluent.withAzureDisk(instance.getAzureDisk());

    fluent.withAzureFile(instance.getAzureFile());

    fluent.withCapacity(instance.getCapacity());

    fluent.withCephfs(instance.getCephfs());

    fluent.withCinder(instance.getCinder());

    fluent.withClaimRef(instance.getClaimRef());

    fluent.withCsi(instance.getCsi());

    fluent.withFc(instance.getFc());

    fluent.withFlexVolume(instance.getFlexVolume());

    fluent.withFlocker(instance.getFlocker());

    fluent.withGcePersistentDisk(instance.getGcePersistentDisk());

    fluent.withGlusterfs(instance.getGlusterfs());

    fluent.withHostPath(instance.getHostPath());

    fluent.withIscsi(instance.getIscsi());

    fluent.withLocal(instance.getLocal());

    fluent.withMountOptions(instance.getMountOptions());

    fluent.withNfs(instance.getNfs());

    fluent.withNodeAffinity(instance.getNodeAffinity());

    fluent.withPersistentVolumeReclaimPolicy(instance.getPersistentVolumeReclaimPolicy());

    fluent.withPhotonPersistentDisk(instance.getPhotonPersistentDisk());

    fluent.withPortworxVolume(instance.getPortworxVolume());

    fluent.withQuobyte(instance.getQuobyte());

    fluent.withRbd(instance.getRbd());

    fluent.withScaleIO(instance.getScaleIO());

    fluent.withStorageClassName(instance.getStorageClassName());

    fluent.withStorageos(instance.getStorageos());

    fluent.withVolumeMode(instance.getVolumeMode());

    fluent.withVsphereVolume(instance.getVsphereVolume());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpec instance) {
    this(instance,false);
  }
  public V1PersistentVolumeSpecBuilder(V1PersistentVolumeSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAccessModes(instance.getAccessModes());

    this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore());

    this.withAzureDisk(instance.getAzureDisk());

    this.withAzureFile(instance.getAzureFile());

    this.withCapacity(instance.getCapacity());

    this.withCephfs(instance.getCephfs());

    this.withCinder(instance.getCinder());

    this.withClaimRef(instance.getClaimRef());

    this.withCsi(instance.getCsi());

    this.withFc(instance.getFc());

    this.withFlexVolume(instance.getFlexVolume());

    this.withFlocker(instance.getFlocker());

    this.withGcePersistentDisk(instance.getGcePersistentDisk());

    this.withGlusterfs(instance.getGlusterfs());

    this.withHostPath(instance.getHostPath());

    this.withIscsi(instance.getIscsi());

    this.withLocal(instance.getLocal());

    this.withMountOptions(instance.getMountOptions());

    this.withNfs(instance.getNfs());

    this.withNodeAffinity(instance.getNodeAffinity());

    this.withPersistentVolumeReclaimPolicy(instance.getPersistentVolumeReclaimPolicy());

    this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk());

    this.withPortworxVolume(instance.getPortworxVolume());

    this.withQuobyte(instance.getQuobyte());

    this.withRbd(instance.getRbd());

    this.withScaleIO(instance.getScaleIO());

    this.withStorageClassName(instance.getStorageClassName());

    this.withStorageos(instance.getStorageos());

    this.withVolumeMode(instance.getVolumeMode());

    this.withVsphereVolume(instance.getVsphereVolume());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolumeSpec build() {
    V1PersistentVolumeSpec buildable = new V1PersistentVolumeSpec();
    buildable.setAccessModes(fluent.getAccessModes());
    buildable.setAwsElasticBlockStore(fluent.getAwsElasticBlockStore());
    buildable.setAzureDisk(fluent.getAzureDisk());
    buildable.setAzureFile(fluent.getAzureFile());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setCephfs(fluent.getCephfs());
    buildable.setCinder(fluent.getCinder());
    buildable.setClaimRef(fluent.getClaimRef());
    buildable.setCsi(fluent.getCsi());
    buildable.setFc(fluent.getFc());
    buildable.setFlexVolume(fluent.getFlexVolume());
    buildable.setFlocker(fluent.getFlocker());
    buildable.setGcePersistentDisk(fluent.getGcePersistentDisk());
    buildable.setGlusterfs(fluent.getGlusterfs());
    buildable.setHostPath(fluent.getHostPath());
    buildable.setIscsi(fluent.getIscsi());
    buildable.setLocal(fluent.getLocal());
    buildable.setMountOptions(fluent.getMountOptions());
    buildable.setNfs(fluent.getNfs());
    buildable.setNodeAffinity(fluent.getNodeAffinity());
    buildable.setPersistentVolumeReclaimPolicy(fluent.getPersistentVolumeReclaimPolicy());
    buildable.setPhotonPersistentDisk(fluent.getPhotonPersistentDisk());
    buildable.setPortworxVolume(fluent.getPortworxVolume());
    buildable.setQuobyte(fluent.getQuobyte());
    buildable.setRbd(fluent.getRbd());
    buildable.setScaleIO(fluent.getScaleIO());
    buildable.setStorageClassName(fluent.getStorageClassName());
    buildable.setStorageos(fluent.getStorageos());
    buildable.setVolumeMode(fluent.getVolumeMode());
    buildable.setVsphereVolume(fluent.getVsphereVolume());
    return buildable;
  }
  
}