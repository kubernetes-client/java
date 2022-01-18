/*
Copyright 2022 The Kubernetes Authors.
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

public class V1VolumeBuilder
    extends io.kubernetes.client.openapi.models.V1VolumeFluentImpl<
        io.kubernetes.client.openapi.models.V1VolumeBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1Volume,
        io.kubernetes.client.openapi.models.V1VolumeBuilder> {
  public V1VolumeBuilder() {
    this(false);
  }

  public V1VolumeBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Volume(), validationEnabled);
  }

  public V1VolumeBuilder(io.kubernetes.client.openapi.models.V1VolumeFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeBuilder(
      io.kubernetes.client.openapi.models.V1VolumeFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1Volume(), validationEnabled);
  }

  public V1VolumeBuilder(
      io.kubernetes.client.openapi.models.V1VolumeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Volume instance) {
    this(fluent, instance, false);
  }

  public V1VolumeBuilder(
      io.kubernetes.client.openapi.models.V1VolumeFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1Volume instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAwsElasticBlockStore(instance.getAwsElasticBlockStore());

    fluent.withAzureDisk(instance.getAzureDisk());

    fluent.withAzureFile(instance.getAzureFile());

    fluent.withCephfs(instance.getCephfs());

    fluent.withCinder(instance.getCinder());

    fluent.withConfigMap(instance.getConfigMap());

    fluent.withCsi(instance.getCsi());

    fluent.withDownwardAPI(instance.getDownwardAPI());

    fluent.withEmptyDir(instance.getEmptyDir());

    fluent.withEphemeral(instance.getEphemeral());

    fluent.withFc(instance.getFc());

    fluent.withFlexVolume(instance.getFlexVolume());

    fluent.withFlocker(instance.getFlocker());

    fluent.withGcePersistentDisk(instance.getGcePersistentDisk());

    fluent.withGitRepo(instance.getGitRepo());

    fluent.withGlusterfs(instance.getGlusterfs());

    fluent.withHostPath(instance.getHostPath());

    fluent.withIscsi(instance.getIscsi());

    fluent.withName(instance.getName());

    fluent.withNfs(instance.getNfs());

    fluent.withPersistentVolumeClaim(instance.getPersistentVolumeClaim());

    fluent.withPhotonPersistentDisk(instance.getPhotonPersistentDisk());

    fluent.withPortworxVolume(instance.getPortworxVolume());

    fluent.withProjected(instance.getProjected());

    fluent.withQuobyte(instance.getQuobyte());

    fluent.withRbd(instance.getRbd());

    fluent.withScaleIO(instance.getScaleIO());

    fluent.withSecret(instance.getSecret());

    fluent.withStorageos(instance.getStorageos());

    fluent.withVsphereVolume(instance.getVsphereVolume());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeBuilder(io.kubernetes.client.openapi.models.V1Volume instance) {
    this(instance, false);
  }

  public V1VolumeBuilder(
      io.kubernetes.client.openapi.models.V1Volume instance, java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore());

    this.withAzureDisk(instance.getAzureDisk());

    this.withAzureFile(instance.getAzureFile());

    this.withCephfs(instance.getCephfs());

    this.withCinder(instance.getCinder());

    this.withConfigMap(instance.getConfigMap());

    this.withCsi(instance.getCsi());

    this.withDownwardAPI(instance.getDownwardAPI());

    this.withEmptyDir(instance.getEmptyDir());

    this.withEphemeral(instance.getEphemeral());

    this.withFc(instance.getFc());

    this.withFlexVolume(instance.getFlexVolume());

    this.withFlocker(instance.getFlocker());

    this.withGcePersistentDisk(instance.getGcePersistentDisk());

    this.withGitRepo(instance.getGitRepo());

    this.withGlusterfs(instance.getGlusterfs());

    this.withHostPath(instance.getHostPath());

    this.withIscsi(instance.getIscsi());

    this.withName(instance.getName());

    this.withNfs(instance.getNfs());

    this.withPersistentVolumeClaim(instance.getPersistentVolumeClaim());

    this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk());

    this.withPortworxVolume(instance.getPortworxVolume());

    this.withProjected(instance.getProjected());

    this.withQuobyte(instance.getQuobyte());

    this.withRbd(instance.getRbd());

    this.withScaleIO(instance.getScaleIO());

    this.withSecret(instance.getSecret());

    this.withStorageos(instance.getStorageos());

    this.withVsphereVolume(instance.getVsphereVolume());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1VolumeFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1Volume build() {
    V1Volume buildable = new V1Volume();
    buildable.setAwsElasticBlockStore(fluent.getAwsElasticBlockStore());
    buildable.setAzureDisk(fluent.getAzureDisk());
    buildable.setAzureFile(fluent.getAzureFile());
    buildable.setCephfs(fluent.getCephfs());
    buildable.setCinder(fluent.getCinder());
    buildable.setConfigMap(fluent.getConfigMap());
    buildable.setCsi(fluent.getCsi());
    buildable.setDownwardAPI(fluent.getDownwardAPI());
    buildable.setEmptyDir(fluent.getEmptyDir());
    buildable.setEphemeral(fluent.getEphemeral());
    buildable.setFc(fluent.getFc());
    buildable.setFlexVolume(fluent.getFlexVolume());
    buildable.setFlocker(fluent.getFlocker());
    buildable.setGcePersistentDisk(fluent.getGcePersistentDisk());
    buildable.setGitRepo(fluent.getGitRepo());
    buildable.setGlusterfs(fluent.getGlusterfs());
    buildable.setHostPath(fluent.getHostPath());
    buildable.setIscsi(fluent.getIscsi());
    buildable.setName(fluent.getName());
    buildable.setNfs(fluent.getNfs());
    buildable.setPersistentVolumeClaim(fluent.getPersistentVolumeClaim());
    buildable.setPhotonPersistentDisk(fluent.getPhotonPersistentDisk());
    buildable.setPortworxVolume(fluent.getPortworxVolume());
    buildable.setProjected(fluent.getProjected());
    buildable.setQuobyte(fluent.getQuobyte());
    buildable.setRbd(fluent.getRbd());
    buildable.setScaleIO(fluent.getScaleIO());
    buildable.setSecret(fluent.getSecret());
    buildable.setStorageos(fluent.getStorageos());
    buildable.setVsphereVolume(fluent.getVsphereVolume());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeBuilder that = (V1VolumeBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
