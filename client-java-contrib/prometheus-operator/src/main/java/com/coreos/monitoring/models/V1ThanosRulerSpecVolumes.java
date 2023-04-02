/*
Copyright 2020 The Kubernetes Authors.
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
package com.coreos.monitoring.models;

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
    date = "2020-08-31T19:41:55.826Z[Etc/UTC]")
public class V1ThanosRulerSpecVolumes {
  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";

  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  private V1ThanosRulerSpecAwsElasticBlockStore awsElasticBlockStore;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";

  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  private V1ThanosRulerSpecAzureDisk azureDisk;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";

  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  private V1ThanosRulerSpecAzureFile azureFile;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";

  @SerializedName(SERIALIZED_NAME_CEPHFS)
  private V1ThanosRulerSpecCephfs cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";

  @SerializedName(SERIALIZED_NAME_CINDER)
  private V1ThanosRulerSpecCinder cinder;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";

  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1ThanosRulerSpecConfigMap configMap;

  public static final String SERIALIZED_NAME_CSI = "csi";

  @SerializedName(SERIALIZED_NAME_CSI)
  private V1ThanosRulerSpecCsi csi;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";

  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1ThanosRulerSpecDownwardAPI downwardAPI;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";

  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private V1ThanosRulerSpecEmptyDir emptyDir;

  public static final String SERIALIZED_NAME_FC = "fc";

  @SerializedName(SERIALIZED_NAME_FC)
  private V1ThanosRulerSpecFc fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";

  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  private V1ThanosRulerSpecFlexVolume flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";

  @SerializedName(SERIALIZED_NAME_FLOCKER)
  private V1ThanosRulerSpecFlocker flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";

  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  private V1ThanosRulerSpecGcePersistentDisk gcePersistentDisk;

  public static final String SERIALIZED_NAME_GIT_REPO = "gitRepo";

  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  private V1ThanosRulerSpecGitRepo gitRepo;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";

  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  private V1ThanosRulerSpecGlusterfs glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";

  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private V1ThanosRulerSpecHostPath hostPath;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";

  @SerializedName(SERIALIZED_NAME_ISCSI)
  private V1ThanosRulerSpecIscsi iscsi;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NFS = "nfs";

  @SerializedName(SERIALIZED_NAME_NFS)
  private V1ThanosRulerSpecNfs nfs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";

  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private V1ThanosRulerSpecPersistentVolumeClaim persistentVolumeClaim;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";

  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  private V1ThanosRulerSpecPhotonPersistentDisk photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";

  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  private V1ThanosRulerSpecPortworxVolume portworxVolume;

  public static final String SERIALIZED_NAME_PROJECTED = "projected";

  @SerializedName(SERIALIZED_NAME_PROJECTED)
  private V1ThanosRulerSpecProjected projected;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";

  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  private V1ThanosRulerSpecQuobyte quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";

  @SerializedName(SERIALIZED_NAME_RBD)
  private V1ThanosRulerSpecRbd rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";

  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  private V1ThanosRulerSpecScaleIO scaleIO;

  public static final String SERIALIZED_NAME_SECRET = "secret";

  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1ThanosRulerSpecSecret secret;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";

  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  private V1ThanosRulerSpecStorageos storageos;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";

  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  private V1ThanosRulerSpecVsphereVolume vsphereVolume;

  public V1ThanosRulerSpecVolumes awsElasticBlockStore(
      V1ThanosRulerSpecAwsElasticBlockStore awsElasticBlockStore) {

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
  public V1ThanosRulerSpecAwsElasticBlockStore getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }

  public void setAwsElasticBlockStore(V1ThanosRulerSpecAwsElasticBlockStore awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }

  public V1ThanosRulerSpecVolumes azureDisk(V1ThanosRulerSpecAzureDisk azureDisk) {

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
  public V1ThanosRulerSpecAzureDisk getAzureDisk() {
    return azureDisk;
  }

  public void setAzureDisk(V1ThanosRulerSpecAzureDisk azureDisk) {
    this.azureDisk = azureDisk;
  }

  public V1ThanosRulerSpecVolumes azureFile(V1ThanosRulerSpecAzureFile azureFile) {

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
  public V1ThanosRulerSpecAzureFile getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(V1ThanosRulerSpecAzureFile azureFile) {
    this.azureFile = azureFile;
  }

  public V1ThanosRulerSpecVolumes cephfs(V1ThanosRulerSpecCephfs cephfs) {

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
  public V1ThanosRulerSpecCephfs getCephfs() {
    return cephfs;
  }

  public void setCephfs(V1ThanosRulerSpecCephfs cephfs) {
    this.cephfs = cephfs;
  }

  public V1ThanosRulerSpecVolumes cinder(V1ThanosRulerSpecCinder cinder) {

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
  public V1ThanosRulerSpecCinder getCinder() {
    return cinder;
  }

  public void setCinder(V1ThanosRulerSpecCinder cinder) {
    this.cinder = cinder;
  }

  public V1ThanosRulerSpecVolumes configMap(V1ThanosRulerSpecConfigMap configMap) {

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
  public V1ThanosRulerSpecConfigMap getConfigMap() {
    return configMap;
  }

  public void setConfigMap(V1ThanosRulerSpecConfigMap configMap) {
    this.configMap = configMap;
  }

  public V1ThanosRulerSpecVolumes csi(V1ThanosRulerSpecCsi csi) {

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
  public V1ThanosRulerSpecCsi getCsi() {
    return csi;
  }

  public void setCsi(V1ThanosRulerSpecCsi csi) {
    this.csi = csi;
  }

  public V1ThanosRulerSpecVolumes downwardAPI(V1ThanosRulerSpecDownwardAPI downwardAPI) {

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
  public V1ThanosRulerSpecDownwardAPI getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(V1ThanosRulerSpecDownwardAPI downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  public V1ThanosRulerSpecVolumes emptyDir(V1ThanosRulerSpecEmptyDir emptyDir) {

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
  public V1ThanosRulerSpecEmptyDir getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(V1ThanosRulerSpecEmptyDir emptyDir) {
    this.emptyDir = emptyDir;
  }

  public V1ThanosRulerSpecVolumes fc(V1ThanosRulerSpecFc fc) {

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
  public V1ThanosRulerSpecFc getFc() {
    return fc;
  }

  public void setFc(V1ThanosRulerSpecFc fc) {
    this.fc = fc;
  }

  public V1ThanosRulerSpecVolumes flexVolume(V1ThanosRulerSpecFlexVolume flexVolume) {

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
  public V1ThanosRulerSpecFlexVolume getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(V1ThanosRulerSpecFlexVolume flexVolume) {
    this.flexVolume = flexVolume;
  }

  public V1ThanosRulerSpecVolumes flocker(V1ThanosRulerSpecFlocker flocker) {

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
  public V1ThanosRulerSpecFlocker getFlocker() {
    return flocker;
  }

  public void setFlocker(V1ThanosRulerSpecFlocker flocker) {
    this.flocker = flocker;
  }

  public V1ThanosRulerSpecVolumes gcePersistentDisk(
      V1ThanosRulerSpecGcePersistentDisk gcePersistentDisk) {

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
  public V1ThanosRulerSpecGcePersistentDisk getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(V1ThanosRulerSpecGcePersistentDisk gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public V1ThanosRulerSpecVolumes gitRepo(V1ThanosRulerSpecGitRepo gitRepo) {

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
  public V1ThanosRulerSpecGitRepo getGitRepo() {
    return gitRepo;
  }

  public void setGitRepo(V1ThanosRulerSpecGitRepo gitRepo) {
    this.gitRepo = gitRepo;
  }

  public V1ThanosRulerSpecVolumes glusterfs(V1ThanosRulerSpecGlusterfs glusterfs) {

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
  public V1ThanosRulerSpecGlusterfs getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(V1ThanosRulerSpecGlusterfs glusterfs) {
    this.glusterfs = glusterfs;
  }

  public V1ThanosRulerSpecVolumes hostPath(V1ThanosRulerSpecHostPath hostPath) {

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
  public V1ThanosRulerSpecHostPath getHostPath() {
    return hostPath;
  }

  public void setHostPath(V1ThanosRulerSpecHostPath hostPath) {
    this.hostPath = hostPath;
  }

  public V1ThanosRulerSpecVolumes iscsi(V1ThanosRulerSpecIscsi iscsi) {

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
  public V1ThanosRulerSpecIscsi getIscsi() {
    return iscsi;
  }

  public void setIscsi(V1ThanosRulerSpecIscsi iscsi) {
    this.iscsi = iscsi;
  }

  public V1ThanosRulerSpecVolumes name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info:
   * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   *
   * @return name
   */
  @ApiModelProperty(
      required = true,
      value =
          "Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ThanosRulerSpecVolumes nfs(V1ThanosRulerSpecNfs nfs) {

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
  public V1ThanosRulerSpecNfs getNfs() {
    return nfs;
  }

  public void setNfs(V1ThanosRulerSpecNfs nfs) {
    this.nfs = nfs;
  }

  public V1ThanosRulerSpecVolumes persistentVolumeClaim(
      V1ThanosRulerSpecPersistentVolumeClaim persistentVolumeClaim) {

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
  public V1ThanosRulerSpecPersistentVolumeClaim getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }

  public void setPersistentVolumeClaim(
      V1ThanosRulerSpecPersistentVolumeClaim persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  public V1ThanosRulerSpecVolumes photonPersistentDisk(
      V1ThanosRulerSpecPhotonPersistentDisk photonPersistentDisk) {

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
  public V1ThanosRulerSpecPhotonPersistentDisk getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }

  public void setPhotonPersistentDisk(V1ThanosRulerSpecPhotonPersistentDisk photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }

  public V1ThanosRulerSpecVolumes portworxVolume(V1ThanosRulerSpecPortworxVolume portworxVolume) {

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
  public V1ThanosRulerSpecPortworxVolume getPortworxVolume() {
    return portworxVolume;
  }

  public void setPortworxVolume(V1ThanosRulerSpecPortworxVolume portworxVolume) {
    this.portworxVolume = portworxVolume;
  }

  public V1ThanosRulerSpecVolumes projected(V1ThanosRulerSpecProjected projected) {

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
  public V1ThanosRulerSpecProjected getProjected() {
    return projected;
  }

  public void setProjected(V1ThanosRulerSpecProjected projected) {
    this.projected = projected;
  }

  public V1ThanosRulerSpecVolumes quobyte(V1ThanosRulerSpecQuobyte quobyte) {

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
  public V1ThanosRulerSpecQuobyte getQuobyte() {
    return quobyte;
  }

  public void setQuobyte(V1ThanosRulerSpecQuobyte quobyte) {
    this.quobyte = quobyte;
  }

  public V1ThanosRulerSpecVolumes rbd(V1ThanosRulerSpecRbd rbd) {

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
  public V1ThanosRulerSpecRbd getRbd() {
    return rbd;
  }

  public void setRbd(V1ThanosRulerSpecRbd rbd) {
    this.rbd = rbd;
  }

  public V1ThanosRulerSpecVolumes scaleIO(V1ThanosRulerSpecScaleIO scaleIO) {

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
  public V1ThanosRulerSpecScaleIO getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(V1ThanosRulerSpecScaleIO scaleIO) {
    this.scaleIO = scaleIO;
  }

  public V1ThanosRulerSpecVolumes secret(V1ThanosRulerSpecSecret secret) {

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
  public V1ThanosRulerSpecSecret getSecret() {
    return secret;
  }

  public void setSecret(V1ThanosRulerSpecSecret secret) {
    this.secret = secret;
  }

  public V1ThanosRulerSpecVolumes storageos(V1ThanosRulerSpecStorageos storageos) {

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
  public V1ThanosRulerSpecStorageos getStorageos() {
    return storageos;
  }

  public void setStorageos(V1ThanosRulerSpecStorageos storageos) {
    this.storageos = storageos;
  }

  public V1ThanosRulerSpecVolumes vsphereVolume(V1ThanosRulerSpecVsphereVolume vsphereVolume) {

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
  public V1ThanosRulerSpecVsphereVolume getVsphereVolume() {
    return vsphereVolume;
  }

  public void setVsphereVolume(V1ThanosRulerSpecVsphereVolume vsphereVolume) {
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
    V1ThanosRulerSpecVolumes v1ThanosRulerSpecVolumes = (V1ThanosRulerSpecVolumes) o;
    return Objects.equals(this.awsElasticBlockStore, v1ThanosRulerSpecVolumes.awsElasticBlockStore)
        && Objects.equals(this.azureDisk, v1ThanosRulerSpecVolumes.azureDisk)
        && Objects.equals(this.azureFile, v1ThanosRulerSpecVolumes.azureFile)
        && Objects.equals(this.cephfs, v1ThanosRulerSpecVolumes.cephfs)
        && Objects.equals(this.cinder, v1ThanosRulerSpecVolumes.cinder)
        && Objects.equals(this.configMap, v1ThanosRulerSpecVolumes.configMap)
        && Objects.equals(this.csi, v1ThanosRulerSpecVolumes.csi)
        && Objects.equals(this.downwardAPI, v1ThanosRulerSpecVolumes.downwardAPI)
        && Objects.equals(this.emptyDir, v1ThanosRulerSpecVolumes.emptyDir)
        && Objects.equals(this.fc, v1ThanosRulerSpecVolumes.fc)
        && Objects.equals(this.flexVolume, v1ThanosRulerSpecVolumes.flexVolume)
        && Objects.equals(this.flocker, v1ThanosRulerSpecVolumes.flocker)
        && Objects.equals(this.gcePersistentDisk, v1ThanosRulerSpecVolumes.gcePersistentDisk)
        && Objects.equals(this.gitRepo, v1ThanosRulerSpecVolumes.gitRepo)
        && Objects.equals(this.glusterfs, v1ThanosRulerSpecVolumes.glusterfs)
        && Objects.equals(this.hostPath, v1ThanosRulerSpecVolumes.hostPath)
        && Objects.equals(this.iscsi, v1ThanosRulerSpecVolumes.iscsi)
        && Objects.equals(this.name, v1ThanosRulerSpecVolumes.name)
        && Objects.equals(this.nfs, v1ThanosRulerSpecVolumes.nfs)
        && Objects.equals(
            this.persistentVolumeClaim, v1ThanosRulerSpecVolumes.persistentVolumeClaim)
        && Objects.equals(this.photonPersistentDisk, v1ThanosRulerSpecVolumes.photonPersistentDisk)
        && Objects.equals(this.portworxVolume, v1ThanosRulerSpecVolumes.portworxVolume)
        && Objects.equals(this.projected, v1ThanosRulerSpecVolumes.projected)
        && Objects.equals(this.quobyte, v1ThanosRulerSpecVolumes.quobyte)
        && Objects.equals(this.rbd, v1ThanosRulerSpecVolumes.rbd)
        && Objects.equals(this.scaleIO, v1ThanosRulerSpecVolumes.scaleIO)
        && Objects.equals(this.secret, v1ThanosRulerSpecVolumes.secret)
        && Objects.equals(this.storageos, v1ThanosRulerSpecVolumes.storageos)
        && Objects.equals(this.vsphereVolume, v1ThanosRulerSpecVolumes.vsphereVolume);
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
    sb.append("class V1ThanosRulerSpecVolumes {\n");
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
