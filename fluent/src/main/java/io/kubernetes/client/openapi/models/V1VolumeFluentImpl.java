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

/** Generated */
public class V1VolumeFluentImpl<A extends io.kubernetes.client.openapi.models.V1VolumeFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1VolumeFluent<A> {
  public V1VolumeFluentImpl() {}

  public V1VolumeFluentImpl(io.kubernetes.client.openapi.models.V1Volume instance) {
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
  }

  private io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder
      awsElasticBlockStore;
  private io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder azureDisk;
  private io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder azureFile;
  private io.kubernetes.client.openapi.models.V1CephFSVolumeSourceBuilder cephfs;
  private io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder cinder;
  private io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder configMap;
  private io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder csi;
  private io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceBuilder downwardAPI;
  private io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceBuilder emptyDir;
  private io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder ephemeral;
  private io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder fc;
  private io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder flexVolume;
  private io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder flocker;
  private io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder
      gcePersistentDisk;
  private io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder gitRepo;
  private io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder glusterfs;
  private io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder hostPath;
  private io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceBuilder iscsi;
  private java.lang.String name;
  private io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder nfs;
  private io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder
      persistentVolumeClaim;
  private io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder
      photonPersistentDisk;
  private io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder portworxVolume;
  private io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder projected;
  private io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder quobyte;
  private io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder rbd;
  private io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceBuilder scaleIO;
  private io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder secret;
  private io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder storageos;
  private io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder vsphereVolume;

  /**
   * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource
      getAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null ? this.awsElasticBlockStore.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource
      buildAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null ? this.awsElasticBlockStore.build() : null;
  }

  public A withAwsElasticBlockStore(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    _visitables.get("awsElasticBlockStore").remove(this.awsElasticBlockStore);
    if (awsElasticBlockStore != null) {
      this.awsElasticBlockStore =
          new io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder(
              awsElasticBlockStore);
      _visitables.get("awsElasticBlockStore").add(this.awsElasticBlockStore);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      withNewAwsElasticBlockStore() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl
        .AwsElasticBlockStoreNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      withNewAwsElasticBlockStoreLike(
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl
        .AwsElasticBlockStoreNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      editAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      editOrNewAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(
        getAwsElasticBlockStore() != null
            ? getAwsElasticBlockStore()
            : new io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      editOrNewAwsElasticBlockStoreLike(
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource item) {
    return withNewAwsElasticBlockStoreLike(
        getAwsElasticBlockStore() != null ? getAwsElasticBlockStore() : item);
  }

  /**
   * This method has been deprecated, please use method buildAzureDisk instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource getAzureDisk() {
    return this.azureDisk != null ? this.azureDisk.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource buildAzureDisk() {
    return this.azureDisk != null ? this.azureDisk.build() : null;
  }

  public A withAzureDisk(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource azureDisk) {
    _visitables.get("azureDisk").remove(this.azureDisk);
    if (azureDisk != null) {
      this.azureDisk =
          new io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder(azureDisk);
      _visitables.get("azureDisk").add(this.azureDisk);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAzureDisk() {
    return this.azureDisk != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A> withNewAzureDisk() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.AzureDiskNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A> withNewAzureDiskLike(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.AzureDiskNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A> editAzureDisk() {
    return withNewAzureDiskLike(getAzureDisk());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A>
      editOrNewAzureDisk() {
    return withNewAzureDiskLike(
        getAzureDisk() != null
            ? getAzureDisk()
            : new io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A>
      editOrNewAzureDiskLike(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item) {
    return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk() : item);
  }

  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AzureFileVolumeSource getAzureFile() {
    return this.azureFile != null ? this.azureFile.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1AzureFileVolumeSource buildAzureFile() {
    return this.azureFile != null ? this.azureFile.build() : null;
  }

  public A withAzureFile(io.kubernetes.client.openapi.models.V1AzureFileVolumeSource azureFile) {
    _visitables.get("azureFile").remove(this.azureFile);
    if (azureFile != null) {
      this.azureFile =
          new io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder(azureFile);
      _visitables.get("azureFile").add(this.azureFile);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAzureFile() {
    return this.azureFile != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A> withNewAzureFile() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.AzureFileNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A> withNewAzureFileLike(
      io.kubernetes.client.openapi.models.V1AzureFileVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.AzureFileNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A> editAzureFile() {
    return withNewAzureFileLike(getAzureFile());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A>
      editOrNewAzureFile() {
    return withNewAzureFileLike(
        getAzureFile() != null
            ? getAzureFile()
            : new io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A>
      editOrNewAzureFileLike(io.kubernetes.client.openapi.models.V1AzureFileVolumeSource item) {
    return withNewAzureFileLike(getAzureFile() != null ? getAzureFile() : item);
  }

  /**
   * This method has been deprecated, please use method buildCephfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CephFSVolumeSource getCephfs() {
    return this.cephfs != null ? this.cephfs.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSource buildCephfs() {
    return this.cephfs != null ? this.cephfs.build() : null;
  }

  public A withCephfs(io.kubernetes.client.openapi.models.V1CephFSVolumeSource cephfs) {
    _visitables.get("cephfs").remove(this.cephfs);
    if (cephfs != null) {
      this.cephfs = new io.kubernetes.client.openapi.models.V1CephFSVolumeSourceBuilder(cephfs);
      _visitables.get("cephfs").add(this.cephfs);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCephfs() {
    return this.cephfs != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> withNewCephfs() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.CephfsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> withNewCephfsLike(
      io.kubernetes.client.openapi.models.V1CephFSVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.CephfsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> editCephfs() {
    return withNewCephfsLike(getCephfs());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> editOrNewCephfs() {
    return withNewCephfsLike(
        getCephfs() != null
            ? getCephfs()
            : new io.kubernetes.client.openapi.models.V1CephFSVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> editOrNewCephfsLike(
      io.kubernetes.client.openapi.models.V1CephFSVolumeSource item) {
    return withNewCephfsLike(getCephfs() != null ? getCephfs() : item);
  }

  /**
   * This method has been deprecated, please use method buildCinder instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CinderVolumeSource getCinder() {
    return this.cinder != null ? this.cinder.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CinderVolumeSource buildCinder() {
    return this.cinder != null ? this.cinder.build() : null;
  }

  public A withCinder(io.kubernetes.client.openapi.models.V1CinderVolumeSource cinder) {
    _visitables.get("cinder").remove(this.cinder);
    if (cinder != null) {
      this.cinder = new io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder(cinder);
      _visitables.get("cinder").add(this.cinder);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCinder() {
    return this.cinder != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> withNewCinder() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.CinderNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> withNewCinderLike(
      io.kubernetes.client.openapi.models.V1CinderVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.CinderNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> editCinder() {
    return withNewCinderLike(getCinder());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> editOrNewCinder() {
    return withNewCinderLike(
        getCinder() != null
            ? getCinder()
            : new io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> editOrNewCinderLike(
      io.kubernetes.client.openapi.models.V1CinderVolumeSource item) {
    return withNewCinderLike(getCinder() != null ? getCinder() : item);
  }

  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource getConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }

  public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource configMap) {
    _visitables.get("configMap").remove(this.configMap);
    if (configMap != null) {
      this.configMap =
          new io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder(configMap);
      _visitables.get("configMap").add(this.configMap);
    }
    return (A) this;
  }

  public java.lang.Boolean hasConfigMap() {
    return this.configMap != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A> withNewConfigMap() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.ConfigMapNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A> withNewConfigMapLike(
      io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.ConfigMapNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A> editConfigMap() {
    return withNewConfigMapLike(getConfigMap());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A>
      editOrNewConfigMap() {
    return withNewConfigMapLike(
        getConfigMap() != null
            ? getConfigMap()
            : new io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A>
      editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource item) {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap() : item);
  }

  /**
   * This method has been deprecated, please use method buildCsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CSIVolumeSource getCsi() {
    return this.csi != null ? this.csi.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CSIVolumeSource buildCsi() {
    return this.csi != null ? this.csi.build() : null;
  }

  public A withCsi(io.kubernetes.client.openapi.models.V1CSIVolumeSource csi) {
    _visitables.get("csi").remove(this.csi);
    if (csi != null) {
      this.csi = new io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder(csi);
      _visitables.get("csi").add(this.csi);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCsi() {
    return this.csi != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> withNewCsi() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.CsiNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> withNewCsiLike(
      io.kubernetes.client.openapi.models.V1CSIVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.CsiNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> editCsi() {
    return withNewCsiLike(getCsi());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> editOrNewCsi() {
    return withNewCsiLike(
        getCsi() != null
            ? getCsi()
            : new io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> editOrNewCsiLike(
      io.kubernetes.client.openapi.models.V1CSIVolumeSource item) {
    return withNewCsiLike(getCsi() != null ? getCsi() : item);
  }

  /**
   * This method has been deprecated, please use method buildDownwardAPI instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource getDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource buildDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }

  public A withDownwardAPI(
      io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource downwardAPI) {
    _visitables.get("downwardAPI").remove(this.downwardAPI);
    if (downwardAPI != null) {
      this.downwardAPI =
          new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceBuilder(downwardAPI);
      _visitables.get("downwardAPI").add(this.downwardAPI);
    }
    return (A) this;
  }

  public java.lang.Boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      withNewDownwardAPI() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.DownwardAPINestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      withNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.DownwardAPINestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A> editDownwardAPI() {
    return withNewDownwardAPILike(getDownwardAPI());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      editOrNewDownwardAPI() {
    return withNewDownwardAPILike(
        getDownwardAPI() != null
            ? getDownwardAPI()
            : new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      editOrNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource item) {
    return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI() : item);
  }

  /**
   * This method has been deprecated, please use method buildEmptyDir instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource getEmptyDir() {
    return this.emptyDir != null ? this.emptyDir.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource buildEmptyDir() {
    return this.emptyDir != null ? this.emptyDir.build() : null;
  }

  public A withEmptyDir(io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource emptyDir) {
    _visitables.get("emptyDir").remove(this.emptyDir);
    if (emptyDir != null) {
      this.emptyDir =
          new io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceBuilder(emptyDir);
      _visitables.get("emptyDir").add(this.emptyDir);
    }
    return (A) this;
  }

  public java.lang.Boolean hasEmptyDir() {
    return this.emptyDir != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> withNewEmptyDir() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.EmptyDirNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> withNewEmptyDirLike(
      io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.EmptyDirNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> editEmptyDir() {
    return withNewEmptyDirLike(getEmptyDir());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDir() {
    return withNewEmptyDirLike(
        getEmptyDir() != null
            ? getEmptyDir()
            : new io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDirLike(
      io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource item) {
    return withNewEmptyDirLike(getEmptyDir() != null ? getEmptyDir() : item);
  }

  /**
   * This method has been deprecated, please use method buildEphemeral instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSource getEphemeral() {
    return this.ephemeral != null ? this.ephemeral.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSource buildEphemeral() {
    return this.ephemeral != null ? this.ephemeral.build() : null;
  }

  public A withEphemeral(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource ephemeral) {
    _visitables.get("ephemeral").remove(this.ephemeral);
    if (ephemeral != null) {
      this.ephemeral =
          new io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder(ephemeral);
      _visitables.get("ephemeral").add(this.ephemeral);
    }
    return (A) this;
  }

  public java.lang.Boolean hasEphemeral() {
    return this.ephemeral != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A> withNewEphemeral() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.EphemeralNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A> withNewEphemeralLike(
      io.kubernetes.client.openapi.models.V1EphemeralVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.EphemeralNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A> editEphemeral() {
    return withNewEphemeralLike(getEphemeral());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A>
      editOrNewEphemeral() {
    return withNewEphemeralLike(
        getEphemeral() != null
            ? getEphemeral()
            : new io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A>
      editOrNewEphemeralLike(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource item) {
    return withNewEphemeralLike(getEphemeral() != null ? getEphemeral() : item);
  }

  /**
   * This method has been deprecated, please use method buildFc instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FCVolumeSource getFc() {
    return this.fc != null ? this.fc.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1FCVolumeSource buildFc() {
    return this.fc != null ? this.fc.build() : null;
  }

  public A withFc(io.kubernetes.client.openapi.models.V1FCVolumeSource fc) {
    _visitables.get("fc").remove(this.fc);
    if (fc != null) {
      this.fc = new io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder(fc);
      _visitables.get("fc").add(this.fc);
    }
    return (A) this;
  }

  public java.lang.Boolean hasFc() {
    return this.fc != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> withNewFc() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.FcNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> withNewFcLike(
      io.kubernetes.client.openapi.models.V1FCVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.FcNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> editFc() {
    return withNewFcLike(getFc());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> editOrNewFc() {
    return withNewFcLike(
        getFc() != null
            ? getFc()
            : new io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> editOrNewFcLike(
      io.kubernetes.client.openapi.models.V1FCVolumeSource item) {
    return withNewFcLike(getFc() != null ? getFc() : item);
  }

  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FlexVolumeSource getFlexVolume() {
    return this.flexVolume != null ? this.flexVolume.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1FlexVolumeSource buildFlexVolume() {
    return this.flexVolume != null ? this.flexVolume.build() : null;
  }

  public A withFlexVolume(io.kubernetes.client.openapi.models.V1FlexVolumeSource flexVolume) {
    _visitables.get("flexVolume").remove(this.flexVolume);
    if (flexVolume != null) {
      this.flexVolume =
          new io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder(flexVolume);
      _visitables.get("flexVolume").add(this.flexVolume);
    }
    return (A) this;
  }

  public java.lang.Boolean hasFlexVolume() {
    return this.flexVolume != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A>
      withNewFlexVolume() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.FlexVolumeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A>
      withNewFlexVolumeLike(io.kubernetes.client.openapi.models.V1FlexVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.FlexVolumeNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A> editFlexVolume() {
    return withNewFlexVolumeLike(getFlexVolume());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A>
      editOrNewFlexVolume() {
    return withNewFlexVolumeLike(
        getFlexVolume() != null
            ? getFlexVolume()
            : new io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A>
      editOrNewFlexVolumeLike(io.kubernetes.client.openapi.models.V1FlexVolumeSource item) {
    return withNewFlexVolumeLike(getFlexVolume() != null ? getFlexVolume() : item);
  }

  /**
   * This method has been deprecated, please use method buildFlocker instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FlockerVolumeSource getFlocker() {
    return this.flocker != null ? this.flocker.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1FlockerVolumeSource buildFlocker() {
    return this.flocker != null ? this.flocker.build() : null;
  }

  public A withFlocker(io.kubernetes.client.openapi.models.V1FlockerVolumeSource flocker) {
    _visitables.get("flocker").remove(this.flocker);
    if (flocker != null) {
      this.flocker = new io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder(flocker);
      _visitables.get("flocker").add(this.flocker);
    }
    return (A) this;
  }

  public java.lang.Boolean hasFlocker() {
    return this.flocker != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> withNewFlocker() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.FlockerNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> withNewFlockerLike(
      io.kubernetes.client.openapi.models.V1FlockerVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.FlockerNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> editFlocker() {
    return withNewFlockerLike(getFlocker());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> editOrNewFlocker() {
    return withNewFlockerLike(
        getFlocker() != null
            ? getFlocker()
            : new io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> editOrNewFlockerLike(
      io.kubernetes.client.openapi.models.V1FlockerVolumeSource item) {
    return withNewFlockerLike(getFlocker() != null ? getFlocker() : item);
  }

  /**
   * This method has been deprecated, please use method buildGcePersistentDisk instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource
      getGcePersistentDisk() {
    return this.gcePersistentDisk != null ? this.gcePersistentDisk.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource
      buildGcePersistentDisk() {
    return this.gcePersistentDisk != null ? this.gcePersistentDisk.build() : null;
  }

  public A withGcePersistentDisk(
      io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    _visitables.get("gcePersistentDisk").remove(this.gcePersistentDisk);
    if (gcePersistentDisk != null) {
      this.gcePersistentDisk =
          new io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder(
              gcePersistentDisk);
      _visitables.get("gcePersistentDisk").add(this.gcePersistentDisk);
    }
    return (A) this;
  }

  public java.lang.Boolean hasGcePersistentDisk() {
    return this.gcePersistentDisk != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDisk() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.GcePersistentDiskNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.GcePersistentDiskNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      editGcePersistentDisk() {
    return withNewGcePersistentDiskLike(getGcePersistentDisk());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDisk() {
    return withNewGcePersistentDiskLike(
        getGcePersistentDisk() != null
            ? getGcePersistentDisk()
            : new io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item) {
    return withNewGcePersistentDiskLike(
        getGcePersistentDisk() != null ? getGcePersistentDisk() : item);
  }

  /**
   * This method has been deprecated, please use method buildGitRepo instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GitRepoVolumeSource getGitRepo() {
    return this.gitRepo != null ? this.gitRepo.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1GitRepoVolumeSource buildGitRepo() {
    return this.gitRepo != null ? this.gitRepo.build() : null;
  }

  public A withGitRepo(io.kubernetes.client.openapi.models.V1GitRepoVolumeSource gitRepo) {
    _visitables.get("gitRepo").remove(this.gitRepo);
    if (gitRepo != null) {
      this.gitRepo = new io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder(gitRepo);
      _visitables.get("gitRepo").add(this.gitRepo);
    }
    return (A) this;
  }

  public java.lang.Boolean hasGitRepo() {
    return this.gitRepo != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> withNewGitRepo() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.GitRepoNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> withNewGitRepoLike(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.GitRepoNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> editGitRepo() {
    return withNewGitRepoLike(getGitRepo());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> editOrNewGitRepo() {
    return withNewGitRepoLike(
        getGitRepo() != null
            ? getGitRepo()
            : new io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> editOrNewGitRepoLike(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource item) {
    return withNewGitRepoLike(getGitRepo() != null ? getGitRepo() : item);
  }

  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource getGlusterfs() {
    return this.glusterfs != null ? this.glusterfs.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource buildGlusterfs() {
    return this.glusterfs != null ? this.glusterfs.build() : null;
  }

  public A withGlusterfs(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource glusterfs) {
    _visitables.get("glusterfs").remove(this.glusterfs);
    if (glusterfs != null) {
      this.glusterfs =
          new io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder(glusterfs);
      _visitables.get("glusterfs").add(this.glusterfs);
    }
    return (A) this;
  }

  public java.lang.Boolean hasGlusterfs() {
    return this.glusterfs != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A> withNewGlusterfs() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.GlusterfsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A> withNewGlusterfsLike(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.GlusterfsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A> editGlusterfs() {
    return withNewGlusterfsLike(getGlusterfs());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A>
      editOrNewGlusterfs() {
    return withNewGlusterfsLike(
        getGlusterfs() != null
            ? getGlusterfs()
            : new io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A>
      editOrNewGlusterfsLike(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource item) {
    return withNewGlusterfsLike(getGlusterfs() != null ? getGlusterfs() : item);
  }

  /**
   * This method has been deprecated, please use method buildHostPath instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1HostPathVolumeSource getHostPath() {
    return this.hostPath != null ? this.hostPath.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1HostPathVolumeSource buildHostPath() {
    return this.hostPath != null ? this.hostPath.build() : null;
  }

  public A withHostPath(io.kubernetes.client.openapi.models.V1HostPathVolumeSource hostPath) {
    _visitables.get("hostPath").remove(this.hostPath);
    if (hostPath != null) {
      this.hostPath =
          new io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder(hostPath);
      _visitables.get("hostPath").add(this.hostPath);
    }
    return (A) this;
  }

  public java.lang.Boolean hasHostPath() {
    return this.hostPath != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> withNewHostPath() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.HostPathNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> withNewHostPathLike(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.HostPathNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> editHostPath() {
    return withNewHostPathLike(getHostPath());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> editOrNewHostPath() {
    return withNewHostPathLike(
        getHostPath() != null
            ? getHostPath()
            : new io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> editOrNewHostPathLike(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource item) {
    return withNewHostPathLike(getHostPath() != null ? getHostPath() : item);
  }

  /**
   * This method has been deprecated, please use method buildIscsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSource getIscsi() {
    return this.iscsi != null ? this.iscsi.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSource buildIscsi() {
    return this.iscsi != null ? this.iscsi.build() : null;
  }

  public A withIscsi(io.kubernetes.client.openapi.models.V1ISCSIVolumeSource iscsi) {
    _visitables.get("iscsi").remove(this.iscsi);
    if (iscsi != null) {
      this.iscsi = new io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceBuilder(iscsi);
      _visitables.get("iscsi").add(this.iscsi);
    }
    return (A) this;
  }

  public java.lang.Boolean hasIscsi() {
    return this.iscsi != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> withNewIscsi() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.IscsiNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> withNewIscsiLike(
      io.kubernetes.client.openapi.models.V1ISCSIVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.IscsiNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> editIscsi() {
    return withNewIscsiLike(getIscsi());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> editOrNewIscsi() {
    return withNewIscsiLike(
        getIscsi() != null
            ? getIscsi()
            : new io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> editOrNewIscsiLike(
      io.kubernetes.client.openapi.models.V1ISCSIVolumeSource item) {
    return withNewIscsiLike(getIscsi() != null ? getIscsi() : item);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A) withName(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildNfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NFSVolumeSource getNfs() {
    return this.nfs != null ? this.nfs.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1NFSVolumeSource buildNfs() {
    return this.nfs != null ? this.nfs.build() : null;
  }

  public A withNfs(io.kubernetes.client.openapi.models.V1NFSVolumeSource nfs) {
    _visitables.get("nfs").remove(this.nfs);
    if (nfs != null) {
      this.nfs = new io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder(nfs);
      _visitables.get("nfs").add(this.nfs);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNfs() {
    return this.nfs != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> withNewNfs() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.NfsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> withNewNfsLike(
      io.kubernetes.client.openapi.models.V1NFSVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.NfsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> editNfs() {
    return withNewNfsLike(getNfs());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> editOrNewNfs() {
    return withNewNfsLike(
        getNfs() != null
            ? getNfs()
            : new io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> editOrNewNfsLike(
      io.kubernetes.client.openapi.models.V1NFSVolumeSource item) {
    return withNewNfsLike(getNfs() != null ? getNfs() : item);
  }

  /**
   * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource
      getPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null ? this.persistentVolumeClaim.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource
      buildPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null ? this.persistentVolumeClaim.build() : null;
  }

  public A withPersistentVolumeClaim(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource
          persistentVolumeClaim) {
    _visitables.get("persistentVolumeClaim").remove(this.persistentVolumeClaim);
    if (persistentVolumeClaim != null) {
      this.persistentVolumeClaim =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder(
              persistentVolumeClaim);
      _visitables.get("persistentVolumeClaim").add(this.persistentVolumeClaim);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      withNewPersistentVolumeClaim() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl
        .PersistentVolumeClaimNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      withNewPersistentVolumeClaimLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl
        .PersistentVolumeClaimNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      editPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      editOrNewPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(
        getPersistentVolumeClaim() != null
            ? getPersistentVolumeClaim()
            : new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      editOrNewPersistentVolumeClaimLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource item) {
    return withNewPersistentVolumeClaimLike(
        getPersistentVolumeClaim() != null ? getPersistentVolumeClaim() : item);
  }

  /**
   * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource
      getPhotonPersistentDisk() {
    return this.photonPersistentDisk != null ? this.photonPersistentDisk.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource
      buildPhotonPersistentDisk() {
    return this.photonPersistentDisk != null ? this.photonPersistentDisk.build() : null;
  }

  public A withPhotonPersistentDisk(
      io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    _visitables.get("photonPersistentDisk").remove(this.photonPersistentDisk);
    if (photonPersistentDisk != null) {
      this.photonPersistentDisk =
          new io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder(
              photonPersistentDisk);
      _visitables.get("photonPersistentDisk").add(this.photonPersistentDisk);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPhotonPersistentDisk() {
    return this.photonPersistentDisk != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      withNewPhotonPersistentDisk() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl
        .PhotonPersistentDiskNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      withNewPhotonPersistentDiskLike(
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl
        .PhotonPersistentDiskNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      editPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      editOrNewPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(
        getPhotonPersistentDisk() != null
            ? getPhotonPersistentDisk()
            : new io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      editOrNewPhotonPersistentDiskLike(
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource item) {
    return withNewPhotonPersistentDiskLike(
        getPhotonPersistentDisk() != null ? getPhotonPersistentDisk() : item);
  }

  /**
   * This method has been deprecated, please use method buildPortworxVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PortworxVolumeSource getPortworxVolume() {
    return this.portworxVolume != null ? this.portworxVolume.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1PortworxVolumeSource buildPortworxVolume() {
    return this.portworxVolume != null ? this.portworxVolume.build() : null;
  }

  public A withPortworxVolume(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSource portworxVolume) {
    _visitables.get("portworxVolume").remove(this.portworxVolume);
    if (portworxVolume != null) {
      this.portworxVolume =
          new io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder(portworxVolume);
      _visitables.get("portworxVolume").add(this.portworxVolume);
    }
    return (A) this;
  }

  public java.lang.Boolean hasPortworxVolume() {
    return this.portworxVolume != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      withNewPortworxVolume() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.PortworxVolumeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      withNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.PortworxVolumeNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      editPortworxVolume() {
    return withNewPortworxVolumeLike(getPortworxVolume());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolume() {
    return withNewPortworxVolumeLike(
        getPortworxVolume() != null
            ? getPortworxVolume()
            : new io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item) {
    return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume() : item);
  }

  /**
   * This method has been deprecated, please use method buildProjected instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSource getProjected() {
    return this.projected != null ? this.projected.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSource buildProjected() {
    return this.projected != null ? this.projected.build() : null;
  }

  public A withProjected(io.kubernetes.client.openapi.models.V1ProjectedVolumeSource projected) {
    _visitables.get("projected").remove(this.projected);
    if (projected != null) {
      this.projected =
          new io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder(projected);
      _visitables.get("projected").add(this.projected);
    }
    return (A) this;
  }

  public java.lang.Boolean hasProjected() {
    return this.projected != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A> withNewProjected() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.ProjectedNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A> withNewProjectedLike(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.ProjectedNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A> editProjected() {
    return withNewProjectedLike(getProjected());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A>
      editOrNewProjected() {
    return withNewProjectedLike(
        getProjected() != null
            ? getProjected()
            : new io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A>
      editOrNewProjectedLike(io.kubernetes.client.openapi.models.V1ProjectedVolumeSource item) {
    return withNewProjectedLike(getProjected() != null ? getProjected() : item);
  }

  /**
   * This method has been deprecated, please use method buildQuobyte instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1QuobyteVolumeSource getQuobyte() {
    return this.quobyte != null ? this.quobyte.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1QuobyteVolumeSource buildQuobyte() {
    return this.quobyte != null ? this.quobyte.build() : null;
  }

  public A withQuobyte(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource quobyte) {
    _visitables.get("quobyte").remove(this.quobyte);
    if (quobyte != null) {
      this.quobyte = new io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder(quobyte);
      _visitables.get("quobyte").add(this.quobyte);
    }
    return (A) this;
  }

  public java.lang.Boolean hasQuobyte() {
    return this.quobyte != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> withNewQuobyte() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.QuobyteNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> withNewQuobyteLike(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.QuobyteNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> editQuobyte() {
    return withNewQuobyteLike(getQuobyte());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> editOrNewQuobyte() {
    return withNewQuobyteLike(
        getQuobyte() != null
            ? getQuobyte()
            : new io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> editOrNewQuobyteLike(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item) {
    return withNewQuobyteLike(getQuobyte() != null ? getQuobyte() : item);
  }

  /**
   * This method has been deprecated, please use method buildRbd instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RBDVolumeSource getRbd() {
    return this.rbd != null ? this.rbd.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1RBDVolumeSource buildRbd() {
    return this.rbd != null ? this.rbd.build() : null;
  }

  public A withRbd(io.kubernetes.client.openapi.models.V1RBDVolumeSource rbd) {
    _visitables.get("rbd").remove(this.rbd);
    if (rbd != null) {
      this.rbd = new io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder(rbd);
      _visitables.get("rbd").add(this.rbd);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRbd() {
    return this.rbd != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> withNewRbd() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.RbdNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> withNewRbdLike(
      io.kubernetes.client.openapi.models.V1RBDVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.RbdNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> editRbd() {
    return withNewRbdLike(getRbd());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> editOrNewRbd() {
    return withNewRbdLike(
        getRbd() != null
            ? getRbd()
            : new io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> editOrNewRbdLike(
      io.kubernetes.client.openapi.models.V1RBDVolumeSource item) {
    return withNewRbdLike(getRbd() != null ? getRbd() : item);
  }

  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource getScaleIO() {
    return this.scaleIO != null ? this.scaleIO.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource buildScaleIO() {
    return this.scaleIO != null ? this.scaleIO.build() : null;
  }

  public A withScaleIO(io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource scaleIO) {
    _visitables.get("scaleIO").remove(this.scaleIO);
    if (scaleIO != null) {
      this.scaleIO = new io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceBuilder(scaleIO);
      _visitables.get("scaleIO").add(this.scaleIO);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScaleIO() {
    return this.scaleIO != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> withNewScaleIO() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.ScaleIONestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> withNewScaleIOLike(
      io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.ScaleIONestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> editScaleIO() {
    return withNewScaleIOLike(getScaleIO());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> editOrNewScaleIO() {
    return withNewScaleIOLike(
        getScaleIO() != null
            ? getScaleIO()
            : new io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> editOrNewScaleIOLike(
      io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource item) {
    return withNewScaleIOLike(getScaleIO() != null ? getScaleIO() : item);
  }

  /**
   * This method has been deprecated, please use method buildSecret instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretVolumeSource getSecret() {
    return this.secret != null ? this.secret.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1SecretVolumeSource buildSecret() {
    return this.secret != null ? this.secret.build() : null;
  }

  public A withSecret(io.kubernetes.client.openapi.models.V1SecretVolumeSource secret) {
    _visitables.get("secret").remove(this.secret);
    if (secret != null) {
      this.secret = new io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder(secret);
      _visitables.get("secret").add(this.secret);
    }
    return (A) this;
  }

  public java.lang.Boolean hasSecret() {
    return this.secret != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> withNewSecret() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.SecretNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> withNewSecretLike(
      io.kubernetes.client.openapi.models.V1SecretVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.SecretNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> editSecret() {
    return withNewSecretLike(getSecret());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(
        getSecret() != null
            ? getSecret()
            : new io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> editOrNewSecretLike(
      io.kubernetes.client.openapi.models.V1SecretVolumeSource item) {
    return withNewSecretLike(getSecret() != null ? getSecret() : item);
  }

  /**
   * This method has been deprecated, please use method buildStorageos instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSource getStorageos() {
    return this.storageos != null ? this.storageos.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSource buildStorageos() {
    return this.storageos != null ? this.storageos.build() : null;
  }

  public A withStorageos(io.kubernetes.client.openapi.models.V1StorageOSVolumeSource storageos) {
    _visitables.get("storageos").remove(this.storageos);
    if (storageos != null) {
      this.storageos =
          new io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder(storageos);
      _visitables.get("storageos").add(this.storageos);
    }
    return (A) this;
  }

  public java.lang.Boolean hasStorageos() {
    return this.storageos != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A> withNewStorageos() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.StorageosNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A> withNewStorageosLike(
      io.kubernetes.client.openapi.models.V1StorageOSVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.StorageosNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A> editStorageos() {
    return withNewStorageosLike(getStorageos());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A>
      editOrNewStorageos() {
    return withNewStorageosLike(
        getStorageos() != null
            ? getStorageos()
            : new io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A>
      editOrNewStorageosLike(io.kubernetes.client.openapi.models.V1StorageOSVolumeSource item) {
    return withNewStorageosLike(getStorageos() != null ? getStorageos() : item);
  }

  /**
   * This method has been deprecated, please use method buildVsphereVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return this.vsphereVolume != null ? this.vsphereVolume.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource buildVsphereVolume() {
    return this.vsphereVolume != null ? this.vsphereVolume.build() : null;
  }

  public A withVsphereVolume(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    _visitables.get("vsphereVolume").remove(this.vsphereVolume);
    if (vsphereVolume != null) {
      this.vsphereVolume =
          new io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder(
              vsphereVolume);
      _visitables.get("vsphereVolume").add(this.vsphereVolume);
    }
    return (A) this;
  }

  public java.lang.Boolean hasVsphereVolume() {
    return this.vsphereVolume != null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      withNewVsphereVolume() {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.VsphereVolumeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      withNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1VolumeFluentImpl.VsphereVolumeNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      editVsphereVolume() {
    return withNewVsphereVolumeLike(getVsphereVolume());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolume() {
    return withNewVsphereVolumeLike(
        getVsphereVolume() != null
            ? getVsphereVolume()
            : new io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item) {
    return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeFluentImpl that = (V1VolumeFluentImpl) o;
    if (awsElasticBlockStore != null
        ? !awsElasticBlockStore.equals(that.awsElasticBlockStore)
        : that.awsElasticBlockStore != null) return false;
    if (azureDisk != null ? !azureDisk.equals(that.azureDisk) : that.azureDisk != null)
      return false;
    if (azureFile != null ? !azureFile.equals(that.azureFile) : that.azureFile != null)
      return false;
    if (cephfs != null ? !cephfs.equals(that.cephfs) : that.cephfs != null) return false;
    if (cinder != null ? !cinder.equals(that.cinder) : that.cinder != null) return false;
    if (configMap != null ? !configMap.equals(that.configMap) : that.configMap != null)
      return false;
    if (csi != null ? !csi.equals(that.csi) : that.csi != null) return false;
    if (downwardAPI != null ? !downwardAPI.equals(that.downwardAPI) : that.downwardAPI != null)
      return false;
    if (emptyDir != null ? !emptyDir.equals(that.emptyDir) : that.emptyDir != null) return false;
    if (ephemeral != null ? !ephemeral.equals(that.ephemeral) : that.ephemeral != null)
      return false;
    if (fc != null ? !fc.equals(that.fc) : that.fc != null) return false;
    if (flexVolume != null ? !flexVolume.equals(that.flexVolume) : that.flexVolume != null)
      return false;
    if (flocker != null ? !flocker.equals(that.flocker) : that.flocker != null) return false;
    if (gcePersistentDisk != null
        ? !gcePersistentDisk.equals(that.gcePersistentDisk)
        : that.gcePersistentDisk != null) return false;
    if (gitRepo != null ? !gitRepo.equals(that.gitRepo) : that.gitRepo != null) return false;
    if (glusterfs != null ? !glusterfs.equals(that.glusterfs) : that.glusterfs != null)
      return false;
    if (hostPath != null ? !hostPath.equals(that.hostPath) : that.hostPath != null) return false;
    if (iscsi != null ? !iscsi.equals(that.iscsi) : that.iscsi != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (nfs != null ? !nfs.equals(that.nfs) : that.nfs != null) return false;
    if (persistentVolumeClaim != null
        ? !persistentVolumeClaim.equals(that.persistentVolumeClaim)
        : that.persistentVolumeClaim != null) return false;
    if (photonPersistentDisk != null
        ? !photonPersistentDisk.equals(that.photonPersistentDisk)
        : that.photonPersistentDisk != null) return false;
    if (portworxVolume != null
        ? !portworxVolume.equals(that.portworxVolume)
        : that.portworxVolume != null) return false;
    if (projected != null ? !projected.equals(that.projected) : that.projected != null)
      return false;
    if (quobyte != null ? !quobyte.equals(that.quobyte) : that.quobyte != null) return false;
    if (rbd != null ? !rbd.equals(that.rbd) : that.rbd != null) return false;
    if (scaleIO != null ? !scaleIO.equals(that.scaleIO) : that.scaleIO != null) return false;
    if (secret != null ? !secret.equals(that.secret) : that.secret != null) return false;
    if (storageos != null ? !storageos.equals(that.storageos) : that.storageos != null)
      return false;
    if (vsphereVolume != null
        ? !vsphereVolume.equals(that.vsphereVolume)
        : that.vsphereVolume != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        awsElasticBlockStore,
        azureDisk,
        azureFile,
        cephfs,
        cinder,
        configMap,
        csi,
        downwardAPI,
        emptyDir,
        ephemeral,
        fc,
        flexVolume,
        flocker,
        gcePersistentDisk,
        gitRepo,
        glusterfs,
        hostPath,
        iscsi,
        name,
        nfs,
        persistentVolumeClaim,
        photonPersistentDisk,
        portworxVolume,
        projected,
        quobyte,
        rbd,
        scaleIO,
        secret,
        storageos,
        vsphereVolume,
        super.hashCode());
  }

  public class AwsElasticBlockStoreNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AwsElasticBlockStoreNestedImpl(
        io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder(
              this, item);
    }

    AwsElasticBlockStoreNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withAwsElasticBlockStore(builder.build());
    }

    public N endAwsElasticBlockStore() {
      return and();
    }
  }

  public class AzureDiskNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AzureDiskNestedImpl(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder(this, item);
    }

    AzureDiskNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withAzureDisk(builder.build());
    }

    public N endAzureDisk() {
      return and();
    }
  }

  public class AzureFileNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    AzureFileNestedImpl(io.kubernetes.client.openapi.models.V1AzureFileVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder(this, item);
    }

    AzureFileNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withAzureFile(builder.build());
    }

    public N endAzureFile() {
      return and();
    }
  }

  public class CephfsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CephfsNestedImpl(io.kubernetes.client.openapi.models.V1CephFSVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CephFSVolumeSourceBuilder(this, item);
    }

    CephfsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1CephFSVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CephFSVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withCephfs(builder.build());
    }

    public N endCephfs() {
      return and();
    }
  }

  public class CinderNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CinderNestedImpl(io.kubernetes.client.openapi.models.V1CinderVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder(this, item);
    }

    CinderNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CinderVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withCinder(builder.build());
    }

    public N endCinder() {
      return and();
    }
  }

  public class ConfigMapNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ConfigMapNestedImpl(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder(this, item);
    }

    ConfigMapNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withConfigMap(builder.build());
    }

    public N endConfigMap() {
      return and();
    }
  }

  public class CsiNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CsiNestedImpl(io.kubernetes.client.openapi.models.V1CSIVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder(this, item);
    }

    CsiNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CSIVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withCsi(builder.build());
    }

    public N endCsi() {
      return and();
    }
  }

  public class DownwardAPINestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    DownwardAPINestedImpl(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceBuilder(this, item);
    }

    DownwardAPINestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withDownwardAPI(builder.build());
    }

    public N endDownwardAPI() {
      return and();
    }
  }

  public class EmptyDirNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    EmptyDirNestedImpl(io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceBuilder(this, item);
    }

    EmptyDirNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withEmptyDir(builder.build());
    }

    public N endEmptyDir() {
      return and();
    }
  }

  public class EphemeralNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    EphemeralNestedImpl(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder(this, item);
    }

    EphemeralNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withEphemeral(builder.build());
    }

    public N endEphemeral() {
      return and();
    }
  }

  public class FcNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1FCVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    FcNestedImpl(io.kubernetes.client.openapi.models.V1FCVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder(this, item);
    }

    FcNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withFc(builder.build());
    }

    public N endFc() {
      return and();
    }
  }

  public class FlexVolumeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    FlexVolumeNestedImpl(io.kubernetes.client.openapi.models.V1FlexVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder(this, item);
    }

    FlexVolumeNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1FlexVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withFlexVolume(builder.build());
    }

    public N endFlexVolume() {
      return and();
    }
  }

  public class FlockerNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    FlockerNestedImpl(io.kubernetes.client.openapi.models.V1FlockerVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder(this, item);
    }

    FlockerNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withFlocker(builder.build());
    }

    public N endFlocker() {
      return and();
    }
  }

  public class GcePersistentDiskNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    GcePersistentDiskNestedImpl(
        io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder(
              this, item);
    }

    GcePersistentDiskNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withGcePersistentDisk(builder.build());
    }

    public N endGcePersistentDisk() {
      return and();
    }
  }

  public class GitRepoNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    GitRepoNestedImpl(io.kubernetes.client.openapi.models.V1GitRepoVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder(this, item);
    }

    GitRepoNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withGitRepo(builder.build());
    }

    public N endGitRepo() {
      return and();
    }
  }

  public class GlusterfsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    GlusterfsNestedImpl(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder(this, item);
    }

    GlusterfsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withGlusterfs(builder.build());
    }

    public N endGlusterfs() {
      return and();
    }
  }

  public class HostPathNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    HostPathNestedImpl(io.kubernetes.client.openapi.models.V1HostPathVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder(this, item);
    }

    HostPathNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withHostPath(builder.build());
    }

    public N endHostPath() {
      return and();
    }
  }

  public class IscsiNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    IscsiNestedImpl(io.kubernetes.client.openapi.models.V1ISCSIVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceBuilder(this, item);
    }

    IscsiNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withIscsi(builder.build());
    }

    public N endIscsi() {
      return and();
    }
  }

  public class NfsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    NfsNestedImpl(io.kubernetes.client.openapi.models.V1NFSVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder(this, item);
    }

    NfsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withNfs(builder.build());
    }

    public N endNfs() {
      return and();
    }
  }

  public class PersistentVolumeClaimNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PersistentVolumeClaimNestedImpl(
        io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder(
              this, item);
    }

    PersistentVolumeClaimNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withPersistentVolumeClaim(builder.build());
    }

    public N endPersistentVolumeClaim() {
      return and();
    }
  }

  public class PhotonPersistentDiskNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PhotonPersistentDiskNestedImpl(
        io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder(
              this, item);
    }

    PhotonPersistentDiskNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withPhotonPersistentDisk(builder.build());
    }

    public N endPhotonPersistentDisk() {
      return and();
    }
  }

  public class PortworxVolumeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    PortworxVolumeNestedImpl(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder(this, item);
    }

    PortworxVolumeNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withPortworxVolume(builder.build());
    }

    public N endPortworxVolume() {
      return and();
    }
  }

  public class ProjectedNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ProjectedNestedImpl(io.kubernetes.client.openapi.models.V1ProjectedVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder(this, item);
    }

    ProjectedNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withProjected(builder.build());
    }

    public N endProjected() {
      return and();
    }
  }

  public class QuobyteNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    QuobyteNestedImpl(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder(this, item);
    }

    QuobyteNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withQuobyte(builder.build());
    }

    public N endQuobyte() {
      return and();
    }
  }

  public class RbdNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RbdNestedImpl(io.kubernetes.client.openapi.models.V1RBDVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder(this, item);
    }

    RbdNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1RBDVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withRbd(builder.build());
    }

    public N endRbd() {
      return and();
    }
  }

  public class ScaleIONestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleIONestedImpl(io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceBuilder(this, item);
    }

    ScaleIONestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withScaleIO(builder.build());
    }

    public N endScaleIO() {
      return and();
    }
  }

  public class SecretNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    SecretNestedImpl(io.kubernetes.client.openapi.models.V1SecretVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder(this, item);
    }

    SecretNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1SecretVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withSecret(builder.build());
    }

    public N endSecret() {
      return and();
    }
  }

  public class StorageosNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    StorageosNestedImpl(io.kubernetes.client.openapi.models.V1StorageOSVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder(this, item);
    }

    StorageosNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withStorageos(builder.build());
    }

    public N endStorageos() {
      return and();
    }
  }

  public class VsphereVolumeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<N>>
      implements io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    VsphereVolumeNestedImpl(
        io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder(
              this, item);
    }

    VsphereVolumeNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder builder;

    public N and() {
      return (N) V1VolumeFluentImpl.this.withVsphereVolume(builder.build());
    }

    public N endVsphereVolume() {
      return and();
    }
  }
}
