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
import io.kubernetes.client.openapi.models.V1AWSElasticBlockStoreVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1AzureFileVolumeSource;
import io.kubernetes.client.openapi.models.V1CSIVolumeSource;
import io.kubernetes.client.openapi.models.V1CephFSVolumeSource;
import io.kubernetes.client.openapi.models.V1CinderVolumeSource;
import io.kubernetes.client.openapi.models.V1ConfigMapVolumeSource;
import io.kubernetes.client.openapi.models.V1DownwardAPIVolumeSource;
import io.kubernetes.client.openapi.models.V1EmptyDirVolumeSource;
import io.kubernetes.client.openapi.models.V1EphemeralVolumeSource;
import io.kubernetes.client.openapi.models.V1FCVolumeSource;
import io.kubernetes.client.openapi.models.V1FlexVolumeSource;
import io.kubernetes.client.openapi.models.V1FlockerVolumeSource;
import io.kubernetes.client.openapi.models.V1GCEPersistentDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1GitRepoVolumeSource;
import io.kubernetes.client.openapi.models.V1GlusterfsVolumeSource;
import io.kubernetes.client.openapi.models.V1HostPathVolumeSource;
import io.kubernetes.client.openapi.models.V1ISCSIVolumeSource;
import io.kubernetes.client.openapi.models.V1ImageVolumeSource;
import io.kubernetes.client.openapi.models.V1NFSVolumeSource;
import io.kubernetes.client.openapi.models.V1PersistentVolumeClaimVolumeSource;
import io.kubernetes.client.openapi.models.V1PhotonPersistentDiskVolumeSource;
import io.kubernetes.client.openapi.models.V1PortworxVolumeSource;
import io.kubernetes.client.openapi.models.V1ProjectedVolumeSource;
import io.kubernetes.client.openapi.models.V1QuobyteVolumeSource;
import io.kubernetes.client.openapi.models.V1RBDVolumeSource;
import io.kubernetes.client.openapi.models.V1ScaleIOVolumeSource;
import io.kubernetes.client.openapi.models.V1SecretVolumeSource;
import io.kubernetes.client.openapi.models.V1StorageOSVolumeSource;
import io.kubernetes.client.openapi.models.V1VsphereVirtualDiskVolumeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;

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
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@ApiModel(description = "Volume represents a named volume in a pod that may be accessed by any container in the pod.")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-09-11T18:00:16.154662Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class V1Volume {
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
  private V1AzureFileVolumeSource azureFile;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";
  @SerializedName(SERIALIZED_NAME_CEPHFS)
  @jakarta.annotation.Nullable
  private V1CephFSVolumeSource cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";
  @SerializedName(SERIALIZED_NAME_CINDER)
  @jakarta.annotation.Nullable
  private V1CinderVolumeSource cinder;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  @jakarta.annotation.Nullable
  private V1ConfigMapVolumeSource configMap;

  public static final String SERIALIZED_NAME_CSI = "csi";
  @SerializedName(SERIALIZED_NAME_CSI)
  @jakarta.annotation.Nullable
  private V1CSIVolumeSource csi;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  @jakarta.annotation.Nullable
  private V1DownwardAPIVolumeSource downwardAPI;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";
  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  @jakarta.annotation.Nullable
  private V1EmptyDirVolumeSource emptyDir;

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  @jakarta.annotation.Nullable
  private V1EphemeralVolumeSource ephemeral;

  public static final String SERIALIZED_NAME_FC = "fc";
  @SerializedName(SERIALIZED_NAME_FC)
  @jakarta.annotation.Nullable
  private V1FCVolumeSource fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";
  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  @jakarta.annotation.Nullable
  private V1FlexVolumeSource flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";
  @SerializedName(SERIALIZED_NAME_FLOCKER)
  @jakarta.annotation.Nullable
  private V1FlockerVolumeSource flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";
  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  @jakarta.annotation.Nullable
  private V1GCEPersistentDiskVolumeSource gcePersistentDisk;

  public static final String SERIALIZED_NAME_GIT_REPO = "gitRepo";
  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  @jakarta.annotation.Nullable
  private V1GitRepoVolumeSource gitRepo;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";
  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  @jakarta.annotation.Nullable
  private V1GlusterfsVolumeSource glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";
  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  @jakarta.annotation.Nullable
  private V1HostPathVolumeSource hostPath;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  @jakarta.annotation.Nullable
  private V1ImageVolumeSource image;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";
  @SerializedName(SERIALIZED_NAME_ISCSI)
  @jakarta.annotation.Nullable
  private V1ISCSIVolumeSource iscsi;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_NFS = "nfs";
  @SerializedName(SERIALIZED_NAME_NFS)
  @jakarta.annotation.Nullable
  private V1NFSVolumeSource nfs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  @jakarta.annotation.Nullable
  private V1PersistentVolumeClaimVolumeSource persistentVolumeClaim;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";
  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  @jakarta.annotation.Nullable
  private V1PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";
  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  @jakarta.annotation.Nullable
  private V1PortworxVolumeSource portworxVolume;

  public static final String SERIALIZED_NAME_PROJECTED = "projected";
  @SerializedName(SERIALIZED_NAME_PROJECTED)
  @jakarta.annotation.Nullable
  private V1ProjectedVolumeSource projected;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";
  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  @jakarta.annotation.Nullable
  private V1QuobyteVolumeSource quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";
  @SerializedName(SERIALIZED_NAME_RBD)
  @jakarta.annotation.Nullable
  private V1RBDVolumeSource rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";
  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  @jakarta.annotation.Nullable
  private V1ScaleIOVolumeSource scaleIO;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  @jakarta.annotation.Nullable
  private V1SecretVolumeSource secret;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";
  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  @jakarta.annotation.Nullable
  private V1StorageOSVolumeSource storageos;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";
  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  @jakarta.annotation.Nullable
  private V1VsphereVirtualDiskVolumeSource vsphereVolume;

  public V1Volume() {
  }

  public V1Volume awsElasticBlockStore(@jakarta.annotation.Nullable V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
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


  public V1Volume azureDisk(@jakarta.annotation.Nullable V1AzureDiskVolumeSource azureDisk) {
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


  public V1Volume azureFile(@jakarta.annotation.Nullable V1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

  /**
   * Get azureFile
   * @return azureFile
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(@jakarta.annotation.Nullable V1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }


  public V1Volume cephfs(@jakarta.annotation.Nullable V1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

  /**
   * Get cephfs
   * @return cephfs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CephFSVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(@jakarta.annotation.Nullable V1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }


  public V1Volume cinder(@jakarta.annotation.Nullable V1CinderVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

  /**
   * Get cinder
   * @return cinder
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CinderVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(@jakarta.annotation.Nullable V1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }


  public V1Volume configMap(@jakarta.annotation.Nullable V1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
    return this;
  }

  /**
   * Get configMap
   * @return configMap
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(@jakarta.annotation.Nullable V1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }


  public V1Volume csi(@jakarta.annotation.Nullable V1CSIVolumeSource csi) {
    this.csi = csi;
    return this;
  }

  /**
   * Get csi
   * @return csi
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1CSIVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(@jakarta.annotation.Nullable V1CSIVolumeSource csi) {
    this.csi = csi;
  }


  public V1Volume downwardAPI(@jakarta.annotation.Nullable V1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

  /**
   * Get downwardAPI
   * @return downwardAPI
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(@jakarta.annotation.Nullable V1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public V1Volume emptyDir(@jakarta.annotation.Nullable V1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
    return this;
  }

  /**
   * Get emptyDir
   * @return emptyDir
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(@jakarta.annotation.Nullable V1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }


  public V1Volume ephemeral(@jakarta.annotation.Nullable V1EphemeralVolumeSource ephemeral) {
    this.ephemeral = ephemeral;
    return this;
  }

  /**
   * Get ephemeral
   * @return ephemeral
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EphemeralVolumeSource getEphemeral() {
    return ephemeral;
  }

  public void setEphemeral(@jakarta.annotation.Nullable V1EphemeralVolumeSource ephemeral) {
    this.ephemeral = ephemeral;
  }


  public V1Volume fc(@jakarta.annotation.Nullable V1FCVolumeSource fc) {
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


  public V1Volume flexVolume(@jakarta.annotation.Nullable V1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

  /**
   * Get flexVolume
   * @return flexVolume
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(@jakarta.annotation.Nullable V1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }


  public V1Volume flocker(@jakarta.annotation.Nullable V1FlockerVolumeSource flocker) {
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


  public V1Volume gcePersistentDisk(@jakarta.annotation.Nullable V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
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


  public V1Volume gitRepo(@jakarta.annotation.Nullable V1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

  /**
   * Get gitRepo
   * @return gitRepo
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }

  public void setGitRepo(@jakarta.annotation.Nullable V1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }


  public V1Volume glusterfs(@jakarta.annotation.Nullable V1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

  /**
   * Get glusterfs
   * @return glusterfs
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(@jakarta.annotation.Nullable V1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }


  public V1Volume hostPath(@jakarta.annotation.Nullable V1HostPathVolumeSource hostPath) {
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


  public V1Volume image(@jakarta.annotation.Nullable V1ImageVolumeSource image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ImageVolumeSource getImage() {
    return image;
  }

  public void setImage(@jakarta.annotation.Nullable V1ImageVolumeSource image) {
    this.image = image;
  }


  public V1Volume iscsi(@jakarta.annotation.Nullable V1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

  /**
   * Get iscsi
   * @return iscsi
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(@jakarta.annotation.Nullable V1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }


  public V1Volume name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
   */
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public V1Volume nfs(@jakarta.annotation.Nullable V1NFSVolumeSource nfs) {
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


  public V1Volume persistentVolumeClaim(@jakarta.annotation.Nullable V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

  /**
   * Get persistentVolumeClaim
   * @return persistentVolumeClaim
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }

  public void setPersistentVolumeClaim(@jakarta.annotation.Nullable V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }


  public V1Volume photonPersistentDisk(@jakarta.annotation.Nullable V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
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


  public V1Volume portworxVolume(@jakarta.annotation.Nullable V1PortworxVolumeSource portworxVolume) {
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


  public V1Volume projected(@jakarta.annotation.Nullable V1ProjectedVolumeSource projected) {
    this.projected = projected;
    return this;
  }

  /**
   * Get projected
   * @return projected
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ProjectedVolumeSource getProjected() {
    return projected;
  }

  public void setProjected(@jakarta.annotation.Nullable V1ProjectedVolumeSource projected) {
    this.projected = projected;
  }


  public V1Volume quobyte(@jakarta.annotation.Nullable V1QuobyteVolumeSource quobyte) {
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


  public V1Volume rbd(@jakarta.annotation.Nullable V1RBDVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

  /**
   * Get rbd
   * @return rbd
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1RBDVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(@jakarta.annotation.Nullable V1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }


  public V1Volume scaleIO(@jakarta.annotation.Nullable V1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

  /**
   * Get scaleIO
   * @return scaleIO
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(@jakarta.annotation.Nullable V1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }


  public V1Volume secret(@jakarta.annotation.Nullable V1SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   * @return secret
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SecretVolumeSource getSecret() {
    return secret;
  }

  public void setSecret(@jakarta.annotation.Nullable V1SecretVolumeSource secret) {
    this.secret = secret;
  }


  public V1Volume storageos(@jakarta.annotation.Nullable V1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

  /**
   * Get storageos
   * @return storageos
   */
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1StorageOSVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(@jakarta.annotation.Nullable V1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }


  public V1Volume vsphereVolume(@jakarta.annotation.Nullable V1VsphereVirtualDiskVolumeSource vsphereVolume) {
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
    V1Volume v1Volume = (V1Volume) o;
    return Objects.equals(this.awsElasticBlockStore, v1Volume.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, v1Volume.azureDisk) &&
        Objects.equals(this.azureFile, v1Volume.azureFile) &&
        Objects.equals(this.cephfs, v1Volume.cephfs) &&
        Objects.equals(this.cinder, v1Volume.cinder) &&
        Objects.equals(this.configMap, v1Volume.configMap) &&
        Objects.equals(this.csi, v1Volume.csi) &&
        Objects.equals(this.downwardAPI, v1Volume.downwardAPI) &&
        Objects.equals(this.emptyDir, v1Volume.emptyDir) &&
        Objects.equals(this.ephemeral, v1Volume.ephemeral) &&
        Objects.equals(this.fc, v1Volume.fc) &&
        Objects.equals(this.flexVolume, v1Volume.flexVolume) &&
        Objects.equals(this.flocker, v1Volume.flocker) &&
        Objects.equals(this.gcePersistentDisk, v1Volume.gcePersistentDisk) &&
        Objects.equals(this.gitRepo, v1Volume.gitRepo) &&
        Objects.equals(this.glusterfs, v1Volume.glusterfs) &&
        Objects.equals(this.hostPath, v1Volume.hostPath) &&
        Objects.equals(this.image, v1Volume.image) &&
        Objects.equals(this.iscsi, v1Volume.iscsi) &&
        Objects.equals(this.name, v1Volume.name) &&
        Objects.equals(this.nfs, v1Volume.nfs) &&
        Objects.equals(this.persistentVolumeClaim, v1Volume.persistentVolumeClaim) &&
        Objects.equals(this.photonPersistentDisk, v1Volume.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, v1Volume.portworxVolume) &&
        Objects.equals(this.projected, v1Volume.projected) &&
        Objects.equals(this.quobyte, v1Volume.quobyte) &&
        Objects.equals(this.rbd, v1Volume.rbd) &&
        Objects.equals(this.scaleIO, v1Volume.scaleIO) &&
        Objects.equals(this.secret, v1Volume.secret) &&
        Objects.equals(this.storageos, v1Volume.storageos) &&
        Objects.equals(this.vsphereVolume, v1Volume.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardAPI, emptyDir, ephemeral, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, image, iscsi, name, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Volume {\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    projected: ").append(toIndentedString(projected)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
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
    openapiFields.add("awsElasticBlockStore");
    openapiFields.add("azureDisk");
    openapiFields.add("azureFile");
    openapiFields.add("cephfs");
    openapiFields.add("cinder");
    openapiFields.add("configMap");
    openapiFields.add("csi");
    openapiFields.add("downwardAPI");
    openapiFields.add("emptyDir");
    openapiFields.add("ephemeral");
    openapiFields.add("fc");
    openapiFields.add("flexVolume");
    openapiFields.add("flocker");
    openapiFields.add("gcePersistentDisk");
    openapiFields.add("gitRepo");
    openapiFields.add("glusterfs");
    openapiFields.add("hostPath");
    openapiFields.add("image");
    openapiFields.add("iscsi");
    openapiFields.add("name");
    openapiFields.add("nfs");
    openapiFields.add("persistentVolumeClaim");
    openapiFields.add("photonPersistentDisk");
    openapiFields.add("portworxVolume");
    openapiFields.add("projected");
    openapiFields.add("quobyte");
    openapiFields.add("rbd");
    openapiFields.add("scaleIO");
    openapiFields.add("secret");
    openapiFields.add("storageos");
    openapiFields.add("vsphereVolume");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to V1Volume
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1Volume.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1Volume is not found in the empty JSON string", V1Volume.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1Volume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1Volume` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1Volume.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
        V1AzureFileVolumeSource.validateJsonElement(jsonObj.get("azureFile"));
      }
      // validate the optional field `cephfs`
      if (jsonObj.get("cephfs") != null && !jsonObj.get("cephfs").isJsonNull()) {
        V1CephFSVolumeSource.validateJsonElement(jsonObj.get("cephfs"));
      }
      // validate the optional field `cinder`
      if (jsonObj.get("cinder") != null && !jsonObj.get("cinder").isJsonNull()) {
        V1CinderVolumeSource.validateJsonElement(jsonObj.get("cinder"));
      }
      // validate the optional field `configMap`
      if (jsonObj.get("configMap") != null && !jsonObj.get("configMap").isJsonNull()) {
        V1ConfigMapVolumeSource.validateJsonElement(jsonObj.get("configMap"));
      }
      // validate the optional field `csi`
      if (jsonObj.get("csi") != null && !jsonObj.get("csi").isJsonNull()) {
        V1CSIVolumeSource.validateJsonElement(jsonObj.get("csi"));
      }
      // validate the optional field `downwardAPI`
      if (jsonObj.get("downwardAPI") != null && !jsonObj.get("downwardAPI").isJsonNull()) {
        V1DownwardAPIVolumeSource.validateJsonElement(jsonObj.get("downwardAPI"));
      }
      // validate the optional field `emptyDir`
      if (jsonObj.get("emptyDir") != null && !jsonObj.get("emptyDir").isJsonNull()) {
        V1EmptyDirVolumeSource.validateJsonElement(jsonObj.get("emptyDir"));
      }
      // validate the optional field `ephemeral`
      if (jsonObj.get("ephemeral") != null && !jsonObj.get("ephemeral").isJsonNull()) {
        V1EphemeralVolumeSource.validateJsonElement(jsonObj.get("ephemeral"));
      }
      // validate the optional field `fc`
      if (jsonObj.get("fc") != null && !jsonObj.get("fc").isJsonNull()) {
        V1FCVolumeSource.validateJsonElement(jsonObj.get("fc"));
      }
      // validate the optional field `flexVolume`
      if (jsonObj.get("flexVolume") != null && !jsonObj.get("flexVolume").isJsonNull()) {
        V1FlexVolumeSource.validateJsonElement(jsonObj.get("flexVolume"));
      }
      // validate the optional field `flocker`
      if (jsonObj.get("flocker") != null && !jsonObj.get("flocker").isJsonNull()) {
        V1FlockerVolumeSource.validateJsonElement(jsonObj.get("flocker"));
      }
      // validate the optional field `gcePersistentDisk`
      if (jsonObj.get("gcePersistentDisk") != null && !jsonObj.get("gcePersistentDisk").isJsonNull()) {
        V1GCEPersistentDiskVolumeSource.validateJsonElement(jsonObj.get("gcePersistentDisk"));
      }
      // validate the optional field `gitRepo`
      if (jsonObj.get("gitRepo") != null && !jsonObj.get("gitRepo").isJsonNull()) {
        V1GitRepoVolumeSource.validateJsonElement(jsonObj.get("gitRepo"));
      }
      // validate the optional field `glusterfs`
      if (jsonObj.get("glusterfs") != null && !jsonObj.get("glusterfs").isJsonNull()) {
        V1GlusterfsVolumeSource.validateJsonElement(jsonObj.get("glusterfs"));
      }
      // validate the optional field `hostPath`
      if (jsonObj.get("hostPath") != null && !jsonObj.get("hostPath").isJsonNull()) {
        V1HostPathVolumeSource.validateJsonElement(jsonObj.get("hostPath"));
      }
      // validate the optional field `image`
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonNull()) {
        V1ImageVolumeSource.validateJsonElement(jsonObj.get("image"));
      }
      // validate the optional field `iscsi`
      if (jsonObj.get("iscsi") != null && !jsonObj.get("iscsi").isJsonNull()) {
        V1ISCSIVolumeSource.validateJsonElement(jsonObj.get("iscsi"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `nfs`
      if (jsonObj.get("nfs") != null && !jsonObj.get("nfs").isJsonNull()) {
        V1NFSVolumeSource.validateJsonElement(jsonObj.get("nfs"));
      }
      // validate the optional field `persistentVolumeClaim`
      if (jsonObj.get("persistentVolumeClaim") != null && !jsonObj.get("persistentVolumeClaim").isJsonNull()) {
        V1PersistentVolumeClaimVolumeSource.validateJsonElement(jsonObj.get("persistentVolumeClaim"));
      }
      // validate the optional field `photonPersistentDisk`
      if (jsonObj.get("photonPersistentDisk") != null && !jsonObj.get("photonPersistentDisk").isJsonNull()) {
        V1PhotonPersistentDiskVolumeSource.validateJsonElement(jsonObj.get("photonPersistentDisk"));
      }
      // validate the optional field `portworxVolume`
      if (jsonObj.get("portworxVolume") != null && !jsonObj.get("portworxVolume").isJsonNull()) {
        V1PortworxVolumeSource.validateJsonElement(jsonObj.get("portworxVolume"));
      }
      // validate the optional field `projected`
      if (jsonObj.get("projected") != null && !jsonObj.get("projected").isJsonNull()) {
        V1ProjectedVolumeSource.validateJsonElement(jsonObj.get("projected"));
      }
      // validate the optional field `quobyte`
      if (jsonObj.get("quobyte") != null && !jsonObj.get("quobyte").isJsonNull()) {
        V1QuobyteVolumeSource.validateJsonElement(jsonObj.get("quobyte"));
      }
      // validate the optional field `rbd`
      if (jsonObj.get("rbd") != null && !jsonObj.get("rbd").isJsonNull()) {
        V1RBDVolumeSource.validateJsonElement(jsonObj.get("rbd"));
      }
      // validate the optional field `scaleIO`
      if (jsonObj.get("scaleIO") != null && !jsonObj.get("scaleIO").isJsonNull()) {
        V1ScaleIOVolumeSource.validateJsonElement(jsonObj.get("scaleIO"));
      }
      // validate the optional field `secret`
      if (jsonObj.get("secret") != null && !jsonObj.get("secret").isJsonNull()) {
        V1SecretVolumeSource.validateJsonElement(jsonObj.get("secret"));
      }
      // validate the optional field `storageos`
      if (jsonObj.get("storageos") != null && !jsonObj.get("storageos").isJsonNull()) {
        V1StorageOSVolumeSource.validateJsonElement(jsonObj.get("storageos"));
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
       if (!V1Volume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1Volume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1Volume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1Volume.class));

       return (TypeAdapter<T>) new TypeAdapter<V1Volume>() {
           @Override
           public void write(JsonWriter out, V1Volume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1Volume read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of V1Volume given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of V1Volume
   * @throws IOException if the JSON string is invalid with respect to V1Volume
   */
  public static V1Volume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1Volume.class);
  }

  /**
   * Convert an instance of V1Volume to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
