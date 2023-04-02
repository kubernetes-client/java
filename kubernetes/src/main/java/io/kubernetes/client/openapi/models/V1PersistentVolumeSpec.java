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

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** PersistentVolumeSpec is the specification of a persistent volume. */
@ApiModel(description = "PersistentVolumeSpec is the specification of a persistent volume.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1PersistentVolumeSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";

  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";

  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  private V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";

  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  private V1AzureDiskVolumeSource azureDisk;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";

  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  private V1AzureFilePersistentVolumeSource azureFile;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";

  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Map<String, Quantity> capacity = null;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";

  @SerializedName(SERIALIZED_NAME_CEPHFS)
  private V1CephFSPersistentVolumeSource cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";

  @SerializedName(SERIALIZED_NAME_CINDER)
  private V1CinderPersistentVolumeSource cinder;

  public static final String SERIALIZED_NAME_CLAIM_REF = "claimRef";

  @SerializedName(SERIALIZED_NAME_CLAIM_REF)
  private V1ObjectReference claimRef;

  public static final String SERIALIZED_NAME_CSI = "csi";

  @SerializedName(SERIALIZED_NAME_CSI)
  private V1CSIPersistentVolumeSource csi;

  public static final String SERIALIZED_NAME_FC = "fc";

  @SerializedName(SERIALIZED_NAME_FC)
  private V1FCVolumeSource fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";

  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  private V1FlexPersistentVolumeSource flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";

  @SerializedName(SERIALIZED_NAME_FLOCKER)
  private V1FlockerVolumeSource flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";

  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  private V1GCEPersistentDiskVolumeSource gcePersistentDisk;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";

  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  private V1GlusterfsPersistentVolumeSource glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";

  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private V1HostPathVolumeSource hostPath;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";

  @SerializedName(SERIALIZED_NAME_ISCSI)
  private V1ISCSIPersistentVolumeSource iscsi;

  public static final String SERIALIZED_NAME_LOCAL = "local";

  @SerializedName(SERIALIZED_NAME_LOCAL)
  private V1LocalVolumeSource local;

  public static final String SERIALIZED_NAME_MOUNT_OPTIONS = "mountOptions";

  @SerializedName(SERIALIZED_NAME_MOUNT_OPTIONS)
  private List<String> mountOptions = null;

  public static final String SERIALIZED_NAME_NFS = "nfs";

  @SerializedName(SERIALIZED_NAME_NFS)
  private V1NFSVolumeSource nfs;

  public static final String SERIALIZED_NAME_NODE_AFFINITY = "nodeAffinity";

  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY)
  private V1VolumeNodeAffinity nodeAffinity;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_RECLAIM_POLICY =
      "persistentVolumeReclaimPolicy";

  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_RECLAIM_POLICY)
  private String persistentVolumeReclaimPolicy;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";

  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  private V1PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";

  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  private V1PortworxVolumeSource portworxVolume;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";

  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  private V1QuobyteVolumeSource quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";

  @SerializedName(SERIALIZED_NAME_RBD)
  private V1RBDPersistentVolumeSource rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";

  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  private V1ScaleIOPersistentVolumeSource scaleIO;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";

  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";

  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  private V1StorageOSPersistentVolumeSource storageos;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";

  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";

  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  private V1VsphereVirtualDiskVolumeSource vsphereVolume;

  public V1PersistentVolumeSpec accessModes(List<String> accessModes) {

    this.accessModes = accessModes;
    return this;
  }

  public V1PersistentVolumeSpec addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

  /**
   * accessModes contains all ways the volume can be mounted. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
   *
   * @return accessModes
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public V1PersistentVolumeSpec awsElasticBlockStore(
      V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {

    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

  /**
   * Get awsElasticBlockStore
   *
   * @return awsElasticBlockStore
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }

  public void setAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }

  public V1PersistentVolumeSpec azureDisk(V1AzureDiskVolumeSource azureDisk) {

    this.azureDisk = azureDisk;
    return this;
  }

  /**
   * Get azureDisk
   *
   * @return azureDisk
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }

  public void setAzureDisk(V1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }

  public V1PersistentVolumeSpec azureFile(V1AzureFilePersistentVolumeSource azureFile) {

    this.azureFile = azureFile;
    return this;
  }

  /**
   * Get azureFile
   *
   * @return azureFile
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AzureFilePersistentVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(V1AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public V1PersistentVolumeSpec capacity(Map<String, Quantity> capacity) {

    this.capacity = capacity;
    return this;
  }

  public V1PersistentVolumeSpec putCapacityItem(String key, Quantity capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

  /**
   * capacity is the description of the persistent volume&#39;s resources and capacity. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   *
   * @return capacity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "capacity is the description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
  public Map<String, Quantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, Quantity> capacity) {
    this.capacity = capacity;
  }

  public V1PersistentVolumeSpec cephfs(V1CephFSPersistentVolumeSource cephfs) {

    this.cephfs = cephfs;
    return this;
  }

  /**
   * Get cephfs
   *
   * @return cephfs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CephFSPersistentVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(V1CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public V1PersistentVolumeSpec cinder(V1CinderPersistentVolumeSource cinder) {

    this.cinder = cinder;
    return this;
  }

  /**
   * Get cinder
   *
   * @return cinder
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CinderPersistentVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(V1CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
  }

  public V1PersistentVolumeSpec claimRef(V1ObjectReference claimRef) {

    this.claimRef = claimRef;
    return this;
  }

  /**
   * Get claimRef
   *
   * @return claimRef
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getClaimRef() {
    return claimRef;
  }

  public void setClaimRef(V1ObjectReference claimRef) {
    this.claimRef = claimRef;
  }

  public V1PersistentVolumeSpec csi(V1CSIPersistentVolumeSource csi) {

    this.csi = csi;
    return this;
  }

  /**
   * Get csi
   *
   * @return csi
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CSIPersistentVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(V1CSIPersistentVolumeSource csi) {
    this.csi = csi;
  }

  public V1PersistentVolumeSpec fc(V1FCVolumeSource fc) {

    this.fc = fc;
    return this;
  }

  /**
   * Get fc
   *
   * @return fc
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FCVolumeSource getFc() {
    return fc;
  }

  public void setFc(V1FCVolumeSource fc) {
    this.fc = fc;
  }

  public V1PersistentVolumeSpec flexVolume(V1FlexPersistentVolumeSource flexVolume) {

    this.flexVolume = flexVolume;
    return this;
  }

  /**
   * Get flexVolume
   *
   * @return flexVolume
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FlexPersistentVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(V1FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public V1PersistentVolumeSpec flocker(V1FlockerVolumeSource flocker) {

    this.flocker = flocker;
    return this;
  }

  /**
   * Get flocker
   *
   * @return flocker
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(V1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  public V1PersistentVolumeSpec gcePersistentDisk(
      V1GCEPersistentDiskVolumeSource gcePersistentDisk) {

    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

  /**
   * Get gcePersistentDisk
   *
   * @return gcePersistentDisk
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public V1PersistentVolumeSpec glusterfs(V1GlusterfsPersistentVolumeSource glusterfs) {

    this.glusterfs = glusterfs;
    return this;
  }

  /**
   * Get glusterfs
   *
   * @return glusterfs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GlusterfsPersistentVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(V1GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public V1PersistentVolumeSpec hostPath(V1HostPathVolumeSource hostPath) {

    this.hostPath = hostPath;
    return this;
  }

  /**
   * Get hostPath
   *
   * @return hostPath
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(V1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  public V1PersistentVolumeSpec iscsi(V1ISCSIPersistentVolumeSource iscsi) {

    this.iscsi = iscsi;
    return this;
  }

  /**
   * Get iscsi
   *
   * @return iscsi
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ISCSIPersistentVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(V1ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public V1PersistentVolumeSpec local(V1LocalVolumeSource local) {

    this.local = local;
    return this;
  }

  /**
   * Get local
   *
   * @return local
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LocalVolumeSource getLocal() {
    return local;
  }

  public void setLocal(V1LocalVolumeSource local) {
    this.local = local;
  }

  public V1PersistentVolumeSpec mountOptions(List<String> mountOptions) {

    this.mountOptions = mountOptions;
    return this;
  }

  public V1PersistentVolumeSpec addMountOptionsItem(String mountOptionsItem) {
    if (this.mountOptions == null) {
      this.mountOptions = new ArrayList<>();
    }
    this.mountOptions.add(mountOptionsItem);
    return this;
  }

  /**
   * mountOptions is the list of mount options, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not
   * validated - mount will simply fail if one is invalid. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
   *
   * @return mountOptions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "mountOptions is the list of mount options, e.g. [\"ro\", \"soft\"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options")
  public List<String> getMountOptions() {
    return mountOptions;
  }

  public void setMountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
  }

  public V1PersistentVolumeSpec nfs(V1NFSVolumeSource nfs) {

    this.nfs = nfs;
    return this;
  }

  /**
   * Get nfs
   *
   * @return nfs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(V1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  public V1PersistentVolumeSpec nodeAffinity(V1VolumeNodeAffinity nodeAffinity) {

    this.nodeAffinity = nodeAffinity;
    return this;
  }

  /**
   * Get nodeAffinity
   *
   * @return nodeAffinity
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VolumeNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(V1VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public V1PersistentVolumeSpec persistentVolumeReclaimPolicy(
      String persistentVolumeReclaimPolicy) {

    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return this;
  }

  /**
   * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from
   * its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete
   * (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must
   * be supported by the volume plugin underlying this PersistentVolume. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
   *
   * @return persistentVolumeReclaimPolicy
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming  ")
  public String getPersistentVolumeReclaimPolicy() {
    return persistentVolumeReclaimPolicy;
  }

  public void setPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
  }

  public V1PersistentVolumeSpec photonPersistentDisk(
      V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {

    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

  /**
   * Get photonPersistentDisk
   *
   * @return photonPersistentDisk
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }

  public void setPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }

  public V1PersistentVolumeSpec portworxVolume(V1PortworxVolumeSource portworxVolume) {

    this.portworxVolume = portworxVolume;
    return this;
  }

  /**
   * Get portworxVolume
   *
   * @return portworxVolume
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }

  public void setPortworxVolume(V1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }

  public V1PersistentVolumeSpec quobyte(V1QuobyteVolumeSource quobyte) {

    this.quobyte = quobyte;
    return this;
  }

  /**
   * Get quobyte
   *
   * @return quobyte
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }

  public void setQuobyte(V1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }

  public V1PersistentVolumeSpec rbd(V1RBDPersistentVolumeSource rbd) {

    this.rbd = rbd;
    return this;
  }

  /**
   * Get rbd
   *
   * @return rbd
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1RBDPersistentVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(V1RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
  }

  public V1PersistentVolumeSpec scaleIO(V1ScaleIOPersistentVolumeSource scaleIO) {

    this.scaleIO = scaleIO;
    return this;
  }

  /**
   * Get scaleIO
   *
   * @return scaleIO
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ScaleIOPersistentVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(V1ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public V1PersistentVolumeSpec storageClassName(String storageClassName) {

    this.storageClassName = storageClassName;
    return this;
  }

  /**
   * storageClassName is the name of StorageClass to which this persistent volume belongs. Empty
   * value means that this volume does not belong to any StorageClass.
   *
   * @return storageClassName
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  public V1PersistentVolumeSpec storageos(V1StorageOSPersistentVolumeSource storageos) {

    this.storageos = storageos;
    return this;
  }

  /**
   * Get storageos
   *
   * @return storageos
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1StorageOSPersistentVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(V1StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
  }

  public V1PersistentVolumeSpec volumeMode(String volumeMode) {

    this.volumeMode = volumeMode;
    return this;
  }

  /**
   * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain
   * in raw block state. Value of Filesystem is implied when not included in spec.
   *
   * @return volumeMode
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }

  public V1PersistentVolumeSpec vsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {

    this.vsphereVolume = vsphereVolume;
    return this;
  }

  /**
   * Get vsphereVolume
   *
   * @return vsphereVolume
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }

  public void setVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeSpec v1PersistentVolumeSpec = (V1PersistentVolumeSpec) o;
    return Objects.equals(this.accessModes, v1PersistentVolumeSpec.accessModes)
        && Objects.equals(this.awsElasticBlockStore, v1PersistentVolumeSpec.awsElasticBlockStore)
        && Objects.equals(this.azureDisk, v1PersistentVolumeSpec.azureDisk)
        && Objects.equals(this.azureFile, v1PersistentVolumeSpec.azureFile)
        && Objects.equals(this.capacity, v1PersistentVolumeSpec.capacity)
        && Objects.equals(this.cephfs, v1PersistentVolumeSpec.cephfs)
        && Objects.equals(this.cinder, v1PersistentVolumeSpec.cinder)
        && Objects.equals(this.claimRef, v1PersistentVolumeSpec.claimRef)
        && Objects.equals(this.csi, v1PersistentVolumeSpec.csi)
        && Objects.equals(this.fc, v1PersistentVolumeSpec.fc)
        && Objects.equals(this.flexVolume, v1PersistentVolumeSpec.flexVolume)
        && Objects.equals(this.flocker, v1PersistentVolumeSpec.flocker)
        && Objects.equals(this.gcePersistentDisk, v1PersistentVolumeSpec.gcePersistentDisk)
        && Objects.equals(this.glusterfs, v1PersistentVolumeSpec.glusterfs)
        && Objects.equals(this.hostPath, v1PersistentVolumeSpec.hostPath)
        && Objects.equals(this.iscsi, v1PersistentVolumeSpec.iscsi)
        && Objects.equals(this.local, v1PersistentVolumeSpec.local)
        && Objects.equals(this.mountOptions, v1PersistentVolumeSpec.mountOptions)
        && Objects.equals(this.nfs, v1PersistentVolumeSpec.nfs)
        && Objects.equals(this.nodeAffinity, v1PersistentVolumeSpec.nodeAffinity)
        && Objects.equals(
            this.persistentVolumeReclaimPolicy,
            v1PersistentVolumeSpec.persistentVolumeReclaimPolicy)
        && Objects.equals(this.photonPersistentDisk, v1PersistentVolumeSpec.photonPersistentDisk)
        && Objects.equals(this.portworxVolume, v1PersistentVolumeSpec.portworxVolume)
        && Objects.equals(this.quobyte, v1PersistentVolumeSpec.quobyte)
        && Objects.equals(this.rbd, v1PersistentVolumeSpec.rbd)
        && Objects.equals(this.scaleIO, v1PersistentVolumeSpec.scaleIO)
        && Objects.equals(this.storageClassName, v1PersistentVolumeSpec.storageClassName)
        && Objects.equals(this.storageos, v1PersistentVolumeSpec.storageos)
        && Objects.equals(this.volumeMode, v1PersistentVolumeSpec.volumeMode)
        && Objects.equals(this.vsphereVolume, v1PersistentVolumeSpec.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
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
        vsphereVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    awsElasticBlockStore: ")
        .append(toIndentedString(awsElasticBlockStore))
        .append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    claimRef: ").append(toIndentedString(claimRef)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    mountOptions: ").append(toIndentedString(mountOptions)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    persistentVolumeReclaimPolicy: ")
        .append(toIndentedString(persistentVolumeReclaimPolicy))
        .append("\n");
    sb.append("    photonPersistentDisk: ")
        .append(toIndentedString(photonPersistentDisk))
        .append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
