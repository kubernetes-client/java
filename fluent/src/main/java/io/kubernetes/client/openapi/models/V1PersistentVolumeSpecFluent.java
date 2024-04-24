package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.util.List;
import java.util.Collection;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PersistentVolumeSpecFluent<A extends V1PersistentVolumeSpecFluent<A>> extends BaseFluent<A>{
  public V1PersistentVolumeSpecFluent() {
  }
  
  public V1PersistentVolumeSpecFluent(V1PersistentVolumeSpec instance) {
    this.copyInstance(instance);
  }
  private List<String> accessModes;
  private V1AWSElasticBlockStoreVolumeSourceBuilder awsElasticBlockStore;
  private V1AzureDiskVolumeSourceBuilder azureDisk;
  private V1AzureFilePersistentVolumeSourceBuilder azureFile;
  private Map<String,Quantity> capacity;
  private V1CephFSPersistentVolumeSourceBuilder cephfs;
  private V1CinderPersistentVolumeSourceBuilder cinder;
  private V1ObjectReferenceBuilder claimRef;
  private V1CSIPersistentVolumeSourceBuilder csi;
  private V1FCVolumeSourceBuilder fc;
  private V1FlexPersistentVolumeSourceBuilder flexVolume;
  private V1FlockerVolumeSourceBuilder flocker;
  private V1GCEPersistentDiskVolumeSourceBuilder gcePersistentDisk;
  private V1GlusterfsPersistentVolumeSourceBuilder glusterfs;
  private V1HostPathVolumeSourceBuilder hostPath;
  private V1ISCSIPersistentVolumeSourceBuilder iscsi;
  private V1LocalVolumeSourceBuilder local;
  private List<String> mountOptions;
  private V1NFSVolumeSourceBuilder nfs;
  private V1VolumeNodeAffinityBuilder nodeAffinity;
  private String persistentVolumeReclaimPolicy;
  private V1PhotonPersistentDiskVolumeSourceBuilder photonPersistentDisk;
  private V1PortworxVolumeSourceBuilder portworxVolume;
  private V1QuobyteVolumeSourceBuilder quobyte;
  private V1RBDPersistentVolumeSourceBuilder rbd;
  private V1ScaleIOPersistentVolumeSourceBuilder scaleIO;
  private String storageClassName;
  private V1StorageOSPersistentVolumeSourceBuilder storageos;
  private String volumeAttributesClassName;
  private String volumeMode;
  private V1VsphereVirtualDiskVolumeSourceBuilder vsphereVolume;
  
  protected void copyInstance(V1PersistentVolumeSpec instance) {
    instance = (instance != null ? instance : new V1PersistentVolumeSpec());
    if (instance != null) {
          this.withAccessModes(instance.getAccessModes());
          this.withAwsElasticBlockStore(instance.getAwsElasticBlockStore());
          this.withAzureDisk(instance.getAzureDisk());
          this.withAzureFile(instance.getAzureFile());
          this.withCapacity(instance.getCapacity());
          this.withCephfs(instance.getCephfs());
          this.withCinder(instance.getCinder());
          this.withClaimRef(instance.getClaimRef());
          this.withCsi(instance.getCsi());
          this.withFc(instance.getFc());
          this.withFlexVolume(instance.getFlexVolume());
          this.withFlocker(instance.getFlocker());
          this.withGcePersistentDisk(instance.getGcePersistentDisk());
          this.withGlusterfs(instance.getGlusterfs());
          this.withHostPath(instance.getHostPath());
          this.withIscsi(instance.getIscsi());
          this.withLocal(instance.getLocal());
          this.withMountOptions(instance.getMountOptions());
          this.withNfs(instance.getNfs());
          this.withNodeAffinity(instance.getNodeAffinity());
          this.withPersistentVolumeReclaimPolicy(instance.getPersistentVolumeReclaimPolicy());
          this.withPhotonPersistentDisk(instance.getPhotonPersistentDisk());
          this.withPortworxVolume(instance.getPortworxVolume());
          this.withQuobyte(instance.getQuobyte());
          this.withRbd(instance.getRbd());
          this.withScaleIO(instance.getScaleIO());
          this.withStorageClassName(instance.getStorageClassName());
          this.withStorageos(instance.getStorageos());
          this.withVolumeAttributesClassName(instance.getVolumeAttributesClassName());
          this.withVolumeMode(instance.getVolumeMode());
          this.withVsphereVolume(instance.getVsphereVolume());
        }
  }
  
  public A addToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.add(index, item);
    return (A)this;
  }
  
  public A setToAccessModes(int index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.set(index, item); return (A)this;
  }
  
  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  
  public A addAllToAccessModes(Collection<String> items) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    for (String item : items) {this.accessModes.add(item);} return (A)this;
  }
  
  public A removeFromAccessModes(java.lang.String... items) {
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
  }
  
  public A removeAllFromAccessModes(Collection<String> items) {
    if (this.accessModes == null) return (A)this;
    for (String item : items) { this.accessModes.remove(item);} return (A)this;
  }
  
  public List<String> getAccessModes() {
    return this.accessModes;
  }
  
  public String getAccessMode(int index) {
    return this.accessModes.get(index);
  }
  
  public String getFirstAccessMode() {
    return this.accessModes.get(0);
  }
  
  public String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }
  
  public String getMatchingAccessMode(Predicate<String> predicate) {
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingAccessMode(Predicate<String> predicate) {
      for (String item : accessModes) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withAccessModes(List<String> accessModes) {
    if (accessModes != null) {
        this.accessModes = new ArrayList();
        for (String item : accessModes) {
          this.addToAccessModes(item);
        }
    } else {
      this.accessModes = null;
    }
    return (A) this;
  }
  
  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {
        this.accessModes.clear();
        _visitables.remove("accessModes");
    }
    if (accessModes != null) {
      for (String item : accessModes) {
        this.addToAccessModes(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasAccessModes() {
    return this.accessModes != null && !this.accessModes.isEmpty();
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
  
  public V1AzureFilePersistentVolumeSource buildAzureFile() {
    return this.azureFile != null ? this.azureFile.build() : null;
  }
  
  public A withAzureFile(V1AzureFilePersistentVolumeSource azureFile) {
    this._visitables.remove("azureFile");
    if (azureFile != null) {
        this.azureFile = new V1AzureFilePersistentVolumeSourceBuilder(azureFile);
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
  
  public AzureFileNested<A> withNewAzureFileLike(V1AzureFilePersistentVolumeSource item) {
    return new AzureFileNested(item);
  }
  
  public AzureFileNested<A> editAzureFile() {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(null));
  }
  
  public AzureFileNested<A> editOrNewAzureFile() {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(new V1AzureFilePersistentVolumeSourceBuilder().build()));
  }
  
  public AzureFileNested<A> editOrNewAzureFileLike(V1AzureFilePersistentVolumeSource item) {
    return withNewAzureFileLike(java.util.Optional.ofNullable(buildAzureFile()).orElse(item));
  }
  
  public A addToCapacity(String key,Quantity value) {
    if(this.capacity == null && key != null && value != null) { this.capacity = new LinkedHashMap(); }
    if(key != null && value != null) {this.capacity.put(key, value);} return (A)this;
  }
  
  public A addToCapacity(Map<String,Quantity> map) {
    if(this.capacity == null && map != null) { this.capacity = new LinkedHashMap(); }
    if(map != null) { this.capacity.putAll(map);} return (A)this;
  }
  
  public A removeFromCapacity(String key) {
    if(this.capacity == null) { return (A) this; }
    if(key != null && this.capacity != null) {this.capacity.remove(key);} return (A)this;
  }
  
  public A removeFromCapacity(Map<String,Quantity> map) {
    if(this.capacity == null) { return (A) this; }
    if(map != null) { for(Object key : map.keySet()) {if (this.capacity != null){this.capacity.remove(key);}}} return (A)this;
  }
  
  public Map<String,Quantity> getCapacity() {
    return this.capacity;
  }
  
  public <K,V>A withCapacity(Map<String,Quantity> capacity) {
    if (capacity == null) {
      this.capacity = null;
    } else {
      this.capacity = new LinkedHashMap(capacity);
    }
    return (A) this;
  }
  
  public boolean hasCapacity() {
    return this.capacity != null;
  }
  
  public V1CephFSPersistentVolumeSource buildCephfs() {
    return this.cephfs != null ? this.cephfs.build() : null;
  }
  
  public A withCephfs(V1CephFSPersistentVolumeSource cephfs) {
    this._visitables.remove("cephfs");
    if (cephfs != null) {
        this.cephfs = new V1CephFSPersistentVolumeSourceBuilder(cephfs);
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
  
  public CephfsNested<A> withNewCephfsLike(V1CephFSPersistentVolumeSource item) {
    return new CephfsNested(item);
  }
  
  public CephfsNested<A> editCephfs() {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(null));
  }
  
  public CephfsNested<A> editOrNewCephfs() {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(new V1CephFSPersistentVolumeSourceBuilder().build()));
  }
  
  public CephfsNested<A> editOrNewCephfsLike(V1CephFSPersistentVolumeSource item) {
    return withNewCephfsLike(java.util.Optional.ofNullable(buildCephfs()).orElse(item));
  }
  
  public V1CinderPersistentVolumeSource buildCinder() {
    return this.cinder != null ? this.cinder.build() : null;
  }
  
  public A withCinder(V1CinderPersistentVolumeSource cinder) {
    this._visitables.remove("cinder");
    if (cinder != null) {
        this.cinder = new V1CinderPersistentVolumeSourceBuilder(cinder);
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
  
  public CinderNested<A> withNewCinderLike(V1CinderPersistentVolumeSource item) {
    return new CinderNested(item);
  }
  
  public CinderNested<A> editCinder() {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(null));
  }
  
  public CinderNested<A> editOrNewCinder() {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(new V1CinderPersistentVolumeSourceBuilder().build()));
  }
  
  public CinderNested<A> editOrNewCinderLike(V1CinderPersistentVolumeSource item) {
    return withNewCinderLike(java.util.Optional.ofNullable(buildCinder()).orElse(item));
  }
  
  public V1ObjectReference buildClaimRef() {
    return this.claimRef != null ? this.claimRef.build() : null;
  }
  
  public A withClaimRef(V1ObjectReference claimRef) {
    this._visitables.remove("claimRef");
    if (claimRef != null) {
        this.claimRef = new V1ObjectReferenceBuilder(claimRef);
        this._visitables.get("claimRef").add(this.claimRef);
    } else {
        this.claimRef = null;
        this._visitables.get("claimRef").remove(this.claimRef);
    }
    return (A) this;
  }
  
  public boolean hasClaimRef() {
    return this.claimRef != null;
  }
  
  public ClaimRefNested<A> withNewClaimRef() {
    return new ClaimRefNested(null);
  }
  
  public ClaimRefNested<A> withNewClaimRefLike(V1ObjectReference item) {
    return new ClaimRefNested(item);
  }
  
  public ClaimRefNested<A> editClaimRef() {
    return withNewClaimRefLike(java.util.Optional.ofNullable(buildClaimRef()).orElse(null));
  }
  
  public ClaimRefNested<A> editOrNewClaimRef() {
    return withNewClaimRefLike(java.util.Optional.ofNullable(buildClaimRef()).orElse(new V1ObjectReferenceBuilder().build()));
  }
  
  public ClaimRefNested<A> editOrNewClaimRefLike(V1ObjectReference item) {
    return withNewClaimRefLike(java.util.Optional.ofNullable(buildClaimRef()).orElse(item));
  }
  
  public V1CSIPersistentVolumeSource buildCsi() {
    return this.csi != null ? this.csi.build() : null;
  }
  
  public A withCsi(V1CSIPersistentVolumeSource csi) {
    this._visitables.remove("csi");
    if (csi != null) {
        this.csi = new V1CSIPersistentVolumeSourceBuilder(csi);
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
  
  public CsiNested<A> withNewCsiLike(V1CSIPersistentVolumeSource item) {
    return new CsiNested(item);
  }
  
  public CsiNested<A> editCsi() {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(null));
  }
  
  public CsiNested<A> editOrNewCsi() {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(new V1CSIPersistentVolumeSourceBuilder().build()));
  }
  
  public CsiNested<A> editOrNewCsiLike(V1CSIPersistentVolumeSource item) {
    return withNewCsiLike(java.util.Optional.ofNullable(buildCsi()).orElse(item));
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
  
  public V1FlexPersistentVolumeSource buildFlexVolume() {
    return this.flexVolume != null ? this.flexVolume.build() : null;
  }
  
  public A withFlexVolume(V1FlexPersistentVolumeSource flexVolume) {
    this._visitables.remove("flexVolume");
    if (flexVolume != null) {
        this.flexVolume = new V1FlexPersistentVolumeSourceBuilder(flexVolume);
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
  
  public FlexVolumeNested<A> withNewFlexVolumeLike(V1FlexPersistentVolumeSource item) {
    return new FlexVolumeNested(item);
  }
  
  public FlexVolumeNested<A> editFlexVolume() {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(null));
  }
  
  public FlexVolumeNested<A> editOrNewFlexVolume() {
    return withNewFlexVolumeLike(java.util.Optional.ofNullable(buildFlexVolume()).orElse(new V1FlexPersistentVolumeSourceBuilder().build()));
  }
  
  public FlexVolumeNested<A> editOrNewFlexVolumeLike(V1FlexPersistentVolumeSource item) {
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
  
  public V1GlusterfsPersistentVolumeSource buildGlusterfs() {
    return this.glusterfs != null ? this.glusterfs.build() : null;
  }
  
  public A withGlusterfs(V1GlusterfsPersistentVolumeSource glusterfs) {
    this._visitables.remove("glusterfs");
    if (glusterfs != null) {
        this.glusterfs = new V1GlusterfsPersistentVolumeSourceBuilder(glusterfs);
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
  
  public GlusterfsNested<A> withNewGlusterfsLike(V1GlusterfsPersistentVolumeSource item) {
    return new GlusterfsNested(item);
  }
  
  public GlusterfsNested<A> editGlusterfs() {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(null));
  }
  
  public GlusterfsNested<A> editOrNewGlusterfs() {
    return withNewGlusterfsLike(java.util.Optional.ofNullable(buildGlusterfs()).orElse(new V1GlusterfsPersistentVolumeSourceBuilder().build()));
  }
  
  public GlusterfsNested<A> editOrNewGlusterfsLike(V1GlusterfsPersistentVolumeSource item) {
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
  
  public V1ISCSIPersistentVolumeSource buildIscsi() {
    return this.iscsi != null ? this.iscsi.build() : null;
  }
  
  public A withIscsi(V1ISCSIPersistentVolumeSource iscsi) {
    this._visitables.remove("iscsi");
    if (iscsi != null) {
        this.iscsi = new V1ISCSIPersistentVolumeSourceBuilder(iscsi);
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
  
  public IscsiNested<A> withNewIscsiLike(V1ISCSIPersistentVolumeSource item) {
    return new IscsiNested(item);
  }
  
  public IscsiNested<A> editIscsi() {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(null));
  }
  
  public IscsiNested<A> editOrNewIscsi() {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(new V1ISCSIPersistentVolumeSourceBuilder().build()));
  }
  
  public IscsiNested<A> editOrNewIscsiLike(V1ISCSIPersistentVolumeSource item) {
    return withNewIscsiLike(java.util.Optional.ofNullable(buildIscsi()).orElse(item));
  }
  
  public V1LocalVolumeSource buildLocal() {
    return this.local != null ? this.local.build() : null;
  }
  
  public A withLocal(V1LocalVolumeSource local) {
    this._visitables.remove("local");
    if (local != null) {
        this.local = new V1LocalVolumeSourceBuilder(local);
        this._visitables.get("local").add(this.local);
    } else {
        this.local = null;
        this._visitables.get("local").remove(this.local);
    }
    return (A) this;
  }
  
  public boolean hasLocal() {
    return this.local != null;
  }
  
  public LocalNested<A> withNewLocal() {
    return new LocalNested(null);
  }
  
  public LocalNested<A> withNewLocalLike(V1LocalVolumeSource item) {
    return new LocalNested(item);
  }
  
  public LocalNested<A> editLocal() {
    return withNewLocalLike(java.util.Optional.ofNullable(buildLocal()).orElse(null));
  }
  
  public LocalNested<A> editOrNewLocal() {
    return withNewLocalLike(java.util.Optional.ofNullable(buildLocal()).orElse(new V1LocalVolumeSourceBuilder().build()));
  }
  
  public LocalNested<A> editOrNewLocalLike(V1LocalVolumeSource item) {
    return withNewLocalLike(java.util.Optional.ofNullable(buildLocal()).orElse(item));
  }
  
  public A addToMountOptions(int index,String item) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    this.mountOptions.add(index, item);
    return (A)this;
  }
  
  public A setToMountOptions(int index,String item) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    this.mountOptions.set(index, item); return (A)this;
  }
  
  public A addToMountOptions(java.lang.String... items) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    for (String item : items) {this.mountOptions.add(item);} return (A)this;
  }
  
  public A addAllToMountOptions(Collection<String> items) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    for (String item : items) {this.mountOptions.add(item);} return (A)this;
  }
  
  public A removeFromMountOptions(java.lang.String... items) {
    if (this.mountOptions == null) return (A)this;
    for (String item : items) { this.mountOptions.remove(item);} return (A)this;
  }
  
  public A removeAllFromMountOptions(Collection<String> items) {
    if (this.mountOptions == null) return (A)this;
    for (String item : items) { this.mountOptions.remove(item);} return (A)this;
  }
  
  public List<String> getMountOptions() {
    return this.mountOptions;
  }
  
  public String getMountOption(int index) {
    return this.mountOptions.get(index);
  }
  
  public String getFirstMountOption() {
    return this.mountOptions.get(0);
  }
  
  public String getLastMountOption() {
    return this.mountOptions.get(mountOptions.size() - 1);
  }
  
  public String getMatchingMountOption(Predicate<String> predicate) {
      for (String item : mountOptions) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingMountOption(Predicate<String> predicate) {
      for (String item : mountOptions) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withMountOptions(List<String> mountOptions) {
    if (mountOptions != null) {
        this.mountOptions = new ArrayList();
        for (String item : mountOptions) {
          this.addToMountOptions(item);
        }
    } else {
      this.mountOptions = null;
    }
    return (A) this;
  }
  
  public A withMountOptions(java.lang.String... mountOptions) {
    if (this.mountOptions != null) {
        this.mountOptions.clear();
        _visitables.remove("mountOptions");
    }
    if (mountOptions != null) {
      for (String item : mountOptions) {
        this.addToMountOptions(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasMountOptions() {
    return this.mountOptions != null && !this.mountOptions.isEmpty();
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
  
  public V1VolumeNodeAffinity buildNodeAffinity() {
    return this.nodeAffinity != null ? this.nodeAffinity.build() : null;
  }
  
  public A withNodeAffinity(V1VolumeNodeAffinity nodeAffinity) {
    this._visitables.remove("nodeAffinity");
    if (nodeAffinity != null) {
        this.nodeAffinity = new V1VolumeNodeAffinityBuilder(nodeAffinity);
        this._visitables.get("nodeAffinity").add(this.nodeAffinity);
    } else {
        this.nodeAffinity = null;
        this._visitables.get("nodeAffinity").remove(this.nodeAffinity);
    }
    return (A) this;
  }
  
  public boolean hasNodeAffinity() {
    return this.nodeAffinity != null;
  }
  
  public NodeAffinityNested<A> withNewNodeAffinity() {
    return new NodeAffinityNested(null);
  }
  
  public NodeAffinityNested<A> withNewNodeAffinityLike(V1VolumeNodeAffinity item) {
    return new NodeAffinityNested(item);
  }
  
  public NodeAffinityNested<A> editNodeAffinity() {
    return withNewNodeAffinityLike(java.util.Optional.ofNullable(buildNodeAffinity()).orElse(null));
  }
  
  public NodeAffinityNested<A> editOrNewNodeAffinity() {
    return withNewNodeAffinityLike(java.util.Optional.ofNullable(buildNodeAffinity()).orElse(new V1VolumeNodeAffinityBuilder().build()));
  }
  
  public NodeAffinityNested<A> editOrNewNodeAffinityLike(V1VolumeNodeAffinity item) {
    return withNewNodeAffinityLike(java.util.Optional.ofNullable(buildNodeAffinity()).orElse(item));
  }
  
  public String getPersistentVolumeReclaimPolicy() {
    return this.persistentVolumeReclaimPolicy;
  }
  
  public A withPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return (A) this;
  }
  
  public boolean hasPersistentVolumeReclaimPolicy() {
    return this.persistentVolumeReclaimPolicy != null;
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
  
  public V1RBDPersistentVolumeSource buildRbd() {
    return this.rbd != null ? this.rbd.build() : null;
  }
  
  public A withRbd(V1RBDPersistentVolumeSource rbd) {
    this._visitables.remove("rbd");
    if (rbd != null) {
        this.rbd = new V1RBDPersistentVolumeSourceBuilder(rbd);
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
  
  public RbdNested<A> withNewRbdLike(V1RBDPersistentVolumeSource item) {
    return new RbdNested(item);
  }
  
  public RbdNested<A> editRbd() {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(null));
  }
  
  public RbdNested<A> editOrNewRbd() {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(new V1RBDPersistentVolumeSourceBuilder().build()));
  }
  
  public RbdNested<A> editOrNewRbdLike(V1RBDPersistentVolumeSource item) {
    return withNewRbdLike(java.util.Optional.ofNullable(buildRbd()).orElse(item));
  }
  
  public V1ScaleIOPersistentVolumeSource buildScaleIO() {
    return this.scaleIO != null ? this.scaleIO.build() : null;
  }
  
  public A withScaleIO(V1ScaleIOPersistentVolumeSource scaleIO) {
    this._visitables.remove("scaleIO");
    if (scaleIO != null) {
        this.scaleIO = new V1ScaleIOPersistentVolumeSourceBuilder(scaleIO);
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
  
  public ScaleIONested<A> withNewScaleIOLike(V1ScaleIOPersistentVolumeSource item) {
    return new ScaleIONested(item);
  }
  
  public ScaleIONested<A> editScaleIO() {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(null));
  }
  
  public ScaleIONested<A> editOrNewScaleIO() {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(new V1ScaleIOPersistentVolumeSourceBuilder().build()));
  }
  
  public ScaleIONested<A> editOrNewScaleIOLike(V1ScaleIOPersistentVolumeSource item) {
    return withNewScaleIOLike(java.util.Optional.ofNullable(buildScaleIO()).orElse(item));
  }
  
  public String getStorageClassName() {
    return this.storageClassName;
  }
  
  public A withStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }
  
  public boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  
  public V1StorageOSPersistentVolumeSource buildStorageos() {
    return this.storageos != null ? this.storageos.build() : null;
  }
  
  public A withStorageos(V1StorageOSPersistentVolumeSource storageos) {
    this._visitables.remove("storageos");
    if (storageos != null) {
        this.storageos = new V1StorageOSPersistentVolumeSourceBuilder(storageos);
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
  
  public StorageosNested<A> withNewStorageosLike(V1StorageOSPersistentVolumeSource item) {
    return new StorageosNested(item);
  }
  
  public StorageosNested<A> editStorageos() {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(null));
  }
  
  public StorageosNested<A> editOrNewStorageos() {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(new V1StorageOSPersistentVolumeSourceBuilder().build()));
  }
  
  public StorageosNested<A> editOrNewStorageosLike(V1StorageOSPersistentVolumeSource item) {
    return withNewStorageosLike(java.util.Optional.ofNullable(buildStorageos()).orElse(item));
  }
  
  public String getVolumeAttributesClassName() {
    return this.volumeAttributesClassName;
  }
  
  public A withVolumeAttributesClassName(String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
    return (A) this;
  }
  
  public boolean hasVolumeAttributesClassName() {
    return this.volumeAttributesClassName != null;
  }
  
  public String getVolumeMode() {
    return this.volumeMode;
  }
  
  public A withVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return (A) this;
  }
  
  public boolean hasVolumeMode() {
    return this.volumeMode != null;
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
    V1PersistentVolumeSpecFluent that = (V1PersistentVolumeSpecFluent) o;
    if (!java.util.Objects.equals(accessModes, that.accessModes)) return false;
    if (!java.util.Objects.equals(awsElasticBlockStore, that.awsElasticBlockStore)) return false;
    if (!java.util.Objects.equals(azureDisk, that.azureDisk)) return false;
    if (!java.util.Objects.equals(azureFile, that.azureFile)) return false;
    if (!java.util.Objects.equals(capacity, that.capacity)) return false;
    if (!java.util.Objects.equals(cephfs, that.cephfs)) return false;
    if (!java.util.Objects.equals(cinder, that.cinder)) return false;
    if (!java.util.Objects.equals(claimRef, that.claimRef)) return false;
    if (!java.util.Objects.equals(csi, that.csi)) return false;
    if (!java.util.Objects.equals(fc, that.fc)) return false;
    if (!java.util.Objects.equals(flexVolume, that.flexVolume)) return false;
    if (!java.util.Objects.equals(flocker, that.flocker)) return false;
    if (!java.util.Objects.equals(gcePersistentDisk, that.gcePersistentDisk)) return false;
    if (!java.util.Objects.equals(glusterfs, that.glusterfs)) return false;
    if (!java.util.Objects.equals(hostPath, that.hostPath)) return false;
    if (!java.util.Objects.equals(iscsi, that.iscsi)) return false;
    if (!java.util.Objects.equals(local, that.local)) return false;
    if (!java.util.Objects.equals(mountOptions, that.mountOptions)) return false;
    if (!java.util.Objects.equals(nfs, that.nfs)) return false;
    if (!java.util.Objects.equals(nodeAffinity, that.nodeAffinity)) return false;
    if (!java.util.Objects.equals(persistentVolumeReclaimPolicy, that.persistentVolumeReclaimPolicy)) return false;
    if (!java.util.Objects.equals(photonPersistentDisk, that.photonPersistentDisk)) return false;
    if (!java.util.Objects.equals(portworxVolume, that.portworxVolume)) return false;
    if (!java.util.Objects.equals(quobyte, that.quobyte)) return false;
    if (!java.util.Objects.equals(rbd, that.rbd)) return false;
    if (!java.util.Objects.equals(scaleIO, that.scaleIO)) return false;
    if (!java.util.Objects.equals(storageClassName, that.storageClassName)) return false;
    if (!java.util.Objects.equals(storageos, that.storageos)) return false;
    if (!java.util.Objects.equals(volumeAttributesClassName, that.volumeAttributesClassName)) return false;
    if (!java.util.Objects.equals(volumeMode, that.volumeMode)) return false;
    if (!java.util.Objects.equals(vsphereVolume, that.vsphereVolume)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(accessModes,  awsElasticBlockStore,  azureDisk,  azureFile,  capacity,  cephfs,  cinder,  claimRef,  csi,  fc,  flexVolume,  flocker,  gcePersistentDisk,  glusterfs,  hostPath,  iscsi,  local,  mountOptions,  nfs,  nodeAffinity,  persistentVolumeReclaimPolicy,  photonPersistentDisk,  portworxVolume,  quobyte,  rbd,  scaleIO,  storageClassName,  storageos,  volumeAttributesClassName,  volumeMode,  vsphereVolume,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (accessModes != null && !accessModes.isEmpty()) { sb.append("accessModes:"); sb.append(accessModes + ","); }
    if (awsElasticBlockStore != null) { sb.append("awsElasticBlockStore:"); sb.append(awsElasticBlockStore + ","); }
    if (azureDisk != null) { sb.append("azureDisk:"); sb.append(azureDisk + ","); }
    if (azureFile != null) { sb.append("azureFile:"); sb.append(azureFile + ","); }
    if (capacity != null && !capacity.isEmpty()) { sb.append("capacity:"); sb.append(capacity + ","); }
    if (cephfs != null) { sb.append("cephfs:"); sb.append(cephfs + ","); }
    if (cinder != null) { sb.append("cinder:"); sb.append(cinder + ","); }
    if (claimRef != null) { sb.append("claimRef:"); sb.append(claimRef + ","); }
    if (csi != null) { sb.append("csi:"); sb.append(csi + ","); }
    if (fc != null) { sb.append("fc:"); sb.append(fc + ","); }
    if (flexVolume != null) { sb.append("flexVolume:"); sb.append(flexVolume + ","); }
    if (flocker != null) { sb.append("flocker:"); sb.append(flocker + ","); }
    if (gcePersistentDisk != null) { sb.append("gcePersistentDisk:"); sb.append(gcePersistentDisk + ","); }
    if (glusterfs != null) { sb.append("glusterfs:"); sb.append(glusterfs + ","); }
    if (hostPath != null) { sb.append("hostPath:"); sb.append(hostPath + ","); }
    if (iscsi != null) { sb.append("iscsi:"); sb.append(iscsi + ","); }
    if (local != null) { sb.append("local:"); sb.append(local + ","); }
    if (mountOptions != null && !mountOptions.isEmpty()) { sb.append("mountOptions:"); sb.append(mountOptions + ","); }
    if (nfs != null) { sb.append("nfs:"); sb.append(nfs + ","); }
    if (nodeAffinity != null) { sb.append("nodeAffinity:"); sb.append(nodeAffinity + ","); }
    if (persistentVolumeReclaimPolicy != null) { sb.append("persistentVolumeReclaimPolicy:"); sb.append(persistentVolumeReclaimPolicy + ","); }
    if (photonPersistentDisk != null) { sb.append("photonPersistentDisk:"); sb.append(photonPersistentDisk + ","); }
    if (portworxVolume != null) { sb.append("portworxVolume:"); sb.append(portworxVolume + ","); }
    if (quobyte != null) { sb.append("quobyte:"); sb.append(quobyte + ","); }
    if (rbd != null) { sb.append("rbd:"); sb.append(rbd + ","); }
    if (scaleIO != null) { sb.append("scaleIO:"); sb.append(scaleIO + ","); }
    if (storageClassName != null) { sb.append("storageClassName:"); sb.append(storageClassName + ","); }
    if (storageos != null) { sb.append("storageos:"); sb.append(storageos + ","); }
    if (volumeAttributesClassName != null) { sb.append("volumeAttributesClassName:"); sb.append(volumeAttributesClassName + ","); }
    if (volumeMode != null) { sb.append("volumeMode:"); sb.append(volumeMode + ","); }
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
      return (N) V1PersistentVolumeSpecFluent.this.withAwsElasticBlockStore(builder.build());
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
      return (N) V1PersistentVolumeSpecFluent.this.withAzureDisk(builder.build());
    }
    
    public N endAzureDisk() {
      return and();
    }
    
  
  }
  public class AzureFileNested<N> extends V1AzureFilePersistentVolumeSourceFluent<AzureFileNested<N>> implements Nested<N>{
    AzureFileNested(V1AzureFilePersistentVolumeSource item) {
      this.builder = new V1AzureFilePersistentVolumeSourceBuilder(this, item);
    }
    V1AzureFilePersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withAzureFile(builder.build());
    }
    
    public N endAzureFile() {
      return and();
    }
    
  
  }
  public class CephfsNested<N> extends V1CephFSPersistentVolumeSourceFluent<CephfsNested<N>> implements Nested<N>{
    CephfsNested(V1CephFSPersistentVolumeSource item) {
      this.builder = new V1CephFSPersistentVolumeSourceBuilder(this, item);
    }
    V1CephFSPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withCephfs(builder.build());
    }
    
    public N endCephfs() {
      return and();
    }
    
  
  }
  public class CinderNested<N> extends V1CinderPersistentVolumeSourceFluent<CinderNested<N>> implements Nested<N>{
    CinderNested(V1CinderPersistentVolumeSource item) {
      this.builder = new V1CinderPersistentVolumeSourceBuilder(this, item);
    }
    V1CinderPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withCinder(builder.build());
    }
    
    public N endCinder() {
      return and();
    }
    
  
  }
  public class ClaimRefNested<N> extends V1ObjectReferenceFluent<ClaimRefNested<N>> implements Nested<N>{
    ClaimRefNested(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    V1ObjectReferenceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withClaimRef(builder.build());
    }
    
    public N endClaimRef() {
      return and();
    }
    
  
  }
  public class CsiNested<N> extends V1CSIPersistentVolumeSourceFluent<CsiNested<N>> implements Nested<N>{
    CsiNested(V1CSIPersistentVolumeSource item) {
      this.builder = new V1CSIPersistentVolumeSourceBuilder(this, item);
    }
    V1CSIPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withCsi(builder.build());
    }
    
    public N endCsi() {
      return and();
    }
    
  
  }
  public class FcNested<N> extends V1FCVolumeSourceFluent<FcNested<N>> implements Nested<N>{
    FcNested(V1FCVolumeSource item) {
      this.builder = new V1FCVolumeSourceBuilder(this, item);
    }
    V1FCVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withFc(builder.build());
    }
    
    public N endFc() {
      return and();
    }
    
  
  }
  public class FlexVolumeNested<N> extends V1FlexPersistentVolumeSourceFluent<FlexVolumeNested<N>> implements Nested<N>{
    FlexVolumeNested(V1FlexPersistentVolumeSource item) {
      this.builder = new V1FlexPersistentVolumeSourceBuilder(this, item);
    }
    V1FlexPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withFlexVolume(builder.build());
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
      return (N) V1PersistentVolumeSpecFluent.this.withFlocker(builder.build());
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
      return (N) V1PersistentVolumeSpecFluent.this.withGcePersistentDisk(builder.build());
    }
    
    public N endGcePersistentDisk() {
      return and();
    }
    
  
  }
  public class GlusterfsNested<N> extends V1GlusterfsPersistentVolumeSourceFluent<GlusterfsNested<N>> implements Nested<N>{
    GlusterfsNested(V1GlusterfsPersistentVolumeSource item) {
      this.builder = new V1GlusterfsPersistentVolumeSourceBuilder(this, item);
    }
    V1GlusterfsPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withGlusterfs(builder.build());
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
      return (N) V1PersistentVolumeSpecFluent.this.withHostPath(builder.build());
    }
    
    public N endHostPath() {
      return and();
    }
    
  
  }
  public class IscsiNested<N> extends V1ISCSIPersistentVolumeSourceFluent<IscsiNested<N>> implements Nested<N>{
    IscsiNested(V1ISCSIPersistentVolumeSource item) {
      this.builder = new V1ISCSIPersistentVolumeSourceBuilder(this, item);
    }
    V1ISCSIPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withIscsi(builder.build());
    }
    
    public N endIscsi() {
      return and();
    }
    
  
  }
  public class LocalNested<N> extends V1LocalVolumeSourceFluent<LocalNested<N>> implements Nested<N>{
    LocalNested(V1LocalVolumeSource item) {
      this.builder = new V1LocalVolumeSourceBuilder(this, item);
    }
    V1LocalVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withLocal(builder.build());
    }
    
    public N endLocal() {
      return and();
    }
    
  
  }
  public class NfsNested<N> extends V1NFSVolumeSourceFluent<NfsNested<N>> implements Nested<N>{
    NfsNested(V1NFSVolumeSource item) {
      this.builder = new V1NFSVolumeSourceBuilder(this, item);
    }
    V1NFSVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withNfs(builder.build());
    }
    
    public N endNfs() {
      return and();
    }
    
  
  }
  public class NodeAffinityNested<N> extends V1VolumeNodeAffinityFluent<NodeAffinityNested<N>> implements Nested<N>{
    NodeAffinityNested(V1VolumeNodeAffinity item) {
      this.builder = new V1VolumeNodeAffinityBuilder(this, item);
    }
    V1VolumeNodeAffinityBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withNodeAffinity(builder.build());
    }
    
    public N endNodeAffinity() {
      return and();
    }
    
  
  }
  public class PhotonPersistentDiskNested<N> extends V1PhotonPersistentDiskVolumeSourceFluent<PhotonPersistentDiskNested<N>> implements Nested<N>{
    PhotonPersistentDiskNested(V1PhotonPersistentDiskVolumeSource item) {
      this.builder = new V1PhotonPersistentDiskVolumeSourceBuilder(this, item);
    }
    V1PhotonPersistentDiskVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withPhotonPersistentDisk(builder.build());
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
      return (N) V1PersistentVolumeSpecFluent.this.withPortworxVolume(builder.build());
    }
    
    public N endPortworxVolume() {
      return and();
    }
    
  
  }
  public class QuobyteNested<N> extends V1QuobyteVolumeSourceFluent<QuobyteNested<N>> implements Nested<N>{
    QuobyteNested(V1QuobyteVolumeSource item) {
      this.builder = new V1QuobyteVolumeSourceBuilder(this, item);
    }
    V1QuobyteVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withQuobyte(builder.build());
    }
    
    public N endQuobyte() {
      return and();
    }
    
  
  }
  public class RbdNested<N> extends V1RBDPersistentVolumeSourceFluent<RbdNested<N>> implements Nested<N>{
    RbdNested(V1RBDPersistentVolumeSource item) {
      this.builder = new V1RBDPersistentVolumeSourceBuilder(this, item);
    }
    V1RBDPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withRbd(builder.build());
    }
    
    public N endRbd() {
      return and();
    }
    
  
  }
  public class ScaleIONested<N> extends V1ScaleIOPersistentVolumeSourceFluent<ScaleIONested<N>> implements Nested<N>{
    ScaleIONested(V1ScaleIOPersistentVolumeSource item) {
      this.builder = new V1ScaleIOPersistentVolumeSourceBuilder(this, item);
    }
    V1ScaleIOPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withScaleIO(builder.build());
    }
    
    public N endScaleIO() {
      return and();
    }
    
  
  }
  public class StorageosNested<N> extends V1StorageOSPersistentVolumeSourceFluent<StorageosNested<N>> implements Nested<N>{
    StorageosNested(V1StorageOSPersistentVolumeSource item) {
      this.builder = new V1StorageOSPersistentVolumeSourceBuilder(this, item);
    }
    V1StorageOSPersistentVolumeSourceBuilder builder;
    
    public N and() {
      return (N) V1PersistentVolumeSpecFluent.this.withStorageos(builder.build());
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
      return (N) V1PersistentVolumeSpecFluent.this.withVsphereVolume(builder.build());
    }
    
    public N endVsphereVolume() {
      return and();
    }
    
  
  }

}