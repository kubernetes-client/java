package io.kubernetes.client.openapi.models;

import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Deprecated;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1VolumeFluentImpl<A extends V1VolumeFluent<A>> extends BaseFluent<A> implements V1VolumeFluent<A>{
  public V1VolumeFluentImpl() {
  }
  public V1VolumeFluentImpl(V1Volume instance) {
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
  private V1AWSElasticBlockStoreVolumeSourceBuilder awsElasticBlockStore;
  private V1AzureDiskVolumeSourceBuilder azureDisk;
  private V1AzureFileVolumeSourceBuilder azureFile;
  private V1CephFSVolumeSourceBuilder cephfs;
  private V1CinderVolumeSourceBuilder cinder;
  private V1ConfigMapVolumeSourceBuilder configMap;
  private V1CSIVolumeSourceBuilder csi;
  private V1DownwardAPIVolumeSourceBuilder downwardAPI;
  private V1EmptyDirVolumeSourceBuilder emptyDir;
  private V1EphemeralVolumeSourceBuilder ephemeral;
  private V1FCVolumeSourceBuilder fc;
  private V1FlexVolumeSourceBuilder flexVolume;
  private V1FlockerVolumeSourceBuilder flocker;
  private V1GCEPersistentDiskVolumeSourceBuilder gcePersistentDisk;
  private V1GitRepoVolumeSourceBuilder gitRepo;
  private V1GlusterfsVolumeSourceBuilder glusterfs;
  private V1HostPathVolumeSourceBuilder hostPath;
  private V1ISCSIVolumeSourceBuilder iscsi;
  private String name;
  private V1NFSVolumeSourceBuilder nfs;
  private V1PersistentVolumeClaimVolumeSourceBuilder persistentVolumeClaim;
  private V1PhotonPersistentDiskVolumeSourceBuilder photonPersistentDisk;
  private V1PortworxVolumeSourceBuilder portworxVolume;
  private V1ProjectedVolumeSourceBuilder projected;
  private V1QuobyteVolumeSourceBuilder quobyte;
  private V1RBDVolumeSourceBuilder rbd;
  private V1ScaleIOVolumeSourceBuilder scaleIO;
  private V1SecretVolumeSourceBuilder secret;
  private V1StorageOSVolumeSourceBuilder storageos;
  private V1VsphereVirtualDiskVolumeSourceBuilder vsphereVolume;
  
  /**
   * This method has been deprecated, please use method buildAwsElasticBlockStore instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return this.awsElasticBlockStore!=null ?this.awsElasticBlockStore.build():null;
  }
  public V1AWSElasticBlockStoreVolumeSource buildAwsElasticBlockStore() {
    return this.awsElasticBlockStore!=null ?this.awsElasticBlockStore.build():null;
  }
  public A withAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    _visitables.get("awsElasticBlockStore").remove(this.awsElasticBlockStore);
    if (awsElasticBlockStore!=null){ this.awsElasticBlockStore= new V1AWSElasticBlockStoreVolumeSourceBuilder(awsElasticBlockStore); _visitables.get("awsElasticBlockStore").add(this.awsElasticBlockStore);} else { this.awsElasticBlockStore = null; _visitables.get("awsElasticBlockStore").remove(this.awsElasticBlockStore); } return (A) this;
  }
  public Boolean hasAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null;
  }
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore() {
    return new V1VolumeFluentImpl.AwsElasticBlockStoreNestedImpl();
  }
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item) {
    return new V1VolumeFluentImpl.AwsElasticBlockStoreNestedImpl(item);
  }
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore());
  }
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore() != null ? getAwsElasticBlockStore(): new V1AWSElasticBlockStoreVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item) {
    return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore() != null ? getAwsElasticBlockStore(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildAzureDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AzureDiskVolumeSource getAzureDisk() {
    return this.azureDisk!=null ?this.azureDisk.build():null;
  }
  public V1AzureDiskVolumeSource buildAzureDisk() {
    return this.azureDisk!=null ?this.azureDisk.build():null;
  }
  public A withAzureDisk(V1AzureDiskVolumeSource azureDisk) {
    _visitables.get("azureDisk").remove(this.azureDisk);
    if (azureDisk!=null){ this.azureDisk= new V1AzureDiskVolumeSourceBuilder(azureDisk); _visitables.get("azureDisk").add(this.azureDisk);} else { this.azureDisk = null; _visitables.get("azureDisk").remove(this.azureDisk); } return (A) this;
  }
  public Boolean hasAzureDisk() {
    return this.azureDisk != null;
  }
  public V1VolumeFluent.AzureDiskNested<A> withNewAzureDisk() {
    return new V1VolumeFluentImpl.AzureDiskNestedImpl();
  }
  public V1VolumeFluent.AzureDiskNested<A> withNewAzureDiskLike(V1AzureDiskVolumeSource item) {
    return new V1VolumeFluentImpl.AzureDiskNestedImpl(item);
  }
  public V1VolumeFluent.AzureDiskNested<A> editAzureDisk() {
    return withNewAzureDiskLike(getAzureDisk());
  }
  public V1VolumeFluent.AzureDiskNested<A> editOrNewAzureDisk() {
    return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): new V1AzureDiskVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.AzureDiskNested<A> editOrNewAzureDiskLike(V1AzureDiskVolumeSource item) {
    return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AzureFileVolumeSource getAzureFile() {
    return this.azureFile!=null ?this.azureFile.build():null;
  }
  public V1AzureFileVolumeSource buildAzureFile() {
    return this.azureFile!=null ?this.azureFile.build():null;
  }
  public A withAzureFile(V1AzureFileVolumeSource azureFile) {
    _visitables.get("azureFile").remove(this.azureFile);
    if (azureFile!=null){ this.azureFile= new V1AzureFileVolumeSourceBuilder(azureFile); _visitables.get("azureFile").add(this.azureFile);} else { this.azureFile = null; _visitables.get("azureFile").remove(this.azureFile); } return (A) this;
  }
  public Boolean hasAzureFile() {
    return this.azureFile != null;
  }
  public V1VolumeFluent.AzureFileNested<A> withNewAzureFile() {
    return new V1VolumeFluentImpl.AzureFileNestedImpl();
  }
  public V1VolumeFluent.AzureFileNested<A> withNewAzureFileLike(V1AzureFileVolumeSource item) {
    return new V1VolumeFluentImpl.AzureFileNestedImpl(item);
  }
  public V1VolumeFluent.AzureFileNested<A> editAzureFile() {
    return withNewAzureFileLike(getAzureFile());
  }
  public V1VolumeFluent.AzureFileNested<A> editOrNewAzureFile() {
    return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): new V1AzureFileVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.AzureFileNested<A> editOrNewAzureFileLike(V1AzureFileVolumeSource item) {
    return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildCephfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CephFSVolumeSource getCephfs() {
    return this.cephfs!=null ?this.cephfs.build():null;
  }
  public V1CephFSVolumeSource buildCephfs() {
    return this.cephfs!=null ?this.cephfs.build():null;
  }
  public A withCephfs(V1CephFSVolumeSource cephfs) {
    _visitables.get("cephfs").remove(this.cephfs);
    if (cephfs!=null){ this.cephfs= new V1CephFSVolumeSourceBuilder(cephfs); _visitables.get("cephfs").add(this.cephfs);} else { this.cephfs = null; _visitables.get("cephfs").remove(this.cephfs); } return (A) this;
  }
  public Boolean hasCephfs() {
    return this.cephfs != null;
  }
  public V1VolumeFluent.CephfsNested<A> withNewCephfs() {
    return new V1VolumeFluentImpl.CephfsNestedImpl();
  }
  public V1VolumeFluent.CephfsNested<A> withNewCephfsLike(V1CephFSVolumeSource item) {
    return new V1VolumeFluentImpl.CephfsNestedImpl(item);
  }
  public V1VolumeFluent.CephfsNested<A> editCephfs() {
    return withNewCephfsLike(getCephfs());
  }
  public V1VolumeFluent.CephfsNested<A> editOrNewCephfs() {
    return withNewCephfsLike(getCephfs() != null ? getCephfs(): new V1CephFSVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.CephfsNested<A> editOrNewCephfsLike(V1CephFSVolumeSource item) {
    return withNewCephfsLike(getCephfs() != null ? getCephfs(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildCinder instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CinderVolumeSource getCinder() {
    return this.cinder!=null ?this.cinder.build():null;
  }
  public V1CinderVolumeSource buildCinder() {
    return this.cinder!=null ?this.cinder.build():null;
  }
  public A withCinder(V1CinderVolumeSource cinder) {
    _visitables.get("cinder").remove(this.cinder);
    if (cinder!=null){ this.cinder= new V1CinderVolumeSourceBuilder(cinder); _visitables.get("cinder").add(this.cinder);} else { this.cinder = null; _visitables.get("cinder").remove(this.cinder); } return (A) this;
  }
  public Boolean hasCinder() {
    return this.cinder != null;
  }
  public V1VolumeFluent.CinderNested<A> withNewCinder() {
    return new V1VolumeFluentImpl.CinderNestedImpl();
  }
  public V1VolumeFluent.CinderNested<A> withNewCinderLike(V1CinderVolumeSource item) {
    return new V1VolumeFluentImpl.CinderNestedImpl(item);
  }
  public V1VolumeFluent.CinderNested<A> editCinder() {
    return withNewCinderLike(getCinder());
  }
  public V1VolumeFluent.CinderNested<A> editOrNewCinder() {
    return withNewCinderLike(getCinder() != null ? getCinder(): new V1CinderVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.CinderNested<A> editOrNewCinderLike(V1CinderVolumeSource item) {
    return withNewCinderLike(getCinder() != null ? getCinder(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildConfigMap instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ConfigMapVolumeSource getConfigMap() {
    return this.configMap!=null ?this.configMap.build():null;
  }
  public V1ConfigMapVolumeSource buildConfigMap() {
    return this.configMap!=null ?this.configMap.build():null;
  }
  public A withConfigMap(V1ConfigMapVolumeSource configMap) {
    _visitables.get("configMap").remove(this.configMap);
    if (configMap!=null){ this.configMap= new V1ConfigMapVolumeSourceBuilder(configMap); _visitables.get("configMap").add(this.configMap);} else { this.configMap = null; _visitables.get("configMap").remove(this.configMap); } return (A) this;
  }
  public Boolean hasConfigMap() {
    return this.configMap != null;
  }
  public V1VolumeFluent.ConfigMapNested<A> withNewConfigMap() {
    return new V1VolumeFluentImpl.ConfigMapNestedImpl();
  }
  public V1VolumeFluent.ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapVolumeSource item) {
    return new V1VolumeFluentImpl.ConfigMapNestedImpl(item);
  }
  public V1VolumeFluent.ConfigMapNested<A> editConfigMap() {
    return withNewConfigMapLike(getConfigMap());
  }
  public V1VolumeFluent.ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): new V1ConfigMapVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapVolumeSource item) {
    return withNewConfigMapLike(getConfigMap() != null ? getConfigMap(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildCsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CSIVolumeSource getCsi() {
    return this.csi!=null ?this.csi.build():null;
  }
  public V1CSIVolumeSource buildCsi() {
    return this.csi!=null ?this.csi.build():null;
  }
  public A withCsi(V1CSIVolumeSource csi) {
    _visitables.get("csi").remove(this.csi);
    if (csi!=null){ this.csi= new V1CSIVolumeSourceBuilder(csi); _visitables.get("csi").add(this.csi);} else { this.csi = null; _visitables.get("csi").remove(this.csi); } return (A) this;
  }
  public Boolean hasCsi() {
    return this.csi != null;
  }
  public V1VolumeFluent.CsiNested<A> withNewCsi() {
    return new V1VolumeFluentImpl.CsiNestedImpl();
  }
  public V1VolumeFluent.CsiNested<A> withNewCsiLike(V1CSIVolumeSource item) {
    return new V1VolumeFluentImpl.CsiNestedImpl(item);
  }
  public V1VolumeFluent.CsiNested<A> editCsi() {
    return withNewCsiLike(getCsi());
  }
  public V1VolumeFluent.CsiNested<A> editOrNewCsi() {
    return withNewCsiLike(getCsi() != null ? getCsi(): new V1CSIVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.CsiNested<A> editOrNewCsiLike(V1CSIVolumeSource item) {
    return withNewCsiLike(getCsi() != null ? getCsi(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildDownwardAPI instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1DownwardAPIVolumeSource getDownwardAPI() {
    return this.downwardAPI!=null ?this.downwardAPI.build():null;
  }
  public V1DownwardAPIVolumeSource buildDownwardAPI() {
    return this.downwardAPI!=null ?this.downwardAPI.build():null;
  }
  public A withDownwardAPI(V1DownwardAPIVolumeSource downwardAPI) {
    _visitables.get("downwardAPI").remove(this.downwardAPI);
    if (downwardAPI!=null){ this.downwardAPI= new V1DownwardAPIVolumeSourceBuilder(downwardAPI); _visitables.get("downwardAPI").add(this.downwardAPI);} else { this.downwardAPI = null; _visitables.get("downwardAPI").remove(this.downwardAPI); } return (A) this;
  }
  public Boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }
  public V1VolumeFluent.DownwardAPINested<A> withNewDownwardAPI() {
    return new V1VolumeFluentImpl.DownwardAPINestedImpl();
  }
  public V1VolumeFluent.DownwardAPINested<A> withNewDownwardAPILike(V1DownwardAPIVolumeSource item) {
    return new V1VolumeFluentImpl.DownwardAPINestedImpl(item);
  }
  public V1VolumeFluent.DownwardAPINested<A> editDownwardAPI() {
    return withNewDownwardAPILike(getDownwardAPI());
  }
  public V1VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPI() {
    return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): new V1DownwardAPIVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.DownwardAPINested<A> editOrNewDownwardAPILike(V1DownwardAPIVolumeSource item) {
    return withNewDownwardAPILike(getDownwardAPI() != null ? getDownwardAPI(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildEmptyDir instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EmptyDirVolumeSource getEmptyDir() {
    return this.emptyDir!=null ?this.emptyDir.build():null;
  }
  public V1EmptyDirVolumeSource buildEmptyDir() {
    return this.emptyDir!=null ?this.emptyDir.build():null;
  }
  public A withEmptyDir(V1EmptyDirVolumeSource emptyDir) {
    _visitables.get("emptyDir").remove(this.emptyDir);
    if (emptyDir!=null){ this.emptyDir= new V1EmptyDirVolumeSourceBuilder(emptyDir); _visitables.get("emptyDir").add(this.emptyDir);} else { this.emptyDir = null; _visitables.get("emptyDir").remove(this.emptyDir); } return (A) this;
  }
  public Boolean hasEmptyDir() {
    return this.emptyDir != null;
  }
  public V1VolumeFluent.EmptyDirNested<A> withNewEmptyDir() {
    return new V1VolumeFluentImpl.EmptyDirNestedImpl();
  }
  public V1VolumeFluent.EmptyDirNested<A> withNewEmptyDirLike(V1EmptyDirVolumeSource item) {
    return new V1VolumeFluentImpl.EmptyDirNestedImpl(item);
  }
  public V1VolumeFluent.EmptyDirNested<A> editEmptyDir() {
    return withNewEmptyDirLike(getEmptyDir());
  }
  public V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDir() {
    return withNewEmptyDirLike(getEmptyDir() != null ? getEmptyDir(): new V1EmptyDirVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.EmptyDirNested<A> editOrNewEmptyDirLike(V1EmptyDirVolumeSource item) {
    return withNewEmptyDirLike(getEmptyDir() != null ? getEmptyDir(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildEphemeral instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1EphemeralVolumeSource getEphemeral() {
    return this.ephemeral!=null ?this.ephemeral.build():null;
  }
  public V1EphemeralVolumeSource buildEphemeral() {
    return this.ephemeral!=null ?this.ephemeral.build():null;
  }
  public A withEphemeral(V1EphemeralVolumeSource ephemeral) {
    _visitables.get("ephemeral").remove(this.ephemeral);
    if (ephemeral!=null){ this.ephemeral= new V1EphemeralVolumeSourceBuilder(ephemeral); _visitables.get("ephemeral").add(this.ephemeral);} else { this.ephemeral = null; _visitables.get("ephemeral").remove(this.ephemeral); } return (A) this;
  }
  public Boolean hasEphemeral() {
    return this.ephemeral != null;
  }
  public V1VolumeFluent.EphemeralNested<A> withNewEphemeral() {
    return new V1VolumeFluentImpl.EphemeralNestedImpl();
  }
  public V1VolumeFluent.EphemeralNested<A> withNewEphemeralLike(V1EphemeralVolumeSource item) {
    return new V1VolumeFluentImpl.EphemeralNestedImpl(item);
  }
  public V1VolumeFluent.EphemeralNested<A> editEphemeral() {
    return withNewEphemeralLike(getEphemeral());
  }
  public V1VolumeFluent.EphemeralNested<A> editOrNewEphemeral() {
    return withNewEphemeralLike(getEphemeral() != null ? getEphemeral(): new V1EphemeralVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.EphemeralNested<A> editOrNewEphemeralLike(V1EphemeralVolumeSource item) {
    return withNewEphemeralLike(getEphemeral() != null ? getEphemeral(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildFc instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FCVolumeSource getFc() {
    return this.fc!=null ?this.fc.build():null;
  }
  public V1FCVolumeSource buildFc() {
    return this.fc!=null ?this.fc.build():null;
  }
  public A withFc(V1FCVolumeSource fc) {
    _visitables.get("fc").remove(this.fc);
    if (fc!=null){ this.fc= new V1FCVolumeSourceBuilder(fc); _visitables.get("fc").add(this.fc);} else { this.fc = null; _visitables.get("fc").remove(this.fc); } return (A) this;
  }
  public Boolean hasFc() {
    return this.fc != null;
  }
  public V1VolumeFluent.FcNested<A> withNewFc() {
    return new V1VolumeFluentImpl.FcNestedImpl();
  }
  public V1VolumeFluent.FcNested<A> withNewFcLike(V1FCVolumeSource item) {
    return new V1VolumeFluentImpl.FcNestedImpl(item);
  }
  public V1VolumeFluent.FcNested<A> editFc() {
    return withNewFcLike(getFc());
  }
  public V1VolumeFluent.FcNested<A> editOrNewFc() {
    return withNewFcLike(getFc() != null ? getFc(): new V1FCVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.FcNested<A> editOrNewFcLike(V1FCVolumeSource item) {
    return withNewFcLike(getFc() != null ? getFc(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FlexVolumeSource getFlexVolume() {
    return this.flexVolume!=null ?this.flexVolume.build():null;
  }
  public V1FlexVolumeSource buildFlexVolume() {
    return this.flexVolume!=null ?this.flexVolume.build():null;
  }
  public A withFlexVolume(V1FlexVolumeSource flexVolume) {
    _visitables.get("flexVolume").remove(this.flexVolume);
    if (flexVolume!=null){ this.flexVolume= new V1FlexVolumeSourceBuilder(flexVolume); _visitables.get("flexVolume").add(this.flexVolume);} else { this.flexVolume = null; _visitables.get("flexVolume").remove(this.flexVolume); } return (A) this;
  }
  public Boolean hasFlexVolume() {
    return this.flexVolume != null;
  }
  public V1VolumeFluent.FlexVolumeNested<A> withNewFlexVolume() {
    return new V1VolumeFluentImpl.FlexVolumeNestedImpl();
  }
  public V1VolumeFluent.FlexVolumeNested<A> withNewFlexVolumeLike(V1FlexVolumeSource item) {
    return new V1VolumeFluentImpl.FlexVolumeNestedImpl(item);
  }
  public V1VolumeFluent.FlexVolumeNested<A> editFlexVolume() {
    return withNewFlexVolumeLike(getFlexVolume());
  }
  public V1VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolume() {
    return withNewFlexVolumeLike(getFlexVolume() != null ? getFlexVolume(): new V1FlexVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(V1FlexVolumeSource item) {
    return withNewFlexVolumeLike(getFlexVolume() != null ? getFlexVolume(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildFlocker instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FlockerVolumeSource getFlocker() {
    return this.flocker!=null ?this.flocker.build():null;
  }
  public V1FlockerVolumeSource buildFlocker() {
    return this.flocker!=null ?this.flocker.build():null;
  }
  public A withFlocker(V1FlockerVolumeSource flocker) {
    _visitables.get("flocker").remove(this.flocker);
    if (flocker!=null){ this.flocker= new V1FlockerVolumeSourceBuilder(flocker); _visitables.get("flocker").add(this.flocker);} else { this.flocker = null; _visitables.get("flocker").remove(this.flocker); } return (A) this;
  }
  public Boolean hasFlocker() {
    return this.flocker != null;
  }
  public V1VolumeFluent.FlockerNested<A> withNewFlocker() {
    return new V1VolumeFluentImpl.FlockerNestedImpl();
  }
  public V1VolumeFluent.FlockerNested<A> withNewFlockerLike(V1FlockerVolumeSource item) {
    return new V1VolumeFluentImpl.FlockerNestedImpl(item);
  }
  public V1VolumeFluent.FlockerNested<A> editFlocker() {
    return withNewFlockerLike(getFlocker());
  }
  public V1VolumeFluent.FlockerNested<A> editOrNewFlocker() {
    return withNewFlockerLike(getFlocker() != null ? getFlocker(): new V1FlockerVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.FlockerNested<A> editOrNewFlockerLike(V1FlockerVolumeSource item) {
    return withNewFlockerLike(getFlocker() != null ? getFlocker(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildGcePersistentDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return this.gcePersistentDisk!=null ?this.gcePersistentDisk.build():null;
  }
  public V1GCEPersistentDiskVolumeSource buildGcePersistentDisk() {
    return this.gcePersistentDisk!=null ?this.gcePersistentDisk.build():null;
  }
  public A withGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    _visitables.get("gcePersistentDisk").remove(this.gcePersistentDisk);
    if (gcePersistentDisk!=null){ this.gcePersistentDisk= new V1GCEPersistentDiskVolumeSourceBuilder(gcePersistentDisk); _visitables.get("gcePersistentDisk").add(this.gcePersistentDisk);} else { this.gcePersistentDisk = null; _visitables.get("gcePersistentDisk").remove(this.gcePersistentDisk); } return (A) this;
  }
  public Boolean hasGcePersistentDisk() {
    return this.gcePersistentDisk != null;
  }
  public V1VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk() {
    return new V1VolumeFluentImpl.GcePersistentDiskNestedImpl();
  }
  public V1VolumeFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item) {
    return new V1VolumeFluentImpl.GcePersistentDiskNestedImpl(item);
  }
  public V1VolumeFluent.GcePersistentDiskNested<A> editGcePersistentDisk() {
    return withNewGcePersistentDiskLike(getGcePersistentDisk());
  }
  public V1VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk() {
    return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): new V1GCEPersistentDiskVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item) {
    return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildGitRepo instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GitRepoVolumeSource getGitRepo() {
    return this.gitRepo!=null ?this.gitRepo.build():null;
  }
  public V1GitRepoVolumeSource buildGitRepo() {
    return this.gitRepo!=null ?this.gitRepo.build():null;
  }
  public A withGitRepo(V1GitRepoVolumeSource gitRepo) {
    _visitables.get("gitRepo").remove(this.gitRepo);
    if (gitRepo!=null){ this.gitRepo= new V1GitRepoVolumeSourceBuilder(gitRepo); _visitables.get("gitRepo").add(this.gitRepo);} else { this.gitRepo = null; _visitables.get("gitRepo").remove(this.gitRepo); } return (A) this;
  }
  public Boolean hasGitRepo() {
    return this.gitRepo != null;
  }
  public V1VolumeFluent.GitRepoNested<A> withNewGitRepo() {
    return new V1VolumeFluentImpl.GitRepoNestedImpl();
  }
  public V1VolumeFluent.GitRepoNested<A> withNewGitRepoLike(V1GitRepoVolumeSource item) {
    return new V1VolumeFluentImpl.GitRepoNestedImpl(item);
  }
  public V1VolumeFluent.GitRepoNested<A> editGitRepo() {
    return withNewGitRepoLike(getGitRepo());
  }
  public V1VolumeFluent.GitRepoNested<A> editOrNewGitRepo() {
    return withNewGitRepoLike(getGitRepo() != null ? getGitRepo(): new V1GitRepoVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.GitRepoNested<A> editOrNewGitRepoLike(V1GitRepoVolumeSource item) {
    return withNewGitRepoLike(getGitRepo() != null ? getGitRepo(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GlusterfsVolumeSource getGlusterfs() {
    return this.glusterfs!=null ?this.glusterfs.build():null;
  }
  public V1GlusterfsVolumeSource buildGlusterfs() {
    return this.glusterfs!=null ?this.glusterfs.build():null;
  }
  public A withGlusterfs(V1GlusterfsVolumeSource glusterfs) {
    _visitables.get("glusterfs").remove(this.glusterfs);
    if (glusterfs!=null){ this.glusterfs= new V1GlusterfsVolumeSourceBuilder(glusterfs); _visitables.get("glusterfs").add(this.glusterfs);} else { this.glusterfs = null; _visitables.get("glusterfs").remove(this.glusterfs); } return (A) this;
  }
  public Boolean hasGlusterfs() {
    return this.glusterfs != null;
  }
  public V1VolumeFluent.GlusterfsNested<A> withNewGlusterfs() {
    return new V1VolumeFluentImpl.GlusterfsNestedImpl();
  }
  public V1VolumeFluent.GlusterfsNested<A> withNewGlusterfsLike(V1GlusterfsVolumeSource item) {
    return new V1VolumeFluentImpl.GlusterfsNestedImpl(item);
  }
  public V1VolumeFluent.GlusterfsNested<A> editGlusterfs() {
    return withNewGlusterfsLike(getGlusterfs());
  }
  public V1VolumeFluent.GlusterfsNested<A> editOrNewGlusterfs() {
    return withNewGlusterfsLike(getGlusterfs() != null ? getGlusterfs(): new V1GlusterfsVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.GlusterfsNested<A> editOrNewGlusterfsLike(V1GlusterfsVolumeSource item) {
    return withNewGlusterfsLike(getGlusterfs() != null ? getGlusterfs(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildHostPath instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1HostPathVolumeSource getHostPath() {
    return this.hostPath!=null ?this.hostPath.build():null;
  }
  public V1HostPathVolumeSource buildHostPath() {
    return this.hostPath!=null ?this.hostPath.build():null;
  }
  public A withHostPath(V1HostPathVolumeSource hostPath) {
    _visitables.get("hostPath").remove(this.hostPath);
    if (hostPath!=null){ this.hostPath= new V1HostPathVolumeSourceBuilder(hostPath); _visitables.get("hostPath").add(this.hostPath);} else { this.hostPath = null; _visitables.get("hostPath").remove(this.hostPath); } return (A) this;
  }
  public Boolean hasHostPath() {
    return this.hostPath != null;
  }
  public V1VolumeFluent.HostPathNested<A> withNewHostPath() {
    return new V1VolumeFluentImpl.HostPathNestedImpl();
  }
  public V1VolumeFluent.HostPathNested<A> withNewHostPathLike(V1HostPathVolumeSource item) {
    return new V1VolumeFluentImpl.HostPathNestedImpl(item);
  }
  public V1VolumeFluent.HostPathNested<A> editHostPath() {
    return withNewHostPathLike(getHostPath());
  }
  public V1VolumeFluent.HostPathNested<A> editOrNewHostPath() {
    return withNewHostPathLike(getHostPath() != null ? getHostPath(): new V1HostPathVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.HostPathNested<A> editOrNewHostPathLike(V1HostPathVolumeSource item) {
    return withNewHostPathLike(getHostPath() != null ? getHostPath(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildIscsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ISCSIVolumeSource getIscsi() {
    return this.iscsi!=null ?this.iscsi.build():null;
  }
  public V1ISCSIVolumeSource buildIscsi() {
    return this.iscsi!=null ?this.iscsi.build():null;
  }
  public A withIscsi(V1ISCSIVolumeSource iscsi) {
    _visitables.get("iscsi").remove(this.iscsi);
    if (iscsi!=null){ this.iscsi= new V1ISCSIVolumeSourceBuilder(iscsi); _visitables.get("iscsi").add(this.iscsi);} else { this.iscsi = null; _visitables.get("iscsi").remove(this.iscsi); } return (A) this;
  }
  public Boolean hasIscsi() {
    return this.iscsi != null;
  }
  public V1VolumeFluent.IscsiNested<A> withNewIscsi() {
    return new V1VolumeFluentImpl.IscsiNestedImpl();
  }
  public V1VolumeFluent.IscsiNested<A> withNewIscsiLike(V1ISCSIVolumeSource item) {
    return new V1VolumeFluentImpl.IscsiNestedImpl(item);
  }
  public V1VolumeFluent.IscsiNested<A> editIscsi() {
    return withNewIscsiLike(getIscsi());
  }
  public V1VolumeFluent.IscsiNested<A> editOrNewIscsi() {
    return withNewIscsiLike(getIscsi() != null ? getIscsi(): new V1ISCSIVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.IscsiNested<A> editOrNewIscsiLike(V1ISCSIVolumeSource item) {
    return withNewIscsiLike(getIscsi() != null ? getIscsi(): item);
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * This method has been deprecated, please use method buildNfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1NFSVolumeSource getNfs() {
    return this.nfs!=null ?this.nfs.build():null;
  }
  public V1NFSVolumeSource buildNfs() {
    return this.nfs!=null ?this.nfs.build():null;
  }
  public A withNfs(V1NFSVolumeSource nfs) {
    _visitables.get("nfs").remove(this.nfs);
    if (nfs!=null){ this.nfs= new V1NFSVolumeSourceBuilder(nfs); _visitables.get("nfs").add(this.nfs);} else { this.nfs = null; _visitables.get("nfs").remove(this.nfs); } return (A) this;
  }
  public Boolean hasNfs() {
    return this.nfs != null;
  }
  public V1VolumeFluent.NfsNested<A> withNewNfs() {
    return new V1VolumeFluentImpl.NfsNestedImpl();
  }
  public V1VolumeFluent.NfsNested<A> withNewNfsLike(V1NFSVolumeSource item) {
    return new V1VolumeFluentImpl.NfsNestedImpl(item);
  }
  public V1VolumeFluent.NfsNested<A> editNfs() {
    return withNewNfsLike(getNfs());
  }
  public V1VolumeFluent.NfsNested<A> editOrNewNfs() {
    return withNewNfsLike(getNfs() != null ? getNfs(): new V1NFSVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.NfsNested<A> editOrNewNfsLike(V1NFSVolumeSource item) {
    return withNewNfsLike(getNfs() != null ? getNfs(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPersistentVolumeClaim instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return this.persistentVolumeClaim!=null ?this.persistentVolumeClaim.build():null;
  }
  public V1PersistentVolumeClaimVolumeSource buildPersistentVolumeClaim() {
    return this.persistentVolumeClaim!=null ?this.persistentVolumeClaim.build():null;
  }
  public A withPersistentVolumeClaim(V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    _visitables.get("persistentVolumeClaim").remove(this.persistentVolumeClaim);
    if (persistentVolumeClaim!=null){ this.persistentVolumeClaim= new V1PersistentVolumeClaimVolumeSourceBuilder(persistentVolumeClaim); _visitables.get("persistentVolumeClaim").add(this.persistentVolumeClaim);} else { this.persistentVolumeClaim = null; _visitables.get("persistentVolumeClaim").remove(this.persistentVolumeClaim); } return (A) this;
  }
  public Boolean hasPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null;
  }
  public V1VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim() {
    return new V1VolumeFluentImpl.PersistentVolumeClaimNestedImpl();
  }
  public V1VolumeFluent.PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(V1PersistentVolumeClaimVolumeSource item) {
    return new V1VolumeFluentImpl.PersistentVolumeClaimNestedImpl(item);
  }
  public V1VolumeFluent.PersistentVolumeClaimNested<A> editPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim());
  }
  public V1VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim() != null ? getPersistentVolumeClaim(): new V1PersistentVolumeClaimVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(V1PersistentVolumeClaimVolumeSource item) {
    return withNewPersistentVolumeClaimLike(getPersistentVolumeClaim() != null ? getPersistentVolumeClaim(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPhotonPersistentDisk instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return this.photonPersistentDisk!=null ?this.photonPersistentDisk.build():null;
  }
  public V1PhotonPersistentDiskVolumeSource buildPhotonPersistentDisk() {
    return this.photonPersistentDisk!=null ?this.photonPersistentDisk.build():null;
  }
  public A withPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    _visitables.get("photonPersistentDisk").remove(this.photonPersistentDisk);
    if (photonPersistentDisk!=null){ this.photonPersistentDisk= new V1PhotonPersistentDiskVolumeSourceBuilder(photonPersistentDisk); _visitables.get("photonPersistentDisk").add(this.photonPersistentDisk);} else { this.photonPersistentDisk = null; _visitables.get("photonPersistentDisk").remove(this.photonPersistentDisk); } return (A) this;
  }
  public Boolean hasPhotonPersistentDisk() {
    return this.photonPersistentDisk != null;
  }
  public V1VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk() {
    return new V1VolumeFluentImpl.PhotonPersistentDiskNestedImpl();
  }
  public V1VolumeFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item) {
    return new V1VolumeFluentImpl.PhotonPersistentDiskNestedImpl(item);
  }
  public V1VolumeFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk());
  }
  public V1VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk() != null ? getPhotonPersistentDisk(): new V1PhotonPersistentDiskVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item) {
    return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk() != null ? getPhotonPersistentDisk(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildPortworxVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1PortworxVolumeSource getPortworxVolume() {
    return this.portworxVolume!=null ?this.portworxVolume.build():null;
  }
  public V1PortworxVolumeSource buildPortworxVolume() {
    return this.portworxVolume!=null ?this.portworxVolume.build():null;
  }
  public A withPortworxVolume(V1PortworxVolumeSource portworxVolume) {
    _visitables.get("portworxVolume").remove(this.portworxVolume);
    if (portworxVolume!=null){ this.portworxVolume= new V1PortworxVolumeSourceBuilder(portworxVolume); _visitables.get("portworxVolume").add(this.portworxVolume);} else { this.portworxVolume = null; _visitables.get("portworxVolume").remove(this.portworxVolume); } return (A) this;
  }
  public Boolean hasPortworxVolume() {
    return this.portworxVolume != null;
  }
  public V1VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolume() {
    return new V1VolumeFluentImpl.PortworxVolumeNestedImpl();
  }
  public V1VolumeFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(V1PortworxVolumeSource item) {
    return new V1VolumeFluentImpl.PortworxVolumeNestedImpl(item);
  }
  public V1VolumeFluent.PortworxVolumeNested<A> editPortworxVolume() {
    return withNewPortworxVolumeLike(getPortworxVolume());
  }
  public V1VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolume() {
    return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): new V1PortworxVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(V1PortworxVolumeSource item) {
    return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildProjected instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ProjectedVolumeSource getProjected() {
    return this.projected!=null ?this.projected.build():null;
  }
  public V1ProjectedVolumeSource buildProjected() {
    return this.projected!=null ?this.projected.build():null;
  }
  public A withProjected(V1ProjectedVolumeSource projected) {
    _visitables.get("projected").remove(this.projected);
    if (projected!=null){ this.projected= new V1ProjectedVolumeSourceBuilder(projected); _visitables.get("projected").add(this.projected);} else { this.projected = null; _visitables.get("projected").remove(this.projected); } return (A) this;
  }
  public Boolean hasProjected() {
    return this.projected != null;
  }
  public V1VolumeFluent.ProjectedNested<A> withNewProjected() {
    return new V1VolumeFluentImpl.ProjectedNestedImpl();
  }
  public V1VolumeFluent.ProjectedNested<A> withNewProjectedLike(V1ProjectedVolumeSource item) {
    return new V1VolumeFluentImpl.ProjectedNestedImpl(item);
  }
  public V1VolumeFluent.ProjectedNested<A> editProjected() {
    return withNewProjectedLike(getProjected());
  }
  public V1VolumeFluent.ProjectedNested<A> editOrNewProjected() {
    return withNewProjectedLike(getProjected() != null ? getProjected(): new V1ProjectedVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.ProjectedNested<A> editOrNewProjectedLike(V1ProjectedVolumeSource item) {
    return withNewProjectedLike(getProjected() != null ? getProjected(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildQuobyte instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1QuobyteVolumeSource getQuobyte() {
    return this.quobyte!=null ?this.quobyte.build():null;
  }
  public V1QuobyteVolumeSource buildQuobyte() {
    return this.quobyte!=null ?this.quobyte.build():null;
  }
  public A withQuobyte(V1QuobyteVolumeSource quobyte) {
    _visitables.get("quobyte").remove(this.quobyte);
    if (quobyte!=null){ this.quobyte= new V1QuobyteVolumeSourceBuilder(quobyte); _visitables.get("quobyte").add(this.quobyte);} else { this.quobyte = null; _visitables.get("quobyte").remove(this.quobyte); } return (A) this;
  }
  public Boolean hasQuobyte() {
    return this.quobyte != null;
  }
  public V1VolumeFluent.QuobyteNested<A> withNewQuobyte() {
    return new V1VolumeFluentImpl.QuobyteNestedImpl();
  }
  public V1VolumeFluent.QuobyteNested<A> withNewQuobyteLike(V1QuobyteVolumeSource item) {
    return new V1VolumeFluentImpl.QuobyteNestedImpl(item);
  }
  public V1VolumeFluent.QuobyteNested<A> editQuobyte() {
    return withNewQuobyteLike(getQuobyte());
  }
  public V1VolumeFluent.QuobyteNested<A> editOrNewQuobyte() {
    return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): new V1QuobyteVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.QuobyteNested<A> editOrNewQuobyteLike(V1QuobyteVolumeSource item) {
    return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildRbd instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RBDVolumeSource getRbd() {
    return this.rbd!=null ?this.rbd.build():null;
  }
  public V1RBDVolumeSource buildRbd() {
    return this.rbd!=null ?this.rbd.build():null;
  }
  public A withRbd(V1RBDVolumeSource rbd) {
    _visitables.get("rbd").remove(this.rbd);
    if (rbd!=null){ this.rbd= new V1RBDVolumeSourceBuilder(rbd); _visitables.get("rbd").add(this.rbd);} else { this.rbd = null; _visitables.get("rbd").remove(this.rbd); } return (A) this;
  }
  public Boolean hasRbd() {
    return this.rbd != null;
  }
  public V1VolumeFluent.RbdNested<A> withNewRbd() {
    return new V1VolumeFluentImpl.RbdNestedImpl();
  }
  public V1VolumeFluent.RbdNested<A> withNewRbdLike(V1RBDVolumeSource item) {
    return new V1VolumeFluentImpl.RbdNestedImpl(item);
  }
  public V1VolumeFluent.RbdNested<A> editRbd() {
    return withNewRbdLike(getRbd());
  }
  public V1VolumeFluent.RbdNested<A> editOrNewRbd() {
    return withNewRbdLike(getRbd() != null ? getRbd(): new V1RBDVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.RbdNested<A> editOrNewRbdLike(V1RBDVolumeSource item) {
    return withNewRbdLike(getRbd() != null ? getRbd(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ScaleIOVolumeSource getScaleIO() {
    return this.scaleIO!=null ?this.scaleIO.build():null;
  }
  public V1ScaleIOVolumeSource buildScaleIO() {
    return this.scaleIO!=null ?this.scaleIO.build():null;
  }
  public A withScaleIO(V1ScaleIOVolumeSource scaleIO) {
    _visitables.get("scaleIO").remove(this.scaleIO);
    if (scaleIO!=null){ this.scaleIO= new V1ScaleIOVolumeSourceBuilder(scaleIO); _visitables.get("scaleIO").add(this.scaleIO);} else { this.scaleIO = null; _visitables.get("scaleIO").remove(this.scaleIO); } return (A) this;
  }
  public Boolean hasScaleIO() {
    return this.scaleIO != null;
  }
  public V1VolumeFluent.ScaleIONested<A> withNewScaleIO() {
    return new V1VolumeFluentImpl.ScaleIONestedImpl();
  }
  public V1VolumeFluent.ScaleIONested<A> withNewScaleIOLike(V1ScaleIOVolumeSource item) {
    return new V1VolumeFluentImpl.ScaleIONestedImpl(item);
  }
  public V1VolumeFluent.ScaleIONested<A> editScaleIO() {
    return withNewScaleIOLike(getScaleIO());
  }
  public V1VolumeFluent.ScaleIONested<A> editOrNewScaleIO() {
    return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): new V1ScaleIOVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.ScaleIONested<A> editOrNewScaleIOLike(V1ScaleIOVolumeSource item) {
    return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSecret instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1SecretVolumeSource getSecret() {
    return this.secret!=null ?this.secret.build():null;
  }
  public V1SecretVolumeSource buildSecret() {
    return this.secret!=null ?this.secret.build():null;
  }
  public A withSecret(V1SecretVolumeSource secret) {
    _visitables.get("secret").remove(this.secret);
    if (secret!=null){ this.secret= new V1SecretVolumeSourceBuilder(secret); _visitables.get("secret").add(this.secret);} else { this.secret = null; _visitables.get("secret").remove(this.secret); } return (A) this;
  }
  public Boolean hasSecret() {
    return this.secret != null;
  }
  public V1VolumeFluent.SecretNested<A> withNewSecret() {
    return new V1VolumeFluentImpl.SecretNestedImpl();
  }
  public V1VolumeFluent.SecretNested<A> withNewSecretLike(V1SecretVolumeSource item) {
    return new V1VolumeFluentImpl.SecretNestedImpl(item);
  }
  public V1VolumeFluent.SecretNested<A> editSecret() {
    return withNewSecretLike(getSecret());
  }
  public V1VolumeFluent.SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(getSecret() != null ? getSecret(): new V1SecretVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.SecretNested<A> editOrNewSecretLike(V1SecretVolumeSource item) {
    return withNewSecretLike(getSecret() != null ? getSecret(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildStorageos instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StorageOSVolumeSource getStorageos() {
    return this.storageos!=null ?this.storageos.build():null;
  }
  public V1StorageOSVolumeSource buildStorageos() {
    return this.storageos!=null ?this.storageos.build():null;
  }
  public A withStorageos(V1StorageOSVolumeSource storageos) {
    _visitables.get("storageos").remove(this.storageos);
    if (storageos!=null){ this.storageos= new V1StorageOSVolumeSourceBuilder(storageos); _visitables.get("storageos").add(this.storageos);} else { this.storageos = null; _visitables.get("storageos").remove(this.storageos); } return (A) this;
  }
  public Boolean hasStorageos() {
    return this.storageos != null;
  }
  public V1VolumeFluent.StorageosNested<A> withNewStorageos() {
    return new V1VolumeFluentImpl.StorageosNestedImpl();
  }
  public V1VolumeFluent.StorageosNested<A> withNewStorageosLike(V1StorageOSVolumeSource item) {
    return new V1VolumeFluentImpl.StorageosNestedImpl(item);
  }
  public V1VolumeFluent.StorageosNested<A> editStorageos() {
    return withNewStorageosLike(getStorageos());
  }
  public V1VolumeFluent.StorageosNested<A> editOrNewStorageos() {
    return withNewStorageosLike(getStorageos() != null ? getStorageos(): new V1StorageOSVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.StorageosNested<A> editOrNewStorageosLike(V1StorageOSVolumeSource item) {
    return withNewStorageosLike(getStorageos() != null ? getStorageos(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildVsphereVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return this.vsphereVolume!=null ?this.vsphereVolume.build():null;
  }
  public V1VsphereVirtualDiskVolumeSource buildVsphereVolume() {
    return this.vsphereVolume!=null ?this.vsphereVolume.build():null;
  }
  public A withVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    _visitables.get("vsphereVolume").remove(this.vsphereVolume);
    if (vsphereVolume!=null){ this.vsphereVolume= new V1VsphereVirtualDiskVolumeSourceBuilder(vsphereVolume); _visitables.get("vsphereVolume").add(this.vsphereVolume);} else { this.vsphereVolume = null; _visitables.get("vsphereVolume").remove(this.vsphereVolume); } return (A) this;
  }
  public Boolean hasVsphereVolume() {
    return this.vsphereVolume != null;
  }
  public V1VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolume() {
    return new V1VolumeFluentImpl.VsphereVolumeNestedImpl();
  }
  public V1VolumeFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item) {
    return new V1VolumeFluentImpl.VsphereVolumeNestedImpl(item);
  }
  public V1VolumeFluent.VsphereVolumeNested<A> editVsphereVolume() {
    return withNewVsphereVolumeLike(getVsphereVolume());
  }
  public V1VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolume() {
    return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): new V1VsphereVirtualDiskVolumeSourceBuilder().build());
  }
  public V1VolumeFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item) {
    return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeFluentImpl that = (V1VolumeFluentImpl) o;
    if (awsElasticBlockStore != null ? !awsElasticBlockStore.equals(that.awsElasticBlockStore) :that.awsElasticBlockStore != null) return false;
    if (azureDisk != null ? !azureDisk.equals(that.azureDisk) :that.azureDisk != null) return false;
    if (azureFile != null ? !azureFile.equals(that.azureFile) :that.azureFile != null) return false;
    if (cephfs != null ? !cephfs.equals(that.cephfs) :that.cephfs != null) return false;
    if (cinder != null ? !cinder.equals(that.cinder) :that.cinder != null) return false;
    if (configMap != null ? !configMap.equals(that.configMap) :that.configMap != null) return false;
    if (csi != null ? !csi.equals(that.csi) :that.csi != null) return false;
    if (downwardAPI != null ? !downwardAPI.equals(that.downwardAPI) :that.downwardAPI != null) return false;
    if (emptyDir != null ? !emptyDir.equals(that.emptyDir) :that.emptyDir != null) return false;
    if (ephemeral != null ? !ephemeral.equals(that.ephemeral) :that.ephemeral != null) return false;
    if (fc != null ? !fc.equals(that.fc) :that.fc != null) return false;
    if (flexVolume != null ? !flexVolume.equals(that.flexVolume) :that.flexVolume != null) return false;
    if (flocker != null ? !flocker.equals(that.flocker) :that.flocker != null) return false;
    if (gcePersistentDisk != null ? !gcePersistentDisk.equals(that.gcePersistentDisk) :that.gcePersistentDisk != null) return false;
    if (gitRepo != null ? !gitRepo.equals(that.gitRepo) :that.gitRepo != null) return false;
    if (glusterfs != null ? !glusterfs.equals(that.glusterfs) :that.glusterfs != null) return false;
    if (hostPath != null ? !hostPath.equals(that.hostPath) :that.hostPath != null) return false;
    if (iscsi != null ? !iscsi.equals(that.iscsi) :that.iscsi != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (nfs != null ? !nfs.equals(that.nfs) :that.nfs != null) return false;
    if (persistentVolumeClaim != null ? !persistentVolumeClaim.equals(that.persistentVolumeClaim) :that.persistentVolumeClaim != null) return false;
    if (photonPersistentDisk != null ? !photonPersistentDisk.equals(that.photonPersistentDisk) :that.photonPersistentDisk != null) return false;
    if (portworxVolume != null ? !portworxVolume.equals(that.portworxVolume) :that.portworxVolume != null) return false;
    if (projected != null ? !projected.equals(that.projected) :that.projected != null) return false;
    if (quobyte != null ? !quobyte.equals(that.quobyte) :that.quobyte != null) return false;
    if (rbd != null ? !rbd.equals(that.rbd) :that.rbd != null) return false;
    if (scaleIO != null ? !scaleIO.equals(that.scaleIO) :that.scaleIO != null) return false;
    if (secret != null ? !secret.equals(that.secret) :that.secret != null) return false;
    if (storageos != null ? !storageos.equals(that.storageos) :that.storageos != null) return false;
    if (vsphereVolume != null ? !vsphereVolume.equals(that.vsphereVolume) :that.vsphereVolume != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(awsElasticBlockStore,  azureDisk,  azureFile,  cephfs,  cinder,  configMap,  csi,  downwardAPI,  emptyDir,  ephemeral,  fc,  flexVolume,  flocker,  gcePersistentDisk,  gitRepo,  glusterfs,  hostPath,  iscsi,  name,  nfs,  persistentVolumeClaim,  photonPersistentDisk,  portworxVolume,  projected,  quobyte,  rbd,  scaleIO,  secret,  storageos,  vsphereVolume,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (awsElasticBlockStore != null) { sb.append("awsElasticBlockStore:"); sb.append(awsElasticBlockStore + ","); }
    if (azureDisk != null) { sb.append("azureDisk:"); sb.append(azureDisk + ","); }
    if (azureFile != null) { sb.append("azureFile:"); sb.append(azureFile + ","); }
    if (cephfs != null) { sb.append("cephfs:"); sb.append(cephfs + ","); }
    if (cinder != null) { sb.append("cinder:"); sb.append(cinder + ","); }
    if (configMap != null) { sb.append("configMap:"); sb.append(configMap + ","); }
    if (csi != null) { sb.append("csi:"); sb.append(csi + ","); }
    if (downwardAPI != null) { sb.append("downwardAPI:"); sb.append(downwardAPI + ","); }
    if (emptyDir != null) { sb.append("emptyDir:"); sb.append(emptyDir + ","); }
    if (ephemeral != null) { sb.append("ephemeral:"); sb.append(ephemeral + ","); }
    if (fc != null) { sb.append("fc:"); sb.append(fc + ","); }
    if (flexVolume != null) { sb.append("flexVolume:"); sb.append(flexVolume + ","); }
    if (flocker != null) { sb.append("flocker:"); sb.append(flocker + ","); }
    if (gcePersistentDisk != null) { sb.append("gcePersistentDisk:"); sb.append(gcePersistentDisk + ","); }
    if (gitRepo != null) { sb.append("gitRepo:"); sb.append(gitRepo + ","); }
    if (glusterfs != null) { sb.append("glusterfs:"); sb.append(glusterfs + ","); }
    if (hostPath != null) { sb.append("hostPath:"); sb.append(hostPath + ","); }
    if (iscsi != null) { sb.append("iscsi:"); sb.append(iscsi + ","); }
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (nfs != null) { sb.append("nfs:"); sb.append(nfs + ","); }
    if (persistentVolumeClaim != null) { sb.append("persistentVolumeClaim:"); sb.append(persistentVolumeClaim + ","); }
    if (photonPersistentDisk != null) { sb.append("photonPersistentDisk:"); sb.append(photonPersistentDisk + ","); }
    if (portworxVolume != null) { sb.append("portworxVolume:"); sb.append(portworxVolume + ","); }
    if (projected != null) { sb.append("projected:"); sb.append(projected + ","); }
    if (quobyte != null) { sb.append("quobyte:"); sb.append(quobyte + ","); }
    if (rbd != null) { sb.append("rbd:"); sb.append(rbd + ","); }
    if (scaleIO != null) { sb.append("scaleIO:"); sb.append(scaleIO + ","); }
    if (secret != null) { sb.append("secret:"); sb.append(secret + ","); }
    if (storageos != null) { sb.append("storageos:"); sb.append(storageos + ","); }
    if (vsphereVolume != null) { sb.append("vsphereVolume:"); sb.append(vsphereVolume); }
    sb.append("}");
    return sb.toString();
  }
  class AwsElasticBlockStoreNestedImpl<N> extends V1AWSElasticBlockStoreVolumeSourceFluentImpl<V1VolumeFluent.AwsElasticBlockStoreNested<N>> implements V1VolumeFluent.AwsElasticBlockStoreNested<N>,Nested<N>{
    AwsElasticBlockStoreNestedImpl(V1AWSElasticBlockStoreVolumeSource item) {
      this.builder = new V1AWSElasticBlockStoreVolumeSourceBuilder(this, item);
    }
    AwsElasticBlockStoreNestedImpl() {
      this.builder = new V1AWSElasticBlockStoreVolumeSourceBuilder(this);
    }
    V1AWSElasticBlockStoreVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withAwsElasticBlockStore(builder.build());
    }
    public N endAwsElasticBlockStore() {
      return and();
    }
    
  }
  class AzureDiskNestedImpl<N> extends V1AzureDiskVolumeSourceFluentImpl<V1VolumeFluent.AzureDiskNested<N>> implements V1VolumeFluent.AzureDiskNested<N>,Nested<N>{
    AzureDiskNestedImpl(V1AzureDiskVolumeSource item) {
      this.builder = new V1AzureDiskVolumeSourceBuilder(this, item);
    }
    AzureDiskNestedImpl() {
      this.builder = new V1AzureDiskVolumeSourceBuilder(this);
    }
    V1AzureDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withAzureDisk(builder.build());
    }
    public N endAzureDisk() {
      return and();
    }
    
  }
  class AzureFileNestedImpl<N> extends V1AzureFileVolumeSourceFluentImpl<V1VolumeFluent.AzureFileNested<N>> implements V1VolumeFluent.AzureFileNested<N>,Nested<N>{
    AzureFileNestedImpl(V1AzureFileVolumeSource item) {
      this.builder = new V1AzureFileVolumeSourceBuilder(this, item);
    }
    AzureFileNestedImpl() {
      this.builder = new V1AzureFileVolumeSourceBuilder(this);
    }
    V1AzureFileVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withAzureFile(builder.build());
    }
    public N endAzureFile() {
      return and();
    }
    
  }
  class CephfsNestedImpl<N> extends V1CephFSVolumeSourceFluentImpl<V1VolumeFluent.CephfsNested<N>> implements V1VolumeFluent.CephfsNested<N>,Nested<N>{
    CephfsNestedImpl(V1CephFSVolumeSource item) {
      this.builder = new V1CephFSVolumeSourceBuilder(this, item);
    }
    CephfsNestedImpl() {
      this.builder = new V1CephFSVolumeSourceBuilder(this);
    }
    V1CephFSVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withCephfs(builder.build());
    }
    public N endCephfs() {
      return and();
    }
    
  }
  class CinderNestedImpl<N> extends V1CinderVolumeSourceFluentImpl<V1VolumeFluent.CinderNested<N>> implements V1VolumeFluent.CinderNested<N>,Nested<N>{
    CinderNestedImpl(V1CinderVolumeSource item) {
      this.builder = new V1CinderVolumeSourceBuilder(this, item);
    }
    CinderNestedImpl() {
      this.builder = new V1CinderVolumeSourceBuilder(this);
    }
    V1CinderVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withCinder(builder.build());
    }
    public N endCinder() {
      return and();
    }
    
  }
  class ConfigMapNestedImpl<N> extends V1ConfigMapVolumeSourceFluentImpl<V1VolumeFluent.ConfigMapNested<N>> implements V1VolumeFluent.ConfigMapNested<N>,Nested<N>{
    ConfigMapNestedImpl(V1ConfigMapVolumeSource item) {
      this.builder = new V1ConfigMapVolumeSourceBuilder(this, item);
    }
    ConfigMapNestedImpl() {
      this.builder = new V1ConfigMapVolumeSourceBuilder(this);
    }
    V1ConfigMapVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withConfigMap(builder.build());
    }
    public N endConfigMap() {
      return and();
    }
    
  }
  class CsiNestedImpl<N> extends V1CSIVolumeSourceFluentImpl<V1VolumeFluent.CsiNested<N>> implements V1VolumeFluent.CsiNested<N>,Nested<N>{
    CsiNestedImpl(V1CSIVolumeSource item) {
      this.builder = new V1CSIVolumeSourceBuilder(this, item);
    }
    CsiNestedImpl() {
      this.builder = new V1CSIVolumeSourceBuilder(this);
    }
    V1CSIVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withCsi(builder.build());
    }
    public N endCsi() {
      return and();
    }
    
  }
  class DownwardAPINestedImpl<N> extends V1DownwardAPIVolumeSourceFluentImpl<V1VolumeFluent.DownwardAPINested<N>> implements V1VolumeFluent.DownwardAPINested<N>,Nested<N>{
    DownwardAPINestedImpl(V1DownwardAPIVolumeSource item) {
      this.builder = new V1DownwardAPIVolumeSourceBuilder(this, item);
    }
    DownwardAPINestedImpl() {
      this.builder = new V1DownwardAPIVolumeSourceBuilder(this);
    }
    V1DownwardAPIVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withDownwardAPI(builder.build());
    }
    public N endDownwardAPI() {
      return and();
    }
    
  }
  class EmptyDirNestedImpl<N> extends V1EmptyDirVolumeSourceFluentImpl<V1VolumeFluent.EmptyDirNested<N>> implements V1VolumeFluent.EmptyDirNested<N>,Nested<N>{
    EmptyDirNestedImpl(V1EmptyDirVolumeSource item) {
      this.builder = new V1EmptyDirVolumeSourceBuilder(this, item);
    }
    EmptyDirNestedImpl() {
      this.builder = new V1EmptyDirVolumeSourceBuilder(this);
    }
    V1EmptyDirVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withEmptyDir(builder.build());
    }
    public N endEmptyDir() {
      return and();
    }
    
  }
  class EphemeralNestedImpl<N> extends V1EphemeralVolumeSourceFluentImpl<V1VolumeFluent.EphemeralNested<N>> implements V1VolumeFluent.EphemeralNested<N>,Nested<N>{
    EphemeralNestedImpl(V1EphemeralVolumeSource item) {
      this.builder = new V1EphemeralVolumeSourceBuilder(this, item);
    }
    EphemeralNestedImpl() {
      this.builder = new V1EphemeralVolumeSourceBuilder(this);
    }
    V1EphemeralVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withEphemeral(builder.build());
    }
    public N endEphemeral() {
      return and();
    }
    
  }
  class FcNestedImpl<N> extends V1FCVolumeSourceFluentImpl<V1VolumeFluent.FcNested<N>> implements V1VolumeFluent.FcNested<N>,Nested<N>{
    FcNestedImpl(V1FCVolumeSource item) {
      this.builder = new V1FCVolumeSourceBuilder(this, item);
    }
    FcNestedImpl() {
      this.builder = new V1FCVolumeSourceBuilder(this);
    }
    V1FCVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withFc(builder.build());
    }
    public N endFc() {
      return and();
    }
    
  }
  class FlexVolumeNestedImpl<N> extends V1FlexVolumeSourceFluentImpl<V1VolumeFluent.FlexVolumeNested<N>> implements V1VolumeFluent.FlexVolumeNested<N>,Nested<N>{
    FlexVolumeNestedImpl(V1FlexVolumeSource item) {
      this.builder = new V1FlexVolumeSourceBuilder(this, item);
    }
    FlexVolumeNestedImpl() {
      this.builder = new V1FlexVolumeSourceBuilder(this);
    }
    V1FlexVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withFlexVolume(builder.build());
    }
    public N endFlexVolume() {
      return and();
    }
    
  }
  class FlockerNestedImpl<N> extends V1FlockerVolumeSourceFluentImpl<V1VolumeFluent.FlockerNested<N>> implements V1VolumeFluent.FlockerNested<N>,Nested<N>{
    FlockerNestedImpl(V1FlockerVolumeSource item) {
      this.builder = new V1FlockerVolumeSourceBuilder(this, item);
    }
    FlockerNestedImpl() {
      this.builder = new V1FlockerVolumeSourceBuilder(this);
    }
    V1FlockerVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withFlocker(builder.build());
    }
    public N endFlocker() {
      return and();
    }
    
  }
  class GcePersistentDiskNestedImpl<N> extends V1GCEPersistentDiskVolumeSourceFluentImpl<V1VolumeFluent.GcePersistentDiskNested<N>> implements V1VolumeFluent.GcePersistentDiskNested<N>,Nested<N>{
    GcePersistentDiskNestedImpl(V1GCEPersistentDiskVolumeSource item) {
      this.builder = new V1GCEPersistentDiskVolumeSourceBuilder(this, item);
    }
    GcePersistentDiskNestedImpl() {
      this.builder = new V1GCEPersistentDiskVolumeSourceBuilder(this);
    }
    V1GCEPersistentDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withGcePersistentDisk(builder.build());
    }
    public N endGcePersistentDisk() {
      return and();
    }
    
  }
  class GitRepoNestedImpl<N> extends V1GitRepoVolumeSourceFluentImpl<V1VolumeFluent.GitRepoNested<N>> implements V1VolumeFluent.GitRepoNested<N>,Nested<N>{
    GitRepoNestedImpl(V1GitRepoVolumeSource item) {
      this.builder = new V1GitRepoVolumeSourceBuilder(this, item);
    }
    GitRepoNestedImpl() {
      this.builder = new V1GitRepoVolumeSourceBuilder(this);
    }
    V1GitRepoVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withGitRepo(builder.build());
    }
    public N endGitRepo() {
      return and();
    }
    
  }
  class GlusterfsNestedImpl<N> extends V1GlusterfsVolumeSourceFluentImpl<V1VolumeFluent.GlusterfsNested<N>> implements V1VolumeFluent.GlusterfsNested<N>,Nested<N>{
    GlusterfsNestedImpl(V1GlusterfsVolumeSource item) {
      this.builder = new V1GlusterfsVolumeSourceBuilder(this, item);
    }
    GlusterfsNestedImpl() {
      this.builder = new V1GlusterfsVolumeSourceBuilder(this);
    }
    V1GlusterfsVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withGlusterfs(builder.build());
    }
    public N endGlusterfs() {
      return and();
    }
    
  }
  class HostPathNestedImpl<N> extends V1HostPathVolumeSourceFluentImpl<V1VolumeFluent.HostPathNested<N>> implements V1VolumeFluent.HostPathNested<N>,Nested<N>{
    HostPathNestedImpl(V1HostPathVolumeSource item) {
      this.builder = new V1HostPathVolumeSourceBuilder(this, item);
    }
    HostPathNestedImpl() {
      this.builder = new V1HostPathVolumeSourceBuilder(this);
    }
    V1HostPathVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withHostPath(builder.build());
    }
    public N endHostPath() {
      return and();
    }
    
  }
  class IscsiNestedImpl<N> extends V1ISCSIVolumeSourceFluentImpl<V1VolumeFluent.IscsiNested<N>> implements V1VolumeFluent.IscsiNested<N>,Nested<N>{
    IscsiNestedImpl(V1ISCSIVolumeSource item) {
      this.builder = new V1ISCSIVolumeSourceBuilder(this, item);
    }
    IscsiNestedImpl() {
      this.builder = new V1ISCSIVolumeSourceBuilder(this);
    }
    V1ISCSIVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withIscsi(builder.build());
    }
    public N endIscsi() {
      return and();
    }
    
  }
  class NfsNestedImpl<N> extends V1NFSVolumeSourceFluentImpl<V1VolumeFluent.NfsNested<N>> implements V1VolumeFluent.NfsNested<N>,Nested<N>{
    NfsNestedImpl(V1NFSVolumeSource item) {
      this.builder = new V1NFSVolumeSourceBuilder(this, item);
    }
    NfsNestedImpl() {
      this.builder = new V1NFSVolumeSourceBuilder(this);
    }
    V1NFSVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withNfs(builder.build());
    }
    public N endNfs() {
      return and();
    }
    
  }
  class PersistentVolumeClaimNestedImpl<N> extends V1PersistentVolumeClaimVolumeSourceFluentImpl<V1VolumeFluent.PersistentVolumeClaimNested<N>> implements V1VolumeFluent.PersistentVolumeClaimNested<N>,Nested<N>{
    PersistentVolumeClaimNestedImpl(V1PersistentVolumeClaimVolumeSource item) {
      this.builder = new V1PersistentVolumeClaimVolumeSourceBuilder(this, item);
    }
    PersistentVolumeClaimNestedImpl() {
      this.builder = new V1PersistentVolumeClaimVolumeSourceBuilder(this);
    }
    V1PersistentVolumeClaimVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withPersistentVolumeClaim(builder.build());
    }
    public N endPersistentVolumeClaim() {
      return and();
    }
    
  }
  class PhotonPersistentDiskNestedImpl<N> extends V1PhotonPersistentDiskVolumeSourceFluentImpl<V1VolumeFluent.PhotonPersistentDiskNested<N>> implements V1VolumeFluent.PhotonPersistentDiskNested<N>,Nested<N>{
    PhotonPersistentDiskNestedImpl(V1PhotonPersistentDiskVolumeSource item) {
      this.builder = new V1PhotonPersistentDiskVolumeSourceBuilder(this, item);
    }
    PhotonPersistentDiskNestedImpl() {
      this.builder = new V1PhotonPersistentDiskVolumeSourceBuilder(this);
    }
    V1PhotonPersistentDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withPhotonPersistentDisk(builder.build());
    }
    public N endPhotonPersistentDisk() {
      return and();
    }
    
  }
  class PortworxVolumeNestedImpl<N> extends V1PortworxVolumeSourceFluentImpl<V1VolumeFluent.PortworxVolumeNested<N>> implements V1VolumeFluent.PortworxVolumeNested<N>,Nested<N>{
    PortworxVolumeNestedImpl(V1PortworxVolumeSource item) {
      this.builder = new V1PortworxVolumeSourceBuilder(this, item);
    }
    PortworxVolumeNestedImpl() {
      this.builder = new V1PortworxVolumeSourceBuilder(this);
    }
    V1PortworxVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withPortworxVolume(builder.build());
    }
    public N endPortworxVolume() {
      return and();
    }
    
  }
  class ProjectedNestedImpl<N> extends V1ProjectedVolumeSourceFluentImpl<V1VolumeFluent.ProjectedNested<N>> implements V1VolumeFluent.ProjectedNested<N>,Nested<N>{
    ProjectedNestedImpl(V1ProjectedVolumeSource item) {
      this.builder = new V1ProjectedVolumeSourceBuilder(this, item);
    }
    ProjectedNestedImpl() {
      this.builder = new V1ProjectedVolumeSourceBuilder(this);
    }
    V1ProjectedVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withProjected(builder.build());
    }
    public N endProjected() {
      return and();
    }
    
  }
  class QuobyteNestedImpl<N> extends V1QuobyteVolumeSourceFluentImpl<V1VolumeFluent.QuobyteNested<N>> implements V1VolumeFluent.QuobyteNested<N>,Nested<N>{
    QuobyteNestedImpl(V1QuobyteVolumeSource item) {
      this.builder = new V1QuobyteVolumeSourceBuilder(this, item);
    }
    QuobyteNestedImpl() {
      this.builder = new V1QuobyteVolumeSourceBuilder(this);
    }
    V1QuobyteVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withQuobyte(builder.build());
    }
    public N endQuobyte() {
      return and();
    }
    
  }
  class RbdNestedImpl<N> extends V1RBDVolumeSourceFluentImpl<V1VolumeFluent.RbdNested<N>> implements V1VolumeFluent.RbdNested<N>,Nested<N>{
    RbdNestedImpl(V1RBDVolumeSource item) {
      this.builder = new V1RBDVolumeSourceBuilder(this, item);
    }
    RbdNestedImpl() {
      this.builder = new V1RBDVolumeSourceBuilder(this);
    }
    V1RBDVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withRbd(builder.build());
    }
    public N endRbd() {
      return and();
    }
    
  }
  class ScaleIONestedImpl<N> extends V1ScaleIOVolumeSourceFluentImpl<V1VolumeFluent.ScaleIONested<N>> implements V1VolumeFluent.ScaleIONested<N>,Nested<N>{
    ScaleIONestedImpl(V1ScaleIOVolumeSource item) {
      this.builder = new V1ScaleIOVolumeSourceBuilder(this, item);
    }
    ScaleIONestedImpl() {
      this.builder = new V1ScaleIOVolumeSourceBuilder(this);
    }
    V1ScaleIOVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withScaleIO(builder.build());
    }
    public N endScaleIO() {
      return and();
    }
    
  }
  class SecretNestedImpl<N> extends V1SecretVolumeSourceFluentImpl<V1VolumeFluent.SecretNested<N>> implements V1VolumeFluent.SecretNested<N>,Nested<N>{
    SecretNestedImpl(V1SecretVolumeSource item) {
      this.builder = new V1SecretVolumeSourceBuilder(this, item);
    }
    SecretNestedImpl() {
      this.builder = new V1SecretVolumeSourceBuilder(this);
    }
    V1SecretVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withSecret(builder.build());
    }
    public N endSecret() {
      return and();
    }
    
  }
  class StorageosNestedImpl<N> extends V1StorageOSVolumeSourceFluentImpl<V1VolumeFluent.StorageosNested<N>> implements V1VolumeFluent.StorageosNested<N>,Nested<N>{
    StorageosNestedImpl(V1StorageOSVolumeSource item) {
      this.builder = new V1StorageOSVolumeSourceBuilder(this, item);
    }
    StorageosNestedImpl() {
      this.builder = new V1StorageOSVolumeSourceBuilder(this);
    }
    V1StorageOSVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withStorageos(builder.build());
    }
    public N endStorageos() {
      return and();
    }
    
  }
  class VsphereVolumeNestedImpl<N> extends V1VsphereVirtualDiskVolumeSourceFluentImpl<V1VolumeFluent.VsphereVolumeNested<N>> implements V1VolumeFluent.VsphereVolumeNested<N>,Nested<N>{
    VsphereVolumeNestedImpl(V1VsphereVirtualDiskVolumeSource item) {
      this.builder = new V1VsphereVirtualDiskVolumeSourceBuilder(this, item);
    }
    VsphereVolumeNestedImpl() {
      this.builder = new V1VsphereVirtualDiskVolumeSourceBuilder(this);
    }
    V1VsphereVirtualDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1VolumeFluentImpl.this.withVsphereVolume(builder.build());
    }
    public N endVsphereVolume() {
      return and();
    }
    
  }
  
}