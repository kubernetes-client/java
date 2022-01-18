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
public interface V1VolumeFluent<A extends io.kubernetes.client.openapi.models.V1VolumeFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {

  /**
   * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource
      getAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource
      buildAwsElasticBlockStore();

  public A withAwsElasticBlockStore(
      io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore);

  public java.lang.Boolean hasAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      withNewAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      withNewAwsElasticBlockStoreLike(
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      editAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      editOrNewAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<A>
      editOrNewAwsElasticBlockStoreLike(
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource item);

  /**
   * This method has been deprecated, please use method buildAzureDisk instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource getAzureDisk();

  public io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource buildAzureDisk();

  public A withAzureDisk(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource azureDisk);

  public java.lang.Boolean hasAzureDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A> withNewAzureDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A> withNewAzureDiskLike(
      io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A> editAzureDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A> editOrNewAzureDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<A>
      editOrNewAzureDiskLike(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item);

  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AzureFileVolumeSource getAzureFile();

  public io.kubernetes.client.openapi.models.V1AzureFileVolumeSource buildAzureFile();

  public A withAzureFile(io.kubernetes.client.openapi.models.V1AzureFileVolumeSource azureFile);

  public java.lang.Boolean hasAzureFile();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A> withNewAzureFile();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A> withNewAzureFileLike(
      io.kubernetes.client.openapi.models.V1AzureFileVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A> editAzureFile();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A> editOrNewAzureFile();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<A>
      editOrNewAzureFileLike(io.kubernetes.client.openapi.models.V1AzureFileVolumeSource item);

  /**
   * This method has been deprecated, please use method buildCephfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CephFSVolumeSource getCephfs();

  public io.kubernetes.client.openapi.models.V1CephFSVolumeSource buildCephfs();

  public A withCephfs(io.kubernetes.client.openapi.models.V1CephFSVolumeSource cephfs);

  public java.lang.Boolean hasCephfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> withNewCephfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> withNewCephfsLike(
      io.kubernetes.client.openapi.models.V1CephFSVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> editCephfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> editOrNewCephfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<A> editOrNewCephfsLike(
      io.kubernetes.client.openapi.models.V1CephFSVolumeSource item);

  /**
   * This method has been deprecated, please use method buildCinder instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CinderVolumeSource getCinder();

  public io.kubernetes.client.openapi.models.V1CinderVolumeSource buildCinder();

  public A withCinder(io.kubernetes.client.openapi.models.V1CinderVolumeSource cinder);

  public java.lang.Boolean hasCinder();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> withNewCinder();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> withNewCinderLike(
      io.kubernetes.client.openapi.models.V1CinderVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> editCinder();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> editOrNewCinder();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<A> editOrNewCinderLike(
      io.kubernetes.client.openapi.models.V1CinderVolumeSource item);

  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource getConfigMap();

  public io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource buildConfigMap();

  public A withConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource configMap);

  public java.lang.Boolean hasConfigMap();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A> withNewConfigMap();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A> withNewConfigMapLike(
      io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A> editConfigMap();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A> editOrNewConfigMap();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<A>
      editOrNewConfigMapLike(io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource item);

  /**
   * This method has been deprecated, please use method buildCsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CSIVolumeSource getCsi();

  public io.kubernetes.client.openapi.models.V1CSIVolumeSource buildCsi();

  public A withCsi(io.kubernetes.client.openapi.models.V1CSIVolumeSource csi);

  public java.lang.Boolean hasCsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> withNewCsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> withNewCsiLike(
      io.kubernetes.client.openapi.models.V1CSIVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> editCsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> editOrNewCsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<A> editOrNewCsiLike(
      io.kubernetes.client.openapi.models.V1CSIVolumeSource item);

  /**
   * This method has been deprecated, please use method buildDownwardAPI instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource getDownwardAPI();

  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource buildDownwardAPI();

  public A withDownwardAPI(
      io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource downwardAPI);

  public java.lang.Boolean hasDownwardAPI();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      withNewDownwardAPI();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      withNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A> editDownwardAPI();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      editOrNewDownwardAPI();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<A>
      editOrNewDownwardAPILike(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource item);

  /**
   * This method has been deprecated, please use method buildEmptyDir instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource getEmptyDir();

  public io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource buildEmptyDir();

  public A withEmptyDir(io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource emptyDir);

  public java.lang.Boolean hasEmptyDir();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> withNewEmptyDir();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> withNewEmptyDirLike(
      io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> editEmptyDir();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDir();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDirLike(
      io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource item);

  /**
   * This method has been deprecated, please use method buildEphemeral instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSource getEphemeral();

  public io.kubernetes.client.openapi.models.V1EphemeralVolumeSource buildEphemeral();

  public A withEphemeral(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource ephemeral);

  public java.lang.Boolean hasEphemeral();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A> withNewEphemeral();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A> withNewEphemeralLike(
      io.kubernetes.client.openapi.models.V1EphemeralVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A> editEphemeral();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A> editOrNewEphemeral();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<A>
      editOrNewEphemeralLike(io.kubernetes.client.openapi.models.V1EphemeralVolumeSource item);

  /**
   * This method has been deprecated, please use method buildFc instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FCVolumeSource getFc();

  public io.kubernetes.client.openapi.models.V1FCVolumeSource buildFc();

  public A withFc(io.kubernetes.client.openapi.models.V1FCVolumeSource fc);

  public java.lang.Boolean hasFc();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> withNewFc();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> withNewFcLike(
      io.kubernetes.client.openapi.models.V1FCVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> editFc();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> editOrNewFc();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<A> editOrNewFcLike(
      io.kubernetes.client.openapi.models.V1FCVolumeSource item);

  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FlexVolumeSource getFlexVolume();

  public io.kubernetes.client.openapi.models.V1FlexVolumeSource buildFlexVolume();

  public A withFlexVolume(io.kubernetes.client.openapi.models.V1FlexVolumeSource flexVolume);

  public java.lang.Boolean hasFlexVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A> withNewFlexVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A>
      withNewFlexVolumeLike(io.kubernetes.client.openapi.models.V1FlexVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A> editFlexVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A>
      editOrNewFlexVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<A>
      editOrNewFlexVolumeLike(io.kubernetes.client.openapi.models.V1FlexVolumeSource item);

  /**
   * This method has been deprecated, please use method buildFlocker instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FlockerVolumeSource getFlocker();

  public io.kubernetes.client.openapi.models.V1FlockerVolumeSource buildFlocker();

  public A withFlocker(io.kubernetes.client.openapi.models.V1FlockerVolumeSource flocker);

  public java.lang.Boolean hasFlocker();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> withNewFlocker();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> withNewFlockerLike(
      io.kubernetes.client.openapi.models.V1FlockerVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> editFlocker();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> editOrNewFlocker();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<A> editOrNewFlockerLike(
      io.kubernetes.client.openapi.models.V1FlockerVolumeSource item);

  /**
   * This method has been deprecated, please use method buildGcePersistentDisk instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource getGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource
      buildGcePersistentDisk();

  public A withGcePersistentDisk(
      io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource gcePersistentDisk);

  public java.lang.Boolean hasGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      editGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item);

  /**
   * This method has been deprecated, please use method buildGitRepo instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GitRepoVolumeSource getGitRepo();

  public io.kubernetes.client.openapi.models.V1GitRepoVolumeSource buildGitRepo();

  public A withGitRepo(io.kubernetes.client.openapi.models.V1GitRepoVolumeSource gitRepo);

  public java.lang.Boolean hasGitRepo();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> withNewGitRepo();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> withNewGitRepoLike(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> editGitRepo();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> editOrNewGitRepo();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<A> editOrNewGitRepoLike(
      io.kubernetes.client.openapi.models.V1GitRepoVolumeSource item);

  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource getGlusterfs();

  public io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource buildGlusterfs();

  public A withGlusterfs(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource glusterfs);

  public java.lang.Boolean hasGlusterfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A> withNewGlusterfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A> withNewGlusterfsLike(
      io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A> editGlusterfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A> editOrNewGlusterfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<A>
      editOrNewGlusterfsLike(io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource item);

  /**
   * This method has been deprecated, please use method buildHostPath instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1HostPathVolumeSource getHostPath();

  public io.kubernetes.client.openapi.models.V1HostPathVolumeSource buildHostPath();

  public A withHostPath(io.kubernetes.client.openapi.models.V1HostPathVolumeSource hostPath);

  public java.lang.Boolean hasHostPath();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> withNewHostPath();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> withNewHostPathLike(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> editHostPath();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> editOrNewHostPath();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<A> editOrNewHostPathLike(
      io.kubernetes.client.openapi.models.V1HostPathVolumeSource item);

  /**
   * This method has been deprecated, please use method buildIscsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSource getIscsi();

  public io.kubernetes.client.openapi.models.V1ISCSIVolumeSource buildIscsi();

  public A withIscsi(io.kubernetes.client.openapi.models.V1ISCSIVolumeSource iscsi);

  public java.lang.Boolean hasIscsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> withNewIscsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> withNewIscsiLike(
      io.kubernetes.client.openapi.models.V1ISCSIVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> editIscsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> editOrNewIscsi();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<A> editOrNewIscsiLike(
      io.kubernetes.client.openapi.models.V1ISCSIVolumeSource item);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildNfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1NFSVolumeSource getNfs();

  public io.kubernetes.client.openapi.models.V1NFSVolumeSource buildNfs();

  public A withNfs(io.kubernetes.client.openapi.models.V1NFSVolumeSource nfs);

  public java.lang.Boolean hasNfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> withNewNfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> withNewNfsLike(
      io.kubernetes.client.openapi.models.V1NFSVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> editNfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> editOrNewNfs();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<A> editOrNewNfsLike(
      io.kubernetes.client.openapi.models.V1NFSVolumeSource item);

  /**
   * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource
      getPersistentVolumeClaim();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource
      buildPersistentVolumeClaim();

  public A withPersistentVolumeClaim(
      io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource
          persistentVolumeClaim);

  public java.lang.Boolean hasPersistentVolumeClaim();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      withNewPersistentVolumeClaim();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      withNewPersistentVolumeClaimLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      editPersistentVolumeClaim();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      editOrNewPersistentVolumeClaim();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<A>
      editOrNewPersistentVolumeClaimLike(
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource item);

  /**
   * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource
      getPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource
      buildPhotonPersistentDisk();

  public A withPhotonPersistentDisk(
      io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource photonPersistentDisk);

  public java.lang.Boolean hasPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      withNewPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      withNewPhotonPersistentDiskLike(
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      editPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      editOrNewPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<A>
      editOrNewPhotonPersistentDiskLike(
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource item);

  /**
   * This method has been deprecated, please use method buildPortworxVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1PortworxVolumeSource getPortworxVolume();

  public io.kubernetes.client.openapi.models.V1PortworxVolumeSource buildPortworxVolume();

  public A withPortworxVolume(
      io.kubernetes.client.openapi.models.V1PortworxVolumeSource portworxVolume);

  public java.lang.Boolean hasPortworxVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      withNewPortworxVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      withNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      editPortworxVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item);

  /**
   * This method has been deprecated, please use method buildProjected instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSource getProjected();

  public io.kubernetes.client.openapi.models.V1ProjectedVolumeSource buildProjected();

  public A withProjected(io.kubernetes.client.openapi.models.V1ProjectedVolumeSource projected);

  public java.lang.Boolean hasProjected();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A> withNewProjected();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A> withNewProjectedLike(
      io.kubernetes.client.openapi.models.V1ProjectedVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A> editProjected();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A> editOrNewProjected();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<A>
      editOrNewProjectedLike(io.kubernetes.client.openapi.models.V1ProjectedVolumeSource item);

  /**
   * This method has been deprecated, please use method buildQuobyte instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1QuobyteVolumeSource getQuobyte();

  public io.kubernetes.client.openapi.models.V1QuobyteVolumeSource buildQuobyte();

  public A withQuobyte(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource quobyte);

  public java.lang.Boolean hasQuobyte();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> withNewQuobyte();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> withNewQuobyteLike(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> editQuobyte();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> editOrNewQuobyte();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<A> editOrNewQuobyteLike(
      io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item);

  /**
   * This method has been deprecated, please use method buildRbd instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RBDVolumeSource getRbd();

  public io.kubernetes.client.openapi.models.V1RBDVolumeSource buildRbd();

  public A withRbd(io.kubernetes.client.openapi.models.V1RBDVolumeSource rbd);

  public java.lang.Boolean hasRbd();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> withNewRbd();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> withNewRbdLike(
      io.kubernetes.client.openapi.models.V1RBDVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> editRbd();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> editOrNewRbd();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<A> editOrNewRbdLike(
      io.kubernetes.client.openapi.models.V1RBDVolumeSource item);

  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource getScaleIO();

  public io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource buildScaleIO();

  public A withScaleIO(io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource scaleIO);

  public java.lang.Boolean hasScaleIO();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> withNewScaleIO();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> withNewScaleIOLike(
      io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> editScaleIO();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> editOrNewScaleIO();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<A> editOrNewScaleIOLike(
      io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource item);

  /**
   * This method has been deprecated, please use method buildSecret instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1SecretVolumeSource getSecret();

  public io.kubernetes.client.openapi.models.V1SecretVolumeSource buildSecret();

  public A withSecret(io.kubernetes.client.openapi.models.V1SecretVolumeSource secret);

  public java.lang.Boolean hasSecret();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> withNewSecret();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> withNewSecretLike(
      io.kubernetes.client.openapi.models.V1SecretVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> editSecret();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> editOrNewSecret();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<A> editOrNewSecretLike(
      io.kubernetes.client.openapi.models.V1SecretVolumeSource item);

  /**
   * This method has been deprecated, please use method buildStorageos instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSource getStorageos();

  public io.kubernetes.client.openapi.models.V1StorageOSVolumeSource buildStorageos();

  public A withStorageos(io.kubernetes.client.openapi.models.V1StorageOSVolumeSource storageos);

  public java.lang.Boolean hasStorageos();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A> withNewStorageos();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A> withNewStorageosLike(
      io.kubernetes.client.openapi.models.V1StorageOSVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A> editStorageos();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A> editOrNewStorageos();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<A>
      editOrNewStorageosLike(io.kubernetes.client.openapi.models.V1StorageOSVolumeSource item);

  /**
   * This method has been deprecated, please use method buildVsphereVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource getVsphereVolume();

  public io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource buildVsphereVolume();

  public A withVsphereVolume(
      io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource vsphereVolume);

  public java.lang.Boolean hasVsphereVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      withNewVsphereVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      withNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      editVsphereVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolume();

  public io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item);

  public interface AwsElasticBlockStoreNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.AwsElasticBlockStoreNested<N>> {
    public N and();

    public N endAwsElasticBlockStore();
  }

  public interface AzureDiskNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.AzureDiskNested<N>> {
    public N and();

    public N endAzureDisk();
  }

  public interface AzureFileNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1AzureFileVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.AzureFileNested<N>> {
    public N and();

    public N endAzureFile();
  }

  public interface CephfsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CephFSVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.CephfsNested<N>> {
    public N and();

    public N endCephfs();
  }

  public interface CinderNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CinderVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.CinderNested<N>> {
    public N and();

    public N endCinder();
  }

  public interface ConfigMapNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ConfigMapVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.ConfigMapNested<N>> {
    public N and();

    public N endConfigMap();
  }

  public interface CsiNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CSIVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.CsiNested<N>> {
    public N and();

    public N endCsi();
  }

  public interface DownwardAPINested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.DownwardAPINested<N>> {
    public N and();

    public N endDownwardAPI();
  }

  public interface EmptyDirNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EmptyDirVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.EmptyDirNested<N>> {
    public N and();

    public N endEmptyDir();
  }

  public interface EphemeralNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1EphemeralVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.EphemeralNested<N>> {
    public N and();

    public N endEphemeral();
  }

  public interface FcNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.FcNested<N>> {
    public N and();

    public N endFc();
  }

  public interface FlexVolumeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1FlexVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.FlexVolumeNested<N>> {
    public N and();

    public N endFlexVolume();
  }

  public interface FlockerNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.FlockerNested<N>> {
    public N and();

    public N endFlocker();
  }

  public interface GcePersistentDiskNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.GcePersistentDiskNested<N>> {
    public N and();

    public N endGcePersistentDisk();
  }

  public interface GitRepoNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1GitRepoVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.GitRepoNested<N>> {
    public N and();

    public N endGitRepo();
  }

  public interface GlusterfsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1GlusterfsVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.GlusterfsNested<N>> {
    public N and();

    public N endGlusterfs();
  }

  public interface HostPathNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.HostPathNested<N>> {
    public N and();

    public N endHostPath();
  }

  public interface IscsiNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ISCSIVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.IscsiNested<N>> {
    public N and();

    public N endIscsi();
  }

  public interface NfsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.NfsNested<N>> {
    public N and();

    public N endNfs();
  }

  public interface PersistentVolumeClaimNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.PersistentVolumeClaimNested<N>> {
    public N and();

    public N endPersistentVolumeClaim();
  }

  public interface PhotonPersistentDiskNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.PhotonPersistentDiskNested<N>> {
    public N and();

    public N endPhotonPersistentDisk();
  }

  public interface PortworxVolumeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.PortworxVolumeNested<N>> {
    public N and();

    public N endPortworxVolume();
  }

  public interface ProjectedNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ProjectedVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.ProjectedNested<N>> {
    public N and();

    public N endProjected();
  }

  public interface QuobyteNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.QuobyteNested<N>> {
    public N and();

    public N endQuobyte();
  }

  public interface RbdNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1RBDVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.RbdNested<N>> {
    public N and();

    public N endRbd();
  }

  public interface ScaleIONested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ScaleIOVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.ScaleIONested<N>> {
    public N and();

    public N endScaleIO();
  }

  public interface SecretNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1SecretVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.SecretNested<N>> {
    public N and();

    public N endSecret();
  }

  public interface StorageosNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1StorageOSVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.StorageosNested<N>> {
    public N and();

    public N endStorageos();
  }

  public interface VsphereVolumeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1VolumeFluent.VsphereVolumeNested<N>> {
    public N and();

    public N endVsphereVolume();
  }
}
