package io.kubernetes.client.openapi.models;

import java.lang.String;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;

 /**
  * Generated
  */
public interface V1VolumeFluent<A extends V1VolumeFluent<A>> extends Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore();
  public V1AWSElasticBlockStoreVolumeSource buildAwsElasticBlockStore();
  public A withAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore);
  public Boolean hasAwsElasticBlockStore();
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore();
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item);
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore();
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore();
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildAzureDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AzureDiskVolumeSource getAzureDisk();
  public V1AzureDiskVolumeSource buildAzureDisk();
  public A withAzureDisk(V1AzureDiskVolumeSource azureDisk);
  public Boolean hasAzureDisk();
  public V1VolumeFluent.AzureDiskNested<A> withNewAzureDisk();
  public V1VolumeFluent.AzureDiskNested<A> withNewAzureDiskLike(V1AzureDiskVolumeSource item);
  public V1VolumeFluent.AzureDiskNested<A> editAzureDisk();
  public V1VolumeFluent.AzureDiskNested<A> editOrNewAzureDisk();
  public V1VolumeFluent.AzureDiskNested<A> editOrNewAzureDiskLike(V1AzureDiskVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AzureFileVolumeSource getAzureFile();
  public V1AzureFileVolumeSource buildAzureFile();
  public A withAzureFile(V1AzureFileVolumeSource azureFile);
  public Boolean hasAzureFile();
  public V1VolumeFluent.AzureFileNested<A> withNewAzureFile();
  public V1VolumeFluent.AzureFileNested<A> withNewAzureFileLike(V1AzureFileVolumeSource item);
  public V1VolumeFluent.AzureFileNested<A> editAzureFile();
  public V1VolumeFluent.AzureFileNested<A> editOrNewAzureFile();
  public V1VolumeFluent.AzureFileNested<A> editOrNewAzureFileLike(V1AzureFileVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildCephfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CephFSVolumeSource getCephfs();
  public V1CephFSVolumeSource buildCephfs();
  public A withCephfs(V1CephFSVolumeSource cephfs);
  public Boolean hasCephfs();
  public V1VolumeFluent.CephfsNested<A> withNewCephfs();
  public V1VolumeFluent.CephfsNested<A> withNewCephfsLike(V1CephFSVolumeSource item);
  public V1VolumeFluent.CephfsNested<A> editCephfs();
  public V1VolumeFluent.CephfsNested<A> editOrNewCephfs();
  public V1VolumeFluent.CephfsNested<A> editOrNewCephfsLike(V1CephFSVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildCinder instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CinderVolumeSource getCinder();
  public V1CinderVolumeSource buildCinder();
  public A withCinder(V1CinderVolumeSource cinder);
  public Boolean hasCinder();
  public V1VolumeFluent.CinderNested<A> withNewCinder();
  public V1VolumeFluent.CinderNested<A> withNewCinderLike(V1CinderVolumeSource item);
  public V1VolumeFluent.CinderNested<A> editCinder();
  public V1VolumeFluent.CinderNested<A> editOrNewCinder();
  public V1VolumeFluent.CinderNested<A> editOrNewCinderLike(V1CinderVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapVolumeSource getConfigMap();
  public V1ConfigMapVolumeSource buildConfigMap();
  public A withConfigMap(V1ConfigMapVolumeSource configMap);
  public Boolean hasConfigMap();
  public V1VolumeFluent.ConfigMapNested<A> withNewConfigMap();
  public V1VolumeFluent.ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapVolumeSource item);
  public V1VolumeFluent.ConfigMapNested<A> editConfigMap();
  public V1VolumeFluent.ConfigMapNested<A> editOrNewConfigMap();
  public V1VolumeFluent.ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildCsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CSIVolumeSource getCsi();
  public V1CSIVolumeSource buildCsi();
  public A withCsi(V1CSIVolumeSource csi);
  public Boolean hasCsi();
  public V1VolumeFluent.CsiNested<A> withNewCsi();
  public V1VolumeFluent.CsiNested<A> withNewCsiLike(V1CSIVolumeSource item);
  public V1VolumeFluent.CsiNested<A> editCsi();
  public V1VolumeFluent.CsiNested<A> editOrNewCsi();
  public V1VolumeFluent.CsiNested<A> editOrNewCsiLike(V1CSIVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildDownwardAPI instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DownwardAPIVolumeSource getDownwardAPI();
  public V1DownwardAPIVolumeSource buildDownwardAPI();
  public A withDownwardAPI(V1DownwardAPIVolumeSource downwardAPI);
  public Boolean hasDownwardAPI();
  public V1VolumeFluent.DownwardAPINested<A> withNewDownwardAPI();
  public V1VolumeFluent.DownwardAPINested<A> withNewDownwardAPILike(V1DownwardAPIVolumeSource item);
  public V1VolumeFluent.DownwardAPINested<A> editDownwardAPI();
  public V1VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPI();
  public V1VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPILike(V1DownwardAPIVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildEmptyDir instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EmptyDirVolumeSource getEmptyDir();
  public V1EmptyDirVolumeSource buildEmptyDir();
  public A withEmptyDir(V1EmptyDirVolumeSource emptyDir);
  public Boolean hasEmptyDir();
  public V1VolumeFluent.EmptyDirNested<A> withNewEmptyDir();
  public V1VolumeFluent.EmptyDirNested<A> withNewEmptyDirLike(V1EmptyDirVolumeSource item);
  public V1VolumeFluent.EmptyDirNested<A> editEmptyDir();
  public V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDir();
  public V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDirLike(V1EmptyDirVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildEphemeral instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EphemeralVolumeSource getEphemeral();
  public V1EphemeralVolumeSource buildEphemeral();
  public A withEphemeral(V1EphemeralVolumeSource ephemeral);
  public Boolean hasEphemeral();
  public V1VolumeFluent.EphemeralNested<A> withNewEphemeral();
  public V1VolumeFluent.EphemeralNested<A> withNewEphemeralLike(V1EphemeralVolumeSource item);
  public V1VolumeFluent.EphemeralNested<A> editEphemeral();
  public V1VolumeFluent.EphemeralNested<A> editOrNewEphemeral();
  public V1VolumeFluent.EphemeralNested<A> editOrNewEphemeralLike(V1EphemeralVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildFc instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FCVolumeSource getFc();
  public V1FCVolumeSource buildFc();
  public A withFc(V1FCVolumeSource fc);
  public Boolean hasFc();
  public V1VolumeFluent.FcNested<A> withNewFc();
  public V1VolumeFluent.FcNested<A> withNewFcLike(V1FCVolumeSource item);
  public V1VolumeFluent.FcNested<A> editFc();
  public V1VolumeFluent.FcNested<A> editOrNewFc();
  public V1VolumeFluent.FcNested<A> editOrNewFcLike(V1FCVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FlexVolumeSource getFlexVolume();
  public V1FlexVolumeSource buildFlexVolume();
  public A withFlexVolume(V1FlexVolumeSource flexVolume);
  public Boolean hasFlexVolume();
  public V1VolumeFluent.FlexVolumeNested<A> withNewFlexVolume();
  public V1VolumeFluent.FlexVolumeNested<A> withNewFlexVolumeLike(V1FlexVolumeSource item);
  public V1VolumeFluent.FlexVolumeNested<A> editFlexVolume();
  public V1VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolume();
  public V1VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(V1FlexVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildFlocker instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FlockerVolumeSource getFlocker();
  public V1FlockerVolumeSource buildFlocker();
  public A withFlocker(V1FlockerVolumeSource flocker);
  public Boolean hasFlocker();
  public V1VolumeFluent.FlockerNested<A> withNewFlocker();
  public V1VolumeFluent.FlockerNested<A> withNewFlockerLike(V1FlockerVolumeSource item);
  public V1VolumeFluent.FlockerNested<A> editFlocker();
  public V1VolumeFluent.FlockerNested<A> editOrNewFlocker();
  public V1VolumeFluent.FlockerNested<A> editOrNewFlockerLike(V1FlockerVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildGcePersistentDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GCEPersistentDiskVolumeSource getGcePersistentDisk();
  public V1GCEPersistentDiskVolumeSource buildGcePersistentDisk();
  public A withGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk);
  public Boolean hasGcePersistentDisk();
  public V1VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk();
  public V1VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item);
  public V1VolumeFluent.GcePersistentDiskNested<A> editGcePersistentDisk();
  public V1VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk();
  public V1VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildGitRepo instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GitRepoVolumeSource getGitRepo();
  public V1GitRepoVolumeSource buildGitRepo();
  public A withGitRepo(V1GitRepoVolumeSource gitRepo);
  public Boolean hasGitRepo();
  public V1VolumeFluent.GitRepoNested<A> withNewGitRepo();
  public V1VolumeFluent.GitRepoNested<A> withNewGitRepoLike(V1GitRepoVolumeSource item);
  public V1VolumeFluent.GitRepoNested<A> editGitRepo();
  public V1VolumeFluent.GitRepoNested<A> editOrNewGitRepo();
  public V1VolumeFluent.GitRepoNested<A> editOrNewGitRepoLike(V1GitRepoVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GlusterfsVolumeSource getGlusterfs();
  public V1GlusterfsVolumeSource buildGlusterfs();
  public A withGlusterfs(V1GlusterfsVolumeSource glusterfs);
  public Boolean hasGlusterfs();
  public V1VolumeFluent.GlusterfsNested<A> withNewGlusterfs();
  public V1VolumeFluent.GlusterfsNested<A> withNewGlusterfsLike(V1GlusterfsVolumeSource item);
  public V1VolumeFluent.GlusterfsNested<A> editGlusterfs();
  public V1VolumeFluent.GlusterfsNested<A> editOrNewGlusterfs();
  public V1VolumeFluent.GlusterfsNested<A> editOrNewGlusterfsLike(V1GlusterfsVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildHostPath instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HostPathVolumeSource getHostPath();
  public V1HostPathVolumeSource buildHostPath();
  public A withHostPath(V1HostPathVolumeSource hostPath);
  public Boolean hasHostPath();
  public V1VolumeFluent.HostPathNested<A> withNewHostPath();
  public V1VolumeFluent.HostPathNested<A> withNewHostPathLike(V1HostPathVolumeSource item);
  public V1VolumeFluent.HostPathNested<A> editHostPath();
  public V1VolumeFluent.HostPathNested<A> editOrNewHostPath();
  public V1VolumeFluent.HostPathNested<A> editOrNewHostPathLike(V1HostPathVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildIscsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ISCSIVolumeSource getIscsi();
  public V1ISCSIVolumeSource buildIscsi();
  public A withIscsi(V1ISCSIVolumeSource iscsi);
  public Boolean hasIscsi();
  public V1VolumeFluent.IscsiNested<A> withNewIscsi();
  public V1VolumeFluent.IscsiNested<A> withNewIscsiLike(V1ISCSIVolumeSource item);
  public V1VolumeFluent.IscsiNested<A> editIscsi();
  public V1VolumeFluent.IscsiNested<A> editOrNewIscsi();
  public V1VolumeFluent.IscsiNested<A> editOrNewIscsiLike(V1ISCSIVolumeSource item);
  public String getName();
  public A withName(String name);
  public Boolean hasName();
  
  /**
   * This method has been deprecated, please use method buildNfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NFSVolumeSource getNfs();
  public V1NFSVolumeSource buildNfs();
  public A withNfs(V1NFSVolumeSource nfs);
  public Boolean hasNfs();
  public V1VolumeFluent.NfsNested<A> withNewNfs();
  public V1VolumeFluent.NfsNested<A> withNewNfsLike(V1NFSVolumeSource item);
  public V1VolumeFluent.NfsNested<A> editNfs();
  public V1VolumeFluent.NfsNested<A> editOrNewNfs();
  public V1VolumeFluent.NfsNested<A> editOrNewNfsLike(V1NFSVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim();
  public V1PersistentVolumeClaimVolumeSource buildPersistentVolumeClaim();
  public A withPersistentVolumeClaim(V1PersistentVolumeClaimVolumeSource persistentVolumeClaim);
  public Boolean hasPersistentVolumeClaim();
  public V1VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim();
  public V1VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(V1PersistentVolumeClaimVolumeSource item);
  public V1VolumeFluent.PersistentVolumeClaimNested<A> editPersistentVolumeClaim();
  public V1VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim();
  public V1VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(V1PersistentVolumeClaimVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk();
  public V1PhotonPersistentDiskVolumeSource buildPhotonPersistentDisk();
  public A withPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk);
  public Boolean hasPhotonPersistentDisk();
  public V1VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk();
  public V1VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item);
  public V1VolumeFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk();
  public V1VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk();
  public V1VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildPortworxVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PortworxVolumeSource getPortworxVolume();
  public V1PortworxVolumeSource buildPortworxVolume();
  public A withPortworxVolume(V1PortworxVolumeSource portworxVolume);
  public Boolean hasPortworxVolume();
  public V1VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolume();
  public V1VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(V1PortworxVolumeSource item);
  public V1VolumeFluent.PortworxVolumeNested<A> editPortworxVolume();
  public V1VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolume();
  public V1VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(V1PortworxVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildProjected instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ProjectedVolumeSource getProjected();
  public V1ProjectedVolumeSource buildProjected();
  public A withProjected(V1ProjectedVolumeSource projected);
  public Boolean hasProjected();
  public V1VolumeFluent.ProjectedNested<A> withNewProjected();
  public V1VolumeFluent.ProjectedNested<A> withNewProjectedLike(V1ProjectedVolumeSource item);
  public V1VolumeFluent.ProjectedNested<A> editProjected();
  public V1VolumeFluent.ProjectedNested<A> editOrNewProjected();
  public V1VolumeFluent.ProjectedNested<A> editOrNewProjectedLike(V1ProjectedVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildQuobyte instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1QuobyteVolumeSource getQuobyte();
  public V1QuobyteVolumeSource buildQuobyte();
  public A withQuobyte(V1QuobyteVolumeSource quobyte);
  public Boolean hasQuobyte();
  public V1VolumeFluent.QuobyteNested<A> withNewQuobyte();
  public V1VolumeFluent.QuobyteNested<A> withNewQuobyteLike(V1QuobyteVolumeSource item);
  public V1VolumeFluent.QuobyteNested<A> editQuobyte();
  public V1VolumeFluent.QuobyteNested<A> editOrNewQuobyte();
  public V1VolumeFluent.QuobyteNested<A> editOrNewQuobyteLike(V1QuobyteVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildRbd instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RBDVolumeSource getRbd();
  public V1RBDVolumeSource buildRbd();
  public A withRbd(V1RBDVolumeSource rbd);
  public Boolean hasRbd();
  public V1VolumeFluent.RbdNested<A> withNewRbd();
  public V1VolumeFluent.RbdNested<A> withNewRbdLike(V1RBDVolumeSource item);
  public V1VolumeFluent.RbdNested<A> editRbd();
  public V1VolumeFluent.RbdNested<A> editOrNewRbd();
  public V1VolumeFluent.RbdNested<A> editOrNewRbdLike(V1RBDVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ScaleIOVolumeSource getScaleIO();
  public V1ScaleIOVolumeSource buildScaleIO();
  public A withScaleIO(V1ScaleIOVolumeSource scaleIO);
  public Boolean hasScaleIO();
  public V1VolumeFluent.ScaleIONested<A> withNewScaleIO();
  public V1VolumeFluent.ScaleIONested<A> withNewScaleIOLike(V1ScaleIOVolumeSource item);
  public V1VolumeFluent.ScaleIONested<A> editScaleIO();
  public V1VolumeFluent.ScaleIONested<A> editOrNewScaleIO();
  public V1VolumeFluent.ScaleIONested<A> editOrNewScaleIOLike(V1ScaleIOVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildSecret instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretVolumeSource getSecret();
  public V1SecretVolumeSource buildSecret();
  public A withSecret(V1SecretVolumeSource secret);
  public Boolean hasSecret();
  public V1VolumeFluent.SecretNested<A> withNewSecret();
  public V1VolumeFluent.SecretNested<A> withNewSecretLike(V1SecretVolumeSource item);
  public V1VolumeFluent.SecretNested<A> editSecret();
  public V1VolumeFluent.SecretNested<A> editOrNewSecret();
  public V1VolumeFluent.SecretNested<A> editOrNewSecretLike(V1SecretVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildStorageos instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StorageOSVolumeSource getStorageos();
  public V1StorageOSVolumeSource buildStorageos();
  public A withStorageos(V1StorageOSVolumeSource storageos);
  public Boolean hasStorageos();
  public V1VolumeFluent.StorageosNested<A> withNewStorageos();
  public V1VolumeFluent.StorageosNested<A> withNewStorageosLike(V1StorageOSVolumeSource item);
  public V1VolumeFluent.StorageosNested<A> editStorageos();
  public V1VolumeFluent.StorageosNested<A> editOrNewStorageos();
  public V1VolumeFluent.StorageosNested<A> editOrNewStorageosLike(V1StorageOSVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildVsphereVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VsphereVirtualDiskVolumeSource getVsphereVolume();
  public V1VsphereVirtualDiskVolumeSource buildVsphereVolume();
  public A withVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume);
  public Boolean hasVsphereVolume();
  public V1VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolume();
  public V1VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item);
  public V1VolumeFluent.VsphereVolumeNested<A> editVsphereVolume();
  public V1VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolume();
  public V1VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item);
  public interface AwsElasticBlockStoreNested<N> extends Nested<N>,V1AWSElasticBlockStoreVolumeSourceFluent<V1VolumeFluent.AwsElasticBlockStoreNested<N>>{
    public N and();
    public N endAwsElasticBlockStore();
    
  }
  public interface AzureDiskNested<N> extends Nested<N>,V1AzureDiskVolumeSourceFluent<V1VolumeFluent.AzureDiskNested<N>>{
    public N and();
    public N endAzureDisk();
    
  }
  public interface AzureFileNested<N> extends Nested<N>,V1AzureFileVolumeSourceFluent<V1VolumeFluent.AzureFileNested<N>>{
    public N and();
    public N endAzureFile();
    
  }
  public interface CephfsNested<N> extends Nested<N>,V1CephFSVolumeSourceFluent<V1VolumeFluent.CephfsNested<N>>{
    public N and();
    public N endCephfs();
    
  }
  public interface CinderNested<N> extends Nested<N>,V1CinderVolumeSourceFluent<V1VolumeFluent.CinderNested<N>>{
    public N and();
    public N endCinder();
    
  }
  public interface ConfigMapNested<N> extends Nested<N>,V1ConfigMapVolumeSourceFluent<V1VolumeFluent.ConfigMapNested<N>>{
    public N and();
    public N endConfigMap();
    
  }
  public interface CsiNested<N> extends Nested<N>,V1CSIVolumeSourceFluent<V1VolumeFluent.CsiNested<N>>{
    public N and();
    public N endCsi();
    
  }
  public interface DownwardAPINested<N> extends Nested<N>,V1DownwardAPIVolumeSourceFluent<V1VolumeFluent.DownwardAPINested<N>>{
    public N and();
    public N endDownwardAPI();
    
  }
  public interface EmptyDirNested<N> extends Nested<N>,V1EmptyDirVolumeSourceFluent<V1VolumeFluent.EmptyDirNested<N>>{
    public N and();
    public N endEmptyDir();
    
  }
  public interface EphemeralNested<N> extends Nested<N>,V1EphemeralVolumeSourceFluent<V1VolumeFluent.EphemeralNested<N>>{
    public N and();
    public N endEphemeral();
    
  }
  public interface FcNested<N> extends Nested<N>,V1FCVolumeSourceFluent<V1VolumeFluent.FcNested<N>>{
    public N and();
    public N endFc();
    
  }
  public interface FlexVolumeNested<N> extends Nested<N>,V1FlexVolumeSourceFluent<V1VolumeFluent.FlexVolumeNested<N>>{
    public N and();
    public N endFlexVolume();
    
  }
  public interface FlockerNested<N> extends Nested<N>,V1FlockerVolumeSourceFluent<V1VolumeFluent.FlockerNested<N>>{
    public N and();
    public N endFlocker();
    
  }
  public interface GcePersistentDiskNested<N> extends Nested<N>,V1GCEPersistentDiskVolumeSourceFluent<V1VolumeFluent.GcePersistentDiskNested<N>>{
    public N and();
    public N endGcePersistentDisk();
    
  }
  public interface GitRepoNested<N> extends Nested<N>,V1GitRepoVolumeSourceFluent<V1VolumeFluent.GitRepoNested<N>>{
    public N and();
    public N endGitRepo();
    
  }
  public interface GlusterfsNested<N> extends Nested<N>,V1GlusterfsVolumeSourceFluent<V1VolumeFluent.GlusterfsNested<N>>{
    public N and();
    public N endGlusterfs();
    
  }
  public interface HostPathNested<N> extends Nested<N>,V1HostPathVolumeSourceFluent<V1VolumeFluent.HostPathNested<N>>{
    public N and();
    public N endHostPath();
    
  }
  public interface IscsiNested<N> extends Nested<N>,V1ISCSIVolumeSourceFluent<V1VolumeFluent.IscsiNested<N>>{
    public N and();
    public N endIscsi();
    
  }
  public interface NfsNested<N> extends Nested<N>,V1NFSVolumeSourceFluent<V1VolumeFluent.NfsNested<N>>{
    public N and();
    public N endNfs();
    
  }
  public interface PersistentVolumeClaimNested<N> extends Nested<N>,V1PersistentVolumeClaimVolumeSourceFluent<V1VolumeFluent.PersistentVolumeClaimNested<N>>{
    public N and();
    public N endPersistentVolumeClaim();
    
  }
  public interface PhotonPersistentDiskNested<N> extends Nested<N>,V1PhotonPersistentDiskVolumeSourceFluent<V1VolumeFluent.PhotonPersistentDiskNested<N>>{
    public N and();
    public N endPhotonPersistentDisk();
    
  }
  public interface PortworxVolumeNested<N> extends Nested<N>,V1PortworxVolumeSourceFluent<V1VolumeFluent.PortworxVolumeNested<N>>{
    public N and();
    public N endPortworxVolume();
    
  }
  public interface ProjectedNested<N> extends Nested<N>,V1ProjectedVolumeSourceFluent<V1VolumeFluent.ProjectedNested<N>>{
    public N and();
    public N endProjected();
    
  }
  public interface QuobyteNested<N> extends Nested<N>,V1QuobyteVolumeSourceFluent<V1VolumeFluent.QuobyteNested<N>>{
    public N and();
    public N endQuobyte();
    
  }
  public interface RbdNested<N> extends Nested<N>,V1RBDVolumeSourceFluent<V1VolumeFluent.RbdNested<N>>{
    public N and();
    public N endRbd();
    
  }
  public interface ScaleIONested<N> extends Nested<N>,V1ScaleIOVolumeSourceFluent<V1VolumeFluent.ScaleIONested<N>>{
    public N and();
    public N endScaleIO();
    
  }
  public interface SecretNested<N> extends Nested<N>,V1SecretVolumeSourceFluent<V1VolumeFluent.SecretNested<N>>{
    public N and();
    public N endSecret();
    
  }
  public interface StorageosNested<N> extends Nested<N>,V1StorageOSVolumeSourceFluent<V1VolumeFluent.StorageosNested<N>>{
    public N and();
    public N endStorageos();
    
  }
  public interface VsphereVolumeNested<N> extends Nested<N>,V1VsphereVirtualDiskVolumeSourceFluent<V1VolumeFluent.VsphereVolumeNested<N>>{
    public N and();
    public N endVsphereVolume();
    
  }
  
}