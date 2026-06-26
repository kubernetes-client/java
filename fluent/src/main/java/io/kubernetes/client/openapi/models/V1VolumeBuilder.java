/*
Copyright 2026 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1VolumeBuilder extends V1VolumeFluent<V1VolumeBuilder> implements VisitableBuilder<V1Volume,V1VolumeBuilder>{

  V1VolumeFluent<?> fluent;

  public V1VolumeBuilder() {
    this(new V1Volume());
  }
  
  public V1VolumeBuilder(V1VolumeFluent<?> fluent) {
    this(fluent, new V1Volume());
  }
  
  public V1VolumeBuilder(V1Volume instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1VolumeBuilder(V1VolumeFluent<?> fluent,V1Volume instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

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
    buildable.setImage(fluent.buildImage());
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