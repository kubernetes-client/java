/*
Copyright 2025 The Kubernetes Authors.
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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureFilePersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1CSIPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1CinderPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1FCVolumeSource;
import io.kubernetes.client.openapi.models.V1FlexPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1FlockerVolumeSource;
import io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1HostPathVolumeSource;
import io.kubernetes.client.openapi.models.V1ISCSIPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1LocalVolumeSource;
import io.kubernetes.client.openapi.models.V1NFSVolumeSource;
import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1PortworxVolumeSource;
import io.kubernetes.client.openapi.models.V1QuobyteVolumeSource;
import io.kubernetes.client.openapi.models.V1RBDPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1StorageOSPersistentVolumeSource;
import io.kubernetes.client.openapi.models.V1VolumeNodeAffinity;
import io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 */
@ApiModel(description = "PersistentVolumeSpec is the specification of a persistent volume.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1PersistentVolumeSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  @jakarta.annotation.Nullable
  private List<String> accessModes = new ArrayList<>();

  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";
  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  @jakarta.annotation.Nullable
  private V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";
  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  @jakarta.annotation.Nullable
  private V1AzureDiskVolumeSource azureDisk;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";
  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  @jakarta.annotation.Nullable
  private V1AzureFilePersistentVolumeSource azureFile;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  @jakarta.annotation.Nullable
  private Map<String, Quantity> capacity = new HashMap<>();

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";
  @SerializedName(SERIALIZED_NAME_CEPHFS)
  @jakarta.annotation.Nullable
  private V1CephFSPersistentVolumeSource cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";
  @SerializedName(SERIALIZED_NAME_CINDER)
  @jakarta.annotation.Nullable
  private V1CinderPersistentVolumeSource cinder;

  public static final String SERIALIZED_NAME_CLAIM_REF = "claimRef";
  @SerializedName(SERIALIZED_NAME_CLAIM_REF)
  @jakarta.annotation.Nullable
  private V1ObjectReference claimRef;

  public static final String SERIALIZED_NAME_CSI = "csi";
  @SerializedName(SERIALIZED_NAME_CSI)
  @jakarta.annotation.Nullable
  private V1CSIPersistentVolumeSource csi;

  public static final String SERIALIZED_NAME_FC = "fc";
  @SerializedName(SERIALIZED_NAME_FC)
  @jakarta.annotation.Nullable
  private V1FCVolumeSource fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";
  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  @jakarta.annotation.Nullable
  private V1FlexPersistentVolumeSource flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";
  @SerializedName(SERIALIZED_NAME_FLOCKER)
  @jakarta.annotation.Nullable
  private V1FlockerVolumeSource flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";
  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  @jakarta.annotation.Nullable
  private V1GCEPersistentDiskVolumeSource gcePersistentDisk;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";
  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  @jakarta.annotation.Nullable
  private V1GlusterfsPersistentVolumeSource glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";
  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  @jakarta.annotation.Nullable
  private V1HostPathVolumeSource hostPath;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";
  @SerializedName(SERIALIZED_NAME_ISCSI)
  @jakarta.annotation.Nullable
  private V1ISCSIPersistentVolumeSource iscsi;

  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  @jakarta.annotation.Nullable
  private V1LocalVolumeSource local;

  public static final String SERIALIZED_NAME_MOUNT_OPTIONS = "mountOptions";
  @SerializedName(SERIALIZED_NAME_MOUNT_OPTIONS)
  @jakarta.annotation.Nullable
  private List<String> mountOptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NFS = "nfs";
  @SerializedName(SERIALIZED_NAME_NFS)
  @jakarta.annotation.Nullable
  private V1NFSVolumeSource nfs;

  public static final String SERIALIZED_NAME_NODE_AFFINITY = "nodeAffinity";
  @SerializedName(SERIALIZED_NAME_NODE_AFFINITY)
  @jakarta.annotation.Nullable
  private V1VolumeNodeAffinity nodeAffinity;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_RECLAIM_POLICY = "persistentVolumeReclaimPolicy";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_RECLAIM_POLICY)
  @jakarta.annotation.Nullable
  private String persistentVolumeReclaimPolicy;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";
  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  @jakarta.annotation.Nullable
  private V1PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";
  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  @jakarta.annotation.Nullable
  private V1PortworxVolumeSource portworxVolume;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";
  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  @jakarta.annotation.Nullable
  private V1QuobyteVolumeSource quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";
  @SerializedName(SERIALIZED_NAME_RBD)
  @jakarta.annotation.Nullable
  private V1RBDPersistentVolumeSource rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";
  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  @jakarta.annotation.Nullable
  private V1ScaleIOPersistentVolumeSource scaleIO;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String storageClassName;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";
  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  @jakarta.annotation.Nullable
  private V1StorageOSPersistentVolumeSource storageos;

  public static final String SERIALIZED_NAME_VOLUME_ATTRIBUTES_CLASS_NAME = "volumeAttributesClassName";
  @SerializedName(SERIALIZED_NAME_VOLUME_ATTRIBUTES_CLASS_NAME)
  @jakarta.annotation.Nullable
  private String volumeAttributesClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  @jakarta.annotation.Nullable
  private String volumeMode;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";
  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  @jakarta.annotation.Nullable
  private V1VsphereVirtualDiskVolumeSource vsphereVolume;

  public V1PersistentVolumeSpec() {
  }

  public V1PersistentVolumeSpec accessModes(@jakarta.annotation.Nullable List<String> accessModes) {
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
   * accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
   * @return accessModes
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "accessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(@jakarta.annotation.Nullable List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public V1PersistentVolumeSpec awsElasticBlockStore(@jakarta.annotation.Nullable V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

  /**
   * Get awsElasticBlockStore
   * @return awsElasticBlockStore
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }

  public void setAwsElasticBlockStore(@jakarta.annotation.Nullable V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }


  public V1PersistentVolumeSpec azureDisk(@jakarta.annotation.Nullable V1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

  /**
   * Get azureDisk
   * @return azureDisk
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }

  public void setAzureDisk(@jakarta.annotation.Nullable V1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }


  public V1PersistentVolumeSpec azureFile(@jakarta.annotation.Nullable V1AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

  /**
   * Get azureFile
   * @return azureFile
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AzureFilePersistentVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(@jakarta.annotation.Nullable V1AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
  }


  public V1PersistentVolumeSpec capacity(@jakarta.annotation.Nullable Map<String, Quantity> capacity) {
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
   * capacity is the description of the persistent volume&#39;s resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   * @return capacity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "capacity is the description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
  public Map<String, Quantity> getCapacity() {
    return capacity;
  }

  public void setCapacity(@jakarta.annotation.Nullable Map<String, Quantity> capacity) {
    this.capacity = capacity;
  }


  public V1PersistentVolumeSpec cephfs(@jakarta.annotation.Nullable V1CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

  /**
   * Get cephfs
   * @return cephfs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CephFSPersistentVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(@jakarta.annotation.Nullable V1CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
  }


  public V1PersistentVolumeSpec cinder(@jakarta.annotation.Nullable V1CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

  /**
   * Get cinder
   * @return cinder
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CinderPersistentVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(@jakarta.annotation.Nullable V1CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
  }


  public V1PersistentVolumeSpec claimRef(@jakarta.annotation.Nullable V1ObjectReference claimRef) {
    this.claimRef = claimRef;
    return this;
  }

  /**
   * Get claimRef
   * @return claimRef
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectReference getClaimRef() {
    return claimRef;
  }

  public void setClaimRef(@jakarta.annotation.Nullable V1ObjectReference claimRef) {
    this.claimRef = claimRef;
  }


  public V1PersistentVolumeSpec csi(@jakarta.annotation.Nullable V1CSIPersistentVolumeSource csi) {
    this.csi = csi;
    return this;
  }

  /**
   * Get csi
   * @return csi
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CSIPersistentVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(@jakarta.annotation.Nullable V1CSIPersistentVolumeSource csi) {
    this.csi = csi;
  }


  public V1PersistentVolumeSpec fc(@jakarta.annotation.Nullable V1FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

  /**
   * Get fc
   * @return fc
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FCVolumeSource getFc() {
    return fc;
  }

  public void setFc(@jakarta.annotation.Nullable V1FCVolumeSource fc) {
    this.fc = fc;
  }


  public V1PersistentVolumeSpec flexVolume(@jakarta.annotation.Nullable V1FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

  /**
   * Get flexVolume
   * @return flexVolume
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FlexPersistentVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(@jakarta.annotation.Nullable V1FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }


  public V1PersistentVolumeSpec flocker(@jakarta.annotation.Nullable V1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

  /**
   * Get flocker
   * @return flocker
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(@jakarta.annotation.Nullable V1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }


  public V1PersistentVolumeSpec gcePersistentDisk(@jakarta.annotation.Nullable V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

  /**
   * Get gcePersistentDisk
   * @return gcePersistentDisk
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(@jakarta.annotation.Nullable V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }


  public V1PersistentVolumeSpec glusterfs(@jakarta.annotation.Nullable V1GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

  /**
   * Get glusterfs
   * @return glusterfs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GlusterfsPersistentVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(@jakarta.annotation.Nullable V1GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }


  public V1PersistentVolumeSpec hostPath(@jakarta.annotation.Nullable V1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

  /**
   * Get hostPath
   * @return hostPath
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(@jakarta.annotation.Nullable V1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }


  public V1PersistentVolumeSpec iscsi(@jakarta.annotation.Nullable V1ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

  /**
   * Get iscsi
   * @return iscsi
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ISCSIPersistentVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(@jakarta.annotation.Nullable V1ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
  }


  public V1PersistentVolumeSpec local(@jakarta.annotation.Nullable V1LocalVolumeSource local) {
    this.local = local;
    return this;
  }

  /**
   * Get local
   * @return local
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LocalVolumeSource getLocal() {
    return local;
  }

  public void setLocal(@jakarta.annotation.Nullable V1LocalVolumeSource local) {
    this.local = local;
  }


  public V1PersistentVolumeSpec mountOptions(@jakarta.annotation.Nullable List<String> mountOptions) {
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
   * mountOptions is the list of mount options, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
   * @return mountOptions
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "mountOptions is the list of mount options, e.g. [\"ro\", \"soft\"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options")
  public List<String> getMountOptions() {
    return mountOptions;
  }

  public void setMountOptions(@jakarta.annotation.Nullable List<String> mountOptions) {
    this.mountOptions = mountOptions;
  }


  public V1PersistentVolumeSpec nfs(@jakarta.annotation.Nullable V1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

  /**
   * Get nfs
   * @return nfs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(@jakarta.annotation.Nullable V1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }


  public V1PersistentVolumeSpec nodeAffinity(@jakarta.annotation.Nullable V1VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

  /**
   * Get nodeAffinity
   * @return nodeAffinity
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VolumeNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(@jakarta.annotation.Nullable V1VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }


  public V1PersistentVolumeSpec persistentVolumeReclaimPolicy(@jakarta.annotation.Nullable String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return this;
  }

  /**
   * persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
   * @return persistentVolumeReclaimPolicy
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "persistentVolumeReclaimPolicy defines what happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming")
  public String getPersistentVolumeReclaimPolicy() {
    return persistentVolumeReclaimPolicy;
  }

  public void setPersistentVolumeReclaimPolicy(@jakarta.annotation.Nullable String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
  }


  public V1PersistentVolumeSpec photonPersistentDisk(@jakarta.annotation.Nullable V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

  /**
   * Get photonPersistentDisk
   * @return photonPersistentDisk
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }

  public void setPhotonPersistentDisk(@jakarta.annotation.Nullable V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }


  public V1PersistentVolumeSpec portworxVolume(@jakarta.annotation.Nullable V1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

  /**
   * Get portworxVolume
   * @return portworxVolume
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }

  public void setPortworxVolume(@jakarta.annotation.Nullable V1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }


  public V1PersistentVolumeSpec quobyte(@jakarta.annotation.Nullable V1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

  /**
   * Get quobyte
   * @return quobyte
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }

  public void setQuobyte(@jakarta.annotation.Nullable V1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }


  public V1PersistentVolumeSpec rbd(@jakarta.annotation.Nullable V1RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

  /**
   * Get rbd
   * @return rbd
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1RBDPersistentVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(@jakarta.annotation.Nullable V1RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
  }


  public V1PersistentVolumeSpec scaleIO(@jakarta.annotation.Nullable V1ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

  /**
   * Get scaleIO
   * @return scaleIO
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ScaleIOPersistentVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(@jakarta.annotation.Nullable V1ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }


  public V1PersistentVolumeSpec storageClassName(@jakarta.annotation.Nullable String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

  /**
   * storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
   * @return storageClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "storageClassName is the name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(@jakarta.annotation.Nullable String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public V1PersistentVolumeSpec storageos(@jakarta.annotation.Nullable V1StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

  /**
   * Get storageos
   * @return storageos
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1StorageOSPersistentVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(@jakarta.annotation.Nullable V1StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
  }


  public V1PersistentVolumeSpec volumeAttributesClassName(@jakarta.annotation.Nullable String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
    return this;
  }

  /**
   * Name of VolumeAttributesClass to which this persistent volume belongs. Empty value is not allowed. When this field is not set, it indicates that this volume does not belong to any VolumeAttributesClass. This field is mutable and can be changed by the CSI driver after a volume has been updated successfully to a new class. For an unbound PersistentVolume, the volumeAttributesClassName will be matched with unbound PersistentVolumeClaims during the binding process.
   * @return volumeAttributesClassName
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of VolumeAttributesClass to which this persistent volume belongs. Empty value is not allowed. When this field is not set, it indicates that this volume does not belong to any VolumeAttributesClass. This field is mutable and can be changed by the CSI driver after a volume has been updated successfully to a new class. For an unbound PersistentVolume, the volumeAttributesClassName will be matched with unbound PersistentVolumeClaims during the binding process.")
  public String getVolumeAttributesClassName() {
    return volumeAttributesClassName;
  }

  public void setVolumeAttributesClassName(@jakarta.annotation.Nullable String volumeAttributesClassName) {
    this.volumeAttributesClassName = volumeAttributesClassName;
  }


  public V1PersistentVolumeSpec volumeMode(@jakarta.annotation.Nullable String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

  /**
   * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
   * @return volumeMode
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(@jakarta.annotation.Nullable String volumeMode) {
    this.volumeMode = volumeMode;
  }


  public V1PersistentVolumeSpec vsphereVolume(@jakarta.annotation.Nullable V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }

  /**
   * Get vsphereVolume
   * @return vsphereVolume
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }

  public void setVsphereVolume(@jakarta.annotation.Nullable V1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeSpec v1PersistentVolumeSpec = (V1PersistentVolumeSpec) o;
    return Objects.equals(this.accessModes, v1PersistentVolumeSpec.accessModes) &&
        Objects.equals(this.awsElasticBlockStore, v1PersistentVolumeSpec.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, v1PersistentVolumeSpec.azureDisk) &&
        Objects.equals(this.azureFile, v1PersistentVolumeSpec.azureFile) &&
        Objects.equals(this.capacity, v1PersistentVolumeSpec.capacity) &&
        Objects.equals(this.cephfs, v1PersistentVolumeSpec.cephfs) &&
        Objects.equals(this.cinder, v1PersistentVolumeSpec.cinder) &&
        Objects.equals(this.claimRef, v1PersistentVolumeSpec.claimRef) &&
        Objects.equals(this.csi, v1PersistentVolumeSpec.csi) &&
        Objects.equals(this.fc, v1PersistentVolumeSpec.fc) &&
        Objects.equals(this.flexVolume, v1PersistentVolumeSpec.flexVolume) &&
        Objects.equals(this.flocker, v1PersistentVolumeSpec.flocker) &&
        Objects.equals(this.gcePersistentDisk, v1PersistentVolumeSpec.gcePersistentDisk) &&
        Objects.equals(this.glusterfs, v1PersistentVolumeSpec.glusterfs) &&
        Objects.equals(this.hostPath, v1PersistentVolumeSpec.hostPath) &&
        Objects.equals(this.iscsi, v1PersistentVolumeSpec.iscsi) &&
        Objects.equals(this.local, v1PersistentVolumeSpec.local) &&
        Objects.equals(this.mountOptions, v1PersistentVolumeSpec.mountOptions) &&
        Objects.equals(this.nfs, v1PersistentVolumeSpec.nfs) &&
        Objects.equals(this.nodeAffinity, v1PersistentVolumeSpec.nodeAffinity) &&
        Objects.equals(this.persistentVolumeReclaimPolicy, v1PersistentVolumeSpec.persistentVolumeReclaimPolicy) &&
        Objects.equals(this.photonPersistentDisk, v1PersistentVolumeSpec.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, v1PersistentVolumeSpec.portworxVolume) &&
        Objects.equals(this.quobyte, v1PersistentVolumeSpec.quobyte) &&
        Objects.equals(this.rbd, v1PersistentVolumeSpec.rbd) &&
        Objects.equals(this.scaleIO, v1PersistentVolumeSpec.scaleIO) &&
        Objects.equals(this.storageClassName, v1PersistentVolumeSpec.storageClassName) &&
        Objects.equals(this.storageos, v1PersistentVolumeSpec.storageos) &&
        Objects.equals(this.volumeAttributesClassName, v1PersistentVolumeSpec.volumeAttributesClassName) &&
        Objects.equals(this.volumeMode, v1PersistentVolumeSpec.volumeMode) &&
        Objects.equals(this.vsphereVolume, v1PersistentVolumeSpec.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, awsElasticBlockStore, azureDisk, azureFile, capacity, cephfs, cinder, claimRef, csi, fc, flexVolume, flocker, gcePersistentDisk, glusterfs, hostPath, iscsi, local, mountOptions, nfs, nodeAffinity, persistentVolumeReclaimPolicy, photonPersistentDisk, portworxVolume, quobyte, rbd, scaleIO, storageClassName, storageos, volumeAttributesClassName, volumeMode, vsphereVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
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
    sb.append("    persistentVolumeReclaimPolicy: ").append(toIndentedString(persistentVolumeReclaimPolicy)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    volumeAttributesClassName: ").append(toIndentedString(volumeAttributesClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("accessModes");
    openapiFields.add("awsElasticBlockStore");
    openapiFields.add("azureDisk");
    openapiFields.add("azureFile");
    openapiFields.add("capacity");
    openapiFields.add("cephfs");
    openapiFields.add("cinder");
    openapiFields.add("claimRef");
    openapiFields.add("csi");
    openapiFields.add("fc");
    openapiFields.add("flexVolume");
    openapiFields.add("flocker");
    openapiFields.add("gcePersistentDisk");
    openapiFields.add("glusterfs");
    openapiFields.add("hostPath");
    openapiFields.add("iscsi");
    openapiFields.add("local");
    openapiFields.add("mountOptions");
    openapiFields.add("nfs");
    openapiFields.add("nodeAffinity");
    openapiFields.add("persistentVolumeReclaimPolicy");
    openapiFields.add("photonPersistentDisk");
    openapiFields.add("portworxVolume");
    openapiFields.add("quobyte");
    openapiFields.add("rbd");
    openapiFields.add("scaleIO");
    openapiFields.add("storageClassName");
    openapiFields.add("storageos");
    openapiFields.add("volumeAttributesClassName");
    openapiFields.add("volumeMode");
    openapiFields.add("vsphereVolume");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1PersistentVolumeSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1PersistentVolumeSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1PersistentVolumeSpec is not found in the empty JSON string", V1PersistentVolumeSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1PersistentVolumeSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1PersistentVolumeSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("accessModes") != null && !jsonObj.get("accessModes").isJsonNull() && !jsonObj.get("accessModes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessModes` to be an array in the JSON string but got `%s`", jsonObj.get("accessModes").toString()));
      }
      // validate the optional field `awsElasticBlockStore`
      if (jsonObj.get("awsElasticBlockStore") != null && !jsonObj.get("awsElasticBlockStore").isJsonNull()) {
        V1AWSElasticBlockStoreVolumeSource.validateJsonElement(jsonObj.get("awsElasticBlockStore"));
      }
      // validate the optional field `azureDisk`
      if (jsonObj.get("azureDisk") != null && !jsonObj.get("azureDisk").isJsonNull()) {
        V1AzureDiskVolumeSource.validateJsonElement(jsonObj.get("azureDisk"));
      }
      // validate the optional field `azureFile`
      if (jsonObj.get("azureFile") != null && !jsonObj.get("azureFile").isJsonNull()) {
        V1AzureFilePersistentVolumeSource.validateJsonElement(jsonObj.get("azureFile"));
      }
      // validate the optional field `cephfs`
      if (jsonObj.get("cephfs") != null && !jsonObj.get("cephfs").isJsonNull()) {
        V1CephFSPersistentVolumeSource.validateJsonElement(jsonObj.get("cephfs"));
      }
      // validate the optional field `cinder`
      if (jsonObj.get("cinder") != null && !jsonObj.get("cinder").isJsonNull()) {
        V1CinderPersistentVolumeSource.validateJsonElement(jsonObj.get("cinder"));
      }
      // validate the optional field `claimRef`
      if (jsonObj.get("claimRef") != null && !jsonObj.get("claimRef").isJsonNull()) {
        V1ObjectReference.validateJsonElement(jsonObj.get("claimRef"));
      }
      // validate the optional field `csi`
      if (jsonObj.get("csi") != null && !jsonObj.get("csi").isJsonNull()) {
        V1CSIPersistentVolumeSource.validateJsonElement(jsonObj.get("csi"));
      }
      // validate the optional field `fc`
      if (jsonObj.get("fc") != null && !jsonObj.get("fc").isJsonNull()) {
        V1FCVolumeSource.validateJsonElement(jsonObj.get("fc"));
      }
      // validate the optional field `flexVolume`
      if (jsonObj.get("flexVolume") != null && !jsonObj.get("flexVolume").isJsonNull()) {
        V1FlexPersistentVolumeSource.validateJsonElement(jsonObj.get("flexVolume"));
      }
      // validate the optional field `flocker`
      if (jsonObj.get("flocker") != null && !jsonObj.get("flocker").isJsonNull()) {
        V1FlockerVolumeSource.validateJsonElement(jsonObj.get("flocker"));
      }
      // validate the optional field `gcePersistentDisk`
      if (jsonObj.get("gcePersistentDisk") != null && !jsonObj.get("gcePersistentDisk").isJsonNull()) {
        V1GCEPersistentDiskVolumeSource.validateJsonElement(jsonObj.get("gcePersistentDisk"));
      }
      // validate the optional field `glusterfs`
      if (jsonObj.get("glusterfs") != null && !jsonObj.get("glusterfs").isJsonNull()) {
        V1GlusterfsPersistentVolumeSource.validateJsonElement(jsonObj.get("glusterfs"));
      }
      // validate the optional field `hostPath`
      if (jsonObj.get("hostPath") != null && !jsonObj.get("hostPath").isJsonNull()) {
        V1HostPathVolumeSource.validateJsonElement(jsonObj.get("hostPath"));
      }
      // validate the optional field `iscsi`
      if (jsonObj.get("iscsi") != null && !jsonObj.get("iscsi").isJsonNull()) {
        V1ISCSIPersistentVolumeSource.validateJsonElement(jsonObj.get("iscsi"));
      }
      // validate the optional field `local`
      if (jsonObj.get("local") != null && !jsonObj.get("local").isJsonNull()) {
        V1LocalVolumeSource.validateJsonElement(jsonObj.get("local"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("mountOptions") != null && !jsonObj.get("mountOptions").isJsonNull() && !jsonObj.get("mountOptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mountOptions` to be an array in the JSON string but got `%s`", jsonObj.get("mountOptions").toString()));
      }
      // validate the optional field `nfs`
      if (jsonObj.get("nfs") != null && !jsonObj.get("nfs").isJsonNull()) {
        V1NFSVolumeSource.validateJsonElement(jsonObj.get("nfs"));
      }
      // validate the optional field `nodeAffinity`
      if (jsonObj.get("nodeAffinity") != null && !jsonObj.get("nodeAffinity").isJsonNull()) {
        V1VolumeNodeAffinity.validateJsonElement(jsonObj.get("nodeAffinity"));
      }
      if ((jsonObj.get("persistentVolumeReclaimPolicy") != null && !jsonObj.get("persistentVolumeReclaimPolicy").isJsonNull()) && !jsonObj.get("persistentVolumeReclaimPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `persistentVolumeReclaimPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("persistentVolumeReclaimPolicy").toString()));
      }
      // validate the optional field `photonPersistentDisk`
      if (jsonObj.get("photonPersistentDisk") != null && !jsonObj.get("photonPersistentDisk").isJsonNull()) {
        V1PhotonPersistentDiskVolumeSource.validateJsonElement(jsonObj.get("photonPersistentDisk"));
      }
      // validate the optional field `portworxVolume`
      if (jsonObj.get("portworxVolume") != null && !jsonObj.get("portworxVolume").isJsonNull()) {
        V1PortworxVolumeSource.validateJsonElement(jsonObj.get("portworxVolume"));
      }
      // validate the optional field `quobyte`
      if (jsonObj.get("quobyte") != null && !jsonObj.get("quobyte").isJsonNull()) {
        V1QuobyteVolumeSource.validateJsonElement(jsonObj.get("quobyte"));
      }
      // validate the optional field `rbd`
      if (jsonObj.get("rbd") != null && !jsonObj.get("rbd").isJsonNull()) {
        V1RBDPersistentVolumeSource.validateJsonElement(jsonObj.get("rbd"));
      }
      // validate the optional field `scaleIO`
      if (jsonObj.get("scaleIO") != null && !jsonObj.get("scaleIO").isJsonNull()) {
        V1ScaleIOPersistentVolumeSource.validateJsonElement(jsonObj.get("scaleIO"));
      }
      if ((jsonObj.get("storageClassName") != null && !jsonObj.get("storageClassName").isJsonNull()) && !jsonObj.get("storageClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storageClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storageClassName").toString()));
      }
      // validate the optional field `storageos`
      if (jsonObj.get("storageos") != null && !jsonObj.get("storageos").isJsonNull()) {
        V1StorageOSPersistentVolumeSource.validateJsonElement(jsonObj.get("storageos"));
      }
      if ((jsonObj.get("volumeAttributesClassName") != null && !jsonObj.get("volumeAttributesClassName").isJsonNull()) && !jsonObj.get("volumeAttributesClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeAttributesClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeAttributesClassName").toString()));
      }
      if ((jsonObj.get("volumeMode") != null && !jsonObj.get("volumeMode").isJsonNull()) && !jsonObj.get("volumeMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumeMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumeMode").toString()));
      }
      // validate the optional field `vsphereVolume`
      if (jsonObj.get("vsphereVolume") != null && !jsonObj.get("vsphereVolume").isJsonNull()) {
        V1VsphereVirtualDiskVolumeSource.validateJsonElement(jsonObj.get("vsphereVolume"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1PersistentVolumeSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1PersistentVolumeSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1PersistentVolumeSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1PersistentVolumeSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1PersistentVolumeSpec>() {
           @Override
           public void write(JsonWriter out, V1PersistentVolumeSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1PersistentVolumeSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1PersistentVolumeSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1PersistentVolumeSpec
   * @throws IOException if the JSON string is invalid with respect to V1PersistentVolumeSpec
   */
  public static V1PersistentVolumeSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1PersistentVolumeSpec.class);
  }

  /**
   * Convert an instance of V1PersistentVolumeSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
