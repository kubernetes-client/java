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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Volume represents a named volume in a pod that may be accessed by any container in the pod. */
@ApiModel(
    description =
        "Volume represents a named volume in a pod that may be accessed by any container in the pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-12-05T08:14:34.919Z[Etc/UTC]")
public class V1Volume {
  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";

  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  private V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";

  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  private V1AzureDiskVolumeSource azureDisk;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";

  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  private V1AzureFileVolumeSource azureFile;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";

  @SerializedName(SERIALIZED_NAME_CEPHFS)
  private V1CephFSVolumeSource cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";

  @SerializedName(SERIALIZED_NAME_CINDER)
  private V1CinderVolumeSource cinder;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ConfigMapVolumeSource configMap;

  public static final String SERIALIZED_NAME_CSI = "csi";

  @SerializedName(SERIALIZED_NAME_CSI)
  private V1CSIVolumeSource csi;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";

  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1DownwardAPIVolumeSource downwardAPI;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";

  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private V1EmptyDirVolumeSource emptyDir;

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";

  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private V1EphemeralVolumeSource ephemeral;

  public static final String SERIALIZED_NAME_FC = "fc";

  @SerializedName(SERIALIZED_NAME_FC)
  private V1FCVolumeSource fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";

  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  private V1FlexVolumeSource flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";

  @SerializedName(SERIALIZED_NAME_FLOCKER)
  private V1FlockerVolumeSource flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";

  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  private V1GCEPersistentDiskVolumeSource gcePersistentDisk;

  public static final String SERIALIZED_NAME_GIT_REPO = "gitRepo";

  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  private V1GitRepoVolumeSource gitRepo;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";

  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  private V1GlusterfsVolumeSource glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";

  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private V1HostPathVolumeSource hostPath;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";

  @SerializedName(SERIALIZED_NAME_ISCSI)
  private V1ISCSIVolumeSource iscsi;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NFS = "nfs";

  @SerializedName(SERIALIZED_NAME_NFS)
  private V1NFSVolumeSource nfs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";

  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private V1PersistentVolumeClaimVolumeSource persistentVolumeClaim;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";

  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  private V1PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";

  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  private V1PortworxVolumeSource portworxVolume;

  public static final String SERIALIZED_NAME_PROJECTED = "projected";

  @SerializedName(SERIALIZED_NAME_PROJECTED)
  private V1ProjectedVolumeSource projected;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";

  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  private V1QuobyteVolumeSource quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";

  @SerializedName(SERIALIZED_NAME_RBD)
  private V1RBDVolumeSource rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";

  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  private V1ScaleIOVolumeSource scaleIO;

  public static final String SERIALIZED_NAME_SECRET = "secret";

  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1SecretVolumeSource secret;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";

  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  private V1StorageOSVolumeSource storageos;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";

  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  private V1VsphereVirtualDiskVolumeSource vsphereVolume;

  public V1Volume awsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {

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

  public V1Volume azureDisk(V1AzureDiskVolumeSource azureDisk) {

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

  public V1Volume azureFile(V1AzureFileVolumeSource azureFile) {

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
  public V1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(V1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public V1Volume cephfs(V1CephFSVolumeSource cephfs) {

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
  public V1CephFSVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(V1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public V1Volume cinder(V1CinderVolumeSource cinder) {

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
  public V1CinderVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(V1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }

  public V1Volume configMap(V1ConfigMapVolumeSource configMap) {

    this.configMap = configMap;
    return this;
  }

  /**
   * Get configMap
   *
   * @return configMap
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(V1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }

  public V1Volume csi(V1CSIVolumeSource csi) {

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
  public V1CSIVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(V1CSIVolumeSource csi) {
    this.csi = csi;
  }

  public V1Volume downwardAPI(V1DownwardAPIVolumeSource downwardAPI) {

    this.downwardAPI = downwardAPI;
    return this;
  }

  /**
   * Get downwardAPI
   *
   * @return downwardAPI
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(V1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  public V1Volume emptyDir(V1EmptyDirVolumeSource emptyDir) {

    this.emptyDir = emptyDir;
    return this;
  }

  /**
   * Get emptyDir
   *
   * @return emptyDir
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(V1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }

  public V1Volume ephemeral(V1EphemeralVolumeSource ephemeral) {

    this.ephemeral = ephemeral;
    return this;
  }

  /**
   * Get ephemeral
   *
   * @return ephemeral
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1EphemeralVolumeSource getEphemeral() {
    return ephemeral;
  }

  public void setEphemeral(V1EphemeralVolumeSource ephemeral) {
    this.ephemeral = ephemeral;
  }

  public V1Volume fc(V1FCVolumeSource fc) {

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

  public V1Volume flexVolume(V1FlexVolumeSource flexVolume) {

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
  public V1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(V1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public V1Volume flocker(V1FlockerVolumeSource flocker) {

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

  public V1Volume gcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {

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

  public V1Volume gitRepo(V1GitRepoVolumeSource gitRepo) {

    this.gitRepo = gitRepo;
    return this;
  }

  /**
   * Get gitRepo
   *
   * @return gitRepo
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }

  public void setGitRepo(V1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }

  public V1Volume glusterfs(V1GlusterfsVolumeSource glusterfs) {

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
  public V1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(V1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public V1Volume hostPath(V1HostPathVolumeSource hostPath) {

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

  public V1Volume iscsi(V1ISCSIVolumeSource iscsi) {

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
  public V1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(V1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public V1Volume name(String name) {

    this.name = name;
    return this;
  }

  /**
   * name of the volume. Must be a DNS_LABEL and unique within the pod. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Volume nfs(V1NFSVolumeSource nfs) {

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

  public V1Volume persistentVolumeClaim(V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {

    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

  /**
   * Get persistentVolumeClaim
   *
   * @return persistentVolumeClaim
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }

  public void setPersistentVolumeClaim(V1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  public V1Volume photonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {

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

  public V1Volume portworxVolume(V1PortworxVolumeSource portworxVolume) {

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

  public V1Volume projected(V1ProjectedVolumeSource projected) {

    this.projected = projected;
    return this;
  }

  /**
   * Get projected
   *
   * @return projected
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ProjectedVolumeSource getProjected() {
    return projected;
  }

  public void setProjected(V1ProjectedVolumeSource projected) {
    this.projected = projected;
  }

  public V1Volume quobyte(V1QuobyteVolumeSource quobyte) {

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

  public V1Volume rbd(V1RBDVolumeSource rbd) {

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
  public V1RBDVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(V1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }

  public V1Volume scaleIO(V1ScaleIOVolumeSource scaleIO) {

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
  public V1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(V1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public V1Volume secret(V1SecretVolumeSource secret) {

    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   *
   * @return secret
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1SecretVolumeSource getSecret() {
    return secret;
  }

  public void setSecret(V1SecretVolumeSource secret) {
    this.secret = secret;
  }

  public V1Volume storageos(V1StorageOSVolumeSource storageos) {

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
  public V1StorageOSVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(V1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }

  public V1Volume vsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {

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
    V1Volume v1Volume = (V1Volume) o;
    return Objects.equals(this.awsElasticBlockStore, v1Volume.awsElasticBlockStore)
        && Objects.equals(this.azureDisk, v1Volume.azureDisk)
        && Objects.equals(this.azureFile, v1Volume.azureFile)
        && Objects.equals(this.cephfs, v1Volume.cephfs)
        && Objects.equals(this.cinder, v1Volume.cinder)
        && Objects.equals(this.configMap, v1Volume.configMap)
        && Objects.equals(this.csi, v1Volume.csi)
        && Objects.equals(this.downwardAPI, v1Volume.downwardAPI)
        && Objects.equals(this.emptyDir, v1Volume.emptyDir)
        && Objects.equals(this.ephemeral, v1Volume.ephemeral)
        && Objects.equals(this.fc, v1Volume.fc)
        && Objects.equals(this.flexVolume, v1Volume.flexVolume)
        && Objects.equals(this.flocker, v1Volume.flocker)
        && Objects.equals(this.gcePersistentDisk, v1Volume.gcePersistentDisk)
        && Objects.equals(this.gitRepo, v1Volume.gitRepo)
        && Objects.equals(this.glusterfs, v1Volume.glusterfs)
        && Objects.equals(this.hostPath, v1Volume.hostPath)
        && Objects.equals(this.iscsi, v1Volume.iscsi)
        && Objects.equals(this.name, v1Volume.name)
        && Objects.equals(this.nfs, v1Volume.nfs)
        && Objects.equals(this.persistentVolumeClaim, v1Volume.persistentVolumeClaim)
        && Objects.equals(this.photonPersistentDisk, v1Volume.photonPersistentDisk)
        && Objects.equals(this.portworxVolume, v1Volume.portworxVolume)
        && Objects.equals(this.projected, v1Volume.projected)
        && Objects.equals(this.quobyte, v1Volume.quobyte)
        && Objects.equals(this.rbd, v1Volume.rbd)
        && Objects.equals(this.scaleIO, v1Volume.scaleIO)
        && Objects.equals(this.secret, v1Volume.secret)
        && Objects.equals(this.storageos, v1Volume.storageos)
        && Objects.equals(this.vsphereVolume, v1Volume.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        awsElasticBlockStore,
        azureDisk,
        azureFile,
        cephfs,
        cinder,
        configMap,
        csi,
        downwardAPI,
        emptyDir,
        ephemeral,
        fc,
        flexVolume,
        flocker,
        gcePersistentDisk,
        gitRepo,
        glusterfs,
        hostPath,
        iscsi,
        name,
        nfs,
        persistentVolumeClaim,
        photonPersistentDisk,
        portworxVolume,
        projected,
        quobyte,
        rbd,
        scaleIO,
        secret,
        storageos,
        vsphereVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Volume {\n");
    sb.append("    awsElasticBlockStore: ")
        .append(toIndentedString(awsElasticBlockStore))
        .append("\n");
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
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ")
        .append(toIndentedString(persistentVolumeClaim))
        .append("\n");
    sb.append("    photonPersistentDisk: ")
        .append(toIndentedString(photonPersistentDisk))
        .append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
