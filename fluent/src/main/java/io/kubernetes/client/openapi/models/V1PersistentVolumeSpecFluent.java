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
public interface V1PersistentVolumeSpecFluent<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public A addToAccessModes(java.lang.Integer index, java.lang.String item);

  public A setToAccessModes(java.lang.Integer index, java.lang.String item);

  public A addToAccessModes(java.lang.String... items);

  public A addAllToAccessModes(java.util.Collection<java.lang.String> items);

  public A removeFromAccessModes(java.lang.String... items);

  public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getAccessModes();

  public java.lang.String getAccessMode(java.lang.Integer index);

  public java.lang.String getFirstAccessMode();

  public java.lang.String getLastAccessMode();

  public java.lang.String getMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withAccessModes(java.util.List<java.lang.String> accessModes);

  public A withAccessModes(java.lang.String... accessModes);

  public java.lang.Boolean hasAccessModes();

  public A addNewAccessMode(java.lang.String original);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      withNewAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      withNewAwsElasticBlockStoreLike(
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      editAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      editOrNewAwsElasticBlockStore();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      withNewAzureDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      withNewAzureDiskLike(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      editAzureDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      editOrNewAzureDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      editOrNewAzureDiskLike(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item);

  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource getAzureFile();

  public io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource buildAzureFile();

  public A withAzureFile(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource azureFile);

  public java.lang.Boolean hasAzureFile();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      withNewAzureFile();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      withNewAzureFileLike(
          io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      editAzureFile();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      editOrNewAzureFile();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      editOrNewAzureFileLike(
          io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource item);

  public A addToCapacity(java.lang.String key, io.kubernetes.client.custom.Quantity value);

  public A addToCapacity(java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public A removeFromCapacity(java.lang.String key);

  public A removeFromCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map);

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getCapacity();

  public <K, V> A withCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity);

  public java.lang.Boolean hasCapacity();

  /**
   * This method has been deprecated, please use method buildCephfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource getCephfs();

  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource buildCephfs();

  public A withCephfs(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource cephfs);

  public java.lang.Boolean hasCephfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      withNewCephfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      withNewCephfsLike(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      editCephfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      editOrNewCephfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      editOrNewCephfsLike(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource item);

  /**
   * This method has been deprecated, please use method buildCinder instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource getCinder();

  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource buildCinder();

  public A withCinder(io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource cinder);

  public java.lang.Boolean hasCinder();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      withNewCinder();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      withNewCinderLike(io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      editCinder();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      editOrNewCinder();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      editOrNewCinderLike(io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource item);

  /**
   * This method has been deprecated, please use method buildClaimRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getClaimRef();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildClaimRef();

  public A withClaimRef(io.kubernetes.client.openapi.models.V1ObjectReference claimRef);

  public java.lang.Boolean hasClaimRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      withNewClaimRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      withNewClaimRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      editClaimRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      editOrNewClaimRef();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      editOrNewClaimRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  /**
   * This method has been deprecated, please use method buildCsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource getCsi();

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource buildCsi();

  public A withCsi(io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource csi);

  public java.lang.Boolean hasCsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A> withNewCsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A>
      withNewCsiLike(io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A> editCsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A>
      editOrNewCsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A>
      editOrNewCsiLike(io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource item);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A> withNewFc();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A> withNewFcLike(
      io.kubernetes.client.openapi.models.V1FCVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A> editFc();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A> editOrNewFc();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A>
      editOrNewFcLike(io.kubernetes.client.openapi.models.V1FCVolumeSource item);

  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource getFlexVolume();

  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource buildFlexVolume();

  public A withFlexVolume(
      io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource flexVolume);

  public java.lang.Boolean hasFlexVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      withNewFlexVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      withNewFlexVolumeLike(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      editFlexVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      editOrNewFlexVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      editOrNewFlexVolumeLike(
          io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource item);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      withNewFlocker();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      withNewFlockerLike(io.kubernetes.client.openapi.models.V1FlockerVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      editFlocker();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      editOrNewFlocker();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      editOrNewFlockerLike(io.kubernetes.client.openapi.models.V1FlockerVolumeSource item);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      editGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item);

  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource getGlusterfs();

  public io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource buildGlusterfs();

  public A withGlusterfs(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource glusterfs);

  public java.lang.Boolean hasGlusterfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      withNewGlusterfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      withNewGlusterfsLike(
          io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      editGlusterfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      editOrNewGlusterfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      editOrNewGlusterfsLike(
          io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource item);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      withNewHostPath();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      withNewHostPathLike(io.kubernetes.client.openapi.models.V1HostPathVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      editHostPath();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      editOrNewHostPath();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      editOrNewHostPathLike(io.kubernetes.client.openapi.models.V1HostPathVolumeSource item);

  /**
   * This method has been deprecated, please use method buildIscsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource getIscsi();

  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource buildIscsi();

  public A withIscsi(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource iscsi);

  public java.lang.Boolean hasIscsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      withNewIscsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      withNewIscsiLike(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      editIscsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      editOrNewIscsi();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      editOrNewIscsiLike(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource item);

  /**
   * This method has been deprecated, please use method buildLocal instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalVolumeSource getLocal();

  public io.kubernetes.client.openapi.models.V1LocalVolumeSource buildLocal();

  public A withLocal(io.kubernetes.client.openapi.models.V1LocalVolumeSource local);

  public java.lang.Boolean hasLocal();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      withNewLocal();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      withNewLocalLike(io.kubernetes.client.openapi.models.V1LocalVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      editLocal();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      editOrNewLocal();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      editOrNewLocalLike(io.kubernetes.client.openapi.models.V1LocalVolumeSource item);

  public A addToMountOptions(java.lang.Integer index, java.lang.String item);

  public A setToMountOptions(java.lang.Integer index, java.lang.String item);

  public A addToMountOptions(java.lang.String... items);

  public A addAllToMountOptions(java.util.Collection<java.lang.String> items);

  public A removeFromMountOptions(java.lang.String... items);

  public A removeAllFromMountOptions(java.util.Collection<java.lang.String> items);

  public java.util.List<java.lang.String> getMountOptions();

  public java.lang.String getMountOption(java.lang.Integer index);

  public java.lang.String getFirstMountOption();

  public java.lang.String getLastMountOption();

  public java.lang.String getMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate);

  public java.lang.Boolean hasMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate);

  public A withMountOptions(java.util.List<java.lang.String> mountOptions);

  public A withMountOptions(java.lang.String... mountOptions);

  public java.lang.Boolean hasMountOptions();

  public A addNewMountOption(java.lang.String original);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A> withNewNfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A>
      withNewNfsLike(io.kubernetes.client.openapi.models.V1NFSVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A> editNfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A>
      editOrNewNfs();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A>
      editOrNewNfsLike(io.kubernetes.client.openapi.models.V1NFSVolumeSource item);

  /**
   * This method has been deprecated, please use method buildNodeAffinity instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinity getNodeAffinity();

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinity buildNodeAffinity();

  public A withNodeAffinity(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity nodeAffinity);

  public java.lang.Boolean hasNodeAffinity();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      withNewNodeAffinity();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      withNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      editNodeAffinity();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      editOrNewNodeAffinity();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      editOrNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec
          .PersistentVolumeReclaimPolicyEnum
      getPersistentVolumeReclaimPolicy();

  public A withPersistentVolumeReclaimPolicy(
      io.kubernetes.client.openapi.models.V1PersistentVolumeSpec.PersistentVolumeReclaimPolicyEnum
          persistentVolumeReclaimPolicy);

  public java.lang.Boolean hasPersistentVolumeReclaimPolicy();

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      withNewPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      withNewPhotonPersistentDiskLike(
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      editPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      editOrNewPhotonPersistentDisk();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      withNewPortworxVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      withNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      editPortworxVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      withNewQuobyte();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      withNewQuobyteLike(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      editQuobyte();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      editOrNewQuobyte();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      editOrNewQuobyteLike(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item);

  /**
   * This method has been deprecated, please use method buildRbd instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource getRbd();

  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource buildRbd();

  public A withRbd(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource rbd);

  public java.lang.Boolean hasRbd();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A> withNewRbd();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A>
      withNewRbdLike(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A> editRbd();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A>
      editOrNewRbd();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A>
      editOrNewRbdLike(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource item);

  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource getScaleIO();

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource buildScaleIO();

  public A withScaleIO(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource scaleIO);

  public java.lang.Boolean hasScaleIO();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      withNewScaleIO();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      withNewScaleIOLike(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      editScaleIO();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      editOrNewScaleIO();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      editOrNewScaleIOLike(
          io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource item);

  public java.lang.String getStorageClassName();

  public A withStorageClassName(java.lang.String storageClassName);

  public java.lang.Boolean hasStorageClassName();

  /** Method is deprecated. use withStorageClassName instead. */
  @java.lang.Deprecated
  public A withNewStorageClassName(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildStorageos instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource getStorageos();

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource buildStorageos();

  public A withStorageos(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource storageos);

  public java.lang.Boolean hasStorageos();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      withNewStorageos();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      withNewStorageosLike(
          io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      editStorageos();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      editOrNewStorageos();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      editOrNewStorageosLike(
          io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource item);

  public java.lang.String getVolumeMode();

  public A withVolumeMode(java.lang.String volumeMode);

  public java.lang.Boolean hasVolumeMode();

  /** Method is deprecated. use withVolumeMode instead. */
  @java.lang.Deprecated
  public A withNewVolumeMode(java.lang.String original);

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      withNewVsphereVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      withNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item);

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      editVsphereVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolume();

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item);

  public interface AwsElasticBlockStoreNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                      .AwsElasticBlockStoreNested<
                  N>> {
    public N and();

    public N endAwsElasticBlockStore();
  }

  public interface AzureDiskNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<N>> {
    public N and();

    public N endAzureDisk();
  }

  public interface AzureFileNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<N>> {
    public N and();

    public N endAzureFile();
  }

  public interface CephfsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<N>> {
    public N and();

    public N endCephfs();
  }

  public interface CinderNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<N>> {
    public N and();

    public N endCinder();
  }

  public interface ClaimRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectReferenceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<N>> {
    public N and();

    public N endClaimRef();
  }

  public interface CsiNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<N>> {
    public N and();

    public N endCsi();
  }

  public interface FcNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1FCVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<N>> {
    public N and();

    public N endFc();
  }

  public interface FlexVolumeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<
                  N>> {
    public N and();

    public N endFlexVolume();
  }

  public interface FlockerNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<N>> {
    public N and();

    public N endFlocker();
  }

  public interface GcePersistentDiskNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                      .GcePersistentDiskNested<
                  N>> {
    public N and();

    public N endGcePersistentDisk();
  }

  public interface GlusterfsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<N>> {
    public N and();

    public N endGlusterfs();
  }

  public interface HostPathNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<N>> {
    public N and();

    public N endHostPath();
  }

  public interface IscsiNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<N>> {
    public N and();

    public N endIscsi();
  }

  public interface LocalNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<N>> {
    public N and();

    public N endLocal();
  }

  public interface NfsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<N>> {
    public N and();

    public N endNfs();
  }

  public interface NodeAffinityNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<
                  N>> {
    public N and();

    public N endNodeAffinity();
  }

  public interface PhotonPersistentDiskNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                      .PhotonPersistentDiskNested<
                  N>> {
    public N and();

    public N endPhotonPersistentDisk();
  }

  public interface PortworxVolumeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<
                  N>> {
    public N and();

    public N endPortworxVolume();
  }

  public interface QuobyteNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<N>> {
    public N and();

    public N endQuobyte();
  }

  public interface RbdNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<N>> {
    public N and();

    public N endRbd();
  }

  public interface ScaleIONested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<N>> {
    public N and();

    public N endScaleIO();
  }

  public interface StorageosNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<N>> {
    public N and();

    public N endStorageos();
  }

  public interface VsphereVolumeNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluent<
              io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<
                  N>> {
    public N and();

    public N endVsphereVolume();
  }
}
