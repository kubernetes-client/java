package io.kubernetes.client.openapi.models;

import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1VolumeFluent<A extends V1VolumeFluent<A>> extends BaseFluent<A>{
  public V1VolumeFluent() {
  }
  
  public V1VolumeFluent(V1Volume instance) {
    this.copyInstance(instance);
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
  
  protected void copyInstance(V1Volume instance) {
    instance = (instance != null ? instance : new V1Volume());
    if (instance != null) {
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
  }
  
  public V1AWSElasticBlockStoreVolumeSource buildAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null ? this.awsElasticBlockStore.build() : null;
  }
  
  public A withAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this._visitables.remove("awsElasticBlockStore");
    if (awsElasticBlockStore != null) {
        this.awsElasticBlockStore = new V1AWSElasticBlockStoreVolumeSourceBuilder(awsElasticBlockStore);
        this._visitables.get("awsElasticBlockStore").add(this.awsElasticBlockStore);
    } else {
        this.awsElasticBlockStore = null;
        this._visitables.get("awsElasticBlockStore").remove(this.awsElasticBlockStore);
    }
    return (A) this;
  }
  
  public boolean hasAwsElasticBlockStore() {
    return this.awsElasticBlockStore != null;
  }
  
  public AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore() {
    return new AwsElasticBlockStoreNested(null);
  }
  
  public AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item) {
    return new AwsElasticBlockStoreNested(item);
  }
  
  public AwsElasticBlockStoreNested<A> editAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(java.util.Optional.ofNullable(buildAwsElasticBlockStore()).orElse(null));
  }
  
  public AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(java.util.Optional.ofNullable(buildAwsElasticBlockStore()).orElse(new V1AWSElasticBlockStoreVolumeSourceBuilder().build()));
  }
  
  public AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item) {
    return withNewAwsElasticBlockStoreLike(java.util.Optional.ofNullable(buildAwsElasticBlockStore()).orElse(item));
  }
  
  public V1AzureDiskVolumeSource buildAzureDisk() {
    return this.azureDisk != null ? this.azureDisk.build() : null;
  }
  
  public A withAzureDisk(V1AzureDiskVolumeSource azureDisk) {
    this._visitables.remove("azureDisk");
    if (azureDisk != null) {
        this.azureDisk = new V1AzureDiskVolumeSourceBuilder(azureDisk);
        this._visitables.get("azureDisk").add(this.azureDisk);
    } else {
        this.azureDisk = null;
        this._visitables.get("azureDisk").remove(this.azureDisk);
    }
    return (A) this;
  }
  
  public boolean hasAzureDisk() {
    return this.azureDisk != null;
  }
  
  public AzureDiskNested<A> withNewAzureDisk() {
    return new AzureDiskNested(null);
  }
  
  public AzureDiskNested<A> withNewAzureDiskLike(V1AzureDiskVolumeSource item) {
    return new AzureDiskNested(item);
  }
  
  public AzureDiskNested<A> editAzureDisk() {
    return withNewAzureDiskLike(java.util.Optional.ofNullable(buildAzureDisk()).orElse(null));
  }
  
  public AzureDiskNested<A> editOrNewAzureDisk() {
    return withNewAzureDiskLike(java.util.Optional.ofNullable(buildAzureDisk()).orElse(new V1AzureDiskVolumeSourceBuilder().build()));
  }
  
  public AzureDiskNested<A> editOrNewAzureDiskLike(V1AzureDiskVolumeSource item) {
    return withNewAzureDiskLike(java.util.Optional.ofNullable(buildAzureDisk()).orElse(item));
  }
  
  public V1AzureFileVolumeSource buildAzureFile() {
    return this.azureFile != null ? this.azureFile.build() : null;
  }
  
  public A withAzureFile(V1AzureFileVolumeSource azureFile) {
    this._visitables.remove("azureFile");
    if (azureFile != null) {
        this.azureFile = new V1AzureFileVolumeSourceBuilder(azureFile);
        this._visitables.get("azureFile").add(this.azureFile);
    } else {
        this.azureFile = null;
        this._visitables.get("azureFile").remove(this.azureFile);
    }
    return (A) this;
  }
  
  public boolean hasAzureFile() {
    return this.azureFile != null;
  }
  
  public AzureFileNested<A> withNewAzureFile() {
    return new AzureFileNested(null);
  }
  
  public AzureFileNested<A> withNewAzureFileLike(V1AzureFileVolumeSource item) {
    return new AzureFileNested(item);
  }
  
  public AzureFileNested<A> editAzureFile() {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(null));
  }
  
  public AzureFileNested<A> editOrNewAzureFile() {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(new V1AzureFileVolumeSourceBuilder().build()));
  }
  
  public AzureFileNested<A> editOrNewAzureFileLike(V1AzureFileVolumeSource item) {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(item));
  }
  
  public V1CephFSVolumeSource buildCephfs() {
    return this.cephfs != null ? this.cephfs.build() : null;
  }
  
  public A withCephfs(V1CephFSVolumeSource cephfs) {
    this._visitables.remove("cephfs");
    if (cephfs != null) {
        this.cephfs = new V1CephFSVolumeSourceBuilder(cephfs);
        this._visitables.get("cephfs").add(this.cephfs);
    } else {
        this.cephfs = null;
        this._visitables.get("cephfs").remove(this.cephfs);
    }
    return (A) this;
  }
  
  public boolean hasCephfs() {
    return this.cephfs != null;
  }
  
  public CephfsNested<A> withNewCephfs() {
    return new CephfsNested(null);
  }
  
  public CephfsNested<A> withNewCephfsLike(V1CephFSVolumeSource item) {
    return new CephfsNested(item);
  }
  
  public CephfsNested<A> editCephfs() {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(null));
  }
  
  public CephfsNested<A> editOrNewCephfs() {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(new V1CephFSVolumeSourceBuilder().build()));
  }
  
  public CephfsNested<A> editOrNewCephfsLike(V1CephFSVolumeSource item) {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(item));
  }
  
  public V1CinderVolumeSource buildCinder() {
    return this.cinder != null ? this.cinder.build() : null;
  }
  
  public A withCinder(V1CinderVolumeSource cinder) {
    this._visitables.remove("cinder");
    if (cinder != null) {
        this.cinder = new V1CinderVolumeSourceBuilder(cinder);
        this._visitables.get("cinder").add(this.cinder);
    } else {
        this.cinder = null;
        this._visitables.get("cinder").remove(this.cinder);
    }
    return (A) this;
  }
  
  public boolean hasCinder() {
    return this.cinder != null;
  }
  
  public CinderNested<A> withNewCinder() {
    return new CinderNested(null);
  }
  
  public CinderNested<A> withNewCinderLike(V1CinderVolumeSource item) {
    return new CinderNested(item);
  }
  
  public CinderNested<A> editCinder() {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(null));
  }
  
  public CinderNested<A> editOrNewCinder() {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(new V1CinderVolumeSourceBuilder().build()));
  }
  
  public CinderNested<A> editOrNewCinderLike(V1CinderVolumeSource item) {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(item));
  }
  
  public V1ConfigMapVolumeSource buildConfigMap() {
    return this.configMap != null ? this.configMap.build() : null;
  }
  
  public A withConfigMap(V1ConfigMapVolumeSource configMap) {
    this._visitables.remove("configMap");
    if (configMap != null) {
        this.configMap = new V1ConfigMapVolumeSourceBuilder(configMap);
        this._visitables.get("configMap").add(this.configMap);
    } else {
        this.configMap = null;
        this._visitables.get("configMap").remove(this.configMap);
    }
    return (A) this;
  }
  
  public boolean hasConfigMap() {
    return this.configMap != null;
  }
  
  public ConfigMapNested<A> withNewConfigMap() {
    return new ConfigMapNested(null);
  }
  
  public ConfigMapNested<A> withNewConfigMapLike(V1ConfigMapVolumeSource item) {
    return new ConfigMapNested(item);
  }
  
  public ConfigMapNested<A> editConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(null));
  }
  
  public ConfigMapNested<A> editOrNewConfigMap() {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(new V1ConfigMapVolumeSourceBuilder().build()));
  }
  
  public ConfigMapNested<A> editOrNewConfigMapLike(V1ConfigMapVolumeSource item) {
    return withNewConfigMapLike(java.util.Optional.ofNullable(buildConfigMap()).orElse(item));
  }
  
  public V1CSIVolumeSource buildCsi() {
    return this.csi != null ? this.csi.build() : null;
  }
  
  public A withCsi(V1CSIVolumeSource csi) {
    this._visitables.remove("csi");
    if (csi != null) {
        this.csi = new V1CSIVolumeSourceBuilder(csi);
        this._visitables.get("csi").add(this.csi);
    } else {
        this.csi = null;
        this._visitables.get("csi").remove(this.csi);
    }
    return (A) this;
  }
  
  public boolean hasCsi() {
    return this.csi != null;
  }
  
  public CsiNested<A> withNewCsi() {
    return new CsiNested(null);
  }
  
  public CsiNested<A> withNewCsiLike(V1CSIVolumeSource item) {
    return new CsiNested(item);
  }
  
  public CsiNested<A> editCsi() {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(null));
  }
  
  public CsiNested<A> editOrNewCsi() {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(new V1CSIVolumeSourceBuilder().build()));
  }
  
  public CsiNested<A> editOrNewCsiLike(V1CSIVolumeSource item) {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(item));
  }
  
  public V1DownwardAPIVolumeSource buildDownwardAPI() {
    return this.downwardAPI != null ? this.downwardAPI.build() : null;
  }
  
  public A withDownwardAPI(V1DownwardAPIVolumeSource downwardAPI) {
    this._visitables.remove("downwardAPI");
    if (downwardAPI != null) {
        this.downwardAPI = new V1DownwardAPIVolumeSourceBuilder(downwardAPI);
        this._visitables.get("downwardAPI").add(this.downwardAPI);
    } else {
        this.downwardAPI = null;
        this._visitables.get("downwardAPI").remove(this.downwardAPI);
    }
    return (A) this;
  }
  
  public boolean hasDownwardAPI() {
    return this.downwardAPI != null;
  }
  
  public DownwardAPINested<A> withNewDownwardAPI() {
    return new DownwardAPINested(null);
  }
  
  public DownwardAPINested<A> withNewDownwardAPILike(V1DownwardAPIVolumeSource item) {
    return new DownwardAPINested(item);
  }
  
  public DownwardAPINested<A> editDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(null));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPI() {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(new V1DownwardAPIVolumeSourceBuilder().build()));
  }
  
  public DownwardAPINested<A> editOrNewDownwardAPILike(V1DownwardAPIVolumeSource item) {
    return withNewDownwardAPILike(java.util.Optional.ofNullable(buildDownwardAPI()).orElse(item));
  }
  
  public V1EmptyDirVolumeSource buildEmptyDir() {
    return this.emptyDir != null ? this.emptyDir.build() : null;
  }
  
  public A withEmptyDir(V1EmptyDirVolumeSource emptyDir) {
    this._visitables.remove("emptyDir");
    if (emptyDir != null) {
        this.emptyDir = new V1EmptyDirVolumeSourceBuilder(emptyDir);
        this._visitables.get("emptyDir").add(this.emptyDir);
    } else {
        this.emptyDir = null;
        this._visitables.get("emptyDir").remove(this.emptyDir);
    }
    return (A) this;
  }
  
  public boolean hasEmptyDir() {
    return this.emptyDir != null;
  }
  
  public EmptyDirNested<A> withNewEmptyDir() {
    return new EmptyDirNested(null);
  }
  
  public EmptyDirNested<A> withNewEmptyDirLike(V1EmptyDirVolumeSource item) {
    return new EmptyDirNested(item);
  }
  
  public EmptyDirNested<A> editEmptyDir() {
    return withNewEmptyDirLike(java.util.Optional.ofNullable(buildEmptyDir()).orElse(null));
  }
  
  public EmptyDirNested<A> editOrNewEmptyDir() {
    return withNewEmptyDirLike(java.util.Optional.ofNullable(buildEmptyDir()).orElse(new V1EmptyDirVolumeSourceBuilder().build()));
  }
  
  public EmptyDirNested<A> editOrNewEmptyDirLike(V1EmptyDirVolumeSource item) {
    return withNewEmptyDirLike(java.util.Optional.ofNullable(buildEmptyDir()).orElse(item));
  }
  
  public V1EphemeralVolumeSource buildEphemeral() {
    return this.ephemeral != null ? this.ephemeral.build() : null;
  }
  
  public A withEphemeral(V1EphemeralVolumeSource ephemeral) {
    this._visitables.remove("ephemeral");
    if (ephemeral != null) {
        this.ephemeral = new V1EphemeralVolumeSourceBuilder(ephemeral);
        this._visitables.get("ephemeral").add(this.ephemeral);
    } else {
        this.ephemeral = null;
        this._visitables.get("ephemeral").remove(this.ephemeral);
    }
    return (A) this;
  }
  
  public boolean hasEphemeral() {
    return this.ephemeral != null;
  }
  
  public EphemeralNested<A> withNewEphemeral() {
    return new EphemeralNested(null);
  }
  
  public EphemeralNested<A> withNewEphemeralLike(V1EphemeralVolumeSource item) {
    return new EphemeralNested(item);
  }
  
  public EphemeralNested<A> editEphemeral() {
    return withNewEphemeralLike(java.util.Optional.ofNullable(buildEphemeral()).orElse(null));
  }
  
  public EphemeralNested<A> editOrNewEphemeral() {
    return withNewEphemeralLike(java.util.Optional.ofNullable(buildEphemeral()).orElse(new V1EphemeralVolumeSourceBuilder().build()));
  }
  
  public EphemeralNested<A> editOrNewEphemeralLike(V1EphemeralVolumeSource item) {
    return withNewEphemeralLike(java.util.Optional.ofNullable(buildEphemeral()).orElse(item));
  }
  
  public V1FCVolumeSource buildFc() {
    return this.fc != null ? this.fc.build() : null;
  }
  
  public A withFc(V1FCVolumeSource fc) {
    this._visitables.remove("fc");
    if (fc != null) {
        this.fc = new V1FCVolumeSourceBuilder(fc);
        this._visitables.get("fc").add(this.fc);
    } else {
        this.fc = null;
        this._visitables.get("fc").remove(this.fc);
    }
    return (A) this;
  }
  
  public boolean hasFc() {
    return this.fc != null;
  }
  
  public FcNested<A> withNewFc() {
    return new FcNested(null);
  }
  
  public FcNested<A> withNewFcLike(V1FCVolumeSource item) {
    return new FcNested(item);
  }
  
  public FcNested<A> editFc() {
    return withNewFcLike(java.util.Optional.ofNullable(buildFc()).orElse(null));
  }
  
  public FcNested<A> editOrNewFc() {
    return withNewFcLike(java.util.Optional.ofNullable(buildFc()).orElse(new V1FCVolumeSourceBuilder().build()));
  }
  
  public FcNested<A> editOrNewFcLike(V1FCVolumeSource item) {
    return withNewFcLike(java.util.Optional.ofNullable(buildFc()).orElse(item));
  }
  
  public V1FlexVolumeSource buildFlexVolume() {
    return this.flexVolume != null ? this.flexVolume.build() : null;
  }
  
  public A withFlexVolume(V1FlexVolumeSource flexVolume) {
    this._visitables.remove("flexVolume");
    if (flexVolume != null) {
        this.flexVolume = new V1FlexVolumeSourceBuilder(flexVolume);
        this._visitables.get("flexVolume").add(this.flexVolume);
    } else {
        this.flexVolume = null;
        this._visitables.get("flexVolume").remove(this.flexVolume);
    }
    return (A) this;
  }
  
  public boolean hasFlexVolume() {
    return this.flexVolume != null;
  }
  
  public FlexVolumeNested<A> withNewFlexVolume() {
    return new FlexVolumeNested(null);
  }
  
  public FlexVolumeNested<A> withNewFlexVolumeLike(V1FlexVolumeSource item) {
    return new FlexVolumeNested(item);
  }
  
  public FlexVolumeNested<A> editFlexVolume() {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(null));
  }
  
  public FlexVolumeNested<A> editOrNewFlexVolume() {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(new V1FlexVolumeSourceBuilder().build()));
  }
  
  public FlexVolumeNested<A> editOrNewFlexVolumeLike(V1FlexVolumeSource item) {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(item));
  }
  
  public V1FlockerVolumeSource buildFlocker() {
    return this.flocker != null ? this.flocker.build() : null;
  }
  
  public A withFlocker(V1FlockerVolumeSource flocker) {
    this._visitables.remove("flocker");
    if (flocker != null) {
        this.flocker = new V1FlockerVolumeSourceBuilder(flocker);
        this._visitables.get("flocker").add(this.flocker);
    } else {
        this.flocker = null;
        this._visitables.get("flocker").remove(this.flocker);
    }
    return (A) this;
  }
  
  public boolean hasFlocker() {
    return this.flocker != null;
  }
  
  public FlockerNested<A> withNewFlocker() {
    return new FlockerNested(null);
  }
  
  public FlockerNested<A> withNewFlockerLike(V1FlockerVolumeSource item) {
    return new FlockerNested(item);
  }
  
  public FlockerNested<A> editFlocker() {
    return withNewFlockerLike(java.util.Optional.ofNullable(buildFlocker()).orElse(null));
  }
  
  public FlockerNested<A> editOrNewFlocker() {
    return withNewFlockerLike(java.util.Optional.ofNullable(buildFlocker()).orElse(new V1FlockerVolumeSourceBuilder().build()));
  }
  
  public FlockerNested<A> editOrNewFlockerLike(V1FlockerVolumeSource item) {
    return withNewFlockerLike(java.util.Optional.ofNullable(buildFlocker()).orElse(item));
  }
  
  public V1GCEPersistentDiskVolumeSource buildGcePersistentDisk() {
    return this.gcePersistentDisk != null ? this.gcePersistentDisk.build() : null;
  }
  
  public A withGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this._visitables.remove("gcePersistentDisk");
    if (gcePersistentDisk != null) {
        this.gcePersistentDisk = new V1GCEPersistentDiskVolumeSourceBuilder(gcePersistentDisk);
        this._visitables.get("gcePersistentDisk").add(this.gcePersistentDisk);
    } else {
        this.gcePersistentDisk = null;
        this._visitables.get("gcePersistentDisk").remove(this.gcePersistentDisk);
    }
    return (A) this;
  }
  
  public boolean hasGcePersistentDisk() {
    return this.gcePersistentDisk != null;
  }
  
  public GcePersistentDiskNested<A> withNewGcePersistentDisk() {
    return new GcePersistentDiskNested(null);
  }
  
  public GcePersistentDiskNested<A> withNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item) {
    return new GcePersistentDiskNested(item);
  }
  
  public GcePersistentDiskNested<A> editGcePersistentDisk() {
    return withNewGcePersistentDiskLike(java.util.Optional.ofNullable(buildGcePersistentDisk()).orElse(null));
  }
  
  public GcePersistentDiskNested<A> editOrNewGcePersistentDisk() {
    return withNewGcePersistentDiskLike(java.util.Optional.ofNullable(buildGcePersistentDisk()).orElse(new V1GCEPersistentDiskVolumeSourceBuilder().build()));
  }
  
  public GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item) {
    return withNewGcePersistentDiskLike(java.util.Optional.ofNullable(buildGcePersistentDisk()).orElse(item));
  }
  
  public V1GitRepoVolumeSource buildGitRepo() {
    return this.gitRepo != null ? this.gitRepo.build() : null;
  }
  
  public A withGitRepo(V1GitRepoVolumeSource gitRepo) {
    this._visitables.remove("gitRepo");
    if (gitRepo != null) {
        this.gitRepo = new V1GitRepoVolumeSourceBuilder(gitRepo);
        this._visitables.get("gitRepo").add(this.gitRepo);
    } else {
        this.gitRepo = null;
        this._visitables.get("gitRepo").remove(this.gitRepo);
    }
    return (A) this;
  }
  
  public boolean hasGitRepo() {
    return this.gitRepo != null;
  }
  
  public GitRepoNested<A> withNewGitRepo() {
    return new GitRepoNested(null);
  }
  
  public GitRepoNested<A> withNewGitRepoLike(V1GitRepoVolumeSource item) {
    return new GitRepoNested(item);
  }
  
  public GitRepoNested<A> editGitRepo() {
    return withNewGitRepoLike(java.util.Optional.ofNullable(buildGitRepo()).orElse(null));
  }
  
  public GitRepoNested<A> editOrNewGitRepo() {
    return withNewGitRepoLike(java.util.Optional.ofNullable(buildGitRepo()).orElse(new V1GitRepoVolumeSourceBuilder().build()));
  }
  
  public GitRepoNested<A> editOrNewGitRepoLike(V1GitRepoVolumeSource item) {
    return withNewGitRepoLike(java.util.Optional.ofNullable(buildGitRepo()).orElse(item));
  }
  
  public V1GlusterfsVolumeSource buildGlusterfs() {
    return this.glusterfs != null ? this.glusterfs.build() : null;
  }
  
  public A withGlusterfs(V1GlusterfsVolumeSource glusterfs) {
    this._visitables.remove("glusterfs");
    if (glusterfs != null) {
        this.glusterfs = new V1GlusterfsVolumeSourceBuilder(glusterfs);
        this._visitables.get("glusterfs").add(this.glusterfs);
    } else {
        this.glusterfs = null;
        this._visitables.get("glusterfs").remove(this.glusterfs);
    }
    return (A) this;
  }
  
  public boolean hasGlusterfs() {
    return this.glusterfs != null;
  }
  
  public GlusterfsNested<A> withNewGlusterfs() {
    return new GlusterfsNested(null);
  }
  
  public GlusterfsNested<A> withNewGlusterfsLike(V1GlusterfsVolumeSource item) {
    return new GlusterfsNested(item);
  }
  
  public GlusterfsNested<A> editGlusterfs() {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(null));
  }
  
  public GlusterfsNested<A> editOrNewGlusterfs() {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(new V1GlusterfsVolumeSourceBuilder().build()));
  }
  
  public GlusterfsNested<A> editOrNewGlusterfsLike(V1GlusterfsVolumeSource item) {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(item));
  }
  
  public V1HostPathVolumeSource buildHostPath() {
    return this.hostPath != null ? this.hostPath.build() : null;
  }
  
  public A withHostPath(V1HostPathVolumeSource hostPath) {
    this._visitables.remove("hostPath");
    if (hostPath != null) {
        this.hostPath = new V1HostPathVolumeSourceBuilder(hostPath);
        this._visitables.get("hostPath").add(this.hostPath);
    } else {
        this.hostPath = null;
        this._visitables.get("hostPath").remove(this.hostPath);
    }
    return (A) this;
  }
  
  public boolean hasHostPath() {
    return this.hostPath != null;
  }
  
  public HostPathNested<A> withNewHostPath() {
    return new HostPathNested(null);
  }
  
  public HostPathNested<A> withNewHostPathLike(V1HostPathVolumeSource item) {
    return new HostPathNested(item);
  }
  
  public HostPathNested<A> editHostPath() {
    return withNewHostPathLike(java.util.Optional.ofNullable(buildHostPath()).orElse(null));
  }
  
  public HostPathNested<A> editOrNewHostPath() {
    return withNewHostPathLike(java.util.Optional.ofNullable(buildHostPath()).orElse(new V1HostPathVolumeSourceBuilder().build()));
  }
  
  public HostPathNested<A> editOrNewHostPathLike(V1HostPathVolumeSource item) {
    return withNewHostPathLike(java.util.Optional.ofNullable(buildHostPath()).orElse(item));
  }
  
  public V1ISCSIVolumeSource buildIscsi() {
    return this.iscsi != null ? this.iscsi.build() : null;
  }
  
  public A withIscsi(V1ISCSIVolumeSource iscsi) {
    this._visitables.remove("iscsi");
    if (iscsi != null) {
        this.iscsi = new V1ISCSIVolumeSourceBuilder(iscsi);
        this._visitables.get("iscsi").add(this.iscsi);
    } else {
        this.iscsi = null;
        this._visitables.get("iscsi").remove(this.iscsi);
    }
    return (A) this;
  }
  
  public boolean hasIscsi() {
    return this.iscsi != null;
  }
  
  public IscsiNested<A> withNewIscsi() {
    return new IscsiNested(null);
  }
  
  public IscsiNested<A> withNewIscsiLike(V1ISCSIVolumeSource item) {
    return new IscsiNested(item);
  }
  
  public IscsiNested<A> editIscsi() {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(null));
  }
  
  public IscsiNested<A> editOrNewIscsi() {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(new V1ISCSIVolumeSourceBuilder().build()));
  }
  
  public IscsiNested<A> editOrNewIscsiLike(V1ISCSIVolumeSource item) {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(item));
  }
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public V1NFSVolumeSource buildNfs() {
    return this.nfs != null ? this.nfs.build() : null;
  }
  
  public A withNfs(V1NFSVolumeSource nfs) {
    this._visitables.remove("nfs");
    if (nfs != null) {
        this.nfs = new V1NFSVolumeSourceBuilder(nfs);
        this._visitables.get("nfs").add(this.nfs);
    } else {
        this.nfs = null;
        this._visitables.get("nfs").remove(this.nfs);
    }
    return (A) this;
  }
  
  public boolean hasNfs() {
    return this.nfs != null;
  }
  
  public NfsNested<A> withNewNfs() {
    return new NfsNested(null);
  }
  
  public NfsNested<A> withNewNfsLike(V1NFSVolumeSource item) {
    return new NfsNested(item);
  }
  
  public NfsNested<A> editNfs() {
    return withNewNfsLike(java.util.Optional.ofNullable(buildNfs()).orElse(null));
  }
  
  public NfsNested<A> editOrNewNfs() {
    return withNewNfsLike(java.util.Optional.ofNullable(buildNfs()).orElse(new V1NFSVolumeSourceBuilder().build()));
  }
  
  public NfsNested<A> editOrNewNfsLike(V1NFSVolumeSource item) {
    return withNewNfsLike(java.util.Optional.ofNullable(buildNfs()).orElse(item));
  }
  
  public V1PersistentVolumeClaimVolumeSource buildPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null ? this.persistentVolumeClaim.build() : null;
  }
  
  public A withPersistentVolumeClaim(V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this._visitables.remove("persistentVolumeClaim");
    if (persistentVolumeClaim != null) {
        this.persistentVolumeClaim = new V1PersistentVolumeClaimVolumeSourceBuilder(persistentVolumeClaim);
        this._visitables.get("persistentVolumeClaim").add(this.persistentVolumeClaim);
    } else {
        this.persistentVolumeClaim = null;
        this._visitables.get("persistentVolumeClaim").remove(this.persistentVolumeClaim);
    }
    return (A) this;
  }
  
  public boolean hasPersistentVolumeClaim() {
    return this.persistentVolumeClaim != null;
  }
  
  public PersistentVolumeClaimNested<A> withNewPersistentVolumeClaim() {
    return new PersistentVolumeClaimNested(null);
  }
  
  public PersistentVolumeClaimNested<A> withNewPersistentVolumeClaimLike(V1PersistentVolumeClaimVolumeSource item) {
    return new PersistentVolumeClaimNested(item);
  }
  
  public PersistentVolumeClaimNested<A> editPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(java.util.Optional.ofNullable(buildPersistentVolumeClaim()).orElse(null));
  }
  
  public PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaim() {
    return withNewPersistentVolumeClaimLike(java.util.Optional.ofNullable(buildPersistentVolumeClaim()).orElse(new V1PersistentVolumeClaimVolumeSourceBuilder().build()));
  }
  
  public PersistentVolumeClaimNested<A> editOrNewPersistentVolumeClaimLike(V1PersistentVolumeClaimVolumeSource item) {
    return withNewPersistentVolumeClaimLike(java.util.Optional.ofNullable(buildPersistentVolumeClaim()).orElse(item));
  }
  
  public V1PhotonPersistentDiskVolumeSource buildPhotonPersistentDisk() {
    return this.photonPersistentDisk != null ? this.photonPersistentDisk.build() : null;
  }
  
  public A withPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this._visitables.remove("photonPersistentDisk");
    if (photonPersistentDisk != null) {
        this.photonPersistentDisk = new V1PhotonPersistentDiskVolumeSourceBuilder(photonPersistentDisk);
        this._visitables.get("photonPersistentDisk").add(this.photonPersistentDisk);
    } else {
        this.photonPersistentDisk = null;
        this._visitables.get("photonPersistentDisk").remove(this.photonPersistentDisk);
    }
    return (A) this;
  }
  
  public boolean hasPhotonPersistentDisk() {
    return this.photonPersistentDisk != null;
  }
  
  public PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk() {
    return new PhotonPersistentDiskNested(null);
  }
  
  public PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item) {
    return new PhotonPersistentDiskNested(item);
  }
  
  public PhotonPersistentDiskNested<A> editPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(java.util.Optional.ofNullable(buildPhotonPersistentDisk()).orElse(null));
  }
  
  public PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(java.util.Optional.ofNullable(buildPhotonPersistentDisk()).orElse(new V1PhotonPersistentDiskVolumeSourceBuilder().build()));
  }
  
  public PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item) {
    return withNewPhotonPersistentDiskLike(java.util.Optional.ofNullable(buildPhotonPersistentDisk()).orElse(item));
  }
  
  public V1PortworxVolumeSource buildPortworxVolume() {
    return this.portworxVolume != null ? this.portworxVolume.build() : null;
  }
  
  public A withPortworxVolume(V1PortworxVolumeSource portworxVolume) {
    this._visitables.remove("portworxVolume");
    if (portworxVolume != null) {
        this.portworxVolume = new V1PortworxVolumeSourceBuilder(portworxVolume);
        this._visitables.get("portworxVolume").add(this.portworxVolume);
    } else {
        this.portworxVolume = null;
        this._visitables.get("portworxVolume").remove(this.portworxVolume);
    }
    return (A) this;
  }
  
  public boolean hasPortworxVolume() {
    return this.portworxVolume != null;
  }
  
  public PortworxVolumeNested<A> withNewPortworxVolume() {
    return new PortworxVolumeNested(null);
  }
  
  public PortworxVolumeNested<A> withNewPortworxVolumeLike(V1PortworxVolumeSource item) {
    return new PortworxVolumeNested(item);
  }
  
  public PortworxVolumeNested<A> editPortworxVolume() {
    return withNewPortworxVolumeLike(java.util.Optional.ofNullable(buildPortworxVolume()).orElse(null));
  }
  
  public PortworxVolumeNested<A> editOrNewPortworxVolume() {
    return withNewPortworxVolumeLike(java.util.Optional.ofNullable(buildPortworxVolume()).orElse(new V1PortworxVolumeSourceBuilder().build()));
  }
  
  public PortworxVolumeNested<A> editOrNewPortworxVolumeLike(V1PortworxVolumeSource item) {
    return withNewPortworxVolumeLike(java.util.Optional.ofNullable(buildPortworxVolume()).orElse(item));
  }
  
  public V1ProjectedVolumeSource buildProjected() {
    return this.projected != null ? this.projected.build() : null;
  }
  
  public A withProjected(V1ProjectedVolumeSource projected) {
    this._visitables.remove("projected");
    if (projected != null) {
        this.projected = new V1ProjectedVolumeSourceBuilder(projected);
        this._visitables.get("projected").add(this.projected);
    } else {
        this.projected = null;
        this._visitables.get("projected").remove(this.projected);
    }
    return (A) this;
  }
  
  public boolean hasProjected() {
    return this.projected != null;
  }
  
  public ProjectedNested<A> withNewProjected() {
    return new ProjectedNested(null);
  }
  
  public ProjectedNested<A> withNewProjectedLike(V1ProjectedVolumeSource item) {
    return new ProjectedNested(item);
  }
  
  public ProjectedNested<A> editProjected() {
    return withNewProjectedLike(java.util.Optional.ofNullable(buildProjected()).orElse(null));
  }
  
  public ProjectedNested<A> editOrNewProjected() {
    return withNewProjectedLike(java.util.Optional.ofNullable(buildProjected()).orElse(new V1ProjectedVolumeSourceBuilder().build()));
  }
  
  public ProjectedNested<A> editOrNewProjectedLike(V1ProjectedVolumeSource item) {
    return withNewProjectedLike(java.util.Optional.ofNullable(buildProjected()).orElse(item));
  }
  
  public V1QuobyteVolumeSource buildQuobyte() {
    return this.quobyte != null ? this.quobyte.build() : null;
  }
  
  public A withQuobyte(V1QuobyteVolumeSource quobyte) {
    this._visitables.remove("quobyte");
    if (quobyte != null) {
        this.quobyte = new V1QuobyteVolumeSourceBuilder(quobyte);
        this._visitables.get("quobyte").add(this.quobyte);
    } else {
        this.quobyte = null;
        this._visitables.get("quobyte").remove(this.quobyte);
    }
    return (A) this;
  }
  
  public boolean hasQuobyte() {
    return this.quobyte != null;
  }
  
  public QuobyteNested<A> withNewQuobyte() {
    return new QuobyteNested(null);
  }
  
  public QuobyteNested<A> withNewQuobyteLike(V1QuobyteVolumeSource item) {
    return new QuobyteNested(item);
  }
  
  public QuobyteNested<A> editQuobyte() {
    return withNewQuobyteLike(java.util.Optional.ofNullable(buildQuobyte()).orElse(null));
  }
  
  public QuobyteNested<A> editOrNewQuobyte() {
    return withNewQuobyteLike(java.util.Optional.ofNullable(buildQuobyte()).orElse(new V1QuobyteVolumeSourceBuilder().build()));
  }
  
  public QuobyteNested<A> editOrNewQuobyteLike(V1QuobyteVolumeSource item) {
    return withNewQuobyteLike(java.util.Optional.ofNullable(buildQuobyte()).orElse(item));
  }
  
  public V1RBDVolumeSource buildRbd() {
    return this.rbd != null ? this.rbd.build() : null;
  }
  
  public A withRbd(V1RBDVolumeSource rbd) {
    this._visitables.remove("rbd");
    if (rbd != null) {
        this.rbd = new V1RBDVolumeSourceBuilder(rbd);
        this._visitables.get("rbd").add(this.rbd);
    } else {
        this.rbd = null;
        this._visitables.get("rbd").remove(this.rbd);
    }
    return (A) this;
  }
  
  public boolean hasRbd() {
    return this.rbd != null;
  }
  
  public RbdNested<A> withNewRbd() {
    return new RbdNested(null);
  }
  
  public RbdNested<A> withNewRbdLike(V1RBDVolumeSource item) {
    return new RbdNested(item);
  }
  
  public RbdNested<A> editRbd() {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(null));
  }
  
  public RbdNested<A> editOrNewRbd() {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(new V1RBDVolumeSourceBuilder().build()));
  }
  
  public RbdNested<A> editOrNewRbdLike(V1RBDVolumeSource item) {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(item));
  }
  
  public V1ScaleIOVolumeSource buildScaleIO() {
    return this.scaleIO != null ? this.scaleIO.build() : null;
  }
  
  public A withScaleIO(V1ScaleIOVolumeSource scaleIO) {
    this._visitables.remove("scaleIO");
    if (scaleIO != null) {
        this.scaleIO = new V1ScaleIOVolumeSourceBuilder(scaleIO);
        this._visitables.get("scaleIO").add(this.scaleIO);
    } else {
        this.scaleIO = null;
        this._visitables.get("scaleIO").remove(this.scaleIO);
    }
    return (A) this;
  }
  
  public boolean hasScaleIO() {
    return this.scaleIO != null;
  }
  
  public ScaleIONested<A> withNewScaleIO() {
    return new ScaleIONested(null);
  }
  
  public ScaleIONested<A> withNewScaleIOLike(V1ScaleIOVolumeSource item) {
    return new ScaleIONested(item);
  }
  
  public ScaleIONested<A> editScaleIO() {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(null));
  }
  
  public ScaleIONested<A> editOrNewScaleIO() {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(new V1ScaleIOVolumeSourceBuilder().build()));
  }
  
  public ScaleIONested<A> editOrNewScaleIOLike(V1ScaleIOVolumeSource item) {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(item));
  }
  
  public V1SecretVolumeSource buildSecret() {
    return this.secret != null ? this.secret.build() : null;
  }
  
  public A withSecret(V1SecretVolumeSource secret) {
    this._visitables.remove("secret");
    if (secret != null) {
        this.secret = new V1SecretVolumeSourceBuilder(secret);
        this._visitables.get("secret").add(this.secret);
    } else {
        this.secret = null;
        this._visitables.get("secret").remove(this.secret);
    }
    return (A) this;
  }
  
  public boolean hasSecret() {
    return this.secret != null;
  }
  
  public SecretNested<A> withNewSecret() {
    return new SecretNested(null);
  }
  
  public SecretNested<A> withNewSecretLike(V1SecretVolumeSource item) {
    return new SecretNested(item);
  }
  
  public SecretNested<A> editSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(null));
  }
  
  public SecretNested<A> editOrNewSecret() {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(new V1SecretVolumeSourceBuilder().build()));
  }
  
  public SecretNested<A> editOrNewSecretLike(V1SecretVolumeSource item) {
    return withNewSecretLike(java.util.Optional.ofNullable(buildSecret()).orElse(item));
  }
  
  public V1StorageOSVolumeSource buildStorageos() {
    return this.storageos != null ? this.storageos.build() : null;
  }
  
  public A withStorageos(V1StorageOSVolumeSource storageos) {
    this._visitables.remove("storageos");
    if (storageos != null) {
        this.storageos = new V1StorageOSVolumeSourceBuilder(storageos);
        this._visitables.get("storageos").add(this.storageos);
    } else {
        this.storageos = null;
        this._visitables.get("storageos").remove(this.storageos);
    }
    return (A) this;
  }
  
  public boolean hasStorageos() {
    return this.storageos != null;
  }
  
  public StorageosNested<A> withNewStorageos() {
    return new StorageosNested(null);
  }
  
  public StorageosNested<A> withNewStorageosLike(V1StorageOSVolumeSource item) {
    return new StorageosNested(item);
  }
  
  public StorageosNested<A> editStorageos() {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(null));
  }
  
  public StorageosNested<A> editOrNewStorageos() {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(new V1StorageOSVolumeSourceBuilder().build()));
  }
  
  public StorageosNested<A> editOrNewStorageosLike(V1StorageOSVolumeSource item) {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(item));
  }
  
  public V1VsphereVirtualDiskVolumeSource buildVsphereVolume() {
    return this.vsphereVolume != null ? this.vsphereVolume.build() : null;
  }
  
  public A withVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this._visitables.remove("vsphereVolume");
    if (vsphereVolume != null) {
        this.vsphereVolume = new V1VsphereVirtualDiskVolumeSourceBuilder(vsphereVolume);
        this._visitables.get("vsphereVolume").add(this.vsphereVolume);
    } else {
        this.vsphereVolume = null;
        this._visitables.get("vsphereVolume").remove(this.vsphereVolume);
    }
    return (A) this;
  }
  
  public boolean hasVsphereVolume() {
    return this.vsphereVolume != null;
  }
  
  public VsphereVolumeNested<A> withNewVsphereVolume() {
    return new VsphereVolumeNested(null);
  }
  
  public VsphereVolumeNested<A> withNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item) {
    return new VsphereVolumeNested(item);
  }
  
  public VsphereVolumeNested<A> editVsphereVolume() {
    return withNewVsphereVolumeLike(java.util.Optional.ofNullable(buildVsphereVolume()).orElse(null));
  }
  
  public VsphereVolumeNested<A> editOrNewVsphereVolume() {
    return withNewVsphereVolumeLike(java.util.Optional.ofNullable(buildVsphereVolume()).orElse(new V1VsphereVirtualDiskVolumeSourceBuilder().build()));
  }
  
  public VsphereVolumeNested<A> editOrNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item) {
    return withNewVsphereVolumeLike(java.util.Optional.ofNullable(buildVsphereVolume()).orElse(item));
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1VolumeFluent that = (V1VolumeFluent) o;
    if (!java.util.Objects.equals(awsElasticBlockStore, that.awsElasticBlockStore)) return false;
    if (!java.util.Objects.equals(azureDisk, that.azureDisk)) return false;
    if (!java.util.Objects.equals(azureFile, that.azureFile)) return false;
    if (!java.util.Objects.equals(cephfs, that.cephfs)) return false;
    if (!java.util.Objects.equals(cinder, that.cinder)) return false;
    if (!java.util.Objects.equals(configMap, that.configMap)) return false;
    if (!java.util.Objects.equals(csi, that.csi)) return false;
    if (!java.util.Objects.equals(downwardAPI, that.downwardAPI)) return false;
    if (!java.util.Objects.equals(emptyDir, that.emptyDir)) return false;
    if (!java.util.Objects.equals(ephemeral, that.ephemeral)) return false;
    if (!java.util.Objects.equals(fc, that.fc)) return false;
    if (!java.util.Objects.equals(flexVolume, that.flexVolume)) return false;
    if (!java.util.Objects.equals(flocker, that.flocker)) return false;
    if (!java.util.Objects.equals(gcePersistentDisk, that.gcePersistentDisk)) return false;
    if (!java.util.Objects.equals(gitRepo, that.gitRepo)) return false;
    if (!java.util.Objects.equals(glusterfs, that.glusterfs)) return false;
    if (!java.util.Objects.equals(hostPath, that.hostPath)) return false;
    if (!java.util.Objects.equals(iscsi, that.iscsi)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    if (!java.util.Objects.equals(nfs, that.nfs)) return false;
    if (!java.util.Objects.equals(persistentVolumeClaim, that.persistentVolumeClaim)) return false;
    if (!java.util.Objects.equals(photonPersistentDisk, that.photonPersistentDisk)) return false;
    if (!java.util.Objects.equals(portworxVolume, that.portworxVolume)) return false;
    if (!java.util.Objects.equals(projected, that.projected)) return false;
    if (!java.util.Objects.equals(quobyte, that.quobyte)) return false;
    if (!java.util.Objects.equals(rbd, that.rbd)) return false;
    if (!java.util.Objects.equals(scaleIO, that.scaleIO)) return false;
    if (!java.util.Objects.equals(secret, that.secret)) return false;
    if (!java.util.Objects.equals(storageos, that.storageos)) return false;
    if (!java.util.Objects.equals(vsphereVolume, that.vsphereVolume)) return false;
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
  public class AwsElasticBlockStoreNested<N> extends V1AWSElasticBlockStoreVolumeSourceFluent<AwsElasticBlockStoreNested<N>> implements Nested<N>{
    AwsElasticBlockStoreNested(V1AWSElasticBlockStoreVolumeSource item) {
      this.builder = new V1AWSElasticBlockStoreVolumeSourceBuilder(this, item);
    }
    V1AWSElasticBlockStoreVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withAwsElasticBlockStore(builder.build());
    }
    
    public N endAwsElasticBlockStore() {
      return and();
    }
    
  
  }
  public class AzureDiskNested<N> extends V1AzureDiskVolumeSourceFluent<AzureDiskNested<N>> implements Nested<N>{
    AzureDiskNested(V1AzureDiskVolumeSource item) {
      this.builder = new V1AzureDiskVolumeSourceBuilder(this, item);
    }
    V1AzureDiskVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withAzureDisk(builder.build());
    }
    
    public N endAzureDisk() {
      return and();
    }
    
  
  }
  public class AzureFileNested<N> extends V1AzureFileVolumeSourceFluent<AzureFileNested<N>> implements Nested<N>{
    AzureFileNested(V1AzureFileVolumeSource item) {
      this.builder = new V1AzureFileVolumeSourceBuilder(this, item);
    }
    V1AzureFileVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withAzureFile(builder.build());
    }
    
    public N endAzureFile() {
      return and();
    }
    
  
  }
  public class CephfsNested<N> extends V1CephFSVolumeSourceFluent<CephfsNested<N>> implements Nested<N>{
    CephfsNested(V1CephFSVolumeSource item) {
      this.builder = new V1CephFSVolumeSourceBuilder(this, item);
    }
    V1CephFSVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withCephfs(builder.build());
    }
    
    public N endCephfs() {
      return and();
    }
    
  
  }
  public class CinderNested<N> extends V1CinderVolumeSourceFluent<CinderNested<N>> implements Nested<N>{
    CinderNested(V1CinderVolumeSource item) {
      this.builder = new V1CinderVolumeSourceBuilder(this, item);
    }
    V1CinderVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withCinder(builder.build());
    }
    
    public N endCinder() {
      return and();
    }
    
  
  }
  public class ConfigMapNested<N> extends V1ConfigMapVolumeSourceFluent<ConfigMapNested<N>> implements Nested<N>{
    ConfigMapNested(V1ConfigMapVolumeSource item) {
      this.builder = new V1ConfigMapVolumeSourceBuilder(this, item);
    }
    V1ConfigMapVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withConfigMap(builder.build());
    }
    
    public N endConfigMap() {
      return and();
    }
    
  
  }
  public class CsiNested<N> extends V1CSIVolumeSourceFluent<CsiNested<N>> implements Nested<N>{
    CsiNested(V1CSIVolumeSource item) {
      this.builder = new V1CSIVolumeSourceBuilder(this, item);
    }
    V1CSIVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withCsi(builder.build());
    }
    
    public N endCsi() {
      return and();
    }
    
  
  }
  public class DownwardAPINested<N> extends V1DownwardAPIVolumeSourceFluent<DownwardAPINested<N>> implements Nested<N>{
    DownwardAPINested(V1DownwardAPIVolumeSource item) {
      this.builder = new V1DownwardAPIVolumeSourceBuilder(this, item);
    }
    V1DownwardAPIVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withDownwardAPI(builder.build());
    }
    
    public N endDownwardAPI() {
      return and();
    }
    
  
  }
  public class EmptyDirNested<N> extends V1EmptyDirVolumeSourceFluent<EmptyDirNested<N>> implements Nested<N>{
    EmptyDirNested(V1EmptyDirVolumeSource item) {
      this.builder = new V1EmptyDirVolumeSourceBuilder(this, item);
    }
    V1EmptyDirVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withEmptyDir(builder.build());
    }
    
    public N endEmptyDir() {
      return and();
    }
    
  
  }
  public class EphemeralNested<N> extends V1EphemeralVolumeSourceFluent<EphemeralNested<N>> implements Nested<N>{
    EphemeralNested(V1EphemeralVolumeSource item) {
      this.builder = new V1EphemeralVolumeSourceBuilder(this, item);
    }
    V1EphemeralVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withEphemeral(builder.build());
    }
    
    public N endEphemeral() {
      return and();
    }
    
  
  }
  public class FcNested<N> extends V1FCVolumeSourceFluent<FcNested<N>> implements Nested<N>{
    FcNested(V1FCVolumeSource item) {
      this.builder = new V1FCVolumeSourceBuilder(this, item);
    }
    V1FCVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withFc(builder.build());
    }
    
    public N endFc() {
      return and();
    }
    
  
  }
  public class FlexVolumeNested<N> extends V1FlexVolumeSourceFluent<FlexVolumeNested<N>> implements Nested<N>{
    FlexVolumeNested(V1FlexVolumeSource item) {
      this.builder = new V1FlexVolumeSourceBuilder(this, item);
    }
    V1FlexVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withFlexVolume(builder.build());
    }
    
    public N endFlexVolume() {
      return and();
    }
    
  
  }
  public class FlockerNested<N> extends V1FlockerVolumeSourceFluent<FlockerNested<N>> implements Nested<N>{
    FlockerNested(V1FlockerVolumeSource item) {
      this.builder = new V1FlockerVolumeSourceBuilder(this, item);
    }
    V1FlockerVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withFlocker(builder.build());
    }
    
    public N endFlocker() {
      return and();
    }
    
  
  }
  public class GcePersistentDiskNested<N> extends V1GCEPersistentDiskVolumeSourceFluent<GcePersistentDiskNested<N>> implements Nested<N>{
    GcePersistentDiskNested(V1GCEPersistentDiskVolumeSource item) {
      this.builder = new V1GCEPersistentDiskVolumeSourceBuilder(this, item);
    }
    V1GCEPersistentDiskVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withGcePersistentDisk(builder.build());
    }
    
    public N endGcePersistentDisk() {
      return and();
    }
    
  
  }
  public class GitRepoNested<N> extends V1GitRepoVolumeSourceFluent<GitRepoNested<N>> implements Nested<N>{
    GitRepoNested(V1GitRepoVolumeSource item) {
      this.builder = new V1GitRepoVolumeSourceBuilder(this, item);
    }
    V1GitRepoVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withGitRepo(builder.build());
    }
    
    public N endGitRepo() {
      return and();
    }
    
  
  }
  public class GlusterfsNested<N> extends V1GlusterfsVolumeSourceFluent<GlusterfsNested<N>> implements Nested<N>{
    GlusterfsNested(V1GlusterfsVolumeSource item) {
      this.builder = new V1GlusterfsVolumeSourceBuilder(this, item);
    }
    V1GlusterfsVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withGlusterfs(builder.build());
    }
    
    public N endGlusterfs() {
      return and();
    }
    
  
  }
  public class HostPathNested<N> extends V1HostPathVolumeSourceFluent<HostPathNested<N>> implements Nested<N>{
    HostPathNested(V1HostPathVolumeSource item) {
      this.builder = new V1HostPathVolumeSourceBuilder(this, item);
    }
    V1HostPathVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withHostPath(builder.build());
    }
    
    public N endHostPath() {
      return and();
    }
    
  
  }
  public class IscsiNested<N> extends V1ISCSIVolumeSourceFluent<IscsiNested<N>> implements Nested<N>{
    IscsiNested(V1ISCSIVolumeSource item) {
      this.builder = new V1ISCSIVolumeSourceBuilder(this, item);
    }
    V1ISCSIVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withIscsi(builder.build());
    }
    
    public N endIscsi() {
      return and();
    }
    
  
  }
  public class NfsNested<N> extends V1NFSVolumeSourceFluent<NfsNested<N>> implements Nested<N>{
    NfsNested(V1NFSVolumeSource item) {
      this.builder = new V1NFSVolumeSourceBuilder(this, item);
    }
    V1NFSVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withNfs(builder.build());
    }
    
    public N endNfs() {
      return and();
    }
    
  
  }
  public class PersistentVolumeClaimNested<N> extends V1PersistentVolumeClaimVolumeSourceFluent<PersistentVolumeClaimNested<N>> implements Nested<N>{
    PersistentVolumeClaimNested(V1PersistentVolumeClaimVolumeSource item) {
      this.builder = new V1PersistentVolumeClaimVolumeSourceBuilder(this, item);
    }
    V1PersistentVolumeClaimVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withPersistentVolumeClaim(builder.build());
    }
    
    public N endPersistentVolumeClaim() {
      return and();
    }
    
  
  }
  public class PhotonPersistentDiskNested<N> extends V1PhotonPersistentDiskVolumeSourceFluent<PhotonPersistentDiskNested<N>> implements Nested<N>{
    PhotonPersistentDiskNested(V1PhotonPersistentDiskVolumeSource item) {
      this.builder = new V1PhotonPersistentDiskVolumeSourceBuilder(this, item);
    }
    V1PhotonPersistentDiskVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withPhotonPersistentDisk(builder.build());
    }
    
    public N endPhotonPersistentDisk() {
      return and();
    }
    
  
  }
  public class PortworxVolumeNested<N> extends V1PortworxVolumeSourceFluent<PortworxVolumeNested<N>> implements Nested<N>{
    PortworxVolumeNested(V1PortworxVolumeSource item) {
      this.builder = new V1PortworxVolumeSourceBuilder(this, item);
    }
    V1PortworxVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withPortworxVolume(builder.build());
    }
    
    public N endPortworxVolume() {
      return and();
    }
    
  
  }
  public class ProjectedNested<N> extends V1ProjectedVolumeSourceFluent<ProjectedNested<N>> implements Nested<N>{
    ProjectedNested(V1ProjectedVolumeSource item) {
      this.builder = new V1ProjectedVolumeSourceBuilder(this, item);
    }
    V1ProjectedVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withProjected(builder.build());
    }
    
    public N endProjected() {
      return and();
    }
    
  
  }
  public class QuobyteNested<N> extends V1QuobyteVolumeSourceFluent<QuobyteNested<N>> implements Nested<N>{
    QuobyteNested(V1QuobyteVolumeSource item) {
      this.builder = new V1QuobyteVolumeSourceBuilder(this, item);
    }
    V1QuobyteVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withQuobyte(builder.build());
    }
    
    public N endQuobyte() {
      return and();
    }
    
  
  }
  public class RbdNested<N> extends V1RBDVolumeSourceFluent<RbdNested<N>> implements Nested<N>{
    RbdNested(V1RBDVolumeSource item) {
      this.builder = new V1RBDVolumeSourceBuilder(this, item);
    }
    V1RBDVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withRbd(builder.build());
    }
    
    public N endRbd() {
      return and();
    }
    
  
  }
  public class ScaleIONested<N> extends V1ScaleIOVolumeSourceFluent<ScaleIONested<N>> implements Nested<N>{
    ScaleIONested(V1ScaleIOVolumeSource item) {
      this.builder = new V1ScaleIOVolumeSourceBuilder(this, item);
    }
    V1ScaleIOVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withScaleIO(builder.build());
    }
    
    public N endScaleIO() {
      return and();
    }
    
  
  }
  public class SecretNested<N> extends V1SecretVolumeSourceFluent<SecretNested<N>> implements Nested<N>{
    SecretNested(V1SecretVolumeSource item) {
      this.builder = new V1SecretVolumeSourceBuilder(this, item);
    }
    V1SecretVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withSecret(builder.build());
    }
    
    public N endSecret() {
      return and();
    }
    
  
  }
  public class StorageosNested<N> extends V1StorageOSVolumeSourceFluent<StorageosNested<N>> implements Nested<N>{
    StorageosNested(V1StorageOSVolumeSource item) {
      this.builder = new V1StorageOSVolumeSourceBuilder(this, item);
    }
    V1StorageOSVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withStorageos(builder.build());
    }
    
    public N endStorageos() {
      return and();
    }
    
  
  }
  public class VsphereVolumeNested<N> extends V1VsphereVirtualDiskVolumeSourceFluent<VsphereVolumeNested<N>> implements Nested<N>{
    VsphereVolumeNested(V1VsphereVirtualDiskVolumeSource item) {
      this.builder = new V1VsphereVirtualDiskVolumeSourceBuilder(this, item);
    }
    V1VsphereVirtualDiskVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1VolumeFluent.this.withVsphereVolume(builder.build());
    }
    
    public N endVsphereVolume() {
      return and();
    }
    
  
  }

}