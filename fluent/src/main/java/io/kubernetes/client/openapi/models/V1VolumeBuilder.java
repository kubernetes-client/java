package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeBuilder extends V1VolumeFluent<V1VolumeBuilder> implements VisitableBuilder<V1Volume,V1VolumeBuilder>{
  public V1VolumeBuilder() {
    this(new V1Volume());
  }
  
  public V1VolumeBuilder(V1VolumeFluent<?> fluent) {
    this(fluent, new V1Volume());
  }
  
  public V1VolumeBuilder(V1VolumeFluent<?> fluent,V1Volume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeBuilder(V1Volume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeFluent<?> fluent;
  
  public V1Volume build() {
    V1Volume buildable = new V1Volume();
    buildable.setAwsElasticBlockStore(fluent.buildAwsElasticBlockStore());
    buildable.setAzureDisk(fluent.buildAzureDisk());
    buildable.setAzureFile(fluent.buildAzureFile());
    buildable.setCephfs(fluent.buildCephfs());
    buildable.setCinder(fluent.buildCinder());
    buildable.setConfigMap(fluent.buildConfigMap());
    buildable.setCsi(fluent.buildCsi());
    buildable.setDownwardAPI(fluent.buildDownwardAPI());
    buildable.setEmptyDir(fluent.buildEmptyDir());
    buildable.setEphemeral(fluent.buildEphemeral());
    buildable.setFc(fluent.buildFc());
    buildable.setFlexVolume(fluent.buildFlexVolume());
    buildable.setFlocker(fluent.buildFlocker());
    buildable.setGcePersistentDisk(fluent.buildGcePersistentDisk());
    buildable.setGitRepo(fluent.buildGitRepo());
    buildable.setGlusterfs(fluent.buildGlusterfs());
    buildable.setHostPath(fluent.buildHostPath());
    buildable.setIscsi(fluent.buildIscsi());
    buildable.setName(fluent.getName());
    buildable.setNfs(fluent.buildNfs());
    buildable.setPersistentVolumeClaim(fluent.buildPersistentVolumeClaim());
    buildable.setPhotonPersistentDisk(fluent.buildPhotonPersistentDisk());
    buildable.setPortworxVolume(fluent.buildPortworxVolume());
    buildable.setProjected(fluent.buildProjected());
    buildable.setQuobyte(fluent.buildQuobyte());
    buildable.setRbd(fluent.buildRbd());
    buildable.setScaleIO(fluent.buildScaleIO());
    buildable.setSecret(fluent.buildSecret());
    buildable.setStorageos(fluent.buildStorageos());
    buildable.setVsphereVolume(fluent.buildVsphereVolume());
    return buildable;
  }
  

}