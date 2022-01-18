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
public class V1PersistentVolumeSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent<A> {
  public V1PersistentVolumeSpecFluentImpl() {}

  public V1PersistentVolumeSpecFluentImpl(
      io.kubernetes.client.openapi.models.V1PersistentVolumeSpec instance) {
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

  private java.util.List<java.lang.String> accessModes;
  private io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder
      awsElasticBlockStore;
  private io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder azureDisk;
  private io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder azureFile;
  private java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity;
  private io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder cephfs;
  private io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceBuilder cinder;
  private io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder claimRef;
  private io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder csi;
  private io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder fc;
  private io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceBuilder flexVolume;
  private io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder flocker;
  private io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder
      gcePersistentDisk;
  private io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder glusterfs;
  private io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder hostPath;
  private io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder iscsi;
  private io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder local;
  private java.util.List<java.lang.String> mountOptions;
  private io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder nfs;
  private io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder nodeAffinity;
  private io.kubernetes.client.openapi.models.V1PersistentVolumeSpec
          .PersistentVolumeReclaimPolicyEnum
      persistentVolumeReclaimPolicy;
  private io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder
      photonPersistentDisk;
  private io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder portworxVolume;
  private io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder quobyte;
  private io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder rbd;
  private io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder scaleIO;
  private java.lang.String storageClassName;
  private io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder storageos;
  private java.lang.String volumeMode;
  private io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder vsphereVolume;

  public A addToAccessModes(java.lang.Integer index, java.lang.String item) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    this.accessModes.add(index, item);
    return (A) this;
  }

  public A setToAccessModes(java.lang.Integer index, java.lang.String item) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    this.accessModes.set(index, item);
    return (A) this;
  }

  public A addToAccessModes(java.lang.String... items) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.accessModes.add(item);
    }
    return (A) this;
  }

  public A addAllToAccessModes(java.util.Collection<java.lang.String> items) {
    if (this.accessModes == null) {
      this.accessModes = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.accessModes.add(item);
    }
    return (A) this;
  }

  public A removeFromAccessModes(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.accessModes != null) {
        this.accessModes.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromAccessModes(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.accessModes != null) {
        this.accessModes.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getAccessModes() {
    return this.accessModes;
  }

  public java.lang.String getAccessMode(java.lang.Integer index) {
    return this.accessModes.get(index);
  }

  public java.lang.String getFirstAccessMode() {
    return this.accessModes.get(0);
  }

  public java.lang.String getLastAccessMode() {
    return this.accessModes.get(accessModes.size() - 1);
  }

  public java.lang.String getMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : accessModes) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingAccessMode(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : accessModes) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withAccessModes(java.util.List<java.lang.String> accessModes) {
    if (accessModes != null) {
      this.accessModes = new java.util.ArrayList();
      for (java.lang.String item : accessModes) {
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
    }
    if (accessModes != null) {
      for (java.lang.String item : accessModes) {
        this.addToAccessModes(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasAccessModes() {
    return accessModes != null && !accessModes.isEmpty();
  }

  public A addNewAccessMode(java.lang.String original) {
    return (A) addToAccessModes(new String(original));
  }

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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      withNewAwsElasticBlockStore() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .AwsElasticBlockStoreNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      withNewAwsElasticBlockStoreLike(
          io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .AwsElasticBlockStoreNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      editAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(getAwsElasticBlockStore());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
      editOrNewAwsElasticBlockStore() {
    return withNewAwsElasticBlockStoreLike(
        getAwsElasticBlockStore() != null
            ? getAwsElasticBlockStore()
            : new io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .AwsElasticBlockStoreNested<
          A>
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      withNewAzureDisk() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .AzureDiskNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      withNewAzureDiskLike(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .AzureDiskNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      editAzureDisk() {
    return withNewAzureDiskLike(getAzureDisk());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      editOrNewAzureDisk() {
    return withNewAzureDiskLike(
        getAzureDisk() != null
            ? getAzureDisk()
            : new io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<A>
      editOrNewAzureDiskLike(io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource item) {
    return withNewAzureDiskLike(getAzureDisk() != null ? getAzureDisk() : item);
  }

  /**
   * This method has been deprecated, please use method buildAzureFile instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource getAzureFile() {
    return this.azureFile != null ? this.azureFile.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource buildAzureFile() {
    return this.azureFile != null ? this.azureFile.build() : null;
  }

  public A withAzureFile(
      io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource azureFile) {
    _visitables.get("azureFile").remove(this.azureFile);
    if (azureFile != null) {
      this.azureFile =
          new io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder(
              azureFile);
      _visitables.get("azureFile").add(this.azureFile);
    }
    return (A) this;
  }

  public java.lang.Boolean hasAzureFile() {
    return this.azureFile != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      withNewAzureFile() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .AzureFileNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      withNewAzureFileLike(
          io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .AzureFileNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      editAzureFile() {
    return withNewAzureFileLike(getAzureFile());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      editOrNewAzureFile() {
    return withNewAzureFileLike(
        getAzureFile() != null
            ? getAzureFile()
            : new io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<A>
      editOrNewAzureFileLike(
          io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource item) {
    return withNewAzureFileLike(getAzureFile() != null ? getAzureFile() : item);
  }

  public A addToCapacity(java.lang.String key, io.kubernetes.client.custom.Quantity value) {
    if (this.capacity == null && key != null && value != null) {
      this.capacity = new java.util.LinkedHashMap();
    }
    if (key != null && value != null) {
      this.capacity.put(key, value);
    }
    return (A) this;
  }

  public A addToCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.capacity == null && map != null) {
      this.capacity = new java.util.LinkedHashMap();
    }
    if (map != null) {
      this.capacity.putAll(map);
    }
    return (A) this;
  }

  public A removeFromCapacity(java.lang.String key) {
    if (this.capacity == null) {
      return (A) this;
    }
    if (key != null && this.capacity != null) {
      this.capacity.remove(key);
    }
    return (A) this;
  }

  public A removeFromCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> map) {
    if (this.capacity == null) {
      return (A) this;
    }
    if (map != null) {
      for (Object key : map.keySet()) {
        if (this.capacity != null) {
          this.capacity.remove(key);
        }
      }
    }
    return (A) this;
  }

  public java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> getCapacity() {
    return this.capacity;
  }

  public <K, V> A withCapacity(
      java.util.Map<java.lang.String, io.kubernetes.client.custom.Quantity> capacity) {
    if (capacity == null) {
      this.capacity = null;
    } else {
      this.capacity = new java.util.LinkedHashMap(capacity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCapacity() {
    return this.capacity != null;
  }

  /**
   * This method has been deprecated, please use method buildCephfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource getCephfs() {
    return this.cephfs != null ? this.cephfs.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource buildCephfs() {
    return this.cephfs != null ? this.cephfs.build() : null;
  }

  public A withCephfs(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource cephfs) {
    _visitables.get("cephfs").remove(this.cephfs);
    if (cephfs != null) {
      this.cephfs =
          new io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder(cephfs);
      _visitables.get("cephfs").add(this.cephfs);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCephfs() {
    return this.cephfs != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      withNewCephfs() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .CephfsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      withNewCephfsLike(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .CephfsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      editCephfs() {
    return withNewCephfsLike(getCephfs());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      editOrNewCephfs() {
    return withNewCephfsLike(
        getCephfs() != null
            ? getCephfs()
            : new io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<A>
      editOrNewCephfsLike(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource item) {
    return withNewCephfsLike(getCephfs() != null ? getCephfs() : item);
  }

  /**
   * This method has been deprecated, please use method buildCinder instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource getCinder() {
    return this.cinder != null ? this.cinder.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource buildCinder() {
    return this.cinder != null ? this.cinder.build() : null;
  }

  public A withCinder(io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource cinder) {
    _visitables.get("cinder").remove(this.cinder);
    if (cinder != null) {
      this.cinder =
          new io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceBuilder(cinder);
      _visitables.get("cinder").add(this.cinder);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCinder() {
    return this.cinder != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      withNewCinder() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .CinderNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      withNewCinderLike(io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .CinderNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      editCinder() {
    return withNewCinderLike(getCinder());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      editOrNewCinder() {
    return withNewCinderLike(
        getCinder() != null
            ? getCinder()
            : new io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<A>
      editOrNewCinderLike(io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource item) {
    return withNewCinderLike(getCinder() != null ? getCinder() : item);
  }

  /**
   * This method has been deprecated, please use method buildClaimRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectReference getClaimRef() {
    return this.claimRef != null ? this.claimRef.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ObjectReference buildClaimRef() {
    return this.claimRef != null ? this.claimRef.build() : null;
  }

  public A withClaimRef(io.kubernetes.client.openapi.models.V1ObjectReference claimRef) {
    _visitables.get("claimRef").remove(this.claimRef);
    if (claimRef != null) {
      this.claimRef = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(claimRef);
      _visitables.get("claimRef").add(this.claimRef);
    }
    return (A) this;
  }

  public java.lang.Boolean hasClaimRef() {
    return this.claimRef != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      withNewClaimRef() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .ClaimRefNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      withNewClaimRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .ClaimRefNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      editClaimRef() {
    return withNewClaimRefLike(getClaimRef());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      editOrNewClaimRef() {
    return withNewClaimRefLike(
        getClaimRef() != null
            ? getClaimRef()
            : new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<A>
      editOrNewClaimRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item) {
    return withNewClaimRefLike(getClaimRef() != null ? getClaimRef() : item);
  }

  /**
   * This method has been deprecated, please use method buildCsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource getCsi() {
    return this.csi != null ? this.csi.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource buildCsi() {
    return this.csi != null ? this.csi.build() : null;
  }

  public A withCsi(io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource csi) {
    _visitables.get("csi").remove(this.csi);
    if (csi != null) {
      this.csi = new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder(csi);
      _visitables.get("csi").add(this.csi);
    }
    return (A) this;
  }

  public java.lang.Boolean hasCsi() {
    return this.csi != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A>
      withNewCsi() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.CsiNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A>
      withNewCsiLike(io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.CsiNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A> editCsi() {
    return withNewCsiLike(getCsi());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A>
      editOrNewCsi() {
    return withNewCsiLike(
        getCsi() != null
            ? getCsi()
            : new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<A>
      editOrNewCsiLike(io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource item) {
    return withNewCsiLike(getCsi() != null ? getCsi() : item);
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A> withNewFc() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.FcNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A> withNewFcLike(
      io.kubernetes.client.openapi.models.V1FCVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.FcNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A> editFc() {
    return withNewFcLike(getFc());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A>
      editOrNewFc() {
    return withNewFcLike(
        getFc() != null
            ? getFc()
            : new io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<A>
      editOrNewFcLike(io.kubernetes.client.openapi.models.V1FCVolumeSource item) {
    return withNewFcLike(getFc() != null ? getFc() : item);
  }

  /**
   * This method has been deprecated, please use method buildFlexVolume instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource getFlexVolume() {
    return this.flexVolume != null ? this.flexVolume.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource buildFlexVolume() {
    return this.flexVolume != null ? this.flexVolume.build() : null;
  }

  public A withFlexVolume(
      io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource flexVolume) {
    _visitables.get("flexVolume").remove(this.flexVolume);
    if (flexVolume != null) {
      this.flexVolume =
          new io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceBuilder(flexVolume);
      _visitables.get("flexVolume").add(this.flexVolume);
    }
    return (A) this;
  }

  public java.lang.Boolean hasFlexVolume() {
    return this.flexVolume != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      withNewFlexVolume() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .FlexVolumeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      withNewFlexVolumeLike(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .FlexVolumeNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      editFlexVolume() {
    return withNewFlexVolumeLike(getFlexVolume());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      editOrNewFlexVolume() {
    return withNewFlexVolumeLike(
        getFlexVolume() != null
            ? getFlexVolume()
            : new io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<A>
      editOrNewFlexVolumeLike(
          io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource item) {
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      withNewFlocker() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .FlockerNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      withNewFlockerLike(io.kubernetes.client.openapi.models.V1FlockerVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .FlockerNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      editFlocker() {
    return withNewFlockerLike(getFlocker());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      editOrNewFlocker() {
    return withNewFlockerLike(
        getFlocker() != null
            ? getFlocker()
            : new io.kubernetes.client.openapi.models.V1FlockerVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<A>
      editOrNewFlockerLike(io.kubernetes.client.openapi.models.V1FlockerVolumeSource item) {
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDisk() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .GcePersistentDiskNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      withNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .GcePersistentDiskNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      editGcePersistentDisk() {
    return withNewGcePersistentDiskLike(getGcePersistentDisk());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDisk() {
    return withNewGcePersistentDiskLike(
        getGcePersistentDisk() != null
            ? getGcePersistentDisk()
            : new io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<A>
      editOrNewGcePersistentDiskLike(
          io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource item) {
    return withNewGcePersistentDiskLike(
        getGcePersistentDisk() != null ? getGcePersistentDisk() : item);
  }

  /**
   * This method has been deprecated, please use method buildGlusterfs instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource getGlusterfs() {
    return this.glusterfs != null ? this.glusterfs.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource buildGlusterfs() {
    return this.glusterfs != null ? this.glusterfs.build() : null;
  }

  public A withGlusterfs(
      io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource glusterfs) {
    _visitables.get("glusterfs").remove(this.glusterfs);
    if (glusterfs != null) {
      this.glusterfs =
          new io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder(
              glusterfs);
      _visitables.get("glusterfs").add(this.glusterfs);
    }
    return (A) this;
  }

  public java.lang.Boolean hasGlusterfs() {
    return this.glusterfs != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      withNewGlusterfs() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .GlusterfsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      withNewGlusterfsLike(
          io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .GlusterfsNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      editGlusterfs() {
    return withNewGlusterfsLike(getGlusterfs());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      editOrNewGlusterfs() {
    return withNewGlusterfsLike(
        getGlusterfs() != null
            ? getGlusterfs()
            : new io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<A>
      editOrNewGlusterfsLike(
          io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource item) {
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      withNewHostPath() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .HostPathNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      withNewHostPathLike(io.kubernetes.client.openapi.models.V1HostPathVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .HostPathNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      editHostPath() {
    return withNewHostPathLike(getHostPath());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      editOrNewHostPath() {
    return withNewHostPathLike(
        getHostPath() != null
            ? getHostPath()
            : new io.kubernetes.client.openapi.models.V1HostPathVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<A>
      editOrNewHostPathLike(io.kubernetes.client.openapi.models.V1HostPathVolumeSource item) {
    return withNewHostPathLike(getHostPath() != null ? getHostPath() : item);
  }

  /**
   * This method has been deprecated, please use method buildIscsi instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource getIscsi() {
    return this.iscsi != null ? this.iscsi.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource buildIscsi() {
    return this.iscsi != null ? this.iscsi.build() : null;
  }

  public A withIscsi(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource iscsi) {
    _visitables.get("iscsi").remove(this.iscsi);
    if (iscsi != null) {
      this.iscsi =
          new io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder(iscsi);
      _visitables.get("iscsi").add(this.iscsi);
    }
    return (A) this;
  }

  public java.lang.Boolean hasIscsi() {
    return this.iscsi != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      withNewIscsi() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .IscsiNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      withNewIscsiLike(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.IscsiNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      editIscsi() {
    return withNewIscsiLike(getIscsi());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      editOrNewIscsi() {
    return withNewIscsiLike(
        getIscsi() != null
            ? getIscsi()
            : new io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<A>
      editOrNewIscsiLike(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource item) {
    return withNewIscsiLike(getIscsi() != null ? getIscsi() : item);
  }

  /**
   * This method has been deprecated, please use method buildLocal instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1LocalVolumeSource getLocal() {
    return this.local != null ? this.local.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1LocalVolumeSource buildLocal() {
    return this.local != null ? this.local.build() : null;
  }

  public A withLocal(io.kubernetes.client.openapi.models.V1LocalVolumeSource local) {
    _visitables.get("local").remove(this.local);
    if (local != null) {
      this.local = new io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder(local);
      _visitables.get("local").add(this.local);
    }
    return (A) this;
  }

  public java.lang.Boolean hasLocal() {
    return this.local != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      withNewLocal() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .LocalNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      withNewLocalLike(io.kubernetes.client.openapi.models.V1LocalVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.LocalNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      editLocal() {
    return withNewLocalLike(getLocal());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      editOrNewLocal() {
    return withNewLocalLike(
        getLocal() != null
            ? getLocal()
            : new io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<A>
      editOrNewLocalLike(io.kubernetes.client.openapi.models.V1LocalVolumeSource item) {
    return withNewLocalLike(getLocal() != null ? getLocal() : item);
  }

  public A addToMountOptions(java.lang.Integer index, java.lang.String item) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    this.mountOptions.add(index, item);
    return (A) this;
  }

  public A setToMountOptions(java.lang.Integer index, java.lang.String item) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    this.mountOptions.set(index, item);
    return (A) this;
  }

  public A addToMountOptions(java.lang.String... items) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.mountOptions.add(item);
    }
    return (A) this;
  }

  public A addAllToMountOptions(java.util.Collection<java.lang.String> items) {
    if (this.mountOptions == null) {
      this.mountOptions = new java.util.ArrayList<java.lang.String>();
    }
    for (java.lang.String item : items) {
      this.mountOptions.add(item);
    }
    return (A) this;
  }

  public A removeFromMountOptions(java.lang.String... items) {
    for (java.lang.String item : items) {
      if (this.mountOptions != null) {
        this.mountOptions.remove(item);
      }
    }
    return (A) this;
  }

  public A removeAllFromMountOptions(java.util.Collection<java.lang.String> items) {
    for (java.lang.String item : items) {
      if (this.mountOptions != null) {
        this.mountOptions.remove(item);
      }
    }
    return (A) this;
  }

  public java.util.List<java.lang.String> getMountOptions() {
    return this.mountOptions;
  }

  public java.lang.String getMountOption(java.lang.Integer index) {
    return this.mountOptions.get(index);
  }

  public java.lang.String getFirstMountOption() {
    return this.mountOptions.get(0);
  }

  public java.lang.String getLastMountOption() {
    return this.mountOptions.get(mountOptions.size() - 1);
  }

  public java.lang.String getMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : mountOptions) {
      if (predicate.test(item)) {
        return item;
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingMountOption(
      java.util.function.Predicate<java.lang.String> predicate) {
    for (java.lang.String item : mountOptions) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withMountOptions(java.util.List<java.lang.String> mountOptions) {
    if (mountOptions != null) {
      this.mountOptions = new java.util.ArrayList();
      for (java.lang.String item : mountOptions) {
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
    }
    if (mountOptions != null) {
      for (java.lang.String item : mountOptions) {
        this.addToMountOptions(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasMountOptions() {
    return mountOptions != null && !mountOptions.isEmpty();
  }

  public A addNewMountOption(java.lang.String original) {
    return (A) addToMountOptions(new String(original));
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A>
      withNewNfs() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.NfsNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A>
      withNewNfsLike(io.kubernetes.client.openapi.models.V1NFSVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.NfsNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A> editNfs() {
    return withNewNfsLike(getNfs());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A>
      editOrNewNfs() {
    return withNewNfsLike(
        getNfs() != null
            ? getNfs()
            : new io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<A>
      editOrNewNfsLike(io.kubernetes.client.openapi.models.V1NFSVolumeSource item) {
    return withNewNfsLike(getNfs() != null ? getNfs() : item);
  }

  /**
   * This method has been deprecated, please use method buildNodeAffinity instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinity getNodeAffinity() {
    return this.nodeAffinity != null ? this.nodeAffinity.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1VolumeNodeAffinity buildNodeAffinity() {
    return this.nodeAffinity != null ? this.nodeAffinity.build() : null;
  }

  public A withNodeAffinity(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity nodeAffinity) {
    _visitables.get("nodeAffinity").remove(this.nodeAffinity);
    if (nodeAffinity != null) {
      this.nodeAffinity =
          new io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder(nodeAffinity);
      _visitables.get("nodeAffinity").add(this.nodeAffinity);
    }
    return (A) this;
  }

  public java.lang.Boolean hasNodeAffinity() {
    return this.nodeAffinity != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      withNewNodeAffinity() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .NodeAffinityNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      withNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .NodeAffinityNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      editNodeAffinity() {
    return withNewNodeAffinityLike(getNodeAffinity());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      editOrNewNodeAffinity() {
    return withNewNodeAffinityLike(
        getNodeAffinity() != null
            ? getNodeAffinity()
            : new io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<A>
      editOrNewNodeAffinityLike(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity item) {
    return withNewNodeAffinityLike(getNodeAffinity() != null ? getNodeAffinity() : item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpec
          .PersistentVolumeReclaimPolicyEnum
      getPersistentVolumeReclaimPolicy() {
    return this.persistentVolumeReclaimPolicy;
  }

  public A withPersistentVolumeReclaimPolicy(
      io.kubernetes.client.openapi.models.V1PersistentVolumeSpec.PersistentVolumeReclaimPolicyEnum
          persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return (A) this;
  }

  public java.lang.Boolean hasPersistentVolumeReclaimPolicy() {
    return this.persistentVolumeReclaimPolicy != null;
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      withNewPhotonPersistentDisk() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .PhotonPersistentDiskNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      withNewPhotonPersistentDiskLike(
          io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .PhotonPersistentDiskNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      editPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(getPhotonPersistentDisk());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
      editOrNewPhotonPersistentDisk() {
    return withNewPhotonPersistentDiskLike(
        getPhotonPersistentDisk() != null
            ? getPhotonPersistentDisk()
            : new io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
              .PhotonPersistentDiskNested<
          A>
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      withNewPortworxVolume() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .PortworxVolumeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      withNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .PortworxVolumeNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      editPortworxVolume() {
    return withNewPortworxVolumeLike(getPortworxVolume());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolume() {
    return withNewPortworxVolumeLike(
        getPortworxVolume() != null
            ? getPortworxVolume()
            : new io.kubernetes.client.openapi.models.V1PortworxVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<A>
      editOrNewPortworxVolumeLike(io.kubernetes.client.openapi.models.V1PortworxVolumeSource item) {
    return withNewPortworxVolumeLike(getPortworxVolume() != null ? getPortworxVolume() : item);
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      withNewQuobyte() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .QuobyteNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      withNewQuobyteLike(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .QuobyteNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      editQuobyte() {
    return withNewQuobyteLike(getQuobyte());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      editOrNewQuobyte() {
    return withNewQuobyteLike(
        getQuobyte() != null
            ? getQuobyte()
            : new io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<A>
      editOrNewQuobyteLike(io.kubernetes.client.openapi.models.V1QuobyteVolumeSource item) {
    return withNewQuobyteLike(getQuobyte() != null ? getQuobyte() : item);
  }

  /**
   * This method has been deprecated, please use method buildRbd instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource getRbd() {
    return this.rbd != null ? this.rbd.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource buildRbd() {
    return this.rbd != null ? this.rbd.build() : null;
  }

  public A withRbd(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource rbd) {
    _visitables.get("rbd").remove(this.rbd);
    if (rbd != null) {
      this.rbd = new io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder(rbd);
      _visitables.get("rbd").add(this.rbd);
    }
    return (A) this;
  }

  public java.lang.Boolean hasRbd() {
    return this.rbd != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A>
      withNewRbd() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.RbdNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A>
      withNewRbdLike(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl.RbdNestedImpl(
        item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A> editRbd() {
    return withNewRbdLike(getRbd());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A>
      editOrNewRbd() {
    return withNewRbdLike(
        getRbd() != null
            ? getRbd()
            : new io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<A>
      editOrNewRbdLike(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource item) {
    return withNewRbdLike(getRbd() != null ? getRbd() : item);
  }

  /**
   * This method has been deprecated, please use method buildScaleIO instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource getScaleIO() {
    return this.scaleIO != null ? this.scaleIO.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource buildScaleIO() {
    return this.scaleIO != null ? this.scaleIO.build() : null;
  }

  public A withScaleIO(
      io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource scaleIO) {
    _visitables.get("scaleIO").remove(this.scaleIO);
    if (scaleIO != null) {
      this.scaleIO =
          new io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder(scaleIO);
      _visitables.get("scaleIO").add(this.scaleIO);
    }
    return (A) this;
  }

  public java.lang.Boolean hasScaleIO() {
    return this.scaleIO != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      withNewScaleIO() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .ScaleIONestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      withNewScaleIOLike(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .ScaleIONestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      editScaleIO() {
    return withNewScaleIOLike(getScaleIO());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      editOrNewScaleIO() {
    return withNewScaleIOLike(
        getScaleIO() != null
            ? getScaleIO()
            : new io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<A>
      editOrNewScaleIOLike(
          io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource item) {
    return withNewScaleIOLike(getScaleIO() != null ? getScaleIO() : item);
  }

  public java.lang.String getStorageClassName() {
    return this.storageClassName;
  }

  public A withStorageClassName(java.lang.String storageClassName) {
    this.storageClassName = storageClassName;
    return (A) this;
  }

  public java.lang.Boolean hasStorageClassName() {
    return this.storageClassName != null;
  }

  /** Method is deprecated. use withStorageClassName instead. */
  @java.lang.Deprecated
  public A withNewStorageClassName(java.lang.String original) {
    return (A) withStorageClassName(new String(original));
  }

  /**
   * This method has been deprecated, please use method buildStorageos instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource getStorageos() {
    return this.storageos != null ? this.storageos.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource buildStorageos() {
    return this.storageos != null ? this.storageos.build() : null;
  }

  public A withStorageos(
      io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource storageos) {
    _visitables.get("storageos").remove(this.storageos);
    if (storageos != null) {
      this.storageos =
          new io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder(
              storageos);
      _visitables.get("storageos").add(this.storageos);
    }
    return (A) this;
  }

  public java.lang.Boolean hasStorageos() {
    return this.storageos != null;
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      withNewStorageos() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .StorageosNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      withNewStorageosLike(
          io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .StorageosNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      editStorageos() {
    return withNewStorageosLike(getStorageos());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      editOrNewStorageos() {
    return withNewStorageosLike(
        getStorageos() != null
            ? getStorageos()
            : new io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<A>
      editOrNewStorageosLike(
          io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource item) {
    return withNewStorageosLike(getStorageos() != null ? getStorageos() : item);
  }

  public java.lang.String getVolumeMode() {
    return this.volumeMode;
  }

  public A withVolumeMode(java.lang.String volumeMode) {
    this.volumeMode = volumeMode;
    return (A) this;
  }

  public java.lang.Boolean hasVolumeMode() {
    return this.volumeMode != null;
  }

  /** Method is deprecated. use withVolumeMode instead. */
  @java.lang.Deprecated
  public A withNewVolumeMode(java.lang.String original) {
    return (A) withVolumeMode(new String(original));
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

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      withNewVsphereVolume() {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .VsphereVolumeNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      withNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item) {
    return new io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluentImpl
        .VsphereVolumeNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      editVsphereVolume() {
    return withNewVsphereVolumeLike(getVsphereVolume());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolume() {
    return withNewVsphereVolumeLike(
        getVsphereVolume() != null
            ? getVsphereVolume()
            : new io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceBuilder()
                .build());
  }

  public io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<A>
      editOrNewVsphereVolumeLike(
          io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource item) {
    return withNewVsphereVolumeLike(getVsphereVolume() != null ? getVsphereVolume() : item);
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1PersistentVolumeSpecFluentImpl that = (V1PersistentVolumeSpecFluentImpl) o;
    if (accessModes != null ? !accessModes.equals(that.accessModes) : that.accessModes != null)
      return false;
    if (awsElasticBlockStore != null
        ? !awsElasticBlockStore.equals(that.awsElasticBlockStore)
        : that.awsElasticBlockStore != null) return false;
    if (azureDisk != null ? !azureDisk.equals(that.azureDisk) : that.azureDisk != null)
      return false;
    if (azureFile != null ? !azureFile.equals(that.azureFile) : that.azureFile != null)
      return false;
    if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
    if (cephfs != null ? !cephfs.equals(that.cephfs) : that.cephfs != null) return false;
    if (cinder != null ? !cinder.equals(that.cinder) : that.cinder != null) return false;
    if (claimRef != null ? !claimRef.equals(that.claimRef) : that.claimRef != null) return false;
    if (csi != null ? !csi.equals(that.csi) : that.csi != null) return false;
    if (fc != null ? !fc.equals(that.fc) : that.fc != null) return false;
    if (flexVolume != null ? !flexVolume.equals(that.flexVolume) : that.flexVolume != null)
      return false;
    if (flocker != null ? !flocker.equals(that.flocker) : that.flocker != null) return false;
    if (gcePersistentDisk != null
        ? !gcePersistentDisk.equals(that.gcePersistentDisk)
        : that.gcePersistentDisk != null) return false;
    if (glusterfs != null ? !glusterfs.equals(that.glusterfs) : that.glusterfs != null)
      return false;
    if (hostPath != null ? !hostPath.equals(that.hostPath) : that.hostPath != null) return false;
    if (iscsi != null ? !iscsi.equals(that.iscsi) : that.iscsi != null) return false;
    if (local != null ? !local.equals(that.local) : that.local != null) return false;
    if (mountOptions != null ? !mountOptions.equals(that.mountOptions) : that.mountOptions != null)
      return false;
    if (nfs != null ? !nfs.equals(that.nfs) : that.nfs != null) return false;
    if (nodeAffinity != null ? !nodeAffinity.equals(that.nodeAffinity) : that.nodeAffinity != null)
      return false;
    if (persistentVolumeReclaimPolicy != null
        ? !persistentVolumeReclaimPolicy.equals(that.persistentVolumeReclaimPolicy)
        : that.persistentVolumeReclaimPolicy != null) return false;
    if (photonPersistentDisk != null
        ? !photonPersistentDisk.equals(that.photonPersistentDisk)
        : that.photonPersistentDisk != null) return false;
    if (portworxVolume != null
        ? !portworxVolume.equals(that.portworxVolume)
        : that.portworxVolume != null) return false;
    if (quobyte != null ? !quobyte.equals(that.quobyte) : that.quobyte != null) return false;
    if (rbd != null ? !rbd.equals(that.rbd) : that.rbd != null) return false;
    if (scaleIO != null ? !scaleIO.equals(that.scaleIO) : that.scaleIO != null) return false;
    if (storageClassName != null
        ? !storageClassName.equals(that.storageClassName)
        : that.storageClassName != null) return false;
    if (storageos != null ? !storageos.equals(that.storageos) : that.storageos != null)
      return false;
    if (volumeMode != null ? !volumeMode.equals(that.volumeMode) : that.volumeMode != null)
      return false;
    if (vsphereVolume != null
        ? !vsphereVolume.equals(that.vsphereVolume)
        : that.vsphereVolume != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        accessModes,
        awsElasticBlockStore,
        azureDisk,
        azureFile,
        capacity,
        cephfs,
        cinder,
        claimRef,
        csi,
        fc,
        flexVolume,
        flocker,
        gcePersistentDisk,
        glusterfs,
        hostPath,
        iscsi,
        local,
        mountOptions,
        nfs,
        nodeAffinity,
        persistentVolumeReclaimPolicy,
        photonPersistentDisk,
        portworxVolume,
        quobyte,
        rbd,
        scaleIO,
        storageClassName,
        storageos,
        volumeMode,
        vsphereVolume,
        super.hashCode());
  }

  public class AwsElasticBlockStoreNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .AwsElasticBlockStoreNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .AwsElasticBlockStoreNested<
              N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withAwsElasticBlockStore(builder.build());
    }

    public N endAwsElasticBlockStore() {
      return and();
    }
  }

  public class AzureDiskNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AzureDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureDiskNested<
              N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withAzureDisk(builder.build());
    }

    public N endAzureDisk() {
      return and();
    }
  }

  public class AzureFileNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.AzureFileNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    AzureFileNestedImpl(
        io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder(
              this, item);
    }

    AzureFileNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withAzureFile(builder.build());
    }

    public N endAzureFile() {
      return and();
    }
  }

  public class CephfsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CephfsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CephfsNestedImpl(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder(this, item);
    }

    CephfsNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withCephfs(builder.build());
    }

    public N endCephfs() {
      return and();
    }
  }

  public class CinderNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CinderNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CinderNestedImpl(io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceBuilder(this, item);
    }

    CinderNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withCinder(builder.build());
    }

    public N endCinder() {
      return and();
    }
  }

  public class ClaimRefNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ObjectReferenceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ClaimRefNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ClaimRefNestedImpl(io.kubernetes.client.openapi.models.V1ObjectReference item) {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this, item);
    }

    ClaimRefNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ObjectReferenceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withClaimRef(builder.build());
    }

    public N endClaimRef() {
      return and();
    }
  }

  public class CsiNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.CsiNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    CsiNestedImpl(io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder(this, item);
    }

    CsiNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withCsi(builder.build());
    }

    public N endCsi() {
      return and();
    }
  }

  public class FcNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1FCVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FcNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    FcNestedImpl(io.kubernetes.client.openapi.models.V1FCVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder(this, item);
    }

    FcNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1FCVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withFc(builder.build());
    }

    public N endFc() {
      return and();
    }
  }

  public class FlexVolumeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlexVolumeNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    FlexVolumeNestedImpl(io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceBuilder(this, item);
    }

    FlexVolumeNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withFlexVolume(builder.build());
    }

    public N endFlexVolume() {
      return and();
    }
  }

  public class FlockerNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1FlockerVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.FlockerNested<N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withFlocker(builder.build());
    }

    public N endFlocker() {
      return and();
    }
  }

  public class GcePersistentDiskNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GcePersistentDiskNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .GcePersistentDiskNested<
              N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withGcePersistentDisk(builder.build());
    }

    public N endGcePersistentDisk() {
      return and();
    }
  }

  public class GlusterfsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.GlusterfsNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    GlusterfsNestedImpl(
        io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder(
              this, item);
    }

    GlusterfsNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withGlusterfs(builder.build());
    }

    public N endGlusterfs() {
      return and();
    }
  }

  public class HostPathNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.HostPathNested<N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withHostPath(builder.build());
    }

    public N endHostPath() {
      return and();
    }
  }

  public class IscsiNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.IscsiNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    IscsiNestedImpl(io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder(this, item);
    }

    IscsiNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withIscsi(builder.build());
    }

    public N endIscsi() {
      return and();
    }
  }

  public class LocalNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1LocalVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.LocalNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    LocalNestedImpl(io.kubernetes.client.openapi.models.V1LocalVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder(this, item);
    }

    LocalNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1LocalVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withLocal(builder.build());
    }

    public N endLocal() {
      return and();
    }
  }

  public class NfsNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1NFSVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NfsNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    NfsNestedImpl(io.kubernetes.client.openapi.models.V1NFSVolumeSource item) {
      this.builder = new io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder(this, item);
    }

    NfsNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1NFSVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withNfs(builder.build());
    }

    public N endNfs() {
      return and();
    }
  }

  public class NodeAffinityNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VolumeNodeAffinityFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.NodeAffinityNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .NodeAffinityNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    NodeAffinityNestedImpl(io.kubernetes.client.openapi.models.V1VolumeNodeAffinity item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder(this, item);
    }

    NodeAffinityNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1VolumeNodeAffinityBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withNodeAffinity(builder.build());
    }

    public N endNodeAffinity() {
      return and();
    }
  }

  public class PhotonPersistentDiskNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .PhotonPersistentDiskNested<
              N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .PhotonPersistentDiskNested<
              N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withPhotonPersistentDisk(builder.build());
    }

    public N endPhotonPersistentDisk() {
      return and();
    }
  }

  public class PortworxVolumeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.PortworxVolumeNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .PortworxVolumeNested<
              N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withPortworxVolume(builder.build());
    }

    public N endPortworxVolume() {
      return and();
    }
  }

  public class QuobyteNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1QuobyteVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.QuobyteNested<N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withQuobyte(builder.build());
    }

    public N endQuobyte() {
      return and();
    }
  }

  public class RbdNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.RbdNested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    RbdNestedImpl(io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder(this, item);
    }

    RbdNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withRbd(builder.build());
    }

    public N endRbd() {
      return and();
    }
  }

  public class ScaleIONestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.ScaleIONested<N>,
          io.kubernetes.client.fluent.Nested<N> {
    ScaleIONestedImpl(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder(
              this, item);
    }

    ScaleIONestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withScaleIO(builder.build());
    }

    public N endScaleIO() {
      return and();
    }
  }

  public class StorageosNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.StorageosNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    StorageosNestedImpl(
        io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource item) {
      this.builder =
          new io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder(
              this, item);
    }

    StorageosNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSourceBuilder builder;

    public N and() {
      return (N) V1PersistentVolumeSpecFluentImpl.this.withStorageos(builder.build());
    }

    public N endStorageos() {
      return and();
    }
  }

  public class VsphereVolumeNestedImpl<N>
      extends io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSourceFluentImpl<
          io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent.VsphereVolumeNested<N>>
      implements io.kubernetes.client.openapi.models.V1PersistentVolumeSpecFluent
                  .VsphereVolumeNested<
              N>,
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
      return (N) V1PersistentVolumeSpecFluentImpl.this.withVsphereVolume(builder.build());
    }

    public N endVsphereVolume() {
      return and();
    }
  }
}
