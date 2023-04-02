package io.kubernetes.client.openapi.models;

import java.util.ArrayList;
import java.lang.String;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Map;
import java.lang.Deprecated;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.util.List;
import java.util.Collection;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import io.kubernetes.client.custom.Quantity;
import java.lang.Integer;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1PersistentVolumeSpecFluentImpl<A extends V1PersistentVolumeSpecFluent<A>> extends BaseFluent<A> implements V1PersistentVolumeSpecFluent<A>{
  public V1PersistentVolumeSpecFluentImpl() {
  }
  public V1PersistentVolumeSpecFluentImpl(V1PersistentVolumeSpec instance) {
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

    this.withVolumeMode(instance.getVolumeMode());

    this.withVsphereVolume(instance.getVsphereVolume());

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
  private String volumeMode;
  private V1VsphereVirtualDiskVolumeSourceBuilder vsphereVolume;
  public A addToAccessModes(Integer index,String item) {
    if (this.accessModes == null) {this.accessModes = new ArrayList<String>();}
    this.accessModes.add(index, item);
    return (A)this;
  }
  public A setToAccessModes(Integer index,String item) {
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
    for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
  }
  public A removeAllFromAccessModes(Collection<String> items) {
    for (String item : items) {if (this.accessModes!= null){ this.accessModes.remove(item);}} return (A)this;
  }
  public List<String> getAccessModes() {
    return this.accessModes;
  }
  public String getAccessMode(Integer index) {
    return this.accessModes.get(index);
  }
  public String getFirstAccessMode() {
    return this.accessModes.get(0);
  }
  public String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }
  public String getMatchingAccessMode(Predicate<String> predicate) {
    for (String item: accessModes) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingAccessMode(Predicate<String> predicate) {
    for (String item: accessModes) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withAccessModes(List<String> accessModes) {
    if (accessModes != null) {this.accessModes = new ArrayList(); for (String item : accessModes){this.addToAccessModes(item);}} else { this.accessModes = null;} return (A) this;
  }
  public A withAccessModes(java.lang.String... accessModes) {
    if (this.accessModes != null) {this.accessModes.clear();}
    if (accessModes != null) {for (String item :accessModes){ this.addToAccessModes(item);}} return (A) this;
  }
  public Boolean hasAccessModes() {
    return accessModes != null && !accessModes.isEmpty();
  }
  
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
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStore() {
    return new V1PersistentVolumeSpecFluentImpl.AwsElasticBlockStoreNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> withNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.AwsElasticBlockStoreNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore());
  }
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore() != null ? getAwsElasticBlockStore(): new V1AWSElasticBlockStoreVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<A> editOrNewAwsElasticBlockStoreLike(V1AWSElasticBlockStoreVolumeSource item) {
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
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDisk() {
    return new V1PersistentVolumeSpecFluentImpl.AzureDiskNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> withNewAzureDiskLike(V1AzureDiskVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.AzureDiskNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> editAzureDisk() {
    return withNewAzureDiskLike(getAzureDisk());
  }
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDisk() {
    return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): new V1AzureDiskVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.AzureDiskNested<A> editOrNewAzureDiskLike(V1AzureDiskVolumeSource item) {
    return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1AzureFilePersistentVolumeSource getAzureFile() {
    return this.azureFile!=null ?this.azureFile.build():null;
  }
  public V1AzureFilePersistentVolumeSource buildAzureFile() {
    return this.azureFile!=null ?this.azureFile.build():null;
  }
  public A withAzureFile(V1AzureFilePersistentVolumeSource azureFile) {
    _visitables.get("azureFile").remove(this.azureFile);
    if (azureFile!=null){ this.azureFile= new V1AzureFilePersistentVolumeSourceBuilder(azureFile); _visitables.get("azureFile").add(this.azureFile);} else { this.azureFile = null; _visitables.get("azureFile").remove(this.azureFile); } return (A) this;
  }
  public Boolean hasAzureFile() {
    return this.azureFile != null;
  }
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFile() {
    return new V1PersistentVolumeSpecFluentImpl.AzureFileNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> withNewAzureFileLike(V1AzureFilePersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.AzureFileNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> editAzureFile() {
    return withNewAzureFileLike(getAzureFile());
  }
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFile() {
    return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): new V1AzureFilePersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.AzureFileNested<A> editOrNewAzureFileLike(V1AzureFilePersistentVolumeSource item) {
    return withNewAzureFileLike(getAzureFile() != null ? getAzureFile(): item);
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
    if (capacity == null) { this.capacity =  null;} else {this.capacity = new LinkedHashMap(capacity);} return (A) this;
  }
  public Boolean hasCapacity() {
    return this.capacity != null;
  }
  
  /**
   * This method has been deprecated, please use method buildCephfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CephFSPersistentVolumeSource getCephfs() {
    return this.cephfs!=null ?this.cephfs.build():null;
  }
  public V1CephFSPersistentVolumeSource buildCephfs() {
    return this.cephfs!=null ?this.cephfs.build():null;
  }
  public A withCephfs(V1CephFSPersistentVolumeSource cephfs) {
    _visitables.get("cephfs").remove(this.cephfs);
    if (cephfs!=null){ this.cephfs= new V1CephFSPersistentVolumeSourceBuilder(cephfs); _visitables.get("cephfs").add(this.cephfs);} else { this.cephfs = null; _visitables.get("cephfs").remove(this.cephfs); } return (A) this;
  }
  public Boolean hasCephfs() {
    return this.cephfs != null;
  }
  public V1PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfs() {
    return new V1PersistentVolumeSpecFluentImpl.CephfsNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.CephfsNested<A> withNewCephfsLike(V1CephFSPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.CephfsNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.CephfsNested<A> editCephfs() {
    return withNewCephfsLike(getCephfs());
  }
  public V1PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfs() {
    return withNewCephfsLike(getCephfs() != null ? getCephfs(): new V1CephFSPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.CephfsNested<A> editOrNewCephfsLike(V1CephFSPersistentVolumeSource item) {
    return withNewCephfsLike(getCephfs() != null ? getCephfs(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildCinder instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CinderPersistentVolumeSource getCinder() {
    return this.cinder!=null ?this.cinder.build():null;
  }
  public V1CinderPersistentVolumeSource buildCinder() {
    return this.cinder!=null ?this.cinder.build():null;
  }
  public A withCinder(V1CinderPersistentVolumeSource cinder) {
    _visitables.get("cinder").remove(this.cinder);
    if (cinder!=null){ this.cinder= new V1CinderPersistentVolumeSourceBuilder(cinder); _visitables.get("cinder").add(this.cinder);} else { this.cinder = null; _visitables.get("cinder").remove(this.cinder); } return (A) this;
  }
  public Boolean hasCinder() {
    return this.cinder != null;
  }
  public V1PersistentVolumeSpecFluent.CinderNested<A> withNewCinder() {
    return new V1PersistentVolumeSpecFluentImpl.CinderNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.CinderNested<A> withNewCinderLike(V1CinderPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.CinderNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.CinderNested<A> editCinder() {
    return withNewCinderLike(getCinder());
  }
  public V1PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinder() {
    return withNewCinderLike(getCinder() != null ? getCinder(): new V1CinderPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.CinderNested<A> editOrNewCinderLike(V1CinderPersistentVolumeSource item) {
    return withNewCinderLike(getCinder() != null ? getCinder(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildClaimRef instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getClaimRef() {
    return this.claimRef!=null ?this.claimRef.build():null;
  }
  public V1ObjectReference buildClaimRef() {
    return this.claimRef!=null ?this.claimRef.build():null;
  }
  public A withClaimRef(V1ObjectReference claimRef) {
    _visitables.get("claimRef").remove(this.claimRef);
    if (claimRef!=null){ this.claimRef= new V1ObjectReferenceBuilder(claimRef); _visitables.get("claimRef").add(this.claimRef);} else { this.claimRef = null; _visitables.get("claimRef").remove(this.claimRef); } return (A) this;
  }
  public Boolean hasClaimRef() {
    return this.claimRef != null;
  }
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRef() {
    return new V1PersistentVolumeSpecFluentImpl.ClaimRefNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> withNewClaimRefLike(V1ObjectReference item) {
    return new V1PersistentVolumeSpecFluentImpl.ClaimRefNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> editClaimRef() {
    return withNewClaimRefLike(getClaimRef());
  }
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRef() {
    return withNewClaimRefLike(getClaimRef() != null ? getClaimRef(): new V1ObjectReferenceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.ClaimRefNested<A> editOrNewClaimRefLike(V1ObjectReference item) {
    return withNewClaimRefLike(getClaimRef() != null ? getClaimRef(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildCsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1CSIPersistentVolumeSource getCsi() {
    return this.csi!=null ?this.csi.build():null;
  }
  public V1CSIPersistentVolumeSource buildCsi() {
    return this.csi!=null ?this.csi.build():null;
  }
  public A withCsi(V1CSIPersistentVolumeSource csi) {
    _visitables.get("csi").remove(this.csi);
    if (csi!=null){ this.csi= new V1CSIPersistentVolumeSourceBuilder(csi); _visitables.get("csi").add(this.csi);} else { this.csi = null; _visitables.get("csi").remove(this.csi); } return (A) this;
  }
  public Boolean hasCsi() {
    return this.csi != null;
  }
  public V1PersistentVolumeSpecFluent.CsiNested<A> withNewCsi() {
    return new V1PersistentVolumeSpecFluentImpl.CsiNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.CsiNested<A> withNewCsiLike(V1CSIPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.CsiNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.CsiNested<A> editCsi() {
    return withNewCsiLike(getCsi());
  }
  public V1PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsi() {
    return withNewCsiLike(getCsi() != null ? getCsi(): new V1CSIPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.CsiNested<A> editOrNewCsiLike(V1CSIPersistentVolumeSource item) {
    return withNewCsiLike(getCsi() != null ? getCsi(): item);
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
  public V1PersistentVolumeSpecFluent.FcNested<A> withNewFc() {
    return new V1PersistentVolumeSpecFluentImpl.FcNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.FcNested<A> withNewFcLike(V1FCVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.FcNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.FcNested<A> editFc() {
    return withNewFcLike(getFc());
  }
  public V1PersistentVolumeSpecFluent.FcNested<A> editOrNewFc() {
    return withNewFcLike(getFc() != null ? getFc(): new V1FCVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.FcNested<A> editOrNewFcLike(V1FCVolumeSource item) {
    return withNewFcLike(getFc() != null ? getFc(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1FlexPersistentVolumeSource getFlexVolume() {
    return this.flexVolume!=null ?this.flexVolume.build():null;
  }
  public V1FlexPersistentVolumeSource buildFlexVolume() {
    return this.flexVolume!=null ?this.flexVolume.build():null;
  }
  public A withFlexVolume(V1FlexPersistentVolumeSource flexVolume) {
    _visitables.get("flexVolume").remove(this.flexVolume);
    if (flexVolume!=null){ this.flexVolume= new V1FlexPersistentVolumeSourceBuilder(flexVolume); _visitables.get("flexVolume").add(this.flexVolume);} else { this.flexVolume = null; _visitables.get("flexVolume").remove(this.flexVolume); } return (A) this;
  }
  public Boolean hasFlexVolume() {
    return this.flexVolume != null;
  }
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolume() {
    return new V1PersistentVolumeSpecFluentImpl.FlexVolumeNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> withNewFlexVolumeLike(V1FlexPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.FlexVolumeNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> editFlexVolume() {
    return withNewFlexVolumeLike(getFlexVolume());
  }
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolume() {
    return withNewFlexVolumeLike(getFlexVolume() != null ? getFlexVolume(): new V1FlexPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.FlexVolumeNested<A> editOrNewFlexVolumeLike(V1FlexPersistentVolumeSource item) {
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
  public V1PersistentVolumeSpecFluent.FlockerNested<A> withNewFlocker() {
    return new V1PersistentVolumeSpecFluentImpl.FlockerNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.FlockerNested<A> withNewFlockerLike(V1FlockerVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.FlockerNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.FlockerNested<A> editFlocker() {
    return withNewFlockerLike(getFlocker());
  }
  public V1PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlocker() {
    return withNewFlockerLike(getFlocker() != null ? getFlocker(): new V1FlockerVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.FlockerNested<A> editOrNewFlockerLike(V1FlockerVolumeSource item) {
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
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDisk() {
    return new V1PersistentVolumeSpecFluentImpl.GcePersistentDiskNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> withNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.GcePersistentDiskNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editGcePersistentDisk() {
    return withNewGcePersistentDiskLike(getGcePersistentDisk());
  }
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDisk() {
    return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): new V1GCEPersistentDiskVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A> editOrNewGcePersistentDiskLike(V1GCEPersistentDiskVolumeSource item) {
    return withNewGcePersistentDiskLike(getGcePersistentDisk() != null ? getGcePersistentDisk(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1GlusterfsPersistentVolumeSource getGlusterfs() {
    return this.glusterfs!=null ?this.glusterfs.build():null;
  }
  public V1GlusterfsPersistentVolumeSource buildGlusterfs() {
    return this.glusterfs!=null ?this.glusterfs.build():null;
  }
  public A withGlusterfs(V1GlusterfsPersistentVolumeSource glusterfs) {
    _visitables.get("glusterfs").remove(this.glusterfs);
    if (glusterfs!=null){ this.glusterfs= new V1GlusterfsPersistentVolumeSourceBuilder(glusterfs); _visitables.get("glusterfs").add(this.glusterfs);} else { this.glusterfs = null; _visitables.get("glusterfs").remove(this.glusterfs); } return (A) this;
  }
  public Boolean hasGlusterfs() {
    return this.glusterfs != null;
  }
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfs() {
    return new V1PersistentVolumeSpecFluentImpl.GlusterfsNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> withNewGlusterfsLike(V1GlusterfsPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.GlusterfsNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> editGlusterfs() {
    return withNewGlusterfsLike(getGlusterfs());
  }
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfs() {
    return withNewGlusterfsLike(getGlusterfs() != null ? getGlusterfs(): new V1GlusterfsPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.GlusterfsNested<A> editOrNewGlusterfsLike(V1GlusterfsPersistentVolumeSource item) {
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
  public V1PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPath() {
    return new V1PersistentVolumeSpecFluentImpl.HostPathNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.HostPathNested<A> withNewHostPathLike(V1HostPathVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.HostPathNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.HostPathNested<A> editHostPath() {
    return withNewHostPathLike(getHostPath());
  }
  public V1PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPath() {
    return withNewHostPathLike(getHostPath() != null ? getHostPath(): new V1HostPathVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.HostPathNested<A> editOrNewHostPathLike(V1HostPathVolumeSource item) {
    return withNewHostPathLike(getHostPath() != null ? getHostPath(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildIscsi instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ISCSIPersistentVolumeSource getIscsi() {
    return this.iscsi!=null ?this.iscsi.build():null;
  }
  public V1ISCSIPersistentVolumeSource buildIscsi() {
    return this.iscsi!=null ?this.iscsi.build():null;
  }
  public A withIscsi(V1ISCSIPersistentVolumeSource iscsi) {
    _visitables.get("iscsi").remove(this.iscsi);
    if (iscsi!=null){ this.iscsi= new V1ISCSIPersistentVolumeSourceBuilder(iscsi); _visitables.get("iscsi").add(this.iscsi);} else { this.iscsi = null; _visitables.get("iscsi").remove(this.iscsi); } return (A) this;
  }
  public Boolean hasIscsi() {
    return this.iscsi != null;
  }
  public V1PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsi() {
    return new V1PersistentVolumeSpecFluentImpl.IscsiNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.IscsiNested<A> withNewIscsiLike(V1ISCSIPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.IscsiNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.IscsiNested<A> editIscsi() {
    return withNewIscsiLike(getIscsi());
  }
  public V1PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsi() {
    return withNewIscsiLike(getIscsi() != null ? getIscsi(): new V1ISCSIPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.IscsiNested<A> editOrNewIscsiLike(V1ISCSIPersistentVolumeSource item) {
    return withNewIscsiLike(getIscsi() != null ? getIscsi(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildLocal instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1LocalVolumeSource getLocal() {
    return this.local!=null ?this.local.build():null;
  }
  public V1LocalVolumeSource buildLocal() {
    return this.local!=null ?this.local.build():null;
  }
  public A withLocal(V1LocalVolumeSource local) {
    _visitables.get("local").remove(this.local);
    if (local!=null){ this.local= new V1LocalVolumeSourceBuilder(local); _visitables.get("local").add(this.local);} else { this.local = null; _visitables.get("local").remove(this.local); } return (A) this;
  }
  public Boolean hasLocal() {
    return this.local != null;
  }
  public V1PersistentVolumeSpecFluent.LocalNested<A> withNewLocal() {
    return new V1PersistentVolumeSpecFluentImpl.LocalNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.LocalNested<A> withNewLocalLike(V1LocalVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.LocalNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.LocalNested<A> editLocal() {
    return withNewLocalLike(getLocal());
  }
  public V1PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocal() {
    return withNewLocalLike(getLocal() != null ? getLocal(): new V1LocalVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.LocalNested<A> editOrNewLocalLike(V1LocalVolumeSource item) {
    return withNewLocalLike(getLocal() != null ? getLocal(): item);
  }
  public A addToMountOptions(Integer index,String item) {
    if (this.mountOptions == null) {this.mountOptions = new ArrayList<String>();}
    this.mountOptions.add(index, item);
    return (A)this;
  }
  public A setToMountOptions(Integer index,String item) {
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
    for (String item : items) {if (this.mountOptions!= null){ this.mountOptions.remove(item);}} return (A)this;
  }
  public A removeAllFromMountOptions(Collection<String> items) {
    for (String item : items) {if (this.mountOptions!= null){ this.mountOptions.remove(item);}} return (A)this;
  }
  public List<String> getMountOptions() {
    return this.mountOptions;
  }
  public String getMountOption(Integer index) {
    return this.mountOptions.get(index);
  }
  public String getFirstMountOption() {
    return this.mountOptions.get(0);
  }
  public String getLastMountOption() {
    return this.mountOptions.get(mountOptions.size() - 1);
  }
  public String getMatchingMountOption(Predicate<String> predicate) {
    for (String item: mountOptions) { if(predicate.test(item)){ return item;} } return null;
  }
  public Boolean hasMatchingMountOption(Predicate<String> predicate) {
    for (String item: mountOptions) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withMountOptions(List<String> mountOptions) {
    if (mountOptions != null) {this.mountOptions = new ArrayList(); for (String item : mountOptions){this.addToMountOptions(item);}} else { this.mountOptions = null;} return (A) this;
  }
  public A withMountOptions(java.lang.String... mountOptions) {
    if (this.mountOptions != null) {this.mountOptions.clear();}
    if (mountOptions != null) {for (String item :mountOptions){ this.addToMountOptions(item);}} return (A) this;
  }
  public Boolean hasMountOptions() {
    return mountOptions != null && !mountOptions.isEmpty();
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
  public V1PersistentVolumeSpecFluent.NfsNested<A> withNewNfs() {
    return new V1PersistentVolumeSpecFluentImpl.NfsNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.NfsNested<A> withNewNfsLike(V1NFSVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.NfsNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.NfsNested<A> editNfs() {
    return withNewNfsLike(getNfs());
  }
  public V1PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfs() {
    return withNewNfsLike(getNfs() != null ? getNfs(): new V1NFSVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.NfsNested<A> editOrNewNfsLike(V1NFSVolumeSource item) {
    return withNewNfsLike(getNfs() != null ? getNfs(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildNodeAffinity instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1VolumeNodeAffinity getNodeAffinity() {
    return this.nodeAffinity!=null ?this.nodeAffinity.build():null;
  }
  public V1VolumeNodeAffinity buildNodeAffinity() {
    return this.nodeAffinity!=null ?this.nodeAffinity.build():null;
  }
  public A withNodeAffinity(V1VolumeNodeAffinity nodeAffinity) {
    _visitables.get("nodeAffinity").remove(this.nodeAffinity);
    if (nodeAffinity!=null){ this.nodeAffinity= new V1VolumeNodeAffinityBuilder(nodeAffinity); _visitables.get("nodeAffinity").add(this.nodeAffinity);} else { this.nodeAffinity = null; _visitables.get("nodeAffinity").remove(this.nodeAffinity); } return (A) this;
  }
  public Boolean hasNodeAffinity() {
    return this.nodeAffinity != null;
  }
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinity() {
    return new V1PersistentVolumeSpecFluentImpl.NodeAffinityNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> withNewNodeAffinityLike(V1VolumeNodeAffinity item) {
    return new V1PersistentVolumeSpecFluentImpl.NodeAffinityNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> editNodeAffinity() {
    return withNewNodeAffinityLike(getNodeAffinity());
  }
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinity() {
    return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): new V1VolumeNodeAffinityBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.NodeAffinityNested<A> editOrNewNodeAffinityLike(V1VolumeNodeAffinity item) {
    return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity(): item);
  }
  public String getPersistentVolumeReclaimPolicy() {
    return this.persistentVolumeReclaimPolicy;
  }
  public A withPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy=persistentVolumeReclaimPolicy; return (A) this;
  }
  public Boolean hasPersistentVolumeReclaimPolicy() {
    return this.persistentVolumeReclaimPolicy != null;
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
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDisk() {
    return new V1PersistentVolumeSpecFluentImpl.PhotonPersistentDiskNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> withNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.PhotonPersistentDiskNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk());
  }
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk() != null ? getPhotonPersistentDisk(): new V1PhotonPersistentDiskVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<A> editOrNewPhotonPersistentDiskLike(V1PhotonPersistentDiskVolumeSource item) {
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
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolume() {
    return new V1PersistentVolumeSpecFluentImpl.PortworxVolumeNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> withNewPortworxVolumeLike(V1PortworxVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.PortworxVolumeNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> editPortworxVolume() {
    return withNewPortworxVolumeLike(getPortworxVolume());
  }
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolume() {
    return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): new V1PortworxVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.PortworxVolumeNested<A> editOrNewPortworxVolumeLike(V1PortworxVolumeSource item) {
    return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume(): item);
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
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyte() {
    return new V1PersistentVolumeSpecFluentImpl.QuobyteNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> withNewQuobyteLike(V1QuobyteVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.QuobyteNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> editQuobyte() {
    return withNewQuobyteLike(getQuobyte());
  }
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyte() {
    return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): new V1QuobyteVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.QuobyteNested<A> editOrNewQuobyteLike(V1QuobyteVolumeSource item) {
    return withNewQuobyteLike(getQuobyte() != null ? getQuobyte(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildRbd instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1RBDPersistentVolumeSource getRbd() {
    return this.rbd!=null ?this.rbd.build():null;
  }
  public V1RBDPersistentVolumeSource buildRbd() {
    return this.rbd!=null ?this.rbd.build():null;
  }
  public A withRbd(V1RBDPersistentVolumeSource rbd) {
    _visitables.get("rbd").remove(this.rbd);
    if (rbd!=null){ this.rbd= new V1RBDPersistentVolumeSourceBuilder(rbd); _visitables.get("rbd").add(this.rbd);} else { this.rbd = null; _visitables.get("rbd").remove(this.rbd); } return (A) this;
  }
  public Boolean hasRbd() {
    return this.rbd != null;
  }
  public V1PersistentVolumeSpecFluent.RbdNested<A> withNewRbd() {
    return new V1PersistentVolumeSpecFluentImpl.RbdNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.RbdNested<A> withNewRbdLike(V1RBDPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.RbdNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.RbdNested<A> editRbd() {
    return withNewRbdLike(getRbd());
  }
  public V1PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbd() {
    return withNewRbdLike(getRbd() != null ? getRbd(): new V1RBDPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.RbdNested<A> editOrNewRbdLike(V1RBDPersistentVolumeSource item) {
    return withNewRbdLike(getRbd() != null ? getRbd(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ScaleIOPersistentVolumeSource getScaleIO() {
    return this.scaleIO!=null ?this.scaleIO.build():null;
  }
  public V1ScaleIOPersistentVolumeSource buildScaleIO() {
    return this.scaleIO!=null ?this.scaleIO.build():null;
  }
  public A withScaleIO(V1ScaleIOPersistentVolumeSource scaleIO) {
    _visitables.get("scaleIO").remove(this.scaleIO);
    if (scaleIO!=null){ this.scaleIO= new V1ScaleIOPersistentVolumeSourceBuilder(scaleIO); _visitables.get("scaleIO").add(this.scaleIO);} else { this.scaleIO = null; _visitables.get("scaleIO").remove(this.scaleIO); } return (A) this;
  }
  public Boolean hasScaleIO() {
    return this.scaleIO != null;
  }
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIO() {
    return new V1PersistentVolumeSpecFluentImpl.ScaleIONestedImpl();
  }
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> withNewScaleIOLike(V1ScaleIOPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.ScaleIONestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> editScaleIO() {
    return withNewScaleIOLike(getScaleIO());
  }
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIO() {
    return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): new V1ScaleIOPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.ScaleIONested<A> editOrNewScaleIOLike(V1ScaleIOPersistentVolumeSource item) {
    return withNewScaleIOLike(getScaleIO() != null ? getScaleIO(): item);
  }
  public String getStorageClassName() {
    return this.storageClassName;
  }
  public A withStorageClassName(String storageClassName) {
    this.storageClassName=storageClassName; return (A) this;
  }
  public Boolean hasStorageClassName() {
    return this.storageClassName != null;
  }
  
  /**
   * This method has been deprecated, please use method buildStorageos instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1StorageOSPersistentVolumeSource getStorageos() {
    return this.storageos!=null ?this.storageos.build():null;
  }
  public V1StorageOSPersistentVolumeSource buildStorageos() {
    return this.storageos!=null ?this.storageos.build():null;
  }
  public A withStorageos(V1StorageOSPersistentVolumeSource storageos) {
    _visitables.get("storageos").remove(this.storageos);
    if (storageos!=null){ this.storageos= new V1StorageOSPersistentVolumeSourceBuilder(storageos); _visitables.get("storageos").add(this.storageos);} else { this.storageos = null; _visitables.get("storageos").remove(this.storageos); } return (A) this;
  }
  public Boolean hasStorageos() {
    return this.storageos != null;
  }
  public V1PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageos() {
    return new V1PersistentVolumeSpecFluentImpl.StorageosNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.StorageosNested<A> withNewStorageosLike(V1StorageOSPersistentVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.StorageosNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.StorageosNested<A> editStorageos() {
    return withNewStorageosLike(getStorageos());
  }
  public V1PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageos() {
    return withNewStorageosLike(getStorageos() != null ? getStorageos(): new V1StorageOSPersistentVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.StorageosNested<A> editOrNewStorageosLike(V1StorageOSPersistentVolumeSource item) {
    return withNewStorageosLike(getStorageos() != null ? getStorageos(): item);
  }
  public String getVolumeMode() {
    return this.volumeMode;
  }
  public A withVolumeMode(String volumeMode) {
    this.volumeMode=volumeMode; return (A) this;
  }
  public Boolean hasVolumeMode() {
    return this.volumeMode != null;
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
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolume() {
    return new V1PersistentVolumeSpecFluentImpl.VsphereVolumeNestedImpl();
  }
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> withNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item) {
    return new V1PersistentVolumeSpecFluentImpl.VsphereVolumeNestedImpl(item);
  }
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> editVsphereVolume() {
    return withNewVsphereVolumeLike(getVsphereVolume());
  }
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolume() {
    return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): new V1VsphereVirtualDiskVolumeSourceBuilder().build());
  }
  public V1PersistentVolumeSpecFluent.VsphereVolumeNested<A> editOrNewVsphereVolumeLike(V1VsphereVirtualDiskVolumeSource item) {
    return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeSpecFluentImpl that = (V1PersistentVolumeSpecFluentImpl) o;
    if (accessModes != null ? !accessModes.equals(that.accessModes) :that.accessModes != null) return false;
    if (awsElasticBlockStore != null ? !awsElasticBlockStore.equals(that.awsElasticBlockStore) :that.awsElasticBlockStore != null) return false;
    if (azureDisk != null ? !azureDisk.equals(that.azureDisk) :that.azureDisk != null) return false;
    if (azureFile != null ? !azureFile.equals(that.azureFile) :that.azureFile != null) return false;
    if (capacity != null ? !capacity.equals(that.capacity) :that.capacity != null) return false;
    if (cephfs != null ? !cephfs.equals(that.cephfs) :that.cephfs != null) return false;
    if (cinder != null ? !cinder.equals(that.cinder) :that.cinder != null) return false;
    if (claimRef != null ? !claimRef.equals(that.claimRef) :that.claimRef != null) return false;
    if (csi != null ? !csi.equals(that.csi) :that.csi != null) return false;
    if (fc != null ? !fc.equals(that.fc) :that.fc != null) return false;
    if (flexVolume != null ? !flexVolume.equals(that.flexVolume) :that.flexVolume != null) return false;
    if (flocker != null ? !flocker.equals(that.flocker) :that.flocker != null) return false;
    if (gcePersistentDisk != null ? !gcePersistentDisk.equals(that.gcePersistentDisk) :that.gcePersistentDisk != null) return false;
    if (glusterfs != null ? !glusterfs.equals(that.glusterfs) :that.glusterfs != null) return false;
    if (hostPath != null ? !hostPath.equals(that.hostPath) :that.hostPath != null) return false;
    if (iscsi != null ? !iscsi.equals(that.iscsi) :that.iscsi != null) return false;
    if (local != null ? !local.equals(that.local) :that.local != null) return false;
    if (mountOptions != null ? !mountOptions.equals(that.mountOptions) :that.mountOptions != null) return false;
    if (nfs != null ? !nfs.equals(that.nfs) :that.nfs != null) return false;
    if (nodeAffinity != null ? !nodeAffinity.equals(that.nodeAffinity) :that.nodeAffinity != null) return false;
    if (persistentVolumeReclaimPolicy != null ? !persistentVolumeReclaimPolicy.equals(that.persistentVolumeReclaimPolicy) :that.persistentVolumeReclaimPolicy != null) return false;
    if (photonPersistentDisk != null ? !photonPersistentDisk.equals(that.photonPersistentDisk) :that.photonPersistentDisk != null) return false;
    if (portworxVolume != null ? !portworxVolume.equals(that.portworxVolume) :that.portworxVolume != null) return false;
    if (quobyte != null ? !quobyte.equals(that.quobyte) :that.quobyte != null) return false;
    if (rbd != null ? !rbd.equals(that.rbd) :that.rbd != null) return false;
    if (scaleIO != null ? !scaleIO.equals(that.scaleIO) :that.scaleIO != null) return false;
    if (storageClassName != null ? !storageClassName.equals(that.storageClassName) :that.storageClassName != null) return false;
    if (storageos != null ? !storageos.equals(that.storageos) :that.storageos != null) return false;
    if (volumeMode != null ? !volumeMode.equals(that.volumeMode) :that.volumeMode != null) return false;
    if (vsphereVolume != null ? !vsphereVolume.equals(that.vsphereVolume) :that.vsphereVolume != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(accessModes,  awsElasticBlockStore,  azureDisk,  azureFile,  capacity,  cephfs,  cinder,  claimRef,  csi,  fc,  flexVolume,  flocker,  gcePersistentDisk,  glusterfs,  hostPath,  iscsi,  local,  mountOptions,  nfs,  nodeAffinity,  persistentVolumeReclaimPolicy,  photonPersistentDisk,  portworxVolume,  quobyte,  rbd,  scaleIO,  storageClassName,  storageos,  volumeMode,  vsphereVolume,  super.hashCode());
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
    if (volumeMode != null) { sb.append("volumeMode:"); sb.append(volumeMode + ","); }
    if (vsphereVolume != null) { sb.append("vsphereVolume:"); sb.append(vsphereVolume); }
    sb.append("}");
    return sb.toString();
  }
  class AwsElasticBlockStoreNestedImpl<N> extends V1AWSElasticBlockStoreVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<N>> implements V1PersistentVolumeSpecFluent.AwsElasticBlockStoreNested<N>,Nested<N>{
    AwsElasticBlockStoreNestedImpl(V1AWSElasticBlockStoreVolumeSource item) {
      this.builder = new V1AWSElasticBlockStoreVolumeSourceBuilder(this, item);
    }
    AwsElasticBlockStoreNestedImpl() {
      this.builder = new V1AWSElasticBlockStoreVolumeSourceBuilder(this);
    }
    V1AWSElasticBlockStoreVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withAwsElasticBlockStore(builder.build());
    }
    public N endAwsElasticBlockStore() {
      return and();
    }
    
  }
  class AzureDiskNestedImpl<N> extends V1AzureDiskVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.AzureDiskNested<N>> implements V1PersistentVolumeSpecFluent.AzureDiskNested<N>,Nested<N>{
    AzureDiskNestedImpl(V1AzureDiskVolumeSource item) {
      this.builder = new V1AzureDiskVolumeSourceBuilder(this, item);
    }
    AzureDiskNestedImpl() {
      this.builder = new V1AzureDiskVolumeSourceBuilder(this);
    }
    V1AzureDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withAzureDisk(builder.build());
    }
    public N endAzureDisk() {
      return and();
    }
    
  }
  class AzureFileNestedImpl<N> extends V1AzureFilePersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.AzureFileNested<N>> implements V1PersistentVolumeSpecFluent.AzureFileNested<N>,Nested<N>{
    AzureFileNestedImpl(V1AzureFilePersistentVolumeSource item) {
      this.builder = new V1AzureFilePersistentVolumeSourceBuilder(this, item);
    }
    AzureFileNestedImpl() {
      this.builder = new V1AzureFilePersistentVolumeSourceBuilder(this);
    }
    V1AzureFilePersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withAzureFile(builder.build());
    }
    public N endAzureFile() {
      return and();
    }
    
  }
  class CephfsNestedImpl<N> extends V1CephFSPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.CephfsNested<N>> implements V1PersistentVolumeSpecFluent.CephfsNested<N>,Nested<N>{
    CephfsNestedImpl(V1CephFSPersistentVolumeSource item) {
      this.builder = new V1CephFSPersistentVolumeSourceBuilder(this, item);
    }
    CephfsNestedImpl() {
      this.builder = new V1CephFSPersistentVolumeSourceBuilder(this);
    }
    V1CephFSPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withCephfs(builder.build());
    }
    public N endCephfs() {
      return and();
    }
    
  }
  class CinderNestedImpl<N> extends V1CinderPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.CinderNested<N>> implements V1PersistentVolumeSpecFluent.CinderNested<N>,Nested<N>{
    CinderNestedImpl(V1CinderPersistentVolumeSource item) {
      this.builder = new V1CinderPersistentVolumeSourceBuilder(this, item);
    }
    CinderNestedImpl() {
      this.builder = new V1CinderPersistentVolumeSourceBuilder(this);
    }
    V1CinderPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withCinder(builder.build());
    }
    public N endCinder() {
      return and();
    }
    
  }
  class ClaimRefNestedImpl<N> extends V1ObjectReferenceFluentImpl<V1PersistentVolumeSpecFluent.ClaimRefNested<N>> implements V1PersistentVolumeSpecFluent.ClaimRefNested<N>,Nested<N>{
    ClaimRefNestedImpl(V1ObjectReference item) {
      this.builder = new V1ObjectReferenceBuilder(this, item);
    }
    ClaimRefNestedImpl() {
      this.builder = new V1ObjectReferenceBuilder(this);
    }
    V1ObjectReferenceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withClaimRef(builder.build());
    }
    public N endClaimRef() {
      return and();
    }
    
  }
  class CsiNestedImpl<N> extends V1CSIPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.CsiNested<N>> implements V1PersistentVolumeSpecFluent.CsiNested<N>,Nested<N>{
    CsiNestedImpl(V1CSIPersistentVolumeSource item) {
      this.builder = new V1CSIPersistentVolumeSourceBuilder(this, item);
    }
    CsiNestedImpl() {
      this.builder = new V1CSIPersistentVolumeSourceBuilder(this);
    }
    V1CSIPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withCsi(builder.build());
    }
    public N endCsi() {
      return and();
    }
    
  }
  class FcNestedImpl<N> extends V1FCVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.FcNested<N>> implements V1PersistentVolumeSpecFluent.FcNested<N>,Nested<N>{
    FcNestedImpl(V1FCVolumeSource item) {
      this.builder = new V1FCVolumeSourceBuilder(this, item);
    }
    FcNestedImpl() {
      this.builder = new V1FCVolumeSourceBuilder(this);
    }
    V1FCVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withFc(builder.build());
    }
    public N endFc() {
      return and();
    }
    
  }
  class FlexVolumeNestedImpl<N> extends V1FlexPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.FlexVolumeNested<N>> implements V1PersistentVolumeSpecFluent.FlexVolumeNested<N>,Nested<N>{
    FlexVolumeNestedImpl(V1FlexPersistentVolumeSource item) {
      this.builder = new V1FlexPersistentVolumeSourceBuilder(this, item);
    }
    FlexVolumeNestedImpl() {
      this.builder = new V1FlexPersistentVolumeSourceBuilder(this);
    }
    V1FlexPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withFlexVolume(builder.build());
    }
    public N endFlexVolume() {
      return and();
    }
    
  }
  class FlockerNestedImpl<N> extends V1FlockerVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.FlockerNested<N>> implements V1PersistentVolumeSpecFluent.FlockerNested<N>,Nested<N>{
    FlockerNestedImpl(V1FlockerVolumeSource item) {
      this.builder = new V1FlockerVolumeSourceBuilder(this, item);
    }
    FlockerNestedImpl() {
      this.builder = new V1FlockerVolumeSourceBuilder(this);
    }
    V1FlockerVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withFlocker(builder.build());
    }
    public N endFlocker() {
      return and();
    }
    
  }
  class GcePersistentDiskNestedImpl<N> extends V1GCEPersistentDiskVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.GcePersistentDiskNested<N>> implements V1PersistentVolumeSpecFluent.GcePersistentDiskNested<N>,Nested<N>{
    GcePersistentDiskNestedImpl(V1GCEPersistentDiskVolumeSource item) {
      this.builder = new V1GCEPersistentDiskVolumeSourceBuilder(this, item);
    }
    GcePersistentDiskNestedImpl() {
      this.builder = new V1GCEPersistentDiskVolumeSourceBuilder(this);
    }
    V1GCEPersistentDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withGcePersistentDisk(builder.build());
    }
    public N endGcePersistentDisk() {
      return and();
    }
    
  }
  class GlusterfsNestedImpl<N> extends V1GlusterfsPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.GlusterfsNested<N>> implements V1PersistentVolumeSpecFluent.GlusterfsNested<N>,Nested<N>{
    GlusterfsNestedImpl(V1GlusterfsPersistentVolumeSource item) {
      this.builder = new V1GlusterfsPersistentVolumeSourceBuilder(this, item);
    }
    GlusterfsNestedImpl() {
      this.builder = new V1GlusterfsPersistentVolumeSourceBuilder(this);
    }
    V1GlusterfsPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withGlusterfs(builder.build());
    }
    public N endGlusterfs() {
      return and();
    }
    
  }
  class HostPathNestedImpl<N> extends V1HostPathVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.HostPathNested<N>> implements V1PersistentVolumeSpecFluent.HostPathNested<N>,Nested<N>{
    HostPathNestedImpl(V1HostPathVolumeSource item) {
      this.builder = new V1HostPathVolumeSourceBuilder(this, item);
    }
    HostPathNestedImpl() {
      this.builder = new V1HostPathVolumeSourceBuilder(this);
    }
    V1HostPathVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withHostPath(builder.build());
    }
    public N endHostPath() {
      return and();
    }
    
  }
  class IscsiNestedImpl<N> extends V1ISCSIPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.IscsiNested<N>> implements V1PersistentVolumeSpecFluent.IscsiNested<N>,Nested<N>{
    IscsiNestedImpl(V1ISCSIPersistentVolumeSource item) {
      this.builder = new V1ISCSIPersistentVolumeSourceBuilder(this, item);
    }
    IscsiNestedImpl() {
      this.builder = new V1ISCSIPersistentVolumeSourceBuilder(this);
    }
    V1ISCSIPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withIscsi(builder.build());
    }
    public N endIscsi() {
      return and();
    }
    
  }
  class LocalNestedImpl<N> extends V1LocalVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.LocalNested<N>> implements V1PersistentVolumeSpecFluent.LocalNested<N>,Nested<N>{
    LocalNestedImpl(V1LocalVolumeSource item) {
      this.builder = new V1LocalVolumeSourceBuilder(this, item);
    }
    LocalNestedImpl() {
      this.builder = new V1LocalVolumeSourceBuilder(this);
    }
    V1LocalVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withLocal(builder.build());
    }
    public N endLocal() {
      return and();
    }
    
  }
  class NfsNestedImpl<N> extends V1NFSVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.NfsNested<N>> implements V1PersistentVolumeSpecFluent.NfsNested<N>,Nested<N>{
    NfsNestedImpl(V1NFSVolumeSource item) {
      this.builder = new V1NFSVolumeSourceBuilder(this, item);
    }
    NfsNestedImpl() {
      this.builder = new V1NFSVolumeSourceBuilder(this);
    }
    V1NFSVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withNfs(builder.build());
    }
    public N endNfs() {
      return and();
    }
    
  }
  class NodeAffinityNestedImpl<N> extends V1VolumeNodeAffinityFluentImpl<V1PersistentVolumeSpecFluent.NodeAffinityNested<N>> implements V1PersistentVolumeSpecFluent.NodeAffinityNested<N>,Nested<N>{
    NodeAffinityNestedImpl(V1VolumeNodeAffinity item) {
      this.builder = new V1VolumeNodeAffinityBuilder(this, item);
    }
    NodeAffinityNestedImpl() {
      this.builder = new V1VolumeNodeAffinityBuilder(this);
    }
    V1VolumeNodeAffinityBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withNodeAffinity(builder.build());
    }
    public N endNodeAffinity() {
      return and();
    }
    
  }
  class PhotonPersistentDiskNestedImpl<N> extends V1PhotonPersistentDiskVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<N>> implements V1PersistentVolumeSpecFluent.PhotonPersistentDiskNested<N>,Nested<N>{
    PhotonPersistentDiskNestedImpl(V1PhotonPersistentDiskVolumeSource item) {
      this.builder = new V1PhotonPersistentDiskVolumeSourceBuilder(this, item);
    }
    PhotonPersistentDiskNestedImpl() {
      this.builder = new V1PhotonPersistentDiskVolumeSourceBuilder(this);
    }
    V1PhotonPersistentDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withPhotonPersistentDisk(builder.build());
    }
    public N endPhotonPersistentDisk() {
      return and();
    }
    
  }
  class PortworxVolumeNestedImpl<N> extends V1PortworxVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.PortworxVolumeNested<N>> implements V1PersistentVolumeSpecFluent.PortworxVolumeNested<N>,Nested<N>{
    PortworxVolumeNestedImpl(V1PortworxVolumeSource item) {
      this.builder = new V1PortworxVolumeSourceBuilder(this, item);
    }
    PortworxVolumeNestedImpl() {
      this.builder = new V1PortworxVolumeSourceBuilder(this);
    }
    V1PortworxVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withPortworxVolume(builder.build());
    }
    public N endPortworxVolume() {
      return and();
    }
    
  }
  class QuobyteNestedImpl<N> extends V1QuobyteVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.QuobyteNested<N>> implements V1PersistentVolumeSpecFluent.QuobyteNested<N>,Nested<N>{
    QuobyteNestedImpl(V1QuobyteVolumeSource item) {
      this.builder = new V1QuobyteVolumeSourceBuilder(this, item);
    }
    QuobyteNestedImpl() {
      this.builder = new V1QuobyteVolumeSourceBuilder(this);
    }
    V1QuobyteVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withQuobyte(builder.build());
    }
    public N endQuobyte() {
      return and();
    }
    
  }
  class RbdNestedImpl<N> extends V1RBDPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.RbdNested<N>> implements V1PersistentVolumeSpecFluent.RbdNested<N>,Nested<N>{
    RbdNestedImpl(V1RBDPersistentVolumeSource item) {
      this.builder = new V1RBDPersistentVolumeSourceBuilder(this, item);
    }
    RbdNestedImpl() {
      this.builder = new V1RBDPersistentVolumeSourceBuilder(this);
    }
    V1RBDPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withRbd(builder.build());
    }
    public N endRbd() {
      return and();
    }
    
  }
  class ScaleIONestedImpl<N> extends V1ScaleIOPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.ScaleIONested<N>> implements V1PersistentVolumeSpecFluent.ScaleIONested<N>,Nested<N>{
    ScaleIONestedImpl(V1ScaleIOPersistentVolumeSource item) {
      this.builder = new V1ScaleIOPersistentVolumeSourceBuilder(this, item);
    }
    ScaleIONestedImpl() {
      this.builder = new V1ScaleIOPersistentVolumeSourceBuilder(this);
    }
    V1ScaleIOPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withScaleIO(builder.build());
    }
    public N endScaleIO() {
      return and();
    }
    
  }
  class StorageosNestedImpl<N> extends V1StorageOSPersistentVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.StorageosNested<N>> implements V1PersistentVolumeSpecFluent.StorageosNested<N>,Nested<N>{
    StorageosNestedImpl(V1StorageOSPersistentVolumeSource item) {
      this.builder = new V1StorageOSPersistentVolumeSourceBuilder(this, item);
    }
    StorageosNestedImpl() {
      this.builder = new V1StorageOSPersistentVolumeSourceBuilder(this);
    }
    V1StorageOSPersistentVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withStorageos(builder.build());
    }
    public N endStorageos() {
      return and();
    }
    
  }
  class VsphereVolumeNestedImpl<N> extends V1VsphereVirtualDiskVolumeSourceFluentImpl<V1PersistentVolumeSpecFluent.VsphereVolumeNested<N>> implements V1PersistentVolumeSpecFluent.VsphereVolumeNested<N>,Nested<N>{
    VsphereVolumeNestedImpl(V1VsphereVirtualDiskVolumeSource item) {
      this.builder = new V1VsphereVirtualDiskVolumeSourceBuilder(this, item);
    }
    VsphereVolumeNestedImpl() {
      this.builder = new V1VsphereVirtualDiskVolumeSourceBuilder(this);
    }
    V1VsphereVirtualDiskVolumeSourceBuilder builder;
    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withVsphereVolume(builder.build());
    }
    public N endVsphereVolume() {
      return and();
    }
    
  }
  
}