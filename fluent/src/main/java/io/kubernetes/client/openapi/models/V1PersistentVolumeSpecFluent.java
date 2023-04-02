package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.util.Collection;
import java.util.Map;
import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;

 /**
  * Generated
  */
public interface V1PersistentVolumeSpecFluent<A extends V1PersistentVolumeSpecFluent<A>> extends Fluent<A>{
  public A addToAccessModes(Integer index,String item);
  public A setToAccessModes(Integer index,String item);
  public A addToAccessModes(java.lang.String... items);
  public A addAllToAccessModes(Collection<String> items);
  public A removeFromAccessModes(java.lang.String... items);
  public A removeAllFromAccessModes(Collection<String> items);
  public List<String> getAccessModes();
  public String getAccessMode(Integer index);
  public String getFirstAccessMode();
  public String getLastAccessMode();
  public String getMatchingAccessMode(Predicate<String> predicate);
  public Boolean hasMatchingAccessMode(Predicate<String> predicate);
  public A withAccessModes(List<String> accessModes);
  public A withAccessModes(java.lang.String... accessModes);
  public Boolean hasAccessModes();
  
  /**
   * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore();
  public V1AWSElasticBlockStoreVolumeSource buildAwsElasticBlockStore();
  public A withAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore);
  public Boolean hasAwsElasticBlockStore();
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore();
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item);
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore();
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore();
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildAzureDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AzureDiskVolumeSource getAzureDisk();
  public V1AzureDiskVolumeSource buildAzureDisk();
  public A withAzureDisk(V1AzureDiskVolumeSource azureDisk);
  public Boolean hasAzureDisk();
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDisk();
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDiskLike(V1AzureDiskVolumeSource item);
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> editAzureDisk();
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDisk();
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDiskLike(V1AzureDiskVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AzureFilePersistentVolumeSource getAzureFile();
  public V1AzureFilePersistentVolumeSource buildAzureFile();
  public A withAzureFile(V1AzureFilePersistentVolumeSource azureFile);
  public Boolean hasAzureFile();
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFile();
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFileLike(V1AzureFilePersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> editAzureFile();
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFile();
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFileLike(V1AzureFilePersistentVolumeSource item);
  public A addToCapacity(String key,Quantity value);
  public A addToCapacity(Map<String,Quantity> map);
  public A removeFromCapacity(String key);
  public A removeFromCapacity(Map<String,Quantity> map);
  public Map<String,Quantity> getCapacity();
  public <K,V>A withCapacity(Map<String,Quantity> capacity);
  public Boolean hasCapacity();
  
  /**
   * This method has been deprecated, please use method buildCephfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CephFSPersistentVolumeSource getCephfs();
  public V1CephFSPersistentVolumeSource buildCephfs();
  public A withCephfs(V1CephFSPersistentVolumeSource cephfs);
  public Boolean hasCephfs();
  public V1PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfs();
  public V1PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfsLike(V1CephFSPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.CephfsNested<A> editCephfs();
  public V1PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfs();
  public V1PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfsLike(V1CephFSPersistentVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildCinder instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CinderPersistentVolumeSource getCinder();
  public V1CinderPersistentVolumeSource buildCinder();
  public A withCinder(V1CinderPersistentVolumeSource cinder);
  public Boolean hasCinder();
  public V1PersistentVolumeSpecFluent.CinderNested<A> withNewCinder();
  public V1PersistentVolumeSpecFluent.CinderNested<A> withNewCinderLike(V1CinderPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.CinderNested<A> editCinder();
  public V1PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinder();
  public V1PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinderLike(V1CinderPersistentVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildClaimRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getClaimRef();
  public V1ObjectReference buildClaimRef();
  public A withClaimRef(V1ObjectReference claimRef);
  public Boolean hasClaimRef();
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRef();
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRefLike(V1ObjectReference item);
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> editClaimRef();
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRef();
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRefLike(V1ObjectReference item);
  
  /**
   * This method has been deprecated, please use method buildCsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CSIPersistentVolumeSource getCsi();
  public V1CSIPersistentVolumeSource buildCsi();
  public A withCsi(V1CSIPersistentVolumeSource csi);
  public Boolean hasCsi();
  public V1PersistentVolumeSpecFluent.CsiNested<A> withNewCsi();
  public V1PersistentVolumeSpecFluent.CsiNested<A> withNewCsiLike(V1CSIPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.CsiNested<A> editCsi();
  public V1PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsi();
  public V1PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsiLike(V1CSIPersistentVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildFc instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FCVolumeSource getFc();
  public V1FCVolumeSource buildFc();
  public A withFc(V1FCVolumeSource fc);
  public Boolean hasFc();
  public V1PersistentVolumeSpecFluent.FcNested<A> withNewFc();
  public V1PersistentVolumeSpecFluent.FcNested<A> withNewFcLike(V1FCVolumeSource item);
  public V1PersistentVolumeSpecFluent.FcNested<A> editFc();
  public V1PersistentVolumeSpecFluent.FcNested<A> editOrNewFc();
  public V1PersistentVolumeSpecFluent.FcNested<A> editOrNewFcLike(V1FCVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FlexPersistentVolumeSource getFlexVolume();
  public V1FlexPersistentVolumeSource buildFlexVolume();
  public A withFlexVolume(V1FlexPersistentVolumeSource flexVolume);
  public Boolean hasFlexVolume();
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolume();
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolumeLike(V1FlexPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> editFlexVolume();
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolume();
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(V1FlexPersistentVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildFlocker instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FlockerVolumeSource getFlocker();
  public V1FlockerVolumeSource buildFlocker();
  public A withFlocker(V1FlockerVolumeSource flocker);
  public Boolean hasFlocker();
  public V1PersistentVolumeSpecFluent.FlockerNested<A> withNewFlocker();
  public V1PersistentVolumeSpecFluent.FlockerNested<A> withNewFlockerLike(V1FlockerVolumeSource item);
  public V1PersistentVolumeSpecFluent.FlockerNested<A> editFlocker();
  public V1PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlocker();
  public V1PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlockerLike(V1FlockerVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildGcePersistentDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GCEPersistentDiskVolumeSource getGcePersistentDisk();
  public V1GCEPersistentDiskVolumeSource buildGcePersistentDisk();
  public A withGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk);
  public Boolean hasGcePersistentDisk();
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk();
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item);
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editGcePersistentDisk();
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk();
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GlusterfsPersistentVolumeSource getGlusterfs();
  public V1GlusterfsPersistentVolumeSource buildGlusterfs();
  public A withGlusterfs(V1GlusterfsPersistentVolumeSource glusterfs);
  public Boolean hasGlusterfs();
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfs();
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfsLike(V1GlusterfsPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> editGlusterfs();
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfs();
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfsLike(V1GlusterfsPersistentVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildHostPath instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HostPathVolumeSource getHostPath();
  public V1HostPathVolumeSource buildHostPath();
  public A withHostPath(V1HostPathVolumeSource hostPath);
  public Boolean hasHostPath();
  public V1PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPath();
  public V1PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPathLike(V1HostPathVolumeSource item);
  public V1PersistentVolumeSpecFluent.HostPathNested<A> editHostPath();
  public V1PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPath();
  public V1PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPathLike(V1HostPathVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildIscsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ISCSIPersistentVolumeSource getIscsi();
  public V1ISCSIPersistentVolumeSource buildIscsi();
  public A withIscsi(V1ISCSIPersistentVolumeSource iscsi);
  public Boolean hasIscsi();
  public V1PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsi();
  public V1PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsiLike(V1ISCSIPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.IscsiNested<A> editIscsi();
  public V1PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsi();
  public V1PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsiLike(V1ISCSIPersistentVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildLocal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalVolumeSource getLocal();
  public V1LocalVolumeSource buildLocal();
  public A withLocal(V1LocalVolumeSource local);
  public Boolean hasLocal();
  public V1PersistentVolumeSpecFluent.LocalNested<A> withNewLocal();
  public V1PersistentVolumeSpecFluent.LocalNested<A> withNewLocalLike(V1LocalVolumeSource item);
  public V1PersistentVolumeSpecFluent.LocalNested<A> editLocal();
  public V1PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocal();
  public V1PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocalLike(V1LocalVolumeSource item);
  public A addToMountOptions(Integer index,String item);
  public A setToMountOptions(Integer index,String item);
  public A addToMountOptions(java.lang.String... items);
  public A addAllToMountOptions(Collection<String> items);
  public A removeFromMountOptions(java.lang.String... items);
  public A removeAllFromMountOptions(Collection<String> items);
  public List<String> getMountOptions();
  public String getMountOption(Integer index);
  public String getFirstMountOption();
  public String getLastMountOption();
  public String getMatchingMountOption(Predicate<String> predicate);
  public Boolean hasMatchingMountOption(Predicate<String> predicate);
  public A withMountOptions(List<String> mountOptions);
  public A withMountOptions(java.lang.String... mountOptions);
  public Boolean hasMountOptions();
  
  /**
   * This method has been deprecated, please use method buildNfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NFSVolumeSource getNfs();
  public V1NFSVolumeSource buildNfs();
  public A withNfs(V1NFSVolumeSource nfs);
  public Boolean hasNfs();
  public V1PersistentVolumeSpecFluent.NfsNested<A> withNewNfs();
  public V1PersistentVolumeSpecFluent.NfsNested<A> withNewNfsLike(V1NFSVolumeSource item);
  public V1PersistentVolumeSpecFluent.NfsNested<A> editNfs();
  public V1PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfs();
  public V1PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfsLike(V1NFSVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildNodeAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeNodeAffinity getNodeAffinity();
  public V1VolumeNodeAffinity buildNodeAffinity();
  public A withNodeAffinity(V1VolumeNodeAffinity nodeAffinity);
  public Boolean hasNodeAffinity();
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinity();
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinityLike(V1VolumeNodeAffinity item);
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> editNodeAffinity();
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinity();
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(V1VolumeNodeAffinity item);
  public String getPersistentVolumeReclaimPolicy();
  public A withPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy);
  public Boolean hasPersistentVolumeReclaimPolicy();
  
  /**
   * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk();
  public V1PhotonPersistentDiskVolumeSource buildPhotonPersistentDisk();
  public A withPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk);
  public Boolean hasPhotonPersistentDisk();
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk();
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item);
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk();
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk();
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildPortworxVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PortworxVolumeSource getPortworxVolume();
  public V1PortworxVolumeSource buildPortworxVolume();
  public A withPortworxVolume(V1PortworxVolumeSource portworxVolume);
  public Boolean hasPortworxVolume();
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolume();
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(V1PortworxVolumeSource item);
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> editPortworxVolume();
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolume();
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(V1PortworxVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildQuobyte instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1QuobyteVolumeSource getQuobyte();
  public V1QuobyteVolumeSource buildQuobyte();
  public A withQuobyte(V1QuobyteVolumeSource quobyte);
  public Boolean hasQuobyte();
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyte();
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyteLike(V1QuobyteVolumeSource item);
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> editQuobyte();
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyte();
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyteLike(V1QuobyteVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildRbd instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RBDPersistentVolumeSource getRbd();
  public V1RBDPersistentVolumeSource buildRbd();
  public A withRbd(V1RBDPersistentVolumeSource rbd);
  public Boolean hasRbd();
  public V1PersistentVolumeSpecFluent.RbdNested<A> withNewRbd();
  public V1PersistentVolumeSpecFluent.RbdNested<A> withNewRbdLike(V1RBDPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.RbdNested<A> editRbd();
  public V1PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbd();
  public V1PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbdLike(V1RBDPersistentVolumeSource item);
  
  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ScaleIOPersistentVolumeSource getScaleIO();
  public V1ScaleIOPersistentVolumeSource buildScaleIO();
  public A withScaleIO(V1ScaleIOPersistentVolumeSource scaleIO);
  public Boolean hasScaleIO();
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIO();
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIOLike(V1ScaleIOPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> editScaleIO();
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIO();
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIOLike(V1ScaleIOPersistentVolumeSource item);
  public String getStorageClassName();
  public A withStorageClassName(String storageClassName);
  public Boolean hasStorageClassName();
  
  /**
   * This method has been deprecated, please use method buildStorageos instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StorageOSPersistentVolumeSource getStorageos();
  public V1StorageOSPersistentVolumeSource buildStorageos();
  public A withStorageos(V1StorageOSPersistentVolumeSource storageos);
  public Boolean hasStorageos();
  public V1PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageos();
  public V1PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageosLike(V1StorageOSPersistentVolumeSource item);
  public V1PersistentVolumeSpecFluent.StorageosNested<A> editStorageos();
  public V1PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageos();
  public V1PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageosLike(V1StorageOSPersistentVolumeSource item);
  public String getVolumeMode();
  public A withVolumeMode(String volumeMode);
  public Boolean hasVolumeMode();
  
  /**
   * This method has been deprecated, please use method buildVsphereVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VsphereVirtualDiskVolumeSource getVsphereVolume();
  public V1VsphereVirtualDiskVolumeSource buildVsphereVolume();
  public A withVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume);
  public Boolean hasVsphereVolume();
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolume();
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item);
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> editVsphereVolume();
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolume();
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item);
  public interface AwsElasticBlockStoreNested<N> extends Nested<N>,V1AWSElasticBlockStoreVolumeSourceFluent<V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<N>>{
    public N and();
    public N endAwsElasticBlockStore();
    
  }
  public interface AzureDiskNested<N> extends Nested<N>,V1AzureDiskVolumeSourceFluent<V1PersistentVolumeSpecFluent.AzureDiskNested<N>>{
    public N and();
    public N endAzureDisk();
    
  }
  public interface AzureFileNested<N> extends Nested<N>,V1AzureFilePersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.AzureFileNested<N>>{
    public N and();
    public N endAzureFile();
    
  }
  public interface CephfsNested<N> extends Nested<N>,V1CephFSPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.CephfsNested<N>>{
    public N and();
    public N endCephfs();
    
  }
  public interface CinderNested<N> extends Nested<N>,V1CinderPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.CinderNested<N>>{
    public N and();
    public N endCinder();
    
  }
  public interface ClaimRefNested<N> extends Nested<N>,V1ObjectReferenceFluent<V1PersistentVolumeSpecFluent.ClaimRefNested<N>>{
    public N and();
    public N endClaimRef();
    
  }
  public interface CsiNested<N> extends Nested<N>,V1CSIPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.CsiNested<N>>{
    public N and();
    public N endCsi();
    
  }
  public interface FcNested<N> extends Nested<N>,V1FCVolumeSourceFluent<V1PersistentVolumeSpecFluent.FcNested<N>>{
    public N and();
    public N endFc();
    
  }
  public interface FlexVolumeNested<N> extends Nested<N>,V1FlexPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.FlexVolumeNested<N>>{
    public N and();
    public N endFlexVolume();
    
  }
  public interface FlockerNested<N> extends Nested<N>,V1FlockerVolumeSourceFluent<V1PersistentVolumeSpecFluent.FlockerNested<N>>{
    public N and();
    public N endFlocker();
    
  }
  public interface GcePersistentDiskNested<N> extends Nested<N>,V1GCEPersistentDiskVolumeSourceFluent<V1PersistentVolumeSpecFluent.GcePersistentDiskNested<N>>{
    public N and();
    public N endGcePersistentDisk();
    
  }
  public interface GlusterfsNested<N> extends Nested<N>,V1GlusterfsPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.GlusterfsNested<N>>{
    public N and();
    public N endGlusterfs();
    
  }
  public interface HostPathNested<N> extends Nested<N>,V1HostPathVolumeSourceFluent<V1PersistentVolumeSpecFluent.HostPathNested<N>>{
    public N and();
    public N endHostPath();
    
  }
  public interface IscsiNested<N> extends Nested<N>,V1ISCSIPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.IscsiNested<N>>{
    public N and();
    public N endIscsi();
    
  }
  public interface LocalNested<N> extends Nested<N>,V1LocalVolumeSourceFluent<V1PersistentVolumeSpecFluent.LocalNested<N>>{
    public N and();
    public N endLocal();
    
  }
  public interface NfsNested<N> extends Nested<N>,V1NFSVolumeSourceFluent<V1PersistentVolumeSpecFluent.NfsNested<N>>{
    public N and();
    public N endNfs();
    
  }
  public interface NodeAffinityNested<N> extends Nested<N>,V1VolumeNodeAffinityFluent<V1PersistentVolumeSpecFluent.NodeAffinityNested<N>>{
    public N and();
    public N endNodeAffinity();
    
  }
  public interface PhotonPersistentDiskNested<N> extends Nested<N>,V1PhotonPersistentDiskVolumeSourceFluent<V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<N>>{
    public N and();
    public N endPhotonPersistentDisk();
    
  }
  public interface PortworxVolumeNested<N> extends Nested<N>,V1PortworxVolumeSourceFluent<V1PersistentVolumeSpecFluent.PortworxVolumeNested<N>>{
    public N and();
    public N endPortworxVolume();
    
  }
  public interface QuobyteNested<N> extends Nested<N>,V1QuobyteVolumeSourceFluent<V1PersistentVolumeSpecFluent.QuobyteNested<N>>{
    public N and();
    public N endQuobyte();
    
  }
  public interface RbdNested<N> extends Nested<N>,V1RBDPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.RbdNested<N>>{
    public N and();
    public N endRbd();
    
  }
  public interface ScaleIONested<N> extends Nested<N>,V1ScaleIOPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.ScaleIONested<N>>{
    public N and();
    public N endScaleIO();
    
  }
  public interface StorageosNested<N> extends Nested<N>,V1StorageOSPersistentVolumeSourceFluent<V1PersistentVolumeSpecFluent.StorageosNested<N>>{
    public N and();
    public N endStorageos();
    
  }
  public interface VsphereVolumeNested<N> extends Nested<N>,V1VsphereVirtualDiskVolumeSourceFluent<V1PersistentVolumeSpecFluent.VsphereVolumeNested<N>>{
    public N and();
    public N endVsphereVolume();
    
  }
  
}